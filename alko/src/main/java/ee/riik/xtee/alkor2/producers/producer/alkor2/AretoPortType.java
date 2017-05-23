/**
 * AretoPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public interface AretoPortType extends java.rmi.Remote {

    /**

     */
    public java.lang.String[] listMethods(java.lang.String keha) throws java.rmi.RemoteException;

    /**

     */
    public void legacy1(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void eitlaadib(ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring keha, org.apache.axis.holders.DataHandlerHolder aruanne, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void eitparib(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void aretolaadib(ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring keha, org.apache.axis.holders.DataHandlerHolder aruanne, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aretolaadib_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void liikumine(ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void aruandjaparija(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandjaparija_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void aruandeparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void tooteparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void kammparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void transactionStatement(ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void addApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void updateApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void getApplicationDocuments(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void updateApplicationDocuments(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery keha, org.apache.axis.holders.DataHandlerHolder doc1, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void applyedApplications(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AppFollowResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void acceptedApplications(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationsResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void prolongApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void prolongApp60(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void getApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void getEnterprise(ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void addEnterprise(ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddEnterpriseResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void checkApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void extendApps(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ExtendResponseHolder keha2) throws java.rmi.RemoteException;
}
