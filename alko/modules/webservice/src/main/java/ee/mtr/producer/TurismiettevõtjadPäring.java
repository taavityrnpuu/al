/**
 * TurismiettevõtjadPäring.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TurismiettevõtjadPäring  implements java.io.Serializable {
    private int alatesKirjest;

    private int kirjeKaupa;

    public TurismiettevõtjadPäring() {
    }

    public TurismiettevõtjadPäring(
           int alatesKirjest,
           int kirjeKaupa) {
           this.alatesKirjest = alatesKirjest;
           this.kirjeKaupa = kirjeKaupa;
    }


    /**
     * Gets the alatesKirjest value for this TurismiettevõtjadPäring.
     * 
     * @return alatesKirjest
     */
    public int getAlatesKirjest() {
        return alatesKirjest;
    }


    /**
     * Sets the alatesKirjest value for this TurismiettevõtjadPäring.
     * 
     * @param alatesKirjest
     */
    public void setAlatesKirjest(int alatesKirjest) {
        this.alatesKirjest = alatesKirjest;
    }


    /**
     * Gets the kirjeKaupa value for this TurismiettevõtjadPäring.
     * 
     * @return kirjeKaupa
     */
    public int getKirjeKaupa() {
        return kirjeKaupa;
    }


    /**
     * Sets the kirjeKaupa value for this TurismiettevõtjadPäring.
     * 
     * @param kirjeKaupa
     */
    public void setKirjeKaupa(int kirjeKaupa) {
        this.kirjeKaupa = kirjeKaupa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TurismiettevõtjadPäring)) return false;
        TurismiettevõtjadPäring other = (TurismiettevõtjadPäring) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.alatesKirjest == other.getAlatesKirjest() &&
            this.kirjeKaupa == other.getKirjeKaupa();
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
        _hashCode += getAlatesKirjest();
        _hashCode += getKirjeKaupa();
        __hashCodeCalc = false;
        return _hashCode;
    }

}
