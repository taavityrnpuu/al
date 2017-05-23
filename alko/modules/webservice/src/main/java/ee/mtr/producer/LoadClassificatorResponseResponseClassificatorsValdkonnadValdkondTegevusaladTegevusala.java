/**
 * LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala  implements java.io.Serializable {
    private ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi[] nimi;

    private java.lang.String tahis;

    private java.math.BigInteger id;

    public LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala() {
    }

    public LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala(
           ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi[] nimi,
           java.lang.String tahis,
           java.math.BigInteger id) {
           this.nimi = nimi;
           this.tahis = tahis;
           this.id = id;
    }


    /**
     * Gets the nimi value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala.
     * 
     * @return nimi
     */
    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi[] getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala.
     * 
     * @param nimi
     */
    public void setNimi(ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi[] nimi) {
        this.nimi = nimi;
    }

    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi getNimi(int i) {
        return this.nimi[i];
    }

    public void setNimi(int i, ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi _value) {
        this.nimi[i] = _value;
    }


    /**
     * Gets the tahis value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala.
     * 
     * @return tahis
     */
    public java.lang.String getTahis() {
        return tahis;
    }


    /**
     * Sets the tahis value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala.
     * 
     * @param tahis
     */
    public void setTahis(java.lang.String tahis) {
        this.tahis = tahis;
    }


    /**
     * Gets the id value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala)) return false;
        LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala other = (LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala) obj;
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
            ((this.tahis==null && other.getTahis()==null) || 
             (this.tahis!=null &&
              this.tahis.equals(other.getTahis()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getTahis() != null) {
            _hashCode += getTahis().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
