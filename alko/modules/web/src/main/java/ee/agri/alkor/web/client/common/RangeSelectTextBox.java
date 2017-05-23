package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.TextBox;


/**
 * Allows range input for forms
 * 
 * @author rolandv
 *
 */
public class RangeSelectTextBox extends RangeSelectBox {
	
	public static final String NUMERIC = "numeric"; //Type for numeric input
	public static final String TEXTBOX = "textbox";
	
	private String type;
	
	private TextBox start;
	private TextBox end;
	
	public RangeSelectTextBox(String type, String startWidth, String endWidth) {

		super();
		
		this.type = type;
		
		start = new TextBox();

		end = new TextBox();

		Grid grid = new Grid(1, 7);
		grid.setWidget(0, 0, start);
	    grid.setWidget(0, 1, UIutils.createSpacer(3, 1));
	    grid.setText(0, 2, "-");
	    grid.setWidget(0, 3, UIutils.createSpacer(3, 1));
	    grid.setWidget(0, 4, end);
		//grid.getCellFormatter().setWidth(0, 0, "100%");
		//grid.getCellFormatter().setWidth(0, 1, "100%");
		grid.getCellFormatter().setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setVerticalAlignment(0, 4, HasVerticalAlignment.ALIGN_MIDDLE);
		//grid.setSize("100%", "100%");
	    grid.setCellSpacing(0);
	    grid.setCellPadding(0);
		initWidget(grid);

	}
	
	
	public String getType() {
		return type;
	}
	
	public Object getHigh() {
		return end.getText();
	}
	
	public Object getLow() {
		return start.getText();
	}
	
	public void clear() {
		this.start.setText("");
		this.end.setText("");
	}
	
	public String toString() {
		if((getLow() != null && getLow().toString().trim().length() != 0) 
				|| (getHigh() != null && getHigh().toString().trim().length() != 0)) {
			return "{" + getLow() + " - " + getHigh() + "}";
		} else {
			return null;
		}
	}
	
	

}
