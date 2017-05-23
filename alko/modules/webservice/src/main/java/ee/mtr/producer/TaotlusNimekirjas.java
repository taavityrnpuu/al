/**
 * TaotlusNimekirjas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class TaotlusNimekirjas  implements java.io.Serializable {
    private java.math.BigInteger ID;

    private java.util.Calendar sisestamiseAeg;

    private java.lang.String number;

    private java.util.Calendar esitamiseAeg;

    private java.util.Date menetluseTahtaeg;

    private java.lang.String tegevusala;

    private java.lang.String tulemus;

    private java.lang.String staatus;

    private java.lang.String menetleja;

    private java.lang.String vaatamiseLink;

    private java.lang.String muutmiseLink;

    public TaotlusNimekirjas() {
    }

    public TaotlusNimekirjas(
           java.math.BigInteger ID,
           java.util.Calendar sisestamiseAeg,
           java.lang.String number,
           java.util.Calendar esitamiseAeg,
           java.util.Date menetluseTahtaeg,
           java.lang.String tegevusala,
           java.lang.String tulemus,
           java.lang.String staatus,
           java.lang.String menetleja,
           java.lang.String vaatamiseLink,
           java.lang.String muutmiseLink) {
           this.ID = ID;
           this.sisestamiseAeg = sisestamiseAeg;
           this.number = number;
           this.esitamiseAeg = esitamiseAeg;
           this.menetluseTahtaeg = menetluseTahtaeg;
           this.tegevusala = tegevusala;
           this.tulemus = tulemus;
           this.staatus = staatus;
           this.menetleja = menetleja;
           this.vaatamiseLink = vaatamiseLink;
           this.muutmiseLink = muutmiseLink;
    }


    /**
     * Gets the ID value for this TaotlusNimekirjas.
     * 
     * @return ID
     */
    public java.math.BigInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this TaotlusNimekirjas.
     * 
     * @param ID
     */
    public void setID(java.math.BigInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the sisestamiseAeg value for this TaotlusNimekirjas.
     * 
     * @return sisestamiseAeg
     */
    public java.util.Calendar getSisestamiseAeg() {
        return sisestamiseAeg;
    }


    /**
     * Sets the sisestamiseAeg value for this TaotlusNimekirjas.
     * 
     * @param sisestamiseAeg
     */
    public void setSisestamiseAeg(java.util.Calendar sisestamiseAeg) {
        this.sisestamiseAeg = sisestamiseAeg;
    }


    /**
     * Gets the number value for this TaotlusNimekirjas.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TaotlusNimekirjas.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the esitamiseAeg value for this TaotlusNimekirjas.
     * 
     * @return esitamiseAeg
     */
    public java.util.Calendar getEsitamiseAeg() {
        return esitamiseAeg;
    }


    /**
     * Sets the esitamiseAeg value for this TaotlusNimekirjas.
     * 
     * @param esitamiseAeg
     */
    public void setEsitamiseAeg(java.util.Calendar esitamiseAeg) {
        this.esitamiseAeg = esitamiseAeg;
    }


    /**
     * Gets the menetluseTahtaeg value for this TaotlusNimekirjas.
     * 
     * @return menetluseTahtaeg
     */
    public java.util.Date getMenetluseTahtaeg() {
        return menetluseTahtaeg;
    }


    /**
     * Sets the menetluseTahtaeg value for this TaotlusNimekirjas.
     * 
     * @param menetluseTahtaeg
     */
    public void setMenetluseTahtaeg(java.util.Date menetluseTahtaeg) {
        this.menetluseTahtaeg = menetluseTahtaeg;
    }


    /**
     * Gets the tegevusala value for this TaotlusNimekirjas.
     * 
     * @return tegevusala
     */
    public java.lang.String getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this TaotlusNimekirjas.
     * 
     * @param tegevusala
     */
    public void setTegevusala(java.lang.String tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the tulemus value for this TaotlusNimekirjas.
     * 
     * @return tulemus
     */
    public java.lang.String getTulemus() {
        return tulemus;
    }


    /**
     * Sets the tulemus value for this TaotlusNimekirjas.
     * 
     * @param tulemus
     */
    public void setTulemus(java.lang.String tulemus) {
        this.tulemus = tulemus;
    }


    /**
     * Gets the staatus value for this TaotlusNimekirjas.
     * 
     * @return staatus
     */
    public java.lang.String getStaatus() {
        return staatus;
    }


    /**
     * Sets the staatus value for this TaotlusNimekirjas.
     * 
     * @param staatus
     */
    public void setStaatus(java.lang.String staatus) {
        this.staatus = staatus;
    }


    /**
     * Gets the menetleja value for this TaotlusNimekirjas.
     * 
     * @return menetleja
     */
    public java.lang.String getMenetleja() {
        return menetleja;
    }


    /**
     * Sets the menetleja value for this TaotlusNimekirjas.
     * 
     * @param menetleja
     */
    public void setMenetleja(java.lang.String menetleja) {
        this.menetleja = menetleja;
    }


    /**
     * Gets the vaatamiseLink value for this TaotlusNimekirjas.
     * 
     * @return vaatamiseLink
     */
    public java.lang.String getVaatamiseLink() {
        return vaatamiseLink;
    }


    /**
     * Sets the vaatamiseLink value for this TaotlusNimekirjas.
     * 
     * @param vaatamiseLink
     */
    public void setVaatamiseLink(java.lang.String vaatamiseLink) {
        this.vaatamiseLink = vaatamiseLink;
    }


    /**
     * Gets the muutmiseLink value for this TaotlusNimekirjas.
     * 
     * @return muutmiseLink
     */
    public java.lang.String getMuutmiseLink() {
        return muutmiseLink;
    }


    /**
     * Sets the muutmiseLink value for this TaotlusNimekirjas.
     * 
     * @param muutmiseLink
     */
    public void setMuutmiseLink(java.lang.String muutmiseLink) {
        this.muutmiseLink = muutmiseLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaotlusNimekirjas)) return false;
        TaotlusNimekirjas other = (TaotlusNimekirjas) obj;
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
            ((this.sisestamiseAeg==null && other.getSisestamiseAeg()==null) || 
             (this.sisestamiseAeg!=null &&
              this.sisestamiseAeg.equals(other.getSisestamiseAeg()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.esitamiseAeg==null && other.getEsitamiseAeg()==null) || 
             (this.esitamiseAeg!=null &&
              this.esitamiseAeg.equals(other.getEsitamiseAeg()))) &&
            ((this.menetluseTahtaeg==null && other.getMenetluseTahtaeg()==null) || 
             (this.menetluseTahtaeg!=null &&
              this.menetluseTahtaeg.equals(other.getMenetluseTahtaeg()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.tulemus==null && other.getTulemus()==null) || 
             (this.tulemus!=null &&
              this.tulemus.equals(other.getTulemus()))) &&
            ((this.staatus==null && other.getStaatus()==null) || 
             (this.staatus!=null &&
              this.staatus.equals(other.getStaatus()))) &&
            ((this.menetleja==null && other.getMenetleja()==null) || 
             (this.menetleja!=null &&
              this.menetleja.equals(other.getMenetleja()))) &&
            ((this.vaatamiseLink==null && other.getVaatamiseLink()==null) || 
             (this.vaatamiseLink!=null &&
              this.vaatamiseLink.equals(other.getVaatamiseLink()))) &&
            ((this.muutmiseLink==null && other.getMuutmiseLink()==null) || 
             (this.muutmiseLink!=null &&
              this.muutmiseLink.equals(other.getMuutmiseLink())));
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
        if (getSisestamiseAeg() != null) {
            _hashCode += getSisestamiseAeg().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getEsitamiseAeg() != null) {
            _hashCode += getEsitamiseAeg().hashCode();
        }
        if (getMenetluseTahtaeg() != null) {
            _hashCode += getMenetluseTahtaeg().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getTulemus() != null) {
            _hashCode += getTulemus().hashCode();
        }
        if (getStaatus() != null) {
            _hashCode += getStaatus().hashCode();
        }
        if (getMenetleja() != null) {
            _hashCode += getMenetleja().hashCode();
        }
        if (getVaatamiseLink() != null) {
            _hashCode += getVaatamiseLink().hashCode();
        }
        if (getMuutmiseLink() != null) {
            _hashCode += getMuutmiseLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
