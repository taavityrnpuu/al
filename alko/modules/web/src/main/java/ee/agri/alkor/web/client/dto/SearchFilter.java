package ee.agri.alkor.web.client.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.IsSerializable;

import ee.agri.alkor.web.client.form.SearchFormMessages;

/**
 * Base query filter for paging results.
 *
 * @author ivar
 *
 */
public class SearchFilter implements IsSerializable  {
	

	public static final String SEARCH_FILTER_OBJECT_CLASS_KEY = "searchFilterObjectClass";
	public static final String IS_NOT_NULL = " is not null ";
	public static final String LESS_THAN_CURRENT_DATE = " < current_date ";
	public static final String LESS_OR_EQUAL_THAN_CURRENT_DATE = " <= current_date ";
    public static final String NOT_LESS_THAN_CURRENT_DATE = " >= current_date ";
    public static final String BIGGER_THAN_CURRENT_DATE = " > current_date ";
    public static final String START_DATE = "start_date";
    public static final String END_DATE = "end_date";

	public static final String ASCENDING = "asc";
	public static final String DESCENDING = "desc";

	public static final String RANGE_DATE = "date";
	
	public static final String NOT_LIKE = "not_like/"; //use when not like query is needed, parameter must come after keyword not like

	private static final long serialVersionUID = 1L;

	/**
	 * Query object class name without package
	 */
	private String objectClass;

	/**
	 * Query parameters as query object bean properties.
	 */
	private Map queryParams = new HashMap();
	
	private Map queryTextValues = new HashMap();
	
	/*
	 * Where to go after selection
	 */
	private String forward;

	/* Total # of result rows */
	private int total;

	private int pageSize = 40;

	private int startIndex;

	private String orderBy = ""; //default value is empty string

	private String orderDirection;

	private List resultsList = new ArrayList();

	private Map sortMap = new HashMap();
	private Map<String, Integer> sortMapOrder = new HashMap<String, Integer>();

	private HashMap columnsMap = new HashMap();

	private List columnsList = new ArrayList();
	
	/** true kui väliskasutaja */
	private boolean limited;
	
	private boolean excel_primitive = false;


	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getPageCount()
	 */
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

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getPrevIndex()
	 */
	public int getPrevIndex() {
		return startIndex - pageSize;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getNextIndex()
	 */
	public int getNextIndex() {
		int next = startIndex + pageSize;
		return (next > total) ? -1 : next;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getPageIndexes()
	 */
	public List getPageIndexes() {
		int pageCount = getPageCount();
		List idxs = new ArrayList();
		for (int i = 0; i < pageCount; i++) {
			idxs.add(new Integer(i * pageSize));
		}
		return idxs;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getTotal()
	 */
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#setTotal(int)
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getOrderBy()
	 */
	public String getOrderBy(boolean excel_primitive) {
		return (excel_primitive ? orderBy.replaceAll("\\.", "_").toLowerCase() : orderBy);
	}
	
	public String getOrderBy() {
		return getOrderBy(false);
	}

	/**
	 * ! Deprecated
	 * Use addSortItem instead
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderDirection() {
		return orderDirection;
	}

	public void setOrderDirection(String orderDirection) {
		this.orderDirection = orderDirection;
	}

	public void addSortItem(String field) {
		if (sortMap.containsKey(field)) {
			String direction = (String)sortMap.get(field);
			if (direction.equals(ASCENDING)) {
				sortMap.put(field, DESCENDING);
			} else if (direction.equals(DESCENDING)) {
				sortMap.put(field, ASCENDING);
			} else {
				//bad sorting direction
			}
		} else {
			sortMap.put(field, ASCENDING);
		}
	}

	public void addSortItem(String field, String direction) {
		if (direction.equals(ASCENDING) || direction.equals(DESCENDING)) {
			sortMap.put(field, direction);
			sortMapOrder.put(field, Integer.MAX_VALUE);
		} else {
			//bad sorting direction
		}
	}
	
	public void addSortItem(String field, String direction, int position) {
		if (direction.equals(ASCENDING) || direction.equals(DESCENDING)) {
			sortMap.put(field, direction);
			sortMapOrder.put(field, position);
		} else {
			//bad sorting direction
		}
	}

	public void setSortMap(Map sortMap) {
		this.sortMap = sortMap;
	}

	public Map getSortMap() {
		return sortMap;
	}
	
	public Map<String, Integer> getSortMapOrder() {
		return sortMapOrder;
	}

	public void setSortMapOrder(Map<String, Integer> sortMapOrder) {
		this.sortMapOrder = sortMapOrder;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getPageSize()
	 */
	public int getPageSize() {
		return pageSize;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#setPageSize(int)
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getStartIndex()
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#setStartIndex(int)
	 */
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getResultsList()
	 */
	public List getResultsList() {
		return resultsList;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#setResultsList(java.util.List)
	 */
	public void setResultsList(List resultsList) {
		this.resultsList = resultsList;
	}

	public String getForward() {
		return forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getObjectClass()
	 */
	public String getObjectClass() {
		return objectClass;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#setObjectClass(java.lang.String)
	 */
	public void setObjectClass(String objectClass) {
		this.objectClass = objectClass;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#getQueryParams()
	 */
	public Map getQueryParams() {
		return queryParams;
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.dto.ISearchFilter#setQueryParams(java.util.Map)
	 */
	public void setQueryParams(Map queryParams) {
		this.queryParams = queryParams;
	}

	public void setColumns(HashMap columns, List columnsList) {
		this.columnsMap=columns;
		this.columnsList=columnsList;
	}

	public void addColumn(String columnPropertyName, String columnName) {
		if(!columnsList.contains(columnPropertyName)) {
			columnsMap.put(columnPropertyName, columnName);
			columnsList.add(columnPropertyName);
		}
	}
	
	public void removeColumn(String columnPropertyName) {
		if(columnsList.contains(columnPropertyName)) {
			columnsList.remove(columnPropertyName);
			columnsMap.remove(columnPropertyName);
		}
	}

	public HashMap getColumns() {
		return columnsMap;
	}

	public List getColumnsList() {
		return columnsList;
	}

	public void reset() {
		this.total = 0;
		this.startIndex = 0;
		this.queryParams.clear();
	}

	/**
	 * Method to convert the query parameters of a searchfilter into a string in the format of
	 * [key1=value1;key2=value2;...;keyN=valueN] ...etc
	 *
	 * If value is not of type String, but instead of type RangeFilter, then the value will be
	 * in the format of <MIN, MAX>
	 * @return
	 */
	public String getQueryParameterString(boolean excel_primitive) {

		String queryParameterString = new String();

		/* Cycling through every query parameter and parsing it into string */
		queryParameterString += "[";
		Iterator it = getQueryParams().keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			Object value = getQueryParams().get(key);
			
			if(excel_primitive){
				key = key.replaceAll("\\.", "_").toLowerCase();
			}

			/* If the value is a string then parse it to a "key=value;" item */
			if (value instanceof String || value instanceof Long) {
				queryParameterString += key + "=" + value + ";";

			/* If the value is a RangeFilter then parse it to a "key=<MIN,MAX>" item */
			} else if (value instanceof RangeFilter) {
				RangeFilter rangeFilter = (RangeFilter) value;
				queryParameterString += key + "=" +
						"<" +
						"{" + rangeFilter.getType() + "}"
						    + rangeFilter.getMin() +
						"," + rangeFilter.getMax() +
						">;";

			/* Exceptional case - should not happen - all values should be either
			 * of type String or RangeFilter */
			} else if (value instanceof java.util.Date) {
				queryParameterString += key + "=" + value + ";";
			} else if (value instanceof List && ((List)value).size() != 0) {
				StringBuffer sb = new StringBuffer();
				sb.append(key+ "={{");
				Iterator iter = ((List)value).iterator();
				while(iter.hasNext()) {
					sb.append(iter.next());
					if(iter.hasNext()) {
						sb.append(",");
					}
				}
				sb.append("}};");
				queryParameterString += sb.toString();
			} else {
				//Window.alert("exceptional case! queryParams key=" + key + ", value=" + value);
			}
		}
		queryParameterString += "]";

		return queryParameterString;

	}
	public String getQueryParameterString() {
		return getQueryParameterString(false);
	}

	/**
	 * Method for parsing the columns list of the search filter into a string in the format of:
	 * [col1Property=col1Name;col2Property=col2Name;...;colNProperty=colNName]
	 * @return
	 */
	public String getQueryColumnListString(boolean excel_primitive) {

		/* Cycling through the columns and adding them as "column;" */
		String columnListString = "[";
		Iterator it = getColumnsList().iterator();
		//System.out.println(getColumnsList());
		while(it.hasNext()) {
			String columnPropertyName = (String) it.next();
			if (columnPropertyName == null || columnPropertyName.equals("null")) {
				continue;
			}
			
			String columnName = (String) getColumns().get(columnPropertyName);
			if(excel_primitive){
				columnPropertyName = columnPropertyName.replaceAll("\\.", "_").toLowerCase();
			}
			columnListString += columnPropertyName + "=" + columnName + ";";
		}
		columnListString += "]";

		return columnListString;

	}
	public String getQueryColumnListString() {
		return getQueryColumnListString(false);
	}
	
	/**
	 * Method for parsing the sortMap of the search filter into a string in the format of:
	 * [key=value;key=value;...;key=value]
	 * @return
	 */
	public String getsortMapString(boolean excel_primitive) {

		System.out.println("Executing getsortMapString "+ (this.sortMap == null ? -1 : this.sortMap.size()));
		
		String sortMapString = "[";
		Iterator it = sortMap.entrySet().iterator();
		
	    while (it.hasNext()) {
	        Map.Entry pairs = (Map.Entry)it.next();
	        String key = (String)pairs.getKey();
	        String value = (String)pairs.getValue();
	        if(excel_primitive){
	        	key.replaceAll("\\.", "_").toLowerCase();
	        	value.replaceAll("\\.", "_").toLowerCase();
	        }
	        sortMapString +=key+"="+value+";";
	    }

		sortMapString += "]";
		System.out.println("getsortMapString finished :"+sortMapString+" sf:"+this);
		return sortMapString;

	}
	public String getsortMapString() {
		return getsortMapString(false);
	}
	
	/**
	 * Method for parsing the constants of the search filter into a string in the format of:
	 * [key=value;key=value;...;key=value]
	 * @return
	 */
	public String getQueryTextLabelsString(boolean excel_primitive) {
		String constantsString = null;
		String key = null;
		String value = null;
		ConstantsWithLookup constants = (ConstantsWithLookup)getConstants();
		Iterator it = getQueryTextValues().keySet().iterator();
		constantsString += "[";
		while(it.hasNext()){
			key = (String)it.next();
			value = getLabel(key,constants);
			if(excel_primitive){
				key = key.replaceAll("\\.", "_").toLowerCase();
			}
			//System.out.println("encode key:"+key+" value:"+value);
			constantsString += key + "=" + value + ";";
		}
		constantsString += "]";
		return constantsString;

	}
	public String getQueryTextLabelsString() {
		return getQueryTextLabelsString(false);
	}
	
	public void setQueryTextValues(Map map) {
		this.queryTextValues = map;
	}
	
	public Map getQueryTextValues() {
		return this.queryTextValues;
	}

	/**
	 * Method to convert the query parameter text of a searchfilter into a string in the format of
	 * [key1=value1;key2=value2;...;keyN=valueN] ...etc
	 *
	 * If value is not of type String, but instead of type RangeFilter, then the value will be
	 * in the format of <MIN, MAX>
	 * @return
	 */
	public String getQueryTextValuesString(boolean excel_primitive) {

		String queryParameterString = new String();

		/* Cycling through every query parameter and parsing it into string */
		queryParameterString += "[";
		Iterator it = getQueryTextValues().keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			Object value = getQueryTextValues().get(key);
			System.out.println("------ KEY: "+key);
			if(excel_primitive){
				key = key.replaceAll("\\.", "_").toLowerCase();
			}

			/* If the value is a string then parse it to a "key=value;" item */
			if (value instanceof String || value instanceof Long) {
				queryParameterString += key + "=" + value + ";";

			/* If the value is a RangeFilter then parse it to a "key=<MIN,MAX>" item */
			} else if (value instanceof RangeFilter) {
				RangeFilter rangeFilter = (RangeFilter) value;
				queryParameterString += key + "=" +
						"<" +
						"{" + rangeFilter.getType() + "}"
						    + rangeFilter.getMin() +
						"," + rangeFilter.getMax() +
						">;";

			/* Exceptional case - should not happen - all values should be either
			 * of type String or RangeFilter */
			} else if (value instanceof java.util.Date) {
				queryParameterString += key + "=" + value + ";";
			} else if (value instanceof List && ((List)value).size() != 0) {
				StringBuffer sb = new StringBuffer();
				sb.append(key+ "={{");
				Iterator iter = ((List)value).iterator();
				while(iter.hasNext()) {
					sb.append(iter.next());
					if(iter.hasNext()) {
						sb.append(",");
					}
				}
				sb.append("}};");
				queryParameterString += sb.toString();
			} else {
				//System.out.println("exceptional case! queryParams key=" + key + ", value=" + value);
			}
		}
		queryParameterString += "]";

		return queryParameterString;

	}
	public String getQueryTextValuesString() {
		return getQueryTextValuesString(false);
	}
	
	/*
	 *FIXME : Constants should be available for all Messages classes,
	 *	currently only  SearchFormMessages needed
	 */
	public Object getConstants() {
		return GWT.create(SearchFormMessages.class);
	}
	public String getLabel(String key,ConstantsWithLookup constants) {
	      String parsed = key.replace('.', '_');
	      try {
	         return constants.getString(parsed);
	      } catch (Exception e) {
	         return "Unknown";
	      }
	   }

   public boolean isLimited() {
      return limited;
   }

   public void setLimited(boolean limited) {
      this.limited = limited;
   }
   
   public boolean isExcelPrimitive() {
      return excel_primitive;
   }

   public void setExcelPrimitive(boolean excel_primitive) {
      this.excel_primitive = excel_primitive;
   }
   
	
}