package ee.agri.alkor.xtee;

import java.util.ArrayList;

import ee.agri.alkor.model.Enterprise;

public interface IXteeServices {

	/**
	 * Business register query.
	 * 
	 * @param name
	 * @param regNr
	 * @return
	 */
	Enterprise queryEnterprise(String name, String regNr) ;
	
	/**
	 * MTR and customs query.
	 * 
	 * @param enterpriseRegNr
	 * @return Enterprise 
	 */
	
	MtrAndCustomsQueryResult queryMTRAndCustoms(String enterpriseRegNr) ;

}
