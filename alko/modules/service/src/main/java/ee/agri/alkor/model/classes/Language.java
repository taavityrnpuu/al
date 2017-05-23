package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Language classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("Language")
public class Language extends Classificator {

	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Language(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
