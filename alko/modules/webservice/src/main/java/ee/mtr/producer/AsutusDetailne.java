/**
 * AsutusDetailne.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class AsutusDetailne  extends ee.x_road.mtr.producer.Asutus  implements java.io.Serializable {
    private ee.x_road.mtr.producer.AsutusTegevuskoht[] tegevuskohad;

    private ee.x_road.mtr.producer.Sidevahend[] sidevahendid;

    private ee.x_road.mtr.producer.Tagatis[] tagatised;

    public AsutusDetailne() {
    }

    public AsutusDetailne(
           java.lang.String registreeringuNumber,
           java.lang.String ettevõtjaNumber,
           java.lang.String FIEIsikukood,
           java.lang.String ettevõtjanimetusFIEnimi,
           ee.x_road.mtr.producer.KlassifikaatorValik[] tegevusAlad,
           java.util.Date FIESünnikuupäev,
           java.util.Calendar andmeteTõesuseKontrolliKuupäev,
           ee.x_road.mtr.producer.AsutusTegevuskoht[] tegevuskohad,
           ee.x_road.mtr.producer.Sidevahend[] sidevahendid,
           ee.x_road.mtr.producer.Tagatis[] tagatised) {
        super(
            registreeringuNumber,
            ettevõtjaNumber,
            FIEIsikukood,
            ettevõtjanimetusFIEnimi,
            tegevusAlad,
            FIESünnikuupäev,
            andmeteTõesuseKontrolliKuupäev);
        this.tegevuskohad = tegevuskohad;
        this.sidevahendid = sidevahendid;
        this.tagatised = tagatised;
    }


    /**
     * Gets the tegevuskohad value for this AsutusDetailne.
     * 
     * @return tegevuskohad
     */
    public ee.x_road.mtr.producer.AsutusTegevuskoht[] getTegevuskohad() {
        return tegevuskohad;
    }


    /**
     * Sets the tegevuskohad value for this AsutusDetailne.
     * 
     * @param tegevuskohad
     */
    public void setTegevuskohad(ee.x_road.mtr.producer.AsutusTegevuskoht[] tegevuskohad) {
        this.tegevuskohad = tegevuskohad;
    }


    /**
     * Gets the sidevahendid value for this AsutusDetailne.
     * 
     * @return sidevahendid
     */
    public ee.x_road.mtr.producer.Sidevahend[] getSidevahendid() {
        return sidevahendid;
    }


    /**
     * Sets the sidevahendid value for this AsutusDetailne.
     * 
     * @param sidevahendid
     */
    public void setSidevahendid(ee.x_road.mtr.producer.Sidevahend[] sidevahendid) {
        this.sidevahendid = sidevahendid;
    }


    /**
     * Gets the tagatised value for this AsutusDetailne.
     * 
     * @return tagatised
     */
    public ee.x_road.mtr.producer.Tagatis[] getTagatised() {
        return tagatised;
    }


    /**
     * Sets the tagatised value for this AsutusDetailne.
     * 
     * @param tagatised
     */
    public void setTagatised(ee.x_road.mtr.producer.Tagatis[] tagatised) {
        this.tagatised = tagatised;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AsutusDetailne)) return false;
        AsutusDetailne other = (AsutusDetailne) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tegevuskohad==null && other.getTegevuskohad()==null) || 
             (this.tegevuskohad!=null &&
              java.util.Arrays.equals(this.tegevuskohad, other.getTegevuskohad()))) &&
            ((this.sidevahendid==null && other.getSidevahendid()==null) || 
             (this.sidevahendid!=null &&
              java.util.Arrays.equals(this.sidevahendid, other.getSidevahendid()))) &&
            ((this.tagatised==null && other.getTagatised()==null) || 
             (this.tagatised!=null &&
              java.util.Arrays.equals(this.tagatised, other.getTagatised())));
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
        if (getTegevuskohad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevuskohad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevuskohad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSidevahendid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSidevahendid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSidevahendid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTagatised() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTagatised());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTagatised(), i);
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
