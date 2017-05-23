/**
 * YldinfoPostiAadressiga.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class YldinfoPostiAadressiga  extends ee.x_road.mtr.producer.YldinfoBaseType  implements java.io.Serializable {
    private ee.x_road.mtr.producer.AadressType aadress;

    private ee.x_road.mtr.producer.AadressType postaadress;

    public YldinfoPostiAadressiga() {
    }

    public YldinfoPostiAadressiga(
           java.lang.String nimi,
           java.lang.String kood,
           java.lang.String tel,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String web,
           org.apache.axis.types.URI mtrlink,
           ee.x_road.mtr.producer.AadressType aadress,
           ee.x_road.mtr.producer.AadressType postaadress) {
        super(
            nimi,
            kood,
            tel,
            fax,
            email,
            web,
            mtrlink);
        this.aadress = aadress;
        this.postaadress = postaadress;
    }


    /**
     * Gets the aadress value for this YldinfoPostiAadressiga.
     * 
     * @return aadress
     */
    public ee.x_road.mtr.producer.AadressType getAadress() {
        return aadress;
    }


    /**
     * Sets the aadress value for this YldinfoPostiAadressiga.
     * 
     * @param aadress
     */
    public void setAadress(ee.x_road.mtr.producer.AadressType aadress) {
        this.aadress = aadress;
    }


    /**
     * Gets the postaadress value for this YldinfoPostiAadressiga.
     * 
     * @return postaadress
     */
    public ee.x_road.mtr.producer.AadressType getPostaadress() {
        return postaadress;
    }


    /**
     * Sets the postaadress value for this YldinfoPostiAadressiga.
     * 
     * @param postaadress
     */
    public void setPostaadress(ee.x_road.mtr.producer.AadressType postaadress) {
        this.postaadress = postaadress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YldinfoPostiAadressiga)) return false;
        YldinfoPostiAadressiga other = (YldinfoPostiAadressiga) obj;
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
              this.aadress.equals(other.getAadress()))) &&
            ((this.postaadress==null && other.getPostaadress()==null) || 
             (this.postaadress!=null &&
              this.postaadress.equals(other.getPostaadress())));
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
        if (getPostaadress() != null) {
            _hashCode += getPostaadress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
