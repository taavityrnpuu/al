/**
 * SoitjaveduType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class SoitjaveduType  extends ee.x_road.mtr.producer.RegistrikanneType  implements java.io.Serializable {
    private ee.x_road.mtr.producer.AlamlubaType riigisisene;

    private ee.x_road.mtr.producer.AlamlubaType rahvusvaheline;

    private ee.x_road.mtr.producer.IsikAndmedLihtneType[] vastutav_isikud;

    public SoitjaveduType() {
    }

    public SoitjaveduType(
           java.lang.String tyyp,
           java.lang.String regnr,
           java.lang.String valdkond,
           java.lang.String tegevusala,
           java.lang.String tegevusalakood,
           java.util.Date registreerimisekp,
           org.apache.axis.types.URI mtrlink,
           ee.x_road.mtr.producer.AlamlubaType riigisisene,
           ee.x_road.mtr.producer.AlamlubaType rahvusvaheline,
           ee.x_road.mtr.producer.IsikAndmedLihtneType[] vastutav_isikud) {
        super(
            tyyp,
            regnr,
            valdkond,
            tegevusala,
            tegevusalakood,
            registreerimisekp,
            mtrlink);
        this.riigisisene = riigisisene;
        this.rahvusvaheline = rahvusvaheline;
        this.vastutav_isikud = vastutav_isikud;
    }


    /**
     * Gets the riigisisene value for this SoitjaveduType.
     * 
     * @return riigisisene
     */
    public ee.x_road.mtr.producer.AlamlubaType getRiigisisene() {
        return riigisisene;
    }


    /**
     * Sets the riigisisene value for this SoitjaveduType.
     * 
     * @param riigisisene
     */
    public void setRiigisisene(ee.x_road.mtr.producer.AlamlubaType riigisisene) {
        this.riigisisene = riigisisene;
    }


    /**
     * Gets the rahvusvaheline value for this SoitjaveduType.
     * 
     * @return rahvusvaheline
     */
    public ee.x_road.mtr.producer.AlamlubaType getRahvusvaheline() {
        return rahvusvaheline;
    }


    /**
     * Sets the rahvusvaheline value for this SoitjaveduType.
     * 
     * @param rahvusvaheline
     */
    public void setRahvusvaheline(ee.x_road.mtr.producer.AlamlubaType rahvusvaheline) {
        this.rahvusvaheline = rahvusvaheline;
    }


    /**
     * Gets the vastutav_isikud value for this SoitjaveduType.
     * 
     * @return vastutav_isikud
     */
    public ee.x_road.mtr.producer.IsikAndmedLihtneType[] getVastutav_isikud() {
        return vastutav_isikud;
    }


    /**
     * Sets the vastutav_isikud value for this SoitjaveduType.
     * 
     * @param vastutav_isikud
     */
    public void setVastutav_isikud(ee.x_road.mtr.producer.IsikAndmedLihtneType[] vastutav_isikud) {
        this.vastutav_isikud = vastutav_isikud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoitjaveduType)) return false;
        SoitjaveduType other = (SoitjaveduType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.riigisisene==null && other.getRiigisisene()==null) || 
             (this.riigisisene!=null &&
              this.riigisisene.equals(other.getRiigisisene()))) &&
            ((this.rahvusvaheline==null && other.getRahvusvaheline()==null) || 
             (this.rahvusvaheline!=null &&
              this.rahvusvaheline.equals(other.getRahvusvaheline()))) &&
            ((this.vastutav_isikud==null && other.getVastutav_isikud()==null) || 
             (this.vastutav_isikud!=null &&
              java.util.Arrays.equals(this.vastutav_isikud, other.getVastutav_isikud())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRiigisisene() != null) {
            _hashCode += getRiigisisene().hashCode();
        }
        if (getRahvusvaheline() != null) {
            _hashCode += getRahvusvaheline().hashCode();
        }
        if (getVastutav_isikud() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVastutav_isikud());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVastutav_isikud(), i);
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
