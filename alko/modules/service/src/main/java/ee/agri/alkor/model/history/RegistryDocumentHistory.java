/**
 *
 */
package ee.agri.alkor.model.history;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.ABaseBean;

/**
 * RegistryDocument History
 * @author kaupo
 *
 */
@Entity
@Table(name = "REG_DOC_HISTORY")
@javax.persistence.SequenceGenerator(name = "REG_DOC_HIST_SEQ", sequenceName = "REG_DOC_HIST_SEQ", allocationSize = 1)
public class RegistryDocumentHistory extends ABaseBean implements
		IHistoryEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 5420210589198985721L;

	private Long histId;

	/**
     * The id of the entity.
     */
	private Long id;

	/**
     * Dokumendi nimi
     */
	private String name;

	/**
     * Dokumendi reg. number
     */
	private String nr;

	/**
     * Dokumendi tyyp.
     */
	private String docType; //DocumentType

	/**
     * Dokumendi keel.
     */
	private String language; //Language

	/**
     * MIME document contenttype.
     */
	private String contentType;

	/**
     * Associated application
     */
	private Long application; //RegistryApplication

	/**
     * Viide Failisüsteemis olevale failile.
     */
	private String path;

	/**
     * Dokumendi saaja.
     */
	private String docReceiver; //Person

	/**
     * Dokumendi väljasaatmise kuupäev.
     */
	private Date docSentTime;

	/**
     * Dokumendi lisainfo.
     */
	private String notes;


	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REG_DOC_HIST_SEQ")
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

	/**
     * Getter for id.
     *
     * @return id
     *
     */
	public Long getId() {
		return id;
	}

	/**
     * Setter for id.
     *
     * @param aId
     *            id
     */
	public void setId(Long aId) {
		this.id = aId;
	}

	/**
     *
     * @return String
     *
     * @hibernate.property column="NAME" length="128"
     *
     */
	@Column(name = "NAME", length = 128)
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
     */
	@Column(name = "NR", length = 32)
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
     *
     */
	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "MIME", length = 128)
	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Column(name="DOC_APPL_ID")
	public Long getApplication() {
		return application;
	}

	public void setApplication(Long application) {
		this.application = application;
	}

	@Column(name = "PATH", length = 128)
	public String getPath() {
		return path;
	}

	public void setPath(String docLocation) {
		this.path = docLocation;
	}

	public String getDocReceiver() {
		return docReceiver;
	}

	public void setDocReceiver(String docReceiver) {
		this.docReceiver = docReceiver;
	}

	@Column(name = "DOC_SENT")
	public Date getDocSentTime() {
		return docSentTime;
	}

	public void setDocSentTime(Date docSentTime) {
		this.docSentTime = docSentTime;
	}

	@Column(name = "NOTES", length = 1000)
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
