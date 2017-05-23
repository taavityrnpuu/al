package ee.agri.alkor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.history.IHistorical;

@Entity
@Table(name="NEWS")
public class News extends ABaseBean implements IHistorical {

    private Long id;

    private Date date;

    private String title;

    private String content;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NEWS_SEQ")
	@javax.persistence.SequenceGenerator(
    name="NEWS_SEQ",
    sequenceName="NEWS_SEQ",
    allocationSize=1
	)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Column(name="DATE")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

    @Column(name="TITLE", length=256)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    @Column(name="CONTENT", length=2000)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
