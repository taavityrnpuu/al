package ee.agri.alkor.web.server;

import static org.apache.commons.lang.StringEscapeUtils.escapeXml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.SocketException;
import java.net.URLDecoder;
import java.security.Principal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.ExecutionException;
import java.sql.Connection;
import java.sql.DriverManager;
import ee.agri.alkor.impl.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ee.agri.alkor.impl.PostgreUtils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.httpclient.util.DateParseException;
import org.apache.log4j.Logger;

import com.google.gwt.core.ext.typeinfo.ParseException;

import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.SystemException;

public class ShowPublicDocServiceServlet extends HttpServlet {
	Connection c = null;
	Statement stmt = null;
	Statement stmt2 = null;
	String contextPath = null;

	public void init() throws ServletException {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		this.contextPath = request.getContextPath();

		String id = request.getParameter("productid");
		String dl = request.getParameter("dl");

		int productId = 0;

		ResultSet rs = null;
		ResultSet productRS = null;

		try {
			productId = Integer.parseInt(id);
		} catch (NumberFormatException ex) {
			// VIGA
			out.write(ex.toString());
		}

		// String sql =
		// "select * from reg_doc where public = 1 and doc_appl_id =" +
		// productId;

		String sql = "select * from reg_doc where public = 1 and doc_appl_id in(select id from reg_application where nr = '"
				+ productId + "')";

		String sql2 = "select p.*, ra.decision_date as okv from product as p left outer join reg_application as ra on ra.product_id = p.id where p.id in(select product_id from reg_application where nr = '"
				+ productId + "')";

		rs = PostgreUtils.query(sql);			
		productRS = PostgreUtils.query(sql2);
	
		/*
		 * Lehe kuvamine
		 */
		try {
			this.page(rs, out, productRS);
		} catch (Exception ex) {

		}
	}

	public void page2(ResultSet rs, PrintWriter out, ResultSet productRS)
			throws SQLException, IOException {
		// resultset sisestab endas avalike faile.
		out.write("<html>");
		out.write("<head>");
		out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"alkor.css\"/>");
		out.write("<title>");
		out.write("tarbijapakendite v&auml;rvifotod ja tooteetikettide n&auml;idised");
		out.write("</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("Siia kirjeldav tekst...<br>");
		out.write("<table>");

		while (rs.next()) {
			String id = escape(rs.getString("id"));
			String name = escape(rs.getString("name"));
			String path = escape(rs.getString("path"));
			out.write("<tr>");
			out.write("<td>");
			out.write("<a href=\""+this.contextPath+"down?id=" + id + "\" >"
					+ name + "</a>");
			out.write("</td>");
			out.write("</tr>");
		}
		out.write("<tr>");
		out.write("<td>");

		out.write("<input type=\"button\" value=\"Sulge\" class=\"gwt-Button\" onclick=\"window.close();\"");

		out.write("</td>");
		out.write("</tr>");
		out.write("</table>");
		out.write("</body>");
		out.write("</html>");	
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

	public String escape(String s) {
		// return s;
		return escapeXml(s);
		/*
		 * Replaceme ainult viis m�rki < => &lt; > => &gt; " => &quot; \ =>
		 * &#39; & => &amp;
		 */
		// s = s.replaceAll("&", "&amp;");
		// s = s.replaceAll("<", "&lt;");
		// s = s.replaceAll(">", "&gt;");
		// s = s.replaceAll("\"", "&quot;");
		// s = s.replaceAll("\\", "&#39;");

		// return s;
	}

	private void doDownload(String file, String name, String type,
			HttpServletResponse response) {
		response.setContentType(type);
		
		String [] parts = file.split("/");
		
		// Make sure to show the download dialog
		response.setHeader("Content-disposition", "attachment; filename="
				+ name);
		OutputStream out = null;
		try {
			out = response.getOutputStream();
		} catch (IOException ex) {

		}
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
		} catch (FileNotFoundException ex) {

		}
		byte[] buffer = new byte[4096];
		int length;

		try {
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.flush();

		} catch (IOException e) {

		}

	}

	public void page(ResultSet rs, PrintWriter out, ResultSet productRS)
			throws SQLException, IOException, java.text.ParseException {
		out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><head>");
		out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\">");
		out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\">");
		out.write("<meta http-equiv=\"Expires\" content=\"0\">");
		out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\">");
		out.write("<meta name=\"gwt:module\" content=\"ee.agri.alkor.web.Alkor\">");
		out.write("<title>Tarbijapakendite v&auml;rvifotod ja tooteetikettide n&auml;idised</title>");
		out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"alkor.css\">");
		out.write("<link rel=\"stylesheet\" href=\"alkor.css\"></head>");
		out.write("<body style=\"height: 100%; margin: 0px;\" cz-shortcut-listen=\"true\">");
		out.write("<div style=\"color:#000; height:80px;\">");
		out.write("<div style=\"float:left; margin-left:20px;\">");
		out.write("<img src=\"images/0_veterinaar_vapp_est_85px.png\">");
		out.write("</div>");
		out.write("<div style=\"float:right;color:#000;margin:33px 20px;font-size:1.0em; font-family:Arial;\">RIIKLIK ALKOHOLIREGISTER</div>");
		out.write("</div>");

		out.write("<table cellspacing=\"0\" cellpadding=\"0\" style=\"width: 100%; height: 100%;\"><tbody><tr><td align=\"left\" height=\"100%\" style=\"vertical-align: top;\"><table cellspacing=\"0\" cellpadding=\"0\" class=\"Left\" style=\"width: 45px; height: 100%; display: none;\"><tbody><tr><td align=\"left\" style=\"vertical-align: top;\"><img src=\"images/paneel.gif\" class=\"gwt-Image\" style=\"width: 45px; height: 89px;\"></td></tr><tr><td align=\"right\" height=\"100%\" style=\"vertical-align: top;\"><img src=\"images/open_menu.gif\" class=\"MenuOpenHide\"></td></tr></tbody></table></td><td align=\"left\" width=\"90%\" style=\"vertical-align: top;\"><table cellspacing=\"0\" cellpadding=\"0\" style=\"width: 100%; height: 100%;\"><tbody><tr><td align=\"left\" style=\"vertical-align: top;\"><table cellspacing=\"0\" cellpadding=\"0\" class=\"RightLine\" style=\"width: 100%; height: 45px;\"><tbody><tr><td align=\"left\" width=\"100%\" style=\"vertical-align: top;\"><img src=\"images/logo.gif\" class=\"gwt-Image\" style=\"width: 154px; height: 45px; display: none;\"></td></tr></tbody></table></td></tr><tr><td align=\"left\" style=\"vertical-align: top;\"><table style=\"display: none;\"><colgroup><col></colgroup><tbody></tbody></table></td></tr><tr><td align=\"left\" height=\"100%\" style=\"vertical-align: top;\"><div style=\"width: 100%; height: 100%;\"><div class=\"gwt-HTML\"><table width=\"100%\">");
		
		out.write("<tbody><tr><td class=\"Title\">Tarbijapakendi v&auml;rvifotod v&otilde;i etikettide n&auml;idised</td></tr></tbody></table>");
		out.write("<table class=\"Table\" cellspacing=\"1\" cellpadding=\"5\" style=\"width: 100%;\">");
		out.write("<colgroup><col></colgroup><tbody>");

		while (productRS.next()) {
			String name = escape(productRS.getString("name"));

			String created =  escape(productRS.getString("okv"));

			String [] parts = created.split("-");			
			
			String [] parts2 = parts[2].split(" ");
			
			created = parts2[0] + "." + parts[1] + "." + parts[0];
			
			out.write("<tr>");
			out.write("<td>Toote nimi: <b>" + name + "</b></td>");
			out.write("<td></td>");
			out.write("</tr>");
			out.write("<tr>");
			out.write("<td>Reg kpv: <b>" + created + "</b></td>");
			out.write("<td></td>");
			out.write("</tr>");
		}
		out.write("<table class=\"Table\" cellspacing=\"1\" cellpadding=\"5\" style=\"width: 100%;\">");
		out.write("<colgroup><col></colgroup><tbody>");
		out.write("<tr class=\"Header\">");
		out.write("<td>Faili nimetus</td>");
		out.write("</tr>");
		while (rs.next()) {
			String id = escape(rs.getString("id"));
			String name = escape(rs.getString("name"));
			String path = escape(rs.getString("path"));
			out.write("<tr>");
			out.write("<td>");
			out.write("<a href=\""+this.contextPath+"down?id=" + id + "\" >"
					+ name + "</a>");
			out.write("</td>");
			out.write("</tr>");
		}
		out.write("<tr>");
		out.write("<td align=\"left\" style=\"vertical-align: top;\"><input type=\"button\" value=\"Sulge\" class=\"gwt-Button\" onclick=\"window.close();\"></td>");
		out.write("</tr>");
		out.write("</tbody></table>");
		out.write("</body></html>");
	}
}
