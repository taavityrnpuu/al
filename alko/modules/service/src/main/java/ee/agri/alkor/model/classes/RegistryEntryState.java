package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Registry entry state classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("RegistryEntryState")
public class RegistryEntryState extends Classificator {

	public RegistryEntryState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistryEntryState(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
