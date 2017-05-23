/**
 * DynPlokk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class DynPlokk  implements java.io.Serializable {
    private java.math.BigInteger ID;

    private java.lang.String tunnus;

    private java.lang.String nimi;

    private ee.x_road.mtr.producer.DynElement[] element;

    public DynPlokk() {
    }

    public DynPlokk(
           java.math.BigInteger ID,
           java.lang.String tunnus,
           java.lang.String nimi,
           ee.x_road.mtr.producer.DynElement[] element) {
           this.ID = ID;
           this.tunnus = tunnus;
           this.nimi = nimi;
           this.element = element;
    }


    /**
     * Gets the ID value for this DynPlokk.
     * 
     * @return ID
     */
    public java.math.BigInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DynPlokk.
     * 
     * @param ID
     */
    public void setID(java.math.BigInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the tunnus value for this DynPlokk.
     * 
     * @return tunnus
     */
    public java.lang.String getTunnus() {
        return tunnus;
    }


    /**
     * Sets the tunnus value for this DynPlokk.
     * 
     * @param tunnus
     */
    public void setTunnus(java.lang.String tunnus) {
        this.tunnus = tunnus;
    }


    /**
     * Gets the nimi value for this DynPlokk.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this DynPlokk.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the element value for this DynPlokk.
     * 
     * @return element
     */
    public ee.x_road.mtr.producer.DynElement[] getElement() {
        return element;
    }


    /**
     * Sets the element value for this DynPlokk.
     * 
     * @param element
     */
    public void setElement(ee.x_road.mtr.producer.DynElement[] element) {
        this.element = element;
    }

    public ee.x_road.mtr.producer.DynElement getElement(int i) {
        return this.element[i];
    }

    public void setElement(int i, ee.x_road.mtr.producer.DynElement _value) {
        this.element[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DynPlokk)) return false;
        DynPlokk other = (DynPlokk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.tunnus==null && other.getTunnus()==null) || 
             (this.tunnus!=null &&
              this.tunnus.equals(other.getTunnus()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.element==null && other.getElement()==null) || 
             (this.element!=null &&
              java.util.Arrays.equals(this.element, other.getElement())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getTunnus() != null) {
            _hashCode += getTunnus().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElement(), i);
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
