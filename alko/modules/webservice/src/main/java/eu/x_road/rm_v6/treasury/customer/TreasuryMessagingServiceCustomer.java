/**
 * TreasuryMessagingServiceCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.rm_v6.treasury.customer;

public interface TreasuryMessagingServiceCustomer extends javax.xml.rpc.Service {
    public java.lang.String getTreasuryXrdCustomerWSAddress();

    public eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType getTreasuryXrdCustomerWS() throws javax.xml.rpc.ServiceException;

    public eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType getTreasuryXrdCustomerWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
