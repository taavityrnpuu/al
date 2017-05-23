/**
 * Mtamaruosad_osa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Mtamaruosad_osa  implements java.io.Serializable {
    private java.math.BigInteger rea_id;

    private java.lang.String mosa_tyyp;

    private java.util.Date kuupaev;

    public Mtamaruosad_osa() {
    }

    public Mtamaruosad_osa(
           java.math.BigInteger rea_id,
           java.lang.String mosa_tyyp,
           java.util.Date kuupaev) {
           this.rea_id = rea_id;
           this.mosa_tyyp = mosa_tyyp;
           this.kuupaev = kuupaev;
    }


    /**
     * Gets the rea_id value for this Mtamaruosad_osa.
     * 
     * @return rea_id
     */
    public java.math.BigInteger getRea_id() {
        return rea_id;
    }


    /**
     * Sets the rea_id value for this Mtamaruosad_osa.
     * 
     * @param rea_id
     */
    public void setRea_id(java.math.BigInteger rea_id) {
        this.rea_id = rea_id;
    }


    /**
     * Gets the mosa_tyyp value for this Mtamaruosad_osa.
     * 
     * @return mosa_tyyp
     */
    public java.lang.String getMosa_tyyp() {
        return mosa_tyyp;
    }


    /**
     * Sets the mosa_tyyp value for this Mtamaruosad_osa.
     * 
     * @param mosa_tyyp
     */
    public void setMosa_tyyp(java.lang.String mosa_tyyp) {
        this.mosa_tyyp = mosa_tyyp;
    }


    /**
     * Gets the kuupaev value for this Mtamaruosad_osa.
     * 
     * @return kuupaev
     */
    public java.util.Date getKuupaev() {
        return kuupaev;
    }


    /**
     * Sets the kuupaev value for this Mtamaruosad_osa.
     * 
     * @param kuupaev
     */
    public void setKuupaev(java.util.Date kuupaev) {
        this.kuupaev = kuupaev;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mtamaruosad_osa)) return false;
        Mtamaruosad_osa other = (Mtamaruosad_osa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rea_id==null && other.getRea_id()==null) || 
             (this.rea_id!=null &&
              this.rea_id.equals(other.getRea_id()))) &&
            ((this.mosa_tyyp==null && other.getMosa_tyyp()==null) || 
             (this.mosa_tyyp!=null &&
              this.mosa_tyyp.equals(other.getMosa_tyyp()))) &&
            ((this.kuupaev==null && other.getKuupaev()==null) || 
             (this.kuupaev!=null &&
              this.kuupaev.equals(other.getKuupaev())));
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
        if (getRea_id() != null) {
            _hashCode += getRea_id().hashCode();
        }
        if (getMosa_tyyp() != null) {
            _hashCode += getMosa_tyyp().hashCode();
        }
        if (getKuupaev() != null) {
            _hashCode += getKuupaev().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
