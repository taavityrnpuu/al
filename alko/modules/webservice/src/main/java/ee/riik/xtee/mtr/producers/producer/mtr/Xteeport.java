/**
 * Xteeport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public interface Xteeport extends java.rmi.Remote {

    /**

     */
    public void ettevotjaDetailne(ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneParing keha, ee.riik.xtee.mtr.producers.producer.mtr.holders.EttevotjaDetailneParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.EttevotjaDetailneVastusHolder keha2) throws java.rmi.RemoteException;
    public void registreeringDetailne(ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneParing keha, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringDetailneParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringDetailneVastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void legacy1(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.x_tee.xsd.xtee_xsd.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void legacyEttevotja(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.x_tee.xsd.xtee_xsd.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void legacyKodanik(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.x_tee.xsd.xtee_xsd.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevotja(ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaParing keha, ee.riik.xtee.mtr.producers.producer.mtr.holders.EttevotjaParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.EttevotjaVastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void registreering(ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringParing keha, javax.xml.rpc.holders.StringHolder asutus, javax.xml.rpc.holders.StringHolder andmekogu, javax.xml.rpc.holders.StringHolder isikukood, javax.xml.rpc.holders.StringHolder id, javax.xml.rpc.holders.StringHolder nimi, javax.xml.rpc.holders.StringHolder toimik, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistriKanneVastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void tegevusluba(ee.riik.xtee.mtr.producers.producer.mtr.TegevuslubaParing keha, javax.xml.rpc.holders.StringHolder andmekogu, javax.xml.rpc.holders.StringHolder asutus, javax.xml.rpc.holders.StringHolder isikukood, javax.xml.rpc.holders.StringHolder id, javax.xml.rpc.holders.StringHolder nimi, javax.xml.rpc.holders.StringHolder toimik, ee.riik.xtee.mtr.producers.producer.mtr.holders.TegevuslubaParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistriKanneVastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void registreeringMIKO(ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOParing keha, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringMIKOParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringMIKOVastusHolder keha2) throws java.rmi.RemoteException;
}
