/**
 * EVapiLooKanneVastus_v1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiLooKanneVastus_v1  implements java.io.Serializable {
    private java.lang.String teade;

    private java.math.BigInteger ekanded_id;

    private org.apache.axis.types.URI viide_manusele;

    public EVapiLooKanneVastus_v1() {
    }

    public EVapiLooKanneVastus_v1(
           java.lang.String teade,
           java.math.BigInteger ekanded_id,
           org.apache.axis.types.URI viide_manusele) {
           this.teade = teade;
           this.ekanded_id = ekanded_id;
           this.viide_manusele = viide_manusele;
    }


    /**
     * Gets the teade value for this EVapiLooKanneVastus_v1.
     * 
     * @return teade
     */
    public java.lang.String getTeade() {
        return teade;
    }


    /**
     * Sets the teade value for this EVapiLooKanneVastus_v1.
     * 
     * @param teade
     */
    public void setTeade(java.lang.String teade) {
        this.teade = teade;
    }


    /**
     * Gets the ekanded_id value for this EVapiLooKanneVastus_v1.
     * 
     * @return ekanded_id
     */
    public java.math.BigInteger getEkanded_id() {
        return ekanded_id;
    }


    /**
     * Sets the ekanded_id value for this EVapiLooKanneVastus_v1.
     * 
     * @param ekanded_id
     */
    public void setEkanded_id(java.math.BigInteger ekanded_id) {
        this.ekanded_id = ekanded_id;
    }


    /**
     * Gets the viide_manusele value for this EVapiLooKanneVastus_v1.
     * 
     * @return viide_manusele
     */
    public org.apache.axis.types.URI getViide_manusele() {
        return viide_manusele;
    }


    /**
     * Sets the viide_manusele value for this EVapiLooKanneVastus_v1.
     * 
     * @param viide_manusele
     */
    public void setViide_manusele(org.apache.axis.types.URI viide_manusele) {
        this.viide_manusele = viide_manusele;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiLooKanneVastus_v1)) return false;
        EVapiLooKanneVastus_v1 other = (EVapiLooKanneVastus_v1) obj;
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
            ((this.ekanded_id==null && other.getEkanded_id()==null) || 
             (this.ekanded_id!=null &&
              this.ekanded_id.equals(other.getEkanded_id()))) &&
            ((this.viide_manusele==null && other.getViide_manusele()==null) || 
             (this.viide_manusele!=null &&
              this.viide_manusele.equals(other.getViide_manusele())));
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
        if (getEkanded_id() != null) {
            _hashCode += getEkanded_id().hashCode();
        }
        if (getViide_manusele() != null) {
            _hashCode += getViide_manusele().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
