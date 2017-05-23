/**
 *
 */
package ee.agri.alkor.model.history;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;

/**
 * ProductMovementReportRecord History table
 * @author kaupo
 *
 */
@Entity
@Table(name = "PRODUCT_MOVE_REPORT_RECORD_HISTORY")
@javax.persistence.SequenceGenerator(name = "PRODUCT_MOVE_REPORT_RECORD_HIST_SEQ", sequenceName = "PRODUCT_MOVE_REPORT_RECORD_HIST_SEQ", allocationSize = 1)
public class ProductMovementReportRecordHistory extends ABaseBean implements
		IHistoryEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 4215931720324358651L;

	private Long histId;

	private Long id;

	/**
     * kande nr.
     */
	private Long registryEntry; //RegistryEntry

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

	private Long report; //ProductMovementReport

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_MOVE_REPORT_RECORD_HIST_SEQ")
	public Long getHistId() {
		return this.histId;
	}

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#setHistId(java.lang.Long)
     */
	public void setHistId(Long histId) {
		this.histId = histId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "RECEIVER", length = 256)
	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	@Column(name="REGENTRY_ID")
	public Long getRegistryEntry() {
		return registryEntry;
	}

	public void setRegistryEntry(Long registryEntry) {
		this.registryEntry = registryEntry;
	}

	@Column(name = "PARTY_NR", length = 256)
	public String getPartyNr() {
		return partyNr;
	}

	public void setPartyNr(String partyNr) {
		this.partyNr = partyNr;
	}

	@Column(name = "AMOUNT")
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

	@Column(name="REPORT_ID")
	public Long getReport() {
		return report;
	}

	public void setReport(Long report) {
		this.report = report;
	}

}
