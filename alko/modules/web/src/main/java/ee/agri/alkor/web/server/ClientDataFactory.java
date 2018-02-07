package ee.agri.alkor.web.server;

import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import ee.agri.alkor.impl.ResultSet;
import java.sql.Statement;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.log4j.Logger;

import ee.agri.alkor.impl.PostgreUtils;
import ee.agri.alkor.model.Address;
import ee.agri.alkor.model.AuthenticationLog;
import ee.agri.alkor.model.ContactInfo;
import ee.agri.alkor.model.Decision;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.Faq;
import ee.agri.alkor.model.News;
import ee.agri.alkor.model.PaymentMatchingLog;
import ee.agri.alkor.model.Person;
import ee.agri.alkor.model.Product;
import ee.agri.alkor.model.ProductEnterpriseRole;
import ee.agri.alkor.model.ProductExamples;
import ee.agri.alkor.model.RegistryApplication;
import ee.agri.alkor.model.RegistryEntry;
import ee.agri.alkor.model.RegistryEntryView;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.RegistryPaymentView;
import ee.agri.alkor.model.ReportListView;
import ee.agri.alkor.model.ReportView;
import ee.agri.alkor.model.SearchView;
import ee.agri.alkor.model.SearchViewPrimitive;
import ee.agri.alkor.model.SystemUser;
import ee.agri.alkor.model.UserGroup;
import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.model.classes.EnterpriseRole;
import ee.agri.alkor.model.classes.SystemGroup;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.AddressMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.AuthLogMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.ContactInfoMap;
import ee.agri.alkor.web.client.dto.DecisionMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.FAQMap;
import ee.agri.alkor.web.client.dto.MtrAndCustomsQueryResultMap;
import ee.agri.alkor.web.client.dto.MtrLicenseMap;
import ee.agri.alkor.web.client.dto.NewsMap;
import ee.agri.alkor.web.client.dto.PaymentMatchingLogMap;
import ee.agri.alkor.web.client.dto.PersonMap;
import ee.agri.alkor.web.client.dto.ProductExamplesMap;
import ee.agri.alkor.web.client.dto.ProductMap;
import ee.agri.alkor.web.client.dto.RangeFilter;
import ee.agri.alkor.web.client.dto.RegistryDocumentMap;
import ee.agri.alkor.web.client.dto.RegistryEntryMap;
import ee.agri.alkor.web.client.dto.RegistryEntryViewMap;
import ee.agri.alkor.web.client.dto.RegistryPaymentMap;
import ee.agri.alkor.web.client.dto.ReportListViewMap;
import ee.agri.alkor.web.client.dto.ReportViewMap;
import ee.agri.alkor.web.client.dto.StateFeeMap;
import ee.agri.alkor.web.client.dto.SuperSearchMap;
import ee.agri.alkor.web.client.dto.UserManageMap;
import ee.agri.alkor.web.service.SystemException;
import ee.agri.alkor.xtee.MTRLicense;
import ee.agri.alkor.xtee.MtrAndCustomsQueryResult;

public class ClientDataFactory {

	private static Logger LOGGER = Logger.getLogger(ClientDataFactory.class);

	private static SimpleDateFormat defaultDateFormat = new SimpleDateFormat(
			"dd.MM.yyyy");

	private static SimpleDateFormat defaultDateTimeFormat = new SimpleDateFormat(
			"dd.MM.yyyy HH:mm:ss");

	private static BeanUtilsBean beanUtils = BeanUtilsBean.getInstance();

	public static SimpleDateFormat getDefaultDateFormat() {
		return defaultDateFormat;
	}

	/*
     * public static ee.agri.alkor.web.client.dto.IdVersionMap create(
     * ee.agri.alkor.model.IdVersion model) { return new
     * ee.agri.alkor.web.client.dto.IdVersionMap(model.getId(),
     * model.getVersion()); }
     */

	public static ee.agri.alkor.web.client.dto.IdNrMap create(
			ee.agri.alkor.model.IdNr model) {
		return new ee.agri.alkor.web.client.dto.IdNrMap(model.getId(), model
				.getNr());
	}

	public static UserManageMap create(SystemUser dtoUser) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		UserManageMap modelUser = new UserManageMap();
		return (UserManageMap) create(modelUser, dtoUser);
	}

	public static SystemUser create(UserManageMap modelUser) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		SystemUser dtoUser = new SystemUser();
		return (SystemUser) create(dtoUser, modelUser);
	}

	public static RegistryApplication create(ApplicationMap dtoApplication) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		RegistryApplication modelAppl = new RegistryApplication();
		return (RegistryApplication) create(modelAppl, dtoApplication);
	}

	public static ApplicationMap create(RegistryApplication modelApplication) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		ApplicationMap dtoAppl = new ApplicationMap();
		return (ApplicationMap) create(dtoAppl, modelApplication);
	}

	public static Product create(ProductMap dtoProduct) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		Product modelProduct = new Product();
		return (Product) create(modelProduct, dtoProduct);
	}

	public static ProductMap create(Product modelProduct) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		ProductMap dtoProduct = new ProductMap();
		return (ProductMap) create(dtoProduct, modelProduct);
	}

	public static Enterprise create(EnterpriseMap dtoSubject) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		Enterprise modelSubject = new Enterprise();
		return (Enterprise) create(modelSubject, dtoSubject);
	}

	public static EnterpriseMap create(Enterprise enterprise) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		EnterpriseMap dtoSubject = new EnterpriseMap();
		return (EnterpriseMap) create(dtoSubject, enterprise);
	}

	public static Person create(PersonMap dtoPerson) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		Person modelPerson = new Person();
		return (Person) create(modelPerson, dtoPerson);
	}

	public static PersonMap create(Person person) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		PersonMap dtoPerson = new PersonMap();
		return (PersonMap) create(dtoPerson, person);
	}

	public static Decision create(DecisionMap dtoDecision) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		Decision modelDecision = new Decision();
		return (Decision) create(modelDecision, dtoDecision);
	}

	public static DecisionMap create(Decision decision) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		DecisionMap dtoDecision = new DecisionMap();
		return (DecisionMap) create(dtoDecision, decision);
	}

	public static RegistryEntry create(RegistryEntryMap dtoEntry) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		RegistryEntry modelRegistryEntry = new RegistryEntry();
		return (RegistryEntry) create(modelRegistryEntry, dtoEntry);
	}

	public static RegistryEntryMap create(RegistryEntry entry) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		RegistryEntryMap dtoRegentryMap = new RegistryEntryMap();
		return (RegistryEntryMap) create(dtoRegentryMap, entry);
	}

	public static ReportViewMap create(ReportView entry) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
	   ReportViewMap dtoRegentryMap = new ReportViewMap();
		return (ReportViewMap) create(dtoRegentryMap, entry);
	}
	
	public static StateFeeMap create(RegistryPaymentView entry) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
	   StateFeeMap dtoRegentryMap = new StateFeeMap();
		return (StateFeeMap) create(dtoRegentryMap, entry);
	}
	
	public static RegistryPaymentView create(StateFeeMap dtoStateFee){
		RegistryPaymentView modelRegistryPaymentView = new RegistryPaymentView();
		return (RegistryPaymentView) create(modelRegistryPaymentView,dtoStateFee);
	}

	public static ReportListViewMap create(ReportListView entry) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		ReportListViewMap dtoRegentryMap = new ReportListViewMap();
		return (ReportListViewMap) create(dtoRegentryMap, entry);
	}
	
	public static HashMap create(HashMap map) {
		return map;
	}
	
	public static RegistryEntryViewMap create(RegistryEntryView entry) {
		RegistryEntryViewMap dtoRegentryMap = new RegistryEntryViewMap();
		return (RegistryEntryViewMap) create(dtoRegentryMap, entry);
	}


	public static RegistryPayment create(RegistryPaymentMap dtoPayment) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		RegistryPayment modelRegistryPayment = new RegistryPayment();
		return (RegistryPayment) create(modelRegistryPayment, dtoPayment);
	}
	
	
	
	

	public static RegistryPaymentMap create(RegistryPayment payment) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		RegistryPaymentMap dtoRegistryPaymentMap = new RegistryPaymentMap();
		return (RegistryPaymentMap) create(dtoRegistryPaymentMap, payment);
	}
	
	public static PaymentMatchingLog create(PaymentMatchingLogMap dtoPaymentLog) {
		PaymentMatchingLog modelPaymentMatchingLog = new PaymentMatchingLog();
		return (PaymentMatchingLog) create(modelPaymentMatchingLog, dtoPaymentLog);
	}
	
	

	public static PaymentMatchingLogMap create(PaymentMatchingLog paymentLog) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		PaymentMatchingLogMap dtoPaymentMatchingLogMap = new PaymentMatchingLogMap();
		return (PaymentMatchingLogMap) create(dtoPaymentMatchingLogMap, paymentLog);
	}

	public static News create(NewsMap dtoNews) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		News modelNews = new News();
		return (News) create(modelNews, dtoNews);
	}

	public static NewsMap create(News news) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		NewsMap dtoNewsMap = new NewsMap();
		return (NewsMap) create(dtoNewsMap, news);
	}

	public static Faq create(FAQMap dtoFaq) {
		// createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		Faq modelFaq = new Faq();
		return (Faq) create(modelFaq, dtoFaq);
	}

	public static FAQMap create(Faq faq) {
		// createdList = new HashMap<Serializable, ABaseDTOMap>();
		FAQMap dtoFAQMap = new FAQMap();
		return (FAQMap) create(dtoFAQMap, faq);
	}

	public static MtrAndCustomsQueryResultMap create(
			MtrAndCustomsQueryResult queryResult) {
		MtrAndCustomsQueryResultMap resultMap = new MtrAndCustomsQueryResultMap();
		return (MtrAndCustomsQueryResultMap) create(resultMap, queryResult);
	}

	public static SearchViewPrimitive create(SuperSearchMap dtoMap) {
		SearchViewPrimitive modelSearchView = new SearchViewPrimitive();
		return (SearchViewPrimitive) create(modelSearchView, dtoMap);
	}

	public static SuperSearchMap create(SearchViewPrimitive modelSearchView) {
		SuperSearchMap dtoMap = new SuperSearchMap();
		return (SuperSearchMap) create(dtoMap, modelSearchView);
	}

	// public static AuthLogMap create(AuthenticationLog log) {
	// AuthLogMap authLogMap = new AuthLogMap();
	// return (AuthLogMap) create(authLogMap, log);
	// }

	/*
     * public static ClassItemMap create(Classificator classItem) { ClassItemMap
     * classItemMap = new ClassItemMap(); return (ClassItemMap)
     * create(classItemMap, classItem); }
     */

	private static Serializable create(Serializable modelBean,
			ABaseDTOMap dtoBean,
			HashMap<ABaseDTOMap, Serializable> createdModelMap) {
		if (createdModelMap.containsKey(dtoBean)) {
			return createdModelMap.get(dtoBean);
		} else {
			createdModelMap.put(dtoBean, modelBean);
		}
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("create dtoBean -> baseBean, dto: " + dtoBean);

		try {
			PropertyDescriptor[] propDescs = beanUtils.getPropertyUtils()
					.getPropertyDescriptors(modelBean);
			for (int i = 0; i < propDescs.length; i++) {
				PropertyDescriptor propDesc = propDescs[i];
				String propName = propDesc.getName();
				if ("class".equals(propName))
					continue;

				Object value = dtoBean.get(propName);

				if (value != null) {
					if ((value instanceof String)
							&& (((String) value).trim().length() == 0))
						continue;
					Class propClass = propDesc.getPropertyType();

					if (propClass.equals(java.lang.Float.class)
							&& value instanceof String) {
						value = ((String) value).replace(',', '.');
					}if (propClass.equals(BigDecimal.class)
							&& value instanceof String) {
						value = ((String) value).replace(',', '.');
					}

					if (propClass.getName().startsWith("ee")) {
						Object propObj = propClass.newInstance();
						if (propObj instanceof Classificator) {
							String classCode = null;
							if (value instanceof Map)
								classCode = ((ABaseDTOMap) value)
										.getText(ClassItemMap.CODE);

							if (classCode != null) {
								((Classificator) propObj)
										.setCode((String) classCode);

								beanUtils.setProperty(modelBean, propName,
										propObj);
							}
						} else {
							beanUtils.setProperty(modelBean, propName, create(
									(Serializable) propObj,
									(ABaseDTOMap) value, createdModelMap));
						}
					} else if (propClass.equals(java.util.Date.class)) {
						Date dateValue = getDefaultDateFormat().parse(
								(String) value, new ParsePosition(0));
						beanUtils.setProperty(modelBean, propName, dateValue);
					} else if (Collection.class.isAssignableFrom(propClass)) {
						if ((modelBean instanceof Enterprise)
								&& propName
										.equals(EnterpriseMap.ENTERPRISE_ROLES)) {
							Enterprise modelEnterprise = (Enterprise) modelBean;
							List dtoRoles = (List) value;
							Set enterpriseRoles = new HashSet();
							for (Iterator it = dtoRoles.iterator(); it
									.hasNext();) {
								ProductEnterpriseRole productEnterpriseRole = new ProductEnterpriseRole();
								productEnterpriseRole
										.setEnterprise(modelEnterprise);
								EnterpriseRole role = new EnterpriseRole();
								Object roleObj = it.next();
								String roleCode = null;
								if (roleObj instanceof String)
									roleCode = (String) roleObj;
								else if (roleObj instanceof ClassItemMap) {
									roleCode = ((ClassItemMap) roleObj)
											.getText(ClassItemMap.CODE);
								} else
									throw new SystemException(
											"Unexpected role class");
								role.setCode(roleCode);
								productEnterpriseRole
										.setEnterpriseRoleClass(role);
								enterpriseRoles.add(productEnterpriseRole);
							}
							modelEnterprise.setEnterpriseRoles(enterpriseRoles);
						} else if ((modelBean instanceof SystemUser)
								&& propName.equals(UserManageMap.USER_ROLES)) {
							SystemUser user = (SystemUser) modelBean;
							List dtoRoles = (List) value;
							Set userRoles = new HashSet();
							for (Iterator it = dtoRoles.iterator(); it
									.hasNext();) {

								UserGroup userGroup = new UserGroup();
								userGroup.setUser(user);
								SystemGroup group = new SystemGroup();
								Object roleObj = it.next();
								String roleCode = null;
								if (roleObj instanceof String)
									roleCode = (String) roleObj;
								else if (roleObj instanceof ClassItemMap) {
									roleCode = ((ClassItemMap) roleObj)
											.getText(ClassItemMap.CODE);
								} else
									throw new SystemException(
											"Unexpected group class");
								group.setCode(roleCode);
								userGroup.setGroupClass(group);
								userRoles.add(userGroup);
							}
							user.setGroups(userRoles);
						}
					} else {
						beanUtils.setProperty(modelBean, propName, value);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		return modelBean;
	}

	public static Serializable create(Serializable modelBean,
			ABaseDTOMap dtoBean) {
		HashMap<ABaseDTOMap, Serializable> createdModelMap = new HashMap<ABaseDTOMap, Serializable>();
		return create(modelBean, dtoBean, createdModelMap);
	}

	private static ABaseDTOMap create(ABaseDTOMap dtoBean,
			Serializable modelBean,
			HashMap<Serializable, ABaseDTOMap> createdList) {
		if (createdList.containsKey(modelBean)) {
			return createdList.get(modelBean);
		} else {
			createdList.put(modelBean, dtoBean);
		}

		try {
			Map properties = beanUtils.describe(modelBean);
			for (Iterator it = properties.keySet().iterator(); it.hasNext();) {
				String propName = (String) it.next();
				if ("class".equals(propName))
					continue;
				Object value = PropertyUtils.getProperty(modelBean, propName);
				if (value != null) {
					Class valueClass = value.getClass();
					if (Collection.class.isAssignableFrom(valueClass)) {
						Collection coll = (Collection) value;
						List dtoList = new ArrayList();
						ABaseDTOMap dtoObj = null;
						for (Iterator cit = coll.iterator(); cit.hasNext();) {
							Object collObj = cit.next();
							if (collObj instanceof Classificator) {
								dtoObj = new ClassItemMap();
								dtoList.add(create(dtoObj,
										(Classificator) collObj, createdList));
							} else if (collObj instanceof ProductEnterpriseRole) {
								Classificator role = ((ProductEnterpriseRole) collObj)
										.getEnterpriseRoleClass();
								dtoObj = new ClassItemMap();
								dtoList.add(create(dtoObj, role, createdList));
							} else if (collObj instanceof UserGroup) {
								Classificator role = ((UserGroup) collObj)
										.getGroupClass();
								dtoObj = new ClassItemMap();
								dtoList.add(create(dtoObj, role, createdList));
							} else if(collObj instanceof MTRLicense) {
								dtoList.add(create(new MtrLicenseMap(), (MTRLicense)collObj, createdList));
							}
						}
						dtoBean.put(propName, dtoList);
					} else if (valueClass.getName().startsWith("ee")) {
						if (value instanceof Classificator) {
							ClassItemMap dtoObj = new ClassItemMap();
							dtoBean.put(propName, create(dtoObj,
									(Classificator) value, createdList));
						} else if (value instanceof Enterprise) {
							dtoBean.put(propName, create(new EnterpriseMap(),
									(Enterprise) value, createdList));
						} else if (value instanceof Person) {
							dtoBean.put(propName, create(new PersonMap(),
									(Person) value, createdList));
						} else if (value instanceof Product) {
							dtoBean.put(propName, create(new ProductMap(),
									(Product) value, createdList));
						} else if (value instanceof Address) {
							dtoBean.put(propName, create(new AddressMap(),
									(Address) value, createdList));
						} else if (value instanceof ContactInfo) {
							dtoBean.put(propName, create(new ContactInfoMap(),
									(ContactInfo) value, createdList));
						} else if (value instanceof Decision) {
							dtoBean.put(propName, create(new DecisionMap(),
									(Decision) value, createdList));
						} else if (value instanceof RegistryEntry) {
							dtoBean.put(propName, create(
									new RegistryEntryMap(),
									(RegistryEntry) value, createdList));
						} else if (value instanceof RegistryApplication) {
							dtoBean.put(propName, create(new ApplicationMap(),
									(RegistryApplication) value, createdList));
						} else if (value instanceof ProductExamples) {
							dtoBean.put(propName, create(
									new ProductExamplesMap(),
									(ProductExamples) value, createdList));
						} else if (value instanceof MtrAndCustomsQueryResult) {
							dtoBean.put(propName, create(
									new MtrAndCustomsQueryResultMap(),
									(MtrAndCustomsQueryResult) value,
									createdList));
						
						} else if (value instanceof MTRLicense) {
							dtoBean.put(propName, create(new MtrLicenseMap(),(MTRLicense)value,createdList));
                  } else if (value instanceof ReportView) {
                	  
                     dtoBean.put(propName, create(new ReportViewMap(),(ReportView)value,createdList));
                  } else if (value instanceof ReportListView) {
                     dtoBean.put(propName, create(new ReportListViewMap(),(ReportListView)value,createdList));
                  } else if (value instanceof RegistryEntryView) {
                	  dtoBean.put(propName, create(new RegistryEntryViewMap(), (RegistryEntryView)value,createdList));
                  }
					} else if (value instanceof Integer) {
						dtoBean.put(propName, ((Integer) value).toString());
					} else if (value instanceof Boolean) {
						dtoBean.put(propName, ((Boolean) value).toString());
					} else if (value instanceof Long) {
						//all the long values that must not be converted into strings
						if (ABaseDTOMap.ID.equals(propName)
								|| ABaseDTOMap.VERSION.equals(propName)
								|| ReportListViewMap.PRODUCT_ID.equals(propName)
								|| SuperSearchMap.PRODUCT_EXAMPLES_COUNT.equals(propName)
							)
							dtoBean.put(propName, value);
						else
							dtoBean.put(propName, ((Long) value).toString());
					} else if (value instanceof Date) {
						if (modelBean instanceof AuthenticationLog) {
							dtoBean.put(propName, defaultDateTimeFormat
									.format((Date) value));
						} else {
							dtoBean.put(propName, defaultDateFormat
									.format((Date) value));
						}
					} else if (value instanceof BigDecimal) {
						BigDecimal bd = null;
						if(EnterpriseMap.BALANCE.equals(propName)) {
							bd = ((BigDecimal)value).setScale(2);
						} else if(RegistryPaymentMap.AMOUNT.equals(propName)) {
							bd = ((BigDecimal)value).setScale(2);
						} else if (ProductMap.GRADE.equals(propName) || SuperSearchMap.PRODUCT_ETHANOL_RATE.equals(propName)) {
							bd = ((BigDecimal) value).setScale(2, BigDecimal.ROUND_DOWN).stripTrailingZeros();
						} else {
							bd = (BigDecimal)value;
						}
						
						if(ProductMap.GRADE.equals(propName) 
								|| SuperSearchMap.PRODUCT_ETHANOL_RATE.equals(propName)
								|| EnterpriseMap.BALANCE.equals(propName) 
								|| RegistryPaymentMap.AMOUNT.equals(propName)
								|| PaymentMatchingLogMap.AMOUNT.equals(propName)
								|| ApplicationMap.LATEST_PAYMENT.equals(propName)){
							if(bd.equals(new BigDecimal(0.00).setScale(2)))
								bd = bd.stripTrailingZeros().setScale(0);
							dtoBean.put(propName, bd.toPlainString().replace(".", ","));
						}else
							dtoBean.put(propName, bd.toPlainString());
					} else if (value instanceof BigInteger) {
						dtoBean.put(propName, ((BigInteger) value).toString());
					} else if (value instanceof Float) {
						dtoBean.put(propName, ((Float) value).toString());
					} else
						dtoBean.put(propName, value);

				}else if(EnterpriseMap.BALANCE.equals(propName) && value == null){ // default balance must be 0
					
					BigDecimal bd = new BigDecimal(0.00);
					dtoBean.put(propName, bd.toPlainString().replace(".", ","));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException(e);
		}
		// createdList.put(modelBean, dtoBean);
		return dtoBean;
	}

	public static ABaseDTOMap create(ABaseDTOMap dtoBean, Serializable modelBean) {
		HashMap<Serializable, ABaseDTOMap> createdList = new HashMap<Serializable, ABaseDTOMap>();
		return create(dtoBean, modelBean, createdList);
	}

	public static ee.agri.alkor.service.SearchFilter create(
			ee.agri.alkor.web.client.dto.SearchFilter searchFilter) {
		ee.agri.alkor.service.SearchFilter modelFilter = new ee.agri.alkor.service.SearchFilter();

		try {
			beanUtils.copyProperties(modelFilter, searchFilter);
			modelFilter.setColumns(searchFilter.getColumns(), searchFilter
					.getColumnsList());
			modelFilter.setSortMap(searchFilter.getSortMap());
			modelFilter.setOrderBy(searchFilter.getOrderBy());
			for (Iterator it = searchFilter.getQueryParams().keySet()
					.iterator(); it.hasNext();) {
				Object key = it.next();
				Object value = searchFilter.getQueryParams().get(key);
				if (value instanceof RangeFilter) {
					RangeFilter searchRf = (RangeFilter) value;
					ee.agri.alkor.service.RangeFilter modelRf = new ee.agri.alkor.service.RangeFilter(
							searchRf.getType(), searchRf.getMin(), searchRf
									.getMax());
					modelFilter.getQueryParams().put((String) key, modelRf);
				}
			}
		} catch (Exception e) {
			throw new SystemException(e);
		}
		return modelFilter;
	}

	/**
     * Convert linked HashMap values
     *
     * @param map
     *            LinkedHashMap of the service package
     * @return LinkedHashMap of the web pacakge
     */
	public static ee.agri.alkor.web.client.common.LinkedHashMap create(
			ee.agri.alkor.service.LinkedHashMap map) {
		if (map instanceof ee.agri.alkor.service.LinkedHashMap) {
			final ee.agri.alkor.web.client.common.LinkedHashMap newMap = new ee.agri.alkor.web.client.common.LinkedHashMap();
			List keys = ((ee.agri.alkor.service.LinkedHashMap) map).keyList();
			for (int i = 0; i < keys.size(); i++) {
				newMap.put(keys.get(i), map.get(keys.get(i)));
			}
			return newMap;
		} else
			return null;
	}

	public static ee.agri.alkor.service.LinkedHashMap create(
			ee.agri.alkor.web.client.common.LinkedHashMap map) {
		if (map instanceof ee.agri.alkor.web.client.common.LinkedHashMap) {
			final ee.agri.alkor.service.LinkedHashMap newMap = new ee.agri.alkor.service.LinkedHashMap();
			List keys = ((ee.agri.alkor.web.client.common.LinkedHashMap) map)
					.keyList();
			for (int i = 0; i < keys.size(); i++) {
				newMap.put(keys.get(i), map.get(keys.get(i)));
			}
			return newMap;
		} else
			return null;
	}

	public static ee.agri.alkor.web.client.dto.SearchFilter create(
			ee.agri.alkor.service.SearchFilter modelFilter) {

		ee.agri.alkor.web.client.dto.SearchFilter dtoFilter = new ee.agri.alkor.web.client.dto.SearchFilter();
		try {
			beanUtils.copyProperties(dtoFilter, modelFilter);
			dtoFilter.setSortMap(modelFilter.getSortMap());
			dtoFilter.setOrderBy(modelFilter.getOrderBy());
			dtoFilter.setColumns(modelFilter.getColumns(), modelFilter
					.getColumnsList());
			for (Iterator it = modelFilter.getQueryParams().keySet().iterator(); it
					.hasNext();) {
				Object key = it.next();
				Object value = modelFilter.getQueryParams().get(key);
				if (value instanceof ee.agri.alkor.service.RangeFilter) {
					ee.agri.alkor.service.RangeFilter modelRf = (ee.agri.alkor.service.RangeFilter) value;
					RangeFilter dtoRf = new RangeFilter(modelRf.getType(),
							modelRf.getMin(), modelRf.getMax());
					modelFilter.getQueryParams().put((String) key, dtoRf);
				}
			}
		} catch (Exception e) {
			throw new SystemException(e);
		}

		List modelResults = modelFilter.getResultsList();
		List dtoResults = new ArrayList();
		dtoFilter.setResultsList(dtoResults);
		for (Iterator it = modelResults.iterator(); it.hasNext();) {
			HashMap<Serializable, ABaseDTOMap> createdList = new HashMap<Serializable, ABaseDTOMap>();
			Object modelObject = it.next();
			Object dtoObject = null;
			if (modelObject instanceof Enterprise)
				dtoObject = create(new EnterpriseMap(),
						(Enterprise) modelObject, createdList);
			else if (modelObject instanceof Product)
				dtoObject = create(new ProductMap(), (Product) modelObject,
						createdList);
			else if (modelObject instanceof RegistryApplication)
				dtoObject = create(new ApplicationMap(),
						(RegistryApplication) modelObject, createdList);
			else if (modelObject instanceof RegistryPayment)
				dtoObject = create(new RegistryPaymentMap(),
						(RegistryPayment) modelObject, createdList);
			else if (modelObject instanceof RegistryEntry)
				dtoObject = create(new RegistryEntryMap(),
						(RegistryEntry) modelObject, createdList);
			else if (modelObject instanceof SystemUser)
				dtoObject = create(new UserManageMap(),
						(SystemUser) modelObject, createdList);
			else if (modelObject instanceof News)
				dtoObject = create(new NewsMap(), (News) modelObject,
						createdList);
			else if (modelObject instanceof Faq)
				dtoObject = create(new FAQMap(), (Faq) modelObject, createdList);
			else if (modelObject instanceof AuthenticationLog)
				dtoObject = create(new AuthLogMap(),
						(AuthenticationLog) modelObject, createdList);
			else if (modelObject instanceof SearchViewPrimitive)
				dtoObject = create(new SuperSearchMap(),
						(SearchViewPrimitive) modelObject, createdList);
			else if (modelObject instanceof RegistryPaymentView)
				dtoObject = create(new StateFeeMap(),
						(RegistryPaymentView) modelObject, createdList);
         else if (modelObject instanceof ReportView)
            dtoObject = create(new ReportViewMap(),
                  (ReportView) modelObject, createdList);
         else if (modelObject instanceof ReportListView)
            dtoObject = create(new ReportListViewMap(),
                  (ReportListView) modelObject, createdList);
         else if (modelObject instanceof RegistryEntryView)
			 dtoObject = create(new RegistryEntryViewMap(), (RegistryEntryView)modelObject, createdList);
		dtoResults.add(dtoObject);
		 
		}

		return dtoFilter;
	}

	public static List create(String category, List<Classificator> classList) {
		List newClassList = new ArrayList();

		for (Classificator classic : classList) {
			newClassList.add(create(classic));
		}
		return newClassList;
	}
	
	public static Object create(Object o) {
		return o;
	}
	
	public static boolean create(boolean bool) {
		
		return bool;
	}
	
	public static long create(long l) {
		
		return l;
	}

	public static ClassItemMap create(Classificator classic) {
		if (classic == null)
			return null;
		ClassItemMap item = new ClassItemMap();
		item.put(ClassItemMap.CLASS, classic.getClass().getName());
		item.put(ClassItemMap.ID, classic.getId());
		item.put(ClassItemMap.CODE, classic.getCode());
		item.put(ClassItemMap.NAME, classic.getName());
		item.put(ClassItemMap.ACTIVE, classic.getActive());
		item.put(ClassItemMap.CATEGORY_NAME, classic.getCategoryName());
		item.put(ClassItemMap.VERSION, classic.getVersion());
		/*
         * item.setValidFrom(classic.getValidFrom());
         * item.setValidUntil(classic.getValidUntil());
         */
		return item;
	}

	public static Classificator create(ClassItemMap classItemMap) {
		String className = classItemMap.getText(ClassItemMap.CLASS);
		Classificator classic = null;
		if (className == null)
			return null;
		try {
			classic = (Classificator) Class.forName(
					"ee.agri.alkor.model.classes." + className).newInstance();
		} catch (Exception e) {
			throw new SystemException(e);
		}
		return (Classificator) create(classic, classItemMap);
	}

	// //replaced with public static List create(List list)
	// public static List create(List<ee.agri.alkor.model.RegistryDocument>
	// list) {
	// List newList = new ArrayList();
	//
	// for (ee.agri.alkor.model.RegistryDocument doc : list) {
	// newList.add(create(doc));
	// }
	// return newList;
	// }

	public static List create(
			List<ee.agri.alkor.model.classes.SystemGroup> list, String group) {
		List newList = new ArrayList();

		for (ee.agri.alkor.model.classes.SystemGroup doc : list) {
			newList.add(create(doc));
		}
		return newList;
	}

	public static List create(List list) {
		List newList = new ArrayList();
		if (list.size() != 0) {
			for (Object o : list) {
				if (o instanceof ee.agri.alkor.xtee.MTRLicense) {
					newList.add(create((ee.agri.alkor.xtee.MTRLicense) o));
				} else if (o instanceof ee.agri.alkor.model.RegistryDocument) {
					newList
							.add(create((ee.agri.alkor.model.RegistryDocument) o));
				} else if(o instanceof ee.agri.alkor.model.PaymentMatchingLog){
					newList.add(create((ee.agri.alkor.model.PaymentMatchingLog) o));
				}
			}
		}
		return newList;
	}
	
	public static ArrayList create(ArrayList list) {		
		return list;
	}

	/**
     * Create license map for MTRLicense
     *
     * @param license
     * @return
     */
	public static MtrLicenseMap create(MTRLicense license) {
		MtrLicenseMap licenseMap = new MtrLicenseMap();
		return (MtrLicenseMap) create(licenseMap, license);
	}

	/*
     * public static ee.agri.alkor.web.client.dto.RegistryDocument
     * create(ee.agri.alkor.model.RegistryDocument doc) {
     * ee.agri.alkor.web.client.dto.RegistryDocument newDoc = new
     * ee.agri.alkor.web.client.dto.RegistryDocument();
     * newDoc.setId(doc.getId()); newDoc.setName(doc.getName());
     * newDoc.setCreated(doc.getCreated()); return newDoc; }
     */
	public static int asd = 0;
	
	public static ee.agri.alkor.web.client.dto.RegistryDocumentMap create(
			ee.agri.alkor.model.RegistryDocument doc) {
		ee.agri.alkor.web.client.dto.RegistryDocumentMap newDoc = new ee.agri.alkor.web.client.dto.RegistryDocumentMap();
		newDoc.put(RegistryDocumentMap.ID, doc.getId());
		newDoc.put(RegistryDocumentMap.TYPE, create(doc.getDocType()));
		newDoc.put(RegistryDocumentMap.NAME, doc.getName());
		newDoc.put(RegistryDocumentMap.DOCUMENTNAME, doc.getDocumentName());
		newDoc.put(RegistryDocumentMap.DELETED, doc.getDeletedBy());
		newDoc.put(RegistryDocumentMap.ARCHIVED, doc.getArchived());
		newDoc.put(RegistryDocumentMap.REASON,  doc.getReason());
		
		/*
		 * 
		 */
		
		try {
			asd++;
			if(asd == 1){
				ResultSet rs1 = PostgreUtils.query("SELECT pg_sleep(60)");
			}
			ResultSet rs = PostgreUtils.query("select * from reg_doc where id="+doc.getId());
			while (rs.next()) {
				String publ = rs.getString("public");
				newDoc.put(RegistryDocumentMap.PUBLIC, publ);
				
				
			}
			
		} catch (Exception e) {
			

		}
//		
		if (doc.getCreated() != null)
			newDoc.put(RegistryDocumentMap.CREATED, defaultDateTimeFormat
					.format(doc.getCreated()));
		return newDoc;
	}

}
