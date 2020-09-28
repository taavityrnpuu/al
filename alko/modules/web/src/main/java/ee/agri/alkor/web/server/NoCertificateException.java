package ee.agri.alkor.web.server;

import org.springframework.security.core.AuthenticationException;

public class NoCertificateException extends AuthenticationException {

   public NoCertificateException(String msg) {
      super(msg);
   }

}
