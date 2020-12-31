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
			"<table width='100%'>"+
			"	<tr>"+
			"		<td class='Title'>title</td>"+
			"	</tr>"+
			"	<tr>"+
			"		<td>"+
			"			<table width='100%' class='Form'>"+
			"				<tr class='Title'>"+
			"					<td>Peaspetsialist</td>"+
			"				</tr>"+
			"				<tr>"+
			"					<td>Ingrid Hamburg</td>"+
			"				</tr>"+
			"				<tr>"+
			"					<td>Tel: 372 605 1738</td>"+
			"				</tr>"+
			"				<tr>"+
			"					<td></td>"+
			"				</tr>"+
			"				<tr class='Title'>"+
			"					<td>Peaspetsialist</td>"+
			"				</tr>"+
			"				<tr>"+
			"					<td>Astrid Aulik</td>"+
			"				</tr>"+
			"				<tr>"+
			"					<td>Tel: 372 605 6878, 372 5860 9110</td>"+
			"				</tr>"+
			"			</table>"+
			"		</td>"+
			"	</tr>"+
			"</table>"
		);
		
		html.setHTML(getLabel(ContactPageMessages.CONTENT));
		initWidget(html);
	}
}
