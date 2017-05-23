package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Stocking color classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("StockingColor")
public class StockingColor extends Classificator {

	public StockingColor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockingColor(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
