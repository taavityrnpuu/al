/**
 * RegistrikanneDetailneMuinsuskaitseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistrikanneDetailneMuinsuskaitseType  extends ee.x_road.mtr.producer.RegistrikanneType  implements java.io.Serializable {
    private ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht[] tegevuskoht;

    private java.lang.String[] malestise_liik;

    private ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik[] vastutav_isik;

    public RegistrikanneDetailneMuinsuskaitseType() {
    }

    public RegistrikanneDetailneMuinsuskaitseType(
           java.lang.String tyyp,
           java.lang.String regnr,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String tegevusalakood,
           java.util.Date registreerimisekp,
           org.apache.axis.types.URI mtrlink,
           ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht[] tegevuskoht,
           java.lang.String[] malestise_liik,
           ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik[] vastutav_isik) {
        super(
            tyyp,
            regnr,
            valdkond,
            tegevusala,
            tegevusalakood,
            registreerimisekp,
            mtrlink);
        this.tegevuskoht = tegevuskoht;
        this.malestise_liik = malestise_liik;
        this.vastutav_isik = vastutav_isik;
    }


    /**
     * Gets the tegevuskoht value for this RegistrikanneDetailneMuinsuskaitseType.
     * 
     * @return tegevuskoht
     */
    public ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht[] getTegevuskoht() {
        return tegevuskoht;
    }


    /**
     * Sets the tegevuskoht value for this RegistrikanneDetailneMuinsuskaitseType.
     * 
     * @param tegevuskoht
     */
    public void setTegevuskoht(ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht[] tegevuskoht) {
        this.tegevuskoht = tegevuskoht;
    }

    public ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht getTegevuskoht(int i) {
        return this.tegevuskoht[i];
    }

    public void setTegevuskoht(int i, ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht _value) {
        this.tegevuskoht[i] = _value;
    }


    /**
     * Gets the malestise_liik value for this RegistrikanneDetailneMuinsuskaitseType.
     * 
     * @return malestise_liik
     */
    public java.lang.String[] getMalestise_liik() {
        return malestise_liik;
    }


    /**
     * Sets the malestise_liik value for this RegistrikanneDetailneMuinsuskaitseType.
     * 
     * @param malestise_liik
     */
    public void setMalestise_liik(java.lang.String[] malestise_liik) {
        this.malestise_liik = malestise_liik;
    }

    public java.lang.String getMalestise_liik(int i) {
        return this.malestise_liik[i];
    }

    public void setMalestise_liik(int i, java.lang.String _value) {
        this.malestise_liik[i] = _value;
    }


    /**
     * Gets the vastutav_isik value for this RegistrikanneDetailneMuinsuskaitseType.
     * 
     * @return vastutav_isik
     */
    public ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik[] getVastutav_isik() {
        return vastutav_isik;
    }


    /**
     * Sets the vastutav_isik value for this RegistrikanneDetailneMuinsuskaitseType.
     * 
     * @param vastutav_isik
     */
    public void setVastutav_isik(ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik[] vastutav_isik) {
        this.vastutav_isik = vastutav_isik;
    }

    public ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik getVastutav_isik(int i) {
        return this.vastutav_isik[i];
    }

    public void setVastutav_isik(int i, ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik _value) {
        this.vastutav_isik[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrikanneDetailneMuinsuskaitseType)) return false;
        RegistrikanneDetailneMuinsuskaitseType other = (RegistrikanneDetailneMuinsuskaitseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tegevuskoht==null && other.getTegevuskoht()==null) || 
             (this.tegevuskoht!=null &&
              java.util.Arrays.equals(this.tegevuskoht, other.getTegevuskoht()))) &&
            ((this.malestise_liik==null && other.getMalestise_liik()==null) || 
             (this.malestise_liik!=null &&
              java.util.Arrays.equals(this.malestise_liik, other.getMalestise_liik()))) &&
            ((this.vastutav_isik==null && other.getVastutav_isik()==null) || 
             (this.vastutav_isik!=null &&
              java.util.Arrays.equals(this.vastutav_isik, other.getVastutav_isik())));
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
        if (getTegevuskoht() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevuskoht());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevuskoht(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMalestise_liik() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMalestise_liik());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMalestise_liik(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVastutav_isik() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVastutav_isik());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVastutav_isik(), i);
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
