package ee.agri.alkor.web.server;

import java.io.IOException;
import java.util.Date;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.apache.commons.lang.StringEscapeUtils.escapeXml;

@SuppressWarnings("serial")
public class AvaandmedServiceServlet extends HttpServlet {
	public int version = 1;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		response.setContentType("text/xml");
		response.setHeader("Content-disposition", "attachment; filename=alkoreg_avaandmed.xml");
		response.setCharacterEncoding("utf-8");
		
		/*
		 * avaandmete loogika (Välja näitamine)
		 * 
		 * <?xml version="1.0" encoding="UTF-8"?> <alkoholiregister
		 * time="2014-12-01T13:59:17" ver="1"> <product id="">
		 * <applicantId></applicantId> <applicantRegId></applicantRegId>
		 * <productClass></productClass> <productName></productName>
		 * <regEntryId></regEntryId> <regEntryDate></regEntryDate>
		 * <ethanolRate></ethanolRate> <capacity></capacity>
		 * <producerName></producerName> <producerCountry></producerCountry>
		 * </product> </alkoholiregister>
		 */
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
			Class.forName("org.postgresql.Driver");
		} catch(IOException e) {
			System.err.println("Could not get PrintWriter from response");
			return;
		} catch (ClassNotFoundException e) {
			out.println(e.getMessage());
			return;
		}
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = new Date();
		
		try(Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/test", "alkor", "TE100pcm");
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(""
				+ "select"
				+ " p.id as id, ra.id as applicantId, ra.nr as applicantRegId, c1.name as productClass, "
				+ " p.name as productName, ra.regentry_id as regEntryId, ra.decision_date as regEntryDate, "
				+ " p.ethanol_rate as ethanolRate, c2.name as capacity, e.name as producerName, c3.name as producerCountry, "
				+ " p.notes as notes, e2.name as applicantName "
				+ " from product p "
				+ " left outer join reg_application as ra on ra.product_id = p.id "
				+ " left outer join reg_entry as re on re.id = ra.regentry_id "
				+ " left outer join classificator as c1 on c1.id = p.prod_class_id "
				+ " left outer join classificator as c2 on c2.id = p.capacity_class_id "
				+ " left outer join enterprise as e on e.id = p.producer_subj_id "
				+ " left outer join enterprise as e2 on e2.id = ra.appl_subj_id "
				+ " left outer join classificator as c3 on c3.id = e.country_class_id "
				+ " where re.valid_until >= NOW() " + " ;"
			)
		) {
			out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			out.println("<alkoholiregister time=\"" + dateFormat.format(date) + "\" ver=\"" + Integer.toString(version) + "\">");

			while(rs.next()) {
				String productClass = escape(rs.getString("productClass"));
				String productName = escape(rs.getString("productName"));
				String regEntryDate = escape(rs.getString("regEntryDate"));

				String ethanolRate = escape(rs.getString("ethanolRate"));
				String capacity = escape(rs.getString("capacity"));
				String producerName = escape(rs.getString("producerName"));
				String producerCountry = escape(rs.getString("producerCountry"));
				String applicantName = escape(rs.getString("applicantName"));
				String notes = escape(rs.getString("notes"));
				if(notes == null){
					notes = "";
				}
				if(regEntryDate == null){
					regEntryDate = null;
				} else {
					String[] parts = regEntryDate.split(" ");
					regEntryDate = parts[0];
				}

				out.println("<product>");
				out.println("<regEntryDate>" + regEntryDate + "</regEntryDate>");
				out.println("<productClass>" + productClass + "</productClass>");
				out.println("<productName>" + productName + "</productName>");
				out.println("<producerName>" + producerName + "</producerName>");
				out.println("<producerCountry>" + producerCountry + "</producerCountry>");
				out.println("<applicantName>" + applicantName + "</applicantName>");
				out.println("<capacity>" + capacity + "</capacity>");
				out.println("<ethanolRate>" + ethanolRate + "</ethanolRate>");				
				out.println("<notes>" + notes + "</notes>");
				out.println("</product>");
			}
			
			out.println("</alkoholiregister>");
		} catch(SQLException se) {
			out.println("db error!");
			out.println(se.getMessage());
		} catch(Exception e) {
			out.println(e.getMessage());
		}
		
		out.flush();
	}

	public String escape(String s) {
		return escapeXml(s);
	}
}
