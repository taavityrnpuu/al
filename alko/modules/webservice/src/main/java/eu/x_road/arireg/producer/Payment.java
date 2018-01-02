/**
 * Payment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class Payment  implements java.io.Serializable {
    /* Tehingu tüüp C või D näitab, kas tegemist on kreedit- või deebetkandega
     * konto omaniku (asutuse) poolt vaadatuna. */
    private eu.x_road.arireg.producer.PaymentType type;

    /* Summa baasvaluutas. */
    private java.math.BigDecimal baseCurrencyAmount;

    /* Summa valuutas. */
    private java.math.BigDecimal amount;

    /* Valuuta kood ISO 4217 formaadis. */
    private java.lang.String currency;

    public Payment() {
    }

    public Payment(
           eu.x_road.arireg.producer.PaymentType type,
           java.math.BigDecimal baseCurrencyAmount,
           java.math.BigDecimal amount,
           java.lang.String currency) {
           this.type = type;
           this.baseCurrencyAmount = baseCurrencyAmount;
           this.amount = amount;
           this.currency = currency;
    }


    /**
     * Gets the type value for this Payment.
     * 
     * @return type   * Tehingu tüüp C või D näitab, kas tegemist on kreedit- või deebetkandega
     * konto omaniku (asutuse) poolt vaadatuna.
     */
    public eu.x_road.arireg.producer.PaymentType getType() {
        return type;
    }


    /**
     * Sets the type value for this Payment.
     * 
     * @param type   * Tehingu tüüp C või D näitab, kas tegemist on kreedit- või deebetkandega
     * konto omaniku (asutuse) poolt vaadatuna.
     */
    public void setType(eu.x_road.arireg.producer.PaymentType type) {
        this.type = type;
    }


    /**
     * Gets the baseCurrencyAmount value for this Payment.
     * 
     * @return baseCurrencyAmount   * Summa baasvaluutas.
     */
    public java.math.BigDecimal getBaseCurrencyAmount() {
        return baseCurrencyAmount;
    }


    /**
     * Sets the baseCurrencyAmount value for this Payment.
     * 
     * @param baseCurrencyAmount   * Summa baasvaluutas.
     */
    public void setBaseCurrencyAmount(java.math.BigDecimal baseCurrencyAmount) {
        this.baseCurrencyAmount = baseCurrencyAmount;
    }


    /**
     * Gets the amount value for this Payment.
     * 
     * @return amount   * Summa valuutas.
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Payment.
     * 
     * @param amount   * Summa valuutas.
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this Payment.
     * 
     * @return currency   * Valuuta kood ISO 4217 formaadis.
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Payment.
     * 
     * @param currency   * Valuuta kood ISO 4217 formaadis.
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Payment)) return false;
        Payment other = (Payment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.baseCurrencyAmount==null && other.getBaseCurrencyAmount()==null) || 
             (this.baseCurrencyAmount!=null &&
              this.baseCurrencyAmount.equals(other.getBaseCurrencyAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBaseCurrencyAmount() != null) {
            _hashCode += getBaseCurrencyAmount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
