package ee.agri.alkor.web.service;

import ee.agri.alkor.web.client.dto.MtrAndCustomsQueryResultMap;
import ee.agri.alkor.web.client.dto.ObjectList;

public interface XteeQueryService extends BaseService {

	ObjectList makeBusinessRegisterQuery(String name, String registrationId) ;

	MtrAndCustomsQueryResultMap makeMTRAndCustomsQuery(String enterpriseRegNr) ;

}
