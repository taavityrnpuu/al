package ee.agri.alkor.model;

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
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ForeignKey;

import ee.agri.alkor.model.classes.DocumentType;
import ee.agri.alkor.model.classes.Language;
import ee.agri.alkor.model.history.IHistorical;

/**
 *
 *
 * @author suisalu
 *
 */
@Entity
@Table(name="REG_DOC")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class RegistryDocument extends ABaseBean
	implements IClassificatorAware, IHistorical {
    /**
     * The id of the entity.
     */
    private Long id;
    
    /**
     * public
     */
    
    private Short pub;
    
  	/**
	 * Dokumendi nimi
	 */
	private String name;
	/**
	 * Dokumendi reg. number
	 */
	private String nr;
	
	private Short archived;

	/**
	 * Dokumendi tyyp.
	 */
	private DocumentType docType;
	/**
	 * Dokumendi keel.
	 */
	private Language language;
	/**
	 * MIME document contenttype.
	 */
	private String contentType;
	/**
	 * Associated application
	 */
	private RegistryApplication application;
	/**
	 * Viide Failisüsteemis olevale failile.
	 */
	private String path;
	/**
	 * Dokumendi saaja.
	 */
	private Person docReceiver;
	/**
	 * Dokumendi väljasaatmise kuupäev.
	 */
	private Date docSentTime;
	/**
	 * Dokumendi lisainfo.
	 */
	private String notes;

	private transient byte [] content;
	
	private String reason;

	/**
     * Getter for id.
     * @return id
     *
     */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REG_DOC_SEQ")
	@javax.persistence.SequenceGenerator(
    name="REG_DOC_SEQ",
    sequenceName="REG_DOC_SEQ",
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
	 *
	 * @return String
	 *
	 * @hibernate.property  column="NAME" length="128"
	 *
	 */
    @Column(name="NAME", length=128)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *
	 * @return String
	 *
	 * @hibernate.property  column="REASON"
	 *
	 */
   @Column(name="REASON")
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 *
	 * @return String
	 *
	 */
    @Column(name="NR", length=32)
	public String getNr() {
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
    /**
	 *
	 * @return RegistryDocumentType
	 *
	 * @hibernate.many-to-one
     * 		column="APPL_ID"
	 * 		class="ee.agri.alkor.model.RegistryDocumentType"
	 * 		cascade="none"
	 *  	foreign-key="fk_doc_type"
	 *
	 */
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="DOC_CLASS_ID")
	@ForeignKey(name="FK_DOC_DOC_CLASS")
	public DocumentType getDocType() {
		return docType;
	}
	public void setDocType(DocumentType docType) {
		this.docType = docType;
	}

	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="LANG_CLASS_ID")
	@ForeignKey(name="FK_DOC_LANG_CLASS")
	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

    @Column(name="MIME", length=128)
	public String getContentType() {
		return contentType;
	}
    
    @Column(name="archived")
   	public Short getArchived() {
   		return archived;
   	}
    
	public void setArchived(Short archived) {
   		this.archived = archived;
   	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="DOC_APPL_ID")
	@ForeignKey(name="FK_DOC_APPL")
	public RegistryApplication getApplication() {
		return application;
	}

	public void setApplication(RegistryApplication application) {
		this.application = application;
	}

	@Column(name="PATH", length=128)
	public String getPath() {
		return path;
	}

	public void setPath(String docLocation) {
		this.path = docLocation;
	}
	@Column(name="public")
	public Short getPub() {
		return pub;
	}

	public void setPub(Short pub) {
		this.pub = pub;
	}	
	@ManyToOne (cascade = CascadeType.REFRESH)
	@JoinColumn(name="DOCREC_PERSON_ID")
	@ForeignKey(name="FK_DOC_DOCREC_PERSON")
	public Person getDocReceiver() {
		return docReceiver;
	}

	public void setDocReceiver(Person docReceiver) {
		this.docReceiver = docReceiver;
	}
	@Column(name="DOC_SENT")
	public Date getDocSentTime() {
		return docSentTime;
	}

	public void setDocSentTime(Date docSentTime) {
		this.docSentTime = docSentTime;
	}
	@Column(name="NOTES", length=1000)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Transient
	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	@Transient
	public String getDocumentName() {
		return path.substring(1 + path.lastIndexOf((String)System.getProperty("file.separator")));
	}



}
