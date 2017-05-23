/**
 * KohtadeArvudTypeKohtadearv.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class KohtadeArvudTypeKohtadearv  implements java.io.Serializable {
    private java.math.BigInteger arv;

    private java.util.Date alateskp;

    private java.util.Date kunikp;

    public KohtadeArvudTypeKohtadearv() {
    }

    public KohtadeArvudTypeKohtadearv(
           java.math.BigInteger arv,
           java.util.Date alateskp,
           java.util.Date kunikp) {
           this.arv = arv;
           this.alateskp = alateskp;
           this.kunikp = kunikp;
    }


    /**
     * Gets the arv value for this KohtadeArvudTypeKohtadearv.
     * 
     * @return arv
     */
    public java.math.BigInteger getArv() {
        return arv;
    }


    /**
     * Sets the arv value for this KohtadeArvudTypeKohtadearv.
     * 
     * @param arv
     */
    public void setArv(java.math.BigInteger arv) {
        this.arv = arv;
    }


    /**
     * Gets the alateskp value for this KohtadeArvudTypeKohtadearv.
     * 
     * @return alateskp
     */
    public java.util.Date getAlateskp() {
        return alateskp;
    }


    /**
     * Sets the alateskp value for this KohtadeArvudTypeKohtadearv.
     * 
     * @param alateskp
     */
    public void setAlateskp(java.util.Date alateskp) {
        this.alateskp = alateskp;
    }


    /**
     * Gets the kunikp value for this KohtadeArvudTypeKohtadearv.
     * 
     * @return kunikp
     */
    public java.util.Date getKunikp() {
        return kunikp;
    }


    /**
     * Sets the kunikp value for this KohtadeArvudTypeKohtadearv.
     * 
     * @param kunikp
     */
    public void setKunikp(java.util.Date kunikp) {
        this.kunikp = kunikp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KohtadeArvudTypeKohtadearv)) return false;
        KohtadeArvudTypeKohtadearv other = (KohtadeArvudTypeKohtadearv) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arv==null && other.getArv()==null) || 
             (this.arv!=null &&
              this.arv.equals(other.getArv()))) &&
            ((this.alateskp==null && other.getAlateskp()==null) || 
             (this.alateskp!=null &&
              this.alateskp.equals(other.getAlateskp()))) &&
            ((this.kunikp==null && other.getKunikp()==null) || 
             (this.kunikp!=null &&
              this.kunikp.equals(other.getKunikp())));
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
        if (getArv() != null) {
            _hashCode += getArv().hashCode();
        }
        if (getAlateskp() != null) {
            _hashCode += getAlateskp().hashCode();
        }
        if (getKunikp() != null) {
            _hashCode += getKunikp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
