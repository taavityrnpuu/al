package ee.agri.alkor.web.client.validator;

import ee.agri.alkor.web.client.common.Errors;

public class RequiredValidator implements Validator {

	private String field;

	public RequiredValidator(String field) {
		super();
		this.field = field;
	}

	public void validate(Object value, Errors errors) {

		if(value instanceof String) {
			if (((String)value) == null || ((String)value).equals("")) {
				errors.addError(field, this);
			}
		}
      else if(value==null){
         errors.addError(field, this);
      }

	}

}