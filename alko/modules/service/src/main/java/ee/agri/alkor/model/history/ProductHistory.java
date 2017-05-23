/**
 *
 */
package ee.agri.alkor.model.history;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;

/**
 * Product History
 * @author kaupo
 *
 */
@Entity
@javax.persistence.SequenceGenerator(name = "PRODUCT_HIST_SEQ", sequenceName = "PRODUCT_HIST_SEQ", allocationSize=1)
@Table(name = "PRODUCT_HISTORY")
public class ProductHistory extends ABaseBean implements IHistoryEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = -942412103412779727L;

	private Long histId;

    /**
     * The id of the entity.
     */
    private Long id;

	/**
	 * Toote kood.
	 */
	private String code;
	/**
	 * Toote nimetus.
	 */
	private String name;
	/**
	 * Toote liik.
	 */
	private String type; //ProductType
	/**
	 * Tootja.
	 */
	private Long producer; //Enterprise
	/**
	 * Pakendaja.
	 */
	private Long importer; //Enterprise
	/**
	 * Turustaja.
	 */
	private Long packager; //Enterprise

	/**
	 * Turustaja.
	 */
	private Long marketer; //Enterprise
	/**
	 * Päritolumaa.
	 */
	private String originCountry; //Country
	/**
	 * Tarbijapakendi või pakendi maht mõõtühikutes (cl).
	 * Pakendi korral märge lahtine.
	 */
	private String packingVolume;
	/**
	 * Alkohoolse joogi etanoolisisaldus %-des.
	 */
	private BigDecimal ethanolRate;
	/**
	 * Tarbijapakendi või pakendi materjal.
	 */
	private String packingMaterial; //PackingMaterial
	/**
	 * Tarbijapakendi või pakendi etikettide arv.
	 */
	private Integer numberOfLabels;
	/**
	 * Pudeli kuju klassifikaatorid (portvein, burgundia,
	 * saksa veini pudel jne.)
	 */
	private String bottleShape; //BottleShape
	/**
	 * Pudeli värvuse klassifikaatorid
	 * (roheline, valge jne.)
	 */
	private String bottleColor; //BottleColor
	/**
	 * Korgi materjalide klassifikaatorid.
	 */
	private String corkMaterial; //CorkMaterial
	/**
	 * Korgi värvuste klassifikaatorid.
	 */
	private String corkColor; //CorkColor
	/**
	 * Korgi kuju klassifikaatorid.
	 */
	private String corkShape; //CorkShape
	/**
	 * Märge suka olemasolu kohta (jah/ei).
	 */
	private Boolean hasStocking;
	/**
	 * Suka värvuste klassifikaatorid.
	 */
	private String stockingColor; //StockingColor
	/**
	 * Märge esietiketi olemasolu kohta.
	 */
	private Boolean hasFrontLabel;

	/**
	 * Märge tagaetiketi olemasolu kohta.
	 */
	private Boolean hasRearLabel;

	/**
	 * Märge kaelaetiketi olemasolu kohta.
	 */
	private Boolean hasNeckLabel;
	/**
	 * Märge muu etiketi olemasolu kohta.
	 */
	private Boolean hasOtherLabel;
	/**
	 * Andmete muutmise põhjus.
	 */
	private String notes;

	private Long application;


	/* (non-Javadoc)
	 * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_HIST_SEQ")
	public Long getHistId() {
		return histId;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.model.history.IHistoryEntity#setHistId(java.lang.Long)
	 */
	public void setHistId(Long histId) {
		this.histId = histId;
	}

    /**
     * Getter for id.
     * @return id
     *
     */
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
	 * @hibernate.property  column="CODE" length="10"
	 * @return String
	 */

    @Column(name="CODE", length=12)
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @hibernate.property  column="NAME" length="128"
	 * @return String
	 */
    @Column(name="NAME", length=256)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *
	 * @return ProductType
	 *
	 */
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Column(name="PRODUCER_SUBJ_ID")
	public Long getProducer() {
		return producer;
	}

	public void setProducer(Long producer) {
		this.producer = producer;
	}

	@Column(name="IMPORTER_SUBJ_ID")
	public Long getImporter() {
		return importer;
	}

	public void setImporter(Long importer) {
		this.importer = importer;
	}

	@Column(name="PACKAGER_SUBJ_ID")
	public Long getPackager() {
		return packager;
	}

	public void setPackager(Long packager) {
		this.packager = packager;
	}

	@Column(name="MARKETER_SUBJ_ID")
	public Long getMarketer() {
		return marketer;
	}

	public void setMarketer(Long marketer) {
		this.marketer = marketer;
	}

	public String getBottleColor() {
		return bottleColor;
	}

	public void setBottleColor(String bottleColor) {
		this.bottleColor = bottleColor;
	}

	public String getBottleShape() {
		return bottleShape;
	}

	public void setBottleShape(String bottleShape) {
		this.bottleShape = bottleShape;
	}

	public String getCorkColor() {
		return corkColor;
	}

	public void setCorkColor(String corkColor) {
		this.corkColor = corkColor;
	}

	public String getCorkMaterial() {
		return corkMaterial;
	}

	public void setCorkMaterial(String corkMaterial) {
		this.corkMaterial = corkMaterial;
	}

	public String getCorkShape() {
		return corkShape;
	}

	public void setCorkShape(String corkShape) {
		this.corkShape = corkShape;
	}
    @Column(name="NOTES", length=2500)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String dataModificationReason) {
		this.notes = dataModificationReason;
	}

	@Column(name="ETHANOL_RATE")
	public BigDecimal getEthanolRate() {
		return ethanolRate;
	}

	public void setEthanolRate(BigDecimal ethanolRate) {
		this.ethanolRate = ethanolRate;
	}

	@Column(name="FRONT_LABEL")
	public Boolean getHasFrontLabel() {
		return hasFrontLabel;
	}

	public void setHasFrontLabel(Boolean hasFrontLabel) {
		this.hasFrontLabel = hasFrontLabel;
	}

	@Column(name="REAR_LABEL")
	public Boolean getHasRearLabel() {
		return hasRearLabel;
	}

	public void setHasRearLabel(Boolean hasRearLabel) {
		this.hasRearLabel = hasRearLabel;
	}

	@Column(name="NECK_LABEL")
	public Boolean getHasNeckLabel() {
		return hasNeckLabel;
	}

	public void setHasNeckLabel(Boolean hasNeckLabel) {
		this.hasNeckLabel = hasNeckLabel;
	}

	@Column(name="OTHER_LABEL")
	public Boolean getHasOtherLabel() {
		return hasOtherLabel;
	}

	public void setHasOtherLabel(Boolean hasOtherLabel) {
		this.hasOtherLabel = hasOtherLabel;
	}

	@Column(name="STOCKING")
	public Boolean getHasStocking() {
		return hasStocking;
	}

	public void setHasStocking(Boolean hasStocking) {
		this.hasStocking = hasStocking;
	}

	public String getStockingColor() {
		return stockingColor;
	}

	public void setStockingColor(String stockingColor) {
		this.stockingColor = stockingColor;
	}


	@Column(name="LABELS_NO")
	public Integer getNumberOfLabels() {
		return numberOfLabels;
	}

	public void setNumberOfLabels(Integer numberOfLabels) {
		this.numberOfLabels = numberOfLabels;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public String getPackingMaterial() {
		return packingMaterial;
	}

	public void setPackingMaterial(String packingMaterial) {
		this.packingMaterial = packingMaterial;
	}
	@Column(name="PACK_VOL")
	public String getPackingVolume() {
		return packingVolume;
	}

	public void setPackingVolume(String packingVolume) {
		this.packingVolume = packingVolume;
	}

	@Column(name="APPLICATION")
	public Long getApplication() {
		return this.application;
	}

	public void setApplication(Long application) {
		this.application = application;
	}

}
