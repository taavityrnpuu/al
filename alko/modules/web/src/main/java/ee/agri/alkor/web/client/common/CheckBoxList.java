package ee.agri.alkor.web.client.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

import ee.agri.alkor.web.client.dto.ClassItemMap;

/**
 * Array of checkboxes correspondig to
 * one value property. Used in EnterpriseDetails.
 *
 * @author suisalu
 *
 */
public class CheckBoxList extends Composite implements IResetable {

	private Map checkBoxMap;
	private FlexTable table;

	public CheckBoxList() {
		super();
		this.checkBoxMap = new HashMap();
		this.table = new FlexTable();
		initWidget(table);
	}

	public void addItem(String labelName, String checkCode) {
		int curr = table.getRowCount() + 1;
		table.setText(curr, 0, labelName + ":");
		table.getFlexCellFormatter().setHorizontalAlignment(curr, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		table.getFlexCellFormatter().setStyleName(curr, 0, "Label");
        CheckBox cb = new CheckBox();
        cb.setName(checkCode);
        table.setWidget(curr, 2, cb);
        this.checkBoxMap.put(checkCode, cb);
	}

	public void setChecked(boolean checked) {
		for(Iterator it = this.checkBoxMap.keySet().iterator();it.hasNext();) {
			CheckBox cb = (CheckBox)this.checkBoxMap.get(it.next());
			cb.setChecked(checked);
		}

	}
	public void setValues(List values) {
		setChecked(false);
		int i = 0;
		for(Iterator it = values.iterator();it.hasNext();i++) {
			Object value = it.next();
			String code = null;
			if(value instanceof String)
				code = (String)value;
			else if(value instanceof ClassItemMap) {
				code = (String)((Map)value).get(ClassItemMap.CODE);
			}
			CheckBox cb = (CheckBox)this.checkBoxMap.get(code);
			if(cb != null) cb.setChecked(true);
		}
	}

	public List getValues() {
		List values = new ArrayList();

		for(Iterator it = this.checkBoxMap.keySet().iterator();it.hasNext();) {
			CheckBox cb = (CheckBox)this.checkBoxMap.get(it.next());
			if(cb.isChecked()) values.add(cb.getName());
		}

		return values;
	}
	
	/**
	 * The item names of the checkboxes
	 * @return
	 */
	public List getValueNames() {
		List values = new ArrayList();

		for(Iterator it = this.checkBoxMap.keySet().iterator();it.hasNext();) {
			CheckBox cb = (CheckBox)this.checkBoxMap.get(it.next());
			if(cb.isChecked()) values.add(cb.getText());
		}
		if(values.size() != 0) {
			return values;
		} else {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.common.IResetable#clear()
	 */
	public void clear() {
		// TODO Auto-generated method stub
		setChecked(false);
	}
}
