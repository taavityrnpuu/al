/**
 * EmtaxteeLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.emta.producers.producer.emta;

public class EmtaxteeLocator extends org.apache.axis.client.Service implements ee.riik.xtee.emta.producers.producer.emta.Emtaxtee {

    public EmtaxteeLocator() {
    }


    public EmtaxteeLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmtaxteeLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for emtaxtee
    private java.lang.String emtaxtee_address = "http://TURVASERVER/cgi-bin/consumer_proxy";

    public java.lang.String getemtaxteeAddress() {
        return emtaxtee_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String emtaxteeWSDDServiceName = "emtaxtee";

    public java.lang.String getemtaxteeWSDDServiceName() {
        return emtaxteeWSDDServiceName;
    }

    public void setemtaxteeWSDDServiceName(java.lang.String name) {
        emtaxteeWSDDServiceName = name;
    }

    public ee.riik.xtee.emta.producers.producer.emta.Emtaport getemtaxtee() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(emtaxtee_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getemtaxtee(endpoint);
    }

    public ee.riik.xtee.emta.producers.producer.emta.Emtaport getemtaxtee(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ee.riik.xtee.emta.producers.producer.emta.EmtabindStub _stub = new ee.riik.xtee.emta.producers.producer.emta.EmtabindStub(portAddress, this);
            _stub.setPortName(getemtaxteeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setemtaxteeEndpointAddress(java.lang.String address) {
        emtaxtee_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ee.riik.xtee.emta.producers.producer.emta.Emtaport.class.isAssignableFrom(serviceEndpointInterface)) {
                ee.riik.xtee.emta.producers.producer.emta.EmtabindStub _stub = new ee.riik.xtee.emta.producers.producer.emta.EmtabindStub(new java.net.URL(emtaxtee_address), this);
                _stub.setPortName(getemtaxteeWSDDServiceName());
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
        if ("emtaxtee".equals(inputPortName)) {
            return getemtaxtee();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://producers.emta.xtee.riik.ee/producer/emta", "emtaxtee");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://producers.emta.xtee.riik.ee/producer/emta", "emtaxtee"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("emtaxtee".equals(portName)) {
            setemtaxteeEndpointAddress(address);
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
