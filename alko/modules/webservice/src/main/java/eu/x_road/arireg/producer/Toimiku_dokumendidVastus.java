/**
 * Toimiku_dokumendidVastus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Toimiku_dokumendidVastus  implements java.io.Serializable {
    /* Dokumendid vastuses. */
    private eu.x_road.arireg.producer.Toimiku_dokumendid_dokument[] dokumendid;

    public Toimiku_dokumendidVastus() {
    }

    public Toimiku_dokumendidVastus(
           eu.x_road.arireg.producer.Toimiku_dokumendid_dokument[] dokumendid) {
           this.dokumendid = dokumendid;
    }


    /**
     * Gets the dokumendid value for this Toimiku_dokumendidVastus.
     * 
     * @return dokumendid   * Dokumendid vastuses.
     */
    public eu.x_road.arireg.producer.Toimiku_dokumendid_dokument[] getDokumendid() {
        return dokumendid;
    }


    /**
     * Sets the dokumendid value for this Toimiku_dokumendidVastus.
     * 
     * @param dokumendid   * Dokumendid vastuses.
     */
    public void setDokumendid(eu.x_road.arireg.producer.Toimiku_dokumendid_dokument[] dokumendid) {
        this.dokumendid = dokumendid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Toimiku_dokumendidVastus)) return false;
        Toimiku_dokumendidVastus other = (Toimiku_dokumendidVastus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dokumendid==null && other.getDokumendid()==null) || 
             (this.dokumendid!=null &&
              java.util.Arrays.equals(this.dokumendid, other.getDokumendid())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
