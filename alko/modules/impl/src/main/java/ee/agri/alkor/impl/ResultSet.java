package ee.agri.alkor.impl;

import java.math.BigInteger;
import java.sql.ResultSetMetaData;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ResultSet {

	private Map<Integer, Map<String, Object>> objects = new HashMap<Integer, Map<String, Object>>();

	private int index = 0;
	private int max_index = 0;

	private boolean isBeforeFirst = false;
	private boolean wasNull = false;

	public ResultSet(java.sql.ResultSet rs) {

		ResultSetMetaData rsmd;
		try {
			rsmd = rs.getMetaData();

			wasNull = rs.wasNull();
			isBeforeFirst = rs.isBeforeFirst();

			int columns = rsmd.getColumnCount();

			while (rs.next()) {

				Map<String, Object> row_objects = new HashMap<String, Object>();

				for (int i = 1; i < (columns + 1); i++) {
					row_objects.put(rsmd.getColumnLabel(i), rs.getObject(i));
				}

				max_index++;
				objects.put(max_index, row_objects);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean wasNull() {
		return wasNull;
	}

	public boolean isBeforeFirst() {
		return isBeforeFirst;
	}

	public boolean next() {
		index++;
		if (index > max_index) {
			return false;
		}
		return true;
	}

	public String getString(String key) {
		if (objects.get(index) != null) {
			try {
				return String.valueOf(objects.get(index).get(key));
			} catch (Exception x) {
				x.printStackTrace();
			}
		}
		return null;
	}

	public Float getFloat(String key) {
		if (objects.get(index) != null && !objects.get(index).equals("null")) {
			try {
				if (objects.get(index).get(key) instanceof Float) {
					return (Float) objects.get(index).get(key);
				}
				return Float.valueOf(String.valueOf(objects.get(index).get(key)));
			} catch (Exception x) {
				x.printStackTrace();
			}
		}
		return 0f;
	}

	public Long getLong(String key) {
		if (objects.get(index) != null && !objects.get(index).equals("null")) {
			try {
				if (objects.get(index).get(key) instanceof Long) {
					return (Long) objects.get(index).get(key);
				}
				else if (objects.get(index).get(key) instanceof BigInteger) {
					return ((BigInteger) objects.get(index).get(key)).longValue();
				}
				return Long.parseLong(String.valueOf(objects.get(index).get(key)));
			} catch (Exception x) {
				x.printStackTrace();
			}
		}
		return 0l;
	}

	public Integer getInteger(String key) {
		if (objects.get(index) != null && !objects.get(index).equals("null")) {
			try {
				if (objects.get(index).get(key) instanceof Integer) {
					return (Integer) objects.get(index).get(key);
				}
				return Integer.parseInt(String.valueOf(objects.get(index).get(key)));
			} catch (Exception x) {
				x.printStackTrace();
			}
		}
		return 0;
	}

	public Double getDouble(String key) {
		if (objects.get(index) != null && !objects.get(index).equals("null")) {
			if (objects.get(index).get(key) instanceof Double) {
				return (Double) objects.get(index).get(key);
			}
			return Double.parseDouble(String.valueOf(objects.get(index).get(key)));
		}
		return null;
	}

	public Date getDate(String key) {
		if (objects.get(index) != null) {
			if (objects.get(index).get(key) instanceof Date) {
				return (Date) objects.get(index).get(key);
			}
		}
		return null;
	}

	public Boolean getBoolean(String key) {
		if (objects.get(index) != null) {
			if (objects.get(index).get(key) instanceof Boolean) {
				return Boolean.valueOf(String.valueOf(objects.get(index).get(key)));
			} else if (objects.get(index).get(key) instanceof String) {
				return ((String) objects.get(index).get(key) == "false" || (String) objects.get(index).get(key) == "0"
						|| objects.get(index).get(key) == null);
			} else if (objects.get(index).get(key) instanceof Integer) {
				return ((Integer) objects.get(index).get(key) == 1 ? true : false);
			}
		}
		return false;
	}

	public Timestamp getTimestamp(String key) {
		if (objects.get(index) != null && objects.get(index).get(key) instanceof Timestamp) {
			return (Timestamp) objects.get(index).get(key);
		}
		return null;
	}

	public Object getObject(String key) {
		if (objects.get(index) != null) {
			return objects.get(index).get(key);
		}
		return null;
	}
}
