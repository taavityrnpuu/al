/**
 * TreasuryMessagingServiceCustomerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.rm_v6.treasury.customer;

public class TreasuryMessagingServiceCustomerLocator extends org.apache.axis.client.Service implements eu.x_road.rm_v6.treasury.customer.TreasuryMessagingServiceCustomer {

    public TreasuryMessagingServiceCustomerLocator() {
    }


    public TreasuryMessagingServiceCustomerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TreasuryMessagingServiceCustomerLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TreasuryXrdCustomerWS
    private java.lang.String TreasuryXrdCustomerWS_address = "http://TURVASERVER/cgi-bin/consumer_proxy";

    public java.lang.String getTreasuryXrdCustomerWSAddress() {
        return TreasuryXrdCustomerWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TreasuryXrdCustomerWSWSDDServiceName = "TreasuryXrdCustomerWS";

    public java.lang.String getTreasuryXrdCustomerWSWSDDServiceName() {
        return TreasuryXrdCustomerWSWSDDServiceName;
    }

    public void setTreasuryXrdCustomerWSWSDDServiceName(java.lang.String name) {
        TreasuryXrdCustomerWSWSDDServiceName = name;
    }

    public eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType getTreasuryXrdCustomerWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TreasuryXrdCustomerWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTreasuryXrdCustomerWS(endpoint);
    }

    public eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType getTreasuryXrdCustomerWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            eu.x_road.rm_v6.treasury.customer.TreasuryCustomerBindingStub _stub = new eu.x_road.rm_v6.treasury.customer.TreasuryCustomerBindingStub(portAddress, this);
            _stub.setPortName(getTreasuryXrdCustomerWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTreasuryXrdCustomerWSEndpointAddress(java.lang.String address) {
        TreasuryXrdCustomerWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                eu.x_road.rm_v6.treasury.customer.TreasuryCustomerBindingStub _stub = new eu.x_road.rm_v6.treasury.customer.TreasuryCustomerBindingStub(new java.net.URL(TreasuryXrdCustomerWS_address), this);
                _stub.setPortName(getTreasuryXrdCustomerWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TreasuryXrdCustomerWS".equals(inputPortName)) {
            return getTreasuryXrdCustomerWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "TreasuryMessagingServiceCustomer");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "TreasuryXrdCustomerWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TreasuryXrdCustomerWS".equals(portName)) {
            setTreasuryXrdCustomerWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
