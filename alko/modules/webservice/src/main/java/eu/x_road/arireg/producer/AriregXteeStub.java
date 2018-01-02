/**
 * AriregXteeStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class AriregXteeStub extends org.apache.axis.client.Stub implements eu.x_road.arireg.producer.AriregXtee {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[67];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("debugAdapter_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1_IN"), eu.x_road.arireg.producer.DebugAdapter_v1_IN.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1_IN"), eu.x_road.arireg.producer.DebugAdapter_v1_IN.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1_OUT"), eu.x_road.arireg.producer.DebugAdapter_v1_OUT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("detailandmed_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_Query"), eu.x_road.arireg.producer.Detailandmed_v5_Query.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_Query"), eu.x_road.arireg.producer.Detailandmed_v5_Query.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_Vastus"), eu.x_road.arireg.producer.Detailandmed_v5_Vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaDokumentideLoetelu_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokumentide_loetelu_paring_v2"), eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokumentide_loetelu_paring_v2"), eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokumentide_loetelu_vastus_v2"), eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_vastus_v2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaEsmakanded_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded_paring"), eu.x_road.arireg.producer.Ettevotja_esmakanded_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded_paring"), eu.x_road.arireg.producer.Ettevotja_esmakanded_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded_vastus"), eu.x_road.arireg.producer.Ettevotja_esmakanne[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaMuudatusedTasuline_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuline_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuline_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuline_vastus"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaRekvisiididFail_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_fail_paring"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_fail_paring"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_fail_vastus"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaRekvisiidid_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_paring"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_paring"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_vastus"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevottegaSeotudIsikud_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottega_seotud_isikud_paring"), eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottega_seotud_isikud_paring"), eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottega_seotud_isikud_vastus"), eu.x_road.arireg.producer.Seos[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seosed"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("esindus_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_paring"), eu.x_road.arireg.producer.Paringesindus_v4_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_paring"), eu.x_road.arireg.producer.Paringesindus_v4_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_vastus"), eu.x_road.arireg.producer.Paringesindus_v4_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("esindus_v2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_paring"), eu.x_road.arireg.producer.Paringesindus_v6_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_paring"), eu.x_road.arireg.producer.Paringesindus_v6_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_vastus"), eu.x_road.arireg.producer.Paringesindus_v6_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("klassifikaatorid_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_paring"), eu.x_road.arireg.producer.Klassifikaatorid_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_paring"), eu.x_road.arireg.producer.Klassifikaatorid_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_vastus"), eu.x_road.arireg.producer.Klassifikaator[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaator"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lihtandmedTasuta_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_paring"), eu.x_road.arireg.producer.Paringliht_tasuta_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_paring"), eu.x_road.arireg.producer.Paringliht_tasuta_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_vastus"), eu.x_road.arireg.producer.Paringliht_tasuta_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lihtandmed_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_paring"), eu.x_road.arireg.producer.Paringliht_v5_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_paring"), eu.x_road.arireg.producer.Paringliht_v5_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_vastus"), eu.x_road.arireg.producer.Paringliht_v5_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("majandusaastaAruanneteLoetelu_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_loetelu_paring"), eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_loetelu_paring"), eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_loetelu_vastus"), eu.x_road.arireg.producer.Majandusaasta_aruanne[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruanded"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("majandusaastaAruanneteKirjed_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_kirjed_paring"), eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_kirjed_paring"), eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_kirjed_vastus"), eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("seotudIsikuOtsing_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotud_isiku_otsing_paring"), eu.x_road.arireg.producer.Seotud_isiku_otsing_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotud_isiku_otsing_paring"), eu.x_road.arireg.producer.Seotud_isiku_otsing_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotud_isiku_otsing_vastus"), eu.x_road.arireg.producer.Seotud_isiku_otsing_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aruandeAuditeerimiseAndmed_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_paring"), eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_paring"), eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_vastus"), eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aruandeMyygituluEMTAKjargi_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_paring"), eu.x_road.arireg.producer.Aruande_myygitulu_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_paring"), eu.x_road.arireg.producer.Aruande_myygitulu_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_vastus"), eu.x_road.arireg.producer.Aruande_myygitulu_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("toimikuDokument_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokument_v1_Request"), eu.x_road.arireg.producer.Toimiku_dokument_v1_Request.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokument_v1_Request"), eu.x_road.arireg.producer.Toimiku_dokument_v1_Request.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokument_v1_Vastus"), eu.x_road.arireg.producer.Toimiku_dokument_v1_Vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("arikeelud_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_paring"), eu.x_road.arireg.producer.Paringarikeelud_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_paring"), eu.x_road.arireg.producer.Paringarikeelud_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_vastus"), eu.x_road.arireg.producer.Paringarikeelud_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ariregistriToimik_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_Request"), eu.x_road.arireg.producer.Ariregistri_toimik_Request.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_Request"), eu.x_road.arireg.producer.Ariregistri_toimik_Request.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_Response"), eu.x_road.arireg.producer.Ariregistri_toimik_Response.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("detailandmedEP_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_ep_v1_Query"), eu.x_road.arireg.producer.Detailandmed_ep_v1_Query.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_ep_v1_Query"), eu.x_road.arireg.producer.Detailandmed_ep_v1_Query.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_ep_v1_Vastus"), eu.x_road.arireg.producer.Detailandmed_ep_v1_Vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("erakondaKuuluvus_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_paring"), eu.x_road.arireg.producer.Erakondakuuluvus_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_paring"), eu.x_road.arireg.producer.Erakondakuuluvus_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_vastus"), eu.x_road.arireg.producer.Erakondakuuluvus_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("erakonnaNimekiri_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_paring"), eu.x_road.arireg.producer.Erakonnanimekiri_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_paring"), eu.x_road.arireg.producer.Erakonnanimekiri_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_vastus"), eu.x_road.arireg.producer.Erakonnanimekiri_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("esindusIseendaKohta_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_paring"), eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_paring"), eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_vastus"), eu.x_road.arireg.producer.Paringesindus_iseendakohta_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evportaalDigiteeriDokumendid_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriDokumendidParing_v1"), eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriDokumendidParing_v1"), eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriDokumendidVastus_v1"), eu.x_road.arireg.producer.DigiteeriDokumendidVastus_v1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evportaalDigiteeriToimik_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriToimikParing_v1"), eu.x_road.arireg.producer.DigiteeriToimikParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriToimikParing_v1"), eu.x_road.arireg.producer.DigiteeriToimikParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriToimikVastus_v1"), eu.x_road.arireg.producer.DigiteeriToimikVastus_v1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evportaalMargiKattetoimetatuks_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MargiKattetoimetatuksParing_v1"), eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MargiKattetoimetatuksParing_v1"), eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MargiKattetoimetatuksVastus_v1"), eu.x_road.arireg.producer.MargiKattetoimetatuksVastus_v1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaMuudatusedTasutaTootukassa_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_tootukassa_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_tootukassa_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_tootukassa_vastus"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaMuudatusedTasuta_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_vastus"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EVKKanded_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVK_kanded_v1_paring"), eu.x_road.arireg.producer.EVK_kanded_v1_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVK_kanded_v1_paring"), eu.x_road.arireg.producer.EVK_kanded_v1_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVK_kanded_v1_vastus"), eu.x_road.arireg.producer.EVK_kanded_v1_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("kustutamine_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_paring"), eu.x_road.arireg.producer.Kustutamine_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_paring"), eu.x_road.arireg.producer.Kustutamine_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_vastus"), eu.x_road.arireg.producer.Kustutamine_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("kyMenetlusinfo_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Query"), eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Query"), eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Vastus"), eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("kyRegistriosaMuutused_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Query"), eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Query"), eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Vastus"), eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("maaruseDokument_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruse_dokument_Request"), eu.x_road.arireg.producer.Maaruse_dokument_Request.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruse_dokument_Request"), eu.x_road.arireg.producer.Maaruse_dokument_Request.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruse_dokument_Vastus"), eu.x_road.arireg.producer.Maaruse_dokument_Vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("menetlusinfo_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_paring"), eu.x_road.arireg.producer.Menetlusinfo_v3_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_paring"), eu.x_road.arireg.producer.Menetlusinfo_v3_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_vastus"), eu.x_road.arireg.producer.Menetlusinfo_v3_menetlused[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlus_konteiner"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaBilanss_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring"), eu.x_road.arireg.producer.Mtabilanssv3_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring"), eu.x_road.arireg.producer.Mtabilanssv3_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_vastus"), eu.x_road.arireg.producer.Mtabilanssv3_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaBilanssFail_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring"), eu.x_road.arireg.producer.Mtabilanssv3_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring"), eu.x_road.arireg.producer.Mtabilanssv3_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssfv3_vastus"), eu.x_road.arireg.producer.Mtabilanssfv3_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaBilSisu_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring"), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring"), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_vastus"), eu.x_road.arireg.producer.Mtabilsisuv2_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaBilSisuFail_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring"), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring"), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisufv2_vastus"), eu.x_road.arireg.producer.Mtabilsisufv2_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaEvSeisundid_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_paring"), eu.x_road.arireg.producer.Mtaev_seisundid_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_paring"), eu.x_road.arireg.producer.Mtaev_seisundid_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_vastus"), eu.x_road.arireg.producer.Mtaev_seisundid_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaHoiatused_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_paring"), eu.x_road.arireg.producer.Mtahoiatused_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_paring"), eu.x_road.arireg.producer.Mtahoiatused_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_vastus"), eu.x_road.arireg.producer.Mtahoiatused_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaMajPaevik_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_paring"), eu.x_road.arireg.producer.Mtamajpaevik_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_paring"), eu.x_road.arireg.producer.Mtamajpaevik_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_vastus"), eu.x_road.arireg.producer.Mtamajpaevik_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaMajAruOsad_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_paring"), eu.x_road.arireg.producer.Mtamaruosad_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_paring"), eu.x_road.arireg.producer.Mtamaruosad_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_vastus"), eu.x_road.arireg.producer.Mtamaruosad_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaOtsused_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_paring"), eu.x_road.arireg.producer.Mtaotsused_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_paring"), eu.x_road.arireg.producer.Mtaotsused_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_vastus"), eu.x_road.arireg.producer.Mtaotsused_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaPaevik_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_paring"), eu.x_road.arireg.producer.Mtapaevik_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_paring"), eu.x_road.arireg.producer.Mtapaevik_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_vastus"), eu.x_road.arireg.producer.Mtapaevik_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mtaTrahvid_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_paring"), eu.x_road.arireg.producer.Mtatrahvid_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_paring"), eu.x_road.arireg.producer.Mtatrahvid_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_vastus"), eu.x_road.arireg.producer.Mtatrahvid_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("napTasumiseLisamine_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineQuery"), eu.x_road.arireg.producer.NapTasumiseLisamineQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineQuery"), eu.x_road.arireg.producer.NapTasumiseLisamineQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineResponse"), eu.x_road.arireg.producer.NapTasumiseLisamineResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nimeSobivus_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_paring"), eu.x_road.arireg.producer.Paringnimesobivus_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_paring"), eu.x_road.arireg.producer.Paringnimesobivus_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_v2_vastus"), eu.x_road.arireg.producer.Paringnimesobivus_v2_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rkoarr_asutused_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutusedParing_v1"), eu.x_road.arireg.producer.RKOARRAsutusedParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutusedParing_v1"), eu.x_road.arireg.producer.RKOARRAsutusedParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutusedVastus_v1"), eu.x_road.arireg.producer.RKOARRAsutused_v1_Asutus[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "asutus"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registrikaart_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_paring"), eu.x_road.arireg.producer.Registrikaart_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_paring"), eu.x_road.arireg.producer.Registrikaart_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_vastus"), eu.x_road.arireg.producer.Registrikaart_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sooritaKanne_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "SooritaKanne_v4"), eu.x_road.arireg.producer.SooritaKanne_v4.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "SooritaKanne_v4"), eu.x_road.arireg.producer.SooritaKanne_v4.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "SooritaKanneVastus_v4"), eu.x_road.arireg.producer.SooritaKanneVastus_v4.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("toimikuDokumendid_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendidRequest"), eu.x_road.arireg.producer.Toimiku_dokumendidRequest.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendidRequest"), eu.x_road.arireg.producer.Toimiku_dokumendidRequest.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendidVastus"), eu.x_road.arireg.producer.Toimiku_dokumendidVastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transactionStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaQuery"), eu.x_road.arireg.producer.MokaQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaQuery"), eu.x_road.arireg.producer.MokaQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaResponse"), eu.x_road.arireg.producer.MokaResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evapiLooKanne_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneParing_v1"), eu.x_road.arireg.producer.EVapiLooKanneParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneParing_v1"), eu.x_road.arireg.producer.EVapiLooKanneParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneVastus_v1"), eu.x_road.arireg.producer.EVapiLooKanneVastus_v1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evapiKinnitaKanne_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKinnitaKanneParing_v1"), eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKinnitaKanneParing_v1"), eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKinnitaKanneVastus_v1"), eu.x_road.arireg.producer.EVapiKinnitaKanneVastus_v1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evapiKustutaKanne_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKustutaKanneParing_v1"), eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKustutaKanneParing_v1"), eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKustutaKanneVastus_v1"), eu.x_road.arireg.producer.EVapiKustutaKanneVastus_v1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evapiMaaruseDokument_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMaaruseDokumentParing_v1"), eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMaaruseDokumentParing_v1"), eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMaaruseDokumentVastus_v1"), eu.x_road.arireg.producer.EVapiMaaruseDokumentVastus_v1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evapiMenetlusinfo_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfoParing_v1"), eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfoParing_v1"), eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfoVastus_v1"), eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlused[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlus_konteiner"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evapiRiigiloivuViitenumber_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiRiigiloivuViitenumberParing_v1"), eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiRiigiloivuViitenumberParing_v1"), eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiRiigiloivuViitenumberVastus_v1"), eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberVastus_v1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("xbrlAruandeNaitajad_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_naitajad_paring"), eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_naitajad_paring"), eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_naitajad_vastus"), eu.x_road.arireg.producer.Xbrl_aruande_naitajad_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("xbrlEsita_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_paring"), eu.x_road.arireg.producer.Xbrlesita_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_paring"), eu.x_road.arireg.producer.Xbrlesita_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_vastus"), eu.x_road.arireg.producer.Xbrlesita_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("xbrlPdfEsita_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_paring"), eu.x_road.arireg.producer.Xbrlpdfesita_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_paring"), eu.x_road.arireg.producer.Xbrlpdfesita_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_vastus"), eu.x_road.arireg.producer.Xbrlpdfesita_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("xbrlEsindus_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_paring"), eu.x_road.arireg.producer.Xbrlesindusv2_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_paring"), eu.x_road.arireg.producer.Xbrlesindusv2_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_vastus"), eu.x_road.arireg.producer.Xbrlesindusv2_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("earveLisaKlient_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_IN"), eu.x_road.arireg.producer.EarveLisaKlient_v1_IN.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_IN"), eu.x_road.arireg.producer.EarveLisaKlient_v1_IN.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_OUT"), eu.x_road.arireg.producer.EarveLisaKlient_v1_OUT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("earveEemaldaKlient_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_IN"), eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_IN"), eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_OUT"), eu.x_road.arireg.producer.EarveEemaldaKlient_v1_OUT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("earveRegistriParing_v1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_IN"), eu.x_road.arireg.producer.EarveRegistriParing_v1_IN.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_IN"), eu.x_road.arireg.producer.EarveRegistriParing_v1_IN.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_OUT"), eu.x_road.arireg.producer.EarveRegistriParing_v1_OUT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

    }

    public AriregXteeStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AriregXteeStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AriregXteeStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">MokaType>PaymentDesc");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payer>AccountNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payer>Name");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payer>RefNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payer>RegNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payer>TransmissionDate");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payment>Amount");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payment>BaseCurrencyAmount");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payment>Currency");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Payment>Type");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Receiver>AccountNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Receiver>Name");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Receiver>ReceptionDate");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Receiver>RefNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Receiver>RegNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Treasury>BankRef");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Treasury>DocumentNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", ">Treasury>OrderNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aadresskatastrigaType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.AadresskatastrigaType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aadressType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.AadressType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_dokumendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ariregistri_toimik_dokument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_dokument");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_dokument");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ariregistri_toimik_dokument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_hoiatus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ariregistri_toimik_hoiatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_hoiatused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ariregistri_toimik_hoiatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_hoiatus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_otsus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ariregistri_toimik_otsus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_otsused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ariregistri_toimik_otsus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_otsus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_Request");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ariregistri_toimik_Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_Response");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ariregistri_toimik_Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_kirje");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_kirje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_kirje_audiitor");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_kirje_audiitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_kirje_audiitorid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_kirje_audiitor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_kirje_audiitor");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_kirjed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_kirje[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_kirje");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_kirje");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_myygitulu_kirje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_kirje_myygitulu");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_myygitulu_kirje_myygitulu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_kirje_myygitulud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_myygitulu_kirje_myygitulu[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_kirje_myygitulu");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_kirjed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_myygitulu_kirje[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_kirje");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_myygitulu_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Aruande_myygitulu_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1_IN");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DebugAdapter_v1_IN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1_OUT");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DebugAdapter_v1_OUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapterObjMultiHolder");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DebugAdapterObjMultiHolderItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapterObjMultiHolderItem");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapterObjMultiHolderItem");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DebugAdapterObjMultiHolderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapterStringMultiHolder");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_ep_v1_Query");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_ep_v1_Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_ep_v1_Vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_ep_v1_Vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_aadress");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_aadress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_aadressid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_aadress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_aadress");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_arinimed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_arinimi[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_arinimi");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_arinimi");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_arinimi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_aruande_info");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_aruande_info.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_aruande_infod");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_aruande_info[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_aruande_info");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_asutamise_aeg");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_asutamise_aeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_asutamise_ajad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_asutamise_aeg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_asutamise_aeg");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_dokumendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_dokument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_dokument");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_dokument");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_dokument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_eesmargid_kaardil");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_eesmark_kaardil[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_eesmark_kaardil");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_eesmark_kaardil");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_eesmark_kaardil.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esindusoiguse_eritingimus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_esindusoiguse_eritingimus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esindusoiguse_eritingimused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_esindusoiguse_eritingimus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esindusoiguse_eritingimus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esindusoiguse_normaalregulatsioon");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_esindusoiguse_normaalregulatsioon.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esindusoiguse_normaalregulatsioonid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_esindusoiguse_normaalregulatsioon[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esindusoiguse_normaalregulatsioon");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esmanimetamise_aeg");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_esmanimetamise_aeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esmanimetamise_ajad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_esmanimetamise_aeg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_esmanimetamise_aeg");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_ettevotja");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_ettevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_ettevotjad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_ettevotja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_ettevotja");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hooneyhistu_liige");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_hooneyhistu_liige.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hooneyhistu_liikmed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_hooneyhistu_liige[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hooneyhistu_liige");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hy_kitsendus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_hy_kitsendus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hy_kitsendused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_hy_kitsendus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hy_kitsendus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hy_liige");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_hy_liige.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hy_liikmed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_hy_liige[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_hy_liige");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_isikuandmed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_isikuandmed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kaardile_kantud_isik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kaardile_kantud_isik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kaardile_kantud_isikud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kaardile_kantud_isik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kaardile_kantud_isik");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kaardivaline_isik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kaardivaline_isik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kaardivalised_isikud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kaardivaline_isik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kaardivaline_isik");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kanded");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kapital");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kapital.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kapitalid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kapital[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kapital");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kinnisasi");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kinnisasi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kinnisasjad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kinnisasi[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kinnisasi");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kommertspandiandmed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kommertspant[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kommertspant");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kommertspant");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kommertspant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kompromissi_tahtaeg");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kompromissi_tahtaeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kompromissi_tahtajad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kompromissi_tahtaeg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kompromissi_tahtaeg");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_jarjekohad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kp_jarjekoht[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_jarjekoht");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_jarjekoht");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kp_jarjekoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_markus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kp_markus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_markused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kp_markus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_markus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_pandipidaja");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kp_pandipidaja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_pandipidajad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kp_pandipidaja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_pandipidaja");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_pandisumma");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kp_pandisumma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_pandisummad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_kp_pandisumma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_kp_pandisumma");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_maarus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_maarus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_maarused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_maarus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_maarus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_majandusaasta");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_majandusaasta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_majandusaastad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_majandusaasta[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_majandusaasta");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_markus_kaardil");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_markus_kaardil.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_markused_kaardil");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_markus_kaardil[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_markus_kaardil");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_mkrreg_kuupaev");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_mkrreg_kuupaev.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_mkrreg_kuupaevad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_mkrreg_kuupaev[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_mkrreg_kuupaev");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_nimivaartusetaaktsia");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_nimivaartusetaaktsia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_nimivaartusetaaktsiad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_nimivaartusetaaktsia[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_nimivaartusetaaktsia");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oigusjargsus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_oigusjargsus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oigusjargsused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_oigusjargsus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oigusjargsus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oiguslik_vorm");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_oiguslik_vorm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oigusliku_vormi_alaliigid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_oigusliku_vormi_alaliik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oigusliku_vormi_alaliik");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oigusliku_vormi_alaliik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_oigusliku_vormi_alaliik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oiguslikud_vormid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_oiguslik_vorm[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_oiguslik_vorm");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_osa_pandid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_osa_pant[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_osa_pant");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_osa_pant");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_osa_pant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_pandipidaja");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_pandipidaja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_pandipidajad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_pandipidaja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_pandipidaja");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_pohikiri");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_pohikiri.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_pohikirjad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_pohikiri[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_pohikiri");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_Query");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_raamatupidamiskohustus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_raamatupidamiskohustus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_raamatupidamiskohustused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_raamatupidamiskohustus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_raamatupidamiskohustus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_registrikaardid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_registrikaart[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_registrikaart");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_registrikaart");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_registrikaart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_seisundi_muutus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_seisundi_muutus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_seisundi_muutused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_seisundi_muutus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_seisundi_muutus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_sidevahend");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_sidevahend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_sidevahendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_sidevahend[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_sidevahend");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_staatus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_staatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_staatused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_staatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_staatus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_sundlopetamine");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_sundlopetamine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_teatatud_tegevusala");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_teatatud_tegevusala.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_teatatud_tegevusalad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_teatatud_tegevusala[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_teatatud_tegevusala");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_teg_aeg");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_teg_aeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_teg_ajad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_teg_aeg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_teg_aeg");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_tegevusala_kaardil");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_tegevusala_kaardil.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_tegevusalad_kaardil");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_tegevusala_kaardil[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_tegevusala_kaardil");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_tegutsemise_tahtaeg");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_tegutsemise_tahtaeg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_tegutsemise_tahtajad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_tegutsemise_tahtaeg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_tegutsemise_tahtaeg");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_arinimed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_va_arinimi[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_arinimi");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_arinimi");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_va_arinimi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_asukohad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_va_asukoht[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_asukoht");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_asukoht");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_va_asukoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_sisu");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_va_sisu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_sisud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_va_sisu[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_va_sisu");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_valisleping");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_valisleping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_valislepingud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_valisleping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_valisleping");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_valismaa_ariyhing");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_valismaa_ariyhing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_Vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_Vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_yldandmed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Detailandmed_v5_yldandmed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriDokumendidParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriDokumendidVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DigiteeriDokumendidVastus_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriToimikParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DigiteeriToimikParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriToimikVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DigiteeriToimikVastus_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "dokumentType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.DokumentType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_IN");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_Kliendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveEemaldaKlient_v1_Klient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_Klient");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_Klient");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveEemaldaKlient_v1_Klient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_OUT");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveEemaldaKlient_v1_OUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1Response_Kliendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveEemaldaKlient_v1Response_Klient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1Response_Klient");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1Response_Klient");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveEemaldaKlient_v1Response_Klient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_IN");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveLisaKlient_v1_IN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_Kliendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveLisaKlient_v1_Klient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_Klient");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_Klient");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveLisaKlient_v1_Klient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_OUT");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveLisaKlient_v1_OUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1Response_Kliendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveLisaKlient_v1Response_Klient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1Response_Klient");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1Response_Klient");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveLisaKlient_v1Response_Klient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_IN");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveRegistriParing_v1_IN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_OUT");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveRegistriParing_v1_OUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_Registrikoodid");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikood");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1Response_Kliendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveRegistriParing_v1Response_Klient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1Response_Klient");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1Response_Klient");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EarveRegistriParing_v1Response_Klient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "eesmargidType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EesmargidType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "enum_earveEemaldaKlient_v1Response_Klient_Staatus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Enum_earveEemaldaKlient_v1Response_Klient_Staatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "enum_earveLisaKlient_v1Response_Klient_Staatus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Enum_earveLisaKlient_v1Response_Klient_Staatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "enum_earveRegistriParing_v1Response_Klient_Staatus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Enum_earveRegistriParing_v1Response_Klient_Staatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_erakonnad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Erakondakuuluvus_liige[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_liige");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_liige");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Erakondakuuluvus_liige.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Erakondakuuluvus_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Erakondakuuluvus_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_liige");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Erakonnanimekiri_liige.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_liikmed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Erakonnanimekiri_liige[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_liige");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Erakonnanimekiri_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Erakonnanimekiri_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esindusoigusType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EsindusoigusType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokument");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_dokument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokumentide_loetelu_paring_v2");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokumentide_loetelu_vastus_v2");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_vastus_v2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_esmakanded_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_esmakanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_esmakanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_aruanded");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_aruanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_aruanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruanne");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_aruanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_aruanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_kanded");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_kanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_kanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kanne");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_kandeelement");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_kandeelement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_kandevaline");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_kandevaline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_kandevalised");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_kandevaline[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_kandevaline");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kandevaline");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_kanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_kanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_maarus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_maarus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_maarused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_maarus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_maarus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maarus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_tootukassa_kanded");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_tootukassa_kanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kanne");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_tootukassa_kandeelement");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kandeelement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatus_tootukassa_kanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatus_tootukassa_kanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatuse_kanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatuse_kanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuline_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuline_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_tootukassa_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_tootukassa_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_fail_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_fail_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevotja_rekvisiidid_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottega_seotud_isikud_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottega_seotud_isikud_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Seos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seos");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seosed");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ev_seisundType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ev_seisundType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKinnitaKanneParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKinnitaKanneVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiKinnitaKanneVastus_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKustutaKanneParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKustutaKanneVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiKustutaKanneVastus_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneAadress_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKanneAadress_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKannedokumentType_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKannedokumentType_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneIsik_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKanneIsik_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneKandeSisu_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKanneKandeSisu_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneKapital_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKanneKapital_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKanneParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneSidevahend_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKanneSidevahend_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneTegevusala_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKanneTegevusala_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiLooKanneVastus_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMaaruseDokumentParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMaaruseDokumentVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiMaaruseDokumentVastus_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfo_v1_Maarus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Maarus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfo_v1_Menetlus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfo_v1_Menetlused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlused.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfoParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfoVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlused[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfo_v1_Menetlused");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlus_konteiner");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiRiigiloivuViitenumberParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiRiigiloivuViitenumberVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberVastus_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVK_kanded_v1_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVK_kanded_v1_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVK_kanded_v1_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.EVK_kanded_v1_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evk_kapital");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Evk_kapital.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evk_pohikiri");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Evk_pohikiri.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evk_seotud_kandedArray");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Evk_seotud_kanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evk_seotud_kanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evk_seotud_kanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Evk_seotud_kanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "fie_seisundType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Fie_seisundType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "fys_jur_isik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Fys_jur_isik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "isikesindajastorkType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.IsikesindajastorkType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "isikType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.IsikType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kinnisasiType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.KinnisasiType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaator");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Klassifikaator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatori_vaartus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Klassifikaatori_vaartus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatori_vaartused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Klassifikaatori_vaartus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatori_vaartus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatori_vaartus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Klassifikaatorid_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Klassifikaator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaator");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_kirje");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Kustutamine_kirje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_kirjed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Kustutamine_kirje[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_kirje");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Kustutamine_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Kustutamine_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Maarus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Maarus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Query");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Query");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Regosa");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ky_registriosamuut_v1_Regosa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Vastusrida");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastusrida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruse_dokument_Request");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Maaruse_dokument_Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruse_dokument_Vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Maaruse_dokument_Vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruanded_rea_veerg");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Majandusaasta_aruanded_rea_veerg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruanded_rida");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Majandusaasta_aruanded_rida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Majandusaasta_aruanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_kirjed_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_kirjed_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_loetelu_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_loetelu_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Majandusaasta_aruanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruanded");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MargiKattetoimetatuksParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MargiKattetoimetatuksVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.MargiKattetoimetatuksVastus_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "markusLiigigaTegevusega");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.MarkusLiigigaTegevusega.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_dokument");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Menetlusinfo_v3_dokument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_hoiatus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Menetlusinfo_v3_hoiatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_maarus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Menetlusinfo_v3_maarus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_menetlused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Menetlusinfo_v3_menetlused.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Menetlusinfo_v3_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Menetlusinfo_v3_menetlused[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_menetlused");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlus_konteiner");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaQuery");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.MokaQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaResponse");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.MokaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.MokaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssfv3_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilanssfv3_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_bilansid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilanssv3_bilanss[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_bilanss");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_bilanss");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilanssv3_bilanss.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilanssv3_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilanssv3_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisufv2_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilsisufv2_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_aruanded");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilsisuv2_aruanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_aruanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_aruanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilsisuv2_aruanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilsisuv2_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtabilsisuv2_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtaev_seisundid_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_seisund");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtaev_seisundid_seisund.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_seisundid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtaev_seisundid_seisund[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_seisund");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtaev_seisundid_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_hoiatus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtahoiatused_hoiatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_hoiatused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtahoiatused_hoiatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_hoiatus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtahoiatused_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtahoiatused_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_paevik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtamajpaevik_paevik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_paevikud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtamajpaevik_paevik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_paevik");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtamajpaevik_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtamajpaevik_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_osa");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtamaruosad_osa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_osad");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtamaruosad_osa[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_osa");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtamaruosad_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtamaruosad_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_otsus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtaotsused_otsus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_otsused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtaotsused_otsus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_otsus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtaotsused_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtaotsused_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_paevik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtapaevik_paevik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_paevikud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtapaevik_paevik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_paevik");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtapaevik_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtapaevik_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtatrahvid_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_trahv");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtatrahvid_trahv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_trahvid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtatrahvid_trahv[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_trahv");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Mtatrahvid_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineQuery");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.NapTasumiseLisamineQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineResponse");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.NapTasumiseLisamineResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.NapTasumiseLisamineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "omandiOsadType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.OmandiOsadType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "osa_kitsendusedType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Osa_kitsendusedType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_keeld");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringarikeelud_keeld.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_keelud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringarikeelud_keeld[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_keeld");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringarikeelud_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringarikeelud_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_ettevote");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_iseendakohta_ettevote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_ettevotted");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_iseendakohta_ettevote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_ettevote");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_iseendakohta_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_eritingimus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v4_eritingimus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_eritingimused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v4_eritingimus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_eritingimus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_ettevote");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v4_ettevote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_ettevotted");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v4_ettevote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_ettevote");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_isik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v4_isik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_isikud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v4_isik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_isik");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v4_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v4_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_eritingimus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_eritingimus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_eritingimused");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_eritingimus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_eritingimus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_ettevote");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_ettevote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_ettevotted");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_ettevote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_ettevote");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_grupid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_grupp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_grupp");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "grupp");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_grupp");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_grupp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_isik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_isik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_isikud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_isik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_isik");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v6_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringesindus_v6_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_ettevote");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_tasuta_ettevote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_ettevotted");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_tasuta_ettevote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_ettevote");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_kehtetudnimed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_tasuta_kehtetunimi[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_kehtetunimi");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evnimi");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_kehtetunimi");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_tasuta_kehtetunimi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_tasuta_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_tasuta_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_ettevote");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_v5_ettevote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_ettevotted");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_v5_ettevote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_ettevote");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_evaadress");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_v5_evaadress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_evkapital");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_v5_evkapital.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_kehtetudnimed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_v5_kehtetunimi[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_kehtetunimi");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evnimi");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_kehtetunimi");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_v5_kehtetunimi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_v5_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringliht_v5_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringnimesobivus_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_v2_read");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringnimesobivus_v2_rida[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_v2_rida");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_v2_rida");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringnimesobivus_v2_rida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_v2_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Paringnimesobivus_v2_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "Payer");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Payer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "Payment");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "Receiver");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Receiver.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Registrikaart_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Registrikaart_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rekvisiidid_ettevote");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Rekvisiidid_ettevote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rekvisiidid_ettevotted");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Rekvisiidid_ettevote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rekvisiidid_ettevote");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rekvisiidid_evaadress");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Rekvisiidid_evaadress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rekvisiidid_maj_aruanded");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Rekvisiidid_maj_aruanne[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rekvisiidid_maj_aruanne");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruanne");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rekvisiidid_maj_aruanne");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Rekvisiidid_maj_aruanne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "riigiloivType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.RiigiloivType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutused_v1_Asutus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.RKOARRAsutused_v1_Asutus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutused_v1_KOAS");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.RKOARRAsutused_v1_KOAS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutused_v1_Sidevahend");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.RKOARRAsutused_v1_Sidevahend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutusedParing_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.RKOARRAsutusedParing_v1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutusedVastus_v1");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.RKOARRAsutused_v1_Asutus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutused_v1_Asutus");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "asutus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seos");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Seos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotud_isiku_otsing_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Seotud_isiku_otsing_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotud_isiku_otsing_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Seotud_isiku_otsing_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sidevahendType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.SidevahendType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_ametitoiming_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Sooritakanne_ametitoiming_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_ettevotjad_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Sooritakanne_ettevotjad_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_kandesisu_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Sooritakanne_kandesisu_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_kapital_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Sooritakanne_kapital_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_kapitali_tingimuslik_suurendamine_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Sooritakanne_kapitali_tingimuslik_suurendamine_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_majaasta_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Sooritakanne_majaasta_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritakanne_pohikiri_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Sooritakanne_pohikiri_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "SooritaKanne_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.SooritaKanne_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "SooritaKanneVastus_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.SooritaKanneVastus_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "tegevusalaType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.TegevusalaType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendid_dokumendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Toimiku_dokumendid_dokument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendid_dokument");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "dokument");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendid_dokument");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Toimiku_dokumendid_dokument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendidRequest");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Toimiku_dokumendidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendidVastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Toimiku_dokumendidVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokument_v1_Request");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Toimiku_dokument_v1_Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokument_v1_Vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Toimiku_dokument_v1_Vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "Treasury");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Treasury.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "valismaa_emaettevoteType_v4");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Valismaa_emaettevoteType_v4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "x_evk_syndmus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.X_evk_syndmus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "x_formaat");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.X_formaat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "x_nimevastetyyp");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.X_nimevastetyyp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "x_regkaardi_kehtivus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.X_regkaardi_kehtivus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "x_regkaardi_liik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.X_regkaardi_liik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "x_sideliik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.X_sideliik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_audiitor");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrl_aruande_audiitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_audiitorid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrl_aruande_audiitor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_audiitor");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_bilansi_sisu");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_bilansi_sisud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrl_aruande_bilansi_sisu[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_bilansi_sisu");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_myygitulu");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrl_aruande_myygitulu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_myygitulud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrl_aruande_myygitulu[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_myygitulu");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_naitajad_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_naitajad_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrl_aruande_naitajad_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_ettevote");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesindusv2_ettevote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_ettevotted");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesindusv2_ettevote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_ettevote");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesindusv2_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_registrikoodid");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesindusv2_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_audiitor");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_audiitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_audiitorid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_audiitor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_audiitor");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_dokumendid");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws-i.org/profiles/basic/1.1/xsd", "swaRef");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_laiend_audiitor");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_laiend_audiitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_laiend_audiitorid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_laiend_audiitor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_laiend_audiitor");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_myygitulu");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_myygitulu_rida[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_myygitulu_rida");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_myygitulu_rida");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_myygitulu_rida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_osanik");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_osanik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_osanikud");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_osanik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_osanik");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_sidevahend");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_sidevahend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_sidevahendid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_sidevahend[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_sidevahend");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_yldandmed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlesita_yldandmed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_laiend_audiitor");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlpdfesita_laiend_audiitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_laiend_audiitorid");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlpdfesita_laiend_audiitor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_laiend_audiitor");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_myygitulu");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlpdfesita_myygitulu_rida[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_myygitulu_rida");
            qName2 = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_myygitulu_rida");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlpdfesita_myygitulu_rida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_paring");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlpdfesita_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_vastus");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlpdfesita_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_yldandmed");
            cachedSerQNames.add(qName);
            cls = eu.x_road.arireg.producer.Xbrlpdfesita_yldandmed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws-i.org/profiles/basic/1.1/xsd", "swaRef");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadCentralServiceIdentifierType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadClientIdentifierType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadClientIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadGlobalGroupIdentifierType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadIdentifierType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadLocalGroupIdentifierType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadLocalGroupIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadObjectType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadSecurityCategoryIdentifierType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadSecurityCategoryIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadSecurityServerIdentifierType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "XRoadServiceIdentifierType");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.identifiers.XRoadServiceIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", ">notes");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.xroad_xsd.Notes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", ">requestHash");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.xroad_xsd.RequestHash.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", ">techNotes");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.xroad_xsd.TechNotes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", ">title");
            cachedSerQNames.add(qName);
            cls = eu.x_road.xsd.xroad_xsd.Title.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void debugAdapter_v1(eu.x_road.arireg.producer.DebugAdapter_v1_IN keha, eu.x_road.arireg.producer.holders.DebugAdapter_v1_INHolder paring, eu.x_road.arireg.producer.holders.DebugAdapter_v1_OUTHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.DebugAdapter_v1_IN) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.DebugAdapter_v1_IN) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.DebugAdapter_v1_IN.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.DebugAdapter_v1_OUT) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.DebugAdapter_v1_OUT) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.DebugAdapter_v1_OUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void detailandmed_v1(eu.x_road.arireg.producer.Detailandmed_v5_Query keha, eu.x_road.arireg.producer.holders.Detailandmed_v5_QueryHolder paring, eu.x_road.arireg.producer.holders.Detailandmed_v5_VastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Detailandmed_v5_Query) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Detailandmed_v5_Query) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Detailandmed_v5_Query.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Detailandmed_v5_Vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Detailandmed_v5_Vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Detailandmed_v5_Vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevotjaDokumentideLoetelu_v1(eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2 keha, eu.x_road.arireg.producer.holders.Ettevotja_dokumentide_loetelu_paring_v2Holder paring, eu.x_road.arireg.producer.holders.Ettevotja_dokumentide_loetelu_vastus_v2Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaDokumentideLoetelu_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_vastus_v2) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_vastus_v2) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_vastus_v2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevotjaEsmakanded_v1(eu.x_road.arireg.producer.Ettevotja_esmakanded_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_esmakanded_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_esmakanded_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaEsmakanded_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_esmakanded_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_esmakanded_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ettevotja_esmakanded_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_esmakanne[]) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_esmakanne[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ettevotja_esmakanne[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevotjaMuudatusedTasuline_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuline_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuline_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaMuudatusedTasuline_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevotjaRekvisiididFail_v1(eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_fail_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_fail_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaRekvisiididFail_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevotjaRekvisiidid_v1(eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaRekvisiidid_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_rekvisiidid_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_rekvisiidid_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevottegaSeotudIsikud_v1(eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring keha, eu.x_road.arireg.producer.holders.Ettevottega_seotud_isikud_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevottega_seotud_isikud_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottegaSeotudIsikud_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Seos[]) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Seos[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Seos[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void esindus_v1(eu.x_road.arireg.producer.Paringesindus_v4_paring keha, eu.x_road.arireg.producer.holders.Paringesindus_v4_paringHolder paring, eu.x_road.arireg.producer.holders.Paringesindus_v4_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esindus_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Paringesindus_v4_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Paringesindus_v4_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Paringesindus_v4_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Paringesindus_v4_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Paringesindus_v4_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Paringesindus_v4_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void esindus_v2(eu.x_road.arireg.producer.Paringesindus_v6_paring keha, eu.x_road.arireg.producer.holders.Paringesindus_v6_paringHolder paring, eu.x_road.arireg.producer.holders.Paringesindus_v6_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esindus_v2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Paringesindus_v6_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Paringesindus_v6_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Paringesindus_v6_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Paringesindus_v6_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Paringesindus_v6_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Paringesindus_v6_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void klassifikaatorid_v1(eu.x_road.arireg.producer.Klassifikaatorid_paring keha, eu.x_road.arireg.producer.holders.Klassifikaatorid_paringHolder paring, eu.x_road.arireg.producer.holders.Klassifikaatorid_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Klassifikaatorid_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Klassifikaatorid_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Klassifikaatorid_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Klassifikaator[]) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Klassifikaator[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Klassifikaator[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lihtandmedTasuta_v1(eu.x_road.arireg.producer.Paringliht_tasuta_paring keha, eu.x_road.arireg.producer.holders.Paringliht_tasuta_paringHolder paring, eu.x_road.arireg.producer.holders.Paringliht_tasuta_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "lihtandmedTasuta_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Paringliht_tasuta_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Paringliht_tasuta_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Paringliht_tasuta_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Paringliht_tasuta_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Paringliht_tasuta_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Paringliht_tasuta_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lihtandmed_v1(eu.x_road.arireg.producer.Paringliht_v5_paring keha, eu.x_road.arireg.producer.holders.Paringliht_v5_paringHolder paring, eu.x_road.arireg.producer.holders.Paringliht_v5_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "lihtandmed_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Paringliht_v5_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Paringliht_v5_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Paringliht_v5_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Paringliht_v5_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Paringliht_v5_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Paringliht_v5_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void majandusaastaAruanneteLoetelu_v1(eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring keha, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_loetelu_paringHolder paring, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_loetelu_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaastaAruanneteLoetelu_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Majandusaasta_aruanne[]) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Majandusaasta_aruanne[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Majandusaasta_aruanne[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void majandusaastaAruanneteKirjed_v1(eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring keha, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_kirjed_paringHolder paring, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_kirjed_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaastaAruanneteKirjed_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void seotudIsikuOtsing_v1(eu.x_road.arireg.producer.Seotud_isiku_otsing_paring keha, eu.x_road.arireg.producer.holders.Seotud_isiku_otsing_paringHolder paring, eu.x_road.arireg.producer.holders.Seotud_isiku_otsing_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotudIsikuOtsing_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Seotud_isiku_otsing_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Seotud_isiku_otsing_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Seotud_isiku_otsing_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Seotud_isiku_otsing_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Seotud_isiku_otsing_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Seotud_isiku_otsing_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void aruandeAuditeerimiseAndmed_v1(eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring keha, eu.x_road.arireg.producer.holders.Aruande_auditeerimiseandmed_paringHolder paring, eu.x_road.arireg.producer.holders.Aruande_auditeerimiseandmed_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruandeAuditeerimiseAndmed_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void aruandeMyygituluEMTAKjargi_v1(eu.x_road.arireg.producer.Aruande_myygitulu_paring keha, eu.x_road.arireg.producer.holders.Aruande_myygitulu_paringHolder paring, eu.x_road.arireg.producer.holders.Aruande_myygitulu_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruandeMyygituluEMTAKjargi_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Aruande_myygitulu_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Aruande_myygitulu_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Aruande_myygitulu_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Aruande_myygitulu_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Aruande_myygitulu_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Aruande_myygitulu_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void toimikuDokument_v1(eu.x_road.arireg.producer.Toimiku_dokument_v1_Request keha, eu.x_road.arireg.producer.holders.Toimiku_dokument_v1_RequestHolder paring, eu.x_road.arireg.producer.holders.Toimiku_dokument_v1_VastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimikuDokument_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Toimiku_dokument_v1_Request) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Toimiku_dokument_v1_Request) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Toimiku_dokument_v1_Request.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Toimiku_dokument_v1_Vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Toimiku_dokument_v1_Vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Toimiku_dokument_v1_Vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void arikeelud_v1(eu.x_road.arireg.producer.Paringarikeelud_paring keha, eu.x_road.arireg.producer.holders.Paringarikeelud_paringHolder paring, eu.x_road.arireg.producer.holders.Paringarikeelud_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "arikeelud_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Paringarikeelud_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Paringarikeelud_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Paringarikeelud_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Paringarikeelud_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Paringarikeelud_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Paringarikeelud_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ariregistriToimik_v1(eu.x_road.arireg.producer.Ariregistri_toimik_Request keha, eu.x_road.arireg.producer.holders.Ariregistri_toimik_RequestHolder paring, eu.x_road.arireg.producer.holders.Ariregistri_toimik_ResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistriToimik_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ariregistri_toimik_Request) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ariregistri_toimik_Request) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ariregistri_toimik_Request.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ariregistri_toimik_Response) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ariregistri_toimik_Response) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ariregistri_toimik_Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void detailandmedEP_v1(eu.x_road.arireg.producer.Detailandmed_ep_v1_Query keha, eu.x_road.arireg.producer.holders.Detailandmed_ep_v1_QueryHolder paring, eu.x_road.arireg.producer.holders.Detailandmed_ep_v1_VastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmedEP_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Detailandmed_ep_v1_Query) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Detailandmed_ep_v1_Query) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Detailandmed_ep_v1_Query.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Detailandmed_ep_v1_Vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Detailandmed_ep_v1_Vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Detailandmed_ep_v1_Vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void erakondaKuuluvus_v1(eu.x_road.arireg.producer.Erakondakuuluvus_paring keha, eu.x_road.arireg.producer.holders.Erakondakuuluvus_paringHolder paring, eu.x_road.arireg.producer.holders.Erakondakuuluvus_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondaKuuluvus_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Erakondakuuluvus_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Erakondakuuluvus_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Erakondakuuluvus_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Erakondakuuluvus_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Erakondakuuluvus_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Erakondakuuluvus_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void erakonnaNimekiri_v1(eu.x_road.arireg.producer.Erakonnanimekiri_paring keha, eu.x_road.arireg.producer.holders.Erakonnanimekiri_paringHolder paring, eu.x_road.arireg.producer.holders.Erakonnanimekiri_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnaNimekiri_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Erakonnanimekiri_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Erakonnanimekiri_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Erakonnanimekiri_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Erakonnanimekiri_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Erakonnanimekiri_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Erakonnanimekiri_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void esindusIseendaKohta_v1(eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring keha, eu.x_road.arireg.producer.holders.Paringesindus_iseendakohta_paringHolder paring, eu.x_road.arireg.producer.holders.Paringesindus_iseendakohta_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esindusIseendaKohta_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Paringesindus_iseendakohta_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Paringesindus_iseendakohta_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Paringesindus_iseendakohta_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evportaalDigiteeriDokumendid_v1(eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1 keha, eu.x_road.arireg.producer.holders.DigiteeriDokumendidParing_v1Holder paring, eu.x_road.arireg.producer.holders.DigiteeriDokumendidVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evportaalDigiteeriDokumendid_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.DigiteeriDokumendidVastus_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.DigiteeriDokumendidVastus_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.DigiteeriDokumendidVastus_v1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evportaalDigiteeriToimik_v1(eu.x_road.arireg.producer.DigiteeriToimikParing_v1 keha, eu.x_road.arireg.producer.holders.DigiteeriToimikParing_v1Holder paring, eu.x_road.arireg.producer.holders.DigiteeriToimikVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evportaalDigiteeriToimik_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.DigiteeriToimikParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.DigiteeriToimikParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.DigiteeriToimikParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.DigiteeriToimikVastus_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.DigiteeriToimikVastus_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.DigiteeriToimikVastus_v1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evportaalMargiKattetoimetatuks_v1(eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1 keha, eu.x_road.arireg.producer.holders.MargiKattetoimetatuksParing_v1Holder paring, eu.x_road.arireg.producer.holders.MargiKattetoimetatuksVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evportaalMargiKattetoimetatuks_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.MargiKattetoimetatuksVastus_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.MargiKattetoimetatuksVastus_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.MargiKattetoimetatuksVastus_v1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevotjaMuudatusedTasutaTootukassa_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_tootukassa_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_tootukassa_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaMuudatusedTasutaTootukassa_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevotjaMuudatusedTasuta_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaMuudatusedTasuta_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void EVKKanded_v1(eu.x_road.arireg.producer.EVK_kanded_v1_paring keha, eu.x_road.arireg.producer.holders.EVK_kanded_v1_paringHolder paring, eu.x_road.arireg.producer.holders.EVK_kanded_v1_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVKKanded_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EVK_kanded_v1_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EVK_kanded_v1_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EVK_kanded_v1_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EVK_kanded_v1_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EVK_kanded_v1_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EVK_kanded_v1_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void kustutamine_v1(eu.x_road.arireg.producer.Kustutamine_paring keha, eu.x_road.arireg.producer.holders.Kustutamine_paringHolder paring, eu.x_road.arireg.producer.holders.Kustutamine_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Kustutamine_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Kustutamine_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Kustutamine_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Kustutamine_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Kustutamine_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Kustutamine_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void kyMenetlusinfo_v1(eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query keha, eu.x_road.arireg.producer.holders.Ky_menetlusinfo_v2_QueryHolder paring, eu.x_road.arireg.producer.holders.Ky_menetlusinfo_v2_VastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kyMenetlusinfo_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void kyRegistriosaMuutused_v1(eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query keha, eu.x_road.arireg.producer.holders.Ky_registriosamuut_v1_QueryHolder paring, eu.x_road.arireg.producer.holders.Ky_registriosamuut_v1_VastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kyRegistriosaMuutused_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void maaruseDokument_v1(eu.x_road.arireg.producer.Maaruse_dokument_Request keha, eu.x_road.arireg.producer.holders.Maaruse_dokument_RequestHolder paring, eu.x_road.arireg.producer.holders.Maaruse_dokument_VastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruseDokument_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Maaruse_dokument_Request) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Maaruse_dokument_Request) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Maaruse_dokument_Request.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Maaruse_dokument_Vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Maaruse_dokument_Vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Maaruse_dokument_Vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void menetlusinfo_v1(eu.x_road.arireg.producer.Menetlusinfo_v3_paring keha, eu.x_road.arireg.producer.holders.Menetlusinfo_v3_paringHolder paring, eu.x_road.arireg.producer.holders.Menetlusinfo_v3_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Menetlusinfo_v3_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Menetlusinfo_v3_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Menetlusinfo_v3_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Menetlusinfo_v3_menetlused[]) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Menetlusinfo_v3_menetlused[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Menetlusinfo_v3_menetlused[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaBilanss_v1(eu.x_road.arireg.producer.Mtabilanssv3_paring keha, eu.x_road.arireg.producer.holders.Mtabilanssv3_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilanssv3_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaBilanss_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtabilanssv3_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtabilanssv3_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtabilanssv3_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtabilanssv3_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtabilanssv3_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtabilanssv3_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaBilanssFail_v1(eu.x_road.arireg.producer.Mtabilanssv3_paring keha, eu.x_road.arireg.producer.holders.Mtabilanssv3_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilanssfv3_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaBilanssFail_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtabilanssv3_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtabilanssv3_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtabilanssv3_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtabilanssfv3_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtabilanssfv3_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtabilanssfv3_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaBilSisu_v1(eu.x_road.arireg.producer.Mtabilsisuv2_paring keha, eu.x_road.arireg.producer.holders.Mtabilsisuv2_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilsisuv2_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaBilSisu_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtabilsisuv2_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtabilsisuv2_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtabilsisuv2_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtabilsisuv2_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtabilsisuv2_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaBilSisuFail_v1(eu.x_road.arireg.producer.Mtabilsisuv2_paring keha, eu.x_road.arireg.producer.holders.Mtabilsisuv2_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilsisufv2_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaBilSisuFail_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtabilsisuv2_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtabilsisuv2_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtabilsisufv2_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtabilsisufv2_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtabilsisufv2_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaEvSeisundid_v1(eu.x_road.arireg.producer.Mtaev_seisundid_paring keha, eu.x_road.arireg.producer.holders.Mtaev_seisundid_paringHolder paring, eu.x_road.arireg.producer.holders.Mtaev_seisundid_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaEvSeisundid_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtaev_seisundid_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtaev_seisundid_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtaev_seisundid_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtaev_seisundid_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtaev_seisundid_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtaev_seisundid_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaHoiatused_v1(eu.x_road.arireg.producer.Mtahoiatused_paring keha, eu.x_road.arireg.producer.holders.Mtahoiatused_paringHolder paring, eu.x_road.arireg.producer.holders.Mtahoiatused_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaHoiatused_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtahoiatused_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtahoiatused_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtahoiatused_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtahoiatused_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtahoiatused_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtahoiatused_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaMajPaevik_v1(eu.x_road.arireg.producer.Mtamajpaevik_paring keha, eu.x_road.arireg.producer.holders.Mtamajpaevik_paringHolder paring, eu.x_road.arireg.producer.holders.Mtamajpaevik_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaMajPaevik_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtamajpaevik_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtamajpaevik_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtamajpaevik_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtamajpaevik_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtamajpaevik_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtamajpaevik_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaMajAruOsad_v1(eu.x_road.arireg.producer.Mtamaruosad_paring keha, eu.x_road.arireg.producer.holders.Mtamaruosad_paringHolder paring, eu.x_road.arireg.producer.holders.Mtamaruosad_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaMajAruOsad_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtamaruosad_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtamaruosad_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtamaruosad_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtamaruosad_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtamaruosad_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtamaruosad_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaOtsused_v1(eu.x_road.arireg.producer.Mtaotsused_paring keha, eu.x_road.arireg.producer.holders.Mtaotsused_paringHolder paring, eu.x_road.arireg.producer.holders.Mtaotsused_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaOtsused_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtaotsused_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtaotsused_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtaotsused_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtaotsused_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtaotsused_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtaotsused_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaPaevik_v1(eu.x_road.arireg.producer.Mtapaevik_paring keha, eu.x_road.arireg.producer.holders.Mtapaevik_paringHolder paring, eu.x_road.arireg.producer.holders.Mtapaevik_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaPaevik_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtapaevik_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtapaevik_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtapaevik_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtapaevik_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtapaevik_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtapaevik_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void mtaTrahvid_v1(eu.x_road.arireg.producer.Mtatrahvid_paring keha, eu.x_road.arireg.producer.holders.Mtatrahvid_paringHolder paring, eu.x_road.arireg.producer.holders.Mtatrahvid_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaTrahvid_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Mtatrahvid_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Mtatrahvid_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Mtatrahvid_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Mtatrahvid_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Mtatrahvid_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Mtatrahvid_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void napTasumiseLisamine_v1(eu.x_road.arireg.producer.NapTasumiseLisamineQuery keha, eu.x_road.arireg.producer.holders.NapTasumiseLisamineQueryHolder paring, eu.x_road.arireg.producer.holders.NapTasumiseLisamineResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "napTasumiseLisamine_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.NapTasumiseLisamineQuery) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.NapTasumiseLisamineQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.NapTasumiseLisamineQuery.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.NapTasumiseLisamineResponse) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.NapTasumiseLisamineResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.NapTasumiseLisamineResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void nimeSobivus_v1(eu.x_road.arireg.producer.Paringnimesobivus_paring keha, eu.x_road.arireg.producer.holders.Paringnimesobivus_paringHolder paring, eu.x_road.arireg.producer.holders.Paringnimesobivus_v2_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "nimeSobivus_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Paringnimesobivus_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Paringnimesobivus_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Paringnimesobivus_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Paringnimesobivus_v2_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Paringnimesobivus_v2_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Paringnimesobivus_v2_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void rkoarr_asutused_v1(eu.x_road.arireg.producer.RKOARRAsutusedParing_v1 keha, eu.x_road.arireg.producer.holders.RKOARRAsutusedParing_v1Holder paring, eu.x_road.arireg.producer.holders.RKOARRAsutusedVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rkoarr_asutused_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.RKOARRAsutusedParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.RKOARRAsutusedParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.RKOARRAsutusedParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.RKOARRAsutused_v1_Asutus[]) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.RKOARRAsutused_v1_Asutus[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.RKOARRAsutused_v1_Asutus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void registrikaart_v1(eu.x_road.arireg.producer.Registrikaart_paring keha, eu.x_road.arireg.producer.holders.Registrikaart_paringHolder paring, eu.x_road.arireg.producer.holders.Registrikaart_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Registrikaart_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Registrikaart_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Registrikaart_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Registrikaart_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Registrikaart_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Registrikaart_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void sooritaKanne_v1(eu.x_road.arireg.producer.SooritaKanne_v4 keha, eu.x_road.arireg.producer.holders.SooritaKanne_v4Holder paring, eu.x_road.arireg.producer.holders.SooritaKanneVastus_v4Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritaKanne_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.SooritaKanne_v4) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.SooritaKanne_v4) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.SooritaKanne_v4.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.SooritaKanneVastus_v4) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.SooritaKanneVastus_v4) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.SooritaKanneVastus_v4.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void toimikuDokumendid_v1(eu.x_road.arireg.producer.Toimiku_dokumendidRequest keha, eu.x_road.arireg.producer.holders.Toimiku_dokumendidRequestHolder paring, eu.x_road.arireg.producer.holders.Toimiku_dokumendidVastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimikuDokumendid_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Toimiku_dokumendidRequest) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Toimiku_dokumendidRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Toimiku_dokumendidRequest.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Toimiku_dokumendidVastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Toimiku_dokumendidVastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Toimiku_dokumendidVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void transactionStatement(eu.x_road.arireg.producer.MokaQuery keha, eu.x_road.arireg.producer.holders.MokaQueryHolder paring, eu.x_road.arireg.producer.holders.MokaResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "transactionStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.MokaQuery) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.MokaQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.MokaQuery.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.MokaResponse) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.MokaResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.MokaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evapiLooKanne_v1(eu.x_road.arireg.producer.EVapiLooKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiLooKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiLooKanneVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiLooKanne_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EVapiLooKanneParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EVapiLooKanneParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EVapiLooKanneParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EVapiLooKanneVastus_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EVapiLooKanneVastus_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EVapiLooKanneVastus_v1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evapiKinnitaKanne_v1(eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiKinnitaKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiKinnitaKanneVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiKinnitaKanne_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EVapiKinnitaKanneVastus_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EVapiKinnitaKanneVastus_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EVapiKinnitaKanneVastus_v1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evapiKustutaKanne_v1(eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiKustutaKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiKustutaKanneVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiKustutaKanne_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EVapiKustutaKanneVastus_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EVapiKustutaKanneVastus_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EVapiKustutaKanneVastus_v1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evapiMaaruseDokument_v1(eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiMaaruseDokumentParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiMaaruseDokumentVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiMaaruseDokument_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EVapiMaaruseDokumentVastus_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EVapiMaaruseDokumentVastus_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EVapiMaaruseDokumentVastus_v1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evapiMenetlusinfo_v1(eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiMenetlusinfoParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiMenetlusinfoVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiMenetlusinfo_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlused[]) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlused[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlused[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void evapiRiigiloivuViitenumber_v1(eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiRiigiloivuViitenumberParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiRiigiloivuViitenumberVastus_v1Holder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiRiigiloivuViitenumber_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberVastus_v1) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberVastus_v1) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberVastus_v1.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void xbrlAruandeNaitajad_v1(eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring keha, eu.x_road.arireg.producer.holders.Xbrl_aruande_naitajad_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrl_aruande_naitajad_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlAruandeNaitajad_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Xbrl_aruande_naitajad_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Xbrl_aruande_naitajad_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Xbrl_aruande_naitajad_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void xbrlEsita_v1(eu.x_road.arireg.producer.Xbrlesita_paring keha, eu.x_road.arireg.producer.holders.Xbrlesita_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlesita_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlEsita_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Xbrlesita_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Xbrlesita_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Xbrlesita_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Xbrlesita_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Xbrlesita_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Xbrlesita_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void xbrlPdfEsita_v1(eu.x_road.arireg.producer.Xbrlpdfesita_paring keha, eu.x_road.arireg.producer.holders.Xbrlpdfesita_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlpdfesita_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlPdfEsita_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Xbrlpdfesita_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Xbrlpdfesita_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Xbrlpdfesita_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Xbrlpdfesita_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Xbrlpdfesita_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Xbrlpdfesita_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void xbrlEsindus_v1(eu.x_road.arireg.producer.Xbrlesindusv2_paring keha, eu.x_road.arireg.producer.holders.Xbrlesindusv2_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlesindusv2_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlEsindus_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.Xbrlesindusv2_paring) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.Xbrlesindusv2_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.Xbrlesindusv2_paring.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.Xbrlesindusv2_vastus) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.Xbrlesindusv2_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.Xbrlesindusv2_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void earveLisaKlient_v1(eu.x_road.arireg.producer.EarveLisaKlient_v1_IN keha, eu.x_road.arireg.producer.holders.EarveLisaKlient_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveLisaKlient_v1_OUTHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EarveLisaKlient_v1_IN) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EarveLisaKlient_v1_IN) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EarveLisaKlient_v1_IN.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EarveLisaKlient_v1_OUT) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EarveLisaKlient_v1_OUT) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EarveLisaKlient_v1_OUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void earveEemaldaKlient_v1(eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN keha, eu.x_road.arireg.producer.holders.EarveEemaldaKlient_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveEemaldaKlient_v1_OUTHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EarveEemaldaKlient_v1_OUT) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EarveEemaldaKlient_v1_OUT) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EarveEemaldaKlient_v1_OUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void earveRegistriParing_v1(eu.x_road.arireg.producer.EarveRegistriParing_v1_IN keha, eu.x_road.arireg.producer.holders.EarveRegistriParing_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveRegistriParing_v1_OUTHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                paring.value = (eu.x_road.arireg.producer.EarveRegistriParing_v1_IN) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (eu.x_road.arireg.producer.EarveRegistriParing_v1_IN) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring")), eu.x_road.arireg.producer.EarveRegistriParing_v1_IN.class);
            }
            try {
                keha2.value = (eu.x_road.arireg.producer.EarveRegistriParing_v1_OUT) _output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (eu.x_road.arireg.producer.EarveRegistriParing_v1_OUT) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha")), eu.x_road.arireg.producer.EarveRegistriParing_v1_OUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
