package ee.agri.alkor.web.client.form;

import java.util.List;

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

import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.TaggedLabel;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.MtrAndCustomsQueryResultMap;
import ee.agri.alkor.web.client.dto.MtrLicenseMap;

public class MTRLicenseSelection extends PopupPanel implements ClickListener {

	private static final String CSS_MAIN = "EnterpriseOrMtrSelection";
	private static final String CSS_MAIN_CONTAINER = CSS_MAIN + "Container";
	private static final String CSS_BUTTON_CONTAINER = CSS_MAIN + "ButtonContainer";
	private static final String CSS_DATA_TABLE = CSS_MAIN + "Table";
	private static final String CSS_BUTTON = CSS_MAIN + "Button";
	private static final String CSS_HEADER = CSS_MAIN + "Header";
	private static final String CSS_LABEL = CSS_MAIN + "Label";
	
	private static final int PAGE_LIMIT = 10;
	
	private Form parent;
	private List licenses;
	private ConstantsWithLookup messages;
	private FlexTable main;
	private FlexTable licenseTable;
	private FlexTable buttonContainer;
	private Button closeButton;
	private Button nextButton;
	private Button prevButton;
	private int offset = 0;

	public MTRLicenseSelection(Form parent, MtrAndCustomsQueryResultMap resultMap) {
		this.parent = parent;
		this.licenses = (List) resultMap.getProperty(MtrAndCustomsQueryResultMap.MTR_LICENSES);
		messages = (ConstantsWithLookup) getConstantsWithLookup();
		setStyleName(CSS_MAIN);
		main = new FlexTable();
		main.addStyleName(CSS_MAIN_CONTAINER);		

		licenseTable = new LicenseTable();
		licenseTable.addStyleName(CSS_DATA_TABLE);				
		main.setWidget(0, 0, licenseTable);		
		
		buttonContainer = new FlexTable();
		buttonContainer.addStyleName(CSS_BUTTON_CONTAINER);		
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
		main.setWidget(1, 0, buttonContainer);
		updateLicenseTable();
		setWidget(main);
	}

	private void updateLicenseTable() {
		if (offset <= licenses.size() - PAGE_LIMIT) {
			nextButton.setEnabled(true);
		} else {
			licenseTable.clear();
			nextButton.setEnabled(false);
		}
		if (offset > 0) {
			prevButton.setEnabled(true);
		} else {
			prevButton.setEnabled(false);
		}
		
		TaggedLabel lblNr = new TaggedLabel(getMessage("nr"));
		lblNr.addStyleName(CSS_HEADER);
		licenseTable.setWidget(0, 0, lblNr);
		TaggedLabel lblDate = new TaggedLabel(getMessage("regDate"));
		lblDate.addStyleName(CSS_HEADER);
		licenseTable.setWidget(0, 1, lblDate);
		TaggedLabel lblField = new TaggedLabel(getMessage("fieldOfOperation"));
		lblField.setStyleName(CSS_HEADER);
		licenseTable.setWidget(0, 2, lblField);
		
		int i = offset;		
		for (; i < licenses.size() && i - offset < PAGE_LIMIT; i++) {
			MtrLicenseMap license = (MtrLicenseMap) licenses.get(i);						
			TaggedLabel lbl1 = new TaggedLabel(license.getText(MtrLicenseMap.NR));
			lbl1.addStyleName(CSS_LABEL);
			lbl1.setTags(new String[] { i + "" });
			lbl1.addClickListener(this);
			licenseTable.setWidget(i - offset + 1, 0, lbl1);
			TaggedLabel lbl2 = new TaggedLabel(license.getText(MtrLicenseMap.DATE));
			lbl2.addStyleName(CSS_LABEL);
			lbl2.setTags(new String[] { i + "" });
			lbl2.addClickListener(this);
			licenseTable.setWidget(i - offset + 1, 1, lbl2);
			TaggedLabel lbl3 = new TaggedLabel(license.getText(MtrLicenseMap.BUSINESS_NAME));			
			lbl3.addStyleName(CSS_LABEL);
			lbl3.setTags(new String[] { i + "" });
			lbl3.addClickListener(this);
			licenseTable.setWidget(i - offset + 1, 2, lbl3);
		}
	}

	private String getMessage(String key) {
		return messages.getString(key);
	}

	public void onClick(Widget sender) {
		if (sender instanceof TaggedLabel) {
			TaggedLabel lbl = (TaggedLabel) sender;
			String[] tags = lbl.getTags();
			if(tags == null) return;
			int idx = Integer.valueOf(tags[0]).intValue();
			MtrLicenseMap license = (MtrLicenseMap) licenses.get(idx);
			ABaseDTOMap data = parent.getData();										
			data.setProperty(EnterpriseMap.MTR_CODE, license.getProperty(MtrLicenseMap.NR));
			//parent.setData(data);
			parent.setFormFieldsFromData(Form.CHANGE_FORM);
			hide();
		} else if (sender == closeButton) {
			hide();
		} else if (sender == nextButton) {
			if (offset <= licenses.size() - PAGE_LIMIT) {
				offset += PAGE_LIMIT;
				updateLicenseTable();
			}
		} else if (sender == prevButton) {
			if (offset > 0) {
				offset -= PAGE_LIMIT;
				updateLicenseTable();
			}
		}
	}

	private Object getConstantsWithLookup() {
		return GWT.create(MTRLicenseSelectionMessages.class);
	}
	
	private class LicenseTable extends FlexTable {

		public LicenseTable() {
			sinkEvents(Event.ONMOUSEOVER | Event.ONMOUSEOUT);
		}

		public void onBrowserEvent(Event event) {
			Element td = getEventTargetCell(event);
			if (td == null)
				return;
			Element tr = DOM.getParent(td);
			if (DOM.compare(tr, DOM.getFirstChild(DOM.getParent(tr))))
				return;
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
