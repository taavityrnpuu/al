/**
 * LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond  implements java.io.Serializable {
    private ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondNimi[] nimi;

    private java.math.BigInteger id;

    private ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala[] tegevusalad;

    public LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond() {
    }

    public LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond(
           ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondNimi[] nimi,
           java.math.BigInteger id,
           ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala[] tegevusalad) {
           this.nimi = nimi;
           this.id = id;
           this.tegevusalad = tegevusalad;
    }


    /**
     * Gets the nimi value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond.
     * 
     * @return nimi
     */
    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondNimi[] getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond.
     * 
     * @param nimi
     */
    public void setNimi(ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondNimi[] nimi) {
        this.nimi = nimi;
    }

    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondNimi getNimi(int i) {
        return this.nimi[i];
    }

    public void setNimi(int i, ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondNimi _value) {
        this.nimi[i] = _value;
    }


    /**
     * Gets the id value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the tegevusalad value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond.
     * 
     * @return tegevusalad
     */
    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala[] getTegevusalad() {
        return tegevusalad;
    }


    /**
     * Sets the tegevusalad value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond.
     * 
     * @param tegevusalad
     */
    public void setTegevusalad(ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala[] tegevusalad) {
        this.tegevusalad = tegevusalad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond)) return false;
        LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond other = (LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              java.util.Arrays.equals(this.nimi, other.getNimi()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.tegevusalad==null && other.getTegevusalad()==null) || 
             (this.tegevusalad!=null &&
              java.util.Arrays.equals(this.tegevusalad, other.getTegevusalad())));
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
        if (getNimi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNimi());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNimi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTegevusalad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevusalad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevusalad(), i);
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
