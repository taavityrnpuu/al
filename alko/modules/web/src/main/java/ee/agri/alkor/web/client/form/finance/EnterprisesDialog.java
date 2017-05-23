package ee.agri.alkor.web.client.form.finance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.EnterpriseSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;

/**
 * Ettevõttete otsimise dialog.
 *
 * @author viktorb
 */
public class EnterprisesDialog extends PopupPanel implements ClickListener {

    private FlexTable enterprises = new FlexTable();
    private SearchFilter filter = new EnterpriseSearchFilter();
    private DialogSaver parent;

    private SearchDialogTable table;

    /**
     * Loob ettevõttete otsimise dialogi.
     */
    public EnterprisesDialog(DialogSaver parent) {
    	super();
    	this.parent = parent;
    	init();
    }

    public void init() {

       List columns = new ArrayList();
       columns.add(EnterpriseSearchFilter.NAME);
       columns.add(EnterpriseSearchFilter.REG_NR);

       table = new SearchDialogTable(filter, columns);

       HorizontalPanel buttons = new HorizontalPanel();
       Button cancel = new Button("Loobu", this);
       Button save = new Button("Salvesta seos", this);
       cancel.setWidth("8em");
       save.setWidth("8em");
       buttons.add(UIutils.createSpacer(
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
    		  UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
       buttons.add(cancel);
       buttons.add(UIutils.createSpacer(6, 1));
       buttons.add(save);

       FlexTable main = new FlexTable();
       main.setCellPadding(0);
       main.setCellSpacing(15);
       main.setWidget(0, 0, table);
       main.setWidget(1, 0, buttons);
       FlexCellFormatter cellFormatter = main.getFlexCellFormatter();
       cellFormatter.setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_LEFT);
       cellFormatter.setColSpan(1, 0, 2);
       setWidget(main);
       setStyleName("Dialog");
    }

    public void onClick(Widget sender) {
       String buttonText = ((Button) sender).getText();
       if ("Loobu".equals(buttonText)) {
          hide();
       } else if ("Otsi".equals(buttonText)) {
          // TODO Siin teha ettevõttete otsingu toimingu!
//          getEnterprises.invoke();
          hide(); // need hide() ja show() on vaja siin, et Firefox kasutamisel
          show(); // ei ilmunud valge riba paremale
       } else if ("Salvesta seos".equals(buttonText)) {
    	   ABaseDTOMap selectedItem = table.getSelectedItem();
    	   if (selectedItem != null) {
    		   parent.saveResults(table.getSelectedItem());
    		   hide();
    	   }
       }
    }

    private class SearchDialogTable extends FlexTable implements AsyncCallback {

    	private List data;

    	private List columns;

		private ABaseDTOMap selectedItem;

    	private ResultTable resultTable;

    	private TextBox searchBox;

    	private SearchFilter filter;

    	/**
    	 *
    	 * @param data - the list of dataObjects to be displayed in the table
    	 * @param fieldNames - the list of the fields to be displayed for each object
    	 * @param returnMap - the returning map
    	 */
    	public SearchDialogTable(SearchFilter filter, List columns) {

    		this.filter = filter;



    	    searchBox = new TextBox();
    	    searchBox.setWidth("100%");

    	    Button searchButton = new Button("Otsi");
    	    searchButton.setWidth("6em");
    	    searchButton.addClickListener(new ClickListener() {
    	    	public void onClick(Widget w) {
    	    		search(searchBox.getText());
    	    	}
    	    });

    	    resultTable = new ResultTable(columns);

    	    search(null);

    	    ScrollPanel results = new ScrollPanel(resultTable);
    	    results.setStyleName("ScrollPanel");
    	    results.setHeight("100px");
    	    resultTable.setWidth("100%");
    	    resultTable.addTableListener(new DialogTableListener());

    	    this.setWidget(0, 0, searchBox);
    	    this.setWidget(0, 1, searchButton);
    	    this.setWidget(1, 0, results);
    	    this.getFlexCellFormatter().setWidth(0, 0, "77%");
    	    this.getFlexCellFormatter().setColSpan(1, 0, 2);

    	}

    	public ABaseDTOMap getSelectedItem() {
    		return selectedItem;
    	}

    	private void search(String searchString) {
    		if (searchString != null) {
    			filter.getQueryParams().put(EnterpriseSearchFilter.NAME, searchString);
    			
    		}
    		//only applicants in results
			filter.getQueryParams().put(EnterpriseSearchFilter.ENTERPRISE_ROLE, "APL");
    		ServiceContext.getInstance().getRegistryService().search(filter, this);
    	}

    	public void onSuccess(Object result) {
    		this.filter = (SearchFilter) result;
    		List resultList = filter.getResultsList();
    		resultTable.setData(resultList);
    	}

    	public void onFailure(Throwable t) {
    		Window.alert("SearchDialogTable failure: " + t);
    	}

        private class DialogTableListener implements TableListener {

        	public void onCellClicked(SourcesTableEvents evt, int row, int col) {
                int ncol = (col == 0) ? 1 : 0;
                for (int i = 0; i < resultTable.getRowCount(); i++) {
                   String style = (i == row) ? "Selected" : "Unselected";
                   resultTable.getFlexCellFormatter().setStyleName(i, col, style);
                   resultTable.getFlexCellFormatter().setStyleName(i, ncol, style);
                   selectedItem = (ABaseDTOMap)resultTable.getData().get(row);
                }

        	}

        }

        private class ResultTable extends FlexTable {

        	private List data;
        	private List fields;

        	public ResultTable(List fields) {
        		this.fields = fields;
        	}

    		public void setData(List data) {
    			this.data = data;
    			clearTable();
    			populateTable();
    			selectedItem = null;
    		}

    		public List getData() {
    			return data;
    		}

    		private void clearTable() {
//        		if (this.getRowCount() > 0) {
//        			this.removeRow(0);
//        		}
    			while(this.getRowCount() > 0) {
    				this.removeRow(0);
    			}
        		//this.clear();

    		}

        	private void populateTable() {

        		int i = 0;
        		for (Iterator it = data.iterator(); it.hasNext();) {
        			renderRow(i++, (ABaseDTOMap) it.next());
        		}

        	}

    		private void renderRow(int row, ABaseDTOMap resultRow) {
    			Set dtoFields = resultRow.keySet();
    			for (int j = 0; j < fields.size(); j++) {
    				String field = (String)fields.get(j);
        			if (dtoFields.contains(field)) {
        				this.setText(row, j, (String) resultRow.get(field) );
        			}
    			}
    		}

        }

    }

}