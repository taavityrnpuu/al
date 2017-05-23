package ee.agri.alkor.service;

/**
 * General runtime exception.
 * 
 * @author ivar
 *
 */
public class SystemException 
	extends RuntimeException {
	
	public SystemException() {
		super();
	}
	
	public SystemException(String msg) {
		super(msg);
	}

	public SystemException(Throwable cause) {
		super(cause);
	}
	
	public SystemException(String msg, Throwable cause) {
		super(msg, cause);
	}

	private static final long serialVersionUID = 1L;

}
