/**
 * Majandustegevus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Majandustegevus  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String number;

    private java.lang.String[] emtak;

    private java.util.Date alates;

    private java.util.Date kuni;

    private java.lang.String liik;

    private java.lang.String valdkond;

    private java.lang.String tegevusala;

    private java.lang.String lisainfo;

    private java.lang.String url;

    public Majandustegevus() {
    }

    public Majandustegevus(
           java.lang.String id,
           java.lang.String number,
           java.lang.String[] emtak,
           java.util.Date alates,
           java.util.Date kuni,
           java.lang.String liik,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String lisainfo,
           java.lang.String url) {
           this.id = id;
           this.number = number;
           this.emtak = emtak;
           this.alates = alates;
           this.kuni = kuni;
           this.liik = liik;
           this.valdkond = valdkond;
           this.tegevusala = tegevusala;
           this.lisainfo = lisainfo;
           this.url = url;
    }


    /**
     * Gets the id value for this Majandustegevus.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Majandustegevus.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the number value for this Majandustegevus.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Majandustegevus.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the emtak value for this Majandustegevus.
     * 
     * @return emtak
     */
    public java.lang.String[] getEmtak() {
        return emtak;
    }


    /**
     * Sets the emtak value for this Majandustegevus.
     * 
     * @param emtak
     */
    public void setEmtak(java.lang.String[] emtak) {
        this.emtak = emtak;
    }

    public java.lang.String getEmtak(int i) {
        return this.emtak[i];
    }

    public void setEmtak(int i, java.lang.String _value) {
        this.emtak[i] = _value;
    }


    /**
     * Gets the alates value for this Majandustegevus.
     * 
     * @return alates
     */
    public java.util.Date getAlates() {
        return alates;
    }


    /**
     * Sets the alates value for this Majandustegevus.
     * 
     * @param alates
     */
    public void setAlates(java.util.Date alates) {
        this.alates = alates;
    }


    /**
     * Gets the kuni value for this Majandustegevus.
     * 
     * @return kuni
     */
    public java.util.Date getKuni() {
        return kuni;
    }


    /**
     * Sets the kuni value for this Majandustegevus.
     * 
     * @param kuni
     */
    public void setKuni(java.util.Date kuni) {
        this.kuni = kuni;
    }


    /**
     * Gets the liik value for this Majandustegevus.
     * 
     * @return liik
     */
    public java.lang.String getLiik() {
        return liik;
    }


    /**
     * Sets the liik value for this Majandustegevus.
     * 
     * @param liik
     */
    public void setLiik(java.lang.String liik) {
        this.liik = liik;
    }


    /**
     * Gets the valdkond value for this Majandustegevus.
     * 
     * @return valdkond
     */
    public java.lang.String getValdkond() {
        return valdkond;
    }


    /**
     * Sets the valdkond value for this Majandustegevus.
     * 
     * @param valdkond
     */
    public void setValdkond(java.lang.String valdkond) {
        this.valdkond = valdkond;
    }


    /**
     * Gets the tegevusala value for this Majandustegevus.
     * 
     * @return tegevusala
     */
    public java.lang.String getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this Majandustegevus.
     * 
     * @param tegevusala
     */
    public void setTegevusala(java.lang.String tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the lisainfo value for this Majandustegevus.
     * 
     * @return lisainfo
     */
    public java.lang.String getLisainfo() {
        return lisainfo;
    }


    /**
     * Sets the lisainfo value for this Majandustegevus.
     * 
     * @param lisainfo
     */
    public void setLisainfo(java.lang.String lisainfo) {
        this.lisainfo = lisainfo;
    }


    /**
     * Gets the url value for this Majandustegevus.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Majandustegevus.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Majandustegevus)) return false;
        Majandustegevus other = (Majandustegevus) obj;
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
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.emtak==null && other.getEmtak()==null) || 
             (this.emtak!=null &&
              java.util.Arrays.equals(this.emtak, other.getEmtak()))) &&
            ((this.alates==null && other.getAlates()==null) || 
             (this.alates!=null &&
              this.alates.equals(other.getAlates()))) &&
            ((this.kuni==null && other.getKuni()==null) || 
             (this.kuni!=null &&
              this.kuni.equals(other.getKuni()))) &&
            ((this.liik==null && other.getLiik()==null) || 
             (this.liik!=null &&
              this.liik.equals(other.getLiik()))) &&
            ((this.valdkond==null && other.getValdkond()==null) || 
             (this.valdkond!=null &&
              this.valdkond.equals(other.getValdkond()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.lisainfo==null && other.getLisainfo()==null) || 
             (this.lisainfo!=null &&
              this.lisainfo.equals(other.getLisainfo()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getEmtak() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmtak());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmtak(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlates() != null) {
            _hashCode += getAlates().hashCode();
        }
        if (getKuni() != null) {
            _hashCode += getKuni().hashCode();
        }
        if (getLiik() != null) {
            _hashCode += getLiik().hashCode();
        }
        if (getValdkond() != null) {
            _hashCode += getValdkond().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getLisainfo() != null) {
            _hashCode += getLisainfo().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
