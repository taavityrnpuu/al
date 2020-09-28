package ee.agri.alkor.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.OptimisticLockType;

import ee.agri.alkor.model.history.IHistorical;

@Entity
@org.hibernate.annotations.Entity(
		selectBeforeUpdate = false,
        dynamicInsert = true, dynamicUpdate = true,
        optimisticLock = OptimisticLockType.DIRTY)
@Table(name="PRODUCT_MOVE_REPORT_RECORD")
public class ProductMovementReportRecord
	implements IEntity, IHistorical, Serializable {

	private Long id;

    /**
     * The timestamp of the creation.
     */
    private Date created;

	/**
	 * kande nr.
	 */
	private RegistryEntry registryEntry;

	/**
	 * Saaja ettev. nimi
	 */
	private String receiverName;

	private String marketingPlaceName;

	/**
	 * Tänav, maja jne.
	 */
	private String marketingPlaceAddress;

	/**
	 * Linn, kyla vm.
	 */
	private String marketingPlaceOrgUnit;
	/**
	 * Maakond
	 */
	private String marketingPlaceDistrict;

	private String partyNr;

	private Integer amount;

	private ProductMovementReport report;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_MOVE_REPORT_RECORD_SEQ")
	@javax.persistence.SequenceGenerator(
    name="PRODUCT_MOVE_REPORT_RECORD_SEQ",
    sequenceName="PRODUCT_MOVE_REPORT_RECORD_SEQ",
    allocationSize=1
	)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Column(name="CREATED")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name="RECEIVER", length=256)
	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}


	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="REGENTRY_ID")
	@ForeignKey(name="FK_REPORT_RECORD_REGENTRY")
	public RegistryEntry getRegistryEntry() {
		return registryEntry;
	}

	public void setRegistryEntry(RegistryEntry registryEntry) {
		this.registryEntry = registryEntry;
	}

	@Column(name="PARTY_NR", length=256)
	public String getPartyNr() {
		return partyNr;
	}

	public void setPartyNr(String partyNr) {
		this.partyNr = partyNr;
	}

	@Column(name="AMOUNT")
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Column(name="MARKET_PLACE", length=256)
	public String getMarketingPlaceName() {
		return marketingPlaceName;
	}

	public void setMarketingPlaceName(String marketingPlaceName) {
		this.marketingPlaceName = marketingPlaceName;
	}

	@Column(name="MARKET_ADDR", length=256)
	public String getMarketingPlaceAddress() {
		return marketingPlaceAddress;
	}

	public void setMarketingPlaceAddress(String marketingPlaceAddress) {
		this.marketingPlaceAddress = marketingPlaceAddress;
	}

	@Column(name="MARKET_DISTR", length=256)
	public String getMarketingPlaceDistrict() {
		return marketingPlaceDistrict;
	}

	public void setMarketingPlaceDistrict(String marketingPlaceDistrict) {
		this.marketingPlaceDistrict = marketingPlaceDistrict;
	}

	@Column(name="MARKET_ORGUNIT", length=256)
	public String getMarketingPlaceOrgUnit() {
		return marketingPlaceOrgUnit;
		
	}

	public void setMarketingPlaceOrgUnit(String marketingPlaceOrgUnit) {
		this.marketingPlaceOrgUnit = marketingPlaceOrgUnit;
	}


	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="REPORT_ID")
	@ForeignKey(name="FK_REPORT_RECORD_REPORT")
	public ProductMovementReport getReport() {
		return report;
	}

	public void setReport(ProductMovementReport report) {
		this.report = report;
	}


}
