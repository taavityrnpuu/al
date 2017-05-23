package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * BottleColor classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("BottleColor")
public class BottleColor extends Classificator {

	public BottleColor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BottleColor(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
