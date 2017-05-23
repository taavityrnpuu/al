package ee.agri.alkor.web.client.common;

import java.util.HashMap;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;

public class YesNoRadioBox extends Composite implements IResetable {

	RadioButtonWMemory buttonTrue; //uses a ResetClick listener
	RadioButtonWMemory buttonFalse;//uses a ResetClick listener
	HashMap lastStats = new HashMap();

	public YesNoRadioBox() {
		super();

		Grid grid = new Grid(1, 5);
		grid.setText(0, 0, "Jah");
		buttonTrue = new RadioButtonWMemory("yesNo");
		buttonTrue.setName("true_"+this.hashCode()); // hashcode is added to group radiobuttons correctly
		buttonTrue.addClickListener(new ClickListener() {
			public void onClick(Widget arg0) {
				buttonTrue.setChecked(true);
				buttonFalse.setChecked(false);
			}
		});
		grid.setWidget(0, 1, buttonTrue);
		grid.setWidget(0, 2, UIutils.createSpacer(3, 1));
		grid.setText(0, 3, "Ei");
		buttonFalse = new RadioButtonWMemory("yesNo");
		buttonFalse.setName("false_"+this.hashCode());
		buttonFalse.addClickListener(new ClickListener() {
			public void onClick(Widget arg0) {
				buttonFalse.setChecked(true);
				buttonTrue.setChecked(false);
			}
		});
		grid.setWidget(0, 4, buttonFalse);

		grid.setSize("5em", "100%");
		lastStats.put(buttonTrue, new Boolean(false));
		lastStats.put(buttonFalse, new Boolean(true));
		initWidget(grid);

	}

	/* (non-Javadoc)
	 * @see ee.agri.alkor.web.client.common.IResetable#clear()
	 */
	public void clear() {
		buttonTrue.setChecked(false);
		buttonFalse.setChecked(false);
	}

	public String getValue() {
		if(buttonTrue.getValue()) {
			return buttonTrue.getName().split("_")[0];
		} else if (buttonFalse.getValue()) {
			return buttonFalse.getName().split("_")[0];
		} else
			return null;
	}
	
	public void setDefaultValue(boolean isTrue){
		if(isTrue){
			buttonTrue.setValue(true);
			buttonFalse.setValue(false);
		}else{
			buttonTrue.setValue(false);
			buttonFalse.setValue(true);
		}
	}
	
	public String getValueText() {
		if(buttonTrue.getValue()) {
			return "Jah";
		} else if (buttonFalse.getValue()) {
			return "Ei";
		} else
			return null;
	}

	private class RadioButtonWMemory extends RadioButton {
		private boolean previousState;

		/**
		 *
		 */
		public RadioButtonWMemory() {
			this("");
		}

		public RadioButtonWMemory(String group) {
			super(group);
			previousState = false;
		}

		public boolean getPreviousState() {
			return previousState;
		}

		/**
		 * @param previousState the previousState to set
		 */
		public void setPreviousState(boolean previousState) {
			this.previousState = previousState;
		}

		public void setChecked(boolean arg0) {
			if(arg0) {
				if(((Boolean)lastStats.get(this)).booleanValue()) {
					clear();
				} else {
					lastStats.remove(this);
					lastStats.put(this, new Boolean(true));
					super.setValue(arg0);
				}
			} else {
				lastStats.remove(this);
				lastStats.put(this, new Boolean(false));
				super.setValue(arg0);
			}
		}
		
		
		protected void onDetach() {
			boolean wasChecked = this.getValue();
			super.onDetach();
			//call explicitly to maintain right state when moving between forms
			if(wasChecked)
			{
				setChecked(true);
			}
		}
		
	}

}
