/**
 * ErihoolekandeteenusedTegevuskohadTegevuskoht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class ErihoolekandeteenusedTegevuskohadTegevuskoht  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String tegevuskoht;

    private java.lang.String tegevuskohaliik;

    private java.lang.String adsOid;

    private java.lang.String tegevuskohatapsustus;

    private java.lang.String tel;

    private java.lang.String email;

    private java.lang.String ehitisregistrikood;

    private java.lang.String terviseametitoend;

    private java.util.Date terviseametitoendikp;

    private java.lang.String paasteametitoend;

    private java.util.Date paasteametitoendikp;

    private ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[] kohtadearvud;

    private ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[] sihtgrupid;

    private ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja[] juhendajad;

    public ErihoolekandeteenusedTegevuskohadTegevuskoht() {
    }

    public ErihoolekandeteenusedTegevuskohadTegevuskoht(
           java.math.BigInteger id,
           java.lang.String tegevuskoht,
           java.lang.String tegevuskohaliik,
           java.lang.String adsOid,
           java.lang.String tegevuskohatapsustus,
           java.lang.String tel,
           java.lang.String email,
           java.lang.String ehitisregistrikood,
           java.lang.String terviseametitoend,
           java.util.Date terviseametitoendikp,
           java.lang.String paasteametitoend,
           java.util.Date paasteametitoendikp,
           ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[] kohtadearvud,
           ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[] sihtgrupid,
           ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja[] juhendajad) {
           this.id = id;
           this.tegevuskoht = tegevuskoht;
           this.tegevuskohaliik = tegevuskohaliik;
           this.adsOid = adsOid;
           this.tegevuskohatapsustus = tegevuskohatapsustus;
           this.tel = tel;
           this.email = email;
           this.ehitisregistrikood = ehitisregistrikood;
           this.terviseametitoend = terviseametitoend;
           this.terviseametitoendikp = terviseametitoendikp;
           this.paasteametitoend = paasteametitoend;
           this.paasteametitoendikp = paasteametitoendikp;
           this.kohtadearvud = kohtadearvud;
           this.sihtgrupid = sihtgrupid;
           this.juhendajad = juhendajad;
    }


    /**
     * Gets the id value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the tegevuskoht value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return tegevuskoht
     */
    public java.lang.String getTegevuskoht() {
        return tegevuskoht;
    }


    /**
     * Sets the tegevuskoht value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param tegevuskoht
     */
    public void setTegevuskoht(java.lang.String tegevuskoht) {
        this.tegevuskoht = tegevuskoht;
    }


    /**
     * Gets the tegevuskohaliik value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return tegevuskohaliik
     */
    public java.lang.String getTegevuskohaliik() {
        return tegevuskohaliik;
    }


    /**
     * Sets the tegevuskohaliik value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param tegevuskohaliik
     */
    public void setTegevuskohaliik(java.lang.String tegevuskohaliik) {
        this.tegevuskohaliik = tegevuskohaliik;
    }


    /**
     * Gets the adsOid value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return adsOid
     */
    public java.lang.String getAdsOid() {
        return adsOid;
    }


    /**
     * Sets the adsOid value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param adsOid
     */
    public void setAdsOid(java.lang.String adsOid) {
        this.adsOid = adsOid;
    }


    /**
     * Gets the tegevuskohatapsustus value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return tegevuskohatapsustus
     */
    public java.lang.String getTegevuskohatapsustus() {
        return tegevuskohatapsustus;
    }


    /**
     * Sets the tegevuskohatapsustus value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param tegevuskohatapsustus
     */
    public void setTegevuskohatapsustus(java.lang.String tegevuskohatapsustus) {
        this.tegevuskohatapsustus = tegevuskohatapsustus;
    }


    /**
     * Gets the tel value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return tel
     */
    public java.lang.String getTel() {
        return tel;
    }


    /**
     * Sets the tel value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param tel
     */
    public void setTel(java.lang.String tel) {
        this.tel = tel;
    }


    /**
     * Gets the email value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the ehitisregistrikood value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return ehitisregistrikood
     */
    public java.lang.String getEhitisregistrikood() {
        return ehitisregistrikood;
    }


    /**
     * Sets the ehitisregistrikood value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param ehitisregistrikood
     */
    public void setEhitisregistrikood(java.lang.String ehitisregistrikood) {
        this.ehitisregistrikood = ehitisregistrikood;
    }


    /**
     * Gets the terviseametitoend value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return terviseametitoend
     */
    public java.lang.String getTerviseametitoend() {
        return terviseametitoend;
    }


    /**
     * Sets the terviseametitoend value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param terviseametitoend
     */
    public void setTerviseametitoend(java.lang.String terviseametitoend) {
        this.terviseametitoend = terviseametitoend;
    }


    /**
     * Gets the terviseametitoendikp value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return terviseametitoendikp
     */
    public java.util.Date getTerviseametitoendikp() {
        return terviseametitoendikp;
    }


    /**
     * Sets the terviseametitoendikp value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param terviseametitoendikp
     */
    public void setTerviseametitoendikp(java.util.Date terviseametitoendikp) {
        this.terviseametitoendikp = terviseametitoendikp;
    }


    /**
     * Gets the paasteametitoend value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return paasteametitoend
     */
    public java.lang.String getPaasteametitoend() {
        return paasteametitoend;
    }


    /**
     * Sets the paasteametitoend value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param paasteametitoend
     */
    public void setPaasteametitoend(java.lang.String paasteametitoend) {
        this.paasteametitoend = paasteametitoend;
    }


    /**
     * Gets the paasteametitoendikp value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return paasteametitoendikp
     */
    public java.util.Date getPaasteametitoendikp() {
        return paasteametitoendikp;
    }


    /**
     * Sets the paasteametitoendikp value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param paasteametitoendikp
     */
    public void setPaasteametitoendikp(java.util.Date paasteametitoendikp) {
        this.paasteametitoendikp = paasteametitoendikp;
    }


    /**
     * Gets the kohtadearvud value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return kohtadearvud
     */
    public ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[] getKohtadearvud() {
        return kohtadearvud;
    }


    /**
     * Sets the kohtadearvud value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param kohtadearvud
     */
    public void setKohtadearvud(ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[] kohtadearvud) {
        this.kohtadearvud = kohtadearvud;
    }


    /**
     * Gets the sihtgrupid value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return sihtgrupid
     */
    public ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[] getSihtgrupid() {
        return sihtgrupid;
    }


    /**
     * Sets the sihtgrupid value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param sihtgrupid
     */
    public void setSihtgrupid(ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[] sihtgrupid) {
        this.sihtgrupid = sihtgrupid;
    }


    /**
     * Gets the juhendajad value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @return juhendajad
     */
    public ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja[] getJuhendajad() {
        return juhendajad;
    }


    /**
     * Sets the juhendajad value for this ErihoolekandeteenusedTegevuskohadTegevuskoht.
     * 
     * @param juhendajad
     */
    public void setJuhendajad(ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja[] juhendajad) {
        this.juhendajad = juhendajad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErihoolekandeteenusedTegevuskohadTegevuskoht)) return false;
        ErihoolekandeteenusedTegevuskohadTegevuskoht other = (ErihoolekandeteenusedTegevuskohadTegevuskoht) obj;
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
            ((this.ehitisregistrikood==null && other.getEhitisregistrikood()==null) || 
             (this.ehitisregistrikood!=null &&
              this.ehitisregistrikood.equals(other.getEhitisregistrikood()))) &&
            ((this.terviseametitoend==null && other.getTerviseametitoend()==null) || 
             (this.terviseametitoend!=null &&
              this.terviseametitoend.equals(other.getTerviseametitoend()))) &&
            ((this.terviseametitoendikp==null && other.getTerviseametitoendikp()==null) || 
             (this.terviseametitoendikp!=null &&
              this.terviseametitoendikp.equals(other.getTerviseametitoendikp()))) &&
            ((this.paasteametitoend==null && other.getPaasteametitoend()==null) || 
             (this.paasteametitoend!=null &&
              this.paasteametitoend.equals(other.getPaasteametitoend()))) &&
            ((this.paasteametitoendikp==null && other.getPaasteametitoendikp()==null) || 
             (this.paasteametitoendikp!=null &&
              this.paasteametitoendikp.equals(other.getPaasteametitoendikp()))) &&
            ((this.kohtadearvud==null && other.getKohtadearvud()==null) || 
             (this.kohtadearvud!=null &&
              java.util.Arrays.equals(this.kohtadearvud, other.getKohtadearvud()))) &&
            ((this.sihtgrupid==null && other.getSihtgrupid()==null) || 
             (this.sihtgrupid!=null &&
              java.util.Arrays.equals(this.sihtgrupid, other.getSihtgrupid()))) &&
            ((this.juhendajad==null && other.getJuhendajad()==null) || 
             (this.juhendajad!=null &&
              java.util.Arrays.equals(this.juhendajad, other.getJuhendajad())));
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
        if (getEhitisregistrikood() != null) {
            _hashCode += getEhitisregistrikood().hashCode();
        }
        if (getTerviseametitoend() != null) {
            _hashCode += getTerviseametitoend().hashCode();
        }
        if (getTerviseametitoendikp() != null) {
            _hashCode += getTerviseametitoendikp().hashCode();
        }
        if (getPaasteametitoend() != null) {
            _hashCode += getPaasteametitoend().hashCode();
        }
        if (getPaasteametitoendikp() != null) {
            _hashCode += getPaasteametitoendikp().hashCode();
        }
        if (getKohtadearvud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKohtadearvud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKohtadearvud(), i);
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
        if (getJuhendajad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJuhendajad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJuhendajad(), i);
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
