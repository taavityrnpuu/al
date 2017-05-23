package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Application type classificator.
 * 
 * @author kristjan
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("ApplicationType")
public class ApplicationType extends Classificator {

	public ApplicationType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationType(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
