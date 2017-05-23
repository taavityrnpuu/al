package ee.agri.alkor.xtee.impl;

import java.net.URL;

import javax.xml.rpc.Stub;
import javax.xml.rpc.holders.StringHolder;

import org.apache.log4j.Logger;

import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.service.SystemException;
import ee.agri.alkor.xtee.MtrAndCustomsQueryResult;
import ee.riik.xtee.emta.producers.producer.emta.AgriAktsiisiladu_paring;
import ee.riik.xtee.emta.producers.producer.emta.Aktsiisiladu;
import ee.riik.xtee.emta.producers.producer.emta.Emtaport;
import ee.riik.xtee.emta.producers.producer.emta.EmtaxteeLocator;
import ee.riik.xtee.emta.producers.producer.emta.holders.AgriAktsiisiladu_paringHolder;
import ee.riik.xtee.emta.producers.producer.emta.holders.AgriAktsiisiladu_vastusHolder;

/**
 * EMTA aktsiisiadude päring.
 * 
 * @author suisalu
 *
 */
public class CustomsQueryImpl {
	private static Logger LOGGER = Logger.getLogger(CustomsQueryImpl.class);

	private String serviceEndpointURL;

	private String queryingEnterpriseRegNr;

	private String queringPersonRegNr;

	public void query(String regNr, MtrAndCustomsQueryResult queryResult) {
		EmtaxteeLocator service = new EmtaxteeLocator();
		Emtaport port = null;
		try {
			port = service.getemtaxtee(new URL(getServiceEndpointURL()));
		} catch (Exception e) {
			throw new SystemException(e);
		}
		((Stub) port)._setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);

		AgriAktsiisiladu_paring keha = new AgriAktsiisiladu_paring(regNr);
		keha.setRegnr(regNr);
		AgriAktsiisiladu_paringHolder paringHolder = new AgriAktsiisiladu_paringHolder();
		AgriAktsiisiladu_vastusHolder result = new AgriAktsiisiladu_vastusHolder();

		StringHolder andmekogu = new StringHolder("emta");
		StringHolder asutus = new StringHolder(getQueryingEnterpriseRegNr());
		StringHolder isikukood = new StringHolder(getQueringPersonRegNr());
		StringHolder nimi = new StringHolder("emta.agriAktsiisiladu.v1");
		StringHolder id = new StringHolder("a982745724589");
		StringHolder toimik = new StringHolder("");

		try {
			port.agriAktsiisiladu(keha, andmekogu, asutus, isikukood, id, nimi,
					toimik, paringHolder, result);
		} catch (Exception e) {
			throw new SystemException(e);
		}
		int evsize = (result.value.getKokku() != null) ? Integer
				.parseInt(result.value.getKokku()) : 0;
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("Aktsiisiolao query for regNr: '" + regNr
					+ "' result size=" + evsize);

		Aktsiisiladu[] exciseLicenses = result.value.getAktsiisilaod();
		if(exciseLicenses.length > 0) {
			queryResult.setExciseLicenseValidDate(exciseLicenses[0].getKehtibAlates());
		}
	}

	public String getServiceEndpointURL() {
		return serviceEndpointURL;
	}

	public void setServiceEndpointURL(String serviceEndpointURL) {
		this.serviceEndpointURL = serviceEndpointURL;
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

	private Enterprise convert(Aktsiisiladu resultItem) {
		Enterprise enterprise = new Enterprise();
		enterprise.setExciseStoreHouseNr(resultItem.getLuba());
		return enterprise;
	}
}
