/**
 * Ariregistri_toimik_Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ariregistri_toimik_Response  implements java.io.Serializable {
    private int ariregistri_kood;

    private eu.x_road.arireg.producer.Ariregistri_toimik_dokument[] dokumendid;

    private eu.x_road.arireg.producer.Ariregistri_toimik_otsus[] otsused;

    private eu.x_road.arireg.producer.Ariregistri_toimik_hoiatus[] hoiatused;

    public Ariregistri_toimik_Response() {
    }

    public Ariregistri_toimik_Response(
           int ariregistri_kood,
           eu.x_road.arireg.producer.Ariregistri_toimik_dokument[] dokumendid,
           eu.x_road.arireg.producer.Ariregistri_toimik_otsus[] otsused,
           eu.x_road.arireg.producer.Ariregistri_toimik_hoiatus[] hoiatused) {
           this.ariregistri_kood = ariregistri_kood;
           this.dokumendid = dokumendid;
           this.otsused = otsused;
           this.hoiatused = hoiatused;
    }


    /**
     * Gets the ariregistri_kood value for this Ariregistri_toimik_Response.
     * 
     * @return ariregistri_kood
     */
    public int getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Ariregistri_toimik_Response.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(int ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the dokumendid value for this Ariregistri_toimik_Response.
     * 
     * @return dokumendid
     */
    public eu.x_road.arireg.producer.Ariregistri_toimik_dokument[] getDokumendid() {
        return dokumendid;
    }


    /**
     * Sets the dokumendid value for this Ariregistri_toimik_Response.
     * 
     * @param dokumendid
     */
    public void setDokumendid(eu.x_road.arireg.producer.Ariregistri_toimik_dokument[] dokumendid) {
        this.dokumendid = dokumendid;
    }


    /**
     * Gets the otsused value for this Ariregistri_toimik_Response.
     * 
     * @return otsused
     */
    public eu.x_road.arireg.producer.Ariregistri_toimik_otsus[] getOtsused() {
        return otsused;
    }


    /**
     * Sets the otsused value for this Ariregistri_toimik_Response.
     * 
     * @param otsused
     */
    public void setOtsused(eu.x_road.arireg.producer.Ariregistri_toimik_otsus[] otsused) {
        this.otsused = otsused;
    }


    /**
     * Gets the hoiatused value for this Ariregistri_toimik_Response.
     * 
     * @return hoiatused
     */
    public eu.x_road.arireg.producer.Ariregistri_toimik_hoiatus[] getHoiatused() {
        return hoiatused;
    }


    /**
     * Sets the hoiatused value for this Ariregistri_toimik_Response.
     * 
     * @param hoiatused
     */
    public void setHoiatused(eu.x_road.arireg.producer.Ariregistri_toimik_hoiatus[] hoiatused) {
        this.hoiatused = hoiatused;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ariregistri_toimik_Response)) return false;
        Ariregistri_toimik_Response other = (Ariregistri_toimik_Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ariregistri_kood == other.getAriregistri_kood() &&
            ((this.dokumendid==null && other.getDokumendid()==null) || 
             (this.dokumendid!=null &&
              java.util.Arrays.equals(this.dokumendid, other.getDokumendid()))) &&
            ((this.otsused==null && other.getOtsused()==null) || 
             (this.otsused!=null &&
              java.util.Arrays.equals(this.otsused, other.getOtsused()))) &&
            ((this.hoiatused==null && other.getHoiatused()==null) || 
             (this.hoiatused!=null &&
              java.util.Arrays.equals(this.hoiatused, other.getHoiatused())));
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
        _hashCode += getAriregistri_kood();
        if (getDokumendid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDokumendid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDokumendid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtsused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtsused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtsused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHoiatused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHoiatused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHoiatused(), i);
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
