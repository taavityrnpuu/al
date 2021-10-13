package ee.agri.alkor.model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringEscapeUtils;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.OptimisticLockType;

import ee.agri.alkor.model.history.IHistorical;
/**
 *
 * @author suisalu
 *
 */
@Entity
@org.hibernate.annotations.Entity(
		selectBeforeUpdate = false,
        dynamicInsert = true, dynamicUpdate = true,
        optimisticLock = OptimisticLockType.DIRTY)
@Table(name="REG_ENTRY")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class RegistryEntry extends ABaseBean implements IHistorical {
    /**
     * The id of the entity.
     */
    private Long id;
    


	/**
	 * Toote registreerimise number.
	 */
	private String nr;
	/**
	 * Kande kehtivuse alguse kuup�ev
	 */
	private Date validFrom;

	/**
	 * Kehtivuse lopp
	 */
	private Date validUntil;
	/**
	 * Kande toode.
	 */
	//private Product product;
	/**
	 * Kande muutmise pohjus (pikendamine jne.)
	 */
	private String changeReason;
	/**
	 * Kehtivuse lopu email on saadetud?
	 */
	private Boolean expiryNotificationSent;

	/**
	 *
	 */
	private RegistryApplication application;

	/**
     * Getter for id.
     * @return id
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REG_ENTRY_SEQ")
	@javax.persistence.SequenceGenerator(
    name="REG_ENTRY_SEQ",
    sequenceName="REG_ENTRY_SEQ",
    allocationSize=1
	)
    public Long getId() {
        return id;
    }

    /**
     * Setter for id.
     * @param aId id
     */
    public void setId(Long aId) {
        this.id = aId;
    }

	/**
	 * @return String
	 */
    @Column(name="NR", length=20)
	public String getNr() {
		return nr;
	}
	public void setNr(String entryNr) {
		this.nr = entryNr;
	}
	/**
	 * @return Date
	 */
    @Column(name="VALID_FROM")
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	/**
	 * @return
	 */
    @Column(name="VALID_UNTIL")
	public Date getValidUntil() {
		return validUntil;
	}
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}
	/**
	 *
	 * @return
	 */
    @Column(name="CHANGE_REASON", length=10000)
	public String getChangeReason() {
		return changeReason;
	}
	public void setChangeReason(String changeReason) {
		if(changeReason != null && changeReason.length() > 10000) {
			changeReason = changeReason.substring(0, 10000);
		}
		this.changeReason = changeReason;
	}

    @Column(name="EXPIRY_NOTIFIED")
	public Boolean getExpiryNotificationSent() {
		return expiryNotificationSent;
	}

	public void setExpiryNotificationSent(Boolean expiryNotificationSent) {
		this.expiryNotificationSent = expiryNotificationSent;
	}

	@OneToOne(mappedBy="registryEntry", fetch=FetchType.EAGER)
	public RegistryApplication getApplication() {
		return application;
	}

	public void setApplication(RegistryApplication application) {
		this.application = application;
	}

	@Transient
	public String getValidUntilFormatted(){
		if(this.getValidUntil() != null){
			try{
				SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
				return sdf.format(this.getValidUntil());
			}catch(Exception x){
				x.printStackTrace();
			}
		}
		
		return "";
	}
	
	public String toString() {
		return "Nr: " + nr + ", ValidFrom: " + validFrom + ", ValidUntil: " + validUntil + ", ChangeReason: " + changeReason
			+ ", ExpirySent: " + expiryNotificationSent + ", Application: [" + (this.application != null ? this.application.toString() : "null") + "]";
	}
	
	@Transient
	public String getEmailInfo() {
		
		String number = this.getNr();
		String kehtivus = this.getValidUntilFormatted();
		String liik = "";
		String maht = "";
		String vol = "";
		String pakendaja = "";
		String toode = "";
		String riik = "";
		String tootja = "";
		String tootja_riik = "";
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(0);
		df.setGroupingUsed(false);
		
		if(this.getApplication() != null) {

			if(this.getApplication().getProduct() != null) {
				
				toode = this.getApplication().getProduct().getName();
				
				// tüüp
				if(this.getApplication().getProduct().getType() != null) {
					liik = this.getApplication().getProduct().getType().getName();
				}
				
				// maht
				if(this.getApplication().getProduct().getPackingVolume() != null) {
					maht = this.getApplication().getProduct().getPackingVolume().getName();
				}
				
				// alkoholi %
				if(this.getApplication().getProduct().getEthanolRate() != null) {
					vol = df.format(this.getApplication().getProduct().getEthanolRate());
				}
				
				// pudeldaja
				if(this.getApplication().getProduct().getPackager() != null) {
					pakendaja = this.getApplication().getProduct().getPackager().getName();
				}
				
				// päritolumaa
				if(this.getApplication().getProduct().getOriginCountry() != null) {
					riik = this.getApplication().getProduct().getOriginCountry().getName();
				}
				
				// tootja
				if(this.getApplication().getProduct().getProducer() != null) {
					tootja = this.getApplication().getProduct().getProducer().getName();
					
					// tootjariik
					if(this.getApplication().getProduct().getProducer().getAddress() != null) {
						if(this.getApplication().getProduct().getProducer().getAddress().getCountry() != null) {
							tootja_riik = this.getApplication().getProduct().getProducer().getAddress().getCountry().getName();
						}
					}
				}
			}
		}
		
		return "<td>" + StringEscapeUtils.escapeHtml4(number) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(kehtivus) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(toode) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(liik) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(maht) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(vol) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(riik) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(tootja) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(tootja_riik) + "</td>" +
			"<td>" + StringEscapeUtils.escapeHtml4(pakendaja) + "</td>";
	}
}
