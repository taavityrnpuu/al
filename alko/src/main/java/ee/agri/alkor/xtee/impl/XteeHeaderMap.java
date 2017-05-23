package ee.agri.alkor.xtee.impl;

import java.util.HashMap;
import java.util.Map;

public class XteeHeaderMap extends HashMap {

	public XteeHeaderMap() {
		super();
		this.put("andmekogu", null);
		this.put("nimi", null);
		this.put("asutus", null);
		this.put("allasutus", null);
		this.put("isikukood", null);
		this.put("id", null);
		this.put("toimik", null);
		this.put("amet", null);
		this.put("ametniknimi", null);
	}

	public XteeHeaderMap(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
	}

	public XteeHeaderMap(int initialCapacity) {
		super(initialCapacity);
	}

	public XteeHeaderMap(Map m) {
		super(m);
	}
	
	public String getId() 
	{ 
		return (String)this.get("id"); 
	}
	
	public String getEnterpriseRegNr() 
	{ 
		return (String)this.get("asutus"); 
	}
	
	public String getSubEnterpriseRegNr() 
	{
		return (String)this.get("allasutus"); 
	}
	
	public String getRepresentativeRegNr() 
	{ 
		return (String)this.get("isikukood"); 
	}
	
	public String getName()
	{
		return (String)this.get("nimi");
	}
	
	public String getRepresentativeProfession()
	{
		return (String)this.get("amet");
	}
	
	public String getRepresenativeName()
	{
		return (String)this.get("ametniknimi");
	}
	
	public String getRequestEnterprise() {
		String reportingEnterriseRegNr = null;
		if ((getSubEnterpriseRegNr() != null)
				&& (getSubEnterpriseRegNr().trim().length() > 0))
			reportingEnterriseRegNr = getSubEnterpriseRegNr().trim();
		else
			reportingEnterriseRegNr = getEnterpriseRegNr().trim();
		return reportingEnterriseRegNr;
	}

	@Override
	public String toString() {
		return "XteeHeaderMap [getEnterpriseRegNr()=" + getEnterpriseRegNr()
				+ ", getRepresentativeRegNr()=" + getRepresentativeRegNr()
				+ ", getName()=" + getName()
				+ ", getRepresentativeProfession()="
				+ getRepresentativeProfession() + ", getRepresenativeName()="
				+ getRepresenativeName() + "]";
	}
}
