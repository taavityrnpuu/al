package ee.agri.alkor.web.server;

import static org.apache.commons.lang.StringEscapeUtils.escapeXml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;

import org.acegisecurity.providers.UsernamePasswordAuthenticationToken;
import org.acegisecurity.providers.x509.X509AuthenticationToken;
import org.apache.commons.codec.binary.Hex;
import org.apache.xml.security.utils.Base64;
import org.bouncycastle.util.io.pem.PemReader;
import org.jasig.cas.client.authentication.AttributePrincipal;

import org.jasig.cas.client.validation.Assertion;
import org.jasig.cas.client.validation.Cas20ProxyReceivingTicketValidationFilter;
import org.jasig.cas.client.validation.Cas20ProxyTicketValidator;
import org.jasig.cas.client.validation.Cas20ServiceTicketValidator;
import org.jasig.cas.client.validation.TicketValidationException;
import org.jasig.cas.client.validation.TicketValidator;


import sun.security.provider.X509Factory;

public class CasLoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// try {
		// //String sertStr =
		// "-----BEGIN CERTIFICATE-----\r\n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\r\nG3A+Udt3LWFV\r\n-----END CERTIFICATE-----";
		// //String sertStr =
		// "-----BEGIN CERTIFICATE-----\r\nMIIGqTCCBJGgAwIBAgIQfWDE7FCa7rNYV4xUj1KMgTANBgkqhkiG9w0BAQsFADBj\r\nMQswCQYDVQQGEwJFRTEiMCAGA1UECgwZQVMgU2VydGlmaXRzZWVyaW1pc2tlc2t1\r\nczEXMBUGA1UEYQwOTlRSRUUtMTA3NDcwMTMxFzAVBgNVBAMMDkVTVEVJRC1TSyAy\r\nMDE1MB4XDTE2MTIxOTA3MjkyNFoXDTIwMDcxMzIwNTk1OVowgZ8xCzAJBgNVBAYT\r\nAkVFMQ8wDQYDVQQKDAZFU1RFSUQxFzAVBgNVBAsMDmF1dGhlbnRpY2F0aW9uMSgw\r\nJgYDVQQDDB9NSVRST0ZBTk9WQSxUQVRKQU5BLDQ4NzA3MjYyMjIxMRQwEgYDVQQE\r\nDAtNSVRST0ZBTk9WQTEQMA4GA1UEKgwHVEFUSkFOQTEUMBIGA1UEBRMLNDg3MDcy\r\nNjIyMjEwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCdzRto7aNPZ4fO\r\n2VQTbKOI585kOqIZSlIGRwCRDvQuGIFo+1cP/mJv6mpnUSHFtraTi2gpeTJKZd87\r\nVZJt/+VY1u2LuO9Bs4yX1XHzMYGed8brBtJuuIm0LjwPNUxrycZT063DYtZNUsKY\r\nYt+rrQTwJ8Hb8HZFIUKX7ZJlbh1AsjE3T1D6Aq1WlcocAeZHAe/t/GH+6kGSgazg\r\nnSbiq6mh9UoIuXjVlPC1/nK/iu+utRNUHQr+QBGGGoWmOCqI8WHhzItBpuRLWcaS\r\nrRgGvR6jKzugbhN6MJW4yOMenj1e0+OWLtjGC0/mZUJCPVjmUInEOnM5IPFFr3hy\r\nqkcuYyX/AgMBAAGjggIaMIICFjAJBgNVHRMEAjAAMA4GA1UdDwEB/wQEAwIEsDBT\r\nBgNVHSAETDBKMD4GCSsGAQQBzh8BATAxMC8GCCsGAQUFBwIBFiNodHRwczovL3d3\r\ndy5zay5lZS9yZXBvc2l0b29yaXVtL0NQUzAIBgYEAI96AQIwKQYDVR0RBCIwIIEe\r\ndGF0amFuYS5taXRyb2Zhbm92YS4xQGVlc3RpLmVlMB0GA1UdDgQWBBSd9el5QMP/\r\nCLZsQ9V3jXEgmh+LYzAgBgNVHSUBAf8EFjAUBggrBgEFBQcDAgYIKwYBBQUHAwQw\r\nHwYDVR0jBBgwFoAUs6uIvJnVYqSFKgjNtB1yO4NyR1EwYQYIKwYBBQUHAQMEVTBT\r\nMFEGBgQAjkYBBTBHMEUWP2h0dHBzOi8vc2suZWUvZW4vcmVwb3NpdG9yeS9jb25k\r\naXRpb25zLWZvci11c2Utb2YtY2VydGlmaWNhdGVzLxMCRU4wdgYIKwYBBQUHAQEE\r\najBoMCcGCCsGAQUFBzABhhtodHRwOi8vYWlhLnNrLmVlL2VzdGVpZDIwMTUwPQYI\r\nKwYBBQUHMAKGMWh0dHBzOi8vc2suZWUvdXBsb2FkL2ZpbGVzL0VTVEVJRC1TS18y\r\nMDE1LmRlci5jcnQwPAYDVR0fBDUwMzAxoC+gLYYraHR0cDovL3d3dy5zay5lZS9j\r\ncmxzL2VzdGVpZC9lc3RlaWQyMDE1LmNybDANBgkqhkiG9w0BAQsFAAOCAgEAc2jU\r\nlXdHMrsdJ5OO0ZzX5UOVOzvkTzSndulpirRvyF79aEZZElj6zBWpqvu/aSSUxyjN\r\nUrXB/w7d7Mno0VQ6pfglhuV2SND6fn1HjCxZ1i6qLnkOyozxgXZ5mZASBUf2mEG9\r\nVQpIE1mlWs4Y78zJ20VMob6Y57aXnYC3a9LzFk+bNeZ8zWXHdxbPSNKMNZ2P6lUZ\r\npryTMpoLpa45GxuTFkIw6G6fzCr4JthrHk3hVCOGU3uK/eBpkTT/9Lnn1po6mj0D\r\nlaxHySxD3z2pfDM/sr+BxZNHfKTtsyQ+FQqAWnscOd/wiFnWvdFrhfhEXp3CRqvd\r\naUUFITfe3nH+RpGxhwpVnyuIXptGD0yLZ/rbLJ3foarPkcFUkv1yJgPqGzPIznoc\r\nQteCFG/14Xnm1JRKOigx2LiQYrpTYaTyAfwkbfDUj+2M1hO5h9yfNTYbMQRD5UCH\r\nGVTiZ/HZPSUwZCtw/sxnObRVygErtvbw4aIASSFjLgMd/Da4KzqwE0Rfq+/TtyWK\r\nHhqT+9RhxsaOTYDfG5IgucC7mMotGV4nS/+58kEbDHZtzkzY1hiPulwzHqhGmCHu\r\nAthLsRxxEF/cGS8VLt1kNWGJ8rue5Ud4MUIwfdwgeD8t2v6kSrF8s72Jkf4qIpEI\r\n/ITu5aBoPSwgjFMqiXu6LpXYvJNDDOuOExOkwrE=\r\n-----END CERTIFICATE-----\r\n";
		// String sertStr =
		// "-----BEGIN CERTIFICATE-----\r\n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\r\n-----END CERTIFICATE-----\r\n";
		// byte [] decoded =
		// Base64.decode(sertStr.replaceAll(X509Factory.BEGIN_CERT,
		// "").replaceAll(X509Factory.END_CERT, ""));
		//
		// request.getSession().setAttribute("javax.servlet.request.X509Certificate",
		// new
		// X509Certificate[]{(X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new
		// ByteArrayInputStream(decoded))});
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		
		
//		Cas20ProxyTicketValidator px = new Cas20ProxyTicketValidator("https://cas-test.agri.ee/epm-cas");	
//		try{
//			Assertion a = px.validate(request.getParameter("ticket"), "http://alkor3.loc.piksel.ee/caslogin");		
//			principal = a.getPrincipal();
//			attributes = a.getAttributes();
//			
//			System.out.println("valdate " + a.isValid());
////			System.out.println("valdate " + a.getValidUntilDate().toGMTString());
//			System.out.println("valdate " + a.getValidFromDate().toGMTString());
//			
//		} catch (Exception ex){
//			ex.printStackTrace();
//		}
//		
		
//		Cas20ServiceTicketValidator ti = new Cas20ServiceTicketValidator("https://cas-test.agri.ee/epm-cas");
//		System.out.println("TICKET: " + request.getParameter("ticket"));
//		try{
//			Assertion a = ti.validate(request.getParameter("ticket"), "http://alkor3.loc.piksel.ee/caslogin");		
//			principal = a.getPrincipal();
//			attributes = a.getAttributes();
//			
//			System.out.println("valdate " + a.isValid());
//			System.out.println("valdate " + a.getValidUntilDate().toGMTString());
//			System.out.println("valdate " + a.getValidFromDate().toGMTString());
//			
//		} catch (Exception ex){
//			ex.printStackTrace();
//		}
//		System.out.println(ti.toString());
	
		
	
		
		
		
		
		
		
//		response.getWriter()
//				.write("<html><body><form method=\"post\" action=\"/loginservice\"><input type=\"hidden\" name=\"fromcaslogin\" value=\"1\">Sisesta sert <br> <textarea name=\"input_cert\"></textarea> <input type=\"submit\" value=\"TESTLOGIN\"></form></body></html>");
		response.sendRedirect("/loginservice");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
