package ee.agri.alkor.web.client.validator;

import ee.agri.alkor.web.client.common.Errors;

public class IntegerValidator implements Validator{

	private String field;
	private int start;
	private int end;

	public IntegerValidator(String field) {
		super();
		this.field = field;
	}

//	public IntegerValidator(String field, int start) {
//		this(field, start, );
//
//	}
//
//	public IntegerValidator(String field, int start, int end) {
//		super();
//		this.field = field;
//		this.start = start;
//		this.end = end;
//	}

	public void validate(Object value, Errors errors) {

		if (value == null || value == "") {
			return;
		}

		if(value instanceof String) {
			if (!isPositiveInteger((String)value)) {
				errors.addError(field, this);
			}
		}

	}

	private boolean isPositiveInteger(String string) {
		try {
			int in = Integer.parseInt(string);
			if(in < 0) {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
		return true;


	}

}