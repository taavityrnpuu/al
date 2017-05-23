/**
 * Arireg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public interface Arireg extends javax.xml.rpc.Service {
    public java.lang.String getAriregXteeAddress();

    public eu.x_road.arireg.producer.AriregXtee getAriregXtee() throws javax.xml.rpc.ServiceException;

    public eu.x_road.arireg.producer.AriregXtee getAriregXtee(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
