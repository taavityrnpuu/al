package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Country classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("Country")
public class Country extends Classificator {

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}
}
