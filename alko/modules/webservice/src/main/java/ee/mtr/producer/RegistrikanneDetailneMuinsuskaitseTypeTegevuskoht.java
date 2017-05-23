/**
 * RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht  extends ee.x_road.mtr.producer.TegevuskohtType  implements java.io.Serializable {
    private ee.x_road.mtr.producer.TegevuskohtType[] müügikoht;

    public RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht() {
    }

    public RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht(
           java.lang.String liik,
           java.lang.String nimetus,
           ee.x_road.mtr.producer.AadressType aadress,
           java.util.Date alguskp,
           java.util.Date loppkp,
           ee.x_road.mtr.producer.TegevuskohtType[] müügikoht) {
        super(
            liik,
            nimetus,
            aadress,
            alguskp,
            loppkp);
        this.müügikoht = müügikoht;
    }


    /**
     * Gets the müügikoht value for this RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht.
     * 
     * @return müügikoht
     */
    public ee.x_road.mtr.producer.TegevuskohtType[] getMüügikoht() {
        return müügikoht;
    }


    /**
     * Sets the müügikoht value for this RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht.
     * 
     * @param müügikoht
     */
    public void setMüügikoht(ee.x_road.mtr.producer.TegevuskohtType[] müügikoht) {
        this.müügikoht = müügikoht;
    }

    public ee.x_road.mtr.producer.TegevuskohtType getMüügikoht(int i) {
        return this.müügikoht[i];
    }

    public void setMüügikoht(int i, ee.x_road.mtr.producer.TegevuskohtType _value) {
        this.müügikoht[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht)) return false;
        RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht other = (RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.müügikoht==null && other.getMüügikoht()==null) || 
             (this.müügikoht!=null &&
              java.util.Arrays.equals(this.müügikoht, other.getMüügikoht())));
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
        if (getMüügikoht() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMüügikoht());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMüügikoht(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
