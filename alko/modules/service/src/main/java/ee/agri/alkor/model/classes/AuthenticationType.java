package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Document state classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("AuthenticationType")
public class AuthenticationType extends Classificator {

	public AuthenticationType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthenticationType(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
