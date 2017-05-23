/**
 * LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema  implements java.io.Serializable {
    private java.math.BigInteger id;

    private ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaNimi[] nimi;

    private ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaKirjeldus[] kirjeldus;

    private boolean aktiivne;

    public LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema() {
    }

    public LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema(
           java.math.BigInteger id,
           ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaNimi[] nimi,
           ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaKirjeldus[] kirjeldus,
           boolean aktiivne) {
           this.id = id;
           this.nimi = nimi;
           this.kirjeldus = kirjeldus;
           this.aktiivne = aktiivne;
    }


    /**
     * Gets the id value for this LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the nimi value for this LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.
     * 
     * @return nimi
     */
    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaNimi[] getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.
     * 
     * @param nimi
     */
    public void setNimi(ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaNimi[] nimi) {
        this.nimi = nimi;
    }

    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaNimi getNimi(int i) {
        return this.nimi[i];
    }

    public void setNimi(int i, ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaNimi _value) {
        this.nimi[i] = _value;
    }


    /**
     * Gets the kirjeldus value for this LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.
     * 
     * @return kirjeldus
     */
    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaKirjeldus[] getKirjeldus() {
        return kirjeldus;
    }


    /**
     * Sets the kirjeldus value for this LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.
     * 
     * @param kirjeldus
     */
    public void setKirjeldus(ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaKirjeldus[] kirjeldus) {
        this.kirjeldus = kirjeldus;
    }

    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaKirjeldus getKirjeldus(int i) {
        return this.kirjeldus[i];
    }

    public void setKirjeldus(int i, ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaKirjeldus _value) {
        this.kirjeldus[i] = _value;
    }


    /**
     * Gets the aktiivne value for this LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.
     * 
     * @return aktiivne
     */
    public boolean isAktiivne() {
        return aktiivne;
    }


    /**
     * Sets the aktiivne value for this LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.
     * 
     * @param aktiivne
     */
    public void setAktiivne(boolean aktiivne) {
        this.aktiivne = aktiivne;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema)) return false;
        LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema other = (LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              java.util.Arrays.equals(this.nimi, other.getNimi()))) &&
            ((this.kirjeldus==null && other.getKirjeldus()==null) || 
             (this.kirjeldus!=null &&
              java.util.Arrays.equals(this.kirjeldus, other.getKirjeldus()))) &&
            this.aktiivne == other.isAktiivne();
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
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
        if (getKirjeldus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKirjeldus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKirjeldus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isAktiivne() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
