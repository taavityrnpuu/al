/**
 * Paringesindus_v6_grupp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Paringesindus_v6_grupp  implements java.io.Serializable {
    private int grupi_nr;

    private eu.x_road.arireg.producer.Paringesindus_v6_isik[] item;

    public Paringesindus_v6_grupp() {
    }

    public Paringesindus_v6_grupp(
           int grupi_nr,
           eu.x_road.arireg.producer.Paringesindus_v6_isik[] item) {
           this.grupi_nr = grupi_nr;
           this.item = item;
    }


    /**
     * Gets the grupi_nr value for this Paringesindus_v6_grupp.
     * 
     * @return grupi_nr
     */
    public int getGrupi_nr() {
        return grupi_nr;
    }


    /**
     * Sets the grupi_nr value for this Paringesindus_v6_grupp.
     * 
     * @param grupi_nr
     */
    public void setGrupi_nr(int grupi_nr) {
        this.grupi_nr = grupi_nr;
    }


    /**
     * Gets the item value for this Paringesindus_v6_grupp.
     * 
     * @return item
     */
    public eu.x_road.arireg.producer.Paringesindus_v6_isik[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this Paringesindus_v6_grupp.
     * 
     * @param item
     */
    public void setItem(eu.x_road.arireg.producer.Paringesindus_v6_isik[] item) {
        this.item = item;
    }

    public eu.x_road.arireg.producer.Paringesindus_v6_isik getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, eu.x_road.arireg.producer.Paringesindus_v6_isik _value) {
        this.item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringesindus_v6_grupp)) return false;
        Paringesindus_v6_grupp other = (Paringesindus_v6_grupp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.grupi_nr == other.getGrupi_nr() &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem())));
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
        _hashCode += getGrupi_nr();
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
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
