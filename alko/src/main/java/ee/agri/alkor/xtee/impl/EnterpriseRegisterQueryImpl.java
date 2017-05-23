package ee.agri.alkor.xtee.impl;

import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;

import javax.xml.rpc.Stub;
import javax.xml.rpc.holders.StringHolder;

import org.apache.log4j.Logger;

import ee.agri.alkor.model.Address;
import ee.agri.alkor.model.Enterprise;
import ee.agri.alkor.service.SystemException;
import ee.riik.xtee.arireg.producers.producer.arireg.AriregLocator;
import ee.riik.xtee.arireg.producers.producer.arireg.AriregPort;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_ettevote;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_evaadress;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring_koodiga;
import ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring_nimega;
import ee.riik.xtee.arireg.producers.producer.arireg.holders.Paringliht_v4_paringHolder;
import ee.riik.xtee.arireg.producers.producer.arireg.holders.Paringliht_v4_vastusHolder;


/**
 * 
 * @author suisalu
 *
 */
public class EnterpriseRegisterQueryImpl {
	
	private static long ENTERPRISE_LIMIT = 100L;
	
	/*
	 * Lubatud on est ja eng
	 */
	private static final String ESTONIAN = "est";
	
	private static Logger LOGGER = Logger
			.getLogger(EnterpriseRegisterQueryImpl.class);

	private String serviceEndpointURL;

	private String queryingEnterpriseRegNr;

	private String queringPersonRegNr;

	public ArrayList<Enterprise> findEnterprise(String name, String regNr) {
		AriregLocator service = new AriregLocator();
		AriregPort port = null;
		LOGGER.info("Connecting : " + getServiceEndpointURL());
		try {
			port = service.getAriregPort(new URL(getServiceEndpointURL()));
		} catch (Exception e) {
			throw new SystemException(e);
		}
		((Stub) port)._setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);

		BigInteger entLimit = BigInteger.valueOf(ENTERPRISE_LIMIT);
		BigInteger regNumber = null;
		if (name != null) {
		   name = name.toLowerCase();
		}
		
		if (regNr != null) {
			regNumber = new BigInteger(regNr);
			entLimit = BigInteger.valueOf(0L);
		}
		LOGGER.debug("Paringliht_v4_paring - name:" + name
				+ " regNumber:" + regNumber
				+ " entLimit:" + entLimit);
		Paringliht_v4_paring keha = null;

      if (name != null && regNr == null)
      {
         keha = new Paringliht_v4_paring_nimega(name, entLimit, ESTONIAN);
      }
      else if (name == null && regNr != null)
      {
         keha = new Paringliht_v4_paring_koodiga(regNumber, entLimit, ESTONIAN);
      }
      else
      {
         if(name == null)
         {
            throw new SystemException("Päringu sooritamiseks tuleb määrata nimi");
         }
         else
         {
            keha = new Paringliht_v4_paring(name, entLimit, ESTONIAN);
         }
      }
		Paringliht_v4_vastusHolder result = new Paringliht_v4_vastusHolder();
		Paringliht_v4_paringHolder paringHolder = new Paringliht_v4_paringHolder();
		StringHolder andmekogu = new StringHolder("arireg");
		StringHolder asutus = new StringHolder(getQueryingEnterpriseRegNr());
		StringHolder isikukood = new StringHolder(getQueringPersonRegNr());
		StringHolder nimi = new StringHolder("arireg.paringliht_v4.v1");
		StringHolder id = new StringHolder(genNonce());
		StringHolder toimik = new StringHolder("");
		try {
			port.paringliht_v4(keha, asutus, andmekogu, isikukood, id, nimi, toimik , paringHolder, result);
		} catch (Exception e) {
			throw new SystemException(e);
		}
		int evsize = result.value.getEttevotjad().length;
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("Enterprise query for name: ' +" + name + "' regNr: '"
					+ regNr + "' result size=" + evsize);
		if (evsize > 0) {
			ArrayList<Enterprise> enterprises = new ArrayList<Enterprise>();
			for (int i = 0; i < evsize; i++) {
				Enterprise enterprise = convertNew(result.value.getEttevotjad()[i]);
				enterprises.add(enterprise);
			}
			return enterprises;
		}
		return null;
	}

	private static String genNonce() {
		SecureRandom random = new SecureRandom();
		byte bytes[] = new byte[40];
		random.nextBytes(bytes);
		StringBuffer nonce = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			int b = bytes[i] & 0xFF;
			if (b < 0x10)
				nonce.append('0');
			nonce.append(Integer.toHexString(b));
		}
		return nonce.toString();
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
	
	private Enterprise convertNew(Paringliht_v4_ettevote resultItem) {
		Enterprise ent = new Enterprise();

		ent.setName(resultItem.getEvnimi());
		ent.setRegistrationId(resultItem.getAriregistri_kood());
		Address address = new Address();
		Paringliht_v4_evaadress resultAddress =
			resultItem.getEvaadressid();
		
		if (resultAddress != null) {
			splitAddress(resultAddress.getAsukoht_ettevotja_aadressis(),
					address);
			address.setPostalIndex(resultAddress
					.getIndeks_ettevotja_aadressis());
			if ("0".equals(resultAddress.getAsukoha_ehak_kood())) {
				address.setDistrict(resultAddress.getAsukoha_ehak_tekstina());
			} else {
				address.setOrgUnit(resultAddress.getAsukoha_ehak_tekstina());
			}
		}
		ent.setAddress(address);
		return ent;
	}

	/**
	 * Leiab loodetavasti tänava maja aadressi stringist.
	 * 
	 * @param address
	 * @param address
	 */
	private void splitAddress(String addressString, Address address) {
		if (addressString == null)
			return;
		String parts[] = addressString.split(" ");
		StringBuffer sb = new StringBuffer(parts[0]);
		for (int i = 1; i < (parts.length - 1); i++)
			sb.append(" ").append(parts[i]);

		address.setStreet(sb.toString());
		if (parts.length > 1) {
			String[] parts2 = parts[parts.length - 1].split("[-/]");
			address.setHouse(parts2[0]);
			if (parts2.length > 1)
				address.setAppartmentNr(parts2[1]);
		}
	}
}
