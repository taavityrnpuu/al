package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Enterprise role classificator.
 *
 * @author sven
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("Month")
public class Month extends Classificator {

	public Month() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Month(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
