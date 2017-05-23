package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * CorkMaterial classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("CorkMaterial")
public class CorkMaterial extends Classificator {

	public CorkMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CorkMaterial(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
