package ee.agri.alkor.web.client.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * HashMap implementation that "preserves" the ordering of the elements how they are added.
 * The ordering is maintained through an ArrayList which holds the ordering of the entered keys
 *
 * Upon invoking put(Object key, Object value) the key is added to the ArrayList and the key,value
 * pair is added to the underlying HashMap. When invoking keyList() the user will get the contents
 * of the ArrayList and iterating through it will give the keys of the items in order of input.
 *
 * @author sven
 *
 *
 */
public class LinkedHashMap implements IsSerializable{

	/**
	 * ArrayList backing up the ordering
	 */
	private ArrayList keys;
	
	private HashMap map;

	/**
	 * Constructor method initialising the ArrayList backing up the ordering.
	 *
	 */
	public LinkedHashMap() {
		keys = new ArrayList();
		map = new HashMap();
	}

	/**
	 * Method for retrieving the key list in order of input (FIFO)
	 *
	 * @return List a list of keys in order of input
	 */
	public List keyList() {
		return keys;
	}

	/**
	 * Method for inserting new items into the LinkedHashMap
	 *
	 * This method checks whether there is already such a key in the map - if there is then it will
	 * overwrite the item and remove its key from the backing ArrayList effectively deleting the previous
	 * entry. After that it will add the new key,value pair to the underlying Map and add the key to the
	 * ordered list of input
	 *
	 * @param key
	 * @param value
	 */
	public Object put(Object key, Object value) {
		if(keys.contains(key)) {
			keys.remove(key);
		}
		keys.add(key);
		return map.put(key, value);
	}

	/**
	 * Removes the value associated with the key and returns it.
	 *
	 * @param key
	 *
	 * @return value
	 */
	public Object remove(Object key) {
		keys.remove(key);
		return map.remove(key);
	}
	
	public Object get(Object key) {
		return map.get(key);
	}

}
