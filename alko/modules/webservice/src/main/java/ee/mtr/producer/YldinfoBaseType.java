/**
 * YldinfoBaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class YldinfoBaseType  implements java.io.Serializable {
    private java.lang.String nimi;

    private java.lang.String kood;

    private java.lang.String tel;

    private java.lang.String fax;

    private java.lang.String email;

    private java.lang.String web;

    private org.apache.axis.types.URI mtrlink;

    public YldinfoBaseType() {
    }

    public YldinfoBaseType(
           java.lang.String nimi,
           java.lang.String kood,
           java.lang.String tel,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String web,
           org.apache.axis.types.URI mtrlink) {
           this.nimi = nimi;
           this.kood = kood;
           this.tel = tel;
           this.fax = fax;
           this.email = email;
           this.web = web;
           this.mtrlink = mtrlink;
    }


    /**
     * Gets the nimi value for this YldinfoBaseType.
     * 
     * @return nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this YldinfoBaseType.
     * 
     * @param nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the kood value for this YldinfoBaseType.
     * 
     * @return kood
     */
    public java.lang.String getKood() {
        return kood;
    }


    /**
     * Sets the kood value for this YldinfoBaseType.
     * 
     * @param kood
     */
    public void setKood(java.lang.String kood) {
        this.kood = kood;
    }


    /**
     * Gets the tel value for this YldinfoBaseType.
     * 
     * @return tel
     */
    public java.lang.String getTel() {
        return tel;
    }


    /**
     * Sets the tel value for this YldinfoBaseType.
     * 
     * @param tel
     */
    public void setTel(java.lang.String tel) {
        this.tel = tel;
    }


    /**
     * Gets the fax value for this YldinfoBaseType.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this YldinfoBaseType.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this YldinfoBaseType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this YldinfoBaseType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the web value for this YldinfoBaseType.
     * 
     * @return web
     */
    public java.lang.String getWeb() {
        return web;
    }


    /**
     * Sets the web value for this YldinfoBaseType.
     * 
     * @param web
     */
    public void setWeb(java.lang.String web) {
        this.web = web;
    }


    /**
     * Gets the mtrlink value for this YldinfoBaseType.
     * 
     * @return mtrlink
     */
    public org.apache.axis.types.URI getMtrlink() {
        return mtrlink;
    }


    /**
     * Sets the mtrlink value for this YldinfoBaseType.
     * 
     * @param mtrlink
     */
    public void setMtrlink(org.apache.axis.types.URI mtrlink) {
        this.mtrlink = mtrlink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YldinfoBaseType)) return false;
        YldinfoBaseType other = (YldinfoBaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.kood==null && other.getKood()==null) || 
             (this.kood!=null &&
              this.kood.equals(other.getKood()))) &&
            ((this.tel==null && other.getTel()==null) || 
             (this.tel!=null &&
              this.tel.equals(other.getTel()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.web==null && other.getWeb()==null) || 
             (this.web!=null &&
              this.web.equals(other.getWeb()))) &&
            ((this.mtrlink==null && other.getMtrlink()==null) || 
             (this.mtrlink!=null &&
              this.mtrlink.equals(other.getMtrlink())));
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
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getKood() != null) {
            _hashCode += getKood().hashCode();
        }
        if (getTel() != null) {
            _hashCode += getTel().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getWeb() != null) {
            _hashCode += getWeb().hashCode();
        }
        if (getMtrlink() != null) {
            _hashCode += getMtrlink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
