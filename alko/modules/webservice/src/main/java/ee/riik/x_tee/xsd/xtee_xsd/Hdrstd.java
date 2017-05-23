/**
 * Hdrstd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.x_tee.xsd.xtee_xsd;

public class Hdrstd  implements java.io.Serializable {
    /* Asutuse lühinimi */
    private java.lang.String asutus;

    /* Andmekogu lühinimi */
    private java.lang.String andmekogu;

    /* Riigi kahetäheline kood ja päringu sooritaja isikukood */
    private java.lang.String isikukood;

    /* Päringu nonss */
    private java.lang.String id;

    /* Päringu nimi */
    private java.lang.String nimi;

    /* Toimik */
    private java.lang.String toimik;
    
    /* Amet */
    private java.lang.String amet;
    
    /* Ametniku nimi*/
    private java.lang.String ametniknimi;
    
    public Hdrstd() {
    }

    public Hdrstd(
           java.lang.String asutus,
           java.lang.String andmekogu,
           java.lang.String isikukood,
           java.lang.String id,
           java.lang.String nimi,
           java.lang.String toimik,
           java.lang.String amet,
           java.lang.String ametniknimi) {
           this.asutus = asutus;
           this.andmekogu = andmekogu;
           this.isikukood = isikukood;
           this.id = id;
           this.nimi = nimi;
           this.toimik = toimik;
           this.amet = amet;
           this.ametniknimi = ametniknimi;
    }


    /**
     * Gets the asutus value for this Hdrstd.
     * 
     * @return asutus   * Asutuse lühinimi
     */
    public java.lang.String getAsutus() {
        return asutus;
    }


    /**
     * Sets the asutus value for this Hdrstd.
     * 
     * @param asutus   * Asutuse lühinimi
     */
    public void setAsutus(java.lang.String asutus) {
        this.asutus = asutus;
    }


    /**
     * Gets the andmekogu value for this Hdrstd.
     * 
     * @return andmekogu   * Andmekogu lühinimi
     */
    public java.lang.String getAndmekogu() {
        return andmekogu;
    }


    /**
     * Sets the andmekogu value for this Hdrstd.
     * 
     * @param andmekogu   * Andmekogu lühinimi
     */
    public void setAndmekogu(java.lang.String andmekogu) {
        this.andmekogu = andmekogu;
    }


    /**
     * Gets the isikukood value for this Hdrstd.
     * 
     * @return isikukood   * Riigi kahetäheline kood ja päringu sooritaja isikukood
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }


    /**
     * Sets the isikukood value for this Hdrstd.
     * 
     * @param isikukood   * Riigi kahetäheline kood ja päringu sooritaja isikukood
     */
    public void setIsikukood(java.lang.String isikukood) {
        this.isikukood = isikukood;
    }


    /**
     * Gets the id value for this Hdrstd.
     * 
     * @return id   * Päringu nonss
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Hdrstd.
     * 
     * @param id   * Päringu nonss
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the nimi value for this Hdrstd.
     * 
     * @return nimi   * Päringu nimi
     */
    public java.lang.String getNimi() {
        return nimi;
    }


    /**
     * Sets the nimi value for this Hdrstd.
     * 
     * @param nimi   * Päringu nimi
     */
    public void setNimi(java.lang.String nimi) {
        this.nimi = nimi;
    }


    /**
     * Gets the toimik value for this Hdrstd.
     * 
     * @return toimik   * Toimik
     */
    public java.lang.String getToimik() {
        return toimik;
    }


    /**
     * Sets the toimik value for this Hdrstd.
     * 
     * @param toimik   * Toimik
     */
    public void setToimik(java.lang.String toimik) {
        this.toimik = toimik;
    }
    
    public java.lang.String getAmet() {
		return amet;
	}

	public void setAmet(java.lang.String amet) {
		this.amet = amet;
	}

	public java.lang.String getAmetniknimi() {
		return ametniknimi;
	}

	public void setAmetniknimi(java.lang.String ametniknimi) {
		this.ametniknimi = ametniknimi;
	}
    
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hdrstd)) return false;
        Hdrstd other = (Hdrstd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asutus==null && other.getAsutus()==null) || 
             (this.asutus!=null &&
              this.asutus.equals(other.getAsutus()))) &&
            ((this.andmekogu==null && other.getAndmekogu()==null) || 
             (this.andmekogu!=null &&
              this.andmekogu.equals(other.getAndmekogu()))) &&
            ((this.isikukood==null && other.getIsikukood()==null) || 
             (this.isikukood!=null &&
              this.isikukood.equals(other.getIsikukood()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nimi==null && other.getNimi()==null) || 
             (this.nimi!=null &&
              this.nimi.equals(other.getNimi()))) &&
            ((this.amet==null && other.getAmet()==null) || 
             (this.amet!=null &&
              this.amet.equals(other.getAmet()))) &&
            ((this.ametniknimi==null && other.getAmetniknimi()==null) || 
             (this.ametniknimi!=null &&
             this.ametniknimi.equals(other.getAmetniknimi()))) &&
            ((this.toimik==null && other.getToimik()==null) || 
             (this.toimik!=null &&
              this.toimik.equals(other.getToimik())));
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
        if (getAsutus() != null) {
            _hashCode += getAsutus().hashCode();
        }
        if (getAndmekogu() != null) {
            _hashCode += getAndmekogu().hashCode();
        }
        if (getIsikukood() != null) {
            _hashCode += getIsikukood().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNimi() != null) {
            _hashCode += getNimi().hashCode();
        }
        if (getToimik() != null) {
            _hashCode += getToimik().hashCode();
        }
        if( getAmet() != null)
        {
        	_hashCode += getAmet().hashCode();
        }
        if(getAmetniknimi() != null)
        {
        	_hashCode += getAmetniknimi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Hdrstd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "hdrstd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asutus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asutus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("andmekogu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "andmekogu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isikukood");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isikukood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nimi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toimik");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toimik"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ametniknimi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ametniknimi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
