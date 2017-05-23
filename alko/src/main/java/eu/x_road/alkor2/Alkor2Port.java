/**
 * Alkor2Port.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public interface Alkor2Port extends java.rmi.Remote {

    /**

     */
    public java.lang.Object testSystem(java.lang.Object body) throws java.rmi.RemoteException;

    /**

     */
    public eu.x_road.alkor2.types.TransactionStatementResponse transactionStatement(eu.x_road.alkor2.types.MokaType moka) throws java.rmi.RemoteException;

    /**

     */
    public void aruandeparing(java.util.Date l_date_from, java.util.Date l_date_to, eu.x_road.alkor2.types.Aruandeperiood periodStart, eu.x_road.alkor2.types.Aruandeperiood periodEnd, boolean resp_attach, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.AruandeparingResponseAruandedHolder aruanded, javax.xml.rpc.holders.StringHolder aruanded_csv) throws java.rmi.RemoteException;

    /**

     */
    public void eitlaadib(eu.x_road.alkor2.types.AruandeperioodReq period, byte[] aruanne, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.EitlaadibResponseVeadHolder vead) throws java.rmi.RemoteException;

    /**

     */
    public void aretolaadib(eu.x_road.alkor2.types.Aruandjakoodigaareto aruandja, eu.x_road.alkor2.types.AruandeperioodReq period, byte[] aruanne, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.AretolaadibResponseVeadHolder vead) throws java.rmi.RemoteException;

    /**

     */
    public void kammparing(java.lang.String reg_book_nr, java.util.Date reg_date, eu.x_road.alkor2.types.holders.Status_tHolder status, eu.x_road.alkor2.types.holders.ItemHolder item) throws java.rmi.RemoteException;

    /**

     */
    public void tooteparing(java.lang.String reg_book_nr, java.util.Date date_fromS, java.util.Date date_toS, java.util.Date date_fromE, java.util.Date date_toE, java.lang.String item_name, eu.x_road.alkor2.types.Tooteliik producttype, java.lang.String man_actor_name, eu.x_road.alkor2.types.CountryType country, eu.x_road.alkor2.types.CapacityType volume, java.lang.String ethanol_vol, java.lang.String desc, java.lang.Boolean status1, java.lang.Boolean status2, boolean resp_attach, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.TooteparingResponseTootedHolder tooted, javax.xml.rpc.holders.StringHolder tooted_csv) throws java.rmi.RemoteException;

    /**

     */
    public void liikumineParing(java.lang.String reg_book_nr, java.lang.String ent_reg_nr, java.lang.String ent_name, java.lang.String receiver, java.lang.String market, java.lang.String addr_county, java.lang.String addr_town, java.lang.String addr_str, java.lang.String p_nr, java.lang.String p_cnt, java.util.Date l_date_from, java.util.Date l_date_to, eu.x_road.alkor2.types.Aruandeperiood period, java.lang.Integer report_id, java.lang.Boolean resp_attach, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.LiikumineParingResponseLiikumisedHolder liikumised, javax.xml.rpc.holders.StringHolder liikumised_csv) throws java.rmi.RemoteException;

    /**

     */
    public void legacy1(java.lang.String[] keha, javax.xml.rpc.holders.StringHolder teade, org.apache.axis.holders.URIHolder url) throws java.rmi.RemoteException;
}
