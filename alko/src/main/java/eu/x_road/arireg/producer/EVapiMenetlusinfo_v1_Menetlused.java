/**
 * EVapiMenetlusinfo_v1_Menetlused.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class EVapiMenetlusinfo_v1_Menetlused  implements java.io.Serializable {
    private eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlus[] menetlus_info;

    private eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Maarus[] maarused;

    public EVapiMenetlusinfo_v1_Menetlused() {
    }

    public EVapiMenetlusinfo_v1_Menetlused(
           eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlus[] menetlus_info,
           eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Maarus[] maarused) {
           this.menetlus_info = menetlus_info;
           this.maarused = maarused;
    }


    /**
     * Gets the menetlus_info value for this EVapiMenetlusinfo_v1_Menetlused.
     * 
     * @return menetlus_info
     */
    public eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlus[] getMenetlus_info() {
        return menetlus_info;
    }


    /**
     * Sets the menetlus_info value for this EVapiMenetlusinfo_v1_Menetlused.
     * 
     * @param menetlus_info
     */
    public void setMenetlus_info(eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlus[] menetlus_info) {
        this.menetlus_info = menetlus_info;
    }

    public eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlus getMenetlus_info(int i) {
        return this.menetlus_info[i];
    }

    public void setMenetlus_info(int i, eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlus _value) {
        this.menetlus_info[i] = _value;
    }


    /**
     * Gets the maarused value for this EVapiMenetlusinfo_v1_Menetlused.
     * 
     * @return maarused
     */
    public eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Maarus[] getMaarused() {
        return maarused;
    }


    /**
     * Sets the maarused value for this EVapiMenetlusinfo_v1_Menetlused.
     * 
     * @param maarused
     */
    public void setMaarused(eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Maarus[] maarused) {
        this.maarused = maarused;
    }

    public eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Maarus getMaarused(int i) {
        return this.maarused[i];
    }

    public void setMaarused(int i, eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Maarus _value) {
        this.maarused[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVapiMenetlusinfo_v1_Menetlused)) return false;
        EVapiMenetlusinfo_v1_Menetlused other = (EVapiMenetlusinfo_v1_Menetlused) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.menetlus_info==null && other.getMenetlus_info()==null) || 
             (this.menetlus_info!=null &&
              java.util.Arrays.equals(this.menetlus_info, other.getMenetlus_info()))) &&
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
        if (getMenetlus_info() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMenetlus_info());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMenetlus_info(), i);
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
