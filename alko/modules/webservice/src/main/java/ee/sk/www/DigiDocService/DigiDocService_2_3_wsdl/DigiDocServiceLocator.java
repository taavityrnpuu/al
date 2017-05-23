/**
 * DigiDocServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl;

public class DigiDocServiceLocator extends org.apache.axis.client.Service implements ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocService {

/**
 * Digital signature service
 */

    public DigiDocServiceLocator() {
    }


    public DigiDocServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DigiDocServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DigiDocService
    private java.lang.String DigiDocService_address = "https://digidocservice.sk.ee/DigiDocService";

    public java.lang.String getDigiDocServiceAddress() {
        return DigiDocService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DigiDocServiceWSDDServiceName = "DigiDocService";

    public java.lang.String getDigiDocServiceWSDDServiceName() {
        return DigiDocServiceWSDDServiceName;
    }

    public void setDigiDocServiceWSDDServiceName(java.lang.String name) {
        DigiDocServiceWSDDServiceName = name;
    }

    public ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServicePortType getDigiDocService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DigiDocService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDigiDocService(endpoint);
    }

    public ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServicePortType getDigiDocService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServiceStub _stub = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServiceStub(portAddress, this);
            _stub.setPortName(getDigiDocServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDigiDocServiceEndpointAddress(java.lang.String address) {
        DigiDocService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServiceStub _stub = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServiceStub(new java.net.URL(DigiDocService_address), this);
                _stub.setPortName(getDigiDocServiceWSDDServiceName());
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
        if ("DigiDocService".equals(inputPortName)) {
            return getDigiDocService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "DigiDocService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", "DigiDocService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DigiDocService".equals(portName)) {
            setDigiDocServiceEndpointAddress(address);
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
