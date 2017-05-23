package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Used to show the capacity of a bottle
 * 
 * @author kaupo
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("Capacity")
public class Capacity extends Classificator {

	public Capacity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Capacity(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
