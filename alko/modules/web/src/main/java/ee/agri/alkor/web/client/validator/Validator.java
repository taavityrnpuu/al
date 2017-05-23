package ee.agri.alkor.web.client.validator;

import ee.agri.alkor.web.client.common.Errors;

public interface Validator {

	public void validate(Object value, Errors errors);

}