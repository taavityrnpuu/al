/**
 * LoadClassificatorResponseRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class LoadClassificatorResponseRequest  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String subset;

    private java.util.Date from;

    private java.lang.String max;

    public LoadClassificatorResponseRequest() {
    }

    public LoadClassificatorResponseRequest(
           java.lang.String name,
           java.lang.String subset,
           java.util.Date from,
           java.lang.String max) {
           this.name = name;
           this.subset = subset;
           this.from = from;
           this.max = max;
    }


    /**
     * Gets the name value for this LoadClassificatorResponseRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LoadClassificatorResponseRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the subset value for this LoadClassificatorResponseRequest.
     * 
     * @return subset
     */
    public java.lang.String getSubset() {
        return subset;
    }


    /**
     * Sets the subset value for this LoadClassificatorResponseRequest.
     * 
     * @param subset
     */
    public void setSubset(java.lang.String subset) {
        this.subset = subset;
    }


    /**
     * Gets the from value for this LoadClassificatorResponseRequest.
     * 
     * @return from
     */
    public java.util.Date getFrom() {
        return from;
    }


    /**
     * Sets the from value for this LoadClassificatorResponseRequest.
     * 
     * @param from
     */
    public void setFrom(java.util.Date from) {
        this.from = from;
    }


    /**
     * Gets the max value for this LoadClassificatorResponseRequest.
     * 
     * @return max
     */
    public java.lang.String getMax() {
        return max;
    }


    /**
     * Sets the max value for this LoadClassificatorResponseRequest.
     * 
     * @param max
     */
    public void setMax(java.lang.String max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificatorResponseRequest)) return false;
        LoadClassificatorResponseRequest other = (LoadClassificatorResponseRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.subset==null && other.getSubset()==null) || 
             (this.subset!=null &&
              this.subset.equals(other.getSubset()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSubset() != null) {
            _hashCode += getSubset().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
