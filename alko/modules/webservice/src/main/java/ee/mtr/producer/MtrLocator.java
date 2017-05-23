/**
 * MtrLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class MtrLocator extends org.apache.axis.client.Service implements ee.x_road.mtr.producer.Mtr {

    public MtrLocator() {
    }


    public MtrLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MtrLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for mtr_porttype
    private java.lang.String mtr_porttype_address = "http://TURVASERVER/cgi-bin/consumer_proxy";

    public java.lang.String getmtr_porttypeAddress() {
        return mtr_porttype_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String mtr_porttypeWSDDServiceName = "mtr_porttype";

    public java.lang.String getmtr_porttypeWSDDServiceName() {
        return mtr_porttypeWSDDServiceName;
    }

    public void setmtr_porttypeWSDDServiceName(java.lang.String name) {
        mtr_porttypeWSDDServiceName = name;
    }

    public ee.x_road.mtr.producer.Mtr_porttype getmtr_porttype() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(mtr_porttype_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmtr_porttype(endpoint);
    }

    public ee.x_road.mtr.producer.Mtr_porttype getmtr_porttype(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ee.x_road.mtr.producer.Mtr_bindingStub _stub = new ee.x_road.mtr.producer.Mtr_bindingStub(portAddress, this);
            _stub.setPortName(getmtr_porttypeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmtr_porttypeEndpointAddress(java.lang.String address) {
        mtr_porttype_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ee.x_road.mtr.producer.Mtr_porttype.class.isAssignableFrom(serviceEndpointInterface)) {
                ee.x_road.mtr.producer.Mtr_bindingStub _stub = new ee.x_road.mtr.producer.Mtr_bindingStub(new java.net.URL(mtr_porttype_address), this);
                _stub.setPortName(getmtr_porttypeWSDDServiceName());
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
        if ("mtr_porttype".equals(inputPortName)) {
            return getmtr_porttype();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "mtr");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "mtr_porttype"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("mtr_porttype".equals(portName)) {
            setmtr_porttypeEndpointAddress(address);
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
