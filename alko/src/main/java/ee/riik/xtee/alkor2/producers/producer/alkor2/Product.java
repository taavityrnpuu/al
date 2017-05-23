/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class Product  implements java.io.Serializable {
    private java.lang.String name;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik productType;

    private java.lang.String ethanolRate;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType capacity;

    private java.lang.String producerInfo;

    private java.lang.String producerInfoId;

    private java.lang.String producerId;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType originCountry;

    private java.lang.String KNCode;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.PackingMaterialType packingMaterial;

    private java.math.BigInteger numberOfLabels;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.BottleColorType bottleColor;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.BottleShapeType bottleShape;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.CorkMaterialType corkMaterial;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.CorkColorType corkColor;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.CorkShapeType corkShape;

    private java.lang.Boolean hasStocking;

    private ee.riik.xtee.alkor2.producers.producer.alkor2.StockingColorType stockingColor;

    private java.lang.Boolean hasFrontLabel;

    private java.lang.Boolean hasRearLabel;

    private java.lang.Boolean hasNeckLabel;

    private java.lang.Boolean hasOtherLabel;

    public Product() {
    }

    public Product(
           java.lang.String name,
           ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik productType,
           java.lang.String ethanolRate,
           ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType capacity,
           java.lang.String producerInfo,
           java.lang.String producerInfoId,
           java.lang.String producerId,
           ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType originCountry,
           java.lang.String KNCode,
           ee.riik.xtee.alkor2.producers.producer.alkor2.PackingMaterialType packingMaterial,
           java.math.BigInteger numberOfLabels,
           ee.riik.xtee.alkor2.producers.producer.alkor2.BottleColorType bottleColor,
           ee.riik.xtee.alkor2.producers.producer.alkor2.BottleShapeType bottleShape,
           ee.riik.xtee.alkor2.producers.producer.alkor2.CorkMaterialType corkMaterial,
           ee.riik.xtee.alkor2.producers.producer.alkor2.CorkColorType corkColor,
           ee.riik.xtee.alkor2.producers.producer.alkor2.CorkShapeType corkShape,
           java.lang.Boolean hasStocking,
           ee.riik.xtee.alkor2.producers.producer.alkor2.StockingColorType stockingColor,
           java.lang.Boolean hasFrontLabel,
           java.lang.Boolean hasRearLabel,
           java.lang.Boolean hasNeckLabel,
           java.lang.Boolean hasOtherLabel) {
           this.name = name;
           this.productType = productType;
           this.ethanolRate = ethanolRate;
           this.capacity = capacity;
           this.producerInfo = producerInfo;
           this.producerInfoId = producerInfoId;
           this.producerId = producerId;
           this.originCountry = originCountry;
           this.KNCode = KNCode;
           this.packingMaterial = packingMaterial;
           this.numberOfLabels = numberOfLabels;
           this.bottleColor = bottleColor;
           this.bottleShape = bottleShape;
           this.corkMaterial = corkMaterial;
           this.corkColor = corkColor;
           this.corkShape = corkShape;
           this.hasStocking = hasStocking;
           this.stockingColor = stockingColor;
           this.hasFrontLabel = hasFrontLabel;
           this.hasRearLabel = hasRearLabel;
           this.hasNeckLabel = hasNeckLabel;
           this.hasOtherLabel = hasOtherLabel;
    }


    /**
     * Gets the name value for this Product.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Product.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the productType value for this Product.
     * 
     * @return productType
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this Product.
     * 
     * @param productType
     */
    public void setProductType(ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik productType) {
        this.productType = productType;
    }


    /**
     * Gets the ethanolRate value for this Product.
     * 
     * @return ethanolRate
     */
    public java.lang.String getEthanolRate() {
        return ethanolRate;
    }


    /**
     * Sets the ethanolRate value for this Product.
     * 
     * @param ethanolRate
     */
    public void setEthanolRate(java.lang.String ethanolRate) {
        this.ethanolRate = ethanolRate;
    }


    /**
     * Gets the capacity value for this Product.
     * 
     * @return capacity
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this Product.
     * 
     * @param capacity
     */
    public void setCapacity(ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the producerInfo value for this Product.
     * 
     * @return producerInfo
     */
    public java.lang.String getProducerInfo() {
        return producerInfo;
    }


    /**
     * Sets the producerInfo value for this Product.
     * 
     * @param producerInfo
     */
    public void setProducerInfo(java.lang.String producerInfo) {
        this.producerInfo = producerInfo;
    }


    /**
     * Gets the producerInfoId value for this Product.
     * 
     * @return producerInfoId
     */
    public java.lang.String getProducerInfoId() {
        return producerInfoId;
    }


    /**
     * Sets the producerInfoId value for this Product.
     * 
     * @param producerInfoId
     */
    public void setProducerInfoId(java.lang.String producerInfoId) {
        this.producerInfoId = producerInfoId;
    }


    /**
     * Gets the producerId value for this Product.
     * 
     * @return producerId
     */
    public java.lang.String getProducerId() {
        return producerId;
    }


    /**
     * Sets the producerId value for this Product.
     * 
     * @param producerId
     */
    public void setProducerId(java.lang.String producerId) {
        this.producerId = producerId;
    }


    /**
     * Gets the originCountry value for this Product.
     * 
     * @return originCountry
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType getOriginCountry() {
        return originCountry;
    }


    /**
     * Sets the originCountry value for this Product.
     * 
     * @param originCountry
     */
    public void setOriginCountry(ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType originCountry) {
        this.originCountry = originCountry;
    }


    /**
     * Gets the KNCode value for this Product.
     * 
     * @return KNCode
     */
    public java.lang.String getKNCode() {
        return KNCode;
    }


    /**
     * Sets the KNCode value for this Product.
     * 
     * @param KNCode
     */
    public void setKNCode(java.lang.String KNCode) {
        this.KNCode = KNCode;
    }


    /**
     * Gets the packingMaterial value for this Product.
     * 
     * @return packingMaterial
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.PackingMaterialType getPackingMaterial() {
        return packingMaterial;
    }


    /**
     * Sets the packingMaterial value for this Product.
     * 
     * @param packingMaterial
     */
    public void setPackingMaterial(ee.riik.xtee.alkor2.producers.producer.alkor2.PackingMaterialType packingMaterial) {
        this.packingMaterial = packingMaterial;
    }


    /**
     * Gets the numberOfLabels value for this Product.
     * 
     * @return numberOfLabels
     */
    public java.math.BigInteger getNumberOfLabels() {
        return numberOfLabels;
    }


    /**
     * Sets the numberOfLabels value for this Product.
     * 
     * @param numberOfLabels
     */
    public void setNumberOfLabels(java.math.BigInteger numberOfLabels) {
        this.numberOfLabels = numberOfLabels;
    }


    /**
     * Gets the bottleColor value for this Product.
     * 
     * @return bottleColor
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.BottleColorType getBottleColor() {
        return bottleColor;
    }


    /**
     * Sets the bottleColor value for this Product.
     * 
     * @param bottleColor
     */
    public void setBottleColor(ee.riik.xtee.alkor2.producers.producer.alkor2.BottleColorType bottleColor) {
        this.bottleColor = bottleColor;
    }


    /**
     * Gets the bottleShape value for this Product.
     * 
     * @return bottleShape
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.BottleShapeType getBottleShape() {
        return bottleShape;
    }


    /**
     * Sets the bottleShape value for this Product.
     * 
     * @param bottleShape
     */
    public void setBottleShape(ee.riik.xtee.alkor2.producers.producer.alkor2.BottleShapeType bottleShape) {
        this.bottleShape = bottleShape;
    }


    /**
     * Gets the corkMaterial value for this Product.
     * 
     * @return corkMaterial
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.CorkMaterialType getCorkMaterial() {
        return corkMaterial;
    }


    /**
     * Sets the corkMaterial value for this Product.
     * 
     * @param corkMaterial
     */
    public void setCorkMaterial(ee.riik.xtee.alkor2.producers.producer.alkor2.CorkMaterialType corkMaterial) {
        this.corkMaterial = corkMaterial;
    }


    /**
     * Gets the corkColor value for this Product.
     * 
     * @return corkColor
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.CorkColorType getCorkColor() {
        return corkColor;
    }


    /**
     * Sets the corkColor value for this Product.
     * 
     * @param corkColor
     */
    public void setCorkColor(ee.riik.xtee.alkor2.producers.producer.alkor2.CorkColorType corkColor) {
        this.corkColor = corkColor;
    }


    /**
     * Gets the corkShape value for this Product.
     * 
     * @return corkShape
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.CorkShapeType getCorkShape() {
        return corkShape;
    }


    /**
     * Sets the corkShape value for this Product.
     * 
     * @param corkShape
     */
    public void setCorkShape(ee.riik.xtee.alkor2.producers.producer.alkor2.CorkShapeType corkShape) {
        this.corkShape = corkShape;
    }


    /**
     * Gets the hasStocking value for this Product.
     * 
     * @return hasStocking
     */
    public java.lang.Boolean getHasStocking() {
        return hasStocking;
    }


    /**
     * Sets the hasStocking value for this Product.
     * 
     * @param hasStocking
     */
    public void setHasStocking(java.lang.Boolean hasStocking) {
        this.hasStocking = hasStocking;
    }


    /**
     * Gets the stockingColor value for this Product.
     * 
     * @return stockingColor
     */
    public ee.riik.xtee.alkor2.producers.producer.alkor2.StockingColorType getStockingColor() {
        return stockingColor;
    }


    /**
     * Sets the stockingColor value for this Product.
     * 
     * @param stockingColor
     */
    public void setStockingColor(ee.riik.xtee.alkor2.producers.producer.alkor2.StockingColorType stockingColor) {
        this.stockingColor = stockingColor;
    }


    /**
     * Gets the hasFrontLabel value for this Product.
     * 
     * @return hasFrontLabel
     */
    public java.lang.Boolean getHasFrontLabel() {
        return hasFrontLabel;
    }


    /**
     * Sets the hasFrontLabel value for this Product.
     * 
     * @param hasFrontLabel
     */
    public void setHasFrontLabel(java.lang.Boolean hasFrontLabel) {
        this.hasFrontLabel = hasFrontLabel;
    }


    /**
     * Gets the hasRearLabel value for this Product.
     * 
     * @return hasRearLabel
     */
    public java.lang.Boolean getHasRearLabel() {
        return hasRearLabel;
    }


    /**
     * Sets the hasRearLabel value for this Product.
     * 
     * @param hasRearLabel
     */
    public void setHasRearLabel(java.lang.Boolean hasRearLabel) {
        this.hasRearLabel = hasRearLabel;
    }


    /**
     * Gets the hasNeckLabel value for this Product.
     * 
     * @return hasNeckLabel
     */
    public java.lang.Boolean getHasNeckLabel() {
        return hasNeckLabel;
    }


    /**
     * Sets the hasNeckLabel value for this Product.
     * 
     * @param hasNeckLabel
     */
    public void setHasNeckLabel(java.lang.Boolean hasNeckLabel) {
        this.hasNeckLabel = hasNeckLabel;
    }


    /**
     * Gets the hasOtherLabel value for this Product.
     * 
     * @return hasOtherLabel
     */
    public java.lang.Boolean getHasOtherLabel() {
        return hasOtherLabel;
    }


    /**
     * Sets the hasOtherLabel value for this Product.
     * 
     * @param hasOtherLabel
     */
    public void setHasOtherLabel(java.lang.Boolean hasOtherLabel) {
        this.hasOtherLabel = hasOtherLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
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
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.ethanolRate==null && other.getEthanolRate()==null) || 
             (this.ethanolRate!=null &&
              this.ethanolRate.equals(other.getEthanolRate()))) &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.producerInfo==null && other.getProducerInfo()==null) || 
             (this.producerInfo!=null &&
              this.producerInfo.equals(other.getProducerInfo()))) &&
            ((this.producerInfoId==null && other.getProducerInfoId()==null) || 
             (this.producerInfoId!=null &&
              this.producerInfoId.equals(other.getProducerInfoId()))) &&
            ((this.producerId==null && other.getProducerId()==null) || 
             (this.producerId!=null &&
              this.producerId.equals(other.getProducerId()))) &&
            ((this.originCountry==null && other.getOriginCountry()==null) || 
             (this.originCountry!=null &&
              this.originCountry.equals(other.getOriginCountry()))) &&
            ((this.KNCode==null && other.getKNCode()==null) || 
             (this.KNCode!=null &&
              this.KNCode.equals(other.getKNCode()))) &&
            ((this.packingMaterial==null && other.getPackingMaterial()==null) || 
             (this.packingMaterial!=null &&
              this.packingMaterial.equals(other.getPackingMaterial()))) &&
            ((this.numberOfLabels==null && other.getNumberOfLabels()==null) || 
             (this.numberOfLabels!=null &&
              this.numberOfLabels.equals(other.getNumberOfLabels()))) &&
            ((this.bottleColor==null && other.getBottleColor()==null) || 
             (this.bottleColor!=null &&
              this.bottleColor.equals(other.getBottleColor()))) &&
            ((this.bottleShape==null && other.getBottleShape()==null) || 
             (this.bottleShape!=null &&
              this.bottleShape.equals(other.getBottleShape()))) &&
            ((this.corkMaterial==null && other.getCorkMaterial()==null) || 
             (this.corkMaterial!=null &&
              this.corkMaterial.equals(other.getCorkMaterial()))) &&
            ((this.corkColor==null && other.getCorkColor()==null) || 
             (this.corkColor!=null &&
              this.corkColor.equals(other.getCorkColor()))) &&
            ((this.corkShape==null && other.getCorkShape()==null) || 
             (this.corkShape!=null &&
              this.corkShape.equals(other.getCorkShape()))) &&
            ((this.hasStocking==null && other.getHasStocking()==null) || 
             (this.hasStocking!=null &&
              this.hasStocking.equals(other.getHasStocking()))) &&
            ((this.stockingColor==null && other.getStockingColor()==null) || 
             (this.stockingColor!=null &&
              this.stockingColor.equals(other.getStockingColor()))) &&
            ((this.hasFrontLabel==null && other.getHasFrontLabel()==null) || 
             (this.hasFrontLabel!=null &&
              this.hasFrontLabel.equals(other.getHasFrontLabel()))) &&
            ((this.hasRearLabel==null && other.getHasRearLabel()==null) || 
             (this.hasRearLabel!=null &&
              this.hasRearLabel.equals(other.getHasRearLabel()))) &&
            ((this.hasNeckLabel==null && other.getHasNeckLabel()==null) || 
             (this.hasNeckLabel!=null &&
              this.hasNeckLabel.equals(other.getHasNeckLabel()))) &&
            ((this.hasOtherLabel==null && other.getHasOtherLabel()==null) || 
             (this.hasOtherLabel!=null &&
              this.hasOtherLabel.equals(other.getHasOtherLabel())));
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
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getEthanolRate() != null) {
            _hashCode += getEthanolRate().hashCode();
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getProducerInfo() != null) {
            _hashCode += getProducerInfo().hashCode();
        }
        if (getProducerInfoId() != null) {
            _hashCode += getProducerInfoId().hashCode();
        }
        if (getProducerId() != null) {
            _hashCode += getProducerId().hashCode();
        }
        if (getOriginCountry() != null) {
            _hashCode += getOriginCountry().hashCode();
        }
        if (getKNCode() != null) {
            _hashCode += getKNCode().hashCode();
        }
        if (getPackingMaterial() != null) {
            _hashCode += getPackingMaterial().hashCode();
        }
        if (getNumberOfLabels() != null) {
            _hashCode += getNumberOfLabels().hashCode();
        }
        if (getBottleColor() != null) {
            _hashCode += getBottleColor().hashCode();
        }
        if (getBottleShape() != null) {
            _hashCode += getBottleShape().hashCode();
        }
        if (getCorkMaterial() != null) {
            _hashCode += getCorkMaterial().hashCode();
        }
        if (getCorkColor() != null) {
            _hashCode += getCorkColor().hashCode();
        }
        if (getCorkShape() != null) {
            _hashCode += getCorkShape().hashCode();
        }
        if (getHasStocking() != null) {
            _hashCode += getHasStocking().hashCode();
        }
        if (getStockingColor() != null) {
            _hashCode += getStockingColor().hashCode();
        }
        if (getHasFrontLabel() != null) {
            _hashCode += getHasFrontLabel().hashCode();
        }
        if (getHasRearLabel() != null) {
            _hashCode += getHasRearLabel().hashCode();
        }
        if (getHasNeckLabel() != null) {
            _hashCode += getHasNeckLabel().hashCode();
        }
        if (getHasOtherLabel() != null) {
            _hashCode += getHasOtherLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteliik"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethanolRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EthanolRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CapacityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProducerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producerInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProducerInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProducerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OriginCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CountryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KNCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KNCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PackingMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "PackingMaterialType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumberOfLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bottleColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BottleColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "BottleColorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bottleShape");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BottleShape"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "BottleShapeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corkMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CorkMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CorkMaterialType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corkColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CorkColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CorkColorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corkShape");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CorkShape"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CorkShapeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasStocking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasStocking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockingColor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StockingColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "StockingColorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasFrontLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasFrontLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasRearLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasRearLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasNeckLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasNeckLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasOtherLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasOtherLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
