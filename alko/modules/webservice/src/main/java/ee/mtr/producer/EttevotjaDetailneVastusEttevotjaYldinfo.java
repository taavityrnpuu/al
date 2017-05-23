/**
 * EttevotjaDetailneVastusEttevotjaYldinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class EttevotjaDetailneVastusEttevotjaYldinfo  extends ee.x_road.mtr.producer.YldinfoBaseType  implements java.io.Serializable {
    private ee.x_road.mtr.producer.AadressType aadress;

    public EttevotjaDetailneVastusEttevotjaYldinfo() {
    }

    public EttevotjaDetailneVastusEttevotjaYldinfo(
           java.lang.String nimi,
           java.lang.String kood,
           java.lang.String tel,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String web,
           org.apache.axis.types.URI mtrlink,
           ee.x_road.mtr.producer.AadressType aadress) {
        super(
            nimi,
            kood,
            tel,
            fax,
            email,
            web,
            mtrlink);
        this.aadress = aadress;
    }


    /**
     * Gets the aadress value for this EttevotjaDetailneVastusEttevotjaYldinfo.
     * 
     * @return aadress
     */
    public ee.x_road.mtr.producer.AadressType getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this EttevotjaDetailneVastusEttevotjaYldinfo.
     * 
     * @param aadress
     */
    public void setAadress(ee.x_road.mtr.producer.AadressType aadress) {
        this.aadress = aadress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EttevotjaDetailneVastusEttevotjaYldinfo)) return false;
        EttevotjaDetailneVastusEttevotjaYldinfo other = (EttevotjaDetailneVastusEttevotjaYldinfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aadress==null && other.getAadress()==null) || 
             (this.aadress!=null &&
              this.aadress.equals(other.getAadress())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAadress() != null) {
            _hashCode += getAadress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
