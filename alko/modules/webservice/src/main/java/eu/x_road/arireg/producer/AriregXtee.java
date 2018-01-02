/**
 * AriregXtee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public interface AriregXtee extends java.rmi.Remote {

    /**

     */
    public void debugAdapter_v1(eu.x_road.arireg.producer.DebugAdapter_v1_IN keha, eu.x_road.arireg.producer.holders.DebugAdapter_v1_INHolder paring, eu.x_road.arireg.producer.holders.DebugAdapter_v1_OUTHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void detailandmed_v1(eu.x_road.arireg.producer.Detailandmed_v5_Query keha, eu.x_road.arireg.producer.holders.Detailandmed_v5_QueryHolder paring, eu.x_road.arireg.producer.holders.Detailandmed_v5_VastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevotjaDokumentideLoetelu_v1(eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2 keha, eu.x_road.arireg.producer.holders.Ettevotja_dokumentide_loetelu_paring_v2Holder paring, eu.x_road.arireg.producer.holders.Ettevotja_dokumentide_loetelu_vastus_v2Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevotjaEsmakanded_v1(eu.x_road.arireg.producer.Ettevotja_esmakanded_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_esmakanded_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_esmakanded_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevotjaMuudatusedTasuline_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuline_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuline_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevotjaRekvisiididFail_v1(eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_fail_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_fail_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevotjaRekvisiidid_v1(eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevottegaSeotudIsikud_v1(eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring keha, eu.x_road.arireg.producer.holders.Ettevottega_seotud_isikud_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevottega_seotud_isikud_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void esindus_v1(eu.x_road.arireg.producer.Paringesindus_v4_paring keha, eu.x_road.arireg.producer.holders.Paringesindus_v4_paringHolder paring, eu.x_road.arireg.producer.holders.Paringesindus_v4_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void esindus_v2(eu.x_road.arireg.producer.Paringesindus_v6_paring keha, eu.x_road.arireg.producer.holders.Paringesindus_v6_paringHolder paring, eu.x_road.arireg.producer.holders.Paringesindus_v6_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void klassifikaatorid_v1(eu.x_road.arireg.producer.Klassifikaatorid_paring keha, eu.x_road.arireg.producer.holders.Klassifikaatorid_paringHolder paring, eu.x_road.arireg.producer.holders.Klassifikaatorid_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void lihtandmedTasuta_v1(eu.x_road.arireg.producer.Paringliht_tasuta_paring keha, eu.x_road.arireg.producer.holders.Paringliht_tasuta_paringHolder paring, eu.x_road.arireg.producer.holders.Paringliht_tasuta_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void lihtandmed_v1(eu.x_road.arireg.producer.Paringliht_v5_paring keha, eu.x_road.arireg.producer.holders.Paringliht_v5_paringHolder paring, eu.x_road.arireg.producer.holders.Paringliht_v5_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void majandusaastaAruanneteLoetelu_v1(eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring keha, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_loetelu_paringHolder paring, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_loetelu_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void majandusaastaAruanneteKirjed_v1(eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring keha, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_kirjed_paringHolder paring, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_kirjed_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void seotudIsikuOtsing_v1(eu.x_road.arireg.producer.Seotud_isiku_otsing_paring keha, eu.x_road.arireg.producer.holders.Seotud_isiku_otsing_paringHolder paring, eu.x_road.arireg.producer.holders.Seotud_isiku_otsing_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void aruandeAuditeerimiseAndmed_v1(eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring keha, eu.x_road.arireg.producer.holders.Aruande_auditeerimiseandmed_paringHolder paring, eu.x_road.arireg.producer.holders.Aruande_auditeerimiseandmed_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void aruandeMyygituluEMTAKjargi_v1(eu.x_road.arireg.producer.Aruande_myygitulu_paring keha, eu.x_road.arireg.producer.holders.Aruande_myygitulu_paringHolder paring, eu.x_road.arireg.producer.holders.Aruande_myygitulu_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void toimikuDokument_v1(eu.x_road.arireg.producer.Toimiku_dokument_v1_Request keha, eu.x_road.arireg.producer.holders.Toimiku_dokument_v1_RequestHolder paring, eu.x_road.arireg.producer.holders.Toimiku_dokument_v1_VastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void arikeelud_v1(eu.x_road.arireg.producer.Paringarikeelud_paring keha, eu.x_road.arireg.producer.holders.Paringarikeelud_paringHolder paring, eu.x_road.arireg.producer.holders.Paringarikeelud_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ariregistriToimik_v1(eu.x_road.arireg.producer.Ariregistri_toimik_Request keha, eu.x_road.arireg.producer.holders.Ariregistri_toimik_RequestHolder paring, eu.x_road.arireg.producer.holders.Ariregistri_toimik_ResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void detailandmedEP_v1(eu.x_road.arireg.producer.Detailandmed_ep_v1_Query keha, eu.x_road.arireg.producer.holders.Detailandmed_ep_v1_QueryHolder paring, eu.x_road.arireg.producer.holders.Detailandmed_ep_v1_VastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void erakondaKuuluvus_v1(eu.x_road.arireg.producer.Erakondakuuluvus_paring keha, eu.x_road.arireg.producer.holders.Erakondakuuluvus_paringHolder paring, eu.x_road.arireg.producer.holders.Erakondakuuluvus_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void erakonnaNimekiri_v1(eu.x_road.arireg.producer.Erakonnanimekiri_paring keha, eu.x_road.arireg.producer.holders.Erakonnanimekiri_paringHolder paring, eu.x_road.arireg.producer.holders.Erakonnanimekiri_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void esindusIseendaKohta_v1(eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring keha, eu.x_road.arireg.producer.holders.Paringesindus_iseendakohta_paringHolder paring, eu.x_road.arireg.producer.holders.Paringesindus_iseendakohta_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evportaalDigiteeriDokumendid_v1(eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1 keha, eu.x_road.arireg.producer.holders.DigiteeriDokumendidParing_v1Holder paring, eu.x_road.arireg.producer.holders.DigiteeriDokumendidVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evportaalDigiteeriToimik_v1(eu.x_road.arireg.producer.DigiteeriToimikParing_v1 keha, eu.x_road.arireg.producer.holders.DigiteeriToimikParing_v1Holder paring, eu.x_road.arireg.producer.holders.DigiteeriToimikVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evportaalMargiKattetoimetatuks_v1(eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1 keha, eu.x_road.arireg.producer.holders.MargiKattetoimetatuksParing_v1Holder paring, eu.x_road.arireg.producer.holders.MargiKattetoimetatuksVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevotjaMuudatusedTasutaTootukassa_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_tootukassa_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_tootukassa_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void ettevotjaMuudatusedTasuta_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void EVKKanded_v1(eu.x_road.arireg.producer.EVK_kanded_v1_paring keha, eu.x_road.arireg.producer.holders.EVK_kanded_v1_paringHolder paring, eu.x_road.arireg.producer.holders.EVK_kanded_v1_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void kustutamine_v1(eu.x_road.arireg.producer.Kustutamine_paring keha, eu.x_road.arireg.producer.holders.Kustutamine_paringHolder paring, eu.x_road.arireg.producer.holders.Kustutamine_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void kyMenetlusinfo_v1(eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query keha, eu.x_road.arireg.producer.holders.Ky_menetlusinfo_v2_QueryHolder paring, eu.x_road.arireg.producer.holders.Ky_menetlusinfo_v2_VastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void kyRegistriosaMuutused_v1(eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query keha, eu.x_road.arireg.producer.holders.Ky_registriosamuut_v1_QueryHolder paring, eu.x_road.arireg.producer.holders.Ky_registriosamuut_v1_VastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void maaruseDokument_v1(eu.x_road.arireg.producer.Maaruse_dokument_Request keha, eu.x_road.arireg.producer.holders.Maaruse_dokument_RequestHolder paring, eu.x_road.arireg.producer.holders.Maaruse_dokument_VastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void menetlusinfo_v1(eu.x_road.arireg.producer.Menetlusinfo_v3_paring keha, eu.x_road.arireg.producer.holders.Menetlusinfo_v3_paringHolder paring, eu.x_road.arireg.producer.holders.Menetlusinfo_v3_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaBilanss_v1(eu.x_road.arireg.producer.Mtabilanssv3_paring keha, eu.x_road.arireg.producer.holders.Mtabilanssv3_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilanssv3_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaBilanssFail_v1(eu.x_road.arireg.producer.Mtabilanssv3_paring keha, eu.x_road.arireg.producer.holders.Mtabilanssv3_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilanssfv3_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaBilSisu_v1(eu.x_road.arireg.producer.Mtabilsisuv2_paring keha, eu.x_road.arireg.producer.holders.Mtabilsisuv2_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilsisuv2_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaBilSisuFail_v1(eu.x_road.arireg.producer.Mtabilsisuv2_paring keha, eu.x_road.arireg.producer.holders.Mtabilsisuv2_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilsisufv2_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaEvSeisundid_v1(eu.x_road.arireg.producer.Mtaev_seisundid_paring keha, eu.x_road.arireg.producer.holders.Mtaev_seisundid_paringHolder paring, eu.x_road.arireg.producer.holders.Mtaev_seisundid_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaHoiatused_v1(eu.x_road.arireg.producer.Mtahoiatused_paring keha, eu.x_road.arireg.producer.holders.Mtahoiatused_paringHolder paring, eu.x_road.arireg.producer.holders.Mtahoiatused_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaMajPaevik_v1(eu.x_road.arireg.producer.Mtamajpaevik_paring keha, eu.x_road.arireg.producer.holders.Mtamajpaevik_paringHolder paring, eu.x_road.arireg.producer.holders.Mtamajpaevik_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaMajAruOsad_v1(eu.x_road.arireg.producer.Mtamaruosad_paring keha, eu.x_road.arireg.producer.holders.Mtamaruosad_paringHolder paring, eu.x_road.arireg.producer.holders.Mtamaruosad_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaOtsused_v1(eu.x_road.arireg.producer.Mtaotsused_paring keha, eu.x_road.arireg.producer.holders.Mtaotsused_paringHolder paring, eu.x_road.arireg.producer.holders.Mtaotsused_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaPaevik_v1(eu.x_road.arireg.producer.Mtapaevik_paring keha, eu.x_road.arireg.producer.holders.Mtapaevik_paringHolder paring, eu.x_road.arireg.producer.holders.Mtapaevik_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void mtaTrahvid_v1(eu.x_road.arireg.producer.Mtatrahvid_paring keha, eu.x_road.arireg.producer.holders.Mtatrahvid_paringHolder paring, eu.x_road.arireg.producer.holders.Mtatrahvid_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void napTasumiseLisamine_v1(eu.x_road.arireg.producer.NapTasumiseLisamineQuery keha, eu.x_road.arireg.producer.holders.NapTasumiseLisamineQueryHolder paring, eu.x_road.arireg.producer.holders.NapTasumiseLisamineResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void nimeSobivus_v1(eu.x_road.arireg.producer.Paringnimesobivus_paring keha, eu.x_road.arireg.producer.holders.Paringnimesobivus_paringHolder paring, eu.x_road.arireg.producer.holders.Paringnimesobivus_v2_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void registrikaart_v1(eu.x_road.arireg.producer.Registrikaart_paring keha, eu.x_road.arireg.producer.holders.Registrikaart_paringHolder paring, eu.x_road.arireg.producer.holders.Registrikaart_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void rkoarr_asutused_v1(eu.x_road.arireg.producer.RKOARRAsutusedParing_v1 keha, eu.x_road.arireg.producer.holders.RKOARRAsutusedParing_v1Holder paring, eu.x_road.arireg.producer.holders.RKOARRAsutusedVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void sooritaKanne_v1(eu.x_road.arireg.producer.SooritaKanne_v4 keha, eu.x_road.arireg.producer.holders.SooritaKanne_v4Holder paring, eu.x_road.arireg.producer.holders.SooritaKanneVastus_v4Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void toimikuDokumendid_v1(eu.x_road.arireg.producer.Toimiku_dokumendidRequest keha, eu.x_road.arireg.producer.holders.Toimiku_dokumendidRequestHolder paring, eu.x_road.arireg.producer.holders.Toimiku_dokumendidVastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void transactionStatement(eu.x_road.arireg.producer.MokaQuery keha, eu.x_road.arireg.producer.holders.MokaQueryHolder paring, eu.x_road.arireg.producer.holders.MokaResponseHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evapiLooKanne_v1(eu.x_road.arireg.producer.EVapiLooKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiLooKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiLooKanneVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evapiKinnitaKanne_v1(eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiKinnitaKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiKinnitaKanneVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evapiKustutaKanne_v1(eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiKustutaKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiKustutaKanneVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evapiMaaruseDokument_v1(eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiMaaruseDokumentParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiMaaruseDokumentVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evapiMenetlusinfo_v1(eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiMenetlusinfoParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiMenetlusinfoVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void evapiRiigiloivuViitenumber_v1(eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiRiigiloivuViitenumberParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiRiigiloivuViitenumberVastus_v1Holder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void xbrlAruandeNaitajad_v1(eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring keha, eu.x_road.arireg.producer.holders.Xbrl_aruande_naitajad_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrl_aruande_naitajad_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void xbrlEsita_v1(eu.x_road.arireg.producer.Xbrlesita_paring keha, eu.x_road.arireg.producer.holders.Xbrlesita_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlesita_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void xbrlPdfEsita_v1(eu.x_road.arireg.producer.Xbrlpdfesita_paring keha, eu.x_road.arireg.producer.holders.Xbrlpdfesita_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlpdfesita_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void xbrlEsindus_v1(eu.x_road.arireg.producer.Xbrlesindusv2_paring keha, eu.x_road.arireg.producer.holders.Xbrlesindusv2_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlesindusv2_vastusHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void earveLisaKlient_v1(eu.x_road.arireg.producer.EarveLisaKlient_v1_IN keha, eu.x_road.arireg.producer.holders.EarveLisaKlient_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveLisaKlient_v1_OUTHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void earveEemaldaKlient_v1(eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN keha, eu.x_road.arireg.producer.holders.EarveEemaldaKlient_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveEemaldaKlient_v1_OUTHolder keha2) throws java.rmi.RemoteException;

    /**

     */
    public void earveRegistriParing_v1(eu.x_road.arireg.producer.EarveRegistriParing_v1_IN keha, eu.x_road.arireg.producer.holders.EarveRegistriParing_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveRegistriParing_v1_OUTHolder keha2) throws java.rmi.RemoteException;
}
