package ee.agri.alkor.siga;

import org.apache.http.client.HttpClient;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

public class HttpComponentsClientHttpRequestFactoryMapper extends HttpComponentsClientHttpRequestFactory {
	
	public HttpComponentsClientHttpRequestFactoryMapper(HttpClient client) {
		super(client);
	}

}
