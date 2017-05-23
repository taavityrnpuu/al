/**
 * Please don't redistribute!
 */
package ee.agri.alkor.web.client.form.finance;

import java.util.Iterator;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Column;
import ee.agri.alkor.web.client.common.Form;
import ee.agri.alkor.web.client.common.IRowListenerFactory;
import ee.agri.alkor.web.client.common.RangeSelectBox;
import ee.agri.alkor.web.client.common.RangeSelectTextBox;
import ee.agri.alkor.web.client.common.ResultTable;
import ee.agri.alkor.web.client.common.UIutils;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.EnterpriseMap;
import ee.agri.alkor.web.client.dto.RegistryPaymentMap;
import ee.agri.alkor.web.client.dto.RegistryPaymentSearchFilter;
import ee.agri.alkor.web.client.dto.SearchFilter;

/**
 * Laekumiste nimekirja vorm.
 *
 * @author viktorb
 */
public class IncomsForm extends Form implements DialogSaver {

	private static final String SEARCH_FORM = "searchForm";
	
   private static final String FORM = "form";

   public static final String getKey() {
      return "IncomsForm";
   }

   private FlexTable form = new FlexTable();

   private Form currentForm;

   private IncomsTable incomsTable;
   
   private HorizontalPanel searchButtons;

   private EnterprisesDialog dialog;

   private RegistryPaymentMap selectedRegistryPayment;

   /**
    * Laekumiste nimekirja vormi loomine.
    */
   public IncomsForm() {

      currentForm = this;
      setData(new RegistryPaymentMap());
   }

   public Object getConstantsWithLookup() {
	  return GWT.create(IncomsFormMessages.class);
   }

   public void init() {

	  super.init();
	  incomsTable = new IncomsTable();
	  Map data = getData();
	  incomsTable.getData(getData());

      
      searchButtons = new HorizontalPanel();
		Button clear = new Button(getLabel("buttonEmptyFilter"),
				new ClickListener() { // "Tühjenda filter"

					public void onClick(Widget sender) {
						resetSearchForm();
						incomsTable.setSelectedRowIndex(-1);
					}
				});

		Button search = new Button(getLabel("buttonSearch"));// "Otsi");

		search.addClickListener(new ClickListener() {

			public void onClick(Widget sender) {
				System.out.println("Button clink!");
				Map map = getFormFieldValues(SEARCH_FORM);
				if(!hasErrors())
					incomsTable.getData(map);
				else
					System.out.println("error:"+getErrors().get(0));
			}
		});

		clear.setWidth("9em");
		search.setWidth("9em");
		searchButtons.add(UIutils.createSpacer(
				UIutils.SPACER_BEFORE_BUTTON_PANEL_WIDTH,
				UIutils.SPACER_BEFORE_BUTTON_PANEL_HEIGHT));
		searchButtons.add(clear);
		searchButtons.add(UIutils.createSpacer(6, 1));
		searchButtons.add(search);
		
		 Label title = new Label(getLabel("incomsTableTitle"));//new Label("Laekumiste nimekiri");
	      title.setStyleName("Title");

	      FlexTable main = new FlexTable();
	      main.setCellPadding(0);
	      main.setCellSpacing(0);
	      main.setWidth("100%");
	      main.setWidget(0, 0, title);
	      main.setWidget(1, 0, UIutils.createSpacer(800, 1));
	      main.setWidget(2, 0, UIutils.createSpacer(1, 45));
	      main.setWidget(3, 0, createSearchForm());
	      main.setWidget(4, 0, UIutils.createSpacer(800, 20));
	      main.setWidget(5, 0, searchButtons);
	      main.setWidget(6, 0, UIutils.createSpacer(800, 50));
	      main.setWidget(7, 0, incomsTable);
	      main.getFlexCellFormatter().setWidth(1, 1, "100%");
	      main.getFlexCellFormatter().setColSpan(0, 0, 2);
	      initWidget(main);

   }
   
   /*
    * Otsingu vorm
    */
   private FlexTable createSearchForm(){
	   form.setStyleName("form");
	   
	   form.setText(0, 0, getLabel(RegistryPaymentMap.PAYER_NAME));
	   form.setText(1, 0, getLabel(RegistryPaymentMap.PAYER_REGISTRATION_NR));
	   form.setText(2, 0, getLabel(RegistryPaymentMap.PAYER_ACCOUNT_NR));
	   form.setText(3, 0, getLabel(RegistryPaymentMap.REFERENCE_NR));
	   form.setText(4, 0, getLabel(RegistryPaymentSearchFilter.ENTERPRISE_NAME));
	   form.setText(5, 0, getLabel(RegistryPaymentMap.PAYMENT_DESCRIPTION));
	   
	   form.setText(0, 3, getLabel(RegistryPaymentMap.PAYMENT_DATE));
	   form.setText(1, 3, getLabel(RegistryPaymentSearchFilter.AMOUNT_FROM));
	   
	   form.setWidget(0, 1, addFormField(SEARCH_FORM, RegistryPaymentSearchFilter.PAYER_NAME, new TextBox()));
	   form.setWidget(1, 1, addFormField(SEARCH_FORM, RegistryPaymentSearchFilter.PAYER_REGISTRATION_NR, new TextBox()));
	   form.setWidget(2, 1, addFormField(SEARCH_FORM, RegistryPaymentSearchFilter.PAYER_ACCOUNT_NR, new TextBox()));
	   form.setWidget(3, 1, addFormField(SEARCH_FORM, RegistryPaymentSearchFilter.REFERENCE_NR, new TextBox()));
	   form.setWidget(4, 1, addFormField(SEARCH_FORM, RegistryPaymentSearchFilter.ENTERPRISE_NAME, new TextBox()));
	   form.setWidget(5, 1, addFormField(SEARCH_FORM, RegistryPaymentSearchFilter.DESCRIPTION, new TextBox()));
	   
	   form.setWidget(0, 2, UIutils.createSpacer(10, 1));
	   
	   form.setWidget(0, 4, addFormField(SEARCH_FORM, RegistryPaymentSearchFilter.PAYMENT_DATE, new RangeSelectBox(RangeSelectBox.CALENDAR,"45%","45%")));
	   form.setWidget(1, 4, addFormField(SEARCH_FORM, RegistryPaymentSearchFilter.AMOUNT, new RangeSelectTextBox(RangeSelectTextBox.NUMERIC,"45%","45%"),"100%"));	   
	   UIutils.setTableTextStyled(form);
	   return form;
	   
   }
   
   private void resetSearchForm() {
		setData(new ApplicationMap());
		incomsTable.getFilter().reset();
		resetFormFields(SEARCH_FORM);
	}
   
   private class IncomsTable extends ResultTable {

	  public IncomsTable() {
	     super(new RegistryPaymentSearchFilter());
	     this.addColumn(new Column(getLabel(RegistryPaymentMap.PAYER_NAME), //Maksja nimi
	    		 RegistryPaymentMap.PAYER_NAME, null, Column.styleNormal, null));
	     this.addColumn(new Column(getLabel(RegistryPaymentMap.PAYER_REGISTRATION_NR), //Reg.nr
	    		 RegistryPaymentMap.PAYER_REGISTRATION_NR, null, Column.styleNormal, null));
	     this.addColumn(new Column(getLabel(RegistryPaymentMap.PAYER_ACCOUNT_NR), //Pangakonto
	    		 RegistryPaymentMap.PAYER_ACCOUNT_NR, null, Column.styleNormal, null));
	     this.addColumn(new Column(getLabel(RegistryPaymentMap.AMOUNT),
	    		 RegistryPaymentMap.AMOUNT, null, Column.styleNormal, null)); //Summa
	     this.addColumn(new Column(getLabel(RegistryPaymentMap.PAYMENT_DATE),
	    		 RegistryPaymentMap.PAYMENT_DATE, null, Column.styleNormal, null)); //Makse kpv
	     this.addColumn(new Column(getLabel(RegistryPaymentMap.REFERENCE_NR),
	    		 RegistryPaymentMap.REFERENCE_NR, null, Column.styleNormal, null)); //Makse viitenr.
	     this.addColumn(new Column(getLabel(RegistryPaymentMap.ENTERPRISE),
	    		 RegistryPaymentMap.HAS_ENTERPRISE, null, Column.styleNormal, null)); //Seotud EV-ga
	     this.addColumn(new Column(getLabel(RegistryPaymentMap.PAYMENT_DESCRIPTION),
	          RegistryPaymentMap.PAYMENT_DESCRIPTION, null, Column.styleNormal, null)); //Seotud EV-ga
	     this.addColumn(new Column(null, null, getLabel(ResultTable.BIND_ENTERPRISE), Column.styleUserSet, ResultTable.SELECT)); //
	     this.addColumn(new Column(null, null, getLabel(ResultTable.UNBIND_ENTERPRISE), Column.styleUserNotSet, ResultTable.CHANGE)); //

	  }

	  protected String getSpecialColumnText(Column col, ABaseDTOMap row) {
		  if (row.getProperty(RegistryPaymentMap.ENTERPRISE) != null) {
			  if(col.getText().equals(getLabel(ResultTable.UNBIND_ENTERPRISE)))
				  return col.getText();
			  else
				  return null;
		  } else {
			  if(col.getText().equals(getLabel(ResultTable.UNBIND_ENTERPRISE)))
				  return null;
			  else
				  return col.getText();
		  }
	  }

	  protected String getStyle(Column col, ABaseDTOMap row) {
		  if (col.getStyle().equals(Column.styleUserSet)) {
			return Column.styleUrl;
		  }else if(col.getStyle().equals(Column.styleUserNotSet)){
			  return Column.styleUrl;  
		  }else {

			  return col.getStyle();
		  }
	  }

	  protected void getData(SearchFilter filter) {
		  startSearching();
	     ServiceContext.getInstance().getRegistryService().search(filter, this);
	  }

	  protected IRowListenerFactory getRowListenerFactory() {
	     return new RowListenterFactory();
	  }
		protected String getRowStyleName(int rowNr, ABaseDTOMap row) {
			// TODO Auto-generated method stub
			return null;
		}

	  public void onSuccess(Object result) {
		 if (result != null) {
			 SearchFilter searchFilter = (SearchFilter) result;
			 for(Iterator it = searchFilter.getResultsList().iterator(); it.hasNext();) {
				 RegistryPaymentMap regPayment = ((RegistryPaymentMap)it.next());
				 if (regPayment.getProperty(RegistryPaymentMap.ENTERPRISE) == null) {
					 regPayment.setProperty(RegistryPaymentMap.HAS_ENTERPRISE, null);
				 } else {
					 regPayment.setProperty(RegistryPaymentMap.HAS_ENTERPRISE, regPayment.getProperty(RegistryPaymentMap.ENTERPRISE_NAME));//"Seotud ettevõtte nimi");
				 }
			 }
			super.onSuccess(result);
		 }
	  }

   }

   private class RowListenterFactory implements IRowListenerFactory {

	  public RowListenterFactory() {
	     super();
	  }

	  public ClickListener create(String listenerType, final Object row) {
	     ClickListener listener = null;
	     if (ResultTable.SELECT.equals(listenerType)) {
	    	listener = new ClickListener() {
	           public void onClick(Widget sender) {
	        	   selectedRegistryPayment = (RegistryPaymentMap) row;
	              if (dialog == null) {
	             	 dialog = new EnterprisesDialog((DialogSaver)currentForm);
	              }
	              dialog.show(); //avame enne, et saada järgmises reas õige dialogi laiust
	              dialog.setPopupPosition(sender.getAbsoluteLeft() - dialog.getOffsetWidth(), sender.getAbsoluteTop());
	              dialog.hide(); // need hide() ja show() on vaja siin, et Firefox kasutamisel
	              dialog.show(); // ei ilmunud valge riba paremale
	           }
	        };
	     }
	     if(ResultTable.CHANGE.equals(listenerType)){
	    	 listener = new ClickListener(){

				public void onClick(Widget sender) {
					selectedRegistryPayment = (RegistryPaymentMap) row;
					unbindEnterprise(selectedRegistryPayment);
				}
	    		 
	    	 };
	     }
         return listener;
	  }
   }

   public void saveResults(ABaseDTOMap selectedEnterprise) {
	   ServiceContext.getInstance().getRegistryService().bindPaymentToEnterpriseById((Long)selectedEnterprise.getProperty(EnterpriseMap.ID), new Long(selectedRegistryPayment.getText(RegistryPaymentMap.ID)), new AsyncCallback(){
		public void onSuccess(Object arg0) {
			incomsTable.getData(new RegistryPaymentMap());
		}

		public void onFailure(Throwable arg0) {
			setError(arg0.toString());
		}
	   });
   }
   
   public void unbindEnterprise(ABaseDTOMap selectedPayment) {
	   ServiceContext.getInstance().getRegistryService().unbindPaymentFromEnterprise(new  Long(selectedPayment.getText(RegistryPaymentMap.ENTERPRISE_ID)),new Long(selectedPayment.getText(RegistryPaymentMap.ID)),new AsyncCallback(){
		public void onSuccess(Object arg0) {
			Map map = getFormFieldValues(SEARCH_FORM);
				incomsTable.getData(map);
		}

		public void onFailure(Throwable arg0) {
			setError(arg0.toString());
		}
	   });
   }

}