/**
 * Ettevotja_muudatused_tasuta_vastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_muudatused_tasuta_vastus  implements java.io.Serializable {
    /* Ettevõtjate kandemuudatused */
    private eu.x_road.arireg.producer.Ettevotja_muudatus_kanne[] kanded;

    /* Ettevõtjate kandemuudatuste arv */
    private java.lang.Integer kanded_arv;

    /* Ettevõtjate kandevälised muudatused */
    private eu.x_road.arireg.producer.Ettevotja_muudatus_kandevaline[] kandevalised;

    /* Ettevõtjate kandeväliste muudatuste arv */
    private java.lang.Integer kandevalised_arv;

    /* Ettevõtjate esitatud majandusaasta aruanded */
    private eu.x_road.arireg.producer.Ettevotja_muudatus_aruanne[] aruanded;

    /* Ettevõtjate esitatud majandusaasta aruannete arv */
    private java.lang.Integer aruanded_arv;

    /* Ettevõtjatele tehtud määrused */
    private eu.x_road.arireg.producer.Ettevotja_muudatus_maarus[] maarused;

    /* Ettevõtjatele tehtud määruste arv */
    private java.lang.Integer maarused_arv;

    public Ettevotja_muudatused_tasuta_vastus() {
    }

    public Ettevotja_muudatused_tasuta_vastus(
           eu.x_road.arireg.producer.Ettevotja_muudatus_kanne[] kanded,
           java.lang.Integer kanded_arv,
           eu.x_road.arireg.producer.Ettevotja_muudatus_kandevaline[] kandevalised,
           java.lang.Integer kandevalised_arv,
           eu.x_road.arireg.producer.Ettevotja_muudatus_aruanne[] aruanded,
           java.lang.Integer aruanded_arv,
           eu.x_road.arireg.producer.Ettevotja_muudatus_maarus[] maarused,
           java.lang.Integer maarused_arv) {
           this.kanded = kanded;
           this.kanded_arv = kanded_arv;
           this.kandevalised = kandevalised;
           this.kandevalised_arv = kandevalised_arv;
           this.aruanded = aruanded;
           this.aruanded_arv = aruanded_arv;
           this.maarused = maarused;
           this.maarused_arv = maarused_arv;
    }


    /**
     * Gets the kanded value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @return kanded   * Ettevõtjate kandemuudatused
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatus_kanne[] getKanded() {
        return kanded;
    }


    /**
     * Sets the kanded value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @param kanded   * Ettevõtjate kandemuudatused
     */
    public void setKanded(eu.x_road.arireg.producer.Ettevotja_muudatus_kanne[] kanded) {
        this.kanded = kanded;
    }


    /**
     * Gets the kanded_arv value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @return kanded_arv   * Ettevõtjate kandemuudatuste arv
     */
    public java.lang.Integer getKanded_arv() {
        return kanded_arv;
    }


    /**
     * Sets the kanded_arv value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @param kanded_arv   * Ettevõtjate kandemuudatuste arv
     */
    public void setKanded_arv(java.lang.Integer kanded_arv) {
        this.kanded_arv = kanded_arv;
    }


    /**
     * Gets the kandevalised value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @return kandevalised   * Ettevõtjate kandevälised muudatused
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatus_kandevaline[] getKandevalised() {
        return kandevalised;
    }


    /**
     * Sets the kandevalised value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @param kandevalised   * Ettevõtjate kandevälised muudatused
     */
    public void setKandevalised(eu.x_road.arireg.producer.Ettevotja_muudatus_kandevaline[] kandevalised) {
        this.kandevalised = kandevalised;
    }


    /**
     * Gets the kandevalised_arv value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @return kandevalised_arv   * Ettevõtjate kandeväliste muudatuste arv
     */
    public java.lang.Integer getKandevalised_arv() {
        return kandevalised_arv;
    }


    /**
     * Sets the kandevalised_arv value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @param kandevalised_arv   * Ettevõtjate kandeväliste muudatuste arv
     */
    public void setKandevalised_arv(java.lang.Integer kandevalised_arv) {
        this.kandevalised_arv = kandevalised_arv;
    }


    /**
     * Gets the aruanded value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @return aruanded   * Ettevõtjate esitatud majandusaasta aruanded
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatus_aruanne[] getAruanded() {
        return aruanded;
    }


    /**
     * Sets the aruanded value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @param aruanded   * Ettevõtjate esitatud majandusaasta aruanded
     */
    public void setAruanded(eu.x_road.arireg.producer.Ettevotja_muudatus_aruanne[] aruanded) {
        this.aruanded = aruanded;
    }


    /**
     * Gets the aruanded_arv value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @return aruanded_arv   * Ettevõtjate esitatud majandusaasta aruannete arv
     */
    public java.lang.Integer getAruanded_arv() {
        return aruanded_arv;
    }


    /**
     * Sets the aruanded_arv value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @param aruanded_arv   * Ettevõtjate esitatud majandusaasta aruannete arv
     */
    public void setAruanded_arv(java.lang.Integer aruanded_arv) {
        this.aruanded_arv = aruanded_arv;
    }


    /**
     * Gets the maarused value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @return maarused   * Ettevõtjatele tehtud määrused
     */
    public eu.x_road.arireg.producer.Ettevotja_muudatus_maarus[] getMaarused() {
        return maarused;
    }


    /**
     * Sets the maarused value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @param maarused   * Ettevõtjatele tehtud määrused
     */
    public void setMaarused(eu.x_road.arireg.producer.Ettevotja_muudatus_maarus[] maarused) {
        this.maarused = maarused;
    }


    /**
     * Gets the maarused_arv value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @return maarused_arv   * Ettevõtjatele tehtud määruste arv
     */
    public java.lang.Integer getMaarused_arv() {
        return maarused_arv;
    }


    /**
     * Sets the maarused_arv value for this Ettevotja_muudatused_tasuta_vastus.
     * 
     * @param maarused_arv   * Ettevõtjatele tehtud määruste arv
     */
    public void setMaarused_arv(java.lang.Integer maarused_arv) {
        this.maarused_arv = maarused_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_muudatused_tasuta_vastus)) return false;
        Ettevotja_muudatused_tasuta_vastus other = (Ettevotja_muudatused_tasuta_vastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kanded==null && other.getKanded()==null) || 
             (this.kanded!=null &&
              java.util.Arrays.equals(this.kanded, other.getKanded()))) &&
            ((this.kanded_arv==null && other.getKanded_arv()==null) || 
             (this.kanded_arv!=null &&
              this.kanded_arv.equals(other.getKanded_arv()))) &&
            ((this.kandevalised==null && other.getKandevalised()==null) || 
             (this.kandevalised!=null &&
              java.util.Arrays.equals(this.kandevalised, other.getKandevalised()))) &&
            ((this.kandevalised_arv==null && other.getKandevalised_arv()==null) || 
             (this.kandevalised_arv!=null &&
              this.kandevalised_arv.equals(other.getKandevalised_arv()))) &&
            ((this.aruanded==null && other.getAruanded()==null) || 
             (this.aruanded!=null &&
              java.util.Arrays.equals(this.aruanded, other.getAruanded()))) &&
            ((this.aruanded_arv==null && other.getAruanded_arv()==null) || 
             (this.aruanded_arv!=null &&
              this.aruanded_arv.equals(other.getAruanded_arv()))) &&
            ((this.maarused==null && other.getMaarused()==null) || 
             (this.maarused!=null &&
              java.util.Arrays.equals(this.maarused, other.getMaarused()))) &&
            ((this.maarused_arv==null && other.getMaarused_arv()==null) || 
             (this.maarused_arv!=null &&
              this.maarused_arv.equals(other.getMaarused_arv())));
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
        if (getKanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKanded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKanded_arv() != null) {
            _hashCode += getKanded_arv().hashCode();
        }
        if (getKandevalised() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKandevalised());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKandevalised(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKandevalised_arv() != null) {
            _hashCode += getKandevalised_arv().hashCode();
        }
        if (getAruanded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAruanded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAruanded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAruanded_arv() != null) {
            _hashCode += getAruanded_arv().hashCode();
        }
        if (getMaarused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaarused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaarused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaarused_arv() != null) {
            _hashCode += getMaarused_arv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
