/**
 * XteebindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.mtr.producers.producer.mtr;

public class XteebindingStub extends org.apache.axis.client.Stub implements ee.riik.xtee.mtr.producers.producer.mtr.Xteeport {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotjaDetailne");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaDetailneParing"), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaDetailneParing"), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaDetailneVastus"), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotja[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "ettevotja"));
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registreeringDetailne");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringDetailneParing"), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringDetailneParing"), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringDetailneVastus"), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneVastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("legacy1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "legacy_response"), ee.riik.x_tee.xsd.xtee_xsd.Legacy_response.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("legacyEttevotja");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "legacy_response"), ee.riik.x_tee.xsd.xtee_xsd.Legacy_response.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("legacyKodanik");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "legacy_response"), ee.riik.x_tee.xsd.xtee_xsd.Legacy_response.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ettevotja");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaParing"), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaParing"), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaVastus"), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registreering");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringParing"), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "asutus"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "andmekogu"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "isikukood"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "nimi"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "toimik"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringParing"), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistriKanneVastus"), ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tegevusluba");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "TegevuslubaParing"), ee.riik.xtee.mtr.producers.producer.mtr.TegevuslubaParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "andmekogu"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "asutus"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "isikukood"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "nimi"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "toimik"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "TegevuslubaParing"), ee.riik.xtee.mtr.producers.producer.mtr.TegevuslubaParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistriKanneVastus"), ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registreeringMIKO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringMIKOParing"), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringMIKOParing"), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOParing.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringMIKOVastus"), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOVastus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public XteebindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public XteebindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public XteebindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>>EttevotjaVastus>ettevotjad>ettevotja>registrikanded");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneType");
            qName2 = new javax.xml.namespace.QName("", "registrikanne");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>EttevotjaDetailneVastus>ettevotja>yldinfo");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotjaYldinfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>EttevotjaVastus>ettevotjad>ettevotja");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastusEttevotjadEttevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>RegistriKanneVastus>kirjed>kirje");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastusKirjedKirje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">EttevotjaDetailneVastus>ettevotja");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">EttevotjaVastus>ettevotjad");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastusEttevotjadEttevotja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>EttevotjaVastus>ettevotjad>ettevotja");
            qName2 = new javax.xml.namespace.QName("", "ettevotja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">isikukood");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">kood");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">RegistreeringDetailneParing>tegevused");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer");
            qName2 = new javax.xml.namespace.QName("", "tegevusKood");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">RegistreeringDetailneVastus>registreeringud");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTegevusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneDetailneTegevusType");
            qName2 = new javax.xml.namespace.QName("", "registreering");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">RegistreeringMIKOParing>aasta");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">RegistreeringMIKOParing>kuu");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registrikanneDetailneTegevusType>tegevused");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.TegevusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusType");
            qName2 = new javax.xml.namespace.QName("", "tegevus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registrikanneDetailneType>tegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTypeTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registriKanneMIKOType>ettekirjutus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttekirjutus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registriKanneMIKOType>ettevotja");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeEttevotja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">registriKanneMIKOType>tegevuskoht");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOTypeTegevuskoht.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">RegistriKanneVastus>kirjed");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastusKirjedKirje[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">>RegistriKanneVastus>kirjed>kirje");
            qName2 = new javax.xml.namespace.QName("", "kirje");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">regnr");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">tegevusala");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "aadressType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.AadressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaDetailneParing");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "ettevotjaDetailneType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaDetailneVastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", ">EttevotjaDetailneVastus>ettevotja");
            qName2 = new javax.xml.namespace.QName("", "ettevotja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaParing");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "EttevotjaVastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "kirjetearvType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringDetailneParing");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringDetailneVastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringMIKOParing");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringMIKOVastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistreeringParing");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneDetailneTegevusType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneTegevusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneDetailneType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneDetailneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registriKanneMIKOType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneMIKOType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registrikanneType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistrikanneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "RegistriKanneVastus");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "SoovitudKirjeteArv");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.SoovitudKirjeteArv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusalaType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.TegevusalaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevuskohtType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.TegevuskohtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "TegevuslubaParing");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.TegevuslubaParing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.TegevusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusTyypType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.TegevusTyypType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "valdkondType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.ValdkondType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "yldinfoBaseType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.YldinfoBaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "yldinfoType");
            cachedSerQNames.add(qName);
            cls = ee.riik.xtee.mtr.producers.producer.mtr.YldinfoType.class;
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

            qName = new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ehak");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "legacy_response");
            cachedSerQNames.add(qName);
            cls = ee.riik.x_tee.xsd.xtee_xsd.Legacy_response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "postiindeks");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "tanav");
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

    public void ettevotjaDetailne(ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneParing keha, ee.riik.xtee.mtr.producers.producer.mtr.holders.EttevotjaDetailneParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.EttevotjaDetailneVastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:#ettevotjaDetailne");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ettevotjaDetailne"));

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
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneParing) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneParing.class);
            }
            try {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotja[]) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotja[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaDetailneVastusEttevotja[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void registreeringDetailne(ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneParing keha, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringDetailneParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringDetailneVastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:#registreeringDetailne");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registreeringDetailne"));

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
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneParing) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneParing.class);
            }
            try {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneVastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneVastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringDetailneVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void legacy1(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.x_tee.xsd.xtee_xsd.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "legacy1"));

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
                keha2.value = (ee.riik.x_tee.xsd.xtee_xsd.Legacy_response) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.x_tee.xsd.xtee_xsd.Legacy_response) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.x_tee.xsd.xtee_xsd.Legacy_response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void legacyEttevotja(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.x_tee.xsd.xtee_xsd.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "legacyEttevotja"));

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
                keha2.value = (ee.riik.x_tee.xsd.xtee_xsd.Legacy_response) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.x_tee.xsd.xtee_xsd.Legacy_response) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.x_tee.xsd.xtee_xsd.Legacy_response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void legacyKodanik(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.x_tee.xsd.xtee_xsd.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "legacyKodanik"));

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
                keha2.value = (ee.riik.x_tee.xsd.xtee_xsd.Legacy_response) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.x_tee.xsd.xtee_xsd.Legacy_response) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.x_tee.xsd.xtee_xsd.Legacy_response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ettevotja(ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaParing keha, ee.riik.xtee.mtr.producers.producer.mtr.holders.EttevotjaParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.EttevotjaVastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "ettevotja"));

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
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaParing) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaParing.class);
            }
            try {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.mtr.producers.producer.mtr.EttevotjaVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void registreering(ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringParing keha, javax.xml.rpc.holders.StringHolder asutus, javax.xml.rpc.holders.StringHolder andmekogu, javax.xml.rpc.holders.StringHolder isikukood, javax.xml.rpc.holders.StringHolder id, javax.xml.rpc.holders.StringHolder nimi, javax.xml.rpc.holders.StringHolder toimik, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistriKanneVastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registreering"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha, asutus.value, andmekogu.value, isikukood.value, id.value, nimi.value, toimik.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                asutus.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "asutus"));
            } catch (java.lang.Exception _exception) {
                asutus.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "asutus")), java.lang.String.class);
            }
            try {
                andmekogu.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "andmekogu"));
            } catch (java.lang.Exception _exception) {
                andmekogu.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "andmekogu")), java.lang.String.class);
            }
            try {
                isikukood.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "isikukood"));
            } catch (java.lang.Exception _exception) {
                isikukood.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "isikukood")), java.lang.String.class);
            }
            try {
                id.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "id"));
            } catch (java.lang.Exception _exception) {
                id.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "id")), java.lang.String.class);
            }
            try {
                nimi.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "nimi"));
            } catch (java.lang.Exception _exception) {
                nimi.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "nimi")), java.lang.String.class);
            }
            try {
                toimik.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "toimik"));
            } catch (java.lang.Exception _exception) {
                toimik.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "toimik")), java.lang.String.class);
            }
            try {
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringParing) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringParing.class);
            }
            try {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void tegevusluba(ee.riik.xtee.mtr.producers.producer.mtr.TegevuslubaParing keha, javax.xml.rpc.holders.StringHolder andmekogu, javax.xml.rpc.holders.StringHolder asutus, javax.xml.rpc.holders.StringHolder isikukood, javax.xml.rpc.holders.StringHolder id, javax.xml.rpc.holders.StringHolder nimi, javax.xml.rpc.holders.StringHolder toimik, ee.riik.xtee.mtr.producers.producer.mtr.holders.TegevuslubaParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistriKanneVastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "tegevusluba"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {keha, andmekogu.value, asutus.value, isikukood.value, id.value, nimi.value, toimik.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                andmekogu.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "andmekogu"));
            } catch (java.lang.Exception _exception) {
                andmekogu.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "andmekogu")), java.lang.String.class);
            }
            try {
                asutus.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "asutus"));
            } catch (java.lang.Exception _exception) {
                asutus.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "asutus")), java.lang.String.class);
            }
            try {
                isikukood.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "isikukood"));
            } catch (java.lang.Exception _exception) {
                isikukood.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "isikukood")), java.lang.String.class);
            }
            try {
                id.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "id"));
            } catch (java.lang.Exception _exception) {
                id.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "id")), java.lang.String.class);
            }
            try {
                nimi.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "nimi"));
            } catch (java.lang.Exception _exception) {
                nimi.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "nimi")), java.lang.String.class);
            }
            try {
                toimik.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "toimik"));
            } catch (java.lang.Exception _exception) {
                toimik.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "toimik")), java.lang.String.class);
            }
            try {
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.TegevuslubaParing) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.TegevuslubaParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.mtr.producers.producer.mtr.TegevuslubaParing.class);
            }
            try {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.mtr.producers.producer.mtr.RegistriKanneVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void registreeringMIKO(ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOParing keha, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringMIKOParingHolder paring, ee.riik.xtee.mtr.producers.producer.mtr.holders.RegistreeringMIKOVastusHolder keha2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:#registreeringMIKO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://producers.mtr.xtee.riik.ee/producer/mtr", "registreeringMIKO"));

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
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOParing) _output.get(new javax.xml.namespace.QName("", "paring"));
            } catch (java.lang.Exception _exception) {
                paring.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOParing) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "paring")), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOParing.class);
            }
            try {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOVastus) _output.get(new javax.xml.namespace.QName("", "keha"));
            } catch (java.lang.Exception _exception) {
                keha2.value = (ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOVastus) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "keha")), ee.riik.xtee.mtr.producers.producer.mtr.RegistreeringMIKOVastus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
