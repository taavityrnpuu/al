package ee.agri.alkor.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.service.RangeFilter;
import ee.agri.alkor.service.SearchFilter;

/*
 * 
 * @author MARTIN
 * VT BUG 3199
 * 
 */

public class SpecialSearch {

	private static Logger LOGGER = Logger.getLogger(SpecialSearch.class);
	private String from;
	private String join;
	protected String where;
	protected String order;
	protected String className;
	protected Map<String, Object> queryMap;
	protected Map<String, String> sortMap;
	protected Map<String, Integer> sortMapOrder;
	protected HashSet<String> aliasSet;
	private int total = 0;
	private int timerSessionId;
	private long startTime;

	/**
	 * Väliskasutaja vormil olevat otsingut teostav klass. Sisuliselt
	 * pisiversioon BaseBO-s olevast hiigelmeetodist 'search'.
	 * 
	 * @param className
	 *            otsitava klassi nimi
	 * @param queryMap
	 *            filtri kitsendustingimused
	 * @param sortMap
	 *            sorteerimistingimused
	 */
	public SpecialSearch(String className, Map<String, Object> queryMap, Map<String, String> sortMap) {
		init(className, queryMap, sortMap, new HashMap<String, Integer>());
	}

	public SpecialSearch(String className, Map<String, Object> queryMap, Map<String, String> sortMap,
			Map<String, Integer> sortMapOrder) {
		init(className, queryMap, sortMap, sortMapOrder);
	}

	private void init(String className, Map<String, Object> queryMap, Map<String, String> sortMap,
			Map<String, Integer> sortMapOrder) {
		timerSessionId = (int) (Math.random() * 100) + 1;
		startTime = System.currentTimeMillis();
		LOGGER.debug("E_TIMER start [" + timerSessionId + "]: " + className);
		this.className = className;
		this.queryMap = queryMap;
		this.sortMap = sortMap;
		this.sortMapOrder = sortMapOrder;
		this.aliasSet = new HashSet<String>();

		StringBuffer from = new StringBuffer();
		from.append("FROM ");
		from.append(className);
		from.append(" s ");
		this.from = from.toString();

		makeJoin();
		makeWhere();
		makeOrder();
	}

	/**
	 * JOIN lause koostamine.
	 */
	private void makeJoin() {
		StringBuffer join = new StringBuffer();
		for (Entry<String, String> e : sortMap.entrySet()) {
			if (e.getKey().startsWith("registryEntry.") && !aliasSet.contains("registryEntry")) {
				join.append("JOIN FETCH s.registryEntry AS registryEntry ");
				aliasSet.add("registryEntry");
			} else if (e.getKey().startsWith("product.")) {
				if (!aliasSet.contains("product")) {
					join.append("JOIN FETCH s.product AS product ");
					aliasSet.add("product");
				}

				if (e.getKey().startsWith("product.producer.")) {
					if (!aliasSet.contains("product.producer")) {
						join.append("JOIN FETCH product.producer AS producer ");
						aliasSet.add("producer");
					}

					if (e.getKey().equals("product.producer.address.country.name")) {
						join.append("JOIN FETCH producer.address.country AS country ");
						aliasSet.add("country");
					}
				}

				if (e.getKey().equals("product.originCountry.name")) {
					join.append("JOIN FETCH product.originCountry AS origin ");
					aliasSet.add("origin");
				}
			}

		}
		this.join = join.toString();
	}

	/**
	 * WHERE lause koostamine.
	 */
	private void makeWhere() {
		StringBuffer where = new StringBuffer();
		where.append("WHERE ");
		int i = 0;
		for (Entry<String, Object> e : queryMap.entrySet()) {
			if (makeSpecialValue(e.getKey(), e.getValue()) != null) {
				if (i > 0) {
					where.append("AND ");
				}
				addParam(where, e.getKey(), e.getValue());
				i++;
			}
		}

		if (i == 0) {
			where.append(" AND ");
		}

		this.where = where.toString();
	}

	/**
	 * ORDER BY lause koostamine.
	 */
	private void makeOrder() {
		if (sortMap.size() > 0) {
			StringBuffer order = new StringBuffer();
			order.append("ORDER BY ");
			int i = 0;
			
			// võtame kõik väärtused ja orderime vastavalt tahetule
			Map<Integer, String> orders = new HashMap<Integer, String>();
			Map<String, String> unOrdered = new HashMap<String, String>();
			unOrdered.putAll(sortMap);
			int mitmes = 0;
			
			while (unOrdered.size() > 0) {
				int smallest = Integer.MAX_VALUE;
				String key = null; String esimene = null;
				
				for (Entry<String, String> e : unOrdered.entrySet()) {
					
					if(sortMapOrder.get(e.getKey()) == null){ // kui ei pandud sorti, siis on max väärtus
						sortMapOrder.put(e.getKey(), Integer.MAX_VALUE);
					}

					if(sortMapOrder.get(e.getKey()) < smallest){
						key = e.getKey();
						smallest = sortMapOrder.get(e.getKey());
					}
					else if (sortMapOrder.get(e.getKey()) == smallest && esimene == null){ // paneme esimese key'ks, kui hiljem ei leidnud väiksemat ehk kõik on ilma sordita, siis jääb järjekord nagu eelmisel loogikal (ilma sordita)
						esimene = e.getKey();
					}
				}
				
				
				if(key == null){
					key = esimene;
				}
				
				orders.put(mitmes, key);
				unOrdered.remove(key);
				mitmes++;
			}
			
			for (int y = 0; y < orders.size(); y++) {
				boolean addArrow = true;
				
				String k = orders.get(y);

				if (i > 0) {
					order.append(", ");
				}

				if (!(k.startsWith("registryEntry.") && aliasSet.contains("registryEntry"))
						&& !(k.startsWith("product.") && aliasSet.contains("product"))
						&& !(k.startsWith("product.producer.") && aliasSet.contains("producer"))) {
					order.append("s.");
				}

				if (k.startsWith("product.producer.") && aliasSet.contains("producer")) {
					if (k.equals("product.producer.address.country.name") && aliasSet.contains("country")) {
						order.append(k.replace("product.producer.address.", "")); // kustutab
																							// jupi
																							// eest
																							// ära
					} else {
						order.append(k.replace("product.", "")); // kustutab
																			// jupi
																			// eest
																			// ära
					}
				} else if (k.startsWith("product.originCountry.name") && aliasSet.contains("origin")) {
					order.append(k.replace("product.originCountry", "origin")); // asendab
				} else if (k.equals("registryEntry.nr")) { // string-numbri järgi sort on workaround, kuna string ei sordi nagu number
					String arrow = "";
					
					if (SearchFilter.ASCENDING.equals(sortMap.get(k))) {
						arrow = " ASC";
					} else if (SearchFilter.DESCENDING.equals(sortMap.get(k))) {
						arrow = " DESC";
					}
					
					
					order.append("created"+arrow+", registryEntry.nr"+arrow);

					addArrow = false; // selle customiga ei lisa pärast sordi poolt
				} else {
					order.append(k);
				}

				if(addArrow){
					if (SearchFilter.ASCENDING.equals(sortMap.get(k))) {
						order.append(" ASC");
					} else if (SearchFilter.DESCENDING.equals(sortMap.get(k))) {
						order.append(" DESC");
					}
				}
				
				i++;
			}

			this.order = order.toString();
		} else {
			order = "";
		}
	}

	/**
	 * Koostab andmebaasipäringu kogutulemuste arvu pärimiseks.
	 * 
	 * @return query string
	 */
	private String createQueryStringForCount() {
		StringBuffer buf = new StringBuffer();
		buf.append("SELECT count(*) ");
		buf.append(from);
		buf.append(where);
		return buf.toString();
	}

	/**
	 * Koostab andmebaasipäringu tulemuste pärimiseks.
	 * 
	 * @return query string
	 */
	private String createQueryStringForResults() {
		StringBuffer buf = new StringBuffer();
		buf.append("SELECT s ");
		buf.append(from);
		buf.append(join);
		buf.append(where);
		buf.append(order);
		LOGGER.debug(buf.toString());
		System.out.println(buf.toString());
		return buf.toString();
	}

	/**
	 * Koostab andmebaasipäringud vastavalt objekti loomisel antud tingimustele
	 * ja jooksutab need. NB! Muuhulgas toimub siin ka kõikide tulemuste
	 * saamine, st seda tuleb jooksutada enne kui arvu küsimist.
	 * 
	 * @param session
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	public List getResults(Session session, int startIndex, int pageSize) {
		getMaxResults(session);
		Query q = session.createQuery(createQueryStringForResults());
		int i = 0;
		for (Entry<String, Object> e : queryMap.entrySet()) {
			i = setParam(q, i, e.getKey(), makeSpecialValue(e.getKey(), e.getValue()));
		}
		
		if(!"true".equals(queryMap.get("registryEntryApplication.needsRenewening"))){ // linnukese puhul teeme ise mapingu
			q.setFirstResult(startIndex);
			if (pageSize > 0) {
				q.setMaxResults(pageSize);
				q.setFetchSize(pageSize);
			}
		}
			
		return filter(q.list(), startIndex, pageSize);
	}

	/**
	 * Lisanduv tulemuste filtreerimine. Workaround "Vajab täpsustamist"
	 * linnukese märkimisel tagastatavate tulemuste täiendavaks kärpimiseks.
	 * 
	 * @param queryList
	 *            tulemuste list
	 * @return kärbitud list(kui oli põhjust seda teha)
	 */
	private List filter(List queryList, int startIndex, int pageSize) {
		LOGGER.debug("E_TIMER resul [" + timerSessionId + "]: " + (System.currentTimeMillis() - startTime) + " ms");
		List resultList = new ArrayList();
		if (!"true".equals(queryMap.get("registryEntryApplication.needsRenewening"))) {
			LOGGER.debug("E_TIMER stop  [" + timerSessionId + "]: " + (System.currentTimeMillis() - startTime)
					+ " ms (results:" + queryList.size() + ")");
			return queryList; // lahkutakse kui pole vaja filtreerida
		}
		int duplicates = 0; int index = 0;

		HashSet<Long> entryIdList = new HashSet<Long>();
		// HashMap<Long, Long> tempMap = new HashMap<Long, Long>();
		for (Iterator it = queryList.iterator(); it.hasNext();) {
			Object row = it.next();
			if (row != null && row instanceof RegistryApplication && ((RegistryApplication) row).getRegistryEntry() != null) {

				Long id = ((RegistryApplication) row).getRegistryEntry().getId();
				String code = ((RegistryApplication) row).getState().getCode();
				String type = ((RegistryApplication) row).getType().getCode();
				boolean isHidden = "ADD".equals(code) || "CTL".equals(code) || "NMO".equals(code) || "PRO".equals(code); // menetluses
																															// taotlused
																															// jätame
																															// ka
																															// välja
				// boolean isExtending = "ARP".equals(type);

				LOGGER.debug(" -> -> id:" + id + " duplicate:" + entryIdList.contains(id) + " isHidden:" + isHidden);
				if (entryIdList.contains(id)) {
					duplicates++;
					continue;
				} else {
					entryIdList.add(id);
					if (isHidden) {
						duplicates++;
						continue;
					}
				}

			}

			if(index >= startIndex && (pageSize == 0 || (pageSize > 0 && index < startIndex+pageSize))){
				resultList.add(row);
			}
			index++;
		}
		//total = total - duplicates; // kahel tasemel filtreerimine ei tööta koos pagineerimisega kuna see eemaldab ainult antud lahelt kirjed, numbrid tulevad valed
		//total = resultList.size();
		total = index;

		LOGGER.debug("E_TIMER stop2 [" + timerSessionId + "]: " + (System.currentTimeMillis() - startTime)
				+ " ms (results:" + resultList.size() + ")");
		return resultList;
	}

	/**
	 * Teeb päringu kogutulemuste arvu küsimiseks.
	 * 
	 * @param session
	 */
	private void getMaxResults(Session session) {
		Query q = session.createQuery(createQueryStringForCount());
		int i = 0;
		for (Entry<String, Object> e : queryMap.entrySet()) {
			i = setParam(q, i, e.getKey(), makeSpecialValue(e.getKey(), e.getValue()));
		}
		total = ((Long) q.list().get(0)).intValue();
		
		LOGGER.debug("E_TIMER count [" + timerSessionId + "]: " + (System.currentTimeMillis() - startTime)
				+ " ms TOTAL:" + total);
	}

	/**
	 * Lisab parameetri WHERE lausesse.
	 * 
	 * @param where
	 *            where lause koostamise puhver
	 * @param paramName
	 *            parameetri nimi
	 * @param paramValue
	 *            parameetri väärtus
	 */
	private void addParam(StringBuffer where, String paramName, Object paramValue) {

		// TULEMUSTETABELI VEERUD
		// "registryEntry.nr"
		// "registryEntry.validFrom"
		// "registryEntry.validUntil"
		// "product.name"
		// "product.type.name"
		// "product.packingVolume.name" --
		// "product.ethanolRate"
		// "product.producer.name"
		// "product.producer.address.country.name"
		// "product.originCountry.name" --
		// "state.name" --
		// "product.registryEntryApplication.type" --
		// "notes"

		if (paramValue instanceof RangeFilter) {
			RangeFilter rf = (RangeFilter) paramValue;
			boolean hasMin = false;
			if (rf.getMin() != null) {
				hasMin = true;
				where.append("s." + paramName + " >= ? ");
			}
			if (rf.getMax() != null) {
				if (hasMin) {
					where.append("AND ");
				}
				where.append("s." + paramName + " <= ? ");
			}
			return;
		} else if ("registryEntryApplication.needsRenewening".equals(paramName)) {
			if (aliasSet.contains("registryEntry")) {
				where.append("registryEntry.validUntil BETWEEN ? AND ? ");
			} else {
				where.append("s.registryEntry.validUntil BETWEEN ? AND ? ");
			}
			return;

		} else if (paramName.equals("IsXTeeForm")) {
			where.append("s.applicant.registrationId = ? ");
			return;

		} else if (paramName.startsWith("product.ethanolRate")) {
			String product = aliasSet.contains("product") ? "product" : "s.product";
			if ("product.ethanolRateFrom".equals(paramName)) {
				where.append(product);
				where.append(".ethanolRate >= ? ");
				return;
			} else if (paramName.equals("product.ethanolRateTo")) {
				where.append(product);
				where.append(".ethanolRate <= ? ");
				return;
			}
		}

		if (paramValue instanceof String) {
			if ("state.code".equals(paramName)) {
				if ("ADDCTLNMOPRO".equals(paramValue)) {
					where.append("s.state.code IN ('ADD', 'CTL', 'NMO', 'PRO') ");
					return;

				} else if ("RGE2".equals(paramValue)) {
					String registryEntry = aliasSet.contains("registryEntry") ? "registryEntry" : "s.registryEntry";
					where.append("s.state.code IN ('RGE', 'REXT') AND ");
					where.append(registryEntry);
					where.append(".validUntil >= current_date ");
					return;

				} else if ("VOID2".equals(paramValue)) {
					String registryEntry = aliasSet.contains("registryEntry") ? "registryEntry" : "s.registryEntry";
					where.append(registryEntry);
					where.append(".validUntil <= current_date ");
					return;
				}
			}

			if (!paramName.endsWith(".code")) { // kui pole kood, siis lower
												// ette ja sulud lahti
				where.append("lower(");
			}

			if (paramName.startsWith("registryEntry.") && !aliasSet.contains("registryEntry")
					|| paramName.startsWith("product.") && !aliasSet.contains("product")) {
				where.append("s.");
			}

			where.append(paramName);

			if (paramName.endsWith(".code")) { // kui oli kood, siis sulud kinni
												// ja LIKE, muidu lihtsalt LIKE
				where.append(" LIKE ? ");
			} else {
				where.append(") LIKE ? ");
			}
		}
	}

	/**
	 * Sisestab andmebaasipäringusse parameetrite väärtused <code>Query</code>
	 * objekti.
	 * 
	 * @param q
	 *            Query objekt
	 * @param i
	 *            järjekorraindeks
	 * @param paramName
	 *            paramteetri nimi
	 * @param paramValue
	 *            parameetri väärtus
	 * @return uus indeksi väärtus
	 */
	private static int setParam(Query q, int i, String paramName, Object paramValue) {

		if (paramValue == null) {
			return i;
		}

		if (paramValue instanceof RangeFilter) {
			RangeFilter rf = (RangeFilter) paramValue;
			String min = rf.getMin();
			String max = rf.getMax();
			if (rf.getType().equals(RangeFilter.CALENDAR)) {
				Calendar cal = Calendar.getInstance();
				if (min != null) {
					cal.clear();
					cal.set(Calendar.YEAR, Integer.parseInt(min.substring(6)));
					cal.set(Calendar.MONTH, Integer.parseInt(min.substring(3, 5)) - 1);
					cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(min.substring(0, 2)));
					q.setParameter(i++, cal.getTime());
				}

				if (max != null) {
					cal.clear();
					cal.set(Calendar.YEAR, Integer.parseInt(max.substring(6)));
					cal.set(Calendar.MONTH, Integer.parseInt(max.substring(3, 5)) - 1);
					cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(max.substring(0, 2)));
					cal.set(Calendar.HOUR_OF_DAY, 23);
					cal.set(Calendar.MINUTE, 59);
					cal.set(Calendar.SECOND, 59);
					q.setParameter(i++, cal.getTime());
				}

			} else if (rf.getType().equals(RangeFilter.NUMERIC)) {
				if (min != null && min != "")
					q.setParameter(i++, new BigDecimal(min));
				if (max != null && max != "")
					q.setParameter(i++, new BigDecimal(max));
			} else {
				q.setParameter(i++, min);
				q.setParameter(i++, max);
			}
		} else if (paramName.equals("registryEntryApplication.needsRenewening")) {

			if (paramValue != null) {
				Date today = new Date(); // praegune aeg
				Calendar cal = Calendar.getInstance();

				// MARTIN123 miks 25 ???
				cal.setTime(today);
				cal.add(Calendar.DATE, 24);
				q.setTimestamp(i++, new java.sql.Timestamp(cal.getTimeInMillis()));

				cal.setTime(today);
				cal.add(Calendar.DATE, 60);
				q.setTimestamp(i++, new java.sql.Timestamp(cal.getTimeInMillis()));
			}

		} else if (paramValue instanceof String) {

			String stringValue = (String) paramValue;
			if ("state.code".equals(paramName)) { // nendega on juba korras
				return i;
			} else if (paramName.equals("product.ethanolRateFrom") || paramName.equals("product.ethanolRateTo")) {
				q.setParameter(i++, new BigDecimal(stringValue));
				return i;
			} else if (!(paramName.endsWith(".code") || paramName.equals("IsXTeeForm"))) { // Values
																							// that
																							// cannot
																							// have
																							// %
																							// signs
				if (stringValue.indexOf("%") == -1) { // kui kasutaja pole
														// protsendimärke
														// kuskile pannud,
														// paneme ise
					stringValue = '%' + stringValue + '%';
				}
				stringValue = stringValue.toLowerCase();
			}
			q.setString(i++, stringValue);
		}
		return i;
	}

	/**
	 * Eriväärtuste tekitamine, tüüpide teisendused. Põhiliselt muudab väärtust
	 * <code>null</code>-iks kui selle parameetriga midagi teha vaja pole.
	 * 
	 * @param paramName
	 *            parameetri nimi
	 * @param paramValue
	 *            parameetri väärtus
	 * @return parameetri muudetud väärtus
	 */
	protected static Object makeSpecialValue(String paramName, Object paramValue) {
		if (paramValue instanceof RangeFilter && ((RangeFilter) paramValue).getMin() == null
				&& ((RangeFilter) paramValue).getMax() == null) {
			paramValue = null;
		} else if (paramName.equals("registryEntryApplication.needsRenewening")
				&& "false".equals((String) paramValue)) {
			paramValue = null; // skippimiseks
		}
		return paramValue;
	}

	/**
	 * Tuleb kutsuda PEALE getResults kutsumist!
	 * 
	 * @return tulemuste koguarvu
	 */
	public int getTotal() {
		return total;
	}

}
