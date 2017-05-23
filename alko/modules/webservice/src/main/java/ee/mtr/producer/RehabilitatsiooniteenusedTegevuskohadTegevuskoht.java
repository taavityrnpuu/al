/**
 * RehabilitatsiooniteenusedTegevuskohadTegevuskoht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RehabilitatsiooniteenusedTegevuskohadTegevuskoht  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String tegevuskoht;

    private java.lang.String tegevuskohaliik;

    private java.lang.String adsOid;

    private java.lang.String tegevuskohatapsustus;

    private java.lang.String tel;

    private java.lang.String email;

    private ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtMeeskondLiige[] meeskond;

    private ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus[] teenused;

    private ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[] sihtgrupid;

    public RehabilitatsiooniteenusedTegevuskohadTegevuskoht() {
    }

    public RehabilitatsiooniteenusedTegevuskohadTegevuskoht(
           java.math.BigInteger id,
           java.lang.String tegevuskoht,
           java.lang.String tegevuskohaliik,
           java.lang.String adsOid,
           java.lang.String tegevuskohatapsustus,
           java.lang.String tel,
           java.lang.String email,
           ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtMeeskondLiige[] meeskond,
           ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus[] teenused,
           ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[] sihtgrupid) {
           this.id = id;
           this.tegevuskoht = tegevuskoht;
           this.tegevuskohaliik = tegevuskohaliik;
           this.adsOid = adsOid;
           this.tegevuskohatapsustus = tegevuskohatapsustus;
           this.tel = tel;
           this.email = email;
           this.meeskond = meeskond;
           this.teenused = teenused;
           this.sihtgrupid = sihtgrupid;
    }


    /**
     * Gets the id value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the tegevuskoht value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return tegevuskoht
     */
    public java.lang.String getTegevuskoht() {
        return tegevuskoht;
    }


    /**
     * Sets the tegevuskoht value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param tegevuskoht
     */
    public void setTegevuskoht(java.lang.String tegevuskoht) {
        this.tegevuskoht = tegevuskoht;
    }


    /**
     * Gets the tegevuskohaliik value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return tegevuskohaliik
     */
    public java.lang.String getTegevuskohaliik() {
        return tegevuskohaliik;
    }


    /**
     * Sets the tegevuskohaliik value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param tegevuskohaliik
     */
    public void setTegevuskohaliik(java.lang.String tegevuskohaliik) {
        this.tegevuskohaliik = tegevuskohaliik;
    }


    /**
     * Gets the adsOid value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return adsOid
     */
    public java.lang.String getAdsOid() {
        return adsOid;
    }


    /**
     * Sets the adsOid value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param adsOid
     */
    public void setAdsOid(java.lang.String adsOid) {
        this.adsOid = adsOid;
    }


    /**
     * Gets the tegevuskohatapsustus value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return tegevuskohatapsustus
     */
    public java.lang.String getTegevuskohatapsustus() {
        return tegevuskohatapsustus;
    }


    /**
     * Sets the tegevuskohatapsustus value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param tegevuskohatapsustus
     */
    public void setTegevuskohatapsustus(java.lang.String tegevuskohatapsustus) {
        this.tegevuskohatapsustus = tegevuskohatapsustus;
    }


    /**
     * Gets the tel value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return tel
     */
    public java.lang.String getTel() {
        return tel;
    }


    /**
     * Sets the tel value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param tel
     */
    public void setTel(java.lang.String tel) {
        this.tel = tel;
    }


    /**
     * Gets the email value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the meeskond value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return meeskond
     */
    public ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtMeeskondLiige[] getMeeskond() {
        return meeskond;
    }


    /**
     * Sets the meeskond value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param meeskond
     */
    public void setMeeskond(ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtMeeskondLiige[] meeskond) {
        this.meeskond = meeskond;
    }


    /**
     * Gets the teenused value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return teenused
     */
    public ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus[] getTeenused() {
        return teenused;
    }


    /**
     * Sets the teenused value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param teenused
     */
    public void setTeenused(ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus[] teenused) {
        this.teenused = teenused;
    }


    /**
     * Gets the sihtgrupid value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @return sihtgrupid
     */
    public ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[] getSihtgrupid() {
        return sihtgrupid;
    }


    /**
     * Sets the sihtgrupid value for this RehabilitatsiooniteenusedTegevuskohadTegevuskoht.
     * 
     * @param sihtgrupid
     */
    public void setSihtgrupid(ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[] sihtgrupid) {
        this.sihtgrupid = sihtgrupid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RehabilitatsiooniteenusedTegevuskohadTegevuskoht)) return false;
        RehabilitatsiooniteenusedTegevuskohadTegevuskoht other = (RehabilitatsiooniteenusedTegevuskohadTegevuskoht) obj;
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
            ((this.tegevuskoht==null && other.getTegevuskoht()==null) || 
             (this.tegevuskoht!=null &&
              this.tegevuskoht.equals(other.getTegevuskoht()))) &&
            ((this.tegevuskohaliik==null && other.getTegevuskohaliik()==null) || 
             (this.tegevuskohaliik!=null &&
              this.tegevuskohaliik.equals(other.getTegevuskohaliik()))) &&
            ((this.adsOid==null && other.getAdsOid()==null) || 
             (this.adsOid!=null &&
              this.adsOid.equals(other.getAdsOid()))) &&
            ((this.tegevuskohatapsustus==null && other.getTegevuskohatapsustus()==null) || 
             (this.tegevuskohatapsustus!=null &&
              this.tegevuskohatapsustus.equals(other.getTegevuskohatapsustus()))) &&
            ((this.tel==null && other.getTel()==null) || 
             (this.tel!=null &&
              this.tel.equals(other.getTel()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.meeskond==null && other.getMeeskond()==null) || 
             (this.meeskond!=null &&
              java.util.Arrays.equals(this.meeskond, other.getMeeskond()))) &&
            ((this.teenused==null && other.getTeenused()==null) || 
             (this.teenused!=null &&
              java.util.Arrays.equals(this.teenused, other.getTeenused()))) &&
            ((this.sihtgrupid==null && other.getSihtgrupid()==null) || 
             (this.sihtgrupid!=null &&
              java.util.Arrays.equals(this.sihtgrupid, other.getSihtgrupid())));
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
        if (getTegevuskoht() != null) {
            _hashCode += getTegevuskoht().hashCode();
        }
        if (getTegevuskohaliik() != null) {
            _hashCode += getTegevuskohaliik().hashCode();
        }
        if (getAdsOid() != null) {
            _hashCode += getAdsOid().hashCode();
        }
        if (getTegevuskohatapsustus() != null) {
            _hashCode += getTegevuskohatapsustus().hashCode();
        }
        if (getTel() != null) {
            _hashCode += getTel().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getMeeskond() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMeeskond());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMeeskond(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTeenused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeenused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeenused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSihtgrupid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSihtgrupid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSihtgrupid(), i);
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
