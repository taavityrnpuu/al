package ee.agri.alkor.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_PRIMITIVE")
public class ProductPrimitive implements IClassificatorAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String code;
	private String name;
	private Boolean stocking;
	private Boolean front_label;
	private Boolean rear_label;
	private Boolean neck_label;
	private Boolean other_label;
	private String notes;
	private Integer labelno;
	private BigDecimal ethanolrate;
	private Date created;

	@Id
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long aId) {
		this.id = aId;
	}

	@Column(name = "CODE")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "NOTES")
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "FRONT_LABEL")
	public Boolean getFront_label() {
		return front_label;
	}

	public void setFront_label(Boolean hasFrontLabel) {
		this.front_label = hasFrontLabel;
	}

	@Column(name = "REAR_LABEL")
	public Boolean getRear_label() {
		return rear_label;
	}

	public void setRear_label(Boolean hasRearLabel) {
		this.rear_label = hasRearLabel;
	}

	@Column(name = "NECK_LABEL")
	public Boolean getNeck_label() {
		return neck_label;
	}

	public void setNeck_label(Boolean hasNeckLabel) {
		this.neck_label = hasNeckLabel;
	}

	@Column(name = "OTHER_LABEL")
	public Boolean getOther_label() {
		return other_label;
	}

	public void setOther_label(Boolean hasOtherLabel) {
		this.other_label = hasOtherLabel;
	}

	@Column(name = "STOCKING")
	public Boolean getStocking() {
		return stocking;
	}

	public void setStocking(Boolean hastocking) {
		this.stocking = hastocking;
	}

	@Column(name = "LABELNO")
	public Integer getLabelno() {
		return labelno;
	}

	public void setLabelno(Integer numberOfLabels) {
		this.labelno = numberOfLabels;
	}

	@Column(name = "ETHANOLRATE")
	public BigDecimal getEthanolrate() {
		if(ethanolrate != null) {
			ethanolrate.setScale(2,BigDecimal.ROUND_DOWN);
		}
		return ethanolrate;
	}

	public void setEthanolrate(BigDecimal ethanolRate) {
		if (ethanolRate != null) {
			this.ethanolrate = ethanolRate.setScale(2, BigDecimal.ROUND_DOWN);
		} else {
			this.ethanolrate = ethanolRate;
		}
	}
	
	@Column(name = "CREATED")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	// private ProductType type;
	private Long typeId;
	private String type_caname;
	private String type_code;
	private String type_name;

	@Column(name = "TYPE_ID")
	public Long getType_id() {
		return typeId;
	}

	public void setType_id(Long typeId) {
		this.typeId = typeId;
	}

	@Column(name = "TYPE_CAT_NAME")
	public String getType_caname() {
		return type_caname;
	}

	public void setType_caname(String typeCategoryName) {
		this.type_caname = typeCategoryName;
	}

	@Column(name = "TYPE_CODE")
	public String getType_code() {
		return type_code;
	}

	public void setType_code(String typeCode) {
		this.type_code = typeCode;
	}

	@Column(name = "TYPE_NAME")
	public String getType_name() {
		return type_name;
	}

	public void setType_name(String typeName) {
		this.type_name = typeName;
	}

	// private Enterprise producer;
	private String producer_name;
	private String producer_registration_id;
	private String producer_address_country_code;
	private String producer_address_country_name;

	@Column(name = "PRODUCER_NAME")
	public String getProducer_name() {
		return producer_name;
	}

	public void setProducer_name(String producerName) {
		this.producer_name = producerName;
	}

	@Column(name = "PRODUCER_REG_ID")
	public String getProducer_registration_id() {
		return producer_registration_id;
	}

	public void setProducer_registration_id(String producerRegistrationId) {
		this.producer_registration_id = producerRegistrationId;
	}
	
	@Column(name = "PRODUCER_ADDRESS_COUNTRY_CODE")
	public String getProducer_address_country_code() {
		return producer_address_country_code;
	}

	public void setProducer_address_country_code(String producerAddressCountryCode) {
		this.producer_address_country_code = producerAddressCountryCode;
	}
	
	@Column(name = "PRODUCER_ADDRESS_COUNTRY_NAME")
	public String getProducer_address_country_name() {
		return producer_address_country_name;
	}

	public void setProducer_address_country_name(String producerAddressCountryCode) {
		this.producer_address_country_name = producerAddressCountryCode;
	}

	// private Enterprise importer;
	private String importer_name;
	private String importer_registration_id;

	@Column(name = "IMPORTER_NAME")
	public String getImporter_name() {
		return importer_name;
	}

	public void setImporter_name(String importerName) {
		this.importer_name = importerName;
	}

	@Column(name = "IMPORTER_REG_ID")
	public String getImporter_registration_id() {
		return importer_registration_id;
	}

	public void setImporter_registration_id(String importerRegistrationId) {
		this.importer_registration_id = importerRegistrationId;
	}

	// private Enterprise marketer;
	private String marketer_name;
	private String marketer_reg_id;

	@Column(name = "MARKETER_NAME")
	public String getMarketer_name() {
		return marketer_name;
	}

	public void setMarketer_name(String marketerName) {
		this.marketer_name = marketerName;
	}

	@Column(name = "MARKETER_REG_ID")
	public String getMarketer_reg_id() {
		return marketer_reg_id;
	}

	public void setMarketer_reg_id(String marketerRegistrationId) {
		this.marketer_reg_id = marketerRegistrationId;
	}

	// private Enterprise packager;
	private String packager_name;
	private String packager_reg_id;

	@Column(name = "PACKAGER_NAME")
	public String getPackager_name() {
		return packager_name;
	}

	public void setPackager_name(String packagerName) {
		this.packager_name = packagerName;
	}

	@Column(name = "PACKAGER_REG_ID")
	public String getPackager_reg_id() {
		return packager_reg_id;
	}

	public void setPackager_reg_id(String packagerRegistrationId) {
		this.packager_reg_id = packagerRegistrationId;
	}

	// private Country originCountry;
	private Long origincountry_id;
	private String origincountry_caname;
	private String origincountry_code;
	private String origincountry_name;

	@Column(name = "ORIGINCOUNTRY_ID")
	public Long getOrigincountry_id() {
		return origincountry_id;
	}

	public void setOrigincountry_id(Long originCountryId) {
		this.origincountry_id = originCountryId;
	}

	@Column(name = "ORIGINCOUNTRY_CAT_NAME")
	public String getOrigincountry_caname() {
		return origincountry_caname;
	}

	public void setOrigincountry_caname(String originCountryCategoryName) {
		this.origincountry_caname = originCountryCategoryName;
	}

	@Column(name = "ORIGINCOUNTRY_CODE")
	public String getOrigincountry_code() {
		return origincountry_code;
	}

	public void setOrigincountry_code(String originCountryCode) {
		this.origincountry_code = originCountryCode;
	}

	@Column(name = "ORIGINCOUNTRY_NAME")
	public String getOrigincountry_name() {
		return origincountry_name;
	}

	public void setOrigincountry_name(String originCountryName) {
		this.origincountry_name = originCountryName;
	}

	// private Capacity sackingVolume;
	private Long packingvolume_Id;
	private String packingvolume_caname;
	private String packingvolume_code;
	private String packingvolume_name;

	@Column(name = "PACKINGVOLUME_ID")
	public Long getPackingvolume_Id() {
		return packingvolume_Id;
	}

	public void setPackingvolume_Id(Long packingVolumeId) {
		this.packingvolume_Id = packingVolumeId;
	}

	@Column(name = "PACKINGVOLUME_CAT_NAME")
	public String getPackingvolume_caname() {
		return packingvolume_caname;
	}

	public void setPackingvolume_caname(String packingVolumeCategoryName) {
		this.packingvolume_caname = packingVolumeCategoryName;
	}

	@Column(name = "PACKINGVOLUME_CODE")
	public String getPackingvolume_code() {
		return packingvolume_code;
	}

	public void setPackingvolume_code(String packingVolumeCode) {
		this.packingvolume_code = packingVolumeCode;
	}

	@Column(name = "PACKINGVOLUME_NAME")
	public String getPackingvolume_name() {
		return packingvolume_name;
	}

	public void setPackingvolume_name(String packingVolumeName) {
		this.packingvolume_name = packingVolumeName;
	}

	// private PackingMaterial sackingMaterial;
	private Long packingmaterial_id;
	private String packingmaterial_caname;
	private String packingmaterial_code;
	private String packingmaterial_name;

	@Column(name = "PACKINGMATERIAL_ID")
	public Long getPackingmaterial_id() {
		return packingmaterial_id;
	}

	public void setPackingmaterial_id(Long packingMaterialId) {
		this.packingmaterial_id = packingMaterialId;
	}

	@Column(name = "PACKINGMATERIAL_CAT_NAME")
	public String getPackingmaterial_caname() {
		return packingmaterial_caname;
	}

	public void setPackingmaterial_caname(String packingMaterialCategoryName) {
		this.packingmaterial_caname = packingMaterialCategoryName;
	}

	@Column(name = "PACKINGMATERIAL_CODE")
	public String getPackingmaterial_code() {
		return packingmaterial_code;
	}

	public void setPackingmaterial_code(String packingMaterialCode) {
		this.packingmaterial_code = packingMaterialCode;
	}

	@Column(name = "PACKINGMATERIAL_NAME")
	public String getPackingmaterial_name() {
		return packingmaterial_name;
	}

	public void setPackingmaterial_name(String packingMaterialName) {
		this.packingmaterial_name = packingMaterialName;
	}

	// private BottleShape bottleShape;
	private Long bottleshape_id;
	private String bottleshape_caname;
	private String bottleshape_code;
	private String bottleshape_name;

	@Column(name = "BOTTLESHAPE_ID")
	public Long getBottleshape_id() {
		return bottleshape_id;
	}

	public void setBottleshape_id(Long bottleShapeId) {
		this.bottleshape_id = bottleShapeId;
	}

	@Column(name = "BOTTLESHAPE_CAT_NAME")
	public String getBottleshape_caname() {
		return bottleshape_caname;
	}

	public void setBottleshape_caname(String bottleShapeCategoryName) {
		this.bottleshape_caname = bottleShapeCategoryName;
	}

	@Column(name = "BOTTLESHAPE_CODE")
	public String getBottleshape_code() {
		return bottleshape_code;
	}

	public void setBottleshape_code(String bottleShapeCode) {
		this.bottleshape_code = bottleShapeCode;
	}

	@Column(name = "BOTTLESHAPE_NAME")
	public String getBottleshape_name() {
		return bottleshape_name;
	}

	public void setBottleshape_name(String bottleShapeName) {
		this.bottleshape_name = bottleShapeName;
	}

	// private BottleColor bottleColor;
	private Long bottlecolor_id;
	private String bottlecolor_caname;
	private String bottlecolor_code;
	private String bottlecolor_name;

	@Column(name = "BOTTLECOLOR_ID")
	public Long getBottlecolor_id() {
		return bottlecolor_id;
	}

	public void setBottlecolor_id(Long bottleColorId) {
		this.bottlecolor_id = bottleColorId;
	}

	@Column(name = "BOTTLECOLOR_CAT_NAME")
	public String getBottlecolor_caname() {
		return bottlecolor_caname;
	}

	public void setBottlecolor_caname(String bottleColorCategoryName) {
		this.bottlecolor_caname = bottleColorCategoryName;
	}

	@Column(name = "BOTTLECOLOR_CODE")
	public String getBottlecolor_code() {
		return bottlecolor_code;
	}

	public void setBottlecolor_code(String bottleColorCode) {
		this.bottlecolor_code = bottleColorCode;
	}

	@Column(name = "BOTTLECOLOR_NAME")
	public String getBottlecolor_name() {
		return bottlecolor_name;
	}

	public void setBottlecolor_name(String bottleColorName) {
		this.bottlecolor_name = bottleColorName;
	}

	// private CorkMaterial corkMaterial;
	private Long corkmaterial_id;
	private String corkmaterial_caname;
	private String corkmaterial_code;
	private String corkmaterial_name;

	@Column(name = "CORKMATERIAL_ID")
	public Long getCorkmaterial_id() {
		return corkmaterial_id;
	}

	public void setCorkmaterial_id(Long corkMaterialId) {
		this.corkmaterial_id = corkMaterialId;
	}

	@Column(name = "CORKMATERIAL_CAT_NAME")
	public String getCorkmaterial_caname() {
		return corkmaterial_caname;
	}

	public void setCorkmaterial_caname(String corkMaterialCategoryName) {
		this.corkmaterial_caname = corkMaterialCategoryName;
	}

	@Column(name = "CORKMATERIAL_CODE")
	public String getCorkmaterial_code() {
		return corkmaterial_code;
	}

	public void setCorkmaterial_code(String corkMaterialCode) {
		this.corkmaterial_code = corkMaterialCode;
	}

	@Column(name = "CORKMATERIAL_NAME")
	public String getCorkmaterial_name() {
		return corkmaterial_name;
	}

	public void setCorkmaterial_name(String corkMaterialName) {
		this.corkmaterial_name = corkMaterialName;
	}

	// private CorkColor corkColor;
	private Long corkcolor_id;
	private String corkcolor_caname;
	private String corkcolor_code;
	private String corkcolor_name;

	@Column(name = "CORKCOLOR_ID")
	public Long getCorkcolor_id() {
		return corkcolor_id;
	}

	public void setCorkcolor_id(Long corkColorId) {
		this.corkcolor_id = corkColorId;
	}

	@Column(name = "CORKCOLOR_CAT_NAME")
	public String getCorkcolor_caname() {
		return corkcolor_caname;
	}

	public void setCorkcolor_caname(String corkColorCategoryName) {
		this.corkcolor_caname = corkColorCategoryName;
	}

	@Column(name = "CORKCOLOR_CODE")
	public String getCorkcolor_code() {
		return corkcolor_code;
	}

	public void setCorkcolor_code(String corkColorCode) {
		this.corkcolor_code = corkColorCode;
	}

	@Column(name = "CORKCOLOR_NAME")
	public String getCorkcolor_name() {
		return corkcolor_name;
	}

	public void setCorkcolor_name(String corkColorName) {
		this.corkcolor_name = corkColorName;
	}

	// private CorkShape corkShape;
	private Long corkshape_id;
	private String corkshape_caname;
	private String corkshape_code;
	private String corkshape_name;

	@Column(name = "CORKSHAPE_ID")
	public Long getCorkshape_id() {
		return corkshape_id;
	}

	public void setCorkshape_id(Long corkShapeId) {
		this.corkshape_id = corkShapeId;
	}

	@Column(name = "CORKSHAPE_CAT_NAME")
	public String getCorkshape_caname() {
		return corkshape_caname;
	}

	public void setCorkshape_caname(String corkShapeCategoryName) {
		this.corkshape_caname = corkShapeCategoryName;
	}

	@Column(name = "CORKSHAPE_CODE")
	public String getCorkshape_code() {
		return corkshape_code;
	}

	public void setCorkshape_code(String corkShapeCode) {
		this.corkshape_code = corkShapeCode;
	}

	@Column(name = "CORKSHAPE_NAME")
	public String getCorkshape_name() {
		return corkshape_name;
	}

	public void setCorkshape_name(String corkShapeName) {
		this.corkshape_name = corkShapeName;
	}

	// private StockingColor stockingColor;
	private Long stockingcolor_id;
	private String stockingcolor_caname;
	private String stockingcolor_code;
	private String stockingcolor_name;

	@Column(name = "STOCKINGCOLOR_ID")
	public Long getStockingcolor_id() {
		return stockingcolor_id;
	}

	public void setStockingcolor_id(Long stockingColorId) {
		this.stockingcolor_id = stockingColorId;
	}

	@Column(name = "STOCKINGCOLOR_CAT_NAME")
	public String getStockingcolor_caname() {
		return stockingcolor_caname;
	}

	public void setStockingcolor_caname(String stockingColorCategoryName) {
		this.stockingcolor_caname = stockingColorCategoryName;
	}

	@Column(name = "STOCKINGCOLOR_CODE")
	public String getStockingcolor_code() {
		return stockingcolor_code;
	}

	public void setStockingcolor_code(String stockingColorCode) {
		this.stockingcolor_code = stockingColorCode;
	}

	@Column(name = "STOCKINGCOLOR_NAME")
	public String getStockingcolor_name() {
		return stockingcolor_name;
	}

	public void setStockingcolor_name(String stockingColorName) {
		this.stockingcolor_name = stockingColorName;
	}

	//private RegistryApplication registryEntryApplication;
	private String registryentryapplication_nr;
	private String registryentryapplication_registryentry_changereason;
	private String registryapplication_registryentry_changereason;
	private String registryentryapplication_applicant_name;
	private String registryentryapplication_registryentry_nr;
	private Date registryentryapplication_decision_date;
	private Date registryentryapplication_registryentry_validuntil;
	
	@Column(name = "REGISTRYENTRYAPPLICATION_NR")
	public String getRegistryentryapplication_nr() {
		return registryentryapplication_nr;
	}

	public void setRegistryentryapplication_nr(String registryentryapplication_nr) {
		this.registryentryapplication_nr = registryentryapplication_nr;
	}

	@Column(name = "REGISTRYENTRYAPPLICATION_REGISTRYENTRY_CHANGEREASON")
	public String getRegistryentryapplication_registryentry_changereason() {
		return registryentryapplication_registryentry_changereason;
	}

	public void setRegistryentryapplication_registryentry_changereason(String registryEntryApplicationRegistryEntryChangeReason) {
		this.registryentryapplication_registryentry_changereason = registryEntryApplicationRegistryEntryChangeReason;
	}
	
	@Column(name = "REGISTRYAPPLICATION_REGISTRYENTRY_CHANGEREASON")
	public String getRegistryapplication_registryentry_changereason() {
		return registryapplication_registryentry_changereason;
	}

	public void setRegistryapplication_registryentry_changereason(String registryEntryApplicationRegistryEntryChangeReason) {
		this.registryapplication_registryentry_changereason = registryEntryApplicationRegistryEntryChangeReason;
	}
	
	@Column(name = "REGISTRYENTRYAPPLICATION_APPLICANT_NAME")
	public String getRegistryentryapplication_applicant_name() {
		return registryentryapplication_applicant_name;
	}

	public void setRegistryentryapplication_applicant_name(String registryentryapplication_applicant_name) {
		this.registryentryapplication_applicant_name = registryentryapplication_applicant_name;
	}
	
	@Column(name = "REGISTRYENTRYAPPLICATION_REGISTRYENTRY_NR")
	public String getRegistryentryapplication_registryentry_nr() {
		return registryentryapplication_registryentry_nr;
	}

	public void setRegistryentryapplication_registryentry_nr(String registryentryapplication_registryentry_nr) {
		this.registryentryapplication_registryentry_nr = registryentryapplication_registryentry_nr;
	}
	
	@Column(name = "REGISTRYENTRYAPPLICATION_REGISTRYENTRY_VALIDUNTIL")
	public Date getRegistryentryapplication_registryentry_validuntil() {
		return registryentryapplication_registryentry_validuntil;
	}

	public void setRegistryentryapplication_registryentry_validuntil(Date registryEntryApplicationRegistryEntryValidUntil) {
		this.registryentryapplication_registryentry_validuntil = registryEntryApplicationRegistryEntryValidUntil;
	}
	
	@Column(name = "REGISTRYENTRYAPPLICATION_DECISION_DATE")
	public Date getRegistryentryapplication_decision_date() {
		return registryentryapplication_decision_date;
	}

	public void setRegistryentryapplication_decision_date(Date registryentryapplication_decision_date) {
		this.registryentryapplication_decision_date = registryentryapplication_decision_date;
	}
	
	// 
	private String nr;
	private String applicant_name;
	private String decision_regentrydecision_code;
	private Long producid;
	private Date decision_date;

	@Column(name = "NR")
	public String getNr() {
		return nr;
	}

	public void setNr(String tNr) {
		this.nr = tNr;
	}

	@Column(name = "APPLICANT_NAME")
	public String getApplicant_name() {
		return applicant_name;
	}

	public void setApplicant_name(String tApplicantName) {
		this.applicant_name = tApplicantName;
	}

	@Column(name = "DECISION_REGENTRYDECISION_CODE")
	public String getDecision_regentrydecision_code() {
		return decision_regentrydecision_code;
	}

	public void setDecision_regentrydecision_code(String tDecisionRegentryDecisionCode) {
		this.decision_regentrydecision_code = tDecisionRegentryDecisionCode;
	}

	@Column(name = "PRODUCT_ID")
	public Long getProducid() {
		return producid;
	}

	public void setProducid(Long tProductId) {
		this.producid = tProductId;
	}

	@Column(name = "DECISION_DATE")
	public Date getDecision_date() {
		return decision_date;
	}

	public void setDecision_date(Date tDecisionDate) {
		this.decision_date = tDecisionDate;
	}
	
}
