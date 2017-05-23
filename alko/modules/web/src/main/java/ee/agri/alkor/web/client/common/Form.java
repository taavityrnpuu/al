/**
 *
 */
package ee.agri.alkor.web.client.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.TextBoxBase;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.dto.ABaseDTOMap;
import ee.agri.alkor.web.client.dto.ClassItemMap;
import ee.agri.alkor.web.client.dto.IdVersionMap;
import ee.agri.alkor.web.client.dto.RangeFilter;
import ee.agri.alkor.web.client.dto.UserInfo;
import ee.agri.alkor.web.client.form.appl.ApplicationForm;
import ee.agri.alkor.web.client.validator.DateValidator;
import ee.agri.alkor.web.client.validator.IntegerValidator;
import ee.agri.alkor.web.client.validator.LengthValidator;
import ee.agri.alkor.web.client.validator.NameValidator;
import ee.agri.alkor.web.client.validator.NumberValidator;
import ee.agri.alkor.web.client.validator.RequiredValidator;
import ee.agri.alkor.web.client.validator.Validator;
import ee.agri.alkor.web.client.validator.Validators;
import ee.agri.alkor.web.service.RegistryServiceAsync;

/**
 * @author suisalu
 */
public abstract class Form extends Composite implements IForm, Errors  {

   public static final String CHANGE_FORM = "changeForm";

   protected Form parent;

   protected ConstantsWithLookup messages;

   protected CommonMessages commonMessages;

   private boolean initialised = false;

   private List errors = new ArrayList();

   private final List enableDisableButtons = new ArrayList();

   /**
    * Map of input forms on screen. Key is form name. Input form has input fields (TextBox etc) which names match the data Map keys.
    */
   private Map inputForms = new HashMap();

   /**
    * Map of input forms and their lists of validators. Key is field name. Input form has input fields (TextBox etc) which names match the
    * data Map keys and are mapped to a list of validator objects associated with the field.
    */
   private final Map validatorFields = new HashMap();

   protected SelectReturnCallback selectReturnCallback;

   protected ABaseDTOMap data;

   public Form() {
      super();
      commonMessages = (CommonMessages) GWT.create(CommonMessages.class);
      messages = (ConstantsWithLookup) getConstantsWithLookup();
   }

   public Form(Form parent) {
      super();
      this.parent = parent;
      messages = (ConstantsWithLookup) getConstantsWithLookup();
   }

   public Form(SelectReturnCallback selectReturnCallback) {
      this();
      this.selectReturnCallback = selectReturnCallback;
   }

   protected void onSuccess(Object result) {

   }

   protected void onFailure(Throwable caught) {
   }

   //   public void onReturn() {
   //
   //   }

   /**
    * Object for notifying form about data changes.
    *
    * @author ivar
    *
    */
   public class DataChangeEvent {

      public static final int DATA_ADDED = 0;
      public static final int DATA_MODIFIED = 1;
      public static final int DATA_CLEARED = 2;
      public static final int DATA_DELETED = 3;
      private final int type;

      private final ABaseDTOMap data;

      public DataChangeEvent(int type, ABaseDTOMap data) {
         this.type = type;
         this.data = data;
      }

      public int getType() {
         return this.type;
      }

      public ABaseDTOMap getData() {
         return this.data;
      }

      @Override
      public String toString() {
         StringBuffer sbuf = new StringBuffer("DataChangeEvent[").append("type=").append(this.type)
               .append("data=").append(this.data).append("]");
         return sbuf.toString();

      }
   }

   /**
    * Method for notifying form about data change event. Concrete classes should implement if needed.
    *
    * @param event
    *           DataChangeEvent
    */
   public void onDataEvent(DataChangeEvent event) {
   }

   public Object getConstantsWithLookup() {
      return null;
   }

   /*
    * (non-Javadoc)
    *
    * @see ee.agri.alkor.web.client.common.IForm#init()
    */
   public void init() {
      this.setInitialised(true);
      InfoPanel.clear();
      setErrors(new ArrayList());
   }

   public static String getKey() {
      return null;
   }

   public String getLabel(String key) {
      String parsed = key.replace('.', '_');
      try {
         return messages.getString(parsed);
      } catch (Exception e) {
         return "[NO_MESSAGE]";
      }
   }

   public void openForm(Form openForm) {
      SimplePanel main = (SimplePanel) this.getParent();
      main.clear();
      openForm.clearErrors();
      try {
         openForm.init();
      } catch (Exception e) {
         e.printStackTrace();
         this.setError(e.toString());
      }
      main.add(openForm);
   }

   /**
    * AsyncCallback methods for save action.
    */

   public void setErrors(List errors) {
      if(errors == null) {
         this.errors = new ArrayList();
      } else {
         this.errors = errors;
      }
   }

   public List getErrors() {
      return errors;
   }

   public void setInfo(String msg){
      setInfo(msg,true);
   }

   public void setInfo(String msg, boolean erase) {
      if(erase)
         InfoPanel.clear();
      InfoPanel.setInfo(msg);
      //      InfoPanel.msgLabel.setText(msg);
      //      InfoPanel.msgLabel.setVisible(true);
      //      InfoPanel.msgLabel.setStyleName(InfoPanel.styleInfo);
   }

   /**
    * Shows error in heading
    * Erases all previous good/bad messages
    * @param msg error to be displayed
    */

   public void setError(String msg){
      setError(msg,true);
   }

   /**
    * Shows error
    * @param msg error to be displayed
    * @param erase whether to show previous errors
    */
   public void setError(String msg, boolean erase) {
      if(erase){
         InfoPanel.clear();
         this.setErrors(new ArrayList());
      }
      InfoPanel.setError(msg);
   }

   public void setErrorHtml(String msg, boolean erase) {
      if(erase){
         InfoPanel.clear();
         this.setErrors(new ArrayList());
      }
      InfoPanel.setErrorHtml(msg);
   }
   
   /**
    * Deletes error
    * @param msg error to be deleted
    */
   public void deleteError(String msg) {
      Iterator i = errors.iterator();
      List after = new ArrayList();
      InfoPanel.clear();
      while(i.hasNext()){
         String errorinlist = (String)i.next();
         if(!errorinlist.equals(msg)){
            after.add(errorinlist);
            InfoPanel.setError(errorinlist);
         }
      }
      this.setErrors(after);
   }

   public void addError(String field, Validator validator) {
      String msg = null;
      if (validator instanceof RequiredValidator) {
         msg = commonMessages.errorMsgRequired(getLabel(field));
      } else if (validator instanceof IntegerValidator) {
         msg = commonMessages.errorMsgInteger(getLabel(field));
      } else if (validator instanceof DateValidator) {
         msg = commonMessages.errorMsgDate(getLabel(field));
      } else if (validator instanceof NumberValidator) {
         msg = commonMessages.errorMsgNumber(getLabel(field));
      } else if (validator instanceof NameValidator) {
         msg = commonMessages.errorMsgName(getLabel(field));
      } else if (validator instanceof LengthValidator) {
         msg = commonMessages.errorMsgLength(getLabel(field),
               ((LengthValidator)validator).getMinimum(),
               ((LengthValidator)validator).getMaximum());
      } else {
         msg = "unknown validator error";
      }
      setError(msg,InfoPanel.hasInfo);
      this.getErrors().add(msg);
   }

   public void clearErrors() {
      setErrors(null);
      InfoPanel.clear();
   }

   public void clearInfo() {
      InfoPanel.clear();
   }

   public void setIdnOnSave(IdVersionMap idVersion) {
      Long id = (Long) idVersion.get(IdVersionMap.ID);
      if (id != null)
         getData().put(ABaseDTOMap.ID, id);
   }

   public void setIdVersionOnSave(IdVersionMap idVersion) {
      Long id = (Long) idVersion.get(IdVersionMap.ID);
      Long version = (Long) idVersion.get(IdVersionMap.VERSION);
      if (id != null)
         getData().put(ABaseDTOMap.ID, id);
      if (version != null)
         getData().put(ABaseDTOMap.VERSION, version);
   }

   public ABaseDTOMap cleanDataBeforeSave(ABaseDTOMap data) {
      List helperList = new ArrayList();
      return cleanDataBeforeSave(data, helperList);
   }

   private ABaseDTOMap cleanDataBeforeSave(ABaseDTOMap data, List cleaningHelpList) {
      if(!cleaningHelpList.contains(data)) {
         cleaningHelpList.add(data);
      } else {
         return (ABaseDTOMap)cleaningHelpList.get(cleaningHelpList.indexOf(data));
      }
      List removeKeys = new ArrayList();
      for (Iterator it = data.keySet().iterator(); it.hasNext();) {
         String key = (String) it.next();
         Object value = data.get(key);
         if (value == null) {
            removeKeys.add(key);
            continue;
         }
         if (value instanceof String) {
            String stringValue = ((String) value).trim();
            if ((stringValue.length() == 0) || stringValue.equals("null"))
               removeKeys.add(key);
         } else if (value instanceof ABaseDTOMap) {
            ABaseDTOMap dataMap = (ABaseDTOMap) value;
            cleanDataBeforeSave(dataMap, cleaningHelpList);
            if (dataMap.keySet().size() == 0) {
               removeKeys.add(key);
            }
         } else if (value instanceof Collection) {
            List collectionRemove = new ArrayList();
            Collection propCollection = (Collection) value;
            for (Iterator pit = propCollection.iterator(); pit.hasNext();) {
               Object collectionValue = pit.next();
               if (collectionValue instanceof ABaseDTOMap) {
                  ABaseDTOMap dataMap = (ABaseDTOMap) collectionValue;
                  cleanDataBeforeSave(dataMap, cleaningHelpList);
                  if (dataMap.keySet().size() == 0) {
                     collectionRemove.add(collectionValue);
                  }
               }
            }
            if (collectionRemove.size() > 0)
               propCollection.removeAll(collectionRemove);
            if (propCollection.size() == 0) {
               removeKeys.add(key);
            }
         }
      }
      for (Iterator it = removeKeys.iterator(); it.hasNext();) {
         data.remove(it.next());
      }
      return data;
   }

   public void makeClassSelectionList(String formName, String fieldName, List classList) {

      Widget widget = getFormField(formName, fieldName);
      ListBox listBox = null;

      if (widget instanceof ListBox) {
         listBox = (ListBox) widget;
      } else if (widget instanceof TextListBox) {
         listBox = ((TextListBox) widget).getListBox();
      } else if (widget instanceof MultipleListBox) {
         listBox = ((MultipleListBox) widget).getListBox();
      }

      listBox.clear();
      listBox.addItem("");
      for (Iterator it = classList.iterator(); it.hasNext();) {
         ClassItemMap item = (ClassItemMap) it.next();

         listBox.addItem(item.getText(ClassItemMap.NAME), item.getText(ClassItemMap.CODE));
      }
   }

   /**
    *
    * @param formName
    * @return Map of field widgets keyed by field name.
    */
   public Map getFormFields(String formName) {
      return (Map) getInputForms().get(formName);
   }

   /**
    *
    * @param formName
    * @return
    */
   public Map getFormFieldValues(String formName) {
      this.clearErrors();
      Map fields = (Map) getInputForms().get(formName);
      Map fieldValues = new HashMap();
      Iterator it = fields.keySet().iterator();
      for (;it.hasNext();) {
         String key = (String) it.next();
         Object value = getWidgetValue((Widget) fields.get(key));
         if (value != null) {
            fieldValues.put(key, value);
         }
         //check if data fields have no errors
         checkForErrors("", (Widget)fields.get(key));
      }
      return fieldValues;
   }

   /**
    * Get the display values of the form fields
    * @param formName
    * @return
    */
   public Map getFormFieldValueTexts(String formName) {
      Map fields = (Map) getInputForms().get(formName);
      Map fieldValueTexts = new HashMap();
      for (Iterator it = fields.keySet().iterator(); it.hasNext();) {
         String key = (String) it.next();
         Object value = getWidgetDisplayValue((Widget) fields.get(key));
         if (value != null) {
            fieldValueTexts.put(key, value);
         }
         //check if data fields have no errors
         checkForErrors("", (Widget)fields.get(key));
      }
      return fieldValueTexts;
   }

   public void setFormFieldsFromData() {
      for (Iterator it = getInputForms().keySet().iterator(); it.hasNext();) {
         setFormFieldsFromData((String) it.next());
      }
   }

   protected void setLockDataFromFormFields(String formName) {
      Map fields = (Map) getInputForms().get(formName);
      for(Iterator it = fields.keySet().iterator(); it.hasNext();) {
         String key = (String) it.next();
         Widget widget = (Widget) fields.get(key);
         setLockDataFromWidget(key, widget);
      }
   }

   protected void setLockDataFromWidget(String key, Widget widget) {
      if ((widget.getStyleName() != null) && (widget.getStyleName().startsWith("Disabled")))
         return;
      Object value = getWidgetValue(widget);
      getData().setProperty(key, value);
      if (widget instanceof ListBox && (value == null || value.equals(""))) {
         getData().setProperty(key, null);
      }
   }

   protected void setDataFromFormFields(String formName) {
      Map fields = (Map) getInputForms().get(formName);
      this.clearErrors();
      for (Iterator it = fields.keySet().iterator(); it.hasNext();) {
         String key = (String) it.next();
         Widget widget = (Widget) fields.get(key);
         setDataFromWidget(key, widget);
      }
   }

   private void setDataFromWidget(String key, Widget widget) {
      //TODO: Test if this works!!
      //      if ((widget.getStyleName() != null) && (widget.getStyleName().startsWith("Disabled")))
      //         return;
      Object value = getWidgetValue(widget);
      checkForErrors(key, widget);
      //if (value != null) TODO:test this if it works?
      getData().setProperty(key, value);
      if (widget instanceof ListBox && (value == null || value.equals(""))) {
         getData().setProperty(key, null);
      }
   }

   protected void checkForErrors(String key, Widget widget) {

      //this.getErrors().clear();
      Object value = getWidgetValue(widget);

      //validator validation
      if (validatorFields.containsKey(key)) {
         List validatorList = (List) validatorFields.get(key);
         for (Iterator itv = validatorList.iterator(); itv.hasNext();) {
            Validator validator = (Validator) itv.next();
            validator.validate(value, this);
         }
      }

      //date validation on all date boxes
      if(widget instanceof CalendarBox
            && ((CalendarBox)widget).getText() != null
            && ((CalendarBox)widget).getText().trim().length() > 0) {
         try {
            checkDate(((CalendarBox)widget).getText());
         } catch(Exception e) {
            String msg = "Kuupäev(ad) on valesti sisestatud või vigased!";
            setError(msg,InfoPanel.hasInfo);
            this.getErrors().add(msg);
         }
      } else if (widget instanceof RangeSelectBox && ((RangeSelectBox)widget).getType().equals(RangeFilter.CALENDAR)) {
         try {
            String top = ((RangeSelectBox)widget).getHigh() != null ?
                  ((RangeSelectBox)widget).getHigh().toString() : null;
                  String bottom = ((RangeSelectBox)widget).getLow() != null ?
                        ((RangeSelectBox)widget).getLow().toString() : null;
                        if(top != null && top.trim().length() != 0) {
                           checkDate(top);
                        }
                        if(bottom != null && bottom.trim().length() != 0) {
                           checkDate(bottom);
                        }
         } catch(Exception e) {
            String msg = "Kuupäev(ad) on valesti sisestatud või vigased!";
            setError(msg,InfoPanel.hasInfo);
            this.getErrors().add(msg);
         }
      }else if(widget instanceof RangeSelectTextBox && ((RangeSelectTextBox)widget).getType().equals(RangeFilter.NUMERIC)){
         try {
            String top = ((RangeSelectTextBox)widget).getHigh() != null ?
                  ((RangeSelectTextBox)widget).getHigh().toString() : null;
                  String bottom = ((RangeSelectTextBox)widget).getLow() != null ?
                        ((RangeSelectTextBox)widget).getLow().toString() : null;
                        if(top != null && top.trim().length() != 0) {
                           new Long(top);
                        }
                        if(bottom != null && bottom.trim().length() != 0) {
                           new Long(bottom);
                        }
         } catch (Exception e) {
            String msg = "Summa(d) pole numbrilised!";
            setError(msg,InfoPanel.hasInfo);
            this.getErrors().add(msg);
         }
      }

   }

   /**
    * First calls resetFormFields and then sets form fields from data
    *
    * @param formName
    */
   public void setFormFieldsFromData(String formName) {
      resetFormFields(formName);
      if (getData() == null)
         return;
      Map formTextFields = (Map) getInputForms().get(formName);
      for (Iterator it = formTextFields.keySet().iterator(); it.hasNext();) {
         setFormFieldFromData(formName, (String) it.next());
      }
   }

   public void setFormFieldFromData(String formName, String fieldName) {
      setFormFieldFromData(formName, fieldName, getData());
   }

   /**
    * Sets the value of a widget.
    *
    * @param formName
    * @param fieldName
    * @param data
    */
   public void setFormFieldFromData(String formName, String fieldName, ABaseDTOMap data) {
      if(data != null) {
         Object value = data.getProperty(fieldName);
         Widget widgets = getFormField(formName, fieldName);
         setWidgetValue(widgets, value, fieldName, data);
      }
   }

   public Object getFormFieldValue(String formName, String fieldName) {
      Object widget = getFormField(formName, fieldName);
      return getWidgetValue((Widget) widget);
   }

   /**
    *
    * @param formName
    * @param fieldName
    * @return List of widgets
    */
   public Widget getFormField(String formName, String fieldName) {
      Map formTextFields = (Map) getInputForms().get(formName);
      Object field = formTextFields.get(fieldName);

      if(field instanceof ArrayList) {
         return (Widget) ((ArrayList)field).get(0);
      }

      return (Widget) formTextFields.get(fieldName);
   }

   /**
    * Works only when no value is selected. The selected index is less than 0.
    * @param formName - name of the form
    * @param fieldName - name of the field
    * @param value - value that will be selected
    */
   public void setListBoxSelectedIndexByValue(String formName, String fieldName, Object value) {
      Object o = getFormField(formName, fieldName);
      GWT.log("setListBoxSelectedIndexByValue(" + formName +", " + fieldName + ", " + value + ")");
      if(o instanceof ListBox) {
         ListBox box = (ListBox)o;
         if(box.getSelectedIndex() <= 0) {
            for(int i = 0; i < box.getItemCount(); i++) {
               if(box.getValue(i).equals(value)) {
                  box.setSelectedIndex(i);
                  return;
               }
            }
            GWT.log(" searched value was not found!");
         }
      }

   }

   public Widget addFormField(String formName, String fieldName, Widget field) {
      Map formTextFields = (Map) getInputForms().get(formName);

      if (formTextFields == null) {
         formTextFields = new HashMap();
         getInputForms().put(formName, formTextFields);
      }
      // If widget exists with the same fieldName, make a list
      Object fieldList = formTextFields.get(fieldName);
      if (fieldList != null) {
         if (fieldList instanceof List)
            ((List) fieldList).add(field);
         else if (fieldList instanceof Widget) {
            List newList = new ArrayList();
            newList.add(fieldList);
            newList.add(field);
            formTextFields.put(fieldName, newList);
         }
      } else
         formTextFields.put(fieldName, field);
      // if(field instanceof HasName) {
      // ((HasName)field).setName(getLabel(fieldName));
      // }
      return field;
   }

   public Widget addFormField(String formName, String fieldName, Widget field, String width) {
      field.setWidth(width);
      return addFormField(formName, fieldName, field);
   }

   public Widget addFormField(String formName, String fieldName, Widget field, String width, String style) {
      if (width != null)
         field.setWidth(width);
      if (style != null) {
         field.setStyleName(style);
         if ("DisabledTextBox".equals(style) && (field instanceof TextBox))
            ((TextBox) field).setEnabled(false);
      }
      return addFormField(formName, fieldName, field);
   }

   public Widget addFormField(String formName, String fieldName, Widget field, String width, String style,
         String validators) {
      String[] validatorsArray = validators.split(", ");
      List validatorList = new ArrayList();
      for (int i = 0; i < validatorsArray.length; i++) {
         Validator validator = null;
         String validatorString = validatorsArray[i];
         if (validatorString.equals(Validators.REQUIRED)) {
            validator = new RequiredValidator(fieldName);
         } else if (validatorString.equals(Validators.INTEGER)) {
            //        	 int paramStart = validatorString.indexOf("[");
            //        	 int paramEnd = validatorString.indexOf("]");
            //        	 if(paramStart > -1 && paramEnd > -1) {
            //        		 String params = validatorString.substring(paramStart, paramEnd);
            //        		 String[] paramArray = params.split(",");
            //        		 if (paramArray.length == 1) {
            //        			 validator = new IntegerValidator(fieldName, paramArray[0]);
            //        		 } else if (paramArray.length == 2) {
            //        			 validator = new IntegerValidator(fieldName, paramArray[0], paramArray[1]);
            //        		 }
            //        	 } else {
            validator = new IntegerValidator(fieldName);
            //        	 }

         } else if (validatorString.equals(Validators.DATE)) {
            validator = new DateValidator(fieldName);
         } else if (validatorString.equals(Validators.NUMBER)) {
            validator = new NumberValidator(fieldName);
         } else if (validatorString.equals(Validators.NAME)) {
            validator = new NameValidator(fieldName);
         } else if (validatorString.startsWith(Validators.LENGTH)) {
            String regex = "length\\[[0-9]+,[0-9]+\\]$";
            if(validatorString.matches(regex)) {
               String params = validatorString.substring(
                     validatorString.indexOf("[")+1, validatorString.indexOf("]"));
               String param[] = params.split(",");
               int low = Integer.parseInt(param[0]);
               int high = Integer.parseInt(param[1]);
               validator = new LengthValidator(fieldName, low, high);
            } else {
               continue;
            }
         }
         validatorList.add(validator);
      }
      validatorFields.put(fieldName, validatorList);

      return addFormField(formName, fieldName, field, width, style);
   }

   public ABaseDTOMap getData() {
      return data;
   }

   public void setData(ABaseDTOMap data) {
      this.data = data;
   }

   public SelectReturnCallback getSelectReturnCallback() {
      return selectReturnCallback;
   }

   public void setSelectReturnCallback(SelectReturnCallback selectReturnCallback) {
      this.selectReturnCallback = selectReturnCallback;
   }

   public Map getInputForms() {
      return inputForms;
   }

   public void setInputForms(Map inputForms) {
      this.inputForms = inputForms;
   }

   private Object getWidgetValue(Widget widget) {
      Object value = null;
      if (widget instanceof TextBoxBase) {
         value = checkIfNull(((TextBoxBase) widget).getText());
      } else if (widget instanceof CalendarBox) {
         value = checkIfNull(((CalendarBox) widget).getText());
      } else if (widget instanceof CheckBox) {
         CheckBox cb = (CheckBox) widget;
         value = "false";
         if (cb.isChecked())
            value = "true";
         /*
          * if(cb.getName() != null) value = cb.getName(); else value = "true";
          */
      } else if (widget instanceof ListBox) {
         ListBox lb = (ListBox) widget;
         if (lb.getSelectedIndex() >= 0)
            value = checkIfNull(lb.getValue(lb.getSelectedIndex()));
      } else if (widget instanceof CheckBoxList) {
         CheckBoxList cbl = (CheckBoxList) widget;
         value = cbl.getValues();
      } else if (widget instanceof RadioButtonList) {
         RadioButtonList rbl = (RadioButtonList) widget;
         value = rbl.getValue();
      } else if (widget instanceof TextListBox) {
         value = checkIfNull(((TextListBox) widget).getText());
      } else if (widget instanceof PasswordTextBox) {
         value = checkIfNull(((PasswordTextBox) widget).getText());
      } else if (widget instanceof RangeSelectBox) {
         RangeSelectBox rsb = (RangeSelectBox)widget;
         String valueHigh = (String)checkIfNull(rsb.getHigh());
         String valueLow = (String)checkIfNull(rsb.getLow());
         String type = null;
         if(rsb.getType().equals(RangeSelectBox.CALENDAR)) {
            type = RangeFilter.CALENDAR;
            value = new RangeFilter(type, valueLow, valueHigh);
         }else if(rsb.getType().equals(RangeSelectTextBox.NUMERIC)){
            type = RangeFilter.NUMERIC;
            value = new RangeFilter(type, valueLow == null ? valueLow : valueLow.replace(',', '.')
                  , valueHigh == null ? valueHigh :  valueHigh.replace(',', '.'));
         }
      } else if (widget instanceof MultipleListBox) {
         MultipleListBox mlb = (MultipleListBox) widget;
         List values = mlb.getSelectedItems();
         values.remove("");
         values.remove(null);
         value = values;
      } else if (widget instanceof YesNoRadioBox) {
         YesNoRadioBox box = (YesNoRadioBox)widget;
         value = box.getValue();
      } else if (widget instanceof Hidden) {
         value = checkIfNull(((Hidden) widget).getValue());
      }
      return value;
   }

   /**
    * Return the display value of a widget
    * @param widget
    * @return
    */
   private Object getWidgetDisplayValue(Widget widget) {
      Object value = null;
      if (widget instanceof TextBoxBase) {
         value = checkIfNull(((TextBoxBase) widget).getText());
      } else if (widget instanceof CalendarBox) {
         value = checkIfNull(((CalendarBox) widget).getText());
      } else if (widget instanceof CheckBox) {
         CheckBox cb = (CheckBox) widget;
         value = "ei";
         if (cb.isChecked())
            value = "jah";
         /*
          * if(cb.getName() != null) value = cb.getName(); else value = "true";
          */
      } else if (widget instanceof ListBox) {
         ListBox lb = (ListBox) widget;
         if (lb.getSelectedIndex() >= 0)
            value = checkIfNull(lb.getItemText(lb.getSelectedIndex()));
      } else if (widget instanceof CheckBoxList) {
         CheckBoxList cbl = (CheckBoxList) widget;
         value = cbl.getValueNames();
      } else if (widget instanceof RadioButtonList) {
         RadioButtonList rbl = (RadioButtonList) widget;
         value = checkIfNull(rbl.getValueText());
      } else if (widget instanceof TextListBox) {
         value = checkIfNull(((TextListBox) widget).getValueText());
      } else if (widget instanceof PasswordTextBox) {
         value = checkIfNull(((PasswordTextBox) widget).getText());
      } else if (widget instanceof RangeSelectBox) {
         RangeSelectBox rsb = (RangeSelectBox)widget;
         value = rsb.toString();
      } else if (widget instanceof MultipleListBox) {
         MultipleListBox mlb = (MultipleListBox) widget;
         List values = mlb.getSelectedItemNames();
         values.remove("");
         values.remove(null);
         if(values.size() != 0) {
            value = values;
         } else {
            value = null;
         }

      } else if (widget instanceof YesNoRadioBox) {
         YesNoRadioBox box = (YesNoRadioBox)widget;
         value = checkIfNull(box.getValue());
      }
      return value;
   }

   private void setWidgetValue(Widget widget, Object value, String fieldName, ABaseDTOMap data) {
      //code to check if a classificator is active
      String classCode="";
      String className="";
      boolean active=true;
      if(fieldName.indexOf(".code") == fieldName.length()-5 && fieldName.length() > 5) {
         if(data.getProperty(fieldName.substring(0, fieldName.length()-4) + ClassItemMap.ACTIVE) != null) {
            Boolean _active = new Boolean(data.getProperty(fieldName.substring(0, fieldName.length()-4) + ClassItemMap.ACTIVE).toString());
            if(!_active.booleanValue()) {
               active = false;
               classCode = value.toString();
               className = data.getText(fieldName.substring(0, fieldName.length()-4) + ClassItemMap.NAME);
               //For debug in firefox and IE
               //InfoPanel.setInfo(classCode + ":" + className);
            }
         }

      }
      //end of active check
      if (value instanceof String) {
         String text = ((String) value).trim();
         if (widget instanceof TextBoxBase) {
            ((TextBoxBase) widget).setText(text);
         } else if (widget instanceof ListBox) {
            ListBox lb = (ListBox) widget;
            boolean isPresent = false;
            for (int i = 0; i < lb.getItemCount(); i++) {
               String listText = lb.getValue(i);
               if (listText.equals(text)) {
                  lb.setSelectedIndex(i);
                  isPresent = true;
                  break;
               }
            }
            //When a classificator is missing from it's listbox, then it's added
            if(!isPresent) {
               ((ListBox)widget).addItem(className, classCode);
               ((ListBox)widget).setSelectedIndex(((ListBox)widget).getItemCount()-1);
            }

         } else if (widget instanceof TextListBox) {
            if(!active) {
               ((TextListBox)widget).addItemWhenMissing(className, classCode);
            }
            ((TextListBox) widget).setText(text);
         } else if (widget instanceof RadioButtonList) {
            ((RadioButtonList) widget).setValue(text);
         } else if (widget instanceof CheckBox) {
            CheckBox cb = (CheckBox) widget;
            if ("true".equals(text))
               cb.setChecked(true);
            else
               cb.setChecked(false);
         } else if (widget instanceof CalendarBox) {
            ((CalendarBox) widget).setText(text);
         }
      } else if (value instanceof List) {
         if (widget instanceof CheckBoxList) {
            ((CheckBoxList) widget).setValues((List) value);
         }
         if (widget instanceof ListBox) {
            ArrayList list = (ArrayList) value;
            for (int i = 0; i < list.size(); i++) {
               Object valueData = list.get(i);
               String code = null;
               String text = null;
               if (valueData instanceof String) {
                  code = (String) valueData;
                  text = code;
               } else if (valueData instanceof ClassItemMap) {
                  code = (String) ((Map) valueData).get(ClassItemMap.CODE);
                  text = (String) ((Map) valueData).get(ClassItemMap.NAME);
               }
               ((ListBox) widget).addItem(text, code);
            }
         }
      }else if (value == null) {
         resetWidgetValue(widget);
      }

   }

   /*
    * Use in setWidgetValue when the value is null.</br> Also used in resetFormFields to reset form field values
    */
   private void resetWidgetValue(Object widget) {
      if (widget instanceof IResetable) {
         ((IResetable) widget).clear();
         //      } else if (widget instanceof TextArea) {
         //    	 ((TextArea) widget).
      } else if (widget instanceof TextBoxBase) {
         ((TextBoxBase) widget).setText("");
      } else if (widget instanceof ListBox) {
         ((ListBox) widget).setSelectedIndex(-1);
      } else if (widget instanceof CheckBox) {
         ((CheckBox) widget).setChecked(false);
      } else if (widget instanceof MultipleListBox) {
         ((MultipleListBox) widget).reset();
      }
   }

   /**
    * Used to empty form fields
    *
    * @param formName -
    *           the name of the form
    */
   public void resetFormFields(String formName) {
      Iterator col = getFormFields(formName).values().iterator();
      while (col.hasNext()) {
         Object o = col.next();
         resetWidgetValue(o);
      }
   }

   protected Object checkIfNull(Object input) {
      Object value = null;
      if(input!= null && input instanceof String) {
         String strValue = ((String)input).trim();
         if ((strValue.length() != 0) && !"null".equals(strValue.toLowerCase())) {
            value = strValue;
         }
      }
      return value;
   }

   public List getEnableDisableButtons() {
      return enableDisableButtons;
   }

   public void setButtonsEnabled(boolean enabled) {
      for (Iterator it = this.enableDisableButtons.iterator(); it.hasNext();) {
         ((Button) it.next()).setEnabled(enabled);
      }
   }

   @Override
   protected void onLoad() {
      super.onLoad();
      UIutils.setLoadMessageVisible(false);
   }

   protected static RegistryServiceAsync getRegistryService() {
      return ServiceContext.getInstance().getRegistryService();
   }

   protected static UserInfo getUserInfo() {
      return ServiceContext.getInstance().getUserInfo();
   }

   public boolean isInitialised() {
      return initialised;
   }

   public void setInitialised(boolean initialised) {
      this.initialised = initialised;
   }

   public void returnToParent(){
      SimplePanel main = (SimplePanel) this.getParent();
      main.clear();
      parent.clearInfo();
      main.add(parent);
      //	   parent.onReturn();
   }

   protected void returnToParentWithData() {
      SelectReturnCallback callback = getSelectReturnCallback();
      if (callback != null) {
         callback.getReturnForm().setLockDataFromFormFields(callback.getSubForm());
         callback.setSelection(data);
         parent = callback.getReturnForm();
         if(callback.getReturnForm() instanceof ApplicationForm){
            callback.onReturn();
         }
         returnToParent();
      }
   }
   /**
    *
    * Kui tegemist on etanoolisisalduse väljaga kontrollime väärtuse lõppu,00 puhul lõikame lõpu ära
    * @param fieldName
    */
   public Object checkGrade(String fieldName){
      Object value = data.getProperty(fieldName);
      if(data.getProperty(fieldName) != null){
         String valueString = data.getProperty(fieldName).toString();
         if(valueString.endsWith(".0")){
            int endPoint = valueString.indexOf(".");
            value = valueString.substring(0, endPoint);
            data.setProperty(fieldName,value );

         }

      }
      return value;
   }

   public String comaToDot(String a) {
      return a.replace(',', '.');
   }

   /**
    * Checks if there are any errors
    * @return
    */
   public boolean hasErrors() {
      if (this.getErrors() != null && !this.getErrors().isEmpty()) {
         return true;
      } else {
         return false;
      }
   }

   /**
    * Shows errors
    *
    */
   public void showErrors() {
      for (int i = 0; i < getErrors().size(); i++) {
         this.setError((String) getErrors().get(i));
      }
   }

   /**
    * Check if a given date exists
    * @param dateString
    */
   public void checkDate(String dateString) {
      dateString = dateString.replace('.', '/');
      String[] dateStrings = dateString.split("/");
      if(dateStrings.length != 3) {
         throw new RuntimeException("Vigane kuupäev!");
      } else {
         int year = Integer.parseInt(dateStrings[2]) ;
         int month = Integer.parseInt(dateStrings[1]) - 1;
         int day = Integer.parseInt(dateStrings[0]);
         if(year > 0 && month >= 0 && month < 12 && day > 0 && day < 32) {
            Date date = new Date(year -1900, month, day);
            if((date.getYear()+1900) != year || date.getMonth() != month) {
               throw new RuntimeException("Vigane kuupäev!");
            }
         } else {
            throw new RuntimeException("Vigane kuupäev!");
         }

      }
   }

   /**
    * Jump to top of the browser using JSNI
    */
   public static native void jumpToTop() /*-{
	  $wnd.scrollTo(0,0);
	}-*/;

}