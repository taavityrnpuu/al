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
@DiscriminatorValue("ApplicationState2")
public class ApplicationState2 extends Classificator {

   public ApplicationState2() {
      super();
      // TODO Auto-generated constructor stub
   }

   public ApplicationState2(String code) {
      super(code);
      // TODO Auto-generated constructor stub
   }

}
