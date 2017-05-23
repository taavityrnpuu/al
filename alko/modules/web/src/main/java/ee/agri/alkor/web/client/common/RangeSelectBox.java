package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.TextBox;

public class RangeSelectBox extends Composite implements IResetable{

	public static final String CALENDAR = "calendar";
	
	private String type;
	
	private CalendarBox start;
	private CalendarBox end;
	
	//default constructor for extended classes
	public RangeSelectBox(){
		
	}
	

	
	public RangeSelectBox(String type, String startWidth, String endWidth) {

		super();

		this.type = type;
		
		this.start = new CalendarBox();

		this.end = new CalendarBox();

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
		return this.type;
	}
	
	public Object getHigh() {
		return this.end.getText();
	}
	
	public Object getLow() {
		return this.start.getText();
	}

	public void clear() {
		this.start.clear();
		this.end.clear();
	}
	
	public String toString() {
		if((getLow() != null && getLow().toString().trim().length() != 0) 
				|| (getHigh() != null && getHigh().toString().trim().length() != 0)) {
			return "{" + getLow() + " - " + getHigh() + "}";
		} else {
			return null;
		}
	}

	public void setStart(String start) {
		this.start.setText(start);
	}

	public void setEnd(String end) {
		this.end.setText(end);
	}

}
