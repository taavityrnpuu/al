/**
 * RegistrikanneDetailneTegevusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class RegistrikanneDetailneTegevusType  implements java.io.Serializable {
    private ee.x_road.mtr.producer.EttevotjaDetailneType ettevotja;

    private ee.x_road.mtr.producer.ValdkondType valdkond;

    private ee.x_road.mtr.producer.TegevusalaType tegevusala;

    private java.util.Date registreeritudKP;

    private ee.x_road.mtr.producer.TegevusType[] tegevused;

    private java.lang.String regNR;  // attribute

    public RegistrikanneDetailneTegevusType() {
    }

    public RegistrikanneDetailneTegevusType(
           ee.x_road.mtr.producer.EttevotjaDetailneType ettevotja,
           ee.x_road.mtr.producer.ValdkondType valdkond,
           ee.x_road.mtr.producer.TegevusalaType tegevusala,
           java.util.Date registreeritudKP,
           ee.x_road.mtr.producer.TegevusType[] tegevused,
           java.lang.String regNR) {
           this.ettevotja = ettevotja;
           this.valdkond = valdkond;
           this.tegevusala = tegevusala;
           this.registreeritudKP = registreeritudKP;
           this.tegevused = tegevused;
           this.regNR = regNR;
    }


    /**
     * Gets the ettevotja value for this RegistrikanneDetailneTegevusType.
     * 
     * @return ettevotja
     */
    public ee.x_road.mtr.producer.EttevotjaDetailneType getEttevotja() {
        return ettevotja;
    }


    /**
     * Sets the ettevotja value for this RegistrikanneDetailneTegevusType.
     * 
     * @param ettevotja
     */
    public void setEttevotja(ee.x_road.mtr.producer.EttevotjaDetailneType ettevotja) {
        this.ettevotja = ettevotja;
    }


    /**
     * Gets the valdkond value for this RegistrikanneDetailneTegevusType.
     * 
     * @return valdkond
     */
    public ee.x_road.mtr.producer.ValdkondType getValdkond() {
        return valdkond;
    }


    /**
     * Sets the valdkond value for this RegistrikanneDetailneTegevusType.
     * 
     * @param valdkond
     */
    public void setValdkond(ee.x_road.mtr.producer.ValdkondType valdkond) {
        this.valdkond = valdkond;
    }


    /**
     * Gets the tegevusala value for this RegistrikanneDetailneTegevusType.
     * 
     * @return tegevusala
     */
    public ee.x_road.mtr.producer.TegevusalaType getTegevusala() {
        return tegevusala;
    }


    /**
     * Sets the tegevusala value for this RegistrikanneDetailneTegevusType.
     * 
     * @param tegevusala
     */
    public void setTegevusala(ee.x_road.mtr.producer.TegevusalaType tegevusala) {
        this.tegevusala = tegevusala;
    }


    /**
     * Gets the registreeritudKP value for this RegistrikanneDetailneTegevusType.
     * 
     * @return registreeritudKP
     */
    public java.util.Date getRegistreeritudKP() {
        return registreeritudKP;
    }


    /**
     * Sets the registreeritudKP value for this RegistrikanneDetailneTegevusType.
     * 
     * @param registreeritudKP
     */
    public void setRegistreeritudKP(java.util.Date registreeritudKP) {
        this.registreeritudKP = registreeritudKP;
    }


    /**
     * Gets the tegevused value for this RegistrikanneDetailneTegevusType.
     * 
     * @return tegevused
     */
    public ee.x_road.mtr.producer.TegevusType[] getTegevused() {
        return tegevused;
    }


    /**
     * Sets the tegevused value for this RegistrikanneDetailneTegevusType.
     * 
     * @param tegevused
     */
    public void setTegevused(ee.x_road.mtr.producer.TegevusType[] tegevused) {
        this.tegevused = tegevused;
    }


    /**
     * Gets the regNR value for this RegistrikanneDetailneTegevusType.
     * 
     * @return regNR
     */
    public java.lang.String getRegNR() {
        return regNR;
    }


    /**
     * Sets the regNR value for this RegistrikanneDetailneTegevusType.
     * 
     * @param regNR
     */
    public void setRegNR(java.lang.String regNR) {
        this.regNR = regNR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrikanneDetailneTegevusType)) return false;
        RegistrikanneDetailneTegevusType other = (RegistrikanneDetailneTegevusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ettevotja==null && other.getEttevotja()==null) || 
             (this.ettevotja!=null &&
              this.ettevotja.equals(other.getEttevotja()))) &&
            ((this.valdkond==null && other.getValdkond()==null) || 
             (this.valdkond!=null &&
              this.valdkond.equals(other.getValdkond()))) &&
            ((this.tegevusala==null && other.getTegevusala()==null) || 
             (this.tegevusala!=null &&
              this.tegevusala.equals(other.getTegevusala()))) &&
            ((this.registreeritudKP==null && other.getRegistreeritudKP()==null) || 
             (this.registreeritudKP!=null &&
              this.registreeritudKP.equals(other.getRegistreeritudKP()))) &&
            ((this.tegevused==null && other.getTegevused()==null) || 
             (this.tegevused!=null &&
              java.util.Arrays.equals(this.tegevused, other.getTegevused()))) &&
            ((this.regNR==null && other.getRegNR()==null) || 
             (this.regNR!=null &&
              this.regNR.equals(other.getRegNR())));
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
        if (getEttevotja() != null) {
            _hashCode += getEttevotja().hashCode();
        }
        if (getValdkond() != null) {
            _hashCode += getValdkond().hashCode();
        }
        if (getTegevusala() != null) {
            _hashCode += getTegevusala().hashCode();
        }
        if (getRegistreeritudKP() != null) {
            _hashCode += getRegistreeritudKP().hashCode();
        }
        if (getTegevused() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevused());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevused(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegNR() != null) {
            _hashCode += getRegNR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
