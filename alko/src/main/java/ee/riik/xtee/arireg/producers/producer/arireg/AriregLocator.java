/**
 * AriregLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.arireg.producers.producer.arireg;

public class AriregLocator extends org.apache.axis.client.Service implements ee.riik.xtee.arireg.producers.producer.arireg.Arireg {

    public AriregLocator() {
    }


    public AriregLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AriregLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AriregPort
    private java.lang.String AriregPort_address = "http://TURVASERVER/cgi-bin/consumer_proxy";

    public java.lang.String getAriregPortAddress() {
        return AriregPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AriregPortWSDDServiceName = "AriregPort";

    public java.lang.String getAriregPortWSDDServiceName() {
        return AriregPortWSDDServiceName;
    }

    public void setAriregPortWSDDServiceName(java.lang.String name) {
        AriregPortWSDDServiceName = name;
    }

    public ee.riik.xtee.arireg.producers.producer.arireg.AriregPort getAriregPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AriregPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAriregPort(endpoint);
    }

    public ee.riik.xtee.arireg.producers.producer.arireg.AriregPort getAriregPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ee.riik.xtee.arireg.producers.producer.arireg.AriregBindingStub _stub = new ee.riik.xtee.arireg.producers.producer.arireg.AriregBindingStub(portAddress, this);
            _stub.setPortName(getAriregPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAriregPortEndpointAddress(java.lang.String address) {
        AriregPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ee.riik.xtee.arireg.producers.producer.arireg.AriregPort.class.isAssignableFrom(serviceEndpointInterface)) {
                ee.riik.xtee.arireg.producers.producer.arireg.AriregBindingStub _stub = new ee.riik.xtee.arireg.producers.producer.arireg.AriregBindingStub(new java.net.URL(AriregPort_address), this);
                _stub.setPortName(getAriregPortWSDDServiceName());
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
        if ("AriregPort".equals(inputPortName)) {
            return getAriregPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://producers.arireg.xtee.riik.ee/producer/arireg", "arireg");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://producers.arireg.xtee.riik.ee/producer/arireg", "AriregPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AriregPort".equals(portName)) {
            setAriregPortEndpointAddress(address);
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
