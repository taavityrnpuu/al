/**
 * AriregLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class AriregLocator extends org.apache.axis.client.Service implements eu.x_road.arireg.producer.Arireg {

    public AriregLocator() {
    }


    public AriregLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AriregLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AriregXtee
    private java.lang.String AriregXtee_address = "http://TURVASERVER/cgi-bin/consumer_proxy";

    public java.lang.String getAriregXteeAddress() {
        return AriregXtee_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AriregXteeWSDDServiceName = "AriregXtee";

    public java.lang.String getAriregXteeWSDDServiceName() {
        return AriregXteeWSDDServiceName;
    }

    public void setAriregXteeWSDDServiceName(java.lang.String name) {
        AriregXteeWSDDServiceName = name;
    }

    public eu.x_road.arireg.producer.AriregXtee getAriregXtee() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AriregXtee_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAriregXtee(endpoint);
    }

    public eu.x_road.arireg.producer.AriregXtee getAriregXtee(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            eu.x_road.arireg.producer.AriregXteeStub _stub = new eu.x_road.arireg.producer.AriregXteeStub(portAddress, this);
            _stub.setPortName(getAriregXteeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAriregXteeEndpointAddress(java.lang.String address) {
        AriregXtee_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (eu.x_road.arireg.producer.AriregXtee.class.isAssignableFrom(serviceEndpointInterface)) {
                eu.x_road.arireg.producer.AriregXteeStub _stub = new eu.x_road.arireg.producer.AriregXteeStub(new java.net.URL(AriregXtee_address), this);
                _stub.setPortName(getAriregXteeWSDDServiceName());
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
        if ("AriregXtee".equals(inputPortName)) {
            return getAriregXtee();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "arireg");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "AriregXtee"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AriregXtee".equals(portName)) {
            setAriregXteeEndpointAddress(address);
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
