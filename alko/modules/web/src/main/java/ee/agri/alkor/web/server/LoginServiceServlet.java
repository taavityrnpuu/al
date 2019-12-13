package ee.agri.alkor.web.server;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import ee.agri.alkor.impl.ResultSet;
import ee.agri.alkor.model.Enterprise;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.xml.security.utils.Base64;
import org.jasig.cas.client.validation.Assertion;

import ee.agri.alkor.impl.PostgreUtils;

import sun.security.provider.X509Factory;
import ee.agri.alkor.service.ServiceFactory;
import ee.agri.alkor.xtee.impl.EnterpriseRegisterQueryImpl;
import eu.x_road.arireg.producer.*;
import eu.x_road.arireg.producer.holders.*;
import org.apache.axis.message.*;

import javax.xml.soap.SOAPElement;

public class LoginServiceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String serviceEndpointURL;

	public void init() throws ServletException {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Assertion a = (Assertion) request.getSession().getAttribute("_const_cas_assertion_");

		String tableBody = "";

		String ik = null;

		if (a != null && a.getPrincipal() != null && a.getPrincipal().getName() != null) {
			ik = a.getPrincipal().getName().replace("EE", "");
			request.getSession().setAttribute("user_ik", ik);
			request.getSession().setAttribute("fromCas", "1");
		} else {
			ik = (String) request.getSession().getAttribute("user_ik");
			System.out.println("CAS principal puudu. Võtame isikukoodi sessioonist");
		}

		boolean isVta = false;
		boolean hasRoles = false;

		System.out.println("CAS'st isikukood: " + ik);
		
		if (ik != null && !ik.equals("")) {
			checkAndCreateUserArireg(ik);
		}
		
		try {
			String templ = getTemplate(request, "login_template.html");
			try {
				if(ik != null && !ik.equals("")) {
					String sql = "select 1 from sys_user as sys join person as p on p.id = sys.person_id and (p.reg_id = '"
							+ ik + "' or p.reg_id = 'EE" + ik + "') where sys.active = true";
					ResultSet rs = PostgreUtils.query(sql);
					
					while(rs.next()) {
						isVta = true;
						hasRoles = true;
					}
					
					if(isVta) {
						tableBody += getTableRow("Riik (VTA, EMTA jt)", "", null, null);
					}
					
					PostgreUtils.update("UPDATE enterprise_person_ref SET valid = false where valid = true and id_code = '"
									+ ik + "' and valid_until < now() and valid_until is not null");
					
					sql = "select ent_name, reg_nr, null as valid_until from user_arireg where id_code = '" + ik
						+ "' UNION "
						+ "select e.name, e.reg_id, (SELECT valid_until FROM enterprise_person_ref WHERE valid = true and id_code = '"
						+ ik + "' and enterprise_id = e.id) "
						+ "from enterprise e where id in (SELECT enterprise_id FROM enterprise_person_ref WHERE valid = true and id_code = '"
						+ ik + "')";
					
					rs = PostgreUtils.query(sql);
					if(rs != null && !rs.wasNull()) {
						while (rs.next()) {
							tableBody += getTableRow(StringEscapeUtils.escapeHtml(rs.getString("ent_name")),
									rs.getString("reg_nr"), rs.getString("reg_nr"), rs.getDate("valid_until"));
							hasRoles = true;
						}
					}
				}

				String body = "";
				if (hasRoles) {
					body = getTemplate(request, "table_body.html");
					body = body.replace("{{TABLE_BODY}}", tableBody);
				} else {
					body = getTemplate(request, "login_failure.html");
				}
				templ = templ.replace("{{BODY}}", body);
				
				out.write(templ);
			} catch (Exception x) {
				x.printStackTrace();

				templ = templ.replace("{{BODY}}", x.getMessage());
				out.write(templ);
			}

		} catch (Exception ex) {
			out.write(ex.getMessage());
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fromCasLogin = request.getParameter("fromcaslogin");
		
		if (fromCasLogin != null && fromCasLogin.equals("1")) {
			try {
				byte[] decoded = Base64.decode(request.getParameter("input_cert").replaceAll(X509Factory.BEGIN_CERT, "")
						.replaceAll(X509Factory.END_CERT, ""));
				X509Certificate sert = (X509Certificate) CertificateFactory.getInstance("X.509")
						.generateCertificate(new ByteArrayInputStream(decoded));
				request.getSession().setAttribute("user_login_cert", sert);

			} catch (Exception ex) {
				ex.printStackTrace();
			}
			response.sendRedirect("/loginservice");
		} else {
			String ik = (String) request.getSession().getAttribute("user_ik");
			boolean saadaEdasi = false;

			if (request.getParameter("reg_code") != null && !request.getParameter("reg_code").equals("null")) { // kui
																												// valis
																												// reg_nr'i
																												// mitte
																												// VTA

				String regNr = request.getParameter("reg_code").replaceAll("'", "\"");

				try {
					ResultSet rs = PostgreUtils.query("select 1 from user_arireg where id_code = '" + ik
							+ "' and reg_nr = '" + regNr + "'" + "UNION "
							+ "SELECT 1 FROM enterprise_person_ref WHERE valid = true and id_code = '" + ik
							+ "' and enterprise_id = (SELECT id FROM enterprise WHERE reg_id = '" + regNr
							+ "' ORDER BY created DESC LIMIT 1)");
					if (rs.next()) {
						saadaEdasi = true;
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				if (saadaEdasi) {
					String sql = "SELECT ent_name FROM user_arireg WHERE reg_nr = '" + regNr
							+ "' ORDER BY created DESC LIMIT 1";
					String entName = null;
					boolean enterpriseExists = false;

					try {
						ResultSet rs = PostgreUtils.query(sql);
						while (rs.next()) {
							entName = rs.getString("ent_name");
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}

					sql = "SELECT 1 FROM enterprise WHERE reg_id = '" + regNr + "'";

					try {
						ResultSet rs2 = PostgreUtils.query(sql);
						while (rs2.next()) {
							enterpriseExists = true;
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}

					if (enterpriseExists) {
						if (entName != null && !entName.equals("")) {
							sql = "UPDATE enterprise SET name = '" + entName + "' WHERE reg_id = '" + regNr
									+ "' and name != '" + entName + "'";
							PostgreUtils.update(sql);
						}
					} else {
						sql = "INSERT INTO enterprise (id, created, created_by, reg_id, name, version, active, balance) VALUES (nextval('ENTERPRISE_SEQ'), NOW(), 'auto_lisamine', '"
								+ regNr + "','" + entName + "', 1, true, 0.0)";
						long entr_id = PostgreUtils.insert(sql, "id");

						sql = "INSERT INTO enterprise_role (id, version, ent_role_id, enterprise_id) VALUES (nextval('enterprise_role_seq'), 0, "
								+ "(SELECT id FROM classificator WHERE category = 'EnterpriseRole' AND code = 'APL'),"
								+ "(SELECT id FROM enterprise WHERE reg_id = '" + regNr
								+ "' ORDER BY created DESC LIMIT 1))";
						PostgreUtils.insert(sql);

						try {
							EnterpriseRegisterQueryImpl erImpl = new EnterpriseRegisterQueryImpl();
							erImpl.setQueringPersonRegNr(ik);
							Enterprise entrpr = erImpl.findEnterprise(regNr);

							entrpr.setId(entr_id);
							entrpr.setVersion(1);
							entrpr.setCreated(new Date());
							entrpr.setCreatedBy("auto_lisamine");
							entrpr.setActive(true);
							entrpr.setBalance(new BigDecimal(0));

							ServiceFactory.getRegistryService().saveOrUpdate(entrpr);
						} catch (Exception x) {
							x.printStackTrace();
						}
					}
				}
			} else {
				saadaEdasi = true;
			}

			if (saadaEdasi) {
				PostgreUtils.insert("INSERT INTO user_session (id_code, reg_nr) VALUES ('" + ik + "','"
						+ request.getParameter("reg_code").replaceAll("'", "\"") + "')");
				request.getSession().setAttribute("login_reg_code", (String) request.getParameter("reg_code"));
				response.sendRedirect("/login");
			} else { // kasutaja viibimisel loginlehel oli õiguste olukord
						// muutunud
				response.sendRedirect("/loginservice");
			}
		}
	}

	public String getTemplate(HttpServletRequest request, String tmpl) throws Exception {
		URL url = this.getServletContext().getResource(tmpl);
		File file = new File(url.getPath());
		FileInputStream fis = new FileInputStream(file);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		String inputLine;
		
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
			response.append(inputLine + "\n");
		}
		
		in.close();
		return response.toString();
	}

	public static String getBaseUrl(HttpServletRequest request) {
		String scheme = request.getScheme() + "://";
		String serverName = request.getServerName();
		String serverPort = (request.getServerPort() == 80) ? "" : ":" + request.getServerPort();
		String contextPath = request.getContextPath();
		return scheme + serverName + serverPort + contextPath + "/";
	}

	private String getTableRow(String name, String info, String regCode, Date validUntil) {

		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		String row = "<tr><td>" + name + "</td><td>" + info + "</td><td>"
				+ (validUntil != null ? format.format(validUntil) : "") + "</td><td>";

		row += "<form method=\"post\" action=\"/loginservice\"><input type=\"hidden\" name=\"reg_code\" value=\""
				+ regCode + "\"><input type=\"submit\" value=\"Sisene\" class=\"btn btn-success\"></form>";

		row += "</td></tr>";

		return row;
	}

	public void checkAndCreateUserArireg(String ik) {
		// vaatame tabelisse, not exists küsime
		// vaatame tabelisse exist aegunud, küsime (ajaaken last_checked + 6h <
		// now()), siis küsime (Kõik)
		// kui pole aegunud ja on tulemusi, siis edasi
		boolean exists = false;

		String sql = "SELECT 1 FROM user_arireg WHERE id_code = '" + ik + "'";

		try {
			ResultSet rs = PostgreUtils.query(sql);
			while (rs.next()) {
				exists = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		if (!exists) {
			HashMap<String, String[]> map = getAriregData(ik);

			String regNrs = "";

			for (Map.Entry<String, String[]> entry : map.entrySet()) {
				String regNr = entry.getKey();
				String[] split = entry.getValue();

				String entName = split[0].replaceAll("'", "''");
				String isikName = split[1].replaceAll("'", "''");
				String isikRoll = split[2].replaceAll("'", "''");

				regNrs += "'" + regNr + "',";
				sql = "INSERT INTO user_arireg (id_code, reg_nr, ent_name, person_name, person_role) VALUES ('" + ik
						+ "', '" + regNr + "', '" + entName + "', '" + isikName + "', '" + isikRoll + "')";
				PostgreUtils.insert(sql);
			}

			// Kustutame ära kõik asutused mis pole sellel kasutajal küljes
			if (map.size() > 0) {
				regNrs = regNrs.substring(0, regNrs.length() - 1);
				sql = "DELETE FROM user_arireg where id_code = '" + ik + "' and reg_nr not in (" + regNrs + ")";
			} else {
				sql = "DELETE FROM user_arireg where id_code = '" + ik + "'";
			}

			PostgreUtils.delete(sql);
		} else {
			exists = false;
			sql = "SELECT 1 FROM user_arireg WHERE id_code = '" + ik
					+ "' and last_checked + '06:00:00'::interval  < now()";

			try {
				ResultSet rs2 = PostgreUtils.query(sql);
				while (rs2.next()) {
					exists = true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			if (exists) {
				HashMap<String, String[]> map = getAriregData(ik);

				String regNrs = "";

				for (Map.Entry<String, String[]> entry : map.entrySet()) {
					String regNr = entry.getKey();
					String[] split = entry.getValue();

					regNrs += "'" + regNr + "',";
					
					String entName = split[0].replaceAll("'", "''");
					String isikName = split[1].replaceAll("'", "''");
					String isikRoll = split[2].replaceAll("'", "''");

					ResultSet rs = PostgreUtils.query("SELECT id FROM user_arireg WHERE reg_nr = '" + regNr + "' and id_code = '" + ik + "'");
					
					if(rs.next()){
						PostgreUtils.update("UPDATE user_arireg SET ent_name = '" + entName + "', person_name = '"
							+ isikName + "', person_role = '" + isikRoll + "', "
							+ "last_checked = now() WHERE reg_nr = '" + regNr + "' and id_code = '" + ik + "'");
					}
					else{
						sql = "INSERT INTO user_arireg (id_code, reg_nr, ent_name, person_name, person_role) VALUES ('" + ik
							+ "', '" + regNr + "', '" + entName + "', '" + isikName + "', '" + isikRoll + "')";
						PostgreUtils.insert(sql);
					}
				}

				if (map.size() > 0) {
					regNrs = regNrs.substring(0, regNrs.length() - 1);
					PostgreUtils.delete(
							"DELETE FROM user_arireg where id_code = '" + ik + "' and reg_nr not in (" + regNrs + ")");
				}
			}
		}
	}

	public HashMap<String, String[]> getAriregData(String ik) {
		/*
		 * HashMap<String, String> fromArireg = new HashMap<String, String>();
		 * fromArireg.put("12345678", "Uus asutus"); fromArireg.put("987654321",
		 * "Uus asutus 2"); fromArireg.put("10225510", "Budampex AS");
		 * fromArireg.put("12864846", "Juhus OÜ"); fromArireg.put("10308992",
		 * "Mediato AS");
		 * 
		 * return new HashMap<String, String>();
		 */

		HashMap<String, String[]> map = new HashMap<String, String[]>();

		String url = "";
		try {
			ResultSet rs = PostgreUtils.query("SELECT value FROM config WHERE key = 'XTEESERVICE_URL'");
			if (rs.next()) {
				url = rs.getString("value");
			}
		} catch (Exception x) {
			x.printStackTrace();
		}

		try {

			AriregLocator service = new AriregLocator();
			AriregXteeStub port = null;

			port = (AriregXteeStub) service.getAriregXtee(new URL(url));

			List<SOAPHeaderElement> elems = makeEsindusHeaders(ik);
			for (SOAPHeaderElement elem : elems) {
				port.setHeader(elem);
			}

			Paringesindus_v4_paring paring = new Paringesindus_v4_paring();
			paring.setFyysilise_isiku_koodi_riik("EST");
			paring.setFyysilise_isiku_kood(ik);

			Paringesindus_v4_paringHolder paringHolder = new Paringesindus_v4_paringHolder();
			Paringesindus_v4_vastusHolder vastusHolder = new Paringesindus_v4_vastusHolder();

			try {
				port.esindus_v1(paring, paringHolder, vastusHolder);
			} catch (Exception x) {
				x.printStackTrace();
			}

			if (vastusHolder.value != null && vastusHolder.value.getEttevotjad() != null) {

				Paringesindus_v4_ettevote[] ettevotjad = vastusHolder.value.getEttevotjad();

				for (Paringesindus_v4_ettevote ettevotja : ettevotjad) {
					String isiku_roll = "";
					String isiku_nimi = "";

					if (ettevotja.getIsikud() != null && ettevotja.getIsikud().length > 0) { // otsime
																								// ka
																								// esindaja
																								// kaudu
																								// loginud
																								// kasutaja
																								// nime
																								// ja
																								// rollid
						for (Paringesindus_v4_isik isik : ettevotja.getIsikud()) {
							if (ik.equals(isik.getFyysilise_isiku_kood())) {
								isiku_nimi = isik.getFyysilise_isiku_eesnimi() + " "
										+ isik.getFyysilise_isiku_perenimi();

								if (isiku_roll.length() != 0) { // juba oli,
																// paneme koma
																// ette
									isiku_roll += ", ";
								}
								isiku_roll += isik.getFyysilise_isiku_roll_tekstina();
							}
						}
					}

					map.put(String.valueOf(ettevotja.getAriregistri_kood()),
							new String[] { ettevotja.getArinimi(), isiku_nimi, isiku_roll });
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return map;
	}

	private List<SOAPHeaderElement> makeEsindusHeaders(String ik) {
		List<SOAPHeaderElement> elems = new ArrayList<SOAPHeaderElement>();

		String XROAD_NS = "http://x-road.eu/xsd/xroad.xsd";
		String IDENT_NS = "http://x-road.eu/xsd/identifiers";

		String protocolVersion = "";
		String userId = ik;
		String id = UUID.randomUUID().toString();
		String issue = "";

		String xRoadInstance = "";
		String memberClass = "";
		String memberCode = "";
		String subsystemCode = "";
		String serviceCode = "";
		String serviceVersion = "";

		String sender_xRoadInstance = "";
		String sender_memberClass = "";
		String sender_memberCode = "";
		String sender_subsystemCode = "";

		ResultSet rs = PostgreUtils.query("SELECT * FROM config WHERE type = 'XTEE_PARAMS'");
		try {
			while (rs.next()) {
				String key = rs.getString("key");
				String value = rs.getString("value");
				switch (key) {
				case "XTEE_PROTOCOL_VERSION":
					protocolVersion = value;
					break;
				case "XTEE_ISSUE":
					issue = value;
					break;
				case "XTEE_XROADINSTANCE":
					xRoadInstance = value;
					break;
				case "XTEE_MEMBERCLASS":
					memberClass = value;
					break;
				case "XTEE_MEMBERCODE":
					memberCode = value;
					break;
				case "XTEE_SUBSYSTEMCODE":
					subsystemCode = value;
					break;
				case "XTEE_SERVICECODE":
					serviceCode = value;
					break;
				case "XTEE_SERVICEVERSION":
					serviceVersion = value;
					break;
				case "XTEE_SENDER_XROADINSTANCE":
					sender_xRoadInstance = value;
					break;
				case "XTEE_SENDER_MEMBERCLASS":
					sender_memberClass = value;
					break;
				case "XTEE_SENDER_MEMBERCODE":
					sender_memberCode = value;
					break;
				case "XTEE_SENDER_SUBSYSTEMCODE":
					sender_subsystemCode = value;
					break;
				default:
					break;
				}
			}
		} catch (Exception x) {
			x.printStackTrace();
		}

		try {
			elems.add(new SOAPHeaderElement(XROAD_NS, "protocolVersion", protocolVersion));
			elems.add(new SOAPHeaderElement(XROAD_NS, "userId", userId));
			elems.add(new SOAPHeaderElement(XROAD_NS, "id", id));
			elems.add(new SOAPHeaderElement(XROAD_NS, "issue", issue));

			SOAPHeaderElement header1 = new SOAPHeaderElement(XROAD_NS, "service");
			header1.setAttribute(IDENT_NS, "objectType", "SERVICE");
			header1.addNamespaceDeclaration("iden", IDENT_NS);

			SOAPElement node = header1.addChildElement("xRoadInstance", "iden");
			node.addTextNode(xRoadInstance);
			node.setPrefix("iden");

			SOAPElement node2 = header1.addChildElement("memberClass", "iden");
			node2.addTextNode(memberClass);

			SOAPElement node3 = header1.addChildElement("memberCode", "iden");
			node3.addTextNode(memberCode);

			SOAPElement node4 = header1.addChildElement("subsystemCode", "iden");
			node4.addTextNode(subsystemCode);

			SOAPElement node5 = header1.addChildElement("serviceCode", "iden");
			node5.addTextNode(serviceCode);

			SOAPElement node6 = header1.addChildElement("serviceVersion", "iden");
			node6.addTextNode(serviceVersion);

			elems.add(header1);

			SOAPHeaderElement header2 = new SOAPHeaderElement(XROAD_NS, "client");
			header2.setAttribute(IDENT_NS, "objectType", "SUBSYSTEM");
			header2.addNamespaceDeclaration("iden", IDENT_NS);

			SOAPElement node7 = header2.addChildElement("xRoadInstance", "iden");
			node7.addTextNode(sender_xRoadInstance);

			SOAPElement node8 = header2.addChildElement("memberClass", "iden");
			node8.addTextNode(sender_memberClass);

			SOAPElement node9 = header2.addChildElement("memberCode", "iden");
			node9.addTextNode(sender_memberCode);

			SOAPElement node10 = header2.addChildElement("subsystemCode", "iden");
			node10.addTextNode(sender_subsystemCode);

			elems.add(header2);

		} catch (Exception x) {
			x.printStackTrace();
		}

		return elems;
	}

}
