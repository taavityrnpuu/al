package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Users group classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("SystemGroup")
public class SystemGroup extends Classificator {

	public SystemGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SystemGroup(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
