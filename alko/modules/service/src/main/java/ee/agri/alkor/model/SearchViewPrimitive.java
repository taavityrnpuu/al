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
@Table(name = "SEARCHVIEW_PRIMITIVE")
public class SearchViewPrimitive implements IClassificatorAware {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Long productId;

	private String productName;

	private String productTypeCode;
	private String productTypeName;

	private String productKnCode;

	private BigDecimal productEthanolRate;

	private String productVolumeCode;
	private String productVolumeName;

	private String productOriginCountryCode;
	private String productOriginCountryName;

	private Boolean productHasStocking;

	private String productPackingMaterialCode;
	private String productPackingMaterialName;

	private String productBottleShapeCode;
	private String productBottleShapeName;

	private Integer productNumberOfLabels;

	private String productBottleColorCode;
	private String productBottleColorName;

	private String productCorkMaterialCode;
	private String productCorkMaterialName;

	private String productCorkColorCode;
	private String productCorkColorName;

	private String productCorkShapeCode;
	private String productCorkShapeName;

	private String productStockingColorCode;
	private String productStockingColorName;

	private Boolean productHasFrontLabel;

	private Boolean productHasRearLabel;

	private Boolean productHasNeckLabel;

	private Boolean productHasOtherLabel;

	private String productNotes;

	private Long producerId;

	private String producerName;

	private String producerCountryCode;
	private String producerCountryName;

	private Long applicationId;

	private String applicationNr;

	private Date applicationArrived;

	private String applicationStateCode;
	private String applicationStateName;

	private String applicationDecisionTypeCode;
	private String applicationDecisionTypeName;

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

	@Column(name="PROD_CLASS_CODE")
	public String getProductTypeCode() {
		return productTypeCode;
	}

	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	@Column(name="PROD_CLASS_NAME")
	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	@Column(name = "PRODUCT_ETHANOL_RATE")
	public BigDecimal getProductEthanolRate() {
		return productEthanolRate;
	}

	public void setProductEthanolRate(BigDecimal productEthanolRate) {
		this.productEthanolRate = productEthanolRate;
	}

	@Column(name="CAPACITY_CLASS_CODE")
	public String getProductVolumeCode() {
		return productVolumeCode;
	}

	public void setProductVolumeCode(String productVolumeCode) {
		this.productVolumeCode = productVolumeCode;
	}

	@Column(name="CAPACITY_CLASS_NAME")
	public String getProductVolumeName() {
		return productVolumeName;
	}

	public void setProductVolumeName(String productVolumeName) {
		this.productVolumeName = productVolumeName;
	}

	@Column(name="ORG_COUNTRY_CLASS_CODE")
	public String getProductOriginCountryCode() {
		return productOriginCountryCode;
	}

	public void setProductOriginCountryCode(String productOriginCountryCode) {
		this.productOriginCountryCode = productOriginCountryCode;
	}

	@Column(name="ORG_COUNTRY_CLASS_NAME")
	public String getProductOriginCountryName() {
		return productOriginCountryName;
	}

	public void setProductOriginCountryName(String productOriginCountryName) {
		this.productOriginCountryName = productOriginCountryName;
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

	@Column(name="PACKMAT_CLASS_CODE")
	public String getProductPackingMaterialCode() {
		return productPackingMaterialCode;
	}

	public void setProductPackingMaterialCode(String productPackingMaterialCode) {
		this.productPackingMaterialCode = productPackingMaterialCode;
	}

	@Column(name="PACKMAT_CLASS_NAME")
	public String getProductPackingMaterialName() {
		return productPackingMaterialName;
	}

	public void setProductPackingMaterialName(String productPackingMaterialName) {
		this.productPackingMaterialName = productPackingMaterialName;
	}

	@Column(name="BOTSHAPE_CLASS_CODE")
	public String getProductBottleShapeCode() {
		return productBottleShapeCode;
	}

	public void setProductBottleShapeCode(String productBottleShapeCode) {
		this.productBottleShapeCode = productBottleShapeCode;
	}

	@Column(name="BOTSHAPE_CLASS_NAME")
	public String getProductBottleShapeName() {
		return productBottleShapeName;
	}

	public void setProductBottleShapeName(String productBottleShapeName) {
		this.productBottleShapeName = productBottleShapeName;
	}

	@Column(name = "PRODUCT_NUMBER_OF_LABELS")
	public Integer getProductNumberOfLabels() {
		return productNumberOfLabels;
	}

	public void setProductNumberOfLabels(Integer productNumberOfLabels) {
		this.productNumberOfLabels = productNumberOfLabels;
	}

	@Column(name="BOTCOL_CLASS_CODE")
	public String getProductBottleColorCode() {
		return productBottleColorCode;
	}

	public void setProductBottleColorCode(String productBottleColorCode) {
		this.productBottleColorCode = productBottleColorCode;
	}

	@Column(name="BOTCOL_CLASS_NAME")
	public String getProductBottleColorName() {
		return productBottleColorName;
	}

	public void setProductBottleColorName(String productBottleColorName) {
		this.productBottleColorName = productBottleColorName;
	}

	@Column(name="CRKMAT_CLASS_CODE")
	public String getProductCorkMaterialCode() {
		return productCorkMaterialCode;
	}

	public void setProductCorkMaterialCode(String productCorkMaterialCode) {
		this.productCorkMaterialCode = productCorkMaterialCode;
	}

	@Column(name="CRKMAT_CLASS_NAME")
	public String getProductCorkMaterialName() {
		return productCorkMaterialName;
	}

	public void setProductCorkMaterialName(String productCorkMaterialName) {
		this.productCorkMaterialName = productCorkMaterialName;
	}

	@Column(name="CRKCOL_CLASS_CODE")
	public String getProductCorkColorCode() {
		return productCorkColorCode;
	}

	public void setProductCorkColorCode(String productCorkColorCode) {
		this.productCorkColorCode = productCorkColorCode;
	}

	@Column(name="CRKCOL_CLASS_NAME")
	public String getProductCorkColorName() {
		return productCorkColorName;
	}

	public void setProductCorkColorName(String productCorkColorName) {
		this.productCorkColorName = productCorkColorName;
	}

	@Column(name="CRKSHAPE_CLASS_CODE")
	public String getProductCorkShapeCode() {
		return productCorkShapeCode;
	}

	public void setProductCorkShapeCode(String productCorkShapeCode) {
		this.productCorkShapeCode = productCorkShapeCode;
	}

	@Column(name="CRKSHAPE_CLASS_NAME")
	public String getProductCorkShapeName() {
		return productCorkShapeName;
	}

	public void setProductCorkShapeName(String productCorkShapeName) {
		this.productCorkShapeName = productCorkShapeName;
	}

	@Column(name="STOCKCOL_CLASS_CODE")
	public String getProductStockingColorCode() {
		return productStockingColorCode;
	}

	public void setProductStockingColorCode(String productStockingColorCode) {
		this.productStockingColorCode = productStockingColorCode;
	}

	@Column(name="STOCKCOL_CLASS_NAME")
	public String getProductStockingColorName() {
		return productStockingColorName;
	}

	public void setProductStockingColorName(String productStockingColorName) {
		this.productStockingColorName = productStockingColorName;
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

	@Column(name="PROD_COUNTRY_CLASS_CODE")
	public String getProducerCountryCode() {
		return producerCountryCode;
	}

	public void setProducerCountryCode(String producerCountryCode) {
		this.producerCountryCode = producerCountryCode;
	}

	@Column(name="PROD_COUNTRY_CLASS_NAME")
	public String getProducerCountryName() {
		return producerCountryName;
	}

	public void setProducerCountryName(String producerCountryName) {
		this.producerCountryName = producerCountryName;
	}

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

	@Column(name="APPL_STATE_CLASS_CODE")
	public String getApplicationStateCode() {
		return applicationStateCode;
	}

	public void setApplicationStateCode(String applicationStateCode) {
		this.applicationStateCode = applicationStateCode;
	}

	@Column(name="APPL_STATE_CLASS_NAME")
	public String getApplicationStateName() {
		return applicationStateName;
	}

	public void setApplicationStateName(String applicationStateName) {
		this.applicationStateName = applicationStateName;
	}
	
	@Column(name="ENTRY_DEC_CLASS_CODE")
	public String getApplicationDecisionTypeCode() {
		return applicationDecisionTypeCode;
	}

	public void setApplicationDecisionTypeCode(String applicationDecisionTypeCode) {
		this.applicationDecisionTypeCode = applicationDecisionTypeCode;
	}

	@Column(name="ENTRY_DEC_CLASS_NAME")
	public String getApplicationDecisionTypeName() {
		return applicationDecisionTypeName;
	}

	public void setApplicationDecisionTypeName(String applicationDecisionTypeName) {
		this.applicationDecisionTypeName = applicationDecisionTypeName;
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
	
	@Id
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}