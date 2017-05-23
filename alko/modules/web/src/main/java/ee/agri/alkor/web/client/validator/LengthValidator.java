/**
 *
 */
package ee.agri.alkor.web.client.validator;

import ee.agri.alkor.web.client.common.Errors;

/**
 * @author kaupo
 *
 */
public class LengthValidator implements Validator {

	private int minimum;

	private int maximum;

	private String field;

	public LengthValidator(String field, int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.field = field;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.validator.Validator#validate(java.lang.Object, ee.agri.alkor.web.client.common.Errors)
	 */
	public void validate(Object value, Errors errors) {
		if(value == null && minimum > 0) {
			errors.addError(field, this);
		} else if (value != null && value instanceof String) {
			String test = (String)value;
			if(test.length() < minimum || test.length() > maximum) {
				errors.addError(field, this);
			}
		}
	}
	
	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}
}
