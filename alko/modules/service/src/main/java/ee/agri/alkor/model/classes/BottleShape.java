package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * BottleShape classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("BottleShape")
public class BottleShape extends Classificator {

	public BottleShape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BottleShape(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
