package ee.agri.alkor.web.client.common.widgets;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

public class FormOpenCloseButton extends Image {
	
	private boolean isOpen;
	private FlexTable form;
	
	private String openedImgUrl = "images/minus.gif";
	private String closedImgUrl = "images/plus.gif";
	
	public FormOpenCloseButton(FlexTable form) {
		this.form = form;
		this.addClickListener(new FormOpenCloseListener());
		close();
	}
	
	private void open() {
		this.setUrl(openedImgUrl);
		form.setVisible(true);
		isOpen = true;
	}
	
	private void close() {
		this.setUrl(closedImgUrl);
		form.setVisible(false);
		isOpen = false;
	}
	
	private class FormOpenCloseListener implements ClickListener {
		public void onClick(Widget sender) {
			if (isOpen) {
				close();
			} else {
				open();
			}
		}
	}
	
}