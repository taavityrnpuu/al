/**
 * VastutavaIsikuTeade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class VastutavaIsikuTeade  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String number;

    private java.lang.String ettevotjaNimi;

    private java.lang.String ettevotjaKood;

    private java.util.Date kehtivAlates;

    private java.util.Date kehtivKuni;

    private java.lang.String tegevusalaNimi;

    private java.lang.String[] tegevusalaAlaliigid;

    private java.lang.Boolean kinnitatud;

    private java.util.Calendar kinnitamiseAeg;

    private java.util.Calendar loobumiseAeg;

    private java.lang.String kinnitamiseLink;

    public VastutavaIsikuTeade() {
    }

    public VastutavaIsikuTeade(
           java.math.BigInteger id,
           java.lang.String number,
           java.lang.String ettevotjaNimi,
           java.lang.String ettevotjaKood,
           java.util.Date kehtivAlates,
           java.util.Date kehtivKuni,
           java.lang.String tegevusalaNimi,
           java.lang.String[] tegevusalaAlaliigid,
           java.lang.Boolean kinnitatud,
           java.util.Calendar kinnitamiseAeg,
           java.util.Calendar loobumiseAeg,
           java.lang.String kinnitamiseLink) {
           this.id = id;
           this.number = number;
           this.ettevotjaNimi = ettevotjaNimi;
           this.ettevotjaKood = ettevotjaKood;
           this.kehtivAlates = kehtivAlates;
           this.kehtivKuni = kehtivKuni;
           this.tegevusalaNimi = tegevusalaNimi;
           this.tegevusalaAlaliigid = tegevusalaAlaliigid;
           this.kinnitatud = kinnitatud;
           this.kinnitamiseAeg = kinnitamiseAeg;
           this.loobumiseAeg = loobumiseAeg;
           this.kinnitamiseLink = kinnitamiseLink;
    }


    /**
     * Gets the id value for this VastutavaIsikuTeade.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this VastutavaIsikuTeade.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the number value for this VastutavaIsikuTeade.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this VastutavaIsikuTeade.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the ettevotjaNimi value for this VastutavaIsikuTeade.
     * 
     * @return ettevotjaNimi
     */
    public java.lang.String getEttevotjaNimi() {
        return ettevotjaNimi;
    }


    /**
     * Sets the ettevotjaNimi value for this VastutavaIsikuTeade.
     * 
     * @param ettevotjaNimi
     */
    public void setEttevotjaNimi(java.lang.String ettevotjaNimi) {
        this.ettevotjaNimi = ettevotjaNimi;
    }


    /**
     * Gets the ettevotjaKood value for this VastutavaIsikuTeade.
     * 
     * @return ettevotjaKood
     */
    public java.lang.String getEttevotjaKood() {
        return ettevotjaKood;
    }


    /**
     * Sets the ettevotjaKood value for this VastutavaIsikuTeade.
     * 
     * @param ettevotjaKood
     */
    public void setEttevotjaKood(java.lang.String ettevotjaKood) {
        this.ettevotjaKood = ettevotjaKood;
    }


    /**
     * Gets the kehtivAlates value for this VastutavaIsikuTeade.
     * 
     * @return kehtivAlates
     */
    public java.util.Date getKehtivAlates() {
        return kehtivAlates;
    }


    /**
     * Sets the kehtivAlates value for this VastutavaIsikuTeade.
     * 
     * @param kehtivAlates
     */
    public void setKehtivAlates(java.util.Date kehtivAlates) {
        this.kehtivAlates = kehtivAlates;
    }


    /**
     * Gets the kehtivKuni value for this VastutavaIsikuTeade.
     * 
     * @return kehtivKuni
     */
    public java.util.Date getKehtivKuni() {
        return kehtivKuni;
    }


    /**
     * Sets the kehtivKuni value for this VastutavaIsikuTeade.
     * 
     * @param kehtivKuni
     */
    public void setKehtivKuni(java.util.Date kehtivKuni) {
        this.kehtivKuni = kehtivKuni;
    }


    /**
     * Gets the tegevusalaNimi value for this VastutavaIsikuTeade.
     * 
     * @return tegevusalaNimi
     */
    public java.lang.String getTegevusalaNimi() {
        return tegevusalaNimi;
    }


    /**
     * Sets the tegevusalaNimi value for this VastutavaIsikuTeade.
     * 
     * @param tegevusalaNimi
     */
    public void setTegevusalaNimi(java.lang.String tegevusalaNimi) {
        this.tegevusalaNimi = tegevusalaNimi;
    }


    /**
     * Gets the tegevusalaAlaliigid value for this VastutavaIsikuTeade.
     * 
     * @return tegevusalaAlaliigid
     */
    public java.lang.String[] getTegevusalaAlaliigid() {
        return tegevusalaAlaliigid;
    }


    /**
     * Sets the tegevusalaAlaliigid value for this VastutavaIsikuTeade.
     * 
     * @param tegevusalaAlaliigid
     */
    public void setTegevusalaAlaliigid(java.lang.String[] tegevusalaAlaliigid) {
        this.tegevusalaAlaliigid = tegevusalaAlaliigid;
    }


    /**
     * Gets the kinnitatud value for this VastutavaIsikuTeade.
     * 
     * @return kinnitatud
     */
    public java.lang.Boolean getKinnitatud() {
        return kinnitatud;
    }


    /**
     * Sets the kinnitatud value for this VastutavaIsikuTeade.
     * 
     * @param kinnitatud
     */
    public void setKinnitatud(java.lang.Boolean kinnitatud) {
        this.kinnitatud = kinnitatud;
    }


    /**
     * Gets the kinnitamiseAeg value for this VastutavaIsikuTeade.
     * 
     * @return kinnitamiseAeg
     */
    public java.util.Calendar getKinnitamiseAeg() {
        return kinnitamiseAeg;
    }


    /**
     * Sets the kinnitamiseAeg value for this VastutavaIsikuTeade.
     * 
     * @param kinnitamiseAeg
     */
    public void setKinnitamiseAeg(java.util.Calendar kinnitamiseAeg) {
        this.kinnitamiseAeg = kinnitamiseAeg;
    }


    /**
     * Gets the loobumiseAeg value for this VastutavaIsikuTeade.
     * 
     * @return loobumiseAeg
     */
    public java.util.Calendar getLoobumiseAeg() {
        return loobumiseAeg;
    }


    /**
     * Sets the loobumiseAeg value for this VastutavaIsikuTeade.
     * 
     * @param loobumiseAeg
     */
    public void setLoobumiseAeg(java.util.Calendar loobumiseAeg) {
        this.loobumiseAeg = loobumiseAeg;
    }


    /**
     * Gets the kinnitamiseLink value for this VastutavaIsikuTeade.
     * 
     * @return kinnitamiseLink
     */
    public java.lang.String getKinnitamiseLink() {
        return kinnitamiseLink;
    }


    /**
     * Sets the kinnitamiseLink value for this VastutavaIsikuTeade.
     * 
     * @param kinnitamiseLink
     */
    public void setKinnitamiseLink(java.lang.String kinnitamiseLink) {
        this.kinnitamiseLink = kinnitamiseLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VastutavaIsikuTeade)) return false;
        VastutavaIsikuTeade other = (VastutavaIsikuTeade) obj;
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
            ((this.ettevotjaNimi==null && other.getEttevotjaNimi()==null) || 
             (this.ettevotjaNimi!=null &&
              this.ettevotjaNimi.equals(other.getEttevotjaNimi()))) &&
            ((this.ettevotjaKood==null && other.getEttevotjaKood()==null) || 
             (this.ettevotjaKood!=null &&
              this.ettevotjaKood.equals(other.getEttevotjaKood()))) &&
            ((this.kehtivAlates==null && other.getKehtivAlates()==null) || 
             (this.kehtivAlates!=null &&
              this.kehtivAlates.equals(other.getKehtivAlates()))) &&
            ((this.kehtivKuni==null && other.getKehtivKuni()==null) || 
             (this.kehtivKuni!=null &&
              this.kehtivKuni.equals(other.getKehtivKuni()))) &&
            ((this.tegevusalaNimi==null && other.getTegevusalaNimi()==null) || 
             (this.tegevusalaNimi!=null &&
              this.tegevusalaNimi.equals(other.getTegevusalaNimi()))) &&
            ((this.tegevusalaAlaliigid==null && other.getTegevusalaAlaliigid()==null) || 
             (this.tegevusalaAlaliigid!=null &&
              java.util.Arrays.equals(this.tegevusalaAlaliigid, other.getTegevusalaAlaliigid()))) &&
            ((this.kinnitatud==null && other.getKinnitatud()==null) || 
             (this.kinnitatud!=null &&
              this.kinnitatud.equals(other.getKinnitatud()))) &&
            ((this.kinnitamiseAeg==null && other.getKinnitamiseAeg()==null) || 
             (this.kinnitamiseAeg!=null &&
              this.kinnitamiseAeg.equals(other.getKinnitamiseAeg()))) &&
            ((this.loobumiseAeg==null && other.getLoobumiseAeg()==null) || 
             (this.loobumiseAeg!=null &&
              this.loobumiseAeg.equals(other.getLoobumiseAeg()))) &&
            ((this.kinnitamiseLink==null && other.getKinnitamiseLink()==null) || 
             (this.kinnitamiseLink!=null &&
              this.kinnitamiseLink.equals(other.getKinnitamiseLink())));
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
        if (getEttevotjaNimi() != null) {
            _hashCode += getEttevotjaNimi().hashCode();
        }
        if (getEttevotjaKood() != null) {
            _hashCode += getEttevotjaKood().hashCode();
        }
        if (getKehtivAlates() != null) {
            _hashCode += getKehtivAlates().hashCode();
        }
        if (getKehtivKuni() != null) {
            _hashCode += getKehtivKuni().hashCode();
        }
        if (getTegevusalaNimi() != null) {
            _hashCode += getTegevusalaNimi().hashCode();
        }
        if (getTegevusalaAlaliigid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTegevusalaAlaliigid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTegevusalaAlaliigid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKinnitatud() != null) {
            _hashCode += getKinnitatud().hashCode();
        }
        if (getKinnitamiseAeg() != null) {
            _hashCode += getKinnitamiseAeg().hashCode();
        }
        if (getLoobumiseAeg() != null) {
            _hashCode += getLoobumiseAeg().hashCode();
        }
        if (getKinnitamiseLink() != null) {
            _hashCode += getKinnitamiseLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
