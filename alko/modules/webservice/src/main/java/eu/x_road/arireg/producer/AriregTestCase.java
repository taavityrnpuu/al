/**
 * AriregTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class AriregTestCase extends junit.framework.TestCase {
    public AriregTestCase(java.lang.String name) {
        super(name);
    }

    public void testAriregXteeWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new eu.x_road.arireg.producer.AriregLocator().getAriregXteeAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new eu.x_road.arireg.producer.AriregLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1AriregXteeDebugAdapter_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.debugAdapter_v1(new eu.x_road.arireg.producer.DebugAdapter_v1_IN(), new eu.x_road.arireg.producer.holders.DebugAdapter_v1_INHolder(), new eu.x_road.arireg.producer.holders.DebugAdapter_v1_OUTHolder());
        // TBD - validate results
    }

    public void test2AriregXteeDetailandmed_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.detailandmed_v1(new eu.x_road.arireg.producer.Detailandmed_v5_Query(), new eu.x_road.arireg.producer.holders.Detailandmed_v5_QueryHolder(), new eu.x_road.arireg.producer.holders.Detailandmed_v5_VastusHolder());
        // TBD - validate results
    }

    public void test3AriregXteeEttevotjaDokumentideLoetelu_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ettevotjaDokumentideLoetelu_v1(new eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2(), new eu.x_road.arireg.producer.holders.Ettevotja_dokumentide_loetelu_paring_v2Holder(), new eu.x_road.arireg.producer.holders.Ettevotja_dokumentide_loetelu_vastus_v2Holder());
        // TBD - validate results
    }

    public void test4AriregXteeEttevotjaEsmakanded_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ettevotjaEsmakanded_v1(new eu.x_road.arireg.producer.Ettevotja_esmakanded_paring(), new eu.x_road.arireg.producer.holders.Ettevotja_esmakanded_paringHolder(), new eu.x_road.arireg.producer.holders.Ettevotja_esmakanded_vastusHolder());
        // TBD - validate results
    }

    public void test5AriregXteeEttevotjaMuudatusedTasuline_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ettevotjaMuudatusedTasuline_v1(new eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring(), new eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuline_paringHolder(), new eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuline_vastusHolder());
        // TBD - validate results
    }

    public void test6AriregXteeEttevotjaRekvisiididFail_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ettevotjaRekvisiididFail_v1(new eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring(), new eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_fail_paringHolder(), new eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_fail_vastusHolder());
        // TBD - validate results
    }

    public void test7AriregXteeEttevotjaRekvisiidid_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ettevotjaRekvisiidid_v1(new eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring(), new eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_paringHolder(), new eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_vastusHolder());
        // TBD - validate results
    }

    public void test8AriregXteeEttevottegaSeotudIsikud_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ettevottegaSeotudIsikud_v1(new eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring(), new eu.x_road.arireg.producer.holders.Ettevottega_seotud_isikud_paringHolder(), new eu.x_road.arireg.producer.holders.Ettevottega_seotud_isikud_vastusHolder());
        // TBD - validate results
    }

    public void test9AriregXteeEsindus_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.esindus_v1(new eu.x_road.arireg.producer.Paringesindus_v4_paring(), new eu.x_road.arireg.producer.holders.Paringesindus_v4_paringHolder(), new eu.x_road.arireg.producer.holders.Paringesindus_v4_vastusHolder());
        // TBD - validate results
    }

    public void test10AriregXteeKlassifikaatorid_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.klassifikaatorid_v1(new eu.x_road.arireg.producer.Klassifikaatorid_paring(), new eu.x_road.arireg.producer.holders.Klassifikaatorid_paringHolder(), new eu.x_road.arireg.producer.holders.Klassifikaatorid_vastusHolder());
        // TBD - validate results
    }

    public void test11AriregXteeLihtandmedTasuta_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.lihtandmedTasuta_v1(new eu.x_road.arireg.producer.Paringliht_tasuta_paring(), new eu.x_road.arireg.producer.holders.Paringliht_tasuta_paringHolder(), new eu.x_road.arireg.producer.holders.Paringliht_tasuta_vastusHolder());
        // TBD - validate results
    }

    public void test12AriregXteeLihtandmed_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.lihtandmed_v1(new eu.x_road.arireg.producer.Paringliht_v5_paring(), new eu.x_road.arireg.producer.holders.Paringliht_v5_paringHolder(), new eu.x_road.arireg.producer.holders.Paringliht_v5_vastusHolder());
        // TBD - validate results
    }

    public void test13AriregXteeMajandusaastaAruanneteLoetelu_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.majandusaastaAruanneteLoetelu_v1(new eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring(), new eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_loetelu_paringHolder(), new eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_loetelu_vastusHolder());
        // TBD - validate results
    }

    public void test14AriregXteeMajandusaastaAruanneteKirjed_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.majandusaastaAruanneteKirjed_v1(new eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring(), new eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_kirjed_paringHolder(), new eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_kirjed_vastusHolder());
        // TBD - validate results
    }

    public void test15AriregXteeSeotudIsikuOtsing_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.seotudIsikuOtsing_v1(new eu.x_road.arireg.producer.Seotud_isiku_otsing_paring(), new eu.x_road.arireg.producer.holders.Seotud_isiku_otsing_paringHolder(), new eu.x_road.arireg.producer.holders.Seotud_isiku_otsing_vastusHolder());
        // TBD - validate results
    }

    public void test16AriregXteeAruandeAuditeerimiseAndmed_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.aruandeAuditeerimiseAndmed_v1(new eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring(), new eu.x_road.arireg.producer.holders.Aruande_auditeerimiseandmed_paringHolder(), new eu.x_road.arireg.producer.holders.Aruande_auditeerimiseandmed_vastusHolder());
        // TBD - validate results
    }

    public void test17AriregXteeAruandeMyygituluEMTAKjargi_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.aruandeMyygituluEMTAKjargi_v1(new eu.x_road.arireg.producer.Aruande_myygitulu_paring(), new eu.x_road.arireg.producer.holders.Aruande_myygitulu_paringHolder(), new eu.x_road.arireg.producer.holders.Aruande_myygitulu_vastusHolder());
        // TBD - validate results
    }

    public void test18AriregXteeArikeelud_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.arikeelud_v1(new eu.x_road.arireg.producer.Paringarikeelud_paring(), new eu.x_road.arireg.producer.holders.Paringarikeelud_paringHolder(), new eu.x_road.arireg.producer.holders.Paringarikeelud_vastusHolder());
        // TBD - validate results
    }

    public void test19AriregXteeAriregistriToimik_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ariregistriToimik_v1(new eu.x_road.arireg.producer.Ariregistri_toimik_Request(), new eu.x_road.arireg.producer.holders.Ariregistri_toimik_RequestHolder(), new eu.x_road.arireg.producer.holders.Ariregistri_toimik_ResponseHolder());
        // TBD - validate results
    }

    public void test20AriregXteeDetailandmedEP_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.detailandmedEP_v1(new eu.x_road.arireg.producer.Detailandmed_ep_v1_Query(), new eu.x_road.arireg.producer.holders.Detailandmed_ep_v1_QueryHolder(), new eu.x_road.arireg.producer.holders.Detailandmed_ep_v1_VastusHolder());
        // TBD - validate results
    }

    public void test21AriregXteeErakondaKuuluvus_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.erakondaKuuluvus_v1(new eu.x_road.arireg.producer.Erakondakuuluvus_paring(), new eu.x_road.arireg.producer.holders.Erakondakuuluvus_paringHolder(), new eu.x_road.arireg.producer.holders.Erakondakuuluvus_vastusHolder());
        // TBD - validate results
    }

    public void test22AriregXteeErakonnaNimekiri_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.erakonnaNimekiri_v1(new eu.x_road.arireg.producer.Erakonnanimekiri_paring(), new eu.x_road.arireg.producer.holders.Erakonnanimekiri_paringHolder(), new eu.x_road.arireg.producer.holders.Erakonnanimekiri_vastusHolder());
        // TBD - validate results
    }

    public void test23AriregXteeEsindusIseendaKohta_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.esindusIseendaKohta_v1(new eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring(), new eu.x_road.arireg.producer.holders.Paringesindus_iseendakohta_paringHolder(), new eu.x_road.arireg.producer.holders.Paringesindus_iseendakohta_vastusHolder());
        // TBD - validate results
    }

    public void test24AriregXteeEvportaalDigiteeriDokumendid_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evportaalDigiteeriDokumendid_v1(new eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1(), new eu.x_road.arireg.producer.holders.DigiteeriDokumendidParing_v1Holder(), new eu.x_road.arireg.producer.holders.DigiteeriDokumendidVastus_v1Holder());
        // TBD - validate results
    }

    public void test25AriregXteeEvportaalDigiteeriToimik_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evportaalDigiteeriToimik_v1(new eu.x_road.arireg.producer.DigiteeriToimikParing_v1(), new eu.x_road.arireg.producer.holders.DigiteeriToimikParing_v1Holder(), new eu.x_road.arireg.producer.holders.DigiteeriToimikVastus_v1Holder());
        // TBD - validate results
    }

    public void test26AriregXteeEvportaalMargiKattetoimetatuks_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evportaalMargiKattetoimetatuks_v1(new eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1(), new eu.x_road.arireg.producer.holders.MargiKattetoimetatuksParing_v1Holder(), new eu.x_road.arireg.producer.holders.MargiKattetoimetatuksVastus_v1Holder());
        // TBD - validate results
    }

    public void test27AriregXteeEttevotjaMuudatusedTasutaTootukassa_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ettevotjaMuudatusedTasutaTootukassa_v1(new eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring(), new eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_tootukassa_paringHolder(), new eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_tootukassa_vastusHolder());
        // TBD - validate results
    }

    public void test28AriregXteeEttevotjaMuudatusedTasuta_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.ettevotjaMuudatusedTasuta_v1(new eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring(), new eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_paringHolder(), new eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_vastusHolder());
        // TBD - validate results
    }

    public void test29AriregXteeEVKKanded_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.EVKKanded_v1(new eu.x_road.arireg.producer.EVK_kanded_v1_paring(), new eu.x_road.arireg.producer.holders.EVK_kanded_v1_paringHolder(), new eu.x_road.arireg.producer.holders.EVK_kanded_v1_vastusHolder());
        // TBD - validate results
    }

    public void test30AriregXteeKustutamine_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.kustutamine_v1(new eu.x_road.arireg.producer.Kustutamine_paring(), new eu.x_road.arireg.producer.holders.Kustutamine_paringHolder(), new eu.x_road.arireg.producer.holders.Kustutamine_vastusHolder());
        // TBD - validate results
    }

    public void test31AriregXteeKyMenetlusinfo_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.kyMenetlusinfo_v1(new eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query(), new eu.x_road.arireg.producer.holders.Ky_menetlusinfo_v2_QueryHolder(), new eu.x_road.arireg.producer.holders.Ky_menetlusinfo_v2_VastusHolder());
        // TBD - validate results
    }

    public void test32AriregXteeKyRegistriosaMuutused_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.kyRegistriosaMuutused_v1(new eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query(), new eu.x_road.arireg.producer.holders.Ky_registriosamuut_v1_QueryHolder(), new eu.x_road.arireg.producer.holders.Ky_registriosamuut_v1_VastusHolder());
        // TBD - validate results
    }

    public void test33AriregXteeMaaruseDokument_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.maaruseDokument_v1(new eu.x_road.arireg.producer.Maaruse_dokument_Request(), new eu.x_road.arireg.producer.holders.Maaruse_dokument_RequestHolder(), new eu.x_road.arireg.producer.holders.Maaruse_dokument_VastusHolder());
        // TBD - validate results
    }

    public void test34AriregXteeMenetlusinfo_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.menetlusinfo_v1(new eu.x_road.arireg.producer.Menetlusinfo_v3_paring(), new eu.x_road.arireg.producer.holders.Menetlusinfo_v3_paringHolder(), new eu.x_road.arireg.producer.holders.Menetlusinfo_v3_vastusHolder());
        // TBD - validate results
    }

    public void test35AriregXteeMtaBilanss_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaBilanss_v1(new eu.x_road.arireg.producer.Mtabilanssv3_paring(), new eu.x_road.arireg.producer.holders.Mtabilanssv3_paringHolder(), new eu.x_road.arireg.producer.holders.Mtabilanssv3_vastusHolder());
        // TBD - validate results
    }

    public void test36AriregXteeMtaBilanssFail_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaBilanssFail_v1(new eu.x_road.arireg.producer.Mtabilanssv3_paring(), new eu.x_road.arireg.producer.holders.Mtabilanssv3_paringHolder(), new eu.x_road.arireg.producer.holders.Mtabilanssfv3_vastusHolder());
        // TBD - validate results
    }

    public void test37AriregXteeMtaBilSisu_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaBilSisu_v1(new eu.x_road.arireg.producer.Mtabilsisuv2_paring(), new eu.x_road.arireg.producer.holders.Mtabilsisuv2_paringHolder(), new eu.x_road.arireg.producer.holders.Mtabilsisuv2_vastusHolder());
        // TBD - validate results
    }

    public void test38AriregXteeMtaBilSisuFail_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaBilSisuFail_v1(new eu.x_road.arireg.producer.Mtabilsisuv2_paring(), new eu.x_road.arireg.producer.holders.Mtabilsisuv2_paringHolder(), new eu.x_road.arireg.producer.holders.Mtabilsisufv2_vastusHolder());
        // TBD - validate results
    }

    public void test39AriregXteeMtaEvSeisundid_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaEvSeisundid_v1(new eu.x_road.arireg.producer.Mtaev_seisundid_paring(), new eu.x_road.arireg.producer.holders.Mtaev_seisundid_paringHolder(), new eu.x_road.arireg.producer.holders.Mtaev_seisundid_vastusHolder());
        // TBD - validate results
    }

    public void test40AriregXteeMtaHoiatused_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaHoiatused_v1(new eu.x_road.arireg.producer.Mtahoiatused_paring(), new eu.x_road.arireg.producer.holders.Mtahoiatused_paringHolder(), new eu.x_road.arireg.producer.holders.Mtahoiatused_vastusHolder());
        // TBD - validate results
    }

    public void test41AriregXteeMtaMajPaevik_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaMajPaevik_v1(new eu.x_road.arireg.producer.Mtamajpaevik_paring(), new eu.x_road.arireg.producer.holders.Mtamajpaevik_paringHolder(), new eu.x_road.arireg.producer.holders.Mtamajpaevik_vastusHolder());
        // TBD - validate results
    }

    public void test42AriregXteeMtaMajAruOsad_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaMajAruOsad_v1(new eu.x_road.arireg.producer.Mtamaruosad_paring(), new eu.x_road.arireg.producer.holders.Mtamaruosad_paringHolder(), new eu.x_road.arireg.producer.holders.Mtamaruosad_vastusHolder());
        // TBD - validate results
    }

    public void test43AriregXteeMtaOtsused_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaOtsused_v1(new eu.x_road.arireg.producer.Mtaotsused_paring(), new eu.x_road.arireg.producer.holders.Mtaotsused_paringHolder(), new eu.x_road.arireg.producer.holders.Mtaotsused_vastusHolder());
        // TBD - validate results
    }

    public void test44AriregXteeMtaPaevik_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaPaevik_v1(new eu.x_road.arireg.producer.Mtapaevik_paring(), new eu.x_road.arireg.producer.holders.Mtapaevik_paringHolder(), new eu.x_road.arireg.producer.holders.Mtapaevik_vastusHolder());
        // TBD - validate results
    }

    public void test45AriregXteeMtaTrahvid_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.mtaTrahvid_v1(new eu.x_road.arireg.producer.Mtatrahvid_paring(), new eu.x_road.arireg.producer.holders.Mtatrahvid_paringHolder(), new eu.x_road.arireg.producer.holders.Mtatrahvid_vastusHolder());
        // TBD - validate results
    }

    public void test46AriregXteeNapTasumiseLisamine_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.napTasumiseLisamine_v1(new eu.x_road.arireg.producer.NapTasumiseLisamineQuery(), new eu.x_road.arireg.producer.holders.NapTasumiseLisamineQueryHolder(), new eu.x_road.arireg.producer.holders.NapTasumiseLisamineResponseHolder());
        // TBD - validate results
    }

    public void test47AriregXteeNimeSobivus_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.nimeSobivus_v1(new eu.x_road.arireg.producer.Paringnimesobivus_paring(), new eu.x_road.arireg.producer.holders.Paringnimesobivus_paringHolder(), new eu.x_road.arireg.producer.holders.Paringnimesobivus_v2_vastusHolder());
        // TBD - validate results
    }

    public void test48AriregXteeRegistrikaart_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.registrikaart_v1(new eu.x_road.arireg.producer.Registrikaart_paring(), new eu.x_road.arireg.producer.holders.Registrikaart_paringHolder(), new eu.x_road.arireg.producer.holders.Registrikaart_vastusHolder());
        // TBD - validate results
    }

    public void test49AriregXteeRkoarr_asutused_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.rkoarr_asutused_v1(new eu.x_road.arireg.producer.RKOARRAsutusedParing_v1(), new eu.x_road.arireg.producer.holders.RKOARRAsutusedParing_v1Holder(), new eu.x_road.arireg.producer.holders.RKOARRAsutusedVastus_v1Holder());
        // TBD - validate results
    }

    public void test50AriregXteeSooritaKanne_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.sooritaKanne_v1(new eu.x_road.arireg.producer.SooritaKanne_v4(), new eu.x_road.arireg.producer.holders.SooritaKanne_v4Holder(), new eu.x_road.arireg.producer.holders.SooritaKanneVastus_v4Holder());
        // TBD - validate results
    }

    public void test51AriregXteeToimikuDokumendid_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.toimikuDokumendid_v1(new eu.x_road.arireg.producer.Toimiku_dokumendidRequest(), new eu.x_road.arireg.producer.holders.Toimiku_dokumendidRequestHolder(), new eu.x_road.arireg.producer.holders.Toimiku_dokumendidVastusHolder());
        // TBD - validate results
    }

    public void test52AriregXteeToimikuDokument_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        //binding.toimikuDokument_v1(new eu.x_road.arireg.producer.Toimiku_dokument_v2_Request(), new eu.x_road.arireg.producer.holders.Toimiku_dokument_v2_RequestHolder(), new eu.x_road.arireg.producer.holders.Toimiku_dokument_v2_VastusHolder());
        // TBD - validate results
    }

    public void test53AriregXteeTransactionStatement() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.transactionStatement(new eu.x_road.arireg.producer.MokaQuery(), new eu.x_road.arireg.producer.holders.MokaQueryHolder(), new eu.x_road.arireg.producer.holders.MokaResponseHolder());
        // TBD - validate results
    }

    public void test54AriregXteeEvapiLooKanne_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evapiLooKanne_v1(new eu.x_road.arireg.producer.EVapiLooKanneParing_v1(), new eu.x_road.arireg.producer.holders.EVapiLooKanneParing_v1Holder(), new eu.x_road.arireg.producer.holders.EVapiLooKanneVastus_v1Holder());
        // TBD - validate results
    }

    public void test55AriregXteeEvapiKinnitaKanne_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evapiKinnitaKanne_v1(new eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1(), new eu.x_road.arireg.producer.holders.EVapiKinnitaKanneParing_v1Holder(), new eu.x_road.arireg.producer.holders.EVapiKinnitaKanneVastus_v1Holder());
        // TBD - validate results
    }

    public void test56AriregXteeEvapiKustutaKanne_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evapiKustutaKanne_v1(new eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1(), new eu.x_road.arireg.producer.holders.EVapiKustutaKanneParing_v1Holder(), new eu.x_road.arireg.producer.holders.EVapiKustutaKanneVastus_v1Holder());
        // TBD - validate results
    }

    public void test57AriregXteeEvapiMaaruseDokument_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evapiMaaruseDokument_v1(new eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1(), new eu.x_road.arireg.producer.holders.EVapiMaaruseDokumentParing_v1Holder(), new eu.x_road.arireg.producer.holders.EVapiMaaruseDokumentVastus_v1Holder());
        // TBD - validate results
    }

    public void test58AriregXteeEvapiMenetlusinfo_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evapiMenetlusinfo_v1(new eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1(), new eu.x_road.arireg.producer.holders.EVapiMenetlusinfoParing_v1Holder(), new eu.x_road.arireg.producer.holders.EVapiMenetlusinfoVastus_v1Holder());
        // TBD - validate results
    }

    public void test59AriregXteeEvapiRiigiloivuViitenumber_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.evapiRiigiloivuViitenumber_v1(new eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1(), new eu.x_road.arireg.producer.holders.EVapiRiigiloivuViitenumberParing_v1Holder(), new eu.x_road.arireg.producer.holders.EVapiRiigiloivuViitenumberVastus_v1Holder());
        // TBD - validate results
    }

    public void test60AriregXteeXbrlAruandeNaitajad_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.xbrlAruandeNaitajad_v1(new eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring(), new eu.x_road.arireg.producer.holders.Xbrl_aruande_naitajad_paringHolder(), new eu.x_road.arireg.producer.holders.Xbrl_aruande_naitajad_vastusHolder());
        // TBD - validate results
    }

    public void test61AriregXteeXbrlEsita_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.xbrlEsita_v1(new eu.x_road.arireg.producer.Xbrlesita_paring(), new eu.x_road.arireg.producer.holders.Xbrlesita_paringHolder(), new eu.x_road.arireg.producer.holders.Xbrlesita_vastusHolder());
        // TBD - validate results
    }

    public void test62AriregXteeXbrlPdfEsita_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.xbrlPdfEsita_v1(new eu.x_road.arireg.producer.Xbrlpdfesita_paring(), new eu.x_road.arireg.producer.holders.Xbrlpdfesita_paringHolder(), new eu.x_road.arireg.producer.holders.Xbrlpdfesita_vastusHolder());
        // TBD - validate results
    }

    public void test63AriregXteeXbrlEsindus_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.xbrlEsindus_v1(new eu.x_road.arireg.producer.Xbrlesindusv2_paring(), new eu.x_road.arireg.producer.holders.Xbrlesindusv2_paringHolder(), new eu.x_road.arireg.producer.holders.Xbrlesindusv2_vastusHolder());
        // TBD - validate results
    }

    public void test64AriregXteeEarveLisaKlient_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.earveLisaKlient_v1(new eu.x_road.arireg.producer.EarveLisaKlient_v1_IN(), new eu.x_road.arireg.producer.holders.EarveLisaKlient_v1_INHolder(), new eu.x_road.arireg.producer.holders.EarveLisaKlient_v1_OUTHolder());
        // TBD - validate results
    }

    public void test65AriregXteeEarveEemaldaKlient_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.earveEemaldaKlient_v1(new eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN(), new eu.x_road.arireg.producer.holders.EarveEemaldaKlient_v1_INHolder(), new eu.x_road.arireg.producer.holders.EarveEemaldaKlient_v1_OUTHolder());
        // TBD - validate results
    }

    public void test66AriregXteeEarveRegistriParing_v1() throws Exception {
        eu.x_road.arireg.producer.AriregXteeStub binding;
        try {
            binding = (eu.x_road.arireg.producer.AriregXteeStub)
                          new eu.x_road.arireg.producer.AriregLocator().getAriregXtee();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.earveRegistriParing_v1(new eu.x_road.arireg.producer.EarveRegistriParing_v1_IN(), new eu.x_road.arireg.producer.holders.EarveRegistriParing_v1_INHolder(), new eu.x_road.arireg.producer.holders.EarveRegistriParing_v1_OUTHolder());
        // TBD - validate results
    }

}
