package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Registry tax classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("RegistryTax")
public class RegistryTax extends Classificator {

	public RegistryTax() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistryTax(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
