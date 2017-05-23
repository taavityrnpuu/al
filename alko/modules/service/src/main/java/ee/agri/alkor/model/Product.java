package ee.agri.alkor.model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.Where;

import ee.agri.alkor.model.classes.BottleColor;
import ee.agri.alkor.model.classes.BottleShape;
import ee.agri.alkor.model.classes.Capacity;
import ee.agri.alkor.model.classes.CorkColor;
import ee.agri.alkor.model.classes.CorkMaterial;
import ee.agri.alkor.model.classes.CorkShape;
import ee.agri.alkor.model.classes.Country;
import ee.agri.alkor.model.classes.PackingMaterial;
import ee.agri.alkor.model.classes.ProductType;
import ee.agri.alkor.model.classes.StockingColor;
import ee.agri.alkor.model.history.IHistorical;
import ee.agri.alkor.util.DateComparator;

/**
 * @author suisalu
 *
 */
@Entity
@org.hibernate.annotations.Entity(
		selectBeforeUpdate = false,
        dynamicInsert = true, dynamicUpdate = true,
        optimisticLock = OptimisticLockType.DIRTY)
@Table(name="PRODUCT")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Product  extends ABaseBean
	implements IClassificatorAware, IHistorical {
    
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
	private ProductType type;
	/**
	 * Tootja.
	 */

	private Enterprise producer;
	/**
	 * Importija.
	 */
	private Enterprise importer;
	/**
	 * Turustaja.
	 */
	private Enterprise marketer;

	/**
	 * Pakendaja.
	 */
	private Enterprise packager;

	/**
	 * Päritolumaa.
	 */
	private Country originCountry;
	/**
	 * Tarbijapakendi või pakendi maht mõõtühikutes (cl).
	 * Pakendi korral märge lahtine.
	 */
	private Capacity packingVolume;
	/**
	 * Alkohoolse joogi etanoolisisaldus %-des.
	 */
	private BigDecimal ethanolRate;
	/**
	 * Tarbijapakendi või pakendi materjal.
	 */
	private PackingMaterial packingMaterial;
	/**
	 * Tarbijapakendi või pakendi etikettide arv.
	 */
	private Integer numberOfLabels;
	/**
	 * Pudeli kuju klassifikaatorid (portvein, burgundia,
	 * saksa veini pudel jne.)
	 */
	private BottleShape bottleShape;
	/**
	 * Pudeli värvuse klassifikaatorid
	 * (roheline, valge jne.)
	 */
	private BottleColor bottleColor;
	/**
	 * Korgi materjalide klassifikaatorid.
	 */
	private CorkMaterial corkMaterial;
	/**
	 * Korgi värvuste klassifikaatorid.
	 */
	private CorkColor corkColor;
	/**
	 * Korgi kuju klassifikaatorid.
	 */
	private CorkShape corkShape;
	/**
	 * Märge suka olemasolu kohta (jah/ei).
	 */
	private Boolean hasStocking;
	/**
	 * Suka värvuste klassifikaatorid.
	 */
	private StockingColor stockingColor;
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

	private RegistryApplication registryEntryApplication;

	//private Set<RegistryApplication> applications = new HashSet<RegistryApplication>();

	/**
     * Getter for id.
     * @return id
     *
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_SEQ")
	@javax.persistence.SequenceGenerator(
    name="PRODUCT_SEQ",
    sequenceName="PRODUCT_SEQ",
    allocationSize=50
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
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="PROD_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_CLASS")
	public ProductType getType() {
		return type;
	}
	public void setType(ProductType type) {
		this.type = type;
	}

	@ManyToOne (cascade = CascadeType.REFRESH, fetch=FetchType.EAGER)
	@JoinColumn(name="PRODUCER_SUBJ_ID")
	@ForeignKey(name="FK_PROD_PRODUCER_SUBJ")
	public Enterprise getProducer() {
		return producer;
	}

	public void setProducer(Enterprise producer) {
		this.producer = producer;
	}
	@ManyToOne (cascade = CascadeType.REFRESH, fetch=FetchType.EAGER)
	@JoinColumn(name="IMPORTER_SUBJ_ID")
	@ForeignKey(name="FK_PROD_IMPORTER_SUBJ")
	public Enterprise getImporter() {
		return importer;
	}

	public void setImporter(Enterprise importer) {
		this.importer = importer;
	}
	@ManyToOne (cascade = CascadeType.REFRESH, fetch=FetchType.EAGER)
	@JoinColumn(name="MARKETER_SUBJ_ID")
	@ForeignKey(name="FK_PROD_MARKETER_SUBJ")
	public Enterprise getMarketer() {
		return marketer;
	}

	public void setMarketer(Enterprise marketer) {
		this.marketer = marketer;
	}

	@ManyToOne (cascade = CascadeType.REFRESH, fetch=FetchType.EAGER)
	@JoinColumn(name="PACKAGER_SUBJ_ID")
	@ForeignKey(name="FK_PROD_PACKAGER_SUBJ")
	public Enterprise getPackager() {
		return packager;
	}

	public void setPackager(Enterprise packager) {
		this.packager = packager;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="BOTCOL_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_BOTCOL_CLASS")
	public BottleColor getBottleColor() {
		return bottleColor;
	}

	public void setBottleColor(BottleColor bottleColor) {
		this.bottleColor = bottleColor;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="BOTSHAPE_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_BOTSHAPE_CLASS")
	public BottleShape getBottleShape() {
		return bottleShape;
	}

	public void setBottleShape(BottleShape bottleShape) {
		this.bottleShape = bottleShape;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="CRKCOL_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_CRKCOL_CLASS")
	public CorkColor getCorkColor() {
		return corkColor;
	}

	public void setCorkColor(CorkColor corkColor) {
		this.corkColor = corkColor;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="CRKMAT_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_CRKMAT_CLASS")
	public CorkMaterial getCorkMaterial() {
		return corkMaterial;
	}

	public void setCorkMaterial(CorkMaterial corkMaterial) {
		this.corkMaterial = corkMaterial;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="CRKSHAPE_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_CRKSHAPE_CLASS")
	public CorkShape getCorkShape() {
		return corkShape;
	}

	public void setCorkShape(CorkShape corkShape) {
		this.corkShape = corkShape;
	}
    @Column(name="NOTES", length=2000)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String dataModificationReason) {
		this.notes = dataModificationReason;
	}

	@Column(name="ETHANOL_RATE", precision = 5, scale = 2)
	public BigDecimal getEthanolRate() {
		if(ethanolRate != null) {
			ethanolRate.setScale(2,BigDecimal.ROUND_DOWN);
		}
		return ethanolRate;
	}

	public void setEthanolRate(BigDecimal ethanolRate) {
		if (ethanolRate != null) {
			this.ethanolRate = ethanolRate.setScale(2, BigDecimal.ROUND_DOWN);
		} else {
			this.ethanolRate = ethanolRate;
		}
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

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="STOCKCOL_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_STOCKCOL_CLASS")
	public StockingColor getStockingColor() {
		return stockingColor;
	}

	public void setStockingColor(StockingColor stockingColor) {
		this.stockingColor = stockingColor;
	}


	@Column(name="LABELS_NO")

	public Integer getNumberOfLabels() {
		return numberOfLabels;
	}

	public void setNumberOfLabels(Integer numberOfLabels) {
		this.numberOfLabels = numberOfLabels;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="ORG_COUNTRY_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_ORG_COUNTRY_CLASS")
	public Country getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(Country originCountry) {
		this.originCountry = originCountry;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="PACKMAT_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_PACKMAT_CLASS")
	public PackingMaterial getPackingMaterial() {
		return packingMaterial;
	}

	public void setPackingMaterial(PackingMaterial packingMaterial) {
		this.packingMaterial = packingMaterial;
	}
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="CAPACITY_CLASS_ID")
	@ForeignKey(name="FK_PRODUCT_CAPACITY_CLASS")
	public Capacity getPackingVolume() {
		return packingVolume;
	}

	public void setPackingVolume(Capacity packingVolume) {
		this.packingVolume = packingVolume;
	}

//	@OneToMany(mappedBy="product")
//	public Set<RegistryApplication> getApplications() {
//		return applications;
//	}

	//	public void setApplication(Set<RegistryApplication> applications) {
	//		this.applications = applications;
	//	}

	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="APPL_ID")
	@ForeignKey(name="FK_PROD_APPL")
	public RegistryApplication getRegistryEntryApplication() {
		return registryEntryApplication;
	}

	public void setRegistryEntryApplication(RegistryApplication registryEntry) {
		this.registryEntryApplication = registryEntry;
	}
	
	/**
	 * Needed to search exluded or expired products
	 * @return
	 
	@Transient
	public String getInvalidProduct() {
		return invalidProduct;
	}

	public void setInvalidProduct(String invalidProduct) {
		this.invalidProduct = invalidProduct;
	}*/



}
