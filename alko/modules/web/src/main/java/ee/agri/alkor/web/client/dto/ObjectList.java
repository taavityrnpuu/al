package ee.agri.alkor.web.client.dto;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ObjectList implements IsSerializable {
	
	private ArrayList internalList = new ArrayList();
	
	public Object get(int idx) {
		return internalList.get(idx);
	}

	public void add(Object obj) {
		internalList.add(obj);
	}
	
	public int size() {
		return internalList.size();
	}
	
	public void clear() {
		internalList.clear();
	}
}
