package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * CorkColor classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("CorkColor")
public class CorkColor extends Classificator {

	public CorkColor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CorkColor(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
