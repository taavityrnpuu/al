package ee.agri.alkor.xtee;

import java.util.ArrayList;

import javax.xml.soap.SOAPElement;

import org.apache.axis.message.SOAPHeaderElement;
import org.springframework.beans.factory.InitializingBean;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.xtee.impl.EnterpriseRegisterQueryImpl;
import ee.agri.alkor.xtee.impl.CustomsQueryImpl;
import ee.agri.alkor.xtee.impl.MtrQueryImpl;
/**
 * 
 * @author suisalu
 *
 */
public class XteeQueryService implements IXteeServices, InitializingBean {


	private String serviceEndpointURL1;
	private String serviceEndpointURL2;

	private String queryingEnterpriseRegNr;

	private String queringPersonRegNr;

	private EnterpriseRegisterQueryImpl erImpl = new EnterpriseRegisterQueryImpl();

	private CustomsQueryImpl esImpl = new CustomsQueryImpl();

	private MtrQueryImpl mtrImpl = new MtrQueryImpl();

	public void afterPropertiesSet() throws Exception {
		erImpl.setServiceEndpointURL(serviceEndpointURL2);
		erImpl.setQueringPersonRegNr(queringPersonRegNr);
		erImpl.setQueryingEnterpriseRegNr(queryingEnterpriseRegNr);
		mtrImpl.setServiceEndpointURL(serviceEndpointURL2);
		mtrImpl.setQueringPersonRegNr(queringPersonRegNr);
		mtrImpl.setQueryingEnterpriseRegNr(queryingEnterpriseRegNr);
		esImpl.setServiceEndpointURL(serviceEndpointURL2);
		esImpl.setQueringPersonRegNr(queringPersonRegNr);
		esImpl.setQueryingEnterpriseRegNr(queryingEnterpriseRegNr);
	}

	public Enterprise queryEnterprise(String regNr) {
		return erImpl.findEnterprise(regNr);
	}

	public MtrAndCustomsQueryResult queryMTRAndCustoms(String enterpriseRegNr) {
		MtrAndCustomsQueryResult result = new MtrAndCustomsQueryResult();
		mtrImpl.query(enterpriseRegNr, result);
		//esImpl.query(enterpriseRegNr, result);
		return result;
	}

	public String getQueringPersonRegNr() {
		return queringPersonRegNr;
	}

	public void setQueringPersonRegNr(String queringPersonRegNr) {
		this.queringPersonRegNr = queringPersonRegNr;
	}

	public String getQueryingEnterpriseRegNr() {
		return queryingEnterpriseRegNr;
	}

	public void setQueryingEnterpriseRegNr(String queryingEnterpriseRegNr) {
		this.queryingEnterpriseRegNr = queryingEnterpriseRegNr;
	}

	public String getServiceEndpointURL1() {
		return serviceEndpointURL1;
	}

	public String getServiceEndpointURL2() {
		return serviceEndpointURL2;
	}

	public void setServiceEndpointURL1(String serviceEndpointURL) {
		this.serviceEndpointURL1 = serviceEndpointURL;
	}

	public void setServiceEndpointURL2(String serviceEndpointURL) {
		this.serviceEndpointURL2 = serviceEndpointURL;
	}
}
