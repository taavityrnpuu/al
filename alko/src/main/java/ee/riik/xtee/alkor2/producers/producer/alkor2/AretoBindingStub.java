/**
 * AretoBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class AretoBindingStub extends org.apache.axis.client.Stub implements ee.riik.xtee.alkor2.producers.producer.alkor2.AretoPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[24];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "listMethods_vastus"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "keha"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("legacy1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "legacy_response"), ee.riik.xtee.alkor2.producers.producer.alkor2.Legacy_response.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eitlaadib");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruanne"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "DataHandler"), javax.activation.DataHandler.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aretolaadib");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aretolaadib_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruanne"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "DataHandler"), javax.activation.DataHandler.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aretolaadib_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("liikumine");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eitparib");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitparib_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aruandjaparija");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandjaparija_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandjaparija_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitparib_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aruandeparing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tooteparing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("kammparing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_vastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transactionStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.MokaResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getApplicationDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateApplicationDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doc1"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "DataHandler"), javax.activation.DataHandler.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addApplication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateApplication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("applyedApplications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AppFollowResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.AppFollowResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("acceptedApplications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationsResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationsResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("prolongApplication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("prolongApp60");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getApplication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkApplication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("extendApps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExtendResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnterprise");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnterpriseQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnterpriseQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnterpriseResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addEnterprise");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Enterprise"), ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Enterprise"), ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddEnterpriseResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.AddEnterpriseResponse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

    }

    public AretoBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AretoBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AretoBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            java.lang.Class mimesf = org.apache.axis.encoding.ser.JAFDataHandlerSerializerFactory.class;
            java.lang.Class mimedf = org.apache.axis.encoding.ser.JAFDataHandlerDeserializerFactory.class;

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "DataHandler");
            cachedSerQNames.add(qName);
            cls = javax.activation.DataHandler.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(mimesf);
            cachedDeserFactories.add(mimedf);

        addBindings0();
        addBindings1();
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
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">AppFollowResponse>apps");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.AppFollow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AppFollow");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Application>Notes");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">ApplicationsResponse>apps");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationDataShort[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationDataShort");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">aruandeparing_vastus>aruanded");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastuserida[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_vastuserida");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">eitlaadib_vastus>vead");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Reaviga[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "reaviga");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">EnterpriseResponse>ettevotted");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjakoodiga[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandjakoodiga");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">ExtendResponse>apps");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExtendData");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">liikumine_vastus>liikumised");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">MokaType>PaymentDesc");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">MokaType>TreasuryClassif");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Payer>AccountNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Payer>Name");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Payer>RefNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Payer>RegNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Payer>TransmissionDate");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Payment>Amount");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Payment>BaseCurrencyAmount");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Payment>Currency");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Product>KNCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Receiver>AccountNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Receiver>Name");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Receiver>ReceptionDate");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Receiver>RefNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Receiver>RegNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">tooteparing_vastus>tooted");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastuserida[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_vastuserida");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Treasury>BankRef");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Treasury>DocumentNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">Treasury>OrderNum");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">UpdateApplicationDocumentsQuery>ExistingApplicationDocuments");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExistingApplicationDocumentType2");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", ">UpdateApplicationDocumentsResponse>ExistingApplicationDocuments");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExistingApplicationDocumentType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddApplicationQuery");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddApplicationResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddEnterpriseResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.AddEnterpriseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddressType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AppFollow");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.AppFollow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AppFollowResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.AppFollowResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Application");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Application.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationDataShort");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationDataShort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationsResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aretolaadib_paring");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_paring");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_vastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_vastuserida");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastuserida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeperiood");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeperiood.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeperioodReq");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.AruandeperioodReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandja");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandjakoodiga");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjakoodiga.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandjakoodigaareto");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjakoodigaareto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandjaparija_paring");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "BottleColorType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.BottleColorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "BottleShapeType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.BottleShapeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CapacityType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.CapacityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ContactInfoType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ContactInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CorkColorType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.CorkColorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CorkMaterialType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.CorkMaterialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CorkShapeType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.CorkShapeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "CountryType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.CountryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_paring");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_vastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitparib_vastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnteredApplication");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.EnteredApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Enterprise");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnterpriseQuery");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnterpriseResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExistingApplication");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExistingApplicationDocumentType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExistingApplicationDocumentType2");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ExistingApplicationDocumentType2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExtendData");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExtendResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "item");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kalendriaasta");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kalendrikuu");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Kalendrikuu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_paring");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_vastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "legacy_response");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Legacy_response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_paring");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_vastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "listMethods_vastus");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaQuery");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.MokaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.MokaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "NewApplicationDocumentType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.NewApplicationDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "PackingMaterialType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.PackingMaterialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Payer");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Payer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Payment");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Product");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "reaviga");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Reaviga.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Receiver");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Receiver.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "status_t");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Status_t.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "StockingColorType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.StockingColorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteliik");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteliik.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_paring");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_vastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_vastuserida");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastuserida.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Treasury");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.Treasury.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsQuery");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsResponse.class;
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
            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationResponse");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "csv");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "url");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI.class;
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
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
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

    public java.lang.String[] listMethods(java.lang.String keha) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "listMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void legacy1(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "legacy1"));

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
                paring.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), java.lang.String[].class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Legacy_response) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Legacy_response) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Legacy_response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void eitlaadib(ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring keha, org.apache.axis.holders.DataHandlerHolder aruanne, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "eitlaadib"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha, aruanne.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                aruanne.value = (javax.activation.DataHandler) _output.get(new javax.xml.namespace.QName("", "aruanne"));
            } catch (java.lang.Exception _exception) {
                aruanne.value = (javax.activation.DataHandler) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "aruanne")), byte[].class);
            }
            try {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void aretolaadib(ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring keha, org.apache.axis.holders.DataHandlerHolder aruanne, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aretolaadib_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "aretolaadib"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha, aruanne.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                aruanne.value = (javax.activation.DataHandler) _output.get(new javax.xml.namespace.QName("", "aruanne"));
            } catch (java.lang.Exception _exception) {
                aruanne.value = (javax.activation.DataHandler) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "aruanne")), byte[].class);
            }
            try {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void liikumine(ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "liikumine"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_vastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void eitparib(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "eitparib"));

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
                paring.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), java.lang.String.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void aruandjaparija(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandjaparija_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "aruandjaparija"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void aruandeparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "aruandeparing"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void tooteparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "tooteparing"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void kammparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_vastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "kammparing"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_vastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_vastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_vastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void transactionStatement(ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "transactionStatement"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.MokaResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.MokaResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.MokaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getApplicationDocuments(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "getApplicationDocuments"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateApplicationDocuments(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery keha, org.apache.axis.holders.DataHandlerHolder doc1, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "updateApplicationDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha, doc1.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                doc1.value = (javax.activation.DataHandler) _output.get(new javax.xml.namespace.QName("", "doc1"));
            } catch (java.lang.Exception _exception) {
                doc1.value = (javax.activation.DataHandler) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "doc1")), byte[].class);
            }
            try {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "addApplication"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "updateApplication"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void applyedApplications(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AppFollowResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "applyedApplications"));

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
                paring.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), java.lang.String.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.AppFollowResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.AppFollowResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.AppFollowResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void acceptedApplications(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationsResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "acceptedApplications"));

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
                paring.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), java.lang.String.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationsResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationsResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void prolongApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "prolongApplication"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void prolongApp60(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "prolongApp60"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "getApplication"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void checkApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "checkApplication"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void extendApps(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ExtendResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "extendApps"));

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
                paring.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), java.lang.String.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getEnterprise(ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "getEnterprise"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addEnterprise(ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddEnterpriseResponseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "addEnterprise"));

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
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise.class);
            }
            try {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.AddEnterpriseResponse) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.alkor2.producers.producer.alkor2.AddEnterpriseResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.alkor2.producers.producer.alkor2.AddEnterpriseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
