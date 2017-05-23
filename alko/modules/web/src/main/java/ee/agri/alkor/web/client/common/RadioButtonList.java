package ee.agri.alkor.web.client.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;

/**
 * Radiobuttons group corresponding to one
 * form field. Used in DecisonForm.
 *
 * @author suisalu
 *
 */
public class RadioButtonList extends Composite implements IResetable{

	private String groupName;
	private Map buttonsMap;
	private FlexTable table;

	public RadioButtonList(String groupName) {
		super();
		this.groupName = groupName;
		this.buttonsMap = new HashMap();
		this.table = new FlexTable();
		initWidget(table);
	}

	public void addItem(String labelName, String buttonCode) {
		int curr = table.getRowCount() + 1;
        RadioButton rb = new RadioButton(this.groupName, labelName);
        rb.setName(buttonCode);

        rb.addClickListener(new ClickListener() {
        	public void onClick(Widget sender) {
        		RadioButton cb = (RadioButton)sender;
        		resetButtons();
        		cb.setChecked(true);
        	}
        });
        table.setWidget(curr, 0, rb);
        this.buttonsMap.put(buttonCode, rb);
	}

	public void setChecked(String buttonCode, boolean checked) {
		RadioButton rb = (RadioButton) this.buttonsMap.get(buttonCode);
		if(rb != null)
			rb.setChecked(checked);
	}

	public void setValue(String buttonCode) {
		setChecked(buttonCode, true);
	}

	public String getValue() {
		for(Iterator it = this.buttonsMap.keySet().iterator();it.hasNext();) {
			RadioButton rb = (RadioButton)this.buttonsMap.get(it.next());
			if(rb.isChecked()) return rb.getName();
		}

		return null;
	}
	
	/**
	 * 
	 * @return the display value of the selected radio button
	 */
	public String getValueText() {
		for(Iterator it = this.buttonsMap.keySet().iterator();it.hasNext();) {
			RadioButton rb = (RadioButton)this.buttonsMap.get(it.next());
			if(rb.isChecked()) return rb.getText();
		}

		return null;
	}

	public Set getButtonCodes() {
		return this.buttonsMap.keySet();
	}

	public void resetButtons() {
		Iterator it = this.buttonsMap.keySet().iterator();
		while(it.hasNext()) {
			((RadioButton)this.buttonsMap.get(it.next())).setChecked(false);
		}
	}
   
   public void setEnabled(boolean enabled) {
      Iterator it = this.buttonsMap.keySet().iterator();
      while(it.hasNext()) {
         ((RadioButton)this.buttonsMap.get(it.next())).setEnabled(enabled);
      }
   }

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.common.IResetable#clear()
	 */
	public void clear() {
		resetButtons();
	}
}
