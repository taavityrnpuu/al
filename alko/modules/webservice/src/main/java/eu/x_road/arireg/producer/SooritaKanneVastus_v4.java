/**
 * SooritaKanneVastus_v4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class SooritaKanneVastus_v4  implements java.io.Serializable {
    private java.lang.String teade;

    private java.lang.String legacy_lahendi_number;

    private java.lang.String paevikukande_id;

    private java.lang.String ettevotja_id;

    public SooritaKanneVastus_v4() {
    }

    public SooritaKanneVastus_v4(
           java.lang.String teade,
           java.lang.String legacy_lahendi_number,
           java.lang.String paevikukande_id,
           java.lang.String ettevotja_id) {
           this.teade = teade;
           this.legacy_lahendi_number = legacy_lahendi_number;
           this.paevikukande_id = paevikukande_id;
           this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the teade value for this SooritaKanneVastus_v4.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this SooritaKanneVastus_v4.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the legacy_lahendi_number value for this SooritaKanneVastus_v4.
     * 
     * @return legacy_lahendi_number
     */
    public java.lang.String getLegacy_lahendi_number() {
        return legacy_lahendi_number;
    }


    /**
     * Sets the legacy_lahendi_number value for this SooritaKanneVastus_v4.
     * 
     * @param legacy_lahendi_number
     */
    public void setLegacy_lahendi_number(java.lang.String legacy_lahendi_number) {
        this.legacy_lahendi_number = legacy_lahendi_number;
    }


    /**
     * Gets the paevikukande_id value for this SooritaKanneVastus_v4.
     * 
     * @return paevikukande_id
     */
    public java.lang.String getPaevikukande_id() {
        return paevikukande_id;
    }


    /**
     * Sets the paevikukande_id value for this SooritaKanneVastus_v4.
     * 
     * @param paevikukande_id
     */
    public void setPaevikukande_id(java.lang.String paevikukande_id) {
        this.paevikukande_id = paevikukande_id;
    }


    /**
     * Gets the ettevotja_id value for this SooritaKanneVastus_v4.
     * 
     * @return ettevotja_id
     */
    public java.lang.String getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this SooritaKanneVastus_v4.
     * 
     * @param ettevotja_id
     */
    public void setEttevotja_id(java.lang.String ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SooritaKanneVastus_v4)) return false;
        SooritaKanneVastus_v4 other = (SooritaKanneVastus_v4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.teade==null && other.getTeade()==null) || 
             (this.teade!=null &&
              this.teade.equals(other.getTeade()))) &&
            ((this.legacy_lahendi_number==null && other.getLegacy_lahendi_number()==null) || 
             (this.legacy_lahendi_number!=null &&
              this.legacy_lahendi_number.equals(other.getLegacy_lahendi_number()))) &&
            ((this.paevikukande_id==null && other.getPaevikukande_id()==null) || 
             (this.paevikukande_id!=null &&
              this.paevikukande_id.equals(other.getPaevikukande_id()))) &&
            ((this.ettevotja_id==null && other.getEttevotja_id()==null) || 
             (this.ettevotja_id!=null &&
              this.ettevotja_id.equals(other.getEttevotja_id())));
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
        if (getTeade() != null) {
            _hashCode += getTeade().hashCode();
        }
        if (getLegacy_lahendi_number() != null) {
            _hashCode += getLegacy_lahendi_number().hashCode();
        }
        if (getPaevikukande_id() != null) {
            _hashCode += getPaevikukande_id().hashCode();
        }
        if (getEttevotja_id() != null) {
            _hashCode += getEttevotja_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
