package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.Label;

public class TaggedLabel extends Label {

	private String[] tags;

	public TaggedLabel() {
		super();
	}

	public TaggedLabel(String text) {
		super(text);
	}

	public TaggedLabel(String text, boolean wordWrap) {
		super(text, wordWrap);
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String[] getTags() {
		return tags;
	}
}
