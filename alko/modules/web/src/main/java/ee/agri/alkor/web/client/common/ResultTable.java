package ee.agri.alkor.web.client.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.StatusCodeException;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.MainPanel;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ApplicationMap;
import ee.agri.alkor.web.client.dto.SearchFilter;

/**
 *
 * @author martin Tulemuste tabeli skelett
 */

public abstract class ResultTable extends Composite implements AsyncCallback {

   public static final String COPY = "copy";
   public static final String SELECT = "select";
   public static final String NOTE = "note";
   public static final String CHANGE = "change";
   public static final String ACCOUNT = "account";
   public static final String CANCEL = "cancel";
   public static final String DELETE = "delete";
   public static final String VIEW = "view";
   public static final String VIEWEIT = "vieweit";
   public static final String VIEW_DATA="view_data";
   public static final String BIND_ENTERPRISE = "bindEnterprise";
   public static final String UNBIND_ENTERPRISE = "unbindEnterprise";


   // Veergude list
   private final List columnList = new ArrayList();

   //Leitud tulemuste arv
   HorizontalPanel countPanel = new HorizontalPanel();
   //Navigeerimistabel
   HorizontalPanel paginationPanel = new HorizontalPanel();
   //Otsingu info paneel
   HorizontalPanel searchingInfoPanel = new HorizontalPanel();

   // Peatabel mille peal istub ülejäänud vorm
   private final FlexTable mainTable = new FlexTable();

   // Tulemuste tabel
   private final FlexTable resultTable = new FlexTable();

   // Otsingu ajal kuvatav label
   private final String searchingDefaultString = "Sooritan otsingut";
   private final Label searching = new Label(searchingDefaultString);

   // Tulemuste arv
   private final Label count = new Label("0");

   // Link algusse
   private final Label start = new Label("<<");

   // Link tagasi
   private final Label prev = new Label("tagasi");

   // Praegune leht
   private final Label curr = new Label("0");

   // Link edasi
   private final Label next = new Label("edasi");

   // Link lõppu
   private final Label end = new Label(">>");

   // Päringufilter
   private SearchFilter searchFilter;

   // navigeerimislistener
   private final NavListener navListener = new NavListener();

   private HTML html;

   private SearchingTimer t;

   private ExcelFormPanel excelPanel;

   private boolean isSmallCount =false;
   
   private boolean isSearching = false;

   
   /**
    *
    */
   private int selectedRowIndex = -1;
   // sorteerimislistener

   private final ListBox rowCount = new ListBox() {

      @Override
      public void addChangeListener(ChangeListener arg0) {
         // TODO Auto-generated method stub
         super.addChangeListener(arg0);
      }

   };

   public ResultTable(SearchFilter searchFilter) {
      this(searchFilter,false, null, false);
   }
   
   public ResultTable(SearchFilter searchFilter, ClickListener customClickListener, boolean primitive_excel) {
      this(searchFilter,false, customClickListener, primitive_excel);
   }


   /**
    * Loob vormi ja sätib paika üldkujunduse
    *
    * @param searchFilter
    *            Otsingufilter mille abil otsitakse
    */
   public ResultTable(SearchFilter searchFilter, boolean isSmallcount){
	   this(searchFilter, isSmallcount, null, false);
   }
   
   public ResultTable(SearchFilter searchFilter, boolean isSmallcount, ClickListener customClickListener, boolean primitive_excel) {
      this.isSmallCount=isSmallcount;
      searchFilter.setExcelPrimitive(primitive_excel);
      this.searchFilter = searchFilter;

      mainTable.setWidth("100%");
      mainTable.setWidget(0, 0, UIutils.createSpacer(1, 1));
      mainTable.setWidget(0, 1, createSearchingInfoPanel());
      mainTable.setWidget(0, 2, UIutils.createSpacer(1, 1));
      mainTable.setWidget(1, 0, createCountPanel(customClickListener));
      mainTable.setWidget(2, 0, createResultTable());
      mainTable.setWidget(3, 0, UIutils.createSpacer(10, 1));
      mainTable.setWidget(3, 1, createPagination());
      mainTable.setWidget(1, 3, UIutils.createSpacer(1, 1));
      mainTable.getFlexCellFormatter().setWidth(1, 2, "100%");
      //		mainTable.getFlexCellFormatter().setColSpan(0, 0, 2);
      mainTable.getFlexCellFormatter().setColSpan(0, 2, 3);
      mainTable.getFlexCellFormatter().setColSpan(1, 0, 2); // formaatimine
      // et paika
      // läheks tabel
      // ja
      mainTable.getFlexCellFormatter().setColSpan(2, 0, 5); // ülemine/alumine
      // osa
      mainTable.getFlexCellFormatter().setColSpan(3, 1, 3); // ei soovita
      // näppida ilma
      // hea põhjuseta
      initWidget(mainTable);
   }

   /**
    * Refactoring
    * Method for creating the searching info ("Sooritan otsingut..." message) panel
    * @return
    */
   private Label createSearchingInfoPanel() {

      searching.setWordWrap(false);
      searching.setStyleName(InfoPanel.styleInfo);
      searchingInfoPanel.add(searching);
      searching.setVisible(false);

      return searching;

   }

   /**
    * Refactoring
    * Method for creating the result table
    * @return
    */
   private FlexTable createResultTable() {

      resultTable.setWidth("100%");
      resultTable.setStyleName("Table");
      resultTable.setCellSpacing(1);
      resultTable.setCellPadding(5);
      resultTable.getRowFormatter().setStyleName(0, "Header");

      return resultTable;
   }

   /**
    * Refactoring
    * Method for creating the count panel
    * @return
    */
   private HorizontalPanel createCountPanel(ClickListener customClickListener) {

      Label reportCount = new Label("Kirjete arv: ");
      reportCount.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
      count.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);

      reportCount.addStyleName("NoWrap");
      reportCount.setWidth("100");
      count.addStyleName("BoldText");
      countPanel.add(UIutils.createSpacer(40, 1));
      countPanel.add(reportCount);
      countPanel.add(UIutils.createSpacer(5, 1));
      countPanel.add(count);
      excelPanel = new ExcelFormPanel(getFilter(), customClickListener);
      System.out.println("Init ExcelFormPanel, sortmap size:"+getFilter().getSortMap() == null ? -1 : getFilter().getSortMap().size());
      countPanel.add(excelPanel);
      countPanel.add(UIutils.createSpacer(40, 1));
      countPanel.add(new Label("Ridade arv:"));
      countPanel.add(UIutils.createSpacer(5, 1));
      createRowCount(rowCount);
      countPanel.add(rowCount);
      //countPanel.setWidth("100%");
      countPanel.setHeight("10");
      countPanel.setVisible(true);

      return countPanel;

   }

   /**
    * Refactoring
    * Method for creating the Pagination for the page
    * @return
    */
   private FlexTable createPagination() {

      FlexTable pagination = new FlexTable();
      start.addStyleName("Navbar");
      prev.addStyleName("Navbar");
      next.addStyleName("Navbar");
      end.addStyleName("Navbar");
      prev.addClickListener(navListener);
      start.addClickListener(navListener);
      next.addClickListener(navListener);
      end.addClickListener(navListener);
      pagination.setWidget(0, 0, start);
      pagination.setWidget(0, 1, prev);
      pagination.setWidget(0, 2, curr);
      pagination.setWidget(0, 3, next);
      pagination.setWidget(0, 4, end);
      end.setWidth("100%");
      //paginationPanel.add(pagination);
      //paginationPanel.setVisible(false);

      return pagination;

   }

   /**
    *
    * @deprecated use getFilter instead whoever you are
    */
   @Deprecated
   public SearchFilter getSearchFilter() {
      return searchFilter;
   }

   public void setSearchFilter(SearchFilter searchFilter) {
      this.searchFilter = searchFilter;
   }
   

   /**
    * Lisab juurde veerud
    */
   public void addColumn(Column[] columns) {
      for (int i = 0; i < columns.length; i++) {
         addColumn(columns[i]);
      }
   }

   /**
    * Lisab juurde veeru lõppu
    */
   public void addColumn(Column column) {
      addColumn(column, columnList.size());
      getFilter().addColumn(column.getProperty(), column.getName());
      if(excelPanel!=null) {
         this.excelPanel.setSearchFilter(this.searchFilter);
      }
   }

   /**
    * Lisab juurde veeru soovitud kohale
    */
   public void addColumn(Column column, int place) {
      // paneme juurde counteri columni
      if (columnList.size() == 0) {
         columnList.add(new Column(""));
         resultTable.setWidget(0, 0, new Label(""));
         place++;
      }
      columnList.add(column);
      Label header = new Label(column.getName());
      //header.setStyleName(Column.styleSort);
      // if(column.getStyle().equals(Column.styleSort)){
      header.setStyleName(Column.styleSort);
      header.addClickListener(new SortListener(column.getProperty()));
      // }
      // paneme paika headeri rea
      resultTable.setWidget(0, place, header);
   }

   /**
    *
    * @param columnProperty
    */
   public void removeColumn(String columnProperty) {
      for(int i = 0; i < columnList.size(); i++) {
         Column col = ((Column)columnList.get(i));
         if (col.getProperty() != null && col.getProperty().equals(columnProperty)) {
            columnList.remove(col);
            resultTable.removeCell(0, i);
            //for (int j = 0; j < resultTable.getRowCount(); j++) {
            //	resultTable.removeCell(j, i);
            //}
            getFilter().removeColumn(columnProperty);
            if(excelPanel!=null) {
               this.excelPanel.setSearchFilter(this.searchFilter);
            }
            break;
         }
      }
   }

   /**
    * Eemaldab samanimelise veeru
    */
   public void removeColumn(Column column) {
      columnList.remove(column);
      getFilter().removeColumn(column.getProperty());
   }
   /**
    * Pärimine filtriga.
    *
    * @param filter
    */
   protected abstract void getData(SearchFilter filter) ;

   /**
    * Method for getting results with current
    * filter.
    *
    */
   public  void getData() {
	   if(isSearching){
		   Window.alert("Uue otsingu teostamiseks oodake palun kuni eelmine lõpetab");
		   return;
	   }
	  isSearching = true;
      startSearching();
      getData(this.searchFilter);
   }

   /**
    * Will set the "searching" message to visible
    * and start the searching timer that changes the searching message
    */
   public void startSearching() {
      searching.setVisible(true);
      t = new SearchingTimer();
      t.scheduleRepeating(500);
   }

   /**
    * Set the searching message to not visible
    * and cancel the searching timer
    */
   public void stopSearching() {
      searching.setVisible(false);
      t.cancel();
	   isSearching = false;
   }

   /**
    * Method for setting new query parameters and
    * getting first result set.
    *
    * @param queryParams
    */
   public  void getData(Map queryParams) {
      // We want to preserve existing params.

      String rowC = rowCount.getValue(rowCount.getSelectedIndex());

      this.searchFilter.reset();
      this.searchFilter.setPageSize(Integer.parseInt(rowC));
      this.searchFilter.setQueryParams(queryParams);
      
      getData();
      if(excelPanel!=null) {
         this.excelPanel.setSearchFilter(this.searchFilter);
      }
   }
   /**
    * TODO we need reference to holding
    * form to put error message.
    */
   public void onFailure(Throwable caught) {

      stopSearching();
      if(caught.getClass() != StatusCodeException.class){
    	  Window.alert("Viga tabeli andmete laadimisel: " + caught.getMessage());
      }
   }

   public void onSuccess(Object result) {


      stopSearching();

      if (result != null) {
         this.searchFilter = (SearchFilter) result;
      }
      excelPanel.setItemsCount(searchFilter.getTotal());
      show();
   }

   /**
    * Näitab valmistehtud tabelit
    */

   public void show() {
      // Teeme tabeli tühjaks
      while (resultTable.getRowCount() > 1) {
         resultTable.removeRow(1);
      }
      countPanel.setVisible(true);
      // sätime paika tulemuste koguarvu
      count.setText(Integer.toString(searchFilter.getTotal()));
      // korjame maha navbari'i
      curr.setVisible(false);
      prev.setVisible(false);
      start.setVisible(false);
      next.setVisible(false);
      end.setVisible(false);
      GWT.log("tulemusi:"+searchFilter.getResultsList().size());
      if (searchFilter.getResultsList().size() != 0) {
         // sätime praeguse lehe numbri paika
         int current = 1;
         if (searchFilter.getPageSize() > 0) {
            current = (searchFilter.getStartIndex() / searchFilter.getPageSize()) + 1;
         }
         curr.setText("(" + Integer.toString(current) + ")");
         // navbar uuesti peale
         if (current != 1) {
            prev.setVisible(true);
            start.setVisible(true);
            curr.setVisible(true);
         }
         if (current != searchFilter.getPageCount() && searchFilter.getResultsList().size() != 0) {
            next.setVisible(true);
            end.setVisible(true);
            curr.setVisible(true);
         }
         // täidame tabeli
         int i = 1;
         for (Iterator it = searchFilter.getResultsList().iterator(); it.hasNext();)
            renderRow(i++, (ABaseDTOMap) it.next());
      }
   }

   public SearchFilter getFilter() {
      return this.searchFilter;
   }

   public ExcelFormPanel getExcelFormPanel() {
      return this.excelPanel;
   }

   /*
    * Rea näitamise renderdamine
    */

   protected void renderRow(int row, ABaseDTOMap resultRow) {
      if(resultRow == null){
         return;
      }
      String rowStyle = getRowStyleName(row, resultRow);
      if(rowStyle == null)
         rowStyle = getDefaultRowStyleName(row);

      resultTable.getRowFormatter().setStyleName(row, rowStyle);

      resultTable.setText(row, 0, Integer.toString(row
            + searchFilter.getStartIndex()));

      for (int i = 1; i < columnList.size(); i++) {
         Column col = (Column) columnList.get(i);
         Label text = null;
         if (col.getProperty() != null) {

            String value = getText(resultRow, col);
            text = new Label((value == null) ? "" : value);

         } else {
            text = new Label(getSpecialColumnText(col, resultRow));
         }
         text.addStyleName(getStyle(col, resultRow));


         text.addClickListener(changeColor(row));



         if (col.getRowListenerType() != null) {
            text.addClickListener(getRowListenerFactory().create(
                  col.getRowListenerType(), resultRow));
         }
         resultTable.setWidget(row, i, text);// esimene rida/veerg on alati
         // täidetud
      }
   }
   
   protected String getText(ABaseDTOMap row, Column col) {
      return (String) row.getText(col.getProperty());
   }

   protected String getSpecialColumnText(Column col, ABaseDTOMap row) {
      return col.getText();
   }

   protected String getStyle(Column col, ABaseDTOMap row) {
      return col.getStyle();
   }

   /**
    * Subclasses should override.
    *
    * @return IRowListenerFactory
    */
   protected abstract IRowListenerFactory getRowListenerFactory();

   /**
    * Default row style function.
    * Subclasses can change the implementation.
    *
    * @param arg
    * @return
    */
   protected abstract String getRowStyleName(int rowNr, ABaseDTOMap row) ;

   protected  String getDefaultRowStyleName(int rowNr) {
      String styleName = null;
      if ((rowNr % 2) == 1)
         styleName =  "Odd";
      else
         styleName =  "Even";
      return styleName;
   }

   public int getSelectedRowIndex() { return this.selectedRowIndex; }
   public int setSelectedRowIndex(int index) { return this.selectedRowIndex = index; }
   /**
    * Finds and sets the row index.
    *
    * @param row
    */
   public void setSelectedRow(Object row) {
      int rowIndex = getFilter().getResultsList().indexOf(row);
      if(rowIndex >= 0)
         setSelectedRowIndex(rowIndex);
   }

   private void createRowCount(ListBox rowCount) {
      rowCount.addItem("10", "10");
      rowCount.addItem("20", "20");
      rowCount.addItem("40", "40");
      rowCount.addItem("100", "100");
      rowCount.addItem("200", "200");
      rowCount.addItem("300", "300");
      rowCount.addItem("500", "500");
      if(!isSmallCount){
         rowCount.addItem("1000", "1000");
         rowCount.addItem("Kõik", "0");
      }
      rowCount.setSelectedIndex(2);
   }

   public boolean deleteDataRow(Long id) {
      boolean result = false;
      List resultsList = getFilter().getResultsList();

      for (int i = 0; i < resultsList.size(); i++) {
         ABaseDTOMap row = (ABaseDTOMap)resultsList.get(i);
         if (row.getProperty(ABaseDTOMap.ID).equals(id)){
            resultsList.remove(i);
            show();
            return true;
         }
      }

      return result;
   }

   public boolean updateDataRow(ABaseDTOMap newData) {
      boolean result = false;
      Long newId = (Long)newData.getProperty(ABaseDTOMap.ID);
      List resultsList = getFilter().getResultsList();
      for (int i = 0; i < resultsList.size(); i++) {
         ABaseDTOMap row = (ABaseDTOMap)resultsList.get(i);
         if (row.getProperty(ABaseDTOMap.ID) != null ? row.getProperty(ABaseDTOMap.ID).equals(newId) : false) {
            resultsList.remove(i);
            resultsList.add(i, newData);
            show();
            return true;
         }
      }

      if (resultsList.size() == 0) {
         resultsList.add(0, newData);
      } else {
         resultsList.remove(resultsList.size() -1);
         resultsList.add(0, newData);
      }

      show();
      return true;
   }

   /**
    * Sorting listener
    */
   private class SortListener implements ClickListener {
      private String property;

      public SortListener(String sortProperty) {
         this.property = sortProperty;
      }

      /**
       * Do the query
       */
      public void onClick(Widget sender) {
         searchingInfoPanel.setVisible(true);
         t = new SearchingTimer();
         t.scheduleRepeating(500);
         String oldDirection = SearchFilter.DESCENDING;
         System.out.println("Sort property:"+property+" sf:"+searchFilter);
         //latest payment is Transient field, current sorting mechanism would end with exception
         // repair currently not relevant
         if(("registryApplication."+ApplicationMap.LATEST_PAYMENT).equals(property))
            return;
         if (searchFilter.getSortMap().containsKey(property)) {
            oldDirection = (String)searchFilter.getSortMap().get(property);
         }
         searchFilter.getSortMap().clear();

         if (oldDirection.equals(SearchFilter.DESCENDING)) {
            searchFilter.addSortItem(property, SearchFilter.ASCENDING);
         } else if (oldDirection.equals(SearchFilter.ASCENDING)){
            searchFilter.addSortItem(property, SearchFilter.DESCENDING);
         }
         excelPanel.setSearchFilter(searchFilter); //refresh searchfilter
         getData(searchFilter);
      }

   }

   /**
    * Navbariga navigeerimise klass
    */
   private class NavListener implements ClickListener {

      public void onClick(Widget sender) {
         MainPanel.scrollToWidget(ResultTable.this);
         int prevStartIndex = searchFilter.getStartIndex();
         //System.out.println("ResultTable.NavListener onClick! > " + sender);
         if (sender == start)
            searchFilter.setForward("0");
         if (sender == prev)
            searchFilter.setForward(Integer.toString(searchFilter
                  .getStartIndex()
                  - searchFilter.getPageSize()));
         if (sender == next)
            searchFilter.setForward(Integer.toString(searchFilter
                  .getStartIndex()
                  + searchFilter.getPageSize()));
         if (sender == end)
            searchFilter.setForward(Integer.toString((searchFilter
                  .getPageCount() - 1)
                  * searchFilter.getPageSize()));
         searchFilter.setStartIndex(Integer.parseInt(searchFilter.getForward()));

         getData();
      }
   }

   private class SearchingTimer extends Timer {

      private int counter = 0;

      @Override
      public void run() {
         String searchingString = searchingDefaultString;
         if (counter < 5) {
            counter++;
            searchingString = searching.getText() + ".";
         } else {
            counter = 0;
            searchingString = searchingDefaultString;
         }
         searching.setText(searchingString);
      }

   }

   public ClickListener changeColor(
         final int rowNr){
      return new ClickListener() {
         String oddOrEven;
         public void  onClick(Widget sender) {
            String oldStyle = resultTable.getRowFormatter().getStyleName(rowNr);
            if(oldStyle != "selectedRow"){

               oddOrEven = oldStyle;
            }
            if(oldStyle.equals("selectedRow")){

               resultTable.getRowFormatter().setStyleName(rowNr, oddOrEven);
            }
            else
               resultTable.getRowFormatter().setStyleName(rowNr, "selectedRow");
         }

      };

   }

   //	   /**
   //	    * Määrab tulemuste paneeli nähtavuse
   //	    * @param b nähtav või mitte
   //	    */
   //	   public void setCountPanelVisibility(boolean visible){
   //	      countPanel.setVisible(visible);
   //	   }
   //
   //	   /**
   //	    * Määrab navigeerimispaneeli nähtavuse
   //	    * @param b nähtav või mitte
   //	    */
   //	   public void setPaginationPanelVisibility(boolean visible){
   //	      pagination.setVisible(visible);
   //	   }

}