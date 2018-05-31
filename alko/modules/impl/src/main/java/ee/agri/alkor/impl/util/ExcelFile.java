package ee.agri.alkor.impl.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;


import ee.agri.alkor.model.AuthenticationLog;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.model.RegistryPayment;
import ee.agri.alkor.model.RegistryPaymentView;
import ee.agri.alkor.model.classes.Classificator;
import ee.agri.alkor.service.SearchFilter;

public class ExcelFile extends HSSFWorkbook {

	private HSSFCellStyle wrapStyle;
	private HSSFCellStyle headerCellStyle;
	private HSSFCellStyle rowCellStyle;
	private static final SimpleDateFormat sFormat = new SimpleDateFormat("dd.MM.yyyy");
	private static final SimpleDateFormat authLogFormat = 
		new SimpleDateFormat("dd.MM.yyyy  HH:mm:ss");

	SearchFilter filter;
	int gradeLocation = 0;

	public ExcelFile(SearchFilter filter) {
		super();

		this.filter = filter;
		//create styles
		//create wrap cell style
		wrapStyle = this.createCellStyle();
		wrapStyle.setWrapText(true);
		//create header cell style
		headerCellStyle = this.createCellStyle();
		headerCellStyle.setBorderBottom(HSSFCellStyle.BORDER_THICK);
		headerCellStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		//create row cell style
		rowCellStyle = this.createCellStyle();
		rowCellStyle.setBorderRight(HSSFCellStyle.BORDER_THICK);
		rowCellStyle.setRightBorderColor(HSSFColor.BLACK.index);
		//create sheet
		HSSFSheet sheet = this.createSheet("Tulemused");
		this.createAndAddHeaderRow(sheet);
		
			this.createAndAddDataRows
			(sheet,"SearchViewPrimitive".equals(filter != null ? filter.getObjectClass() : null));
	}

	/**
	 * Creates and adds a header row to the specified sheet
	 * @param sheet
	 */
	private void createAndAddHeaderRow(HSSFSheet sheet) {
		
		HSSFRow headerRow;
		
		//Create filter row
		if(filter.getObjectClass().equals("SearchViewPrimitive")) {
			HSSFRow filterRow = sheet.createRow(0);
			filterRow.createCell(0).setCellValue(new HSSFRichTextString(createFilterString(filter)));
			//empty row
			HSSFRow emptyRow = sheet.createRow(1);
			
			//Create header row
			headerRow = sheet.createRow(2);
		}else{
			//Create header row
			headerRow = sheet.createRow(1);
		}

		headerRow.createCell(0).setCellValue(new HSSFRichTextString(""));

		List keyList = filter.getColumnsList();
		for (int i = 0; i < keyList.size(); i++) {

			Object key = keyList.get(i);
			String value = (String) filter.getColumns().get(key);
			if(value.startsWith("Etan")){
				 gradeLocation = i+1;
			}

			createAndAddHeaderCell(headerRow, (i+1), value);

		    sheet.setColumnWidth(i, 4000);

		}

	}

	private String createFilterString(SearchFilter filter2) {
		StringBuffer sb = new StringBuffer();
		for(Iterator it = filter2.getQueryTextParams().keySet().iterator(); it.hasNext();){
			if(it != null) {
				String key = (String)it.next();
				
				sb.append(filter2.getQueryLabels().get(key) + " = ");
				
				Object value = filter2.getQueryTextParams().get(key);
				if(value instanceof List) {
					int i;
					for(i = 0; i < ((List)value).size() - 1; i++) {
						sb.append(((List)value).get(i) + ", ");
					}
					sb.append(((List)value).get(i));
				} else {
					if(value.equals("true"))
						sb.append("Jah");
					else if(value.equals("false"))
						sb.append("Ei");
					else
						sb.append(value.toString());
				}
				sb.append("; ");
			}
		}
		return sb.toString();
	}

	/**
	 * Creates and adds a cell to header on a specified index with a specified value
	 * @param headerRow
	 * @param index
	 * @param value
	 */
	private void createAndAddHeaderCell(HSSFRow headerRow, int index, String value) {

		/* Creating the cell and attaching it to a row */
		HSSFCell cell = headerRow.createCell(index);

		/* Setting the cell value */
		cell.setCellValue(new HSSFRichTextString(value));

		/* Setting the cell style */
	    cell.setCellStyle(headerCellStyle);
	}

	/**
	 * Creates and adds data rows to the specified sheet
	 * @param sheet
	 */
	private void createAndAddDataRows(HSSFSheet sheet, boolean isSearchView) {

		int i;
		
		if(isSearchView)
			i = 2;
		else
			i = 1;
		List resultList = filter.getResultsList();

		for (Object obj : resultList) {

			i++;
			
			createAndAddDataRow(sheet, i, obj,isSearchView);

		}
	}

	/**
	 * Creates a row with data from the specified object and adds it the row to the specified
	 * sheet at the specified index
	 */
	private void createAndAddDataRow(HSSFSheet sheet, int index, Object data,boolean isSearchView) {

		HSSFRow row = sheet.createRow(index);
		int j = 0;
		boolean typeSet = false;
		HSSFCell cell = row.createCell(j);
		if(isSearchView)
			cell.setCellValue(index - 2);
		else
			cell.setCellValue(index-1);

	    cell.setCellStyle(rowCellStyle);

		for (Object keyObj : filter.getColumnsList()) {

			j++;

			String keyString = (String)keyObj;

			HSSFCell dataCell = row.createCell(j);

			String value = getValue(keyString, data);
			if (value != null) {
				if(j == gradeLocation){
					value = checkGrade(value);
				}
				//determine the type of a column
				try{
					if(!typeSet){
						
						Date date = DateFormat.getInstance().parse(value);
						CellStyle cellStyle = this.createCellStyle();
						cellStyle.setWrapText(true);
						cellStyle.setDataFormat(this.getCreationHelper().createDataFormat().getFormat("dd.MM.yyyy"));
						dataCell.setCellValue(date);
						dataCell.setCellStyle(cellStyle);
						typeSet = true;
					}
				}catch (Exception e){
					//System.out.println("value:"+e.getMessage());
					dataCell.setCellStyle(wrapStyle);
					dataCell.setCellValue(new HSSFRichTextString(value));
				}
				try{
					if(!typeSet){
						if(!"payingAccNo".equals(keyString)){ // try to make number of all field values
							dataCell.setCellStyle(wrapStyle);	//except account nr
							double doubleValue = Double.parseDouble(value);
							dataCell.setCellValue(doubleValue);
							typeSet = true;
						}else{
							dataCell.setCellStyle(wrapStyle);
							dataCell.setCellValue(new HSSFRichTextString(value));
							typeSet = true;
						}
					}
				}catch (Exception e){
					dataCell.setCellStyle(wrapStyle);
					//System.out.println("value:"+e.getMessage());
					dataCell.setCellValue(new HSSFRichTextString(value));
				}
				
			}
			typeSet = false;
		}

	}

	/**
	 * Gets the value from data with the associated keystring
	 * @param keyString
	 * @param data
	 * @return
	 */
	public String getValue(String keyString, Object data) {
		
		Object originalObject = data;
		Object bufferObj = data;
		

		bufferObj = invokeGetMethod(bufferObj, keyString);
		
		if (bufferObj != null) {
			if(bufferObj instanceof Date) {
				if(keyString.equals("time") && originalObject instanceof AuthenticationLog){
					bufferObj= authLogFormat.format((Date)bufferObj);
				}else
					bufferObj = sFormat.format(((Date)bufferObj));
			} else if (bufferObj instanceof Classificator) {
				bufferObj = ((Classificator)bufferObj).getName();
			}else if (bufferObj instanceof Boolean) {
				
				
				if(originalObject instanceof RegistryPayment && "has_enterprise".equals(keyString)){
					if(bufferObj.toString().equals("true"))
						bufferObj = ((RegistryPayment)originalObject).getBoundEnterprise().getName();
					else
						bufferObj = "";
				}else{
					if(bufferObj.toString().equals("true"))
						bufferObj = "Jah";
					else
						bufferObj = "Ei";
				}
			}else if(originalObject instanceof RegistryPaymentView && "type".equals(keyString)){
				bufferObj = ((RegistryPaymentView)originalObject).getTypeName();
			} else if ("notes".equals(keyString) && bufferObj instanceof String && ((String) bufferObj).contains("<br/>")) {
			   bufferObj = ((String)bufferObj).replaceAll("\\<.*?>"," ").trim().replaceAll(" +", " ");
			}
			return bufferObj.toString();
		}else if("balance".equals(keyString) && originalObject instanceof Enterprise){
				return "0";
		} else {
			return null;
		}

	}
	public static String checkGrade(String value){

		if(value.endsWith(".0")){
		   int endPoint = value.indexOf(".");
		   String newValue = value.substring(0, endPoint);

		   return newValue;

	   }
	   return value;
	}
	
	/**
	 * 
	 * @param bufferObj 
	 * @param keyString object to search
	 * @return object by keyString
	 */
	public Object invokeGetMethod(Object bufferObj,String keyString){
		List<String> keys = Arrays.asList(keyString.split("\\."));
		
		for (String key : keys) {
			if (bufferObj == null) {
				break;
			}
			try {
				Method method = bufferObj.getClass().getMethod(
						"get"+
						key.substring(0, 1).toUpperCase() +
						key.substring(1, key.length())
						, (Class[])null);
				if (method != null) {
					bufferObj = method.invoke(bufferObj, (Object[])null);
				}
			} catch (SecurityException e) {
				//e.printStackTrace();
			} catch (NoSuchMethodException e) {
				//e.printStackTrace();
			} catch (InvocationTargetException ite) {
				//ite.printStackTrace();
			} catch (IllegalAccessException iae) {
				//iae.printStackTrace();
		}
		}
		return bufferObj;
	}

}
