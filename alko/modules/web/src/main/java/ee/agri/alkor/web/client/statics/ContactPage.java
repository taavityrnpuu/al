/**
 *
 */
package ee.agri.alkor.web.client.statics;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;

import ee.agri.alkor.web.client.ServiceContext;
import ee.agri.alkor.web.client.common.Form;

/**
 * @author kaupo
 *
 */
public class ContactPage extends Form {

	public static final String getKey() {
		return "ContactPage";
	}

	public Object getConstantsWithLookup() {
      if ("est".equals(ServiceContext.getInstance().getLanguage()))
         return GWT.create(ContactPageMessages.class);
      else
         return GWT.create(ContactPageMessagesEng.class);
	}

	/**
     *
     */
	public ContactPage() {
		super();
	}

	public void init() {
		super.init();
		//create the main table
	  HTML html = new HTML();
      String title = getLabel("title");
      String linkName = getLabel("linkName");
      String linkWeb = getLabel("linkWeb");
	  html.setHTML(
				"<table width='100%'> "+
	               "<tr> "+
	                "  <td class='Title'>"+title+"</td> "+
	               "</tr> "+
	               "</table>"+
                  "<table width='100%' class='Form'>"+
                  "<tr> "+
                  "<td class='SubTitle'><a href='"+linkWeb+"' target=\"_blank\">"+linkName+"</a></td> "+
//	               "<table>"+
//	               "<tr> "+
//	               "<td> "+
//	               "<table style='margin: 30px 40px;' class='Table' cellspacing = '0' cellpadding = '5' border='1'>"+
//	               "<tr class= 'Header'> "+
//	               "   <td>Nimi</td> "+
//	               "   <td>Amet</td> "+
//	               "   <td>Telefon</td> "+
//	               "   <td>Mobiil</td> "+
//	               "   <td>E-mail</td> "+
//	               "</tr> "+
//	               "<tr> "+
//	               "   <td>Ain Zereen</td> "+
//	               "   <td>Büroojuhataja</td> "+
//	               "   <td>601 6595</td> "+
//	               "   <td>53 413 106</td> "+
//	               "   <td><a href=\"mailto:ain.zereen@vet.agri.ee\">ain.zereen@vet.agri.ee</a></td> "+
//	               "</tr> "+
//	               "<tr> "+
//	               "   <td>Piret Priisalu</td> "+
//	               "   <td>Peaspetsialist</td> "+
//	               "   <td>605 1715</td> "+
//	               "   <td>52 54 421</td> "+
//	               "   <td><a href=\"mailto:piret.priisalu@vet.agri.ee\">piret.priisalu@vet.agri.ee</a></td> "+
//	               "</tr> "+
//	               "<tr> "+
//	               "   <td>Astrid Aulik</td> "+
//	               "   <td>Peaspetsialist</td> "+
//	               "   <td>605 6878</td> "+
//	               "   <td></td> "+
//	               "   <td><a href=\"mailto:astrid.aulik@vet.agri.ee\">astrid.aulik@vet.agri.ee</a></td> "+
//	               "</tr> "+
//	               "<tr> "+
//	               "   <td>Mai Loo</td> "+
//	               "   <td>Peaspetsialist</td> "+
//	               "   <td>605 6872</td> "+
//	               "   <td></td> "+
//	               "   <td><a href=\"mailto:mai.loo@vet.agri.ee\">mai.loo@vet.agri.ee</a></td> "+
//	               "</tr> "+
//	               "<tr> "+
//	               "   <td>Liia Maamägi</td> "+
//	               "   <td>Peaspetsialist</td> "+
//	               "   <td>605 1738</td> "+
//	               "   <td></td> "+
//	               "   <td><a href=\"mailto:liia.maamagi@vet.agri.ee\">liia.maamagi@vet.agri.ee</a></td> "+
//	               "</tr> "+
//	               "<tr> "+
//	               "   <td>Anne Siig</td> "+
//	               "   <td>Peaspetsialist</td> "+
//	               "   <td>605 6871</td> "+
//	               "   <td></td> "+
//	               "   <td><a href=\"mailto:anne.siig@vet.agri.ee\">anne.siig@vet.agri.ee</a></td> "+
	            "</tr> "+
	            "</table>" +
	            "</td>" +
	            "</tr> "+
	            "</table>"
		);
//		FlexTable main = new FlexTable();
//		main.setWidth("100%");
//		Label title = new Label(getLabel(ContactPageMessages.TITLE));
//		title.setStyleName("Title");
//		main.setWidget(0, 0, title);

		//create the contacts table
//		FlexTable contacts = new FlexTable();
//		contacts.setWidth("100%");
//		contacts.setStyleName("Table");
//		contacts.setCellPadding(5);
//		contacts.setCellSpacing(1);
//		contacts.setBorderWidth(1);
//		contacts.getRowFormatter().setStyleName(0, "Header");
//		contacts.setText(0, 0, getLabel(ContactPageMessages.NAME));
//		contacts.setText(0, 1, getLabel(ContactPageMessages.ROLE));
//		contacts.setText(0, 2, getLabel(ContactPageMessages.PHONENR));
//		contacts.setText(0, 3, getLabel(ContactPageMessages.EMAIL));
//
//		//Add contacts to the table
//		addContactRow(contacts, "contact1");
//		addContactRow(contacts, "contact2");
//		main.setWidget(1, 0, contacts);
		html.setHTML(getLabel(ContactPageMessages.CONTENT));
		initWidget(html);
	}

}
