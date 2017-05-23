/**
 * DigiDocService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl;

public interface DigiDocService extends javax.xml.rpc.Service {

/**
 * Digital signature service
 */
    public java.lang.String getDigiDocServiceAddress();

    public ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServicePortType getDigiDocService() throws javax.xml.rpc.ServiceException;

    public ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServicePortType getDigiDocService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
