/**
 * ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp  implements java.io.Serializable {
    private ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[] kohtadearvud;

    private java.lang.String nimetus;

    private java.lang.String kood;

    public ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp() {
    }

    public ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp(
           ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[] kohtadearvud,
           java.lang.String nimetus,
           java.lang.String kood) {
           this.kohtadearvud = kohtadearvud;
           this.nimetus = nimetus;
           this.kood = kood;
    }


    /**
     * Gets the kohtadearvud value for this ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @return kohtadearvud
     */
    public ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[] getKohtadearvud() {
        return kohtadearvud;
    }


    /**
     * Sets the kohtadearvud value for this ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @param kohtadearvud
     */
    public void setKohtadearvud(ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[] kohtadearvud) {
        this.kohtadearvud = kohtadearvud;
    }


    /**
     * Gets the nimetus value for this ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @return nimetus
     */
    public java.lang.String getNimetus() {
        return nimetus;
    }


    /**
     * Sets the nimetus value for this ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @param nimetus
     */
    public void setNimetus(java.lang.String nimetus) {
        this.nimetus = nimetus;
    }


    /**
     * Gets the kood value for this ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp)) return false;
        ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp other = (ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kohtadearvud==null && other.getKohtadearvud()==null) || 
             (this.kohtadearvud!=null &&
              java.util.Arrays.equals(this.kohtadearvud, other.getKohtadearvud()))) &&
            ((this.nimetus==null && other.getNimetus()==null) || 
             (this.nimetus!=null &&
              this.nimetus.equals(other.getNimetus()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood())));
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
        if (getKohtadearvud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKohtadearvud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKohtadearvud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNimetus() != null) {
            _hashCode += getNimetus().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
