package ee.agri.alkor.web.client.dto;

import com.google.gwt.user.client.rpc.IsSerializable;

public class RangeFilter implements IsSerializable {
	
	public static final String CALENDAR = "calendar";
	public static final String TEXTBOX = "textbox";
	public static final String NUMERIC = "numeric";
	
	private String min;
	private String max;
	private String type;
	
	public RangeFilter(){
		
	}
	
	public RangeFilter(String type, String min, String max) {
		this.min = min;
		this.max = max;
		this.type = type;
	}
	
	public void setMin(String min) {
		this.min = min;
	}
	
	public String getMin() {
		return min;
	}
	
	public void setMax(String max) {
		this.max = max;
	}
	
	public String getMax() {
		return max;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

}
