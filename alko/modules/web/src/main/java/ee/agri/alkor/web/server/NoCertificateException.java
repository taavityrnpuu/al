package ee.agri.alkor.web.server;

import org.acegisecurity.AuthenticationException;

public class NoCertificateException extends AuthenticationException {

   public NoCertificateException(String msg) {
      super(msg);
   }

}
