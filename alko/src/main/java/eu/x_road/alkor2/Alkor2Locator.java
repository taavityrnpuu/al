/**
 * Alkor2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public class Alkor2Locator extends org.apache.axis.client.Service implements eu.x_road.alkor2.Alkor2 {

    public Alkor2Locator() {
    }


    public Alkor2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Alkor2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for alkor2port
    private java.lang.String alkor2port_address = "https://192.168.0.6/cgi-bin/xroad_proxy/";

    public java.lang.String getalkor2portAddress() {
        return alkor2port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String alkor2portWSDDServiceName = "alkor2port";

    public java.lang.String getalkor2portWSDDServiceName() {
        return alkor2portWSDDServiceName;
    }

    public void setalkor2portWSDDServiceName(java.lang.String name) {
        alkor2portWSDDServiceName = name;
    }

    public eu.x_road.alkor2.Alkor2Port getalkor2port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(alkor2port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getalkor2port(endpoint);
    }

    public eu.x_road.alkor2.Alkor2Port getalkor2port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            eu.x_road.alkor2.Alkor2BindingStub _stub = new eu.x_road.alkor2.Alkor2BindingStub(portAddress, this);
            _stub.setPortName(getalkor2portWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setalkor2portEndpointAddress(java.lang.String address) {
        alkor2port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (eu.x_road.alkor2.Alkor2Port.class.isAssignableFrom(serviceEndpointInterface)) {
                eu.x_road.alkor2.Alkor2BindingStub _stub = new eu.x_road.alkor2.Alkor2BindingStub(new java.net.URL(alkor2port_address), this);
                _stub.setPortName(getalkor2portWSDDServiceName());
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
        if ("alkor2port".equals(inputPortName)) {
            return getalkor2port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "alkor2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://alkor2.x-road.eu/", "alkor2port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("alkor2port".equals(portName)) {
            setalkor2portEndpointAddress(address);
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
