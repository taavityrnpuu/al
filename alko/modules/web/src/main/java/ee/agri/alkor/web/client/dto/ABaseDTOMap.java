package ee.agri.alkor.web.client.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import com.google.gwt.user.client.rpc.IsSerializable;

public class ABaseDTOMap extends HashMap

implements IsSerializable, Cloneable {

	public ABaseDTOMap() {
		super();
	}

	public ABaseDTOMap(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
		// TODO Auto-generated constructor stub
	}

	public ABaseDTOMap(int initialCapacity) {
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}

	public ABaseDTOMap(Map m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	public static final String ID = "id";
	
	public static final String CREATED = "created";

	public static final String VERSION = "version";

	public static final String CODE = "code";

	public static final String MODIFIED_BY = "modifiedBy";
	
	public static final String CREATED_BY = "createdBy";

	public String getText(String key) {
		Object value = getProperty(key);
		if (value instanceof String) {
			return (String) value;
		} else if (value != null) {
			return value.toString();
		}
		return null;
	}

	public Object getProperty(String key) {
		Object value = null;
		int idx = key.indexOf(".");
		if (idx > 0) {
			String prefix = key.substring(0, idx);
			Object o = get(prefix);
			if (o instanceof ArrayList) {
				return o;
			} else {
				ABaseDTOMap map = (ABaseDTOMap) o;
				if (map == null)
					return null;
				String remains = key.substring(idx + 1);
				return map.getProperty(remains);
			}
		} else {
			Object valueObj = get(key); // TODO verify that this is needed.
			if (valueObj instanceof ClassItemMap)
				value = ((ABaseDTOMap) valueObj).getProperty(ClassItemMap.NAME);
			else
				value = valueObj;

		}
		return value;
	}

	public void setProperty(String propertyName, Object value) {
		int idx = propertyName.indexOf(".");
		if (idx > 0) {
			String prefix = propertyName.substring(0, idx);
			ABaseDTOMap map = (ABaseDTOMap) get(prefix);
			if (map == null) {
				map = new ABaseDTOMap();
				put(prefix, map);
			}
			String remains = propertyName.substring(idx + 1);
			map.setProperty(remains, value);
		} else {
			this.put(propertyName, value);
		}
	}

	public void reset() {
		// this.reset(); FIXME: this causes a stack overflow
	}

	public StringList getKeyList() {
		StringList list = new StringList();
		Set keys = keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String key = (String)it.next();
			list.add(key);
		}
		return list;
	}
}