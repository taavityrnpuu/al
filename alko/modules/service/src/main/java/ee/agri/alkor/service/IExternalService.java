package ee.agri.alkor.service;

import ee.agri.alkor.model.Enterprise;

public interface IExternalService {

	Enterprise makeBusinessRegisterQuery(String name, String registrationId) ;
}
