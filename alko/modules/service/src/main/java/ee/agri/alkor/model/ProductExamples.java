package ee.agri.alkor.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Product examples registration.
 * Embedded in RegistryApplication.
 * 
 * @author ivar
 *
 */
@Embeddable
public class ProductExamples  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Vastuvotmise kuupäev.
	 */
	private Date receptionDate;
	/**
	 * Tagastamise kuupäev.
	 */
	private Date returnDate;
	/**
	 * Tootenäidiste hävitamise kuupäev.
	 */
	private Date destroyDate;
	/**
	 * Näidiste arv.
	 */
	private Integer count;
	/**
	 * 
	 * @return Integer
	 */
	@Column(name="EXAMPL_COUNT")		
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	/**
	 * 
	 * @return Date
	 */
	@Column(name="EXAMPL_RECEIPT")		
	public Date getReceptionDate() {
		return receptionDate;
	}
	public void setReceptionDate(Date receptionDate) {
		this.receptionDate = receptionDate;
	}
	/**
	 * 
	 * @return Date
	 */
	@Column(name="EXAMPL_RETURN")		
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	/**
	 * 
	 * @return Date
	 */
	@Column(name="EXAMPL_DESTROY")
	public Date getDestroyDate() {
		return destroyDate;
	}
	
	public void setDestroyDate(Date destroyDate) {
		this.destroyDate = destroyDate;
	}

}
