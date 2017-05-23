/**
 * TaotluseValdkond.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotluseValdkond  implements java.io.Serializable {
    private java.lang.String nimi;

    private ee.x_road.mtr.producer.TaotluseTegevusala[] tegevusala;

    public TaotluseValdkond() {
    }

    public TaotluseValdkond(
           java.lang.String nimi,
           ee.x_road.mtr.producer.TaotluseTegevusala[] tegevusala) {
           this.nimi = nimi;
           this.tegevusala = tegevusala;
    }


    /**
     * Gets the nimi value for this TaotluseValdkond.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this TaotluseValdkond.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the tegevusala value for this TaotluseValdkond.
     * 
     * @return tegevusala
     */
    public ee.x_road.mtr.producer.TaotluseTegevusala[] getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this TaotluseValdkond.
     * 
     * @param tegevusala
     */
    public void setTegevusala(ee.x_road.mtr.producer.TaotluseTegevusala[] tegevusala) {
        this.tegevusala = tegevusala;
    }

    public ee.x_road.mtr.producer.TaotluseTegevusala getTegevusala(int i) {
        return this.tegevusala[i];
    }

    public void setTegevusala(int i, ee.x_road.mtr.producer.TaotluseTegevusala _value) {
        this.tegevusala[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotluseValdkond)) return false;
        TaotluseValdkond other = (TaotluseValdkond) obj;
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
              this.nimi.equals(other.getNimi()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              java.util.Arrays.equals(this.tegevusala, other.getTegevusala())));
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
            _hashCode += getNimi().hashCode();
        }
        if (getTegevusala() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevusala());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevusala(), i);
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
