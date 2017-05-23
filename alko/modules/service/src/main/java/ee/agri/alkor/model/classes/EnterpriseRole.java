package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Enterprise role classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("EnterpriseRole")
public class EnterpriseRole extends Classificator {

	public EnterpriseRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnterpriseRole(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
