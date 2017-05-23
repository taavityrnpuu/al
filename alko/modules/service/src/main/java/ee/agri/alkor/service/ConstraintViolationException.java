package ee.agri.alkor.service;
/**
 * Data constraint violation(unique, foreign key etc)
 * exception.
 * 
 * @author ivar
 *
 */
public class ConstraintViolationException 
	extends ApplicationException {

	public ConstraintViolationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConstraintViolationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ConstraintViolationException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	public ConstraintViolationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
