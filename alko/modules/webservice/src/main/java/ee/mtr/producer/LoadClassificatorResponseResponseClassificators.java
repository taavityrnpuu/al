/**
 * LoadClassificatorResponseResponseClassificators.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class LoadClassificatorResponseResponseClassificators  implements java.io.Serializable {
    private ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond[] valdkonnad;

    private ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema[] tyypteemad;

    public LoadClassificatorResponseResponseClassificators() {
    }

    public LoadClassificatorResponseResponseClassificators(
           ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond[] valdkonnad,
           ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema[] tyypteemad) {
           this.valdkonnad = valdkonnad;
           this.tyypteemad = tyypteemad;
    }


    /**
     * Gets the valdkonnad value for this LoadClassificatorResponseResponseClassificators.
     * 
     * @return valdkonnad
     */
    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond[] getValdkonnad() {
        return valdkonnad;
    }


    /**
     * Sets the valdkonnad value for this LoadClassificatorResponseResponseClassificators.
     * 
     * @param valdkonnad
     */
    public void setValdkonnad(ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond[] valdkonnad) {
        this.valdkonnad = valdkonnad;
    }


    /**
     * Gets the tyypteemad value for this LoadClassificatorResponseResponseClassificators.
     * 
     * @return tyypteemad
     */
    public ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema[] getTyypteemad() {
        return tyypteemad;
    }


    /**
     * Sets the tyypteemad value for this LoadClassificatorResponseResponseClassificators.
     * 
     * @param tyypteemad
     */
    public void setTyypteemad(ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema[] tyypteemad) {
        this.tyypteemad = tyypteemad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadClassificatorResponseResponseClassificators)) return false;
        LoadClassificatorResponseResponseClassificators other = (LoadClassificatorResponseResponseClassificators) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valdkonnad==null && other.getValdkonnad()==null) || 
             (this.valdkonnad!=null &&
              java.util.Arrays.equals(this.valdkonnad, other.getValdkonnad()))) &&
            ((this.tyypteemad==null && other.getTyypteemad()==null) || 
             (this.tyypteemad!=null &&
              java.util.Arrays.equals(this.tyypteemad, other.getTyypteemad())));
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
        if (getValdkonnad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValdkonnad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValdkonnad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTyypteemad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTyypteemad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTyypteemad(), i);
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
