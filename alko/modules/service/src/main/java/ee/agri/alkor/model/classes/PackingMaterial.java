package ee.agri.alkor.model.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Packing material classificator.
 * 
 * @author kristjan
 *
 */
@Entity
@DiscriminatorValue("PackingMaterial")
public class PackingMaterial extends Classificator {

	public PackingMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PackingMaterial(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

}
