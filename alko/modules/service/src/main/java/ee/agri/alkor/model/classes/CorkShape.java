package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * CorkShape classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("CorkShape")
public class CorkShape extends Classificator {

	public CorkShape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CorkShape(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
