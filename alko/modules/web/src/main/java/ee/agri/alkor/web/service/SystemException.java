package ee.agri.alkor.web.service;

import com.google.gwt.user.client.rpc.IsSerializable;

public class SystemException 
	extends RuntimeException 
	implements IsSerializable {
	
	public SystemException() {
		super();
	}
	
	public SystemException(String msg) {
		super(msg);
	}

	public SystemException(Throwable cause) {
		super(cause);
	}

	private static final long serialVersionUID = 1L;

}
