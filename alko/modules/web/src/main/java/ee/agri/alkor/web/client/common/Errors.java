package ee.agri.alkor.web.client.common;

import java.util.List;

import ee.agri.alkor.web.client.validator.Validator;

public interface Errors {

	public void addError(String field, Validator validator);

	public void clearErrors();

	public void setErrors(List errors);

	public List getErrors();

}