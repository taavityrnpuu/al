/**
 * Ettevotja_dokumentide_loetelu_vastus_v2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Ettevotja_dokumentide_loetelu_vastus_v2  implements java.io.Serializable {
    private eu.x_road.arireg.producer.Ettevotja_dokument[] ettevotja_dokumendid;

    private java.math.BigInteger lehekylgede_arv;

    public Ettevotja_dokumentide_loetelu_vastus_v2() {
    }

    public Ettevotja_dokumentide_loetelu_vastus_v2(
           eu.x_road.arireg.producer.Ettevotja_dokument[] ettevotja_dokumendid,
           java.math.BigInteger lehekylgede_arv) {
           this.ettevotja_dokumendid = ettevotja_dokumendid;
           this.lehekylgede_arv = lehekylgede_arv;
    }


    /**
     * Gets the ettevotja_dokumendid value for this Ettevotja_dokumentide_loetelu_vastus_v2.
     * 
     * @return ettevotja_dokumendid
     */
    public eu.x_road.arireg.producer.Ettevotja_dokument[] getEttevotja_dokumendid() {
        return ettevotja_dokumendid;
    }


    /**
     * Sets the ettevotja_dokumendid value for this Ettevotja_dokumentide_loetelu_vastus_v2.
     * 
     * @param ettevotja_dokumendid
     */
    public void setEttevotja_dokumendid(eu.x_road.arireg.producer.Ettevotja_dokument[] ettevotja_dokumendid) {
        this.ettevotja_dokumendid = ettevotja_dokumendid;
    }

    public eu.x_road.arireg.producer.Ettevotja_dokument getEttevotja_dokumendid(int i) {
        return this.ettevotja_dokumendid[i];
    }

    public void setEttevotja_dokumendid(int i, eu.x_road.arireg.producer.Ettevotja_dokument _value) {
        this.ettevotja_dokumendid[i] = _value;
    }


    /**
     * Gets the lehekylgede_arv value for this Ettevotja_dokumentide_loetelu_vastus_v2.
     * 
     * @return lehekylgede_arv
     */
    public java.math.BigInteger getLehekylgede_arv() {
        return lehekylgede_arv;
    }


    /**
     * Sets the lehekylgede_arv value for this Ettevotja_dokumentide_loetelu_vastus_v2.
     * 
     * @param lehekylgede_arv
     */
    public void setLehekylgede_arv(java.math.BigInteger lehekylgede_arv) {
        this.lehekylgede_arv = lehekylgede_arv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ettevotja_dokumentide_loetelu_vastus_v2)) return false;
        Ettevotja_dokumentide_loetelu_vastus_v2 other = (Ettevotja_dokumentide_loetelu_vastus_v2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotja_dokumendid==null && other.getEttevotja_dokumendid()==null) || 
             (this.ettevotja_dokumendid!=null &&
              java.util.Arrays.equals(this.ettevotja_dokumendid, other.getEttevotja_dokumendid()))) &&
            ((this.lehekylgede_arv==null && other.getLehekylgede_arv()==null) || 
             (this.lehekylgede_arv!=null &&
              this.lehekylgede_arv.equals(other.getLehekylgede_arv())));
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
        if (getEttevotja_dokumendid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEttevotja_dokumendid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEttevotja_dokumendid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLehekylgede_arv() != null) {
            _hashCode += getLehekylgede_arv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
