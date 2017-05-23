package ee.agri.alkor.model;

import java.io.Serializable;

/**
 * Base entity interface.
 * 
 * @author ivar
 *
 */
public interface IEntity extends Serializable {

	Long getId() ;
	
	void setId(Long id) ;
	
}
