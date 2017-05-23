/**
 * Mtr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public interface Mtr extends javax.xml.rpc.Service {
    public java.lang.String getxteeportAddress();

    public ee.riik.xtee.mtr.producers.producer.mtr.Xteeport getxteeport() throws javax.xml.rpc.ServiceException;

    public ee.riik.xtee.mtr.producers.producer.mtr.Xteeport getxteeport(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
