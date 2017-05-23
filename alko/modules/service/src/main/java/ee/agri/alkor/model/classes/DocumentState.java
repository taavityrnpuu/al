package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Document state classificator.
 * 
 * @author ivar
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@DiscriminatorValue("DocumentState")
public class DocumentState extends Classificator {

	public DocumentState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocumentState(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
