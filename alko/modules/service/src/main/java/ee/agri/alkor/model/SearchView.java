package ee.agri.alkor.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import ee.agri.alkor.model.classes.ApplicationState;
import ee.agri.alkor.model.classes.BottleColor;
import ee.agri.alkor.model.classes.BottleShape;
import ee.agri.alkor.model.classes.Capacity;
import ee.agri.alkor.model.classes.CorkColor;
import ee.agri.alkor.model.classes.CorkMaterial;
import ee.agri.alkor.model.classes.CorkShape;
import ee.agri.alkor.model.classes.Country;
import ee.agri.alkor.model.classes.PackingMaterial;
import ee.agri.alkor.model.classes.ProductType;
import ee.agri.alkor.model.classes.RegistryEntryDecisionType;
import ee.agri.alkor.model.classes.StockingColor;

@Entity
@Table(name = "SEARCHVIEW")
@IdClass(value = SearchViewId.class)
public class SearchView implements IClassificatorAware {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Long productId;

	private String productName;

	private ProductType productType;

	private String productKnCode;

	private BigDecimal productEthanolRate;

	private Capacity productVolume;

	private Country productOriginCountry;

	private Boolean productHasStocking;

	private PackingMaterial productPackingMaterial;

	private BottleShape productBottleShape;

	private Integer productNumberOfLabels;

	private BottleColor productBottleColor;

	private CorkMaterial productCorkMaterial;

	private CorkColor productCorkColor;

	private CorkShape productCorkShape;

	private StockingColor productStockingColor;

	private Boolean productHasFrontLabel;

	private Boolean productHasRearLabel;

	private Boolean productHasNeckLabel;

	private Boolean productHasOtherLabel;

	private String productNotes;

	private Long producerId;

	private String producerName;

	private Country producerCountry;

	private Long applicationId;

	private String applicationNr;

	private Date applicationArrived;

	private ApplicationState applicationState;

	private RegistryEntryDecisionType applicationDecisionType;

	private Date applicationDecisionDate;

	private String registryEntryNr;

	private Date registryEntryValidFrom;

	private Date registryEntryValidUntil;

	private Long applicantId;

	private String applicantName;

	private String deregisterDecision;

	private String applicantRegNr;

	private String applicantMtrCode;

	private String applicantExciseStoreHouseNr;

	private String applicantAcknowledgementNr;

	private Date applicantAcknowledgementDate;

	private Long marketerId;

	private String marketerName;

	private Long importerId;

	private String importerName;

	private Long productExamplesCount;

	private Long processorId;

	private String processorForName;

	private String processorLastName;

	private Long packagerId;

	private String packagerName;

	@Id
	@Column(name = "PRODUCT_ID")
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long id) {
		this.productId = id;
	}

	@Column(name = "PRODUCT_NAME")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "PROD_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_CLASS")
	// @Column(name="PROD_CLASS_ID")
	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	@Column(name = "PRODUCT_ETHANOL_RATE")
	public BigDecimal getProductEthanolRate() {
		return productEthanolRate;
	}

	public void setProductEthanolRate(BigDecimal productEthanolRate) {
		this.productEthanolRate = productEthanolRate;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "CAPACITY_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_CAPACITY_CLASS")
	// @Column(name="CAPACITY_CLASS_ID")
	public Capacity getProductVolume() {
		return productVolume;
	}

	public void setProductVolume(Capacity productVolume) {
		this.productVolume = productVolume;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ORG_COUNTRY_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_ORG_COUNTRY_CLASS")
	// @Column(name="ORG_COUNTRY_CLASS_ID")
	public Country getProductOriginCountry() {
		return productOriginCountry;
	}

	public void setProductOriginCountry(Country productOriginCountry) {
		this.productOriginCountry = productOriginCountry;
	}

	@Column(name = "PRODUCT_KN_CODE")
	public String getProductKnCode() {
		return productKnCode;
	}

	public void setProductKnCode(String productKnCode) {
		this.productKnCode = productKnCode;
	}

	@Column(name = "PRODUCT_HAS_STOCKING")
	public Boolean getProductHasStocking() {
		return productHasStocking;
	}

	public void setProductHasStocking(Boolean productHasStocking) {
		this.productHasStocking = productHasStocking;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "PACKMAT_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_PACKMAT_CLASS")
	// @Column(name="PACKMAT_CLASS_ID")
	public PackingMaterial getProductPackingMaterial() {
		return productPackingMaterial;
	}

	public void setProductPackingMaterial(PackingMaterial productPackingMaterial) {
		this.productPackingMaterial = productPackingMaterial;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "BOTSHAPE_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_BOTSHAPE_CLASS")
	// @Column(name="BOTSHAPE_CLASS_ID")
	public BottleShape getProductBottleShape() {
		return productBottleShape;
	}

	public void setProductBottleShape(BottleShape productBottleShape) {
		this.productBottleShape = productBottleShape;
	}

	@Column(name = "PRODUCT_NUMBER_OF_LABELS")
	public Integer getProductNumberOfLabels() {
		return productNumberOfLabels;
	}

	public void setProductNumberOfLabels(Integer productNumberOfLabels) {
		this.productNumberOfLabels = productNumberOfLabels;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "BOTCOL_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_BOTCOL_CLASS")
	// @Column(name="BOTCOL_CLASS_ID")
	public BottleColor getProductBottleColor() {
		return productBottleColor;
	}

	public void setProductBottleColor(BottleColor productBottleColor) {
		this.productBottleColor = productBottleColor;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "CRKMAT_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_CRKMAT_CLASS")
	// @Column(name="CRKMAT_CLASS_ID")
	public CorkMaterial getProductCorkMaterial() {
		return productCorkMaterial;
	}

	public void setProductCorkMaterial(CorkMaterial productCorkMaterial) {
		this.productCorkMaterial = productCorkMaterial;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "CRKCOL_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_CRKCOL_CLASS")
	// @Column(name="CRKCOL_CLASS_ID")
	public CorkColor getProductCorkColor() {
		return productCorkColor;
	}

	public void setProductCorkColor(CorkColor productCorkColor) {
		this.productCorkColor = productCorkColor;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "CRKSHAPE_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_CRKSHAPE_CLASS")
	// @Column(name="CRKSHAPE_CLASS_ID")
	public CorkShape getProductCorkShape() {
		return productCorkShape;
	}

	public void setProductCorkShape(CorkShape productCorkShape) {
		this.productCorkShape = productCorkShape;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "STOCKCOL_CLASS_ID")
	// @ForeignKey(name="FK_PRODUCT_STOCKCOL_CLASS")
	// @Column(name="STOCKCOL_CLASS_ID")
	public StockingColor getProductStockingColor() {
		return productStockingColor;
	}

	public void setProductStockingColor(StockingColor productStockingColor) {
		this.productStockingColor = productStockingColor;
	}

	@Column(name = "PRODUCT_HAS_FRONT_LABEL")
	public Boolean getProductHasFrontLabel() {
		return productHasFrontLabel;
	}

	public void setProductHasFrontLabel(Boolean productHasFrontLabel) {
		this.productHasFrontLabel = productHasFrontLabel;
	}

	@Column(name = "PRODUCT_HAS_REAR_LABEL")
	public Boolean getProductHasRearLabel() {
		return productHasRearLabel;
	}

	public void setProductHasRearLabel(Boolean productHasRearLabel) {
		this.productHasRearLabel = productHasRearLabel;
	}

	@Column(name = "PRODUCT_HAS_NECK_LABEL")
	public Boolean getProductHasNeckLabel() {
		return productHasNeckLabel;
	}

	public void setProductHasNeckLabel(Boolean productHasNeckLabel) {
		this.productHasNeckLabel = productHasNeckLabel;
	}

	@Column(name = "PRODUCT_HAS_OTHER_LABEL")
	public Boolean getProductHasOtherLabel() {
		return productHasOtherLabel;
	}

	public void setProductHasOtherLabel(Boolean productHasOtherLabel) {
		this.productHasOtherLabel = productHasOtherLabel;
	}

	@Id
	@Column(name = "PRODUCER_ID")
	public Long getProducerId() {
		return producerId;
	}

	public void setProducerId(Long id) {
		this.producerId = id;
	}

	@Column(name = "PRODUCER_NAME")
	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "PROD_COUNTRY_CLASS_ID")
	// @ForeignKey(name="FK_COUNTRY_CLASS")
	// @Column(name="PROD_COUNTRY_CLASS_ID")
	public Country getProducerCountry() {
		return producerCountry;
	}

	public void setProducerCountry(Country producerCountry) {
		this.producerCountry = producerCountry;
	}

	@Id
	@Column(name = "APPLICATION_ID")
	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long id) {
		this.applicationId = id;
	}

	@Column(name = "APPLICATION_NR")
	public String getApplicationNr() {
		return applicationNr;
	}

	public void setApplicationNr(String applicationNr) {
		this.applicationNr = applicationNr;
	}

	@Column(name = "APPLICATION_ARRIVED")
	public Date getApplicationArrived() {
		return applicationArrived;
	}

	public void setApplicationArrived(Date applicationArrived) {
		this.applicationArrived = applicationArrived;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "APPL_STATE_CLASS_ID")
	// @ForeignKey(name="FK_APPL_APPL_STATE_CLASS")
	// @Column(name="APPL_STATE_CLASS_ID")
	public ApplicationState getApplicationState() {
		return applicationState;
	}

	public void setApplicationState(ApplicationState applicationState) {
		this.applicationState = applicationState;
	}

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "ENTRY_DEC_CLASS_ID")
	// @ForeignKey(name="FK_ENTRY_DEC_CLASS")
	// @Column(name="ENTRY_DEC_CLASS_ID")
	public RegistryEntryDecisionType getApplicationDecisionType() {
		return applicationDecisionType;
	}

	public void setApplicationDecisionType(RegistryEntryDecisionType applicationDecisionType) {
		this.applicationDecisionType = applicationDecisionType;
	}

	@Column(name = "APPLICATION_DECISION_DATE")
	public Date getApplicationDecisionDate() {
		return applicationDecisionDate;
	}

	public void setApplicationDecisionDate(Date applicationDecisionDate) {
		this.applicationDecisionDate = applicationDecisionDate;
	}

	@Column(name = "application_decision_explanation")
	public String getDeregisterDecision() {
		return deregisterDecision;
	}

	public void setDeregisterDecision(String expl) {
		this.deregisterDecision = expl;
	}

	@Id
	@Column(name = "APPLICANT_ID")
	public Long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	@Column(name = "APPLICANT_NAME")
	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	@Column(name = "APPLICANT_REGNR")
	public String getApplicantRegNr() {
		return applicantRegNr;
	}

	public void setApplicantRegNr(String applicantRegNr) {
		this.applicantRegNr = applicantRegNr;
	}

	@Column(name = "APPLICANT_MTR_CODE")
	public String getApplicantMtrCode() {
		return applicantMtrCode;
	}

	public void setApplicantMtrCode(String applicantMtrCode) {
		this.applicantMtrCode = applicantMtrCode;
	}

	@Column(name = "APPLICANT_EXCISE_STORE_HOUSE_NR")
	public String getApplicantExciseStoreHouseNr() {
		return applicantExciseStoreHouseNr;
	}

	public void setApplicantExciseStoreHouseNr(String applicantExciseStoreHouseNr) {
		this.applicantExciseStoreHouseNr = applicantExciseStoreHouseNr;
	}

	@Column(name = "APPLICANT_ACKNOWLEDGEMENT_NR")
	public String getApplicantAcknowledgementNr() {
		return applicantAcknowledgementNr;
	}

	public void setApplicantAcknowledgementNr(String applicantAcknowledgementNr) {
		this.applicantAcknowledgementNr = applicantAcknowledgementNr;
	}

	@Column(name = "APPLICANT_ACKNOWLEDGEMENT_DATE")
	public Date getApplicantAcknowledgementDate() {
		return applicantAcknowledgementDate;
	}

	public void setApplicantAcknowledgementDate(Date applicantAcknowledgementDate) {
		this.applicantAcknowledgementDate = applicantAcknowledgementDate;
	}

	@Column(name = "REGISTRY_ENTRY_NR")
	public String getRegistryEntryNr() {
		return registryEntryNr;
	}

	public void setRegistryEntryNr(String registryEntryNr) {
		this.registryEntryNr = registryEntryNr;
	}

	@Column(name = "REGISTRY_ENTRY_VALID_FROM")
	public Date getRegistryEntryValidFrom() {
		return registryEntryValidFrom;
	}

	public void setRegistryEntryValidFrom(Date registryEntryValidFrom) {
		this.registryEntryValidFrom = registryEntryValidFrom;
	}

	@Column(name = "REGISTRY_ENTRY_VALID_UNTIL")
	public Date getRegistryEntryValidUntil() {
		return registryEntryValidUntil;
	}

	public void setRegistryEntryValidUntil(Date registryEntryValidUntil) {
		this.registryEntryValidUntil = registryEntryValidUntil;
	}

	@Id
	@Column(name = "MARKETER_ID")
	public Long getMarketerId() {
		return marketerId;
	}

	public void setMarketerId(Long marketerId) {
		this.marketerId = marketerId;
	}

	@Column(name = "MARKETER_NAME")
	public String getMarketerName() {
		return marketerName;
	}

	public void setMarketerName(String marketerName) {
		this.marketerName = marketerName;
	}

	@Id
	@Column(name = "IMPORTER_ID")
	public Long getImporterId() {
		return importerId;
	}

	public void setImporterId(Long importerId) {
		this.importerId = importerId;
	}

	@Column(name = "IMPORTER_NAME")
	public String getImporterName() {
		return importerName;
	}

	public void setImporterName(String importerName) {
		this.importerName = importerName;
	}

	@Id
	@Column(name = "PACKAGER_ID")
	public Long getPackagerId() {
		return packagerId;
	}

	public void setPackagerId(Long packagerId) {
		this.packagerId = packagerId;
	}

	@Column(name = "PACKAGER_NAME")
	public String getPackagerName() {
		return packagerName;
	}

	public void setPackagerName(String packagerName) {
		this.packagerName = packagerName;
	}

	@Column(name = "application_examples_nr")
	public Long getProductExamplesCount() {
		return productExamplesCount;
	}

	public void setProductExamplesCount(Long productExamplesCount) {
		this.productExamplesCount = productExamplesCount;
	}

	@Column(name = "notes")
	public String getProductNotes() {
		return productNotes;
	}

	public void setProductNotes(String productNotes) {
		this.productNotes = productNotes;
	}

	@Column(name = "processor_id")
	public Long getProcessorId() {
		return processorId;
	}

	public void setProcessorId(Long processorId) {
		this.processorId = processorId;
	}

	@Column(name = "processor_forname")
	public String getProcessorForName() {
		return processorForName;
	}

	public void setProcessorForName(String processorForName) {
		this.processorForName = processorForName;
	}

	@Column(name = "processor_lastname")
	public String getProcessorLastName() {
		return processorLastName;
	}

	public void setProcessorLastName(String processorLastName) {
		this.processorLastName = processorLastName;
	}

}