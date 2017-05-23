package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Query state classificator.
 * 
 * @author kristjan
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("QueryState")
public class QueryState extends Classificator {

	public QueryState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QueryState(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
