/**
 * ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String nimi;

    private java.lang.String isikukood;

    public ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja() {
    }

    public ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja(
           java.math.BigInteger id,
           java.lang.String nimi,
           java.lang.String isikukood) {
           this.id = id;
           this.nimi = nimi;
           this.isikukood = isikukood;
    }


    /**
     * Gets the id value for this ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the nimi value for this ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the isikukood value for this ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja.
     * 
     * @return isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja.
     * 
     * @param isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja)) return false;
        ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja other = (ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
