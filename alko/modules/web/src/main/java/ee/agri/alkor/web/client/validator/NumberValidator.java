package ee.agri.alkor.web.client.validator;

import ee.agri.alkor.web.client.common.Errors;

public class NumberValidator implements Validator {
	
	private String fieldName;
	
	public NumberValidator(String fieldName) {
		super();
		this.fieldName = fieldName;
	}

	public void validate(Object value, Errors errors) {
		
		if (value == null || value == "") {
			return;
		}
		
		if (value instanceof String) {
			if(!isPositiveFloat((String) value)) {
				errors.addError(fieldName, this);
			}
		
		}
		
	}
	
	private boolean isPositiveFloat(String value) {
		
		value = value.replace('.', ',');
		String regex = "[0-9]+(,[0-9]+)?";
		
		return value.matches(regex);
		
	}

}
