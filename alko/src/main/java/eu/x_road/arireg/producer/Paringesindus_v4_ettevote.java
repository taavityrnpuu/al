/**
 * Paringesindus_v4_ettevote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringesindus_v4_ettevote  implements java.io.Serializable {
    private java.lang.Integer ariregistri_kood;

    private java.lang.String arinimi;

    private java.lang.String staatus;

    private java.lang.String staatus_tekstina;

    private eu.x_road.arireg.producer.Paringesindus_v4_isik[] isikud;

    private eu.x_road.arireg.producer.Paringesindus_v4_eritingimus[] esindusoiguse_eritingimused;

    private java.lang.String oiguslik_vorm;

    private java.lang.String oiguslik_vorm_tekstina;

    public Paringesindus_v4_ettevote() {
    }

    public Paringesindus_v4_ettevote(
           java.lang.Integer ariregistri_kood,
           java.lang.String arinimi,
           java.lang.String staatus,
           java.lang.String staatus_tekstina,
           eu.x_road.arireg.producer.Paringesindus_v4_isik[] isikud,
           eu.x_road.arireg.producer.Paringesindus_v4_eritingimus[] esindusoiguse_eritingimused,
           java.lang.String oiguslik_vorm,
           java.lang.String oiguslik_vorm_tekstina) {
           this.ariregistri_kood = ariregistri_kood;
           this.arinimi = arinimi;
           this.staatus = staatus;
           this.staatus_tekstina = staatus_tekstina;
           this.isikud = isikud;
           this.esindusoiguse_eritingimused = esindusoiguse_eritingimused;
           this.oiguslik_vorm = oiguslik_vorm;
           this.oiguslik_vorm_tekstina = oiguslik_vorm_tekstina;
    }


    /**
     * Gets the ariregistri_kood value for this Paringesindus_v4_ettevote.
     * 
     * @return ariregistri_kood
     */
    public java.lang.Integer getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Paringesindus_v4_ettevote.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.lang.Integer ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the arinimi value for this Paringesindus_v4_ettevote.
     * 
     * @return arinimi
     */
    public java.lang.String getArinimi() {
        return arinimi;
    }


    /**
     * Sets the arinimi value for this Paringesindus_v4_ettevote.
     * 
     * @param arinimi
     */
    public void setArinimi(java.lang.String arinimi) {
        this.arinimi = arinimi;
    }


    /**
     * Gets the staatus value for this Paringesindus_v4_ettevote.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this Paringesindus_v4_ettevote.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the staatus_tekstina value for this Paringesindus_v4_ettevote.
     * 
     * @return staatus_tekstina
     */
    public java.lang.String getStaatus_tekstina() {
        return staatus_tekstina;
    }


    /**
     * Sets the staatus_tekstina value for this Paringesindus_v4_ettevote.
     * 
     * @param staatus_tekstina
     */
    public void setStaatus_tekstina(java.lang.String staatus_tekstina) {
        this.staatus_tekstina = staatus_tekstina;
    }


    /**
     * Gets the isikud value for this Paringesindus_v4_ettevote.
     * 
     * @return isikud
     */
    public eu.x_road.arireg.producer.Paringesindus_v4_isik[] getIsikud() {
        return isikud;
    }


    /**
     * Sets the isikud value for this Paringesindus_v4_ettevote.
     * 
     * @param isikud
     */
    public void setIsikud(eu.x_road.arireg.producer.Paringesindus_v4_isik[] isikud) {
        this.isikud = isikud;
    }


    /**
     * Gets the esindusoiguse_eritingimused value for this Paringesindus_v4_ettevote.
     * 
     * @return esindusoiguse_eritingimused
     */
    public eu.x_road.arireg.producer.Paringesindus_v4_eritingimus[] getEsindusoiguse_eritingimused() {
        return esindusoiguse_eritingimused;
    }


    /**
     * Sets the esindusoiguse_eritingimused value for this Paringesindus_v4_ettevote.
     * 
     * @param esindusoiguse_eritingimused
     */
    public void setEsindusoiguse_eritingimused(eu.x_road.arireg.producer.Paringesindus_v4_eritingimus[] esindusoiguse_eritingimused) {
        this.esindusoiguse_eritingimused = esindusoiguse_eritingimused;
    }


    /**
     * Gets the oiguslik_vorm value for this Paringesindus_v4_ettevote.
     * 
     * @return oiguslik_vorm
     */
    public java.lang.String getOiguslik_vorm() {
        return oiguslik_vorm;
    }


    /**
     * Sets the oiguslik_vorm value for this Paringesindus_v4_ettevote.
     * 
     * @param oiguslik_vorm
     */
    public void setOiguslik_vorm(java.lang.String oiguslik_vorm) {
        this.oiguslik_vorm = oiguslik_vorm;
    }


    /**
     * Gets the oiguslik_vorm_tekstina value for this Paringesindus_v4_ettevote.
     * 
     * @return oiguslik_vorm_tekstina
     */
    public java.lang.String getOiguslik_vorm_tekstina() {
        return oiguslik_vorm_tekstina;
    }


    /**
     * Sets the oiguslik_vorm_tekstina value for this Paringesindus_v4_ettevote.
     * 
     * @param oiguslik_vorm_tekstina
     */
    public void setOiguslik_vorm_tekstina(java.lang.String oiguslik_vorm_tekstina) {
        this.oiguslik_vorm_tekstina = oiguslik_vorm_tekstina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringesindus_v4_ettevote)) return false;
        Paringesindus_v4_ettevote other = (Paringesindus_v4_ettevote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.arinimi==null && other.getArinimi()==null) || 
             (this.arinimi!=null &&
              this.arinimi.equals(other.getArinimi()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.staatus_tekstina==null && other.getStaatus_tekstina()==null) || 
             (this.staatus_tekstina!=null &&
              this.staatus_tekstina.equals(other.getStaatus_tekstina()))) &&
            ((this.isikud==null && other.getIsikud()==null) || 
             (this.isikud!=null &&
              java.util.Arrays.equals(this.isikud, other.getIsikud()))) &&
            ((this.esindusoiguse_eritingimused==null && other.getEsindusoiguse_eritingimused()==null) || 
             (this.esindusoiguse_eritingimused!=null &&
              java.util.Arrays.equals(this.esindusoiguse_eritingimused, other.getEsindusoiguse_eritingimused()))) &&
            ((this.oiguslik_vorm==null && other.getOiguslik_vorm()==null) || 
             (this.oiguslik_vorm!=null &&
              this.oiguslik_vorm.equals(other.getOiguslik_vorm()))) &&
            ((this.oiguslik_vorm_tekstina==null && other.getOiguslik_vorm_tekstina()==null) || 
             (this.oiguslik_vorm_tekstina!=null &&
              this.oiguslik_vorm_tekstina.equals(other.getOiguslik_vorm_tekstina())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getArinimi() != null) {
            _hashCode += getArinimi().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getStaatus_tekstina() != null) {
            _hashCode += getStaatus_tekstina().hashCode();
        }
        if (getIsikud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsikud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsikud(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEsindusoiguse_eritingimused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEsindusoiguse_eritingimused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEsindusoiguse_eritingimused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOiguslik_vorm() != null) {
            _hashCode += getOiguslik_vorm().hashCode();
        }
        if (getOiguslik_vorm_tekstina() != null) {
            _hashCode += getOiguslik_vorm_tekstina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
