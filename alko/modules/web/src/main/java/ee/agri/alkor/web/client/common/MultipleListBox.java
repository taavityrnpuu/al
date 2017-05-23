package ee.agri.alkor.web.client.common;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class MultipleListBox extends Composite {

//	private String labels;
	private Label label;
	private ListBox list;

	public MultipleListBox() {
		super();
//		labels = new String();
		label = new Label();
		list = new ListBox();
		list.setMultipleSelect(true);
		list.addChangeListener(new ListBoxChangeListener());
		list.setVisibleItemCount(5);
		list.setWidth("100%");

		Grid grid = new Grid(2, 1);
		grid.setWidget(0, 0, label);
		grid.setWidget(1, 0, list);
		grid.getCellFormatter().setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setVerticalAlignment(1, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		grid.setSize("100%", "100%");
	    grid.getCellFormatter().setWidth(0, 0, "100%");
	    grid.getCellFormatter().setWidth(1, 0, "100%");
	    grid.getCellFormatter().setHeight(0, 0, "100%");
	    grid.getCellFormatter().setHeight(1, 0, "100%");
	    grid.setCellSpacing(0);
	    grid.setCellPadding(0);
	    grid.setWidth("100%");

		initWidget(grid);

	}

	public void addItem(String item) {
		list.addItem(item);
	}

	public void setVisibleItemCount(int count) {
		list.setVisibleItemCount(count);
	}

	public void setWidth(String width) {
		list.setWidth(width);
		label.setWidth(width);
	}
	
	public ListBox getListBox() {
		return list;
	}
	
	public List getSelectedItems() {
		List selectedItems = new ArrayList();
		for (int i = 0; i < list.getItemCount(); i++) {
			if (list.isItemSelected(i)) {
				String s = list.getValue(i);
				//Paneb parameetri kaasa ainult juhul kui see ei ole tyhi
				if (!isEmptyParam(s)) {
					selectedItems.add(list.getValue(i));
				}
			}
		}
		
		return selectedItems;
	}
	
	public List getSelectedItemNames() {
		List selectedItems = new ArrayList();
		for (int i = 0; i < list.getItemCount(); i++) {
			if (list.isItemSelected(i)) {
				String s = list.getValue(i);
				//Paneb parameetri kaasa ainult juhul kui see ei ole tyhi
				if (!isEmptyParam(s)) {
					selectedItems.add(list.getItemText(i));
				}
			}
		}
		
		return selectedItems;
	}
	
	private class ListBoxChangeListener implements ChangeListener {

		public void onChange(Widget sender) {

			String labels = "";
			for(int i = 0; i < list.getItemCount(); i++) {
				if(list.isItemSelected(i)) {
					String s = list.getItemText(i);
					if (s != null && !s.equals("")) {
						labels += list.getItemText(i) + "; ";
					}
				}
			}
			label.setText(labels);

		}

	}
	
	private boolean isEmptyParam(String s) {
		if (s == null || s.equals("") || s.equals("null")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Resets the value of the multiplelistbox.
	 */
	public void reset() {
		label.setText("");
		list.setSelectedIndex(-1);
	}

}
