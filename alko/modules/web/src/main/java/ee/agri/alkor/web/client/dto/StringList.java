package ee.agri.alkor.web.client.dto;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class StringList implements IsSerializable {
	
	private ArrayList internalList = new ArrayList();
	
	public String get(int idx) {
		return (String)internalList.get(idx);
	}

	public void add(String str) {
		internalList.add(str);
	}
	
	public int size() {
		return internalList.size();
	}
	
	public void clear() {
		internalList.clear();
	}
}
