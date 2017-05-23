/**
 * Menetlusinfo_v3_menetlused.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Menetlusinfo_v3_menetlused  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Menetlusinfo_v3_dokument[] dokumendid;

    private eu.x_road.arireg.producer.Menetlusinfo_v3_hoiatus[] hoiatused;

    private eu.x_road.arireg.producer.Menetlusinfo_v3_maarus[] maarused;

    public Menetlusinfo_v3_menetlused() {
    }

    public Menetlusinfo_v3_menetlused(
           eu.x_road.arireg.producer.Menetlusinfo_v3_dokument[] dokumendid,
           eu.x_road.arireg.producer.Menetlusinfo_v3_hoiatus[] hoiatused,
           eu.x_road.arireg.producer.Menetlusinfo_v3_maarus[] maarused) {
           this.dokumendid = dokumendid;
           this.hoiatused = hoiatused;
           this.maarused = maarused;
    }


    /**
     * Gets the dokumendid value for this Menetlusinfo_v3_menetlused.
     * 
     * @return dokumendid
     */
    public eu.x_road.arireg.producer.Menetlusinfo_v3_dokument[] getDokumendid() {
        return dokumendid;
    }


    /**
     * Sets the dokumendid value for this Menetlusinfo_v3_menetlused.
     * 
     * @param dokumendid
     */
    public void setDokumendid(eu.x_road.arireg.producer.Menetlusinfo_v3_dokument[] dokumendid) {
        this.dokumendid = dokumendid;
    }

    public eu.x_road.arireg.producer.Menetlusinfo_v3_dokument getDokumendid(int i) {
        return this.dokumendid[i];
    }

    public void setDokumendid(int i, eu.x_road.arireg.producer.Menetlusinfo_v3_dokument _value) {
        this.dokumendid[i] = _value;
    }


    /**
     * Gets the hoiatused value for this Menetlusinfo_v3_menetlused.
     * 
     * @return hoiatused
     */
    public eu.x_road.arireg.producer.Menetlusinfo_v3_hoiatus[] getHoiatused() {
        return hoiatused;
    }


    /**
     * Sets the hoiatused value for this Menetlusinfo_v3_menetlused.
     * 
     * @param hoiatused
     */
    public void setHoiatused(eu.x_road.arireg.producer.Menetlusinfo_v3_hoiatus[] hoiatused) {
        this.hoiatused = hoiatused;
    }

    public eu.x_road.arireg.producer.Menetlusinfo_v3_hoiatus getHoiatused(int i) {
        return this.hoiatused[i];
    }

    public void setHoiatused(int i, eu.x_road.arireg.producer.Menetlusinfo_v3_hoiatus _value) {
        this.hoiatused[i] = _value;
    }


    /**
     * Gets the maarused value for this Menetlusinfo_v3_menetlused.
     * 
     * @return maarused
     */
    public eu.x_road.arireg.producer.Menetlusinfo_v3_maarus[] getMaarused() {
        return maarused;
    }


    /**
     * Sets the maarused value for this Menetlusinfo_v3_menetlused.
     * 
     * @param maarused
     */
    public void setMaarused(eu.x_road.arireg.producer.Menetlusinfo_v3_maarus[] maarused) {
        this.maarused = maarused;
    }

    public eu.x_road.arireg.producer.Menetlusinfo_v3_maarus getMaarused(int i) {
        return this.maarused[i];
    }

    public void setMaarused(int i, eu.x_road.arireg.producer.Menetlusinfo_v3_maarus _value) {
        this.maarused[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Menetlusinfo_v3_menetlused)) return false;
        Menetlusinfo_v3_menetlused other = (Menetlusinfo_v3_menetlused) obj;
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
              java.util.Arrays.equals(this.dokumendid, other.getDokumendid()))) &&
            ((this.hoiatused==null && other.getHoiatused()==null) || 
             (this.hoiatused!=null &&
              java.util.Arrays.equals(this.hoiatused, other.getHoiatused()))) &&
            ((this.maarused==null && other.getMaarused()==null) || 
             (this.maarused!=null &&
              java.util.Arrays.equals(this.maarused, other.getMaarused())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
