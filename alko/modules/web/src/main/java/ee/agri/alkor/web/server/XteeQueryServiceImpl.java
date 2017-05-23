package ee.agri.alkor.web.server;

import java.util.ArrayList;

import ee.agri.alkor.xtee.ServiceFactory;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.MtrAndCustomsQueryResultMap;
import ee.agri.alkor.web.client.dto.ObjectList;
import ee.agri.alkor.web.service.XteeQueryService;

public class XteeQueryServiceImpl implements  XteeQueryService {

	public ObjectList makeBusinessRegisterQuery(String name, String registrationId) {
		Enterprise enterprise = ServiceFactory.getXteeServices().queryEnterprise(registrationId);
		ObjectList result = new ObjectList();
		if (enterprise != null) {
			result.add(ClientDataFactory.create(enterprise));
		}
		return result;
	}
	
	public MtrAndCustomsQueryResultMap makeMTRAndCustomsQuery(String registrationId) {
		return ClientDataFactory.create(ServiceFactory.getXteeServices()
			.queryMTRAndCustoms(registrationId));
	}

}
