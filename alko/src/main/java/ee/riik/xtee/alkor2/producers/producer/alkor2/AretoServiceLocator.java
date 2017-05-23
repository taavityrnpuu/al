/**
 * AretoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class AretoServiceLocator extends org.apache.axis.client.Service implements ee.riik.xtee.alkor2.producers.producer.alkor2.AretoService {

    public AretoServiceLocator() {
    }


    public AretoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AretoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for areto
    private java.lang.String areto_address = "http://TURVASERVER/cgi-bin/consumer_proxy";

    public java.lang.String getaretoAddress() {
        return areto_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String aretoWSDDServiceName = "areto";

    public java.lang.String getaretoWSDDServiceName() {
        return aretoWSDDServiceName;
    }

    public void setaretoWSDDServiceName(java.lang.String name) {
        aretoWSDDServiceName = name;
    }

    public ee.riik.xtee.alkor2.producers.producer.alkor2.AretoPortType getareto() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(areto_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getareto(endpoint);
    }

    public ee.riik.xtee.alkor2.producers.producer.alkor2.AretoPortType getareto(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ee.riik.xtee.alkor2.producers.producer.alkor2.AretoBindingStub _stub = new ee.riik.xtee.alkor2.producers.producer.alkor2.AretoBindingStub(portAddress, this);
            _stub.setPortName(getaretoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setaretoEndpointAddress(java.lang.String address) {
        areto_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ee.riik.xtee.alkor2.producers.producer.alkor2.AretoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ee.riik.xtee.alkor2.producers.producer.alkor2.AretoBindingStub _stub = new ee.riik.xtee.alkor2.producers.producer.alkor2.AretoBindingStub(new java.net.URL(areto_address), this);
                _stub.setPortName(getaretoWSDDServiceName());
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
        if ("areto".equals(inputPortName)) {
            return getareto();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AretoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "areto"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("areto".equals(portName)) {
            setaretoEndpointAddress(address);
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
