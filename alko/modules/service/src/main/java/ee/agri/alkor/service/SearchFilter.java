package ee.agri.alkor.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * General query filter for paging results.
 *
 * @author ivar
 *
 */
public class SearchFilter implements Serializable {

	public static final String IS_NOT_NULL = " is not null ";
	public static final String LESS_THAN_CURRENT_DATE = " < current_date ";
    public static final String NOT_LESS_THAN_CURRENT_DATE = " >= current_date ";
    public static final String LESS_OR_EQUAL_THAN_CURRENT_DATE = " <= current_date ";
    public static final String BIGGER_THAN_CURRENT_DATE = " > current_date ";
    public static final String START_DATE = "start_date";
    public static final String END_DATE = "end_date";
    public static final String START_TIME = "startTime";
    public static final String END_TIME = "endTime";

	public static final String ASCENDING = "asc";
	public static final String DESCENDING = "desc";

	public static final String RANGE_DATE = "date";
	
	public static final String NOT_LIKE = "not_like/";

	private static final long serialVersionUID = 1L;

	/**
	 * Query object class name without package
	 */
	private String objectClass;

	/**
	 * Query parameters as query object bean properties.
	 */
	private Map<String, Object> queryParams = new HashMap<String, Object>();
	
	private Map<String, Object> queryTextParams = new HashMap<String, Object>();

	/*
	 * Where to go after selection
	 */
	private String forward;

	/* Total # of result rows */
	private int total;

	private int pageSize = 50;

	private int startIndex;

	private String orderBy;

	private String orderDirection;

	private List resultsList = new ArrayList();

	private Map sortMap = new HashMap();
	private Map<String, Integer> sortMapOrder = new HashMap<String, Integer>();

	private HashMap columnsMap = new HashMap();

	private List columnsList = new ArrayList();

	//private List columns = new ArrayList();
	
	private HashMap queryLabels = new HashMap();
	
	private boolean limited;

	public SearchFilter() {
		super();
	}

	public int getPageCount() {
	  if (pageSize > 0) {
	      if(total%pageSize==0)
	         return total / pageSize;
	      else
	         return (total/pageSize)+1;
	  } else {
		  return 1;
	  }
	}

	public int getPrevIndex() {
		return startIndex - pageSize;
	}

	public int getNextIndex() {
		int next = startIndex + pageSize;
		return (next > total) ? -1 : next;
	}

	/**
	 * @return Returns the total.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total The total to set.
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	public String getOrderBy() {
		return orderBy;
	}
	
	/**
	 * ! Deprecated
	 * Use addSortItem instead
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String  getOrderDirection() {
		return orderDirection;
	}

	public void setOrderDirection(String orderDirection) {
		this.orderDirection = orderDirection;
	}

	public Map getSortMap() {
		return sortMap;
	}

	public void setSortMap(Map sortMap) {
		this.sortMap = sortMap;
	}
	
	public Map<String, Integer> getSortMapOrder() {
		return sortMapOrder;
	}

	public void setSortMapOrder(Map<String, Integer> sortMapOrder) {
		this.sortMapOrder = sortMapOrder;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public List getResultsList() {
		return resultsList;
	}

	public void setResultsList(List resultsList) {
		this.resultsList = resultsList;
	}

	public String getForward() {
		return forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	public String getObjectClass() {
		return objectClass;
	}

	public void setObjectClass(String objectClass) {
		this.objectClass = objectClass;
	}

	public Map<String, Object> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(Map<String, Object> queryParams) {
		this.queryParams = queryParams;
	}

	public void setColumns(HashMap columns, List columnsList) {
		this.columnsMap=columns;
		this.columnsList=columnsList;
	}

	public void addColumn(String columnPropertyName, String columnName) {
		if(!columnsList.contains(columnPropertyName)) {
			this.columnsMap.put(columnPropertyName, columnName);
			this.columnsList.add(columnPropertyName);
		}
	}

	public HashMap getColumns() {
		return columnsMap;
	}

	public List getColumnsList() {
		return columnsList;
	}

	/**
	 * Method to convert the query parameters of a searchfilter into a string in the format of
	 * [key1=value1;key2=value2;...;keyN=valueN] ...etc
	 *
	 * If value is not of type String, but instead of type RangeFilter, then the value will be
	 * in the format of <MIN, MAX>
	 * @return
	 */
	public String getQueryParameterString() {

		String queryParameterString = new String();

		/* Cycling through every query parameter and parsing it into string */
		queryParameterString += "[";
		Iterator it = getQueryParams().keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			Object value = getQueryParams().get(key);

			/* If the value is a string then parse it to a "key=value;" item */
			if (value instanceof String || value instanceof Long || value instanceof Integer || value instanceof Boolean) {
				queryParameterString += key + "=" + value + ";";

			/* If the value is a RangeFilter then parse it to a "key=<MIN,MAX>" item */
			} else if (value instanceof RangeFilter) {
				RangeFilter rangeFilter = (RangeFilter) value;
				queryParameterString += key + "=" +
						"<" + rangeFilter.getMin() +
						"," + rangeFilter.getMax() + ">;";

			/* Exceptional case - should not happen - all values should be either
			 * of type String or RangeFilter */
			} else {
				//System.out.println("exceptional case! queryParams key=" + key + ", value=" + value);
			}
		}
		queryParameterString += "]";

		return queryParameterString;

	}

	/**
	 * Method to convert the query parameters represented by a string in the format of
	 * [key1=value1;key2=value2;...;keyN=valueN] into query parameters in the format of
	 * Map<String key, Object value>
	 *
	 * This method assumes that the keys or values dont have semicolons(;), equals(=), lesser than (<) or
	 * greater than(>) signs inside the keys in them. If the method encounters a < then it assumes
	 * that there is a closing > and that the values inside are delimited by a single comma(,) and that the
	 * values dont have commas(,) in them.
	 */
	public void setQueryParametersFromString(String queryParameterString) {

		/* Regular expression to check the keys and values against */
		String queryStringRegex = "\\[.*\\]";
		String keyRegex = "[a-zA-Z_]+(\\.[a-zA-Z_]+)*";
		String valueRegex = "[a-zA-ZžšõäöüŽŠÕÄÖÜ0-9-,\\.\"\\s]*";
		String valueRangeRegex = "<\\{[a-zA-Z]*\\}[^,]*,[^,]*>";
		String listRegEx = "\\{\\{.*\\}\\}";

		if (queryParameterString.matches(queryStringRegex)) {

			queryParameterString = queryParameterString.substring(
					queryParameterString.indexOf("[")+1,
					queryParameterString.indexOf("]"));
			String[] keyValuePairs = queryParameterString.split(";");

			/* Iterate over the key/value pairs */
			for (int i = 0; i < keyValuePairs.length; i++) {

				String keyValuePair = keyValuePairs[i];

				if (keyValuePair.length()!=0) {

					String[] keyValuePairArray = null;
					/* Split the key/value pair into key and value string */
					if(keyValuePair.indexOf("=") != -1) {
						if((keyValuePairArray = keyValuePair.split("=")).length != 2) {
							keyValuePairArray = new String[2];
							keyValuePairArray[0] = keyValuePair.substring(0,keyValuePair.indexOf("="));
							keyValuePairArray[1] = keyValuePair.substring(keyValuePair.indexOf("=") +1);
						}
					}
					 //old -> keyValuePair.split("=");
					

					if (keyValuePairArray != null && keyValuePairArray.length == 2) {

						String key = keyValuePairArray[0];
						String value = keyValuePairArray[1];

						/* Check whether the key is legal */
						if (key.matches(keyRegex)) {

							/* Check whether the value is legal */
//							if (value.matches(valueRegex)) {
//								/* The value is a simple value */
//
//								this.getQueryParams().put(key, value);
//
//							} else
							if (value.matches(valueRangeRegex)) {
								/* The value is of type RangeFilter and should be parsed to it */

								/* Gets the type of the RangeFilter between {} brackets */
								String type = value.substring(value.indexOf("{")+1, value.indexOf("}"));

								String valueMinMax[] = value.substring(value.indexOf("}")+1, value.indexOf(">")).split(",");

								if (valueMinMax.length == 2) {
									/*
									 * Creates the RangeFilter and inserts the values into it and inserts
									 * the RangeFilter into the queryParams of the searchFilter
									 */

									String min = valueMinMax[0];
									String max = valueMinMax[1];

									RangeFilter rf = new RangeFilter();

									if (!min.equals("null")) {
										rf.setMin(min);
									}
									if (!max.equals("null")) {
										rf.setMax(max);
									}
									rf.setType(type);
									this.getQueryParams().put(key, rf);

								}
							} else if(value.matches(listRegEx)) {
								//List vals = new ArrayList();
								String[] vals = value.substring(2, value.length()-2).split(",");
								List values = new ArrayList();
								for(int j = 0; j < vals.length; j++) {
									values.add(vals[j]);
								}
								this.getQueryParams().put(key, values);
								
							} else {
								/* FIXME: this should be an error! The value should match the
								 * regular expression either for simple text value or <{TYPE}MIN,MAX> value */
								this.getQueryParams().put(key, value);
							}

						} else {
							/* FIXME: this should be an error! The key should match the regular expression
							 * for it */
						}

					} else {
						/* FIXME: this should be an error! - there has to be a key and a value in a pair */
					}
				}
			}

		} else {
			/* FIXME: this should be an error! The queryParameterString should start with [ and end with ] */
		}

	}
	
	
	/**
	 * This method is not for use in searching. Should be used for 
	 * 
	 * Method to convert the query parameters represented by a string in the format of
	 * [key1=value1;key2=value2;...;keyN=valueN] into query text parameters in the format of
	 * Map<String key, Object value>
	 *
	 * This method assumes that the keys or values dont have semicolons(;), equals(=), lesser than (<) or
	 * greater than(>) signs inside the keys in them. If the method encounters a < then it assumes
	 * that there is a closing > and that the values inside are delimited by a single comma(,) and that the
	 * values dont have commas(,) in them.
	 */
	public void setQueryTextParametersFromString(String queryTextParameterString) {
		if(queryTextParameterString == null)
			return;
		/* Regular expression to check the keys and values against */
		String queryStringRegex = "\\[.*\\]";
		String keyRegex = "[a-zA-Z_]+(\\.[a-zA-Z_]+)*";
		String valueRegex = "[a-zA-ZžšõäöüŽŠÕÄÖÜ0-9-,\\.\"\\s]*";
		String valueRangeRegex = "<\\{[a-zA-Z]*\\}[^,]*,[^,]*>";
		String listRegEx = "\\{\\{.*\\}\\}";

		if (queryTextParameterString.matches(queryStringRegex)) {

			queryTextParameterString = queryTextParameterString.substring(
					queryTextParameterString.indexOf("[")+1,
					queryTextParameterString.indexOf("]"));
			String[] keyValuePairs = queryTextParameterString.split(";");

			/* Iterate over the key/value pairs */
			for (int i = 0; i < keyValuePairs.length; i++) {

				String keyValuePair = keyValuePairs[i];

				if (keyValuePair.length()!=0) {

					String[] keyValuePairArray = null;
					/* Split the key/value pair into key and value string */
					if(keyValuePair.indexOf("=") != -1) {
						if((keyValuePairArray = keyValuePair.split("=")).length != 2) {
							keyValuePairArray = new String[2];
							keyValuePairArray[0] = keyValuePair.substring(0,keyValuePair.indexOf("="));
							keyValuePairArray[1] = keyValuePair.substring(keyValuePair.indexOf("=") +1);
						}
					}
					 //old -> keyValuePair.split("=");
					

					if (keyValuePairArray != null && keyValuePairArray.length == 2) {

						String key = keyValuePairArray[0];
						String value = keyValuePairArray[1];

						/* Check whether the key is legal */
						if (key.matches(keyRegex)) {

							/* Check whether the value is legal */
//							if (value.matches(valueRegex)) {
//								/* The value is a simple value */
//
//								this.getQueryParams().put(key, value);
//
//							} else
							if (value.matches(valueRangeRegex)) {
								/* The value is of type RangeFilter and should be parsed to it */

								/* Gets the type of the RangeFilter between {} brackets */
								String type = value.substring(value.indexOf("{")+1, value.indexOf("}"));

								String valueMinMax[] = value.substring(value.indexOf("}")+1, value.indexOf(">")).split(",");

								if (valueMinMax.length == 2) {
									/*
									 * Creates the RangeFilter and inserts the values into it and inserts
									 * the RangeFilter into the queryParams of the searchFilter
									 */

									String min = valueMinMax[0];
									String max = valueMinMax[1];

									RangeFilter rf = new RangeFilter();

									if (!min.equals("null")) {
										rf.setMin(min);
									}
									if (!max.equals("null")) {
										rf.setMax(max);
									}
									rf.setType(type);
									this.getQueryTextParams().put(key, rf);

								}
							} else if(value.matches(listRegEx)) {
								//List vals = new ArrayList();
								String[] vals = value.substring(2, value.length()-2).split(",");
								List values = new ArrayList();
								for(int j = 0; j < vals.length; j++) {
									values.add(vals[j]);
								}
								this.getQueryTextParams().put(key, values);
								
							} else {
								/* FIXME: this should be an error! The value should match the
								 * regular expression either for simple text value or <{TYPE}MIN,MAX> value */
								this.getQueryTextParams().put(key, value);
							}

						} else {
							/* FIXME: this should be an error! The key should match the regular expression
							 * for it */
						}

					} else {
						/* FIXME: this should be an error! - there has to be a key and a value in a pair */
					}
				}
			}

		} else {
			/* FIXME: this should be an error! The queryParameterString should start with [ and end with ] */
		}

	}

	/**
	 * Method for parsing the columns list of the search filter into a string in the format of:
	 * [col1Property=col1Name;col2Property=col2Name;...;colNProperty=colNName]
	 * @return
	 */
	public String getQueryColumnListString() {

		/* Cycling through the columns and adding them as "column;" */
		String columnListString = "[";
		Iterator it = getColumnsList().iterator();
		while(it.hasNext()) {
			String columnPropertyName = (String) it.next();
			String columnName = (String) getColumns().get(columnPropertyName);
			columnListString += columnPropertyName + "=" + columnName + ";";
		}
		columnListString += "]";

		return columnListString;

	}

	/**
	 * Method for parsing the queryColumnListString into a map of columnPropertyName, columnName pairs
	 *
	 * @param queryColumnListString
	 */
	public void setQueryColumnsFromString(String queryColumnListString) {
		String regex = "\\[(((.*)=(.*));)*\\]";
		//String regex = "\\[(([a-zA-Z]+(\\.[a-zA-Z]+)*=[a-zA-Z,\\-\"\\.\\s\\%\\:õäöüÕÄÖÜ/]*);)*\\]";
		if(queryColumnListString.matches(regex) && queryColumnListString.length() > 2) {
			queryColumnListString = queryColumnListString.substring(
					queryColumnListString.indexOf("[")+1,
					queryColumnListString.indexOf("]"));
			String columnPropertyNameNamePairs[] = queryColumnListString.split(";");
			for (int i = 0; i < columnPropertyNameNamePairs.length; i++) {
				String columnPropertyNameNamePair = columnPropertyNameNamePairs[i];

				String columnPropertyNameNamePairArray[] = columnPropertyNameNamePair.split("=");
				if (columnPropertyNameNamePairArray.length == 2) {
					String columnPropertyName = columnPropertyNameNamePairArray[0];
					String columnName = columnPropertyNameNamePairArray[1];
					addColumn(columnPropertyName, columnName);
				}

			}

		} else {
			/* FIXME: Invalid input */
		}

	}
	/**
	 *  Method for parsing sorting parameters out of String
	 * @param sortMapString 
	 */
	public void setSortMapFromString(String sortMapString){
		Map newSortMap = new HashMap();
		
		sortMapString = sortMapString.substring(
				sortMapString.indexOf("[")+1,
				sortMapString.indexOf("]"));
		
		String sortMapKeyValuePairs[] = sortMapString.split(";");
		
		for(int i = 0; i < sortMapKeyValuePairs.length; i++){
			String sortMapKeyValuePair = sortMapKeyValuePairs[i];
			String splitKeyValue[] = sortMapKeyValuePair.split("=");
			
			if(splitKeyValue.length == 2){
				newSortMap.put(splitKeyValue[0], splitKeyValue[1]);
			}
		}
		this.setSortMap(newSortMap);
	
	}
	
	/**
	 *  Method for parsing sorting parameters out of String
	 * @param sortMapString 
	 */
	public void setQueryLabelsFromString(String queryLabelsString){
		if (queryLabelsString == null)
			return;
		HashMap newQueryLabelsMap = new HashMap();
		
		queryLabelsString = queryLabelsString.substring(
				queryLabelsString.indexOf("[")+1,
				queryLabelsString.indexOf("]"));
		
		String sortMapKeyValuePairs[] = queryLabelsString.split(";");
		
		for(int i = 0; i < sortMapKeyValuePairs.length; i++){
			String sortMapKeyValuePair = sortMapKeyValuePairs[i];
			String splitKeyValue[] = sortMapKeyValuePair.split("=");
			
			if(splitKeyValue.length == 2){
				//System.out.println("decode key:"+splitKeyValue[0]+" value:"+splitKeyValue[1]);
				newQueryLabelsMap.put(splitKeyValue[0], splitKeyValue[1]);
			}
		}
		this.setQueryLabels(newQueryLabelsMap);
	
	}

	/**
	 * @param queryTextParams the queryTextParams to set
	 */
	public void setQueryTextParams(Map<String, Object> queryTextParams) {
		this.queryTextParams = queryTextParams;
	}

	/**
	 * @return the queryTextParams
	 */
	public Map<String, Object> getQueryTextParams() {
		return queryTextParams;
	}

	public HashMap getQueryLabels() {
		return queryLabels;
	}

	public void setQueryLabels(HashMap queryLabels) {
		this.queryLabels = queryLabels;
	}

   public boolean isLimited() {
      return limited;
   }

   public void setLimited(boolean limited) {
      this.limited = limited;
   }
	
	

}
