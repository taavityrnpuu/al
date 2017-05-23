package ee.agri.alkor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ee.agri.alkor.model.history.IHistorical;

@Entity
@Table(name="FAQ")
public class Faq extends ABaseBean implements IHistorical {

    private Long id;

    private String question;

    private String answer;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAQ_SEQ")
	@javax.persistence.SequenceGenerator(
    name="FAQ_SEQ",
    sequenceName="FAQ_SEQ",
    allocationSize=1
	)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Column(name="QUESTION", length=256)
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

    @Column(name="ANSWER", length=2000)
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
