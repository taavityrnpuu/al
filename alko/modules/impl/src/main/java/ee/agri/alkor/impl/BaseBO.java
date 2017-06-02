package ee.agri.alkor.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import ee.agri.alkor.model.IEntity;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.service.ConstraintViolationException;
import ee.agri.alkor.service.IBaseService;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.RangeFilter;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.SystemException;

/**
 * 
 * @author ivar
 * 
 */
public abstract class BaseBO extends HibernateDaoSupport implements IBaseService {

	private static Logger LOGGER = Logger.getLogger(BaseBO.class);

	@Transactional(rollbackFor = org.hibernate.exception.ConstraintViolationException.class)
	public IEntity saveOrUpdate(IEntity obj) throws ConstraintViolationException {

		// getHibernateTemplate().setEntityInterceptor(new AuditInterceptor());
		Long id = null;

		try {
			if (obj.getId() == null)
				id = (Long) getHibernateTemplate().save(obj);
			else {
				getHibernateTemplate().saveOrUpdate(obj);
			}
		} catch (DataIntegrityViolationException cve) {
			throw new ConstraintViolationException(obj.toString());
		} catch (Throwable e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return obj;
	}

	@Transactional
	public void delete(final Class clazz, final Long id) {
		try {
			getHibernateTemplate().execute(new HibernateCallback() {
				public Object doInHibernate(Session session) {
					Object obj = session.load(clazz, id);
					session.delete(obj);
					return null;
				}
			});
		} catch (DataIntegrityViolationException e) {
			logger.error(e, e);
			throw new SystemException(e);
		}
	}

	public SearchFilter search(final SearchFilter filter) {
		try {
			return (SearchFilter) getHibernateTemplate().execute(new HibernateCallback() {
				public Object doInHibernate(Session session) {
					return search(session, filter);
				}
			});
		} catch (Exception e) {
			logger.error(e, e);
			throw new SystemException(e);
		}
	}

	public SearchFilter searchApplications(final SearchFilter filter) {
		try {
			return (SearchFilter) getHibernateTemplate().execute(new HibernateCallback() {
				public Object doInHibernate(Session session) {
					SpecialSearch sb = new SpecialSearch(filter.getObjectClass(), filter.getQueryParams(),
							filter.getSortMap(), filter.getSortMapOrder());
					filter.setResultsList(sb.getResults(session, filter.getStartIndex(), filter.getPageSize()));
					filter.setTotal(sb.getTotal());
					return filter;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e, e);
			throw new SystemException(e);
		}
	}

	/**
	 * Splits netsetd search property name. Assumes tha if property name part
	 * ends with 'es'(plural), then there is a collection behind. Only one
	 * collection is allowed per property.
	 * 
	 * 
	 * @param paramName
	 * @return
	 */
	private static String[] checkAndSplitJoinParamName(String paramName) {
		int idx = paramName.indexOf("es.");
		String first = null;
		if (idx > 0)
			first = paramName.substring(0, idx + 2);
		else
			return null;

		String[] keys = new String[2];

		keys[0] = first;
		keys[1] = paramName.substring(idx + 3);
		return keys;
	}

	public static SearchFilter superSearch(Session session, SearchFilter filter) {
		return filter;
	}

	public static SearchFilter search(Session session, SearchFilter filter) {

		int timerSessionId = (int) (Math.random() * 100) + 1;
		long startTime = System.currentTimeMillis();
		LOGGER.debug("TIMER start [" + timerSessionId + "]: " + filter.getObjectClass());
		StringBuffer from = new StringBuffer("from ").append(filter.getObjectClass()).append(" s ");
		StringBuffer joinedFrom = new StringBuffer("from ").append(filter.getObjectClass()).append(" s ");
		Map<String, Object> queryParams = filter.getQueryParams();
		boolean hasWhere = false;

		StringBuffer where = new StringBuffer();
		StringBuffer namedParameters = new StringBuffer();

		int alias = 0;

		/**
		 * left outer join is used to include null relations between entities to
		 * result
		 */
		int l = 0;
		int index = 0;
		if (filter.getSortMap() != null && filter.getSortMap().size() > 0) {
			Map sortMap = filter.getSortMap();

			for (Object key : sortMap.keySet()) {
				String keyString = (String) key;
				if (((index = ((String) key).lastIndexOf('.')) != -1)
						&& (keyString.equals("address") || keyString.equals("decision"))) { // embedded
																							// objects
																							// which
																							// cause
																							// exception
																							// in
																							// join
					if (l == 0)
						joinedFrom.append(" ");
					joinedFrom.append("left join fetch ");
					joinedFrom.append("s." + ((String) key).substring(0, index) + " ");
					l++;
				}
			}
		}

		// hack to to include null relations between entities to result in
		// SearchView default search
		// FIX IT!
		// NO!
		if (filter.getObjectClass().equals("SearchView") && filter.getOrderBy() != null && filter.getOrderBy()
				.equals("applicationDecisionDate desc, s.productType.name asc, s.applicationNr desc")) {

			if (l == 0)
				joinedFrom.append(" ");
			joinedFrom.append("left join fetch ");
			joinedFrom.append("s.productType ");
			l++;

		}

		/**
		 * if searching extended or not extended products add registry
		 * application to query and search by it
		 */
		String decisionCode = "registryEntryApplication.decision.regEntryDecision.code";
		if (filter.getObjectClass().equals("Product") && (queryParams.containsKey(decisionCode)
				|| queryParams.containsKey("decision.regEntryDecision.code"))) {
			String paramStringValue = (String) queryParams.get(decisionCode);
			if (IClassificatorService.REGENTRY_DECISION_EXTENDED.equals(paramStringValue)
					|| IClassificatorService.REGENTRY_DECISION_NOT_EXTENDED.equals(paramStringValue)) {
				from.append(", RegistryApplication t ");
				joinedFrom.append(", RegistryApplication t ");
				queryParams.remove(decisionCode);
				queryParams.put("decision.regEntryDecision.code", paramStringValue);
				queryParams.put("productApplicationJoin", "t.product.id");
				Object paramValue = null;
				if (queryParams.containsKey("registryEntryApplication.nr")) {
					paramValue = queryParams.get("registryEntryApplication.nr");
					queryParams.remove("registryEntryApplication.nr");
					queryParams.put("nr", paramValue);
				}
				if (queryParams.containsKey("registryEntryApplication.applicant.name")) {
					paramValue = queryParams.get("registryEntryApplication.applicant.name");
					queryParams.remove("registryEntryApplication.applicant.name");
					queryParams.put("applicant.name", paramValue);
				}
				if (queryParams.containsKey("registryEntryApplication.decision.date")) {
					paramValue = queryParams.get("registryEntryApplication.decision.date");
					queryParams.remove("registryEntryApplication.decision.date");
					queryParams.put("decision.date", paramValue);
				}
			}
		} // else if (filter.getObjectClass().equals("ReportView")) {
		// String reg_id = (String) queryParams.get("regId");
		// joinedFrom
		// .append("LEFT JOIN ( SELECT report.id, count(*) AS total FROM
		// ProductMovementReportRecord " +
		// "WHERE report.id in " +
		// "(SELECT id FROM ProductMovementReport WHERE enterprise.id = (select
		// id from Enterprise where registrationId = '"+reg_id+"' LIMIT 1)) " +
		// "GROUP BY ProductMovementReportRecord.report.id) rec ON s.id =
		// rec.id");
		// queryParams.remove("ent_reg_nr");
		// }
		
		/*
		if(filter.getObjectClass().equals("RegistryApplication")){
			if (!hasWhere) {
				where.append(" where ");
				hasWhere = true;
			} else {
				where.append(" and ");
			}
			where.append(" date_part('year', arrived) > 2009 ");
			hasWhere = true;
		}*/

		/*
		 * else if(filter.getObjectClass().equals("ReportListView") &&
		 * queryParams.containsKey("ent_reg_nr")){ String reg_id = (String)
		 * queryParams.get("ent_reg_nr"); joinedFrom.append(
		 * " JOIN product_move_report mr ON report_id = mr.id JOIN enterprise e ON e.reg_id = '"
		 * +reg_id+"' AND e.id = mr.report_ent_id ");
		 * queryParams.remove("ent_reg_nr"); }
		 */

		for (String paramName : queryParams.keySet()) { // for loop for 'where'

			Object paramValue = queryParams.get(paramName);

			// If the parameter is a certain type then the value is converted to
			// numeric
			paramValue = makeSpecialValue(paramName, paramValue, filter.getObjectClass());
			//

			if (paramValue != null) {
				if (paramValue instanceof RangeFilter) {
					RangeFilter rf = (RangeFilter) paramValue;
					if (rf.getMin() == null && rf.getMax() == null) {
						continue;
					}
				}
				if (paramValue instanceof List) {
					if (!((List) paramValue).isEmpty()) {
						if (namedParameters.length() != 0) {
							namedParameters.append("and ");
						}
						if (!filter.getObjectClass().equals("RegistryPaymentView")) {
							namedParameters.append("s.").append(paramName).append(".code").append(" in ")
									.append("(:" + paramName + "s) ");
						} else {
							namedParameters.append("s.").append(paramName).append(" in ")
									.append("(:" + paramName + "s) ");
						}
					}
					continue;
				}
				if (!hasWhere) {
					where.append(" where ");
					hasWhere = true;
				} else
					where.append(" and ");
				String[] keys = null;
				keys = checkAndSplitJoinParamName(paramName);
				if (paramValue instanceof RangeFilter) {
					RangeFilter rf = (RangeFilter) paramValue;
					boolean hasMin = false;
					if (rf.getMin() != null) {
						hasMin = true;
						if ("decision.date".equals(paramName)
								&& isExtendedNotExtendedProductSearch(filter.getObjectClass(), queryParams))
							where.append("t." + paramName + " >= ? ");
						else
							where.append("s." + paramName + " >= ? ");
					}
					if (rf.getMax() != null) {
						if (hasMin) {
							where.append("and ");
						}
						if ("decision.date".equals(paramName)
								&& isExtendedNotExtendedProductSearch(filter.getObjectClass(), queryParams))
							where.append("t." + paramName + " <= ? ");
						else
							where.append("s." + paramName + " <= ? ");
					}
					continue;
				}

				if (paramName.equals("startTime") && filter.getObjectClass().equals("RegistryApplication")) {
					where.append("s.arrived >= ? ");
					continue;
				} else if (paramName.equals("endTime") && filter.getObjectClass().equals("RegistryApplication")) {
					where.append("s.arrived <= ? ");
					continue;
				} else if (paramName.equals("registryEntry.validFrom") && filter.getObjectClass().equals("Product")) {
					where.append("s.registryEntry.validFrom >= ? ");
					continue;
				} else if (paramName.equals("registryEntry.validUntil") && filter.getObjectClass().equals("Product")
						&& !isSpecialParam(paramValue)) {
					where.append("s.registryEntry.validUntil <= ? ");
					continue;
				} else if (paramName.equals("start_date") && filter.getObjectClass().equals("AuthenticationLog")) {
					where.append("s.time >= ?");
					continue;
				} else if (paramName.equals("end_date") && filter.getObjectClass().equals("AuthenticationLog")) {
					where.append("s.time <= ?");
					continue;
				} else if (paramName.equals("start_date")
						&& filter.getObjectClass().equals("ProductMovementReportRecord")) {
					where.append("s.created >= ?");
					continue;
				} else if (paramName.equals("end_date")
						&& filter.getObjectClass().equals("ProductMovementReportRecord")) {
					where.append("s.created <= ?");
					continue;
				} else if (paramName.equals("start_date") && filter.getObjectClass().equals("ProductMoveReportView")) {
					where.append("s.created >= ?");
					continue;
				} else if (paramName.equals("end_date") && filter.getObjectClass().equals("ProductMoveReportView")) {
					where.append("s.created <= ?");
					continue;
				} else if (paramName.equals("start_date") && filter.getObjectClass().equals("ProductMovementReport")) {
					where.append("s.created >= ?");
					continue;
				} else if (paramName.equals("end_date") && filter.getObjectClass().equals("ProductMovementReport")) {
					where.append("s.created <= ?");
					continue;
				} else if (paramName.equals("reportPeriodMonthStart")
						&& filter.getObjectClass().equals("ProductMovementReport")) {
					where.append("extract(month from s.repDate) >= ?");
					continue;
				} else if (paramName.equals("reportPeriodMonthEnd")
						&& filter.getObjectClass().equals("ProductMovementReport")) {
					where.append("extract(month from s.repDate) <= ?");
					continue;
				} else if (paramName.equals("reportPeriodMonthStart")
						&& filter.getObjectClass().equals("ProductMoveReportView")) {
					where.append("extract(month from s.repDate) >= ?");
					continue;
				} else if (paramName.equals("reportPeriodMonthEnd")
						&& filter.getObjectClass().equals("ProductMoveReportView")) {
					where.append("extract(month from s.repDate) <= ?");
					continue;
				} else if (paramName.equals("repYear") && (filter.getObjectClass().equals("ReportListView")
						|| filter.getObjectClass().equals("ReportView"))) {
					where.append("extract(year from s.reportDate) = ?");
					continue;
				} else if (paramName.equals("repMonth") && (filter.getObjectClass().equals("ReportListView")
						|| filter.getObjectClass().equals("ReportView"))) {
					where.append("extract(month from s.reportDate) = ?");
					continue;
				} /*
					 * else if (paramName.equals("reporting_ent_reg_id") &&
					 * (filter.getObjectClass().equals("ReportListView")) ) {
					 * where.append(" s.reportingEntRegId = ?");
					 * queryParams.remove("reporting_ent_reg_id"); continue; }
					 */else if (paramName.equals("reportPeriodStart")
						&& filter.getObjectClass().equals("ProductMovementReport")) {
					where.append("s.repDate >= ?");
					continue;
				} else if (paramName.equals("reportPeriodEnd")
						&& filter.getObjectClass().equals("ProductMovementReport")) {
					where.append("s.repDate <= ?");
					continue;
				} else if (paramName.equals("reportPeriodStart")
						&& filter.getObjectClass().equals("ProductMoveReportView")) {
					where.append("s.repDate >= ?");
					continue;
				} else if (paramName.equals("reportPeriodEnd")
						&& filter.getObjectClass().equals("ProductMoveReportView")) {
					where.append("s.repDate <= ?");
					continue;
				} else if (paramName.equals("start_date") && filter.getObjectClass().equals("ReportListView")) {
					where.append("s.created >= ?");
					continue;
				} else if (paramName.equals("end_date") && filter.getObjectClass().equals("ReportListView")) {
					where.append("s.created <= ?");
					continue;
				} else if (paramName.equals("start_date") && filter.getObjectClass().equals("ReportView")) {
					where.append("s.created >= ?");
					continue;
				} else if (paramName.equals("end_date") && filter.getObjectClass().equals("ReportView")) {
					where.append("s.created <= ?");
					continue;
				} else if (paramName.equals("validUntil") && (filter.getObjectClass().equals("RegistryEntry")
						|| filter.getObjectClass().equals("RegistryEntryView"))) {
					where.append("s.validUntil" + paramValue);
					continue;
				} else if (paramName.equals("registryEntryApplication.registryEntry.validUntil")
						&& (filter.getObjectClass().equals("Product"))) {
					where.append("s.registryEntryApplication.registryEntry.validUntil" + paramValue);
					continue;
					// paramValue is set in makeSpecialValue(...)
				} else if (paramName.equals("productExamplesCount")) {
					where.append("s.productExamplesCount " + paramValue);
					continue;
					// join product and reg application by product id
				} else if (paramName.equals("productApplicationJoin")) {
					where.append("s.id = t.product.id");
					continue;
					// if searched by specific decision codes from product,
					// search from reg_application instead (s to t)
				} else if (paramName.equals("decision.regEntryDecision.code")
						&& isExtendedNotExtendedProductSearch(filter.getObjectClass(), queryParams)) {
					where.append("lower(t.decision.regEntryDecision.code) like ?");
					continue;
				} else if (paramName.equals("applicant.name")
						&& isExtendedNotExtendedProductSearch(filter.getObjectClass(), queryParams)) {
					where.append("lower(t.applicant.name) like ?");
					continue;
				} else if (paramName.equals("nr")
						&& isExtendedNotExtendedProductSearch(filter.getObjectClass(), queryParams)) {
					where.append("nr like ?");
					continue;
				} else if (paramName.equals("product.ethanolRateFrom")) { // RK
																			// lisatud
					where.append("s.product.ethanolRate >= ?");
					continue;
				} else if (paramName.equals("product.ethanolRateTo")) { // RK
																		// lisatud
					where.append("s.product.ethanolRate <= ?");
					continue;
				} else if (paramName.equals("registryEntryApplication.needsRenewening")) { // RK
																							// lisatud
					where.append("s.registryEntry.validUntil BETWEEN ? AND ?");
					continue;
				} else if (paramName.equals("IsXTeeForm")) { // RK lisatud
					where.append("s.fromXTee is not null");
					continue;
				}

				if (paramValue instanceof List) {
					if (namedParameters.length() != 0) {
						namedParameters.append("and ");
					}
					if (!filter.getObjectClass().equals("RegistryPaymentView")) {
						namedParameters.append("s.").append(paramName).append(".code").append(" in ")
								.append("(:" + paramName + "s) ");
					} else {
						namedParameters.append("s.").append(paramName).append(" in ").append("(:" + paramName + "s) ");
					}
					continue;
				}

				if (paramValue instanceof String && isSpecialParam(paramValue)) {
					where.append("s.").append(paramName);
				} else {

					if ("state.code".equals(paramName)) { // RK lisatud
						if ("ADDCTLNMOPRO".equals(paramValue)) {
							where.append("lower(s.state.code) IN ('add', 'ctl', 'nmo', 'pro') ");
							continue;
						} else if ("RGE2".equals(paramValue)) {
							where.append(
									"lower(s.state.code) IN ('rge', 'rext') and s.registryEntry.validUntil >= current_date ");
							continue;
						} else if ("VOID2".equals(paramValue)) {
							where.append("s.registryEntry.validUntil <= current_date ");
							continue;
						}
					}

					if (paramValue instanceof String && !paramName.equals("amount")) {
						where.append("lower(");
					}

					if (keys == null) {
						if ((paramName.lastIndexOf(SearchFilter.NOT_LIKE)) != -1) {
							where.append(paramName.substring(paramName.indexOf("/") + 1, paramName.length()));
						} else {
							where.append("s.").append(paramName);
						}
					} else {
						String aliasName = "a" + Integer.toString(alias++);

						from.append(" join s.").append(keys[0]).append(" ").append(aliasName);
						joinedFrom.append(" join s.").append(keys[0]).append(" ").append(aliasName);
						where.append(aliasName + "." + keys[1]);
					}
				}

				if (paramValue instanceof List) {
					where.append(".code");
				}

				if (paramValue instanceof String && !isSpecialParam(paramValue) && !paramName.equals("amount")) {
					where.append(")");
				}

				if (isSpecialParam(paramValue)) {
					where.append(paramValue);
				} else if (paramValue instanceof String && !paramName.equals("amount")) {
					if (paramName.indexOf(SearchFilter.NOT_LIKE) != -1)
						where.append(" not like ");
					else
						where.append(" like ");
				} else if (paramValue instanceof List) {
					where.append(" in ");
				} else {
					where.append(" = ");
				}

				if (paramValue instanceof List) {
					where.append("(:" + paramName + "s)");
				} else if (!isSpecialParam(paramValue)) {
					where.append("? ");
				}
			}

		} // --for loop for 'where'

		if (where.length() > 0) {
			from.append(where.toString());
			joinedFrom.append(where.toString());
			if (namedParameters.length() > 0) {
				from.append("and ");
				joinedFrom.append("and ");
			}
		} else {
			if (namedParameters.length() > 0) {
				from.append("where ");
				joinedFrom.append("where ");
			}
		}

		from.append(namedParameters.toString());
		joinedFrom.append(namedParameters.toString());

		LOGGER.debug("TIMER where [" + timerSessionId + "]: " + (System.currentTimeMillis() - startTime) + " ms");

		String countQuery = "select count(*) " + from.toString();
		// LOGGER.info("TIMER countquery [" + timerSessionId + "]: " +
		// countQuery);



		// create query

		Query q = createQuery(session, queryParams, filter, countQuery);

		Long count = (Long) q.list().get(0);
		filter.setTotal(count.intValue());

		from = joinedFrom; // use version using fetch join in order to add null
							// relations in order by clause
		if (filter.getSortMap() != null && filter.getSortMap().size() > 0) {
			Map sortMap = filter.getSortMap();

			from.append(" order by");
			int k = 0;
			for (Object key : sortMap.keySet()) {
				if (k > 0) {
					from.append(",");
				}
				from.append(" s.").append(key);

				if (sortMap.get(key).equals(SearchFilter.ASCENDING)) {
					from.append(" asc");
				} else if (sortMap.get(key).equals(SearchFilter.DESCENDING)) {
					from.append(" desc");
				} else {
					// System.out.println("BaseBO search(Session session,
					// SearchFilter filter), "
					// +
					// "filter.getSortMap exceptional case!!");
				}
				k++;
			}

		} else if ((filter.getOrderBy()) != null && filter.getOrderBy().length() != 0) {
			from.append(" order by s.").append(filter.getOrderBy());
		} else {
		}

		// LOGGER.debug("TIMER query [" + timerSessionId + "]: "+from);

		Query q2 = createQuery(session, queryParams, filter, from.toString());

		System.out.println(q2.getQueryString());

		q2.setFirstResult(filter.getStartIndex());
		if (filter.getPageSize() > 0) {
			q2.setMaxResults(filter.getPageSize());
			q2.setFetchSize(filter.getPageSize());
		}
		q2.setCacheable(false);
		q2.setCacheMode(CacheMode.NORMAL);

		List queryList = q2.list();

		List resultList = new ArrayList();
		boolean isExtNotExtProductSearch = isExtendedNotExtendedProductSearch(filter.getObjectClass(), queryParams);
		if (isExtNotExtProductSearch || isEnterpriseSearchWithSpecifiedType(filter.getObjectClass(), queryParams)) {
			for (Iterator it = queryList.iterator(); it.hasNext();) {
				Object row = it.next();
				if (row instanceof Object[]) {
					Object[] rowObject = (Object[]) row;
					// in case of extended and not extended product search,
					// replace original application with
					// extension application
					/*
					 * if (isExtNotExtProductSearch && rowObject != null &&
					 * rowObject.length > 1 && rowObject[0] instanceof Product
					 * && rowObject[1] instanceof RegistryApplication) { //
					 * ((Product)rowObject[0]).setRegistryEntryApplication((
					 * RegistryApplication)rowObject[1]); }
					 */
					resultList.add(rowObject[0]);
				} else {
					resultList.add(row);
				}
			}
			filter.setResultsList(resultList);
			LOGGER.debug("TIMER stop2 [" + timerSessionId + "]: " + (System.currentTimeMillis() - startTime)
					+ " ms (results:" + resultList.size() + ")");
		} else {
			filter.setResultsList(queryList);
			LOGGER.debug("TIMER stop  [" + timerSessionId + "]: " + (System.currentTimeMillis() - startTime)
					+ " ms (results:" + queryList.size() + ")");
		}

		return filter;
	}

	/**
	 * et korduvat koodi ära hoida...
	 * 
	 * @author raido.kalbre
	 */
	private static Query createQuery(Session session, Map<String, Object> queryParams, SearchFilter filter,
			String queryString) {
		Query q2 = session.createQuery(queryString); //

		int j = 0;
		for (String paramName : queryParams.keySet()) { // for loop for q2
			Object paramValue = queryParams.get(paramName);

			// If the parameter is a certain type then the value is converted to
			// numeric
			paramValue = makeSpecialValue(paramName, paramValue, filter.getObjectClass());
			//

			if (isSpecialParam(paramValue) || "IsXTeeForm".equals(paramName)) {
				// ei tee midagi
			} else if (paramValue instanceof RangeFilter) {
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
						q2.setParameter(j++, cal.getTime());
					}

					if (max != null) {
						cal.clear();
						cal.set(Calendar.YEAR, Integer.parseInt(max.substring(6)));
						cal.set(Calendar.MONTH, Integer.parseInt(max.substring(3, 5)) - 1);
						cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(max.substring(0, 2)));
						cal.set(Calendar.HOUR_OF_DAY, 23);
						cal.set(Calendar.MINUTE, 59);
						q2.setParameter(j++, cal.getTime());
					}

				} else if (rf.getType().equals(RangeFilter.NUMERIC)) { // Amounts
																		// in
																		// registryPayment
					if (min != null && min != "")
						q2.setParameter(j++, new BigDecimal(min));
					if (max != null && max != "")
						q2.setParameter(j++, new BigDecimal(max));
				} else {
					q2.setParameter(j++, min);
					q2.setParameter(j++, max);
				}

			} else if ((paramName.equals(SearchFilter.END_DATE) || paramName.equals(SearchFilter.START_DATE)
					|| paramName.equals(SearchFilter.START_TIME) || paramName.equals(SearchFilter.END_TIME))
					&& !(paramValue instanceof Date)) {
				String text = paramValue.toString();
				Calendar cal = Calendar.getInstance();
				cal.clear();
				cal.set(Calendar.YEAR, Integer.parseInt(text.substring(6)));
				cal.set(Calendar.MONTH, Integer.parseInt(text.substring(3, 5)) - 1);
				cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(text.substring(0, 2)));
				if (paramName.equals(SearchFilter.END_DATE) || paramName.equals(SearchFilter.END_TIME)) {
					cal.set(Calendar.HOUR_OF_DAY, 23);
					cal.set(Calendar.MINUTE, 59);
				}
				q2.setParameter(j++, cal.getTime());
			} else if (paramName.equals("registryEntryApplication.needsRenewening")) { // RK
																						// lisatud

				if (paramValue != null) {
					// kuna Hibernate 3.2 ei toeta HQLis kuupäevade
					// aritmeetikat siis...
					Date today = new Date(); // praegune aeg
					Calendar cal = Calendar.getInstance();

					cal.setTime(today);
					cal.add(Calendar.DATE, 24);
					q2.setTimestamp(j++, new java.sql.Timestamp(cal.getTimeInMillis()));

					cal.setTime(today);
					cal.add(Calendar.DATE, 60);
					q2.setTimestamp(j++, new java.sql.Timestamp(cal.getTimeInMillis()));
				}

			} else if (paramValue instanceof String) {

				String stringValue = "";
				if ("state.code".equals(paramName) && ("ADDCTLNMOPRO".equals(paramValue) || "RGE2".equals(paramValue)
						|| "VOID2".equals(paramValue))) {
					continue;
				} else if (paramName.endsWith(".code")) { // cannot have % signs
					stringValue = (String) paramValue;
					// value is set in makeSpecialValue(...)
				} else if (paramName.equals("productExamplesCount")) {
					continue;
				} else if (paramName.equals("product.ethanolRateFrom") || paramName.equals("product.ethanolRateTo")) {
					q2.setParameter(j++, new BigDecimal((String) paramValue));
					continue;
				} else {
					stringValue = (String) paramValue;
					if (stringValue.indexOf("%") == -1) { // kui kasutaja pole
															// protsendimärke
															// kuskile pannud,
															// paneme ise
						stringValue = '%' + stringValue + '%';
					}
				}
				stringValue = stringValue.toLowerCase();
				q2.setString(j++, stringValue);
			} else if (paramValue instanceof List) {
				if (((List) paramValue).isEmpty()) {
					continue;
				}
				q2.setParameterList(paramName + "s", (List) paramValue);
				// q2.setParameter(j++, paramValue);
			} else if (paramValue instanceof StringBuilder) {
				q2.setParameter(j++, ((StringBuilder) paramValue).toString());
			} else {
				q2.setParameter(j++, paramValue);
			}
		} // --for loop for q2
		return q2;
	}

	/**
	 * Tagastab tõeväärtust: kas tegemist on eriparameetriga või mitte.
	 * Eriparameetrid on antud konstantidega SearchFilter klassis.
	 * 
	 * @param paramValue
	 *            - parameetri väärtus.
	 */
	private static boolean isSpecialParam(Object paramValue) {
		if (SearchFilter.IS_NOT_NULL.equals(paramValue)) {
			return true;
		} else if (SearchFilter.LESS_THAN_CURRENT_DATE.equals(paramValue)) {
			return true;
		} else if (SearchFilter.NOT_LESS_THAN_CURRENT_DATE.equals(paramValue)) {
			return true;
		} else if (SearchFilter.LESS_OR_EQUAL_THAN_CURRENT_DATE.equals(paramValue)) {
			return true;
		} else if (SearchFilter.BIGGER_THAN_CURRENT_DATE.equals(paramValue)) {
			return true;
			// used when extended or not extended products are searched through
			// ProductsForm
		} else if ("t.product.id".equals(paramValue)) { // RK lisatud
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param objectClass
	 *            class of current search
	 * @param queryParams
	 *            parameters included in search
	 * @return true if extended or not extended products are searched through
	 *         product's form, false otherwise
	 */
	private static boolean isExtendedNotExtendedProductSearch(String objectClass, Map<String, Object> queryParams) {
		if (queryParams == null) {
			return false;
		}
		String decisionCode = "decision.regEntryDecision.code";
		if ("Product".equals(objectClass) && queryParams.containsKey(decisionCode)) {
			String paramValue = (String) queryParams.get(decisionCode);
			if (IClassificatorService.REGENTRY_DECISION_EXTENDED.equals(paramValue)
					|| IClassificatorService.REGENTRY_DECISION_NOT_EXTENDED.equals(paramValue)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isEnterpriseSearchWithSpecifiedType(String objectClass, Map<String, Object> queryParams) {
		if (queryParams == null) {
			return false;
		}
		String code = "enterpriseRoles.enterpriseRoleClass.code";
		if ("Enterprise".equals(objectClass) && queryParams.containsKey(code)) {
			return true;
		}
		return false;
	}

	/**
	 * User to check if a search parameter is numeric
	 * 
	 * Checks balance and productEthanolRate for BigDecimal values
	 * 
	 * @param paramName
	 *            - name of the parameter
	 * @return - true if the parameter is numeric
	 */
	private static Object makeSpecialValue(String paramName, Object value, String className) {
		if (value instanceof String) {
			try {
				if ((paramName.equals("reportId") && "ReportListView".equals(className))
						|| (paramName.equals("reportEntId") && "ReportView".equals(className))) {
					value = Long.valueOf((String) value);
				} else if (paramName.equals("balance") || paramName.equals("productEthanolRate")
						|| paramName.equals("ethanolRate") || paramName.startsWith("product.ethanolRate")) { // RK
																												// lisatud
																												// viimane
					value = new BigDecimal((String) value);
				} else if (paramName.equals("repYear")) {
					value = new Integer(value.toString());
				} else if (paramName.equals("repMonth")) {
					value = new Integer(value.toString());
				} else if (paramName.equals("productHasStocking") || paramName.equals("active")) { // RK
																									// lisatud
																									// viimane
					value = new Boolean(value.toString());
				} else if (paramName.equals("registryEntryApplication.needsRenewening")
						&& "false".equals((String) value)) { // RK
																// lisatud
					value = null; // skippimiseks
				} else if (paramName.equals("productExamplesCount")) {
					if ("true".equals(value.toString()))
						value = " > 0";
					else if ("false".equals(value.toString()))
						value = " = 0";
					else
						value = " is null";
				}
			} catch (Exception e) {

			}
		}
		return value;
	}

}
