package ee.agri.alkor.web.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

import ee.agri.alkor.web.client.dto.UserInfo;
import ee.agri.alkor.web.service.AuthInfoService;
import ee.agri.alkor.web.service.AuthInfoServiceAsync;
import ee.agri.alkor.web.service.ClassificatorService;
import ee.agri.alkor.web.service.ClassificatorServiceAsync;
import ee.agri.alkor.web.service.RegistryService;
import ee.agri.alkor.web.service.RegistryServiceAsync;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.UserManagerService;
import ee.agri.alkor.web.service.UserManagerServiceAsync;
import ee.agri.alkor.web.service.XteeQueryService;
import ee.agri.alkor.web.service.XteeQueryServiceAsync;
import ee.agri.alkor.service.IRegistryService;

import ee.agri.alkor.service.ServiceFactory;

import ee.agri.alkor.impl.ClassificatorServiceImpl;
import ee.agri.alkor.web.service.ConstraintViolationException;
import ee.agri.alkor.web.client.dto.EnterpriseMap;

/**
 * 
 * @author ivar
 * 
 */
public class ServiceContext {
	/**
	 * Cache entry keys.
	 */
	
	
	
	public static final String APPLICATION_STATE = "ApplicationState";
	public static final String APPLICATION_STATE2 = "ApplicationState2";

	public static final String APPLICATION_TYPE = "ApplicationType";

	public static final String PRODUCT_VOLUME = "Capacity";

	public static final String REGISTRY_TAX = "RegistryTax";

	public static final String ENTERPRISE_ROLES = "EnterpriseRole";

	public static final String COUNTRIES = "Country";

	public static final String PRODUCT_TYPE = "ProductType";
	
	//public static final String PRODUCT_TYPE_OTSING = "ProductTypeOtsi";

	public static final String PACKING_MATERIAL = "PackingMaterial";

	public static final String CORK_SHAPE = "CorkShape";

	public static final String STOCKING_COLOR = "StockingColor";

	public static final String BOTTLE_COLOR = "BottleColor";

	public static final String BOTTLE_SHAPE = "BottleShape";

	public static final String CORK_COLOR = "CorkColor";

	public static final String CORK_MATERIAL = "CorkMaterial";

	public static final String DECISION_REG_ENTRY = "RegistryEntryDecisionType";

	public static final String DECISION_EXAMPLES = "ProductExamplesDecisionType";

	public static final String REGISTRY_ENTRY_DECISION_TYPE = "RegistryEntryDecisionType";

	public static final String LANGUAGES = "Language";

	public static final String MONTH = "Month";

	public static final String CAPACITY = "Capacity";

	private AuthInfoServiceAsync authInfoService;

	private RegistryServiceAsync registryService;

	private ClassificatorServiceAsync classificatorService;

	private UserManagerServiceAsync userManagerService;

	private XteeQueryServiceAsync externalService;

	private UserInfo userInfo;

	private String language = "est";

	private final Map cache = new HashMap();
	private final Map cache2 = new HashMap();

	private final Map cacheListeners = new HashMap();

	private static ServiceContext instance;

	private final boolean isSessionValid = true;

	// For debugging private static int count;

	public static ServiceContext getInstance() {
		if (instance == null) {
			instance = new ServiceContext();
			// instance.getUserInfo();
		}
		return instance;
	}

	public AuthInfoServiceAsync getAuthService() {
		if (authInfoService == null) {
			authInfoService = (AuthInfoServiceAsync) GWT
					.create(AuthInfoService.class);
			((ServiceDefTarget) authInfoService).setServiceEntryPoint(GWT
					.getModuleBaseURL() + ServiceConstants.AUTH_SERVICE_URL);
		}
		return authInfoService;
	}

	public ClassificatorServiceAsync getClassificatorService() {
		if (classificatorService == null) {
			classificatorService = (ClassificatorServiceAsync) GWT
					.create(ClassificatorService.class);
			((ServiceDefTarget) classificatorService).setServiceEntryPoint(GWT
					.getModuleBaseURL() + ServiceConstants.CLASS_SERVICE_URL);
		}
		return classificatorService;
	}

	public RegistryServiceAsync getRegistryService() {
		if (registryService == null) {
			registryService = (RegistryServiceAsync) GWT
					.create(RegistryService.class);
			((ServiceDefTarget) registryService)
					.setServiceEntryPoint(GWT.getModuleBaseURL()
							+ ServiceConstants.REGISTRY_SERVICE_URL);
		}
		return registryService;
	}

	public UserManagerServiceAsync getUserManagerService() {
		if (userManagerService == null) {
			userManagerService = (UserManagerServiceAsync) GWT
					.create(UserManagerService.class);
			((ServiceDefTarget) userManagerService)
					.setServiceEntryPoint(GWT.getModuleBaseURL()
							+ ServiceConstants.USER_MAN_SERVICE_URL);
		}
		return userManagerService;
	}

	public XteeQueryServiceAsync getExternalService() {
		if (externalService == null) {
			externalService = (XteeQueryServiceAsync) GWT
					.create(XteeQueryService.class);
			((ServiceDefTarget) externalService)
					.setServiceEntryPoint(GWT.getModuleBaseURL()
							+ ServiceConstants.EXTERNAL_SERVICE_URL);
		}
		return externalService;
	}

	public UserInfo getUserInfo() {
		if (this.userInfo == null) {
			getAuthService().getUserInfo(new AsyncCallback() {
				public void onFailure(Throwable caught) {
				}

				public void onSuccess(Object result) {
						ServiceContext.this.userInfo = (UserInfo) result;
				}

			});
		}
		return userInfo;
	}

	public Object getCached(String key) {
		//this.cache.clear();
		Object value = this.cache.get(key);
		if (value == null) {
			fillCache(key);
		}

		return value;
	}
	
	public Object getSingle(String key){
		//key = PRODUCT_TYPE;
		getClassificatorService().findClassItems2(key,
				new NewCacheAsyncCallback(key));
		Object value = this.cache2.get(key);
		return value;
	}

	public Object getCached2(String key) {
		//Object value = this.cache.get(key);
		//this.cache.clear();
		Object value = null;
		if (value == null) {
			fillCache2(key);
		}

		return value;
	}
	
	//public Object getCached3(String key) {
		//Object value = this.cache.get(key);
		//this.cache.clear();
	//	Object value = null;
	//	if (value == null) {
	//		fillCache3(key);
	//	}

	//	return value;
	//}

	public void getEnterpriseSpecificClassificators(String key, String regCode,
			AsyncCallback callback) {
		if (key.equals(COUNTRIES)) {
			getClassificatorService().findEnterpriseSpecificClassItems(
					COUNTRIES, regCode, callback);
		} else if (key.equals(PRODUCT_TYPE)) {
			getClassificatorService().findEnterpriseSpecificClassItems(
					PRODUCT_TYPE, regCode, callback);
		} else if (key.equals(PRODUCT_VOLUME)) {
			getClassificatorService().findEnterpriseSpecificClassItems(
					PRODUCT_VOLUME, regCode, callback);
		}
	}

	public void putCache(String key, Object value) {
		Object cachedValue = this.cache.get(key);
		if (cachedValue == null) {
			this.cache.put(key, value);
		}
	}
	
	public void putCache2(String key, Object value) {
		Object cachedValue = this.cache2.get(key);
		if (cachedValue == null) {
			this.cache2.put(key, value);
		}
		
	}

	public void addCacheListener(String key, CacheListener listener) {
		List listeners = (List) this.cacheListeners.get(key);
		if (listeners == null) {
			listeners = new ArrayList();
			this.cacheListeners.put(key, listeners);
		}
		listeners.add(listener);
	}

	public void removeCacheListener(String key, CacheListener listener) {
		List listeners = (List) this.cacheListeners.get(key);
		if (listeners == null)
			return;
		listeners.remove(listener);
	}

	private void notifyCacheListeners(String key, Object value) {
		List listeners = (List) this.cacheListeners.get(key);
		if (listeners == null)
			return;
		for (Iterator it = listeners.iterator(); it.hasNext();) {
			CacheListener listener = (CacheListener) it.next();
			listener.avail(key, value);
		}
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void fillAllCacheValues() {
		fillCache(ENTERPRISE_ROLES);
		fillCache(APPLICATION_STATE);
		fillCache(APPLICATION_STATE2);
		fillCache(APPLICATION_TYPE);
		fillCache(COUNTRIES);
		fillCache(PRODUCT_TYPE);
		//fillCache(PRODUCT_TYPE_OTSING);
		fillCache(PACKING_MATERIAL);
		fillCache(CORK_SHAPE);
		fillCache(STOCKING_COLOR);
		fillCache(BOTTLE_COLOR);
		fillCache(BOTTLE_SHAPE);
		fillCache(CORK_COLOR);
		fillCache(CORK_MATERIAL);
		fillCache(DECISION_REG_ENTRY);
		fillCache(DECISION_EXAMPLES);
		fillCache(LANGUAGES);
		fillCache(MONTH);
		fillCache(CAPACITY);
		fillCache(REGISTRY_TAX);
	}

	private void fillCache(String key) {

		if (key.equals(ENTERPRISE_ROLES)) {
			getClassificatorService().findClassItems(ENTERPRISE_ROLES,
					new CacheAsyncCallback(key));
		} else if (key.equals(APPLICATION_STATE)) {
			getClassificatorService().findClassItems(APPLICATION_STATE,
					new CacheAsyncCallback(key));
		} else if (key.equals(APPLICATION_TYPE)) {
			getClassificatorService().findClassItems(APPLICATION_TYPE,
					new CacheAsyncCallback(key));
		} else if (key.equals(COUNTRIES)) {
			getClassificatorService().findClassItems(COUNTRIES,
					new CacheAsyncCallback(key));
		} else if (key.equals(PRODUCT_TYPE)) {
			getClassificatorService().findClassItems(PRODUCT_TYPE,
					new CacheAsyncCallback(key));
		} else if (key.equals(PACKING_MATERIAL)) {
			getClassificatorService().findClassItems(PACKING_MATERIAL,
					new CacheAsyncCallback(key));
		} else if (key.equals(CORK_SHAPE)) {
			getClassificatorService().findClassItems(CORK_SHAPE,
					new CacheAsyncCallback(key));
		} else if (key.equals(STOCKING_COLOR)) {
			getClassificatorService().findClassItems(STOCKING_COLOR,
					new CacheAsyncCallback(key));
		} else if (key.equals(BOTTLE_COLOR)) {
			getClassificatorService().findClassItems(BOTTLE_COLOR,
					new CacheAsyncCallback(key));
		} else if (key.equals(BOTTLE_SHAPE)) {
			getClassificatorService().findClassItems(BOTTLE_SHAPE,
					new CacheAsyncCallback(key));
		} else if (key.equals(CORK_COLOR)) {
			getClassificatorService().findClassItems(CORK_COLOR,
					new CacheAsyncCallback(key));
		} else if (key.equals(CORK_MATERIAL)) {
			getClassificatorService().findClassItems(CORK_MATERIAL,
					new CacheAsyncCallback(key));
		} else if (key.equals(DECISION_REG_ENTRY)) {
			getClassificatorService().findClassItems(DECISION_REG_ENTRY,
					new CacheAsyncCallback(key));
		} else if (key.equals(DECISION_EXAMPLES)) {
			getClassificatorService().findClassItems(DECISION_EXAMPLES,
					new CacheAsyncCallback(key));
		} else if (key.equals(LANGUAGES)) {
			getClassificatorService().findClassItems(LANGUAGES,
					new CacheAsyncCallback(key));
		} else if (key.equals(MONTH)) {
			getClassificatorService().findClassItems(MONTH,
					new CacheAsyncCallback(key));
		} else if (key.equals(REGISTRY_ENTRY_DECISION_TYPE)) {
			getClassificatorService().findClassItems(
					REGISTRY_ENTRY_DECISION_TYPE, new CacheAsyncCallback(key));
		} else if (key.equals(CAPACITY)) {
			getClassificatorService().findClassItems(CAPACITY,
					new CacheAsyncCallback(key));
		} else if (key.equals(REGISTRY_TAX)) {
			getClassificatorService().findClassItems(REGISTRY_TAX,
					new CacheAsyncCallback(key));
		} else if (key.equals(APPLICATION_STATE2)) {
			getClassificatorService().findClassItems(APPLICATION_STATE2,
					new CacheAsyncCallback(key));
		}
	}

	private void fillCache2(String key) {

		if (key.equals(PRODUCT_TYPE)) {
			getClassificatorService().findClassItems2(PRODUCT_TYPE,
					new CacheAsyncCallback(key));
		}
	}
	
	

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	private class CacheAsyncCallback implements AsyncCallback {

		private String cacheKey;
		
		

		private CacheAsyncCallback() {
		}

		public CacheAsyncCallback(String key) {
			this.cacheKey = key;
		}

		public void onFailure(Throwable caught) {
			notifyCacheListeners(this.cacheKey, caught);
		}

		public void onSuccess(Object result) {
			List list = (List) result;
			/*
			 * for(Iterator it = list.iterator();it.hasNext();) { ClassItemMap
			 * item = (ClassItemMap)it.next(); }
			 */
			putCache(this.cacheKey, result);
			notifyCacheListeners(this.cacheKey, result);
		}

	}
	
	private class NewCacheAsyncCallback implements AsyncCallback {

		private String cacheKey;
		
		

		private NewCacheAsyncCallback() {
		}

		public NewCacheAsyncCallback(String key) {
			this.cacheKey = key;
		}

		public void onFailure(Throwable caught) {
			//notifyCacheListeners(this.cacheKey, caught);
		}

		public void onSuccess(Object result) {
			List list = (List) result;
			/*
			 * for(Iterator it = list.iterator();it.hasNext();) { ClassItemMap
			 * item = (ClassItemMap)it.next(); }
			 */
			putCache2(this.cacheKey, result);
			//notifyCacheListeners(this.cacheKey, result);
		}

	}

}
