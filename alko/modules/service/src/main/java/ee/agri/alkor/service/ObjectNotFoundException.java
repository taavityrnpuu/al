package ee.agri.alkor.service;
/**
 * Exception thrown when object 
 * instance is not found.
 * 
 * @author suisalu
 *
 */
public class ObjectNotFoundException extends SystemException {
	
	private Class objectClass;
	
	private Object objectId;

    public ObjectNotFoundException() {
        super();
    }

    public ObjectNotFoundException(Class objectClass, Object objectId) {
    	this.objectClass = objectClass;
    	this.objectId = objectId;
    }
    
    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException(Throwable cause) {
        super(cause);
    }

    public String getMessage() {
    	StringBuffer sbuf = new StringBuffer("Object");
    	if(this.objectClass != null) {
    		sbuf.append(" of type ").append(this.objectClass.getCanonicalName());
    	}
    	if(this.objectId != null) {
    		sbuf.append(" and Id '").append(this.objectId.toString()).append("'");
    	}
    	sbuf.append(" not found: ").append(super.getMessage());
    	return sbuf.toString();
    }
}
