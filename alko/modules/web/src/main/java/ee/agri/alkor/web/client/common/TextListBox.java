package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasName;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
/**
 * Widget consisting of TextBox and
 * ListBox. used in ProductsForm etc.
 *
 * @author suisalu
 *
 */
public class TextListBox extends  Composite implements HasName, IResetable {

	private TextBox text;
	private ListBox list;

	private String value;

	private String name;

	public TextListBox(String textWidth,  String listWidth) {
		super();

		this.text = new TextBox();
		this.text.setWidth(textWidth);
		this.list = new ListBox();
		this.list.setWidth(listWidth);
		this.text.addChangeListener(new MyChangeListener());
		this.list.addChangeListener(new MyChangeListener());
		Grid grid = new Grid(1,3);
		grid.setWidget(0, 0, this.text);
      grid.setWidget(0, 1, UIutils.createSpacer(3, 1));
		grid.setWidget(0, 2, this.list);
		//grid.getCellFormatter().setWidth(0, 0, "100%");
		//grid.getCellFormatter().setWidth(0, 1, "100%");
		grid.getCellFormatter().setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setVerticalAlignment(0, 2, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.setSize("100%", "100%");
      grid.getCellFormatter().setWidth(0, 0, "18%");
      grid.getCellFormatter().setWidth(0, 2, "80%");
      grid.setCellSpacing(0);
      grid.setCellPadding(0);
		initWidget(grid);
	}

	public ListBox getListBox() { return this.list; }

	public String getText() {
		return this.value;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setText(String value) {
		this.value = value;
		this.text.setText(value);
		for(int i = 0;i < this.list.getItemCount();i++) {
			String listText =  this.list.getValue(i);
			if("".equals(value)) {
				this.list.setSelectedIndex(0);
			} else if(listText.equals(value)) {
				 this.list.setSelectedIndex(i);
				 break;
			}
		}

	}
   
   public void setEnabled(boolean enabled) {
      this.text.setEnabled(enabled);
      this.list.setEnabled(enabled);
   }

	private class MyChangeListener implements ChangeListener {
		public void onChange(Widget sender) {
			if(sender == text) {
				setText(text.getText());
			} else if(sender == TextListBox.this.list) {
				String listValue = null;
		        if(TextListBox.this.list.getSelectedIndex() >= 0)
		        	listValue = TextListBox.this.list.getValue(TextListBox.this.list.getSelectedIndex());
		        value = listValue;
		        if(value == null || value.equals("null")) {
		        	text.setText("");
		        } else {
		        	text.setText(listValue);
		        }
			}
		}
	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.common.IResetable#clear()
	 */
	public void clear() {
		// TODO Auto-generated method stub
		setText("");
	}
	
	public void setListTabIndex(int index){
		this.list.setTabIndex(index);
	}
	public void setTextTabIndex(int index){
		this.text.setTabIndex(index);
	}
	
	/**
	 * Checks if an item is in the list or not. If not then the item is added
	 * @param name - display name of the item
	 * @param value - value of the item
	 */
	public void addItemWhenMissing(String name, String value) {
		boolean isPresent = false;
        for (int i = 0; i < list.getItemCount(); i++) {
           String listText = list.getValue(i);
           if (listText.equals(value)) {
              list.setSelectedIndex(i);
              isPresent = true;
              return;
           }
        }
        //When a value is missing from it's listbox, then it's added
        if(!isPresent) {
        	list.addItem(name, value);
        }
	}
	
	public String getValueText() {
		return list.getItemText(list.getSelectedIndex());
	}
}
