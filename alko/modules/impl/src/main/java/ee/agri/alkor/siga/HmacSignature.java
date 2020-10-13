package ee.agri.alkor.siga;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

import static java.lang.Long.parseLong;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.time.Instant.now;
import static java.time.Instant.ofEpochSecond;
import static org.apache.commons.lang3.StringUtils.isNumeric;

public class HmacSignature {
    private static final String DELIMITER = ":";

    private String macAlgorithm;
    private String signature;
	private String serviceUuid;
    private String requestMethod;
    private String uri;
    private String timestamp;
    private byte[] payload;

    public static void validateTimestamp(String timestamp, long expirationInSeconds, long clockSkew) throws Exception {
        if (timestamp.length() != 10 || !isNumeric(timestamp)) {
            throw new Exception("Invalid X-Authorization-Timestamp header. Not in Unix epoch seconds format.");
        }
        Instant hmacTimestamp = ofEpochSecond(parseLong(timestamp));
        final Instant serverTimestamp = now();
        if(!isTokenNotInFuture(serverTimestamp, hmacTimestamp, clockSkew)) {
            throw new Exception("HMAC token is expired. Token timestamp too far in future.");
        }
        if(!isTokenNotExpired(serverTimestamp, hmacTimestamp, expirationInSeconds, clockSkew)) {
            throw new Exception("HMAC token is expired. Token timestamp too far in past.");
        }
    }

    public static boolean isTimestampValid(Instant serverTimestamp, Instant hmacTimestamp, long expirationInSeconds, long clockSkew) {
        return (isTokenNotInFuture(serverTimestamp, hmacTimestamp, clockSkew)
                && isTokenNotExpired(serverTimestamp, hmacTimestamp, expirationInSeconds, clockSkew));
    }

    private static boolean isTokenNotExpired(Instant serverTimestamp, Instant hmacTimestamp, long expirationInSeconds, long clockSkew) {
        return hmacTimestamp.plusSeconds(expirationInSeconds).toEpochMilli() >= serverTimestamp.minusSeconds(clockSkew).toEpochMilli();
    }

    private static boolean isTokenNotInFuture(Instant serverTimestamp, Instant hmacTimestamp, long clockSkew) {
        return hmacTimestamp.toEpochMilli() <= serverTimestamp.plusSeconds(clockSkew).toEpochMilli();
    }

    public void validateSignature(byte[] signingSecret) throws Exception {
        final byte[] calculatedSignature = getSignature(signingSecret);
        if(!MessageDigest.isEqual(calculatedSignature, HexCoder.decodeHex(signature.toCharArray()))) {
           throw new Exception("HMAC token provided signature and calculated signature do not match. Invalid signed token claims or invalid signature.");
        }
    }

    public String getSignature(String signingSecret) throws NoSuchAlgorithmException, InvalidKeyException {
        return HexCoder.encodeHexString(getSignature(signingSecret.getBytes()));
    }

    private byte[] getSignature(byte[] signingSecret) throws NoSuchAlgorithmException, InvalidKeyException {
        final Mac hmac = Mac.getInstance(macAlgorithm);
        SecretKeySpec secretKey = new SecretKeySpec(signingSecret, macAlgorithm);
        hmac.init(secretKey);
        hmac.update((serviceUuid + DELIMITER + timestamp + DELIMITER + requestMethod + DELIMITER + uri + DELIMITER).getBytes(UTF_8));
        hmac.update(payload);
        final byte[] signatureBytes = hmac.doFinal();
        hmac.reset();
        return signatureBytes;
    }

    public String getMacAlgorithm() {
		return macAlgorithm;
	}

	public void setMacAlgorithm(String macAlgorithm) {
		this.macAlgorithm = macAlgorithm;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getServiceUuid() {
		return serviceUuid;
	}

	public void setServiceUuid(String serviceUuid) {
		this.serviceUuid = serviceUuid;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public byte[] getPayload() {
		return payload;
	}

	public void setPayload(byte[] payload) {
		this.payload = payload;
	}
}
