package ee.agri.alkor.web.client.validator;

import ee.agri.alkor.web.client.common.Errors;

public class DateValidator implements Validator {

	private String field;

	public DateValidator(String field) {
		this.field = field;
	}

	public void validate(Object value, Errors errors) {

		if (value == null || value == "") {
			return;
		}

		if(value instanceof String) {

			String string = ((String)value);
			String dateString = string.replace('.', '/');

			String[] dates = dateString.split("/");
			if(dates.length < 3){
				errors.addError(field, this);
				return;
			}
			int day = 0, month = 0, year = 0;
			try {
				day = Integer.parseInt(dates[0]);
				month = Integer.parseInt(dates[1]);
				year = Integer.parseInt(dates[2]);
			} catch (NumberFormatException nfe) {
				errors.addError(field, this);
				return;
			}

			if(!isValidDate(day, month, year)) {
				errors.addError(field, this);
				return;
			}

		}
		// TODO Auto-generated method stub

	}

	/**
	 *
	 * @param day
	 * @param month
	 * @param year
	 * @return if the date specified is a valid date
	 */
	private boolean isValidDate(int day, int month, int year) {

		int adder = 0;

		if (year < 0 && year > 9999 || day < 1 && day > 31 || month < 1 && month > 12) {
			return false;
		}

		if (year % 4 == 0) {
			adder = 1;
		}

		switch(month){
			case 1: if(day <= 31) return true; else return false;
			case 2: if(day <= 28+adder) return true; else return false;
			case 3: if(day <= 31) return true; else return false;
			case 4: if(day <= 30) return true; else return false;
			case 5: if(day <= 31) return true; else return false;
			case 6: if(day <= 30) return true; else return false;
			case 7: if(day <= 31) return true; else return false;
			case 8: if(day <= 31) return true; else return false;
			case 9: if(day <= 30) return true; else return false;
			case 10: if(day <= 31) return true; else return false;
			case 11: if(day <= 30) return true; else return false;
			case 12: if(day <= 31) return true; else return false;
			default: return false;
		}

	}

}
