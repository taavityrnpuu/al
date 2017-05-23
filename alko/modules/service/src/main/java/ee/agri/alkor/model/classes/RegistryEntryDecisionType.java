package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * RegistryEntryDecisionType classificator.
 * 
 * @author kristjan
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("RegistryEntryDecisionType")
public class RegistryEntryDecisionType extends Classificator {

	public RegistryEntryDecisionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistryEntryDecisionType(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
