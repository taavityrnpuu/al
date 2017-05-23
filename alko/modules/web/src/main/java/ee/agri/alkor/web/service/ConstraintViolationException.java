package ee.agri.alkor.web.service;
/**
 * Data constraint violation(unique, foreign key etc)
 * exception.
 * 
 * @author ivar
 *
 */
public class ConstraintViolationException 
	extends ApplicationException {
	  private static final long serialVersionUID = 1L;

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
	}

	
}
