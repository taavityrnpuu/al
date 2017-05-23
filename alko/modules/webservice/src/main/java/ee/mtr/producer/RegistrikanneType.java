/**
 * RegistrikanneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistrikanneType  implements java.io.Serializable {
    private java.lang.String tyyp;

    private java.lang.String regnr;

    private java.lang.String valdkond;

    private java.lang.String tegevusala;

    private java.lang.String tegevusalakood;

    private java.util.Date registreerimisekp;

    private org.apache.axis.types.URI mtrlink;

    public RegistrikanneType() {
    }

    public RegistrikanneType(
           java.lang.String tyyp,
           java.lang.String regnr,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String tegevusalakood,
           java.util.Date registreerimisekp,
           org.apache.axis.types.URI mtrlink) {
           this.tyyp = tyyp;
           this.regnr = regnr;
           this.valdkond = valdkond;
           this.tegevusala = tegevusala;
           this.tegevusalakood = tegevusalakood;
           this.registreerimisekp = registreerimisekp;
           this.mtrlink = mtrlink;
    }


    /**
     * Gets the tyyp value for this RegistrikanneType.
     * 
     * @return tyyp
     */
    public java.lang.String getTyyp() {
        return tyyp;
    }


    /**
     * Sets the tyyp value for this RegistrikanneType.
     * 
     * @param tyyp
     */
    public void setTyyp(java.lang.String tyyp) {
        this.tyyp = tyyp;
    }


    /**
     * Gets the regnr value for this RegistrikanneType.
     * 
     * @return regnr
     */
    public java.lang.String getRegnr() {
        return regnr;
    }


    /**
     * Sets the regnr value for this RegistrikanneType.
     * 
     * @param regnr
     */
    public void setRegnr(java.lang.String regnr) {
        this.regnr = regnr;
    }


    /**
     * Gets the valdkond value for this RegistrikanneType.
     * 
     * @return valdkond
     */
    public java.lang.String getValdkond() {
        return valdkond;
    }


    /**
     * Sets the valdkond value for this RegistrikanneType.
     * 
     * @param valdkond
     */
    public void setValdkond(java.lang.String valdkond) {
        this.valdkond = valdkond;
    }


    /**
     * Gets the tegevusala value for this RegistrikanneType.
     * 
     * @return tegevusala
     */
    public java.lang.String getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this RegistrikanneType.
     * 
     * @param tegevusala
     */
    public void setTegevusala(java.lang.String tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the tegevusalakood value for this RegistrikanneType.
     * 
     * @return tegevusalakood
     */
    public java.lang.String getTegevusalakood() {
        return tegevusalakood;
    }


    /**
     * Sets the tegevusalakood value for this RegistrikanneType.
     * 
     * @param tegevusalakood
     */
    public void setTegevusalakood(java.lang.String tegevusalakood) {
        this.tegevusalakood = tegevusalakood;
    }


    /**
     * Gets the registreerimisekp value for this RegistrikanneType.
     * 
     * @return registreerimisekp
     */
    public java.util.Date getRegistreerimisekp() {
        return registreerimisekp;
    }


    /**
     * Sets the registreerimisekp value for this RegistrikanneType.
     * 
     * @param registreerimisekp
     */
    public void setRegistreerimisekp(java.util.Date registreerimisekp) {
        this.registreerimisekp = registreerimisekp;
    }


    /**
     * Gets the mtrlink value for this RegistrikanneType.
     * 
     * @return mtrlink
     */
    public org.apache.axis.types.URI getMtrlink() {
        return mtrlink;
    }


    /**
     * Sets the mtrlink value for this RegistrikanneType.
     * 
     * @param mtrlink
     */
    public void setMtrlink(org.apache.axis.types.URI mtrlink) {
        this.mtrlink = mtrlink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrikanneType)) return false;
        RegistrikanneType other = (RegistrikanneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tyyp==null && other.getTyyp()==null) || 
             (this.tyyp!=null &&
              this.tyyp.equals(other.getTyyp()))) &&
            ((this.regnr==null && other.getRegnr()==null) || 
             (this.regnr!=null &&
              this.regnr.equals(other.getRegnr()))) &&
            ((this.valdkond==null && other.getValdkond()==null) || 
             (this.valdkond!=null &&
              this.valdkond.equals(other.getValdkond()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.tegevusalakood==null && other.getTegevusalakood()==null) || 
             (this.tegevusalakood!=null &&
              this.tegevusalakood.equals(other.getTegevusalakood()))) &&
            ((this.registreerimisekp==null && other.getRegistreerimisekp()==null) || 
             (this.registreerimisekp!=null &&
              this.registreerimisekp.equals(other.getRegistreerimisekp()))) &&
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
        if (getTyyp() != null) {
            _hashCode += getTyyp().hashCode();
        }
        if (getRegnr() != null) {
            _hashCode += getRegnr().hashCode();
        }
        if (getValdkond() != null) {
            _hashCode += getValdkond().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getTegevusalakood() != null) {
            _hashCode += getTegevusalakood().hashCode();
        }
        if (getRegistreerimisekp() != null) {
            _hashCode += getRegistreerimisekp().hashCode();
        }
        if (getMtrlink() != null) {
            _hashCode += getMtrlink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
