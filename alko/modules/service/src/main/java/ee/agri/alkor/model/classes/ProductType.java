package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Product type classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("ProductType")
public class ProductType extends Classificator {

	public ProductType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductType(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
