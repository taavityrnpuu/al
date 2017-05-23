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
 * News History
 * @author kaupo
 *
 */
@Entity
@Table(name = "NEWS_HISTORY")
@javax.persistence.SequenceGenerator(name = "NEWS_HIST_SEQ", sequenceName = "NEWS_HIST_SEQ", allocationSize = 1)
public class NewsHistory extends ABaseBean implements IHistoryEntity {

	private Long histId;

	private Long id;

	private Date date;

	private String title;

	private String content;

	/*
     * (non-Javadoc)
     *
     * @see ee.agri.alkor.model.history.IHistoryEntity#getHistId()
     */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NEWS_HIST_SEQ")
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

	@Column(name = "DATE")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "TITLE", length = 256)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "CONTENT", length = 2000)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
