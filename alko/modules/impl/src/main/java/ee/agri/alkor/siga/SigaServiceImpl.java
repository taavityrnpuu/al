package ee.agri.alkor.siga;

import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.PUT;
import static org.springframework.http.HttpStatus.Series.SUCCESSFUL;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import ee.agri.alkor.impl.Config;

public class SigaServiceImpl implements InitializingBean {

	private static Logger LOGGER = Logger.getLogger(SigaServiceImpl.class);

	private String url;
	private String algorithm;
	private String uuid;
	private String signing_key;

	private String trustStore;
	private String trustStorePassword;

	public SigaServiceImpl(String trustStore, String trustStorePassword) {
		super();

		this.trustStore = trustStore;
		this.trustStorePassword = trustStorePassword;

		LOGGER.debug("trustStore: " + trustStore);
		
		Config.load();
		initConf(Config.SIGA_URL, Config.SIGA_ALGORITHM, Config.SIGA_UUID, Config.SIGA_SIGNING_KEY);
		
		LOGGER.debug("SIGA_URL: " + Config.SIGA_URL);
	}

	private void initConf(String url, String algorithm, String uuid, String signing_key) {
		this.url = StringUtils.removeEnd(url, "/");
		this.algorithm = algorithm;
		this.uuid = uuid;
		this.signing_key = signing_key;
	}

	public String createContainer(File file) throws Exception {

		RestTemplate rt = getRestTemplate();

		CreateHashcodeContainerRequest request = new CreateHashcodeContainerRequest();
		Map<String, byte[]> originalDataFiles = new HashMap<>();
		request.getDataFiles().add(createHashcodeDataFile(file.getName(), file.length(), Files.readAllBytes(file.toPath())));
		originalDataFiles.put(file.getName(), Files.readAllBytes(file.toPath()));

		CreateHashcodeContainerResponse createContainerResponse = rt.postForObject(url + "/hashcodecontainers", request, CreateHashcodeContainerResponse.class);

		return createContainerResponse.getContainerId();
	}

	public CreateHashcodeContainerRemoteSigningResponse signContainer(String containerId, String certInHex) throws Exception {

		RestTemplate rt = getRestTemplate();

		CreateHashcodeContainerRemoteSigningRequest hashrequest = new CreateHashcodeContainerRemoteSigningRequest();
		hashrequest.setSigningCertificate(certInHex);
		hashrequest.setSignatureProfile("LT");

		return rt.postForObject(url + "/hashcodecontainers/" + containerId + "/remotesigning", hashrequest, CreateHashcodeContainerRemoteSigningResponse.class);
	}

	public byte[] finalizeSignature(String containerId, String signatureId, String signatureInHex) throws Exception {

		RestTemplate rt = getRestTemplate();

		UpdateHashcodeContainerRemoteSigningRequest remoteSigningRequest = new UpdateHashcodeContainerRemoteSigningRequest();
		remoteSigningRequest.setSignatureValue(signatureInHex);

		HttpEntity<UpdateHashcodeContainerRemoteSigningRequest> request = new HttpEntity<>(remoteSigningRequest);

		UpdateHashcodeContainerRemoteSigningResponse response = rt.exchange(url + "/hashcodecontainers/" + containerId + "/remotesigning/" + signatureId, PUT, request, UpdateHashcodeContainerRemoteSigningResponse.class).getBody();

		if ("OK".equals(response.getResult())) {
			GetHashcodeContainerResponse getContainerResponse = rt .getForObject(url + "/hashcodecontainers/" + containerId, GetHashcodeContainerResponse.class);

			byte[] container = Base64.getDecoder().decode(getContainerResponse.getContainer());

			/*
			 * ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			 * HashcodeContainerWriter cw = new HashcodeContainerWriter(outputStream);
			 * cw.writeMimeType(); cw.writeManifest(hashcodeDataFiles);
			 * cw.writeHashcodeFiles(hashcodeDataFiles); cw.writeSignatures(signatures);
			 * cw.finalizeZipFile(); return outputStream.toByteArray();
			 * 
			 * HashcodeContainerWrapper container =
			 * containerService.getHashcodeContainer(containerId);
			 * containerService.cacheHashcodeContainer(containerId, container.getFileName(),
			 * Base64.getDecoder().decode(getContainerResponse.getContainer()),
			 * container.getOriginalDataFiles());
			 */

			rt.exchange(url + "/hashcodecontainers/" + containerId, DELETE, null, DeleteHashcodeContainerResponse.class);

			return container;
		}

		return null;
	}

	private RestTemplate getRestTemplate() throws Exception {
		List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
		interceptors.add(new HmacTokenAuthorizationHeaderInterceptor(url, algorithm, uuid, signing_key));

		KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
		ks.load(new FileInputStream(trustStore), trustStorePassword.toCharArray());
		SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(ks).build();

		SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
		HttpClient httpClient = HttpClients.custom().setSSLSocketFactory(socketFactory).build();

		RestTemplate rt = new RestTemplate();
		rt.setRequestFactory(new HttpComponentsClientHttpRequestFactoryMapper(httpClient));
		rt.setInterceptors(interceptors);
		rt.setErrorHandler(new RestTemplateResponseErrorHandler());

		return rt;
	}

	public static HashcodeDataFile createHashcodeDataFile(String fileName, long fileSize, byte[] fileContent) throws Exception {
		HashcodeDataFile df = new HashcodeDataFile();
		df.setFileName(fileName);
		df.setFileSize(Math.toIntExact(fileSize));
		MessageDigest digest256 = MessageDigest.getInstance("SHA-256");
		byte[] hash256 = digest256.digest(fileContent);
		MessageDigest digest512 = MessageDigest.getInstance("SHA-512");
		byte[] hash512 = digest512.digest(fileContent);
		df.setFileHashSha256(Base64.getEncoder().encodeToString(hash256));
		df.setFileHashSha512(Base64.getEncoder().encodeToString(hash512));
		return df;
	}

	class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

		@Override
		public boolean hasError(ClientHttpResponse httpResponse) throws IOException {
			return (httpResponse.getStatusCode().series() != SUCCESSFUL);
		}

		@Override
		public void handleError(ClientHttpResponse arg0) throws IOException {
			LOGGER.debug("RESPONSE status: " + arg0.getStatusCode() + " : " + arg0.getStatusText());
			LOGGER.debug("RESPONSE: " + IOUtils.toString(arg0.getBody(), "UTF-8"));
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}

}