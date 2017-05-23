package ee.agri.alkor.web.client.validator;

import ee.agri.alkor.web.client.common.Errors;

public class NameValidator implements Validator {

	private String field;

	public NameValidator(String field) {
		this.field = field;
	}

	public void validate(Object value, Errors errors) {
		
		if(value == null || value.equals("")) {
			return;
		}
		
		if(value instanceof String) {
			String str = (String) value;
			
			/* Check if there is a name in the format of '[forname] [surname]' */
			int delim = str.indexOf(' ');
			if(delim <=0 ) {
				errors.addError(field, this);
				return;
			}
			String forname = str.substring(0, delim);
			String surname = str.substring(delim+1);
			if(!isValidForname(forname) || !isValidSurname(surname)) {
				errors.addError(field, this);
			}
		}
	}
	
	public boolean isValidForname(String value) {
		/* Implement more sophisticated validation algorithm if needed */
		boolean isValid = isName(value);
		return isValid;
	}
	
	public boolean isValidSurname(String value) {
		/* Implement more sophisticated validation algorithm if needed */
		boolean isValid = isName(value);
		return isValid;
	}
	
	public boolean isName(String value) {
		for(int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if(Character.isLetter(c) || c == '-' || c == ' ') {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

}