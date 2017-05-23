/**
 * Mtr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public interface Mtr extends javax.xml.rpc.Service {
    public java.lang.String getmtr_porttypeAddress();

    public ee.x_road.mtr.producer.Mtr_porttype getmtr_porttype() throws javax.xml.rpc.ServiceException;

    public ee.x_road.mtr.producer.Mtr_porttype getmtr_porttype(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
