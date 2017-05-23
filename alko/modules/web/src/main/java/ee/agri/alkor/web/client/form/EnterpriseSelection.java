package ee.agri.alkor.web.client.form;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;
import ee.agri.alkor.web.client.common.TaggedLabel;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.ObjectList;

public class EnterpriseSelection extends PopupPanel implements ClickListener {

	private static final String CSS_MAIN = "EnterpriseOrMtrSelection";
	private static final String CSS_MAIN_CONTAINER = CSS_MAIN + "Container";
	private static final String CSS_BUTTON_CONTAINER = CSS_MAIN + "ButtonContainer";
	private static final String CSS_DATA_TABLE = CSS_MAIN + "Table";
	private static final String CSS_BUTTON = CSS_MAIN + "Button";
	private static final String CSS_LABEL = CSS_MAIN + "Label";

	private static final int PAGE_LIMIT = 10;

	private EnterpriseDetails parent;
	private ObjectList enterprises;
	private ConstantsWithLookup messages;
	private FlexTable buttonContainer;
	private FlexTable main;
	private EnterpriseTable enterpriseTable;
	private Button closeButton;
	private Button nextButton;
	private Button prevButton;
	private int offset = 0;

	public EnterpriseSelection(EnterpriseDetails parent, ObjectList enterprises) {
		this.parent = parent;
		this.enterprises = enterprises;
		messages = (ConstantsWithLookup) getConstantsWithLookup();
		setStyleName(CSS_MAIN);
		main = new FlexTable();
		main.addStyleName(CSS_MAIN_CONTAINER);
		buttonContainer = new FlexTable();
		buttonContainer.addStyleName(CSS_BUTTON_CONTAINER);
		enterpriseTable = new EnterpriseTable();
		enterpriseTable.addStyleName(CSS_DATA_TABLE);
		main.setWidget(0, 0, enterpriseTable);
		main.setWidget(1, 0, buttonContainer);
		closeButton = new Button(getMessage("close"));
		closeButton.addStyleName(CSS_BUTTON);
		closeButton.addClickListener(this);
		buttonContainer.setWidget(0, 0, closeButton);
		prevButton = new Button(getMessage("previous"));
		prevButton.addStyleName(CSS_BUTTON);
		prevButton.addClickListener(this);
		buttonContainer.setWidget(0, 1, prevButton);
		nextButton = new Button(getMessage("next"));
		nextButton.addStyleName(CSS_BUTTON);
		nextButton.addClickListener(this);
		buttonContainer.setWidget(0, 2, nextButton);
		updateEnterpriseTable();
		setWidget(main);
	}

	private void updateEnterpriseTable() {
		if (offset > 0) {
			prevButton.setEnabled(true);
		} else {
			prevButton.setEnabled(false);
		}
		if (offset < enterprises.size() - PAGE_LIMIT) {
			nextButton.setEnabled(true);
		} else {
			enterpriseTable.clear();
			nextButton.setEnabled(false);
		}
		int i = offset;
		for (; i < enterprises.size() && i - offset < PAGE_LIMIT; i++) {
			EnterpriseMap enterprise = (EnterpriseMap) enterprises.get(i);
			String entName = enterprise.getText(EnterpriseMap.NAME);
			String longEntName = entName;
			if (entName.length() > 38) {
				entName = longEntName.substring(0, 38) + "...";
			}
			TaggedLabel lbl = new TaggedLabel(entName);
			lbl.setStyleName(CSS_LABEL);
			lbl.setTags(new String[] { i + "" });
			lbl.setTitle(longEntName);
			lbl.addClickListener(this);
			enterpriseTable.setWidget(i - offset, 0, lbl);
		}
	}

	private String getMessage(String key) {
		return messages.getString(key);
	}

	public void onClick(Widget sender) {
		if (sender instanceof TaggedLabel) {
			TaggedLabel lbl = (TaggedLabel) sender;
			String[] tags = lbl.getTags();
			int idx = Integer.valueOf(tags[0]).intValue();
			EnterpriseMap enterprise = (EnterpriseMap) enterprises.get(idx);
			parent.updateFormData(enterprise);
			hide();
		} else if (sender == closeButton) {
			hide();
		} else if (sender == nextButton) {
			if (offset < enterprises.size() - PAGE_LIMIT) {
				offset += PAGE_LIMIT;
				updateEnterpriseTable();
			}
		} else if (sender == prevButton) {
			if (offset > 0) {
				offset -= PAGE_LIMIT;
				updateEnterpriseTable();
			}
		}
	}

	private Object getConstantsWithLookup() {
		return GWT.create(EnterpriseSelectionMessages.class);
	}

	private class EnterpriseTable extends FlexTable {

		public EnterpriseTable() {
			sinkEvents(Event.ONMOUSEOVER | Event.ONMOUSEOUT);
		}

		public void onBrowserEvent(Event event) {
			Element td = getEventTargetCell(event);
			if (td == null)
				return;
			Element tr = DOM.getParent(td);
			switch (DOM.eventGetType(event)) {
				case Event.ONMOUSEOVER:
					DOM.setStyleAttribute(tr, "backgroundColor", "#ffce00");
					break;
				case Event.ONMOUSEOUT:
					DOM.setStyleAttribute(tr, "backgroundColor", "#ffffff");
					break;
			}
			super.onBrowserEvent(event);
		}
	}
}
