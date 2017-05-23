/**
 * Detailandmed_v5_ettevotja.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Detailandmed_v5_ettevotja  implements java.io.Serializable {
    private java.math.BigInteger ariregistri_kood;

    private java.math.BigInteger ettevotja_id;

    private java.lang.String nimi;

    private eu.x_road.arireg.producer.Detailandmed_v5_yldandmed yldandmed;

    private eu.x_road.arireg.producer.Detailandmed_v5_isikuandmed isikuandmed;

    private eu.x_road.arireg.producer.Detailandmed_v5_kommertspant[] kommertspandiandmed;

    private eu.x_road.arireg.producer.Detailandmed_v5_dokument[] menetluses_avaldused;

    private eu.x_road.arireg.producer.Detailandmed_v5_maarus[] maarused;

    private eu.x_road.arireg.producer.Detailandmed_v5_registrikaart[] registrikaardid;

    public Detailandmed_v5_ettevotja() {
    }

    public Detailandmed_v5_ettevotja(
           java.math.BigInteger ariregistri_kood,
           java.math.BigInteger ettevotja_id,
           java.lang.String nimi,
           eu.x_road.arireg.producer.Detailandmed_v5_yldandmed yldandmed,
           eu.x_road.arireg.producer.Detailandmed_v5_isikuandmed isikuandmed,
           eu.x_road.arireg.producer.Detailandmed_v5_kommertspant[] kommertspandiandmed,
           eu.x_road.arireg.producer.Detailandmed_v5_dokument[] menetluses_avaldused,
           eu.x_road.arireg.producer.Detailandmed_v5_maarus[] maarused,
           eu.x_road.arireg.producer.Detailandmed_v5_registrikaart[] registrikaardid) {
           this.ariregistri_kood = ariregistri_kood;
           this.ettevotja_id = ettevotja_id;
           this.nimi = nimi;
           this.yldandmed = yldandmed;
           this.isikuandmed = isikuandmed;
           this.kommertspandiandmed = kommertspandiandmed;
           this.menetluses_avaldused = menetluses_avaldused;
           this.maarused = maarused;
           this.registrikaardid = registrikaardid;
    }


    /**
     * Gets the ariregistri_kood value for this Detailandmed_v5_ettevotja.
     * 
     * @return ariregistri_kood
     */
    public java.math.BigInteger getAriregistri_kood() {
        return ariregistri_kood;
    }


    /**
     * Sets the ariregistri_kood value for this Detailandmed_v5_ettevotja.
     * 
     * @param ariregistri_kood
     */
    public void setAriregistri_kood(java.math.BigInteger ariregistri_kood) {
        this.ariregistri_kood = ariregistri_kood;
    }


    /**
     * Gets the ettevotja_id value for this Detailandmed_v5_ettevotja.
     * 
     * @return ettevotja_id
     */
    public java.math.BigInteger getEttevotja_id() {
        return ettevotja_id;
    }


    /**
     * Sets the ettevotja_id value for this Detailandmed_v5_ettevotja.
     * 
     * @param ettevotja_id
     */
    public void setEttevotja_id(java.math.BigInteger ettevotja_id) {
        this.ettevotja_id = ettevotja_id;
    }


    /**
     * Gets the nimi value for this Detailandmed_v5_ettevotja.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this Detailandmed_v5_ettevotja.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the yldandmed value for this Detailandmed_v5_ettevotja.
     * 
     * @return yldandmed
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_yldandmed getYldandmed() {
        return yldandmed;
    }


    /**
     * Sets the yldandmed value for this Detailandmed_v5_ettevotja.
     * 
     * @param yldandmed
     */
    public void setYldandmed(eu.x_road.arireg.producer.Detailandmed_v5_yldandmed yldandmed) {
        this.yldandmed = yldandmed;
    }


    /**
     * Gets the isikuandmed value for this Detailandmed_v5_ettevotja.
     * 
     * @return isikuandmed
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_isikuandmed getIsikuandmed() {
        return isikuandmed;
    }


    /**
     * Sets the isikuandmed value for this Detailandmed_v5_ettevotja.
     * 
     * @param isikuandmed
     */
    public void setIsikuandmed(eu.x_road.arireg.producer.Detailandmed_v5_isikuandmed isikuandmed) {
        this.isikuandmed = isikuandmed;
    }


    /**
     * Gets the kommertspandiandmed value for this Detailandmed_v5_ettevotja.
     * 
     * @return kommertspandiandmed
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_kommertspant[] getKommertspandiandmed() {
        return kommertspandiandmed;
    }


    /**
     * Sets the kommertspandiandmed value for this Detailandmed_v5_ettevotja.
     * 
     * @param kommertspandiandmed
     */
    public void setKommertspandiandmed(eu.x_road.arireg.producer.Detailandmed_v5_kommertspant[] kommertspandiandmed) {
        this.kommertspandiandmed = kommertspandiandmed;
    }


    /**
     * Gets the menetluses_avaldused value for this Detailandmed_v5_ettevotja.
     * 
     * @return menetluses_avaldused
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_dokument[] getMenetluses_avaldused() {
        return menetluses_avaldused;
    }


    /**
     * Sets the menetluses_avaldused value for this Detailandmed_v5_ettevotja.
     * 
     * @param menetluses_avaldused
     */
    public void setMenetluses_avaldused(eu.x_road.arireg.producer.Detailandmed_v5_dokument[] menetluses_avaldused) {
        this.menetluses_avaldused = menetluses_avaldused;
    }


    /**
     * Gets the maarused value for this Detailandmed_v5_ettevotja.
     * 
     * @return maarused
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_maarus[] getMaarused() {
        return maarused;
    }


    /**
     * Sets the maarused value for this Detailandmed_v5_ettevotja.
     * 
     * @param maarused
     */
    public void setMaarused(eu.x_road.arireg.producer.Detailandmed_v5_maarus[] maarused) {
        this.maarused = maarused;
    }


    /**
     * Gets the registrikaardid value for this Detailandmed_v5_ettevotja.
     * 
     * @return registrikaardid
     */
    public eu.x_road.arireg.producer.Detailandmed_v5_registrikaart[] getRegistrikaardid() {
        return registrikaardid;
    }


    /**
     * Sets the registrikaardid value for this Detailandmed_v5_ettevotja.
     * 
     * @param registrikaardid
     */
    public void setRegistrikaardid(eu.x_road.arireg.producer.Detailandmed_v5_registrikaart[] registrikaardid) {
        this.registrikaardid = registrikaardid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Detailandmed_v5_ettevotja)) return false;
        Detailandmed_v5_ettevotja other = (Detailandmed_v5_ettevotja) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
            ((this.ettevotja_id==null && other.getEttevotja_id()==null) || 
             (this.ettevotja_id!=null &&
              this.ettevotja_id.equals(other.getEttevotja_id()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.yldandmed==null && other.getYldandmed()==null) || 
             (this.yldandmed!=null &&
              this.yldandmed.equals(other.getYldandmed()))) &&
            ((this.isikuandmed==null && other.getIsikuandmed()==null) || 
             (this.isikuandmed!=null &&
              this.isikuandmed.equals(other.getIsikuandmed()))) &&
            ((this.kommertspandiandmed==null && other.getKommertspandiandmed()==null) || 
             (this.kommertspandiandmed!=null &&
              java.util.Arrays.equals(this.kommertspandiandmed, other.getKommertspandiandmed()))) &&
            ((this.menetluses_avaldused==null && other.getMenetluses_avaldused()==null) || 
             (this.menetluses_avaldused!=null &&
              java.util.Arrays.equals(this.menetluses_avaldused, other.getMenetluses_avaldused()))) &&
            ((this.maarused==null && other.getMaarused()==null) || 
             (this.maarused!=null &&
              java.util.Arrays.equals(this.maarused, other.getMaarused()))) &&
            ((this.registrikaardid==null && other.getRegistrikaardid()==null) || 
             (this.registrikaardid!=null &&
              java.util.Arrays.equals(this.registrikaardid, other.getRegistrikaardid())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getEttevotja_id() != null) {
            _hashCode += getEttevotja_id().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getYldandmed() != null) {
            _hashCode += getYldandmed().hashCode();
        }
        if (getIsikuandmed() != null) {
            _hashCode += getIsikuandmed().hashCode();
        }
        if (getKommertspandiandmed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKommertspandiandmed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKommertspandiandmed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMenetluses_avaldused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMenetluses_avaldused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMenetluses_avaldused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaarused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaarused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaarused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegistrikaardid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrikaardid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrikaardid(), i);
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
