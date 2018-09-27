package ee.agri.alkor.web.server;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.SocketException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
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

public class ChangePasswordServiceServlet extends HttpServlet {

	Connection c = null;
	Statement stmt = null;

	String contextPath = null;

	public String page(String uname, String error) {

		if (error.equals(null) || error.equals("")) {
			error = "";
		}

		return "<html xmlns=\"http://www.w3.org/1999/xhtml\">" + "<head>"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
				+ "<meta http-equiv=\"Cache-Control\" content=\"no-store\">"
				+ "<meta http-equiv=\"Pragma\" content=\"no-cache\">" + "<meta http-equiv=\"Expires\" content=\"0\">"
				+ "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\">"
				+ "<meta name=\"gwt:module\" content=\"ee.agri.alkor.web.Alkor\">"
				+ "<title>Riiklik Alkoholiregister</title>"
				+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"alkor.css\">"
				+ "<link href=\"https://alkor2.loc.piksel.ee:8443/alkor.css\"" + "	rel=\"stylesheet\">"
				+ "	<script>" + "function parse() {" + "    var pw1 = document.getElementById(\"pw1\").value;"
				+ "    var pw2 = document.getElementById(\"pw2\").value;" + "    if(pw1 == pw2){"
				+ "     if(pw1.length < 8){" + "      alert('Parool pole piisavalt pikk!');" + "return false;"
				+ "     }" + "    return true;" + "    } else {" + "      alert('Paroolid ei kattu');" + "return false;"
				+ "    }" + "    return false;" + "}" + "</script>" + "</head>"
				+ "<body style=\"height: 100%; margin: 0px;\">" + "<div style=\"color:#000; height:80px;\">"
				+ "<div style=\"float:left; margin-left:20px;\">"
				+ "<img src=\"images/0_veterinaar_vapp_est_85px.png\">" + "</div>"
				+ "<div style=\"float:right;color:#000;margin:33px 20px;font-size:1.0em; font-family:Arial;\">RIIKLIK ALKOHOLIREGISTER</div>"
				+ "</div>"
				+ "<iframe id=\"__gwt_historyFrame\" style=\"width: 0; height: 0; border: 0\"></iframe><iframe tabindex=\"-1\""
				+ "	style=\"position: absolute; width: 0px; height: 0px; border: medium none;\""
				+ "	id=\"ee.agri.alkor.web.Alkor\" src=\"javascript:''\"></iframe>"
				+ "<div style=\"position: absolute; left: 220px; top: 80px;\"" + "	class=\"InfoStyle\"></div>"
				+ "<table style=\"width: 100%; height: 100%;\" cellpadding=\"0\"" + "	cellspacing=\"0\">" + "	<tbody>"
				+ "		<tr>" + "			<td style=\"vertical-align: top;\" align=\"left\" height=\"100%\">"
				+ "			<table style=\"width: 35px; height: 100%; display: none;\" class=\"Left\""
				+ "				cellpadding=\"0\" cellspacing=\"0\">" + "				<tbody>"
				+ "					<tr>"
				+ "						<td style=\"vertical-align: top;\" align=\"left\"><img"
				+ "							style=\"width: 35px; height: 89px;\" class=\"gwt-Image\""
				+ "							src=\"images/paneel.gif\"></td>" + "					</tr>"
				+ "					<tr>"
				+ "						<td style=\"vertical-align: top;\" align=\"right\" height=\"100%\"><img"
				+ "							class=\"MenuOpenHide\" src=\"images/open_menu.gif\"></td>"
				+ "					</tr>" + "				</tbody>" + "			</table>" + "			</td>"
				+ "			<td style=\"vertical-align: top;\" align=\"left\" height=\"100%\""
				+ "				width=\"10%\">" + "			<table style=\"width: 170px; height: 100%;\" class=\"Left\""
				+ "				cellpadding=\"0\" cellspacing=\"0\">" + "				<tbody>"
				+ "					<tr>"
				+ "						<td style=\"vertical-align: top;\" align=\"left\"><img"
				+ "							class=\"gwt-Image\" src=\"images/logo.gif\"></td>"
				+ "					</tr>" + "					<tr>"
				+ "						<td style=\"vertical-align: top;\" align=\"right\"><img"
				+ "							class=\"MenuOpenHide\" src=\"images/close_menu.gif\"></td>"
				+ "					</tr>" + "					<tr>"
				+ "						<td class=\"Menu\" style=\"vertical-align: top;\" align=\"left\""
				+ "							height=\"100%\">"
				+ "						<table cellpadding=\"0\" cellspacing=\"0\">"
				+ "							<tbody>" + "								<tr>"
				+ "									<td style=\"vertical-align: top;\" align=\"left\">"
				+ "									<table class=\"MainMenu SelectedMenu\" style=\"width: 100%;\""
				+ "										cellpadding=\"0\" cellspacing=\"0\">"
				+ "										<tbody>" + "											<tr>"
				+ "												<td style=\"vertical-align: middle;\" align=\"left\"><img"
				+ "													class=\"gwt-Image\" src=\"images/nool_aktiivne.gif\"></td>"
				+ "												<td style=\"vertical-align: middle;\" align=\"left\""
				+ "													width=\"100%\">"
				+ "												<div class=\"gwt-Label\">Esileht</div>"
				+ "												</td>"
				+ "											</tr>" + "										</tbody>"
				+ "									</table>" + "									</td>"
				+ "								</tr>								"
				+ "							</tbody>" + "						</table>"
				+ "						</td>" + "					</tr>" + "				</tbody>"
				+ "			</table>" + "			</td>"
				+ "			<td style=\"vertical-align: top;\" align=\"left\" width=\"90%\">"
				+ "			<table style=\"width: 100%; height: 100%;\" cellpadding=\"0\""
				+ "				cellspacing=\"0\">" + "				<tbody>" + "					<tr>"
				+ "						<td style=\"vertical-align: top;\" align=\"left\">" + "					"
				+ "						</td>" + "					</tr>" + "					<tr>"
				+ "						<td style=\"vertical-align: top;\" align=\"left\">"
				+ "						<table style=\"display: none;\">" + "							<colgroup>"
				+ "								<col>" + "							</colgroup>"
				+ "							<tbody></tbody>" + "						</table>"
				+ "						</td>" + "					</tr>" + "					<tr>"
				+ "						<td style=\"vertical-align: top;\" align=\"left\" height=\"100%\">"
				+ "						<div style=\"width: 100%; height: 100%;\">"
				+ "						<div class=\"gwt-HTML\">" + "						<table width=\"100%\">"
				+ "							<tbody>" + "								<tr>"
				+ "									<td class=\"Title\">Riiklik alkoholiregister - Kasutaja <b>" + uname
				+ "</b> parooli seadistamine</td>" + "								</tr>"
				+ "							</tbody>" + "						</table>" + "						"
				+ "						<form method=\"post\" name=\"subber\">"
				+ "						<input type=\"hidden\" name=\"uname\" value=\"" + uname + "\">" + "" + error
				+ "" + "						<table class=\"Form\" width=\"100%\">"
				+ "							<tbody>" + "								<tr>"
				+ "									<td width=\"15%\"><b>*Aktiveerimiskood:</b></td>								"
				+ "									<td><input type=\"text\" name=\"oldpass\" id=\"oldpass\"></td>"
				+ "								</tr>" + "								<tr>"
				+ "									<td><b>*Parool:</b></td>								"
				+ "									<td><input type=\"password\" name=\"pw1\" id=\"pw1\"></td>"
				+ "								</tr>" + "								<tr>"
				+ "									<td><b>*Parool uuesti:</b></td>								"
				+ "									<td><input type=\"password\" name=\"pw2\" id=\"pw2\"></td>"
				+ "								</tr>								"
				+ "								<tr>" + "									<td></td>"
				+ "									<td>"
				+ "										<input type=\"submit\" style=\"width: 5em; height: 1.5em;\" "
				+ "										class=\"loginButton\" tabindex=\"0\"value=\"Salvesta\" onclick=\"return parse()\">"
				+ "									</td>" + "								</tr>"
				+ "							</tbody>" + "						</table>"
				+ "						</form>" + "						</div>" + "						</div>"
				+ "						</td>" + "					</tr>" + "				</tbody>"
				+ "			</table>" + "			</td>" + "		</tr>" + "	</tbody>" + "</table>" + "</body>"
				+ "</html>";
	}

	public void init() throws ServletException {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.contextPath = request.getContextPath();

		String uname = request.getParameter("uname");
		PrintWriter out = response.getWriter();

		try {
			ResultSet rs = PostgreUtils.query("select 1 from sys_user where name ='" + uname + "';");
			if (!rs.isBeforeFirst()) {
				/*
				 * naitab lehte valja
				 */
				response.sendRedirect(contextPath);

			}
		} catch (Exception e) {
			out.write(e.toString());

		}

		/*
		 * Lehe kuvamine
		 */
		out.write(page(uname, " "));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.contextPath = request.getContextPath();
		String uname = request.getParameter("uname");
		String oldpass = request.getParameter("oldpass");
		String pw = request.getParameter("pw1");
		PrintWriter out = response.getWriter();

		try {
			ResultSet rs = PostgreUtils
					.query("select 1 from sys_user where name ='" + uname + "' and password='" + oldpass + "';");
			if (!rs.isBeforeFirst()) {
				/*
				 * naitab lehte valja
				 */
				out.write(page(uname, "Vigane aktiveerimiskood!"));
			} else {
				/*
				 * Update ja alkoregi suunamine
				 */
				boolean active = true;
				PostgreUtils.update("update sys_user set password = '" + getMD5(pw) + "', active = TRUE where name ='"
						+ uname + "' and password='" + oldpass + "';");
				response.sendRedirect(contextPath);

			}
		} catch (Exception e) {
			out.write(e.toString());

		}

	}

	private String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(input.getBytes());

			byte byteData[] = md.digest();

			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}

			return sb.toString().substring(0, 19);
		} catch (NoSuchAlgorithmException ex) {
			return input;
		}
	}

}