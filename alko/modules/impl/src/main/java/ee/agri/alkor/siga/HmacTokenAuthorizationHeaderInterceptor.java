package ee.agri.alkor.siga;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class HmacTokenAuthorizationHeaderInterceptor implements ClientHttpRequestInterceptor {
	private static Logger LOGGER = Logger.getLogger(HmacTokenAuthorizationHeaderInterceptor.class);
	
    public static final String X_AUTHORIZATION_TIMESTAMP = "X-Authorization-Timestamp";
    public static final String X_AUTHORIZATION_SERVICE_UUID = "X-Authorization-ServiceUUID";
    public static final String X_AUTHORIZATION_SIGNATURE = "X-Authorization-Signature";
    private final String SIGA_API_URL;
    private final String HMAC_ALGORITHM;
    private final String HMAC_SERVICE_UUID;
    private final String HMAC_SHARED_SIGNING_KEY;

    public HmacTokenAuthorizationHeaderInterceptor(String sigaApiUri, String hmacAlgorithm, String hmacServiceUuid, String hmacSharedSigningKey) {
        this.SIGA_API_URL = StringUtils.removeEnd(sigaApiUri, "/");
        this.HMAC_ALGORITHM = hmacAlgorithm;
        this.HMAC_SERVICE_UUID = hmacServiceUuid;
        this.HMAC_SHARED_SIGNING_KEY = hmacSharedSigningKey;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        final String timestamp = String.valueOf(Instant.now().getEpochSecond());
        
    	LOGGER.debug("URI: " + request.getURI());
        
        HmacSignature hmac = new HmacSignature();
        hmac.setMacAlgorithm(HMAC_ALGORITHM);
        hmac.setUri(request.getURI().toString().replace(SIGA_API_URL, StringUtils.EMPTY));
        hmac.setRequestMethod(request.getMethod().name());
        hmac.setServiceUuid(HMAC_SERVICE_UUID);
        hmac.setPayload(body);
        hmac.setTimestamp(timestamp);
        
        String signature = null;
		try {
			signature = hmac.getSignature(HMAC_SHARED_SIGNING_KEY);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
        LOGGER.debug("Signature: " + signature);
        
        request.getHeaders().add(X_AUTHORIZATION_TIMESTAMP, timestamp);
        request.getHeaders().add(X_AUTHORIZATION_SERVICE_UUID, HMAC_SERVICE_UUID);
        request.getHeaders().add(X_AUTHORIZATION_SIGNATURE, signature);
        return execution.execute(request, body);
    }
}