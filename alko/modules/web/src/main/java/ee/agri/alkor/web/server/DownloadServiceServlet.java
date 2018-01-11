package ee.agri.alkor.web.server;

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
import java.sql.Connection;
import java.sql.DriverManager;
import ee.agri.alkor.impl.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.providers.UsernamePasswordAuthenticationToken;
import org.acegisecurity.providers.x509.X509AuthenticationToken;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;

import ee.agri.alkor.impl.PostgreUtils;
import ee.agri.alkor.model.AlkoUserDetails;
import ee.agri.alkor.model.RegistryDocument;
import ee.agri.alkor.service.IClassificatorService;
import ee.agri.alkor.service.IRegistryService;
import ee.agri.alkor.service.SearchFilter;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.web.service.ServiceConstants;
import ee.agri.alkor.web.service.SystemException;

import static org.apache.commons.lang.StringEscapeUtils.escapeXml;

public class DownloadServiceServlet extends HttpServlet {
	String contextPath = null;

	public void init() throws ServletException {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.contextPath = request.getContextPath();

		String id = request.getParameter("id");

		int fileId = 0;

		try {
			fileId = Integer.parseInt(id);
		} catch (NumberFormatException ex) {

		}

		if (request.getParameter("type") != null && request.getParameter("type").equals("report")) {
			// response.getWriter().write("DOWNLOAD ID " + id);
			downloadReport(response, id);
		} else {
			try {

				ResultSet rs = PostgreUtils.query("select * from reg_doc where public=1 and id=" + fileId);
				while (rs.next()) {
					String name = rs.getString("name");
					String path = rs.getString("path");
					String mime = rs.getString("mime");
					this.doDownload(path, name, mime, response);

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
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

	public void doDownload(String file, String name, String type, HttpServletResponse response) {
		response.setContentType(type);

		name = file.substring(file.lastIndexOf("/") + 1);

		// Make sure to show the download dialog
		response.setHeader("Content-disposition", "attachment; filename=" + name);
		OutputStream out = null;
		try {
			out = response.getOutputStream();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
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
			e.printStackTrace();
		}

	}

	public void downloadReport(HttpServletResponse resp, String id) {
		try {
			int idInt = Integer.valueOf(id);
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT apl.id AS apl_id, apl.product_id AS apl_product_id, list.nr, list.id, list.created, list.amount, list.receiver, list.party_nr, list.market_place, ");
			sql.append(" list.market_addr, list.market_distr, list.market_orgunit, list.regentry_id, list.report_id, list.report_date, list.reporting_ent, list.reporting_ent_reg_id, ");
			sql.append(" apl.name, apl.prod_class_id AS product_class_id, apl.org_country_class_id AS product_orig_country_class_id, apl.country_class_id AS producer_country_class_id, apl.ent_name AS producer_name ");
			sql.append("   FROM ( SELECT reg.nr, rep.id, rep.created, rep.amount, rep.receiver, rep.party_nr, rep.market_place, rep.market_addr, rep.market_distr, rep.market_orgunit, ");
			sql.append("   rep.regentry_id, rep.report_id, rec.report_date, ent.name AS reporting_ent, ent.reg_id AS reporting_ent_reg_id ");
			sql.append("           FROM product_move_report_record rep ");
			sql.append("      LEFT JOIN reg_entry reg ON rep.regentry_id = reg.id ");
			sql.append("   LEFT JOIN product_move_report rec ON rep.report_id = rec.id ");
			sql.append("   LEFT JOIN enterprise ent ON rec.report_ent_id = ent.id WHERE report_id = " + idInt + ") list ");
			sql.append("   LEFT JOIN ( SELECT reg.regentry_id, reg.id, reg.product_id, prod.name, prod.prod_class_id, prod.org_country_class_id, ent.country_class_id, ent.name AS ent_name ");
			sql.append("           FROM reg_application reg ");
			sql.append("      LEFT JOIN product prod ON reg.product_id = prod.id ");
			sql.append("   LEFT JOIN enterprise ent ON prod.producer_subj_id = ent.id ");
			sql.append("  WHERE reg.id = prod.appl_id) apl ON apl.regentry_id = list.regentry_id;");
			
			resp.setHeader("Content-type", "text/csv; charset=ISO-8859-1");
			resp.setHeader("Content-disposition", "attachment; filename=aruanne_"+idInt+".csv");
			ResultSet rs = PostgreUtils.query(sql.toString());	
			OutputStream out = null;
			out = resp.getOutputStream();
			while (rs.next()){	
				String row = "";
				
				row+="\"" + rs.getString("nr") + "\";";
				row+="\"" + rs.getString("receiver") + "\";";
				row+="\"" + rs.getString("market_place") + "\";";
				row+="\"" + rs.getString("market_distr") + "\";";
				row+="\"" + rs.getString("market_orgunit") + "\";";
				row+="\"" + rs.getString("market_addr") + "\";";
				row+="\"" + rs.getString("party_nr") + "\";";
				row+=rs.getString("amount");
				row+="\r\n";
				
				out.write(row.getBytes("ISO-8859-1"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			try{
				resp.getWriter().write("VIGA");
			} catch (Exception ex2){
				ex2.printStackTrace();
			}
		}
	}

}