/**
 * Mtr_bindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Mtr_bindingStub extends org.apache.axis.client.Stub implements ee.x_road.mtr.producer.Mtr_porttype {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[40];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("legacyEttevotja");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "legacy_response"));
        oper.setReturnClass(ee.x_road.xsd.x_road_xsd.Legacy_response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotja");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaParing"), ee.x_road.mtr.producer.EttevotjaParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.EttevotjaVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaDetailne");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneParing"), ee.x_road.mtr.producer.EttevotjaDetailneParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ettevotja"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaDetailneMuinsuskaitse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneMuinsuskaitseParing"), ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneMuinsuskaitseVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ettevotja"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loadClassificator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificator>request"), ee.x_road.mtr.producer.LoadClassificatorRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificatorResponse>request"), ee.x_road.mtr.producer.LoadClassificatorResponseRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "response"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificatorResponse>response"), ee.x_road.mtr.producer.LoadClassificatorResponseResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("turismialamliigid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiAlamliigidVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TurismiAlamliigidVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("turismiettevotjad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiettevõtjadPäring"), ee.x_road.mtr.producer.TurismiettevõtjadPäring.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiEttevõtjadVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TurismiEttevõtjadVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("turismiettevotjadetailne");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "AsutusDetailne"));
        oper.setReturnClass(ee.x_road.mtr.producer.AsutusDetailne.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tegevusluba");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaParing"), ee.x_road.mtr.producer.TegevuslubaParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaVastusV2"));
        oper.setReturnClass(ee.x_road.mtr.producer.TegevuslubaVastusV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tegevuslubaSotsiaalhooldus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaSotsiaalhooldusParing"), ee.x_road.mtr.producer.TegevuslubaSotsiaalhooldusParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaVastusV2"));
        oper.setReturnClass(ee.x_road.mtr.producer.TegevuslubaVastusV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registreering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringParing"), ee.x_road.mtr.producer.RegistreeringParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistriKanneVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.RegistriKanneVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registreeringDetailne");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringDetailneParing"), ee.x_road.mtr.producer.RegistreeringDetailneParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringDetailneVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.RegistreeringDetailneVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registreeringMIKO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringMIKOParing"), ee.x_road.mtr.producer.RegistreeringMIKOParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringMIKOVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.RegistreeringMIKOVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("soidukikaart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaKoodiParing"), ee.x_road.mtr.producer.EttevotjaKoodiParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoidukikaardiVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.SoidukikaardiVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("soitjavedu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaKoodiParing"), ee.x_road.mtr.producer.EttevotjaKoodiParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoitjaveduVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.SoitjaveduVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taksoluba");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaksolubaParing"), ee.x_road.mtr.producer.TaksolubaParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaksolubaVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaksolubaVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("vastutavaIsikuTeated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeatedParing"), ee.x_road.mtr.producer.VastutavaIsikuTeatedParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeatedVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.VastutavaIsikuTeade[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "teade"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("muudaVastutavaIsikuNousolek");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "muudaVastutavaIsikuNousolekParing"), ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "muudaVastutavaIsikuNousolekVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("minuTaotlused");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusedParing"), ee.x_road.mtr.producer.MinuTaotlusedParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusedVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.MinuTaotlusedVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("minuTaotlus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusParing"), ee.x_road.mtr.producer.MinuTaotlusParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.MinuTaotlusVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salvestaTaotlus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaTaotlusParing"), ee.x_road.mtr.producer.SalvestaTaotlusParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaTaotlusVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.SalvestaTaotlusVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("valiTaotlus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotlusParing"), ee.x_road.mtr.producer.ValiTaotlusParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotlusVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.ValiTaotlusVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseEttevotjaOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotjaOtsingParing"), ee.x_road.mtr.producer.TaotluseEttevotjaOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotjaOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseEttevotja[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ettevotja"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseIsikuOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsikuOtsingParing"), ee.x_road.mtr.producer.TaotluseIsikuOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsikuOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseIsik[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "isik"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("valiTaotluseTegevusala");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotluseTegevusalaParing"), ee.x_road.mtr.producer.ValiTaotluseTegevusalaParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotluseTegevusalaVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseValdkond[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "Valdkond"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("kinnitatavMajandustegevus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitatavMajandustegevusParing"), ee.x_road.mtr.producer.KinnitatavMajandustegevusParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitatavMajandustegevusVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.Majandustegevus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "majandustegevus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("kinnitaMajandustegevus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitaMajandustegevusParing"), ee.x_road.mtr.producer.KinnitaMajandustegevusParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitaMajandustegevusVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.KinnitaMajandustegevusVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseAadressiOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadressiOtsingParing"), ee.x_road.mtr.producer.TaotluseAadressiOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadressiOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseAadress[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "aadress"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseSoidukiOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoidukiOtsingParing"), ee.x_road.mtr.producer.TaotluseSoidukiOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoidukiOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseSoiduk[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "soiduk"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseKutsetunnistuseOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistuseOtsingParing"), ee.x_road.mtr.producer.TaotluseKutsetunnistuseOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistuseOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseKutsetunnistus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "tunnistus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotlusePadevustunnistuseOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistuseOtsingParing"), ee.x_road.mtr.producer.TaotlusePadevustunnistuseOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistuseOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotlusePadevustunnistus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "tunnistus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseLoendiOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiOtsingParing"), ee.x_road.mtr.producer.TaotluseLoendiOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseLoendiOtsingVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseKapitaliOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapitaliOtsingParing"), ee.x_road.mtr.producer.TaotluseKapitaliOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapitaliOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseKapital[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "kapital"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseHariduseOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHariduseOtsingParing"), ee.x_road.mtr.producer.TaotluseHariduseOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHariduseOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseHaridus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "haridus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taotluseTaksoYlevaatuseOtsing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatuseOtsingParing"), ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatuseOtsingVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "takso_ylevaatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkTransportManagerGoodRepute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CheckTransportManagerGoodReputeRequest_Body"), ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CheckTransportManagerGoodReputeResponse_Body"));
        oper.setReturnClass(ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse_Body.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("salvestaEttekirjutus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaEttekirjutusParing"), ee.x_road.mtr.producer.SalvestaEttekirjutusParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaEttekirjutusVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.SalvestaEttekirjutusVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fokaHooldaja");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajaParing"), ee.x_road.mtr.producer.FokaHooldajaParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajaVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.FokaHooldajaVastus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fokaHooldajad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajadParing"), ee.x_road.mtr.producer.FokaHooldajadParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajadVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "hooldaja"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("andmeteMuudatused");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "andmeteMuudatusedParing"), ee.x_road.mtr.producer.AndmeteMuudatusedParing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "andmeteMuudatusedVastus"));
        oper.setReturnClass(ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "muudatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    public Mtr_bindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Mtr_bindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Mtr_bindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>>>>loadClassificatorResponse>response>classificators>valdkonnad>valdkond>tegevusalad>tegevusala>nimi");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusalaNimi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>>>loadClassificatorResponse>response>classificators>valdkonnad>valdkond>tegevusalad>tegevusala");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>>loadClassificatorResponse>response>classificators>tyypteemad>tyypteema>kirjeldus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaKirjeldus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>>loadClassificatorResponse>response>classificators>tyypteemad>tyypteema>nimi");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteemaNimi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>>loadClassificatorResponse>response>classificators>valdkonnad>valdkond>nimi");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondNimi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>>loadClassificatorResponse>response>classificators>valdkonnad>valdkond>tegevusalad");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkondTegevusaladTegevusala[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>>>loadClassificatorResponse>response>classificators>valdkonnad>valdkond>tegevusalad>tegevusala");
            qName2 = new javax.xml.namespace.QName("", "tegevusala");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>loadClassificatorResponse>response>classificators>tyypteemad>tyypteema");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>loadClassificatorResponse>response>classificators>valdkonnad>valdkond");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>erihoolekandeteenused>tegevuskohad>tegevuskoht>juhendajad>juhendaja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>erihoolekandeteenused>tegevuskohad>tegevuskoht>sihtgrupid>sihtgrupp");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>fokaHooldajaVastus>foka_hooldaja>seotud_ettevotted>ettevote>loa_liik");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevoteLoa_liik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>loadClassificatorResponse>response>classificators>tyypteemad");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsTyypteemadTyypteema[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>loadClassificatorResponse>response>classificators>tyypteemad>tyypteema");
            qName2 = new javax.xml.namespace.QName("", "tyypteema");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>loadClassificatorResponse>response>classificators>valdkonnad");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificatorsValdkonnadValdkond[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>>loadClassificatorResponse>response>classificators>valdkonnad>valdkond");
            qName2 = new javax.xml.namespace.QName("", "valdkond");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>meeskond>liige");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtMeeskondLiige.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>sihtgrupid>sihtgrupp");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>teenused>teenus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>erihoolekandeteenused>tegevuskohad>tegevuskoht>juhendajad");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtJuhendajadJuhendaja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>erihoolekandeteenused>tegevuskohad>tegevuskoht>juhendajad>juhendaja");
            qName2 = new javax.xml.namespace.QName("", "juhendaja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>erihoolekandeteenused>tegevuskohad>tegevuskoht>sihtgrupid");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>erihoolekandeteenused>tegevuskohad>tegevuskoht>sihtgrupid>sihtgrupp");
            qName2 = new javax.xml.namespace.QName("", "sihtgrupp");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>EttevotjaVastus>ettevotjad>ettevotja>registrikanded");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registrikanneType");
            qName2 = new javax.xml.namespace.QName("", "registrikanne");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>fokaHooldajaVastus>foka_hooldaja>seotud_ettevotted>ettevote");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>loadClassificatorResponse>response>classificatorNames");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>loadClassificatorResponse>response>classificators");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponseClassificators.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>meeskond");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtMeeskondLiige[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>meeskond>liige");
            qName2 = new javax.xml.namespace.QName("", "liige");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>sihtgrupid");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtSihtgrupidSihtgrupp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>sihtgrupid>sihtgrupp");
            qName2 = new javax.xml.namespace.QName("", "sihtgrupp");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>teenused");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskohtTeenusedTeenus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht>teenused>teenus");
            qName2 = new javax.xml.namespace.QName("", "teenus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>salvestaEttekirjutusParing>ettekirjutus>ettekirjutuseRida>arhiveerimisePohjus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRidaArhiveerimisePohjus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>salvestaEttekirjutusParing>ettekirjutus>ettekirjutuseRida>sunniraha");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>andmeteMuudatusedVastus>muudatus>isik");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusIsik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>andmeteMuudatusedVastus>muudatus>soiduk");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusSoiduk.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>andmeteMuudatusedVastus>muudatus>tegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatusTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>erihoolekandeteenused>tegevuskohad>tegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>EttevotjaDetailneMuinsuskaitseVastus>ettevotja>yldinfo");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotjaYldinfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>EttevotjaDetailneVastus>ettevotja>yldinfo");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotjaYldinfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>EttevotjaVastus>ettevotjad>ettevotja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaVastusEttevotjadEttevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>fokaHooldajaVastus>foka_hooldaja>kliima");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaKliima.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>fokaHooldajaVastus>foka_hooldaja>seotud_ettevotted");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaSeotud_ettevottedEttevote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>>fokaHooldajaVastus>foka_hooldaja>seotud_ettevotted>ettevote");
            qName2 = new javax.xml.namespace.QName("", "ettevote");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>fokaHooldajaVastus>foka_hooldaja>tuletorje");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldajaTuletorje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificator>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificatorResponse>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificatorResponse>response");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.LoadClassificatorResponseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>RegistriKanneVastus>kirjed>kirje");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistriKanneVastusKirjedKirje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>salvestaEttekirjutusParing>ettekirjutus>ettekirjutuseRida");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusEttekirjutuseRida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>salvestaEttekirjutusParing>ettekirjutus>staatus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusStaatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>salvestaEttekirjutusParing>ettekirjutus>tegevusala");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutusTegevusala.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>TegevuslubaVastusV2>kirjed>kirje");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevuslubaVastusV2KirjedKirje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">andmeteMuudatused");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AndmeteMuudatused.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">andmeteMuudatusedResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AndmeteMuudatusedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">andmeteMuudatusedVastus>muudatus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">erihoolekandeteenused>tegevuskohad");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ErihoolekandeteenusedTegevuskohadTegevuskoht[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>erihoolekandeteenused>tegevuskohad>tegevuskoht");
            qName2 = new javax.xml.namespace.QName("", "tegevuskoht");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">EttevotjaDetailneMuinsuskaitseVastus>ettevotja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">EttevotjaDetailneVastus>ettevotja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">EttevotjaVastus>ettevotjad");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaVastusEttevotjadEttevotja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>EttevotjaVastus>ettevotjad>ettevotja");
            qName2 = new javax.xml.namespace.QName("", "ettevotja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldaja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldaja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldajad");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldajadParing>aine");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajadParingAine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldajadParing>tyyp");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajadParingTyyp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldajadResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldajadVastus>hooldaja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldajaResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldajaVastus>foka_hooldaja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaVastusFoka_hooldaja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">isikukood");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">kinnitaMajandustegevus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KinnitaMajandustegevus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">kinnitaMajandustegevusResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KinnitaMajandustegevusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">kinnitatavMajandustegevus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KinnitatavMajandustegevus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">kinnitatavMajandustegevusResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KinnitatavMajandustegevusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">kohtadeArvudType>kohtadearv");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">kood");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">RegistreeringDetailneParing>tegevused");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer");
            qName2 = new javax.xml.namespace.QName("", "tegevusKood");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">RegistreeringDetailneVastus>registreeringud");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneDetailneTegevusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registrikanneDetailneTegevusType");
            qName2 = new javax.xml.namespace.QName("", "registreering");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">RegistreeringMIKOParing>aasta");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">RegistreeringMIKOParing>kuu");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">registrikanneDetailneMuinsuskaitseType>tegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">registrikanneDetailneMuinsuskaitseType>vastutav_isik");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseTypeVastutav_isik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">registrikanneDetailneTegevusType>tegevused");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusType");
            qName2 = new javax.xml.namespace.QName("", "tegevus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">registrikanneDetailneType>tegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneDetailneTypeTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">registriKanneMIKOType>ettekirjutus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistriKanneMIKOTypeEttekirjutus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">registriKanneMIKOType>ettevotja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistriKanneMIKOTypeEttevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">registriKanneMIKOType>tegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistriKanneMIKOTypeTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">registriKanneMIKOType>tyyp");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistriKanneMIKOTypeTyyp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">RegistriKanneVastus>kirjed");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistriKanneVastusKirjedKirje[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>RegistriKanneVastus>kirjed>kirje");
            qName2 = new javax.xml.namespace.QName("", "kirje");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">regnr");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">rehabilitatsiooniteenused>tegevuskohad");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RehabilitatsiooniteenusedTegevuskohadTegevuskoht[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>rehabilitatsiooniteenused>tegevuskohad>tegevuskoht");
            qName2 = new javax.xml.namespace.QName("", "tegevuskoht");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">salvestaEttekirjutus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">salvestaEttekirjutusParing>ettekirjutus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutusParingEttekirjutus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">salvestaEttekirjutusResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">salvestaTaotlus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaTaotlus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">salvestaTaotlusResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaTaotlusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">SoidukikaardiVastus>soidukikaardid");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoidukikaartType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoidukikaartType");
            qName2 = new javax.xml.namespace.QName("", "soidukikaart");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">SoidukikaartType>soidukid");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoidukType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoidukType");
            qName2 = new javax.xml.namespace.QName("", "soiduk");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">SoitjaveduType>vastutav_isikud");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.IsikAndmedLihtneType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "IsikAndmedLihtneType");
            qName2 = new javax.xml.namespace.QName("", "vastutav_isik");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">SoitjaveduVastus>soitjaveod");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoitjaveduType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoitjaveduType");
            qName2 = new javax.xml.namespace.QName("", "soitjavedu");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseAadressiOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseAadressiOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseAadressiOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseAadressiOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseEttevotjaOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseEttevotjaOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseEttevotjaOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseEttevotjaOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseHariduseOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseHariduseOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseHariduseOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseHariduseOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseIsikuOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseIsikuOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseIsikuOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseIsikuOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseKapitaliOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKapitaliOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseKapitaliOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKapitaliOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseKutsetunnistuseOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKutsetunnistuseOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseKutsetunnistuseOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKutsetunnistuseOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseLoendiOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseLoendiOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseLoendiOtsingParing>sort");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseLoendiOtsingParingSort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseLoendiOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseLoendiOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotlusePadevustunnistuseOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotlusePadevustunnistuseOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotlusePadevustunnistuseOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotlusePadevustunnistuseOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseSoidukiOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseSoidukiOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseSoidukiOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseSoidukiOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseTaksoYlevaatuseOtsing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">taotluseTaksoYlevaatuseOtsingResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">tegevusala");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">TegevuslubaVastusV2>kirjed");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevuslubaVastusV2KirjedKirje[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>TegevuslubaVastusV2>kirjed>kirje");
            qName2 = new javax.xml.namespace.QName("", "kirje");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">valiTaotlus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ValiTaotlus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">valiTaotluseTegevusala");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ValiTaotluseTegevusala.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">valiTaotluseTegevusalaResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ValiTaotluseTegevusalaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">valiTaotlusResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ValiTaotlusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">vastutavaIsikuTeade>tegevusalaAlaliigid");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "tegevusalaAlaliik");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "aadressType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AadressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "adsTaseType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AdsTaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "AlamlubaType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AlamlubaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "andmeteMuudatusedParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AndmeteMuudatusedParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "andmeteMuudatusedVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">andmeteMuudatusedVastus>muudatus");
            qName2 = new javax.xml.namespace.QName("", "muudatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ArrayOfAsutus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Asutus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Asutus");
            qName2 = new javax.xml.namespace.QName("", "Asutus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ArrayOfAsutusTegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AsutusTegevuskoht[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "AsutusTegevuskoht");
            qName2 = new javax.xml.namespace.QName("", "AsutusTegevuskoht");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ArrayOfKlassifikaatorValik");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KlassifikaatorValik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "KlassifikaatorValik");
            qName2 = new javax.xml.namespace.QName("", "alamliik");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ArrayOfSidevahend");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Sidevahend[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Sidevahend");
            qName2 = new javax.xml.namespace.QName("", "Sidevahend");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ArrayOfTagatis");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Tagatis[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Tagatis");
            qName2 = new javax.xml.namespace.QName("", "Tagatis");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Asutus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Asutus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "AsutusDetailne");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AsutusDetailne.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "AsutusTegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.AsutusTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CheckTransportManagerGoodReputeRequest");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CheckTransportManagerGoodReputeRequest_Body");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CheckTransportManagerGoodReputeResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CheckTransportManagerGoodReputeResponse_Body");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse_Body.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CompaniesList");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Company[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Company");
            qName2 = new javax.xml.namespace.QName("", "company");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Company");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Company.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "DynElemendid");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.DynElemendid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "DynElement");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.DynElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "DynPlokk");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.DynPlokk.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "DynVali");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.DynVali.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "erihoolekandeteenused");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Erihoolekandeteenused.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneMuinsuskaitseParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneMuinsuskaitseVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">EttevotjaDetailneMuinsuskaitseVastus>ettevotja");
            qName2 = new javax.xml.namespace.QName("", "ettevotja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ettevotjaDetailneType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">EttevotjaDetailneVastus>ettevotja");
            qName2 = new javax.xml.namespace.QName("", "ettevotja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaKoodiParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaKoodiParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.EttevotjaVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajadParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajadParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajadVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">fokaHooldajadVastus>hooldaja");
            qName2 = new javax.xml.namespace.QName("", "hooldaja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajaParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajaVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.FokaHooldajaVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "IsikAndmedLihtneType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.IsikAndmedLihtneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitaMajandustegevusParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KinnitaMajandustegevusParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitaMajandustegevusVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KinnitaMajandustegevusVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitatavMajandustegevusParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KinnitatavMajandustegevusParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitatavMajandustegevusVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Majandustegevus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "majandustegevus");
            qName2 = new javax.xml.namespace.QName("", "majandustegevus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kirjetearvType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "KlassifikaatorValik");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KlassifikaatorValik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kohtadeArvudType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.KohtadeArvudTypeKohtadearv[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">kohtadeArvudType>kohtadearv");
            qName2 = new javax.xml.namespace.QName("", "kohtadearv");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "majandustegevus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Majandustegevus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusedParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.MinuTaotlusedParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusedVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.MinuTaotlusedVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.MinuTaotlusParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.MinuTaotlusVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "muudaVastutavaIsikuNousolekParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "muudaVastutavaIsikuNousolekVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "postiindeks");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringDetailneParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistreeringDetailneParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringDetailneVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistreeringDetailneVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringMIKOParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistreeringMIKOParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringMIKOVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistreeringMIKOVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistreeringParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registrikanneDetailneMuinsuskaitseType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneDetailneMuinsuskaitseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registrikanneDetailneTegevusType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneDetailneTegevusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registrikanneDetailneType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneDetailneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registriKanneMIKOType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistriKanneMIKOType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registrikanneType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistrikanneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistriKanneVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.RegistriKanneVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "rehabilitatsiooniteenused");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Rehabilitatsiooniteenused.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaEttekirjutusParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutusParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaEttekirjutusVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaEttekirjutusVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaTaotlusParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaTaotlusParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaTaotlusVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestaTaotlusVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SalvestatavTaotlus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SalvestatavTaotlus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Sidevahend");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Sidevahend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoidukikaardiVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoidukikaardiVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoidukikaartType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoidukikaartType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoidukType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoidukType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoitjaveduType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoitjaveduType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoitjaveduVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoitjaveduVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoovitudKirjeteArv");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.SoovitudKirjeteArv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Tagatis");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Tagatis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaksolubaParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaksolubaParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaksolubaVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaksolubaVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tanav");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "Taotlus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.Taotlus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadress");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseAadress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadressiOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseAadressiOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadressiOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseAadress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadress");
            qName2 = new javax.xml.namespace.QName("", "aadress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotja");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseEttevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotjaOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseEttevotjaOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotjaOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseEttevotja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotja");
            qName2 = new javax.xml.namespace.QName("", "ettevotja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHaridus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseHaridus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHariduseOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseHariduseOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHariduseOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseHaridus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHaridus");
            qName2 = new javax.xml.namespace.QName("", "haridus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsik");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseIsik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsikuOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseIsikuOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsikuOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseIsik[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsik");
            qName2 = new javax.xml.namespace.QName("", "isik");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapital");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKapital.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapitaliOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKapitaliOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapitaliOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKapital[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapital");
            qName2 = new javax.xml.namespace.QName("", "kapital");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKutsetunnistus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistuseOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKutsetunnistuseOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistuseOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseKutsetunnistus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistus");
            qName2 = new javax.xml.namespace.QName("", "tunnistus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoend");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseLoend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiFilter");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseLoendiFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseLoendiOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseLoendiOtsingVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiVaartus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseLoendiVaartus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotlusePadevustunnistus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistuseOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotlusePadevustunnistuseOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistuseOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotlusePadevustunnistus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistus");
            qName2 = new javax.xml.namespace.QName("", "tunnistus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoiduk");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseSoiduk.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoidukiOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseSoidukiOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoidukiOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseSoiduk[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoiduk");
            qName2 = new javax.xml.namespace.QName("", "soiduk");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseTaksoYlevaatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatuseOtsingParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatuseOtsingVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatus");
            qName2 = new javax.xml.namespace.QName("", "takso_ylevaatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaotluseTegevusala");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseTegevusala.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaotluseValdkond");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseValdkond.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaotlusNimekirjas");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotlusNimekirjas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusalaType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevusalaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevuskohtType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevuskohtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevuslubaParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaSotsiaalhooldusParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevuslubaSotsiaalhooldusParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaVastusV2");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevuslubaVastusV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusTyypType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TegevusTyypType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiAlamliigidVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TurismiAlamliigidVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiettevõtjadPäring");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TurismiettevõtjadPäring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiEttevõtjadVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TurismiEttevõtjadVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valdkondType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ValdkondType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotluseTegevusalaParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ValiTaotluseTegevusalaParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotluseTegevusalaVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.TaotluseValdkond[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaotluseValdkond");
            qName2 = new javax.xml.namespace.QName("", "Valdkond");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotlusParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ValiTaotlusParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotlusVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.ValiTaotlusVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeade");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.VastutavaIsikuTeade.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeatedParing");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.VastutavaIsikuTeatedParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeatedVastus");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.VastutavaIsikuTeade[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeade");
            qName2 = new javax.xml.namespace.QName("", "teade");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "yldinfoBaseType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.YldinfoBaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "yldinfoPostiAadressiga");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.YldinfoPostiAadressiga.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "yldinfoType");
            cachedSerQNames.add(qName);
            cls = ee.x_road.mtr.producer.YldinfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>>>>userAllowedMethodsResponse>response>person>orgQuery>query");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePersonOrgQueryQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>>>userAllowedMethodsResponse>response>person>orgQuery");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePersonOrgQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>>loadClassificationResponse>response>classificationNames");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>>loadClassificationResponse>response>classifications");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.LoadClassificationResponseResponseClassifications.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>>userAllowedMethodsResponse>response>person");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponsePerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>listMethodsResponse>response");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>loadClassification>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.LoadClassificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>loadClassificationResponse>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.LoadClassificationResponseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>loadClassificationResponse>response");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.LoadClassificationResponseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>unitRepresentResponse>response>item");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitRepresentResponseResponseItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>userAllowedMethods>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UserAllowedMethodsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>userAllowedMethodsResponse>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>userAllowedMethodsResponse>response");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">address");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">listMethodsResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.ListMethodsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">loadClassification");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.LoadClassification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">loadClassificationResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.LoadClassificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">notes");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.Notes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">technotes");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.Technotes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">title");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.Title.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">unitRepresent>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitRepresentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">unitRepresentResponse>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitRepresentResponseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">unitRepresentResponse>response");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitRepresentResponseResponseItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">>unitRepresentResponse>response>item");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">unitValid>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitValidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">unitValidResponse>request");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitValidResponseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">unitValidResponse>response");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitValidResponseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">userAllowedMethods");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UserAllowedMethods.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">userAllowedMethodsResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UserAllowedMethodsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">version");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", ">wildcard");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "asula");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "csv");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "ehak");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "faultCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "faultString");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "gif");
            cachedSerQNames.add(qName);
            cls = byte[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "hdrstd");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.Hdrstd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "invalidInput");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.InvalidInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "jpg");
            cachedSerQNames.add(qName);
            cls = byte[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "legacy_response");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.Legacy_response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "maakond");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "txt");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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
            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "unitRepresent");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitRepresent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "unitRepresentResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitRepresentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "unitValid");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitValid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "unitValidResponse");
            cachedSerQNames.add(qName);
            cls = ee.x_road.xsd.x_road_xsd.UnitValidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "url");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "vald");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "xml");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
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

    public ee.x_road.xsd.x_road_xsd.Legacy_response legacyEttevotja(ee.x_road.xsd.x_road_xsd.holders.ArrayOfStringHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "legacyEttevotja"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), java.lang.String[].class);
            }
            try {
                return (ee.x_road.xsd.x_road_xsd.Legacy_response) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.xsd.x_road_xsd.Legacy_response) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.xsd.x_road_xsd.Legacy_response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.EttevotjaVastus ettevotja(ee.x_road.mtr.producer.holders.EttevotjaParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ettevotja"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.EttevotjaParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.EttevotjaParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.EttevotjaParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.EttevotjaVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.EttevotjaVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.EttevotjaVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja[] ettevotjaDetailne(ee.x_road.mtr.producer.holders.EttevotjaDetailneParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ettevotjaDetailne"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.EttevotjaDetailneParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.EttevotjaDetailneParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.EttevotjaDetailneParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja[] ettevotjaDetailneMuinsuskaitse(ee.x_road.mtr.producer.holders.EttevotjaDetailneMuinsuskaitseParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ettevotjaDetailneMuinsuskaitse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadClassificator(ee.x_road.mtr.producer.LoadClassificatorRequest request, ee.x_road.mtr.producer.holders.LoadClassificatorResponseRequestHolder request2, ee.x_road.mtr.producer.holders.LoadClassificatorResponseResponseHolder response) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "loadClassificator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request2.value = (ee.x_road.mtr.producer.LoadClassificatorResponseRequest) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request2.value = (ee.x_road.mtr.producer.LoadClassificatorResponseRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.LoadClassificatorResponseRequest.class);
            }
            try {
                response.value = (ee.x_road.mtr.producer.LoadClassificatorResponseResponse) _output.get(new javax.xml.namespace.QName("", "response"));
            } catch (java.lang.Exception _exception) {
                response.value = (ee.x_road.mtr.producer.LoadClassificatorResponseResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "response")), ee.x_road.mtr.producer.LoadClassificatorResponseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TurismiAlamliigidVastus turismialamliigid(javax.xml.rpc.holders.StringHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismialamliigid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), java.lang.String.class);
            }
            try {
                return (ee.x_road.mtr.producer.TurismiAlamliigidVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TurismiAlamliigidVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TurismiAlamliigidVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TurismiEttevõtjadVastus turismiettevotjad(ee.x_road.mtr.producer.holders.TurismiettevõtjadPäringHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiettevotjad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TurismiettevõtjadPäring) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TurismiettevõtjadPäring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TurismiettevõtjadPäring.class);
            }
            try {
                return (ee.x_road.mtr.producer.TurismiEttevõtjadVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TurismiEttevõtjadVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TurismiEttevõtjadVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.AsutusDetailne turismiettevotjadetailne(javax.xml.rpc.holders.StringHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiettevotjadetailne"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), java.lang.String.class);
            }
            try {
                return (ee.x_road.mtr.producer.AsutusDetailne) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.AsutusDetailne) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.AsutusDetailne.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TegevuslubaVastusV2 tegevusluba(ee.x_road.mtr.producer.holders.TegevuslubaParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusluba"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TegevuslubaParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TegevuslubaParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TegevuslubaParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TegevuslubaVastusV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TegevuslubaVastusV2) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TegevuslubaVastusV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TegevuslubaVastusV2 tegevuslubaSotsiaalhooldus(ee.x_road.mtr.producer.holders.TegevuslubaSotsiaalhooldusParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevuslubaSotsiaalhooldus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TegevuslubaSotsiaalhooldusParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TegevuslubaSotsiaalhooldusParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TegevuslubaSotsiaalhooldusParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TegevuslubaVastusV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TegevuslubaVastusV2) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TegevuslubaVastusV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.RegistriKanneVastus registreering(ee.x_road.mtr.producer.holders.RegistreeringParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registreering"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.RegistreeringParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.RegistreeringParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.RegistreeringParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.RegistriKanneVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.RegistriKanneVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.RegistriKanneVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.RegistreeringDetailneVastus registreeringDetailne(ee.x_road.mtr.producer.holders.RegistreeringDetailneParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registreeringDetailne"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.RegistreeringDetailneParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.RegistreeringDetailneParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.RegistreeringDetailneParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.RegistreeringDetailneVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.RegistreeringDetailneVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.RegistreeringDetailneVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.RegistreeringMIKOVastus registreeringMIKO(ee.x_road.mtr.producer.holders.RegistreeringMIKOParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registreeringMIKO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.RegistreeringMIKOParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.RegistreeringMIKOParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.RegistreeringMIKOParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.RegistreeringMIKOVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.RegistreeringMIKOVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.RegistreeringMIKOVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.SoidukikaardiVastus soidukikaart(ee.x_road.mtr.producer.holders.EttevotjaKoodiParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "soidukikaart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.EttevotjaKoodiParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.EttevotjaKoodiParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.EttevotjaKoodiParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.SoidukikaardiVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.SoidukikaardiVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.SoidukikaardiVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.SoitjaveduVastus soitjavedu(ee.x_road.mtr.producer.holders.EttevotjaKoodiParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "soitjavedu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.EttevotjaKoodiParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.EttevotjaKoodiParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.EttevotjaKoodiParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.SoitjaveduVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.SoitjaveduVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.SoitjaveduVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaksolubaVastus taksoluba(ee.x_road.mtr.producer.holders.TaksolubaParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taksoluba"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaksolubaParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaksolubaParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaksolubaParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaksolubaVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaksolubaVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaksolubaVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.VastutavaIsikuTeade[] vastutavaIsikuTeated(ee.x_road.mtr.producer.holders.VastutavaIsikuTeatedParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeated"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.VastutavaIsikuTeatedParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.VastutavaIsikuTeatedParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.VastutavaIsikuTeatedParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.VastutavaIsikuTeade[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.VastutavaIsikuTeade[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.VastutavaIsikuTeade[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekVastus muudaVastutavaIsikuNousolek(ee.x_road.mtr.producer.holders.MuudaVastutavaIsikuNousolekParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "muudaVastutavaIsikuNousolek"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.MinuTaotlusedVastus minuTaotlused(ee.x_road.mtr.producer.holders.MinuTaotlusedParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlused"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.MinuTaotlusedParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.MinuTaotlusedParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.MinuTaotlusedParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.MinuTaotlusedVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.MinuTaotlusedVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.MinuTaotlusedVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.MinuTaotlusVastus minuTaotlus(ee.x_road.mtr.producer.holders.MinuTaotlusParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.MinuTaotlusParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.MinuTaotlusParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.MinuTaotlusParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.MinuTaotlusVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.MinuTaotlusVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.MinuTaotlusVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.SalvestaTaotlusVastus salvestaTaotlus(ee.x_road.mtr.producer.holders.SalvestaTaotlusParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaTaotlus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.SalvestaTaotlusParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.SalvestaTaotlusParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.SalvestaTaotlusParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.SalvestaTaotlusVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.SalvestaTaotlusVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.SalvestaTaotlusVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.ValiTaotlusVastus valiTaotlus(ee.x_road.mtr.producer.holders.ValiTaotlusParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotlus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.ValiTaotlusParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.ValiTaotlusParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.ValiTaotlusParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.ValiTaotlusVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.ValiTaotlusVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.ValiTaotlusVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseEttevotja[] taotluseEttevotjaOtsing(ee.x_road.mtr.producer.holders.TaotluseEttevotjaOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotjaOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseEttevotjaOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseEttevotjaOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseEttevotjaOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseEttevotja[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseEttevotja[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseEttevotja[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseIsik[] taotluseIsikuOtsing(ee.x_road.mtr.producer.holders.TaotluseIsikuOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsikuOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseIsikuOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseIsikuOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseIsikuOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseIsik[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseIsik[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseIsik[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseValdkond[] valiTaotluseTegevusala(ee.x_road.mtr.producer.holders.ValiTaotluseTegevusalaParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotluseTegevusala"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.ValiTaotluseTegevusalaParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.ValiTaotluseTegevusalaParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.ValiTaotluseTegevusalaParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseValdkond[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseValdkond[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseValdkond[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.Majandustegevus[] kinnitatavMajandustegevus(ee.x_road.mtr.producer.holders.KinnitatavMajandustegevusParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitatavMajandustegevus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.KinnitatavMajandustegevusParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.KinnitatavMajandustegevusParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.KinnitatavMajandustegevusParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.Majandustegevus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.Majandustegevus[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.Majandustegevus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.KinnitaMajandustegevusVastus kinnitaMajandustegevus(ee.x_road.mtr.producer.holders.KinnitaMajandustegevusParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitaMajandustegevus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.KinnitaMajandustegevusParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.KinnitaMajandustegevusParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.KinnitaMajandustegevusParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.KinnitaMajandustegevusVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.KinnitaMajandustegevusVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.KinnitaMajandustegevusVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseAadress[] taotluseAadressiOtsing(ee.x_road.mtr.producer.holders.TaotluseAadressiOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadressiOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseAadressiOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseAadressiOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseAadressiOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseAadress[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseAadress[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseAadress[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseSoiduk[] taotluseSoidukiOtsing(ee.x_road.mtr.producer.holders.TaotluseSoidukiOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoidukiOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseSoidukiOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseSoidukiOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseSoidukiOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseSoiduk[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseSoiduk[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseSoiduk[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseKutsetunnistus[] taotluseKutsetunnistuseOtsing(ee.x_road.mtr.producer.holders.TaotluseKutsetunnistuseOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistuseOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseKutsetunnistuseOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseKutsetunnistuseOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseKutsetunnistuseOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseKutsetunnistus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseKutsetunnistus[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseKutsetunnistus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotlusePadevustunnistus[] taotlusePadevustunnistuseOtsing(ee.x_road.mtr.producer.holders.TaotlusePadevustunnistuseOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistuseOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotlusePadevustunnistuseOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotlusePadevustunnistuseOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotlusePadevustunnistuseOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotlusePadevustunnistus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotlusePadevustunnistus[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotlusePadevustunnistus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseLoendiOtsingVastus taotluseLoendiOtsing(ee.x_road.mtr.producer.holders.TaotluseLoendiOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseLoendiOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseLoendiOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseLoendiOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseLoendiOtsingVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseLoendiOtsingVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseLoendiOtsingVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseKapital[] taotluseKapitaliOtsing(ee.x_road.mtr.producer.holders.TaotluseKapitaliOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapitaliOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseKapitaliOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseKapitaliOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseKapitaliOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseKapital[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseKapital[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseKapital[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseHaridus[] taotluseHariduseOtsing(ee.x_road.mtr.producer.holders.TaotluseHariduseOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHariduseOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseHariduseOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseHariduseOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseHariduseOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseHaridus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseHaridus[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseHaridus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[] taotluseTaksoYlevaatuseOtsing(ee.x_road.mtr.producer.holders.TaotluseTaksoYlevaatuseOtsingParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatuseOtsing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse_Body checkTransportManagerGoodRepute(ee.x_road.mtr.producer.holders.CheckTransportManagerGoodReputeRequest_BodyHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "checkTransportManagerGoodRepute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body.class);
            }
            try {
                return (ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse_Body) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse_Body) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse_Body.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.SalvestaEttekirjutusVastus salvestaEttekirjutus(ee.x_road.mtr.producer.holders.SalvestaEttekirjutusParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaEttekirjutus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.SalvestaEttekirjutusParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.SalvestaEttekirjutusParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.SalvestaEttekirjutusParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.SalvestaEttekirjutusVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.SalvestaEttekirjutusVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.SalvestaEttekirjutusVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.FokaHooldajaVastus fokaHooldaja(ee.x_road.mtr.producer.holders.FokaHooldajaParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldaja"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.FokaHooldajaParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.FokaHooldajaParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.FokaHooldajaParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.FokaHooldajaVastus) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.FokaHooldajaVastus) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.FokaHooldajaVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja[] fokaHooldajad(ee.x_road.mtr.producer.holders.FokaHooldajadParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.FokaHooldajadParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.FokaHooldajadParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.FokaHooldajadParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus[] andmeteMuudatused(ee.x_road.mtr.producer.holders.AndmeteMuudatusedParingHolder request) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "andmeteMuudatused"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                request.value = (ee.x_road.mtr.producer.AndmeteMuudatusedParing) _output.get(new javax.xml.namespace.QName("", "request"));
            } catch (java.lang.Exception _exception) {
                request.value = (ee.x_road.mtr.producer.AndmeteMuudatusedParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "request")), ee.x_road.mtr.producer.AndmeteMuudatusedParing.class);
            }
            try {
                return (ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
