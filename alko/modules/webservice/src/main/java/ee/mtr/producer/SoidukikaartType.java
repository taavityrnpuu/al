/**
 * SoidukikaartType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SoidukikaartType  extends ee.x_road.mtr.producer.RegistrikanneType  implements java.io.Serializable {
    private java.util.Date kehtivuse_algus;

    private java.util.Date kehtivuse_lopp;

    private ee.x_road.mtr.producer.SoidukType[] soidukid;

    public SoidukikaartType() {
    }

    public SoidukikaartType(
           java.lang.String tyyp,
           java.lang.String regnr,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String tegevusalakood,
           java.util.Date registreerimisekp,
           org.apache.axis.types.URI mtrlink,
           java.util.Date kehtivuse_algus,
           java.util.Date kehtivuse_lopp,
           ee.x_road.mtr.producer.SoidukType[] soidukid) {
        super(
            tyyp,
            regnr,
            valdkond,
            tegevusala,
            tegevusalakood,
            registreerimisekp,
            mtrlink);
        this.kehtivuse_algus = kehtivuse_algus;
        this.kehtivuse_lopp = kehtivuse_lopp;
        this.soidukid = soidukid;
    }


    /**
     * Gets the kehtivuse_algus value for this SoidukikaartType.
     * 
     * @return kehtivuse_algus
     */
    public java.util.Date getKehtivuse_algus() {
        return kehtivuse_algus;
    }


    /**
     * Sets the kehtivuse_algus value for this SoidukikaartType.
     * 
     * @param kehtivuse_algus
     */
    public void setKehtivuse_algus(java.util.Date kehtivuse_algus) {
        this.kehtivuse_algus = kehtivuse_algus;
    }


    /**
     * Gets the kehtivuse_lopp value for this SoidukikaartType.
     * 
     * @return kehtivuse_lopp
     */
    public java.util.Date getKehtivuse_lopp() {
        return kehtivuse_lopp;
    }


    /**
     * Sets the kehtivuse_lopp value for this SoidukikaartType.
     * 
     * @param kehtivuse_lopp
     */
    public void setKehtivuse_lopp(java.util.Date kehtivuse_lopp) {
        this.kehtivuse_lopp = kehtivuse_lopp;
    }


    /**
     * Gets the soidukid value for this SoidukikaartType.
     * 
     * @return soidukid
     */
    public ee.x_road.mtr.producer.SoidukType[] getSoidukid() {
        return soidukid;
    }


    /**
     * Sets the soidukid value for this SoidukikaartType.
     * 
     * @param soidukid
     */
    public void setSoidukid(ee.x_road.mtr.producer.SoidukType[] soidukid) {
        this.soidukid = soidukid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoidukikaartType)) return false;
        SoidukikaartType other = (SoidukikaartType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.kehtivuse_algus==null && other.getKehtivuse_algus()==null) || 
             (this.kehtivuse_algus!=null &&
              this.kehtivuse_algus.equals(other.getKehtivuse_algus()))) &&
            ((this.kehtivuse_lopp==null && other.getKehtivuse_lopp()==null) || 
             (this.kehtivuse_lopp!=null &&
              this.kehtivuse_lopp.equals(other.getKehtivuse_lopp()))) &&
            ((this.soidukid==null && other.getSoidukid()==null) || 
             (this.soidukid!=null &&
              java.util.Arrays.equals(this.soidukid, other.getSoidukid())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getKehtivuse_algus() != null) {
            _hashCode += getKehtivuse_algus().hashCode();
        }
        if (getKehtivuse_lopp() != null) {
            _hashCode += getKehtivuse_lopp().hashCode();
        }
        if (getSoidukid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoidukid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoidukid(), i);
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
