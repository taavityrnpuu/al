package ee.agri.alkor.web.service;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Base application exception.
 *
 */
public class ApplicationException 
	extends Exception implements IsSerializable {
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public ApplicationException() {
    super();
  }

  /**
   * Creates a new ApplicationException object.
   *
   * @param msg String
   */
  public ApplicationException(String msg) {
    super(msg);
  }

  /**
   * Creates a new ApplicationException object.
   *
   * @param cause Throwable
   */
  public ApplicationException(Throwable cause) {
    super(cause);
  }

  /**
   * Creates a new ApplicationException object.
   *
   * @param message String
   * @param cause Throwable
   */
  public ApplicationException(String message, Throwable cause) {
    super(message, cause);
  }

}

