package ee.riik.xtee.arireg.producers.producer.arireg;

public class Paringliht_v4_paring_koodiga extends Paringliht_v4_paring {
	
	private java.math.BigInteger ariregistri_kood;

	public Paringliht_v4_paring_koodiga(
            java.math.BigInteger ariregistri_kood,
            java.math.BigInteger evarv,
            java.lang.String keel) {
            setAriregistri_kood(ariregistri_kood);
            setEvarv(evarv);
            setKeel(keel);
     }
	
	private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paringliht_v4_paring_koodiga)) return false;
        Paringliht_v4_paring_koodiga other = (Paringliht_v4_paring_koodiga) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ariregistri_kood==null && other.getAriregistri_kood()==null) || 
             (this.ariregistri_kood!=null &&
              this.ariregistri_kood.equals(other.getAriregistri_kood()))) &&
              ((getEvarv()==null && other.getEvarv()==null) || 
     	             (getEvarv()!=null &&
     	            getEvarv().equals(other.getEvarv()))) &&
     	            ((getKeel()==null && other.getKeel()==null) || 
     	             (getKeel()!=null &&
     	            		 getKeel().equals(other.getKeel())));
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
        if (getAriregistri_kood() != null) {
            _hashCode += getAriregistri_kood().hashCode();
        }
        if (getEvarv() != null) {
            _hashCode += getEvarv().hashCode();
        }
        if (getKeel() != null) {
            _hashCode += getKeel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paringliht_v4_paring_koodiga.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.arireg.xtee.riik.ee/producer/arireg", "paringliht_v4_paring"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ariregistri_kood");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ariregistri_kood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evarv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evarv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }
	
	public java.math.BigInteger getAriregistri_kood() {
		return ariregistri_kood;
	}

	public void setAriregistri_kood(java.math.BigInteger ariregistri_kood) {
		this.ariregistri_kood = ariregistri_kood;
	}

}
