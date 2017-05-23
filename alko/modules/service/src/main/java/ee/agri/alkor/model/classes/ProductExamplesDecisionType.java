package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * ProductExamplesDecisionType classificator.
 * 
 * @author kristjan
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("ProductExamplesDecisionType")
public class ProductExamplesDecisionType extends Classificator {

	public ProductExamplesDecisionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductExamplesDecisionType(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
