/**
 * Mtr_bindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.x_road.mtr.producer;

public class Mtr_bindingSkeleton implements ee.x_road.mtr.producer.Mtr_porttype, org.apache.axis.wsdl.Skeleton {
    private ee.x_road.mtr.producer.Mtr_porttype impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "ArrayOfString"), java.lang.String[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("legacyEttevotja", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://x-road.ee/xsd/x-road.xsd", "legacy_response"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "legacyEttevotja"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("legacyEttevotja") == null) {
            _myOperations.put("legacyEttevotja", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("legacyEttevotja")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaParing"), ee.x_road.mtr.producer.EttevotjaParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotja", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ettevotja"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotja") == null) {
            _myOperations.put("ettevotja", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotja")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneParing"), ee.x_road.mtr.producer.EttevotjaDetailneParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaDetailne", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ettevotjaDetailne"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaDetailne") == null) {
            _myOperations.put("ettevotjaDetailne", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaDetailne")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneMuinsuskaitseParing"), ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaDetailneMuinsuskaitse", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaDetailneMuinsuskaitseVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "ettevotjaDetailneMuinsuskaitse"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaDetailneMuinsuskaitse") == null) {
            _myOperations.put("ettevotjaDetailneMuinsuskaitse", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaDetailneMuinsuskaitse")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificator>request"), ee.x_road.mtr.producer.LoadClassificatorRequest.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificatorResponse>request"), ee.x_road.mtr.producer.LoadClassificatorResponseRequest.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "response"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", ">>loadClassificatorResponse>response"), ee.x_road.mtr.producer.LoadClassificatorResponseResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("loadClassificator", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "loadClassificator"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("loadClassificator") == null) {
            _myOperations.put("loadClassificator", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("loadClassificator")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("turismialamliigid", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiAlamliigidVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismialamliigid"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("turismialamliigid") == null) {
            _myOperations.put("turismialamliigid", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("turismialamliigid")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiettevõtjadPäring"), ee.x_road.mtr.producer.TurismiettevõtjadPäring.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("turismiettevotjad", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiEttevõtjadVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiettevotjad"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("turismiettevotjad") == null) {
            _myOperations.put("turismiettevotjad", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("turismiettevotjad")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("turismiettevotjadetailne", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "AsutusDetailne"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "turismiettevotjadetailne"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("turismiettevotjadetailne") == null) {
            _myOperations.put("turismiettevotjadetailne", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("turismiettevotjadetailne")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaParing"), ee.x_road.mtr.producer.TegevuslubaParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("tegevusluba", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaVastusV2"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevusluba"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("tegevusluba") == null) {
            _myOperations.put("tegevusluba", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("tegevusluba")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaSotsiaalhooldusParing"), ee.x_road.mtr.producer.TegevuslubaSotsiaalhooldusParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("tegevuslubaSotsiaalhooldus", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TegevuslubaVastusV2"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "tegevuslubaSotsiaalhooldus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("tegevuslubaSotsiaalhooldus") == null) {
            _myOperations.put("tegevuslubaSotsiaalhooldus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("tegevuslubaSotsiaalhooldus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringParing"), ee.x_road.mtr.producer.RegistreeringParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("registreering", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistriKanneVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registreering"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("registreering") == null) {
            _myOperations.put("registreering", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("registreering")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringDetailneParing"), ee.x_road.mtr.producer.RegistreeringDetailneParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("registreeringDetailne", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringDetailneVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registreeringDetailne"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("registreeringDetailne") == null) {
            _myOperations.put("registreeringDetailne", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("registreeringDetailne")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringMIKOParing"), ee.x_road.mtr.producer.RegistreeringMIKOParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("registreeringMIKO", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "RegistreeringMIKOVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "registreeringMIKO"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("registreeringMIKO") == null) {
            _myOperations.put("registreeringMIKO", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("registreeringMIKO")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaKoodiParing"), ee.x_road.mtr.producer.EttevotjaKoodiParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("soidukikaart", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoidukikaardiVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "soidukikaart"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("soidukikaart") == null) {
            _myOperations.put("soidukikaart", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("soidukikaart")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "EttevotjaKoodiParing"), ee.x_road.mtr.producer.EttevotjaKoodiParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("soitjavedu", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "SoitjaveduVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "soitjavedu"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("soitjavedu") == null) {
            _myOperations.put("soitjavedu", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("soitjavedu")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaksolubaParing"), ee.x_road.mtr.producer.TaksolubaParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taksoluba", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "TaksolubaVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taksoluba"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taksoluba") == null) {
            _myOperations.put("taksoluba", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taksoluba")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeatedParing"), ee.x_road.mtr.producer.VastutavaIsikuTeatedParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("vastutavaIsikuTeated", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeatedVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "vastutavaIsikuTeated"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("vastutavaIsikuTeated") == null) {
            _myOperations.put("vastutavaIsikuTeated", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("vastutavaIsikuTeated")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "muudaVastutavaIsikuNousolekParing"), ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("muudaVastutavaIsikuNousolek", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "muudaVastutavaIsikuNousolekVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "muudaVastutavaIsikuNousolek"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("muudaVastutavaIsikuNousolek") == null) {
            _myOperations.put("muudaVastutavaIsikuNousolek", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("muudaVastutavaIsikuNousolek")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusedParing"), ee.x_road.mtr.producer.MinuTaotlusedParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("minuTaotlused", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusedVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlused"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("minuTaotlused") == null) {
            _myOperations.put("minuTaotlused", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("minuTaotlused")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusParing"), ee.x_road.mtr.producer.MinuTaotlusParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("minuTaotlus", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlusVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "minuTaotlus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("minuTaotlus") == null) {
            _myOperations.put("minuTaotlus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("minuTaotlus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaTaotlusParing"), ee.x_road.mtr.producer.SalvestaTaotlusParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("salvestaTaotlus", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaTaotlusVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaTaotlus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("salvestaTaotlus") == null) {
            _myOperations.put("salvestaTaotlus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("salvestaTaotlus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotlusParing"), ee.x_road.mtr.producer.ValiTaotlusParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("valiTaotlus", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotlusVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotlus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("valiTaotlus") == null) {
            _myOperations.put("valiTaotlus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("valiTaotlus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotjaOtsingParing"), ee.x_road.mtr.producer.TaotluseEttevotjaOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseEttevotjaOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotjaOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseEttevotjaOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseEttevotjaOtsing") == null) {
            _myOperations.put("taotluseEttevotjaOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseEttevotjaOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsikuOtsingParing"), ee.x_road.mtr.producer.TaotluseIsikuOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseIsikuOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsikuOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseIsikuOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseIsikuOtsing") == null) {
            _myOperations.put("taotluseIsikuOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseIsikuOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotluseTegevusalaParing"), ee.x_road.mtr.producer.ValiTaotluseTegevusalaParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("valiTaotluseTegevusala", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotluseTegevusalaVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "valiTaotluseTegevusala"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("valiTaotluseTegevusala") == null) {
            _myOperations.put("valiTaotluseTegevusala", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("valiTaotluseTegevusala")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitatavMajandustegevusParing"), ee.x_road.mtr.producer.KinnitatavMajandustegevusParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("kinnitatavMajandustegevus", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitatavMajandustegevusVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitatavMajandustegevus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("kinnitatavMajandustegevus") == null) {
            _myOperations.put("kinnitatavMajandustegevus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("kinnitatavMajandustegevus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitaMajandustegevusParing"), ee.x_road.mtr.producer.KinnitaMajandustegevusParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("kinnitaMajandustegevus", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitaMajandustegevusVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "kinnitaMajandustegevus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("kinnitaMajandustegevus") == null) {
            _myOperations.put("kinnitaMajandustegevus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("kinnitaMajandustegevus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadressiOtsingParing"), ee.x_road.mtr.producer.TaotluseAadressiOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseAadressiOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadressiOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseAadressiOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseAadressiOtsing") == null) {
            _myOperations.put("taotluseAadressiOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseAadressiOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoidukiOtsingParing"), ee.x_road.mtr.producer.TaotluseSoidukiOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseSoidukiOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoidukiOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseSoidukiOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseSoidukiOtsing") == null) {
            _myOperations.put("taotluseSoidukiOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseSoidukiOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistuseOtsingParing"), ee.x_road.mtr.producer.TaotluseKutsetunnistuseOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseKutsetunnistuseOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistuseOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKutsetunnistuseOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseKutsetunnistuseOtsing") == null) {
            _myOperations.put("taotluseKutsetunnistuseOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseKutsetunnistuseOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistuseOtsingParing"), ee.x_road.mtr.producer.TaotlusePadevustunnistuseOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotlusePadevustunnistuseOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistuseOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotlusePadevustunnistuseOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotlusePadevustunnistuseOtsing") == null) {
            _myOperations.put("taotlusePadevustunnistuseOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotlusePadevustunnistuseOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiOtsingParing"), ee.x_road.mtr.producer.TaotluseLoendiOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseLoendiOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseLoendiOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseLoendiOtsing") == null) {
            _myOperations.put("taotluseLoendiOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseLoendiOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapitaliOtsingParing"), ee.x_road.mtr.producer.TaotluseKapitaliOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseKapitaliOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapitaliOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseKapitaliOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseKapitaliOtsing") == null) {
            _myOperations.put("taotluseKapitaliOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseKapitaliOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHariduseOtsingParing"), ee.x_road.mtr.producer.TaotluseHariduseOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseHariduseOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHariduseOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseHariduseOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseHariduseOtsing") == null) {
            _myOperations.put("taotluseHariduseOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseHariduseOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatuseOtsingParing"), ee.x_road.mtr.producer.TaotluseTaksoYlevaatuseOtsingParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("taotluseTaksoYlevaatuseOtsing", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatuseOtsingVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "taotluseTaksoYlevaatuseOtsing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("taotluseTaksoYlevaatuseOtsing") == null) {
            _myOperations.put("taotluseTaksoYlevaatuseOtsing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("taotluseTaksoYlevaatuseOtsing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CheckTransportManagerGoodReputeRequest_Body"), ee.x_road.mtr.producer.CheckTransportManagerGoodReputeRequest_Body.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("checkTransportManagerGoodRepute", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "CheckTransportManagerGoodReputeResponse_Body"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "checkTransportManagerGoodRepute"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("checkTransportManagerGoodRepute") == null) {
            _myOperations.put("checkTransportManagerGoodRepute", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("checkTransportManagerGoodRepute")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaEttekirjutusParing"), ee.x_road.mtr.producer.SalvestaEttekirjutusParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("salvestaEttekirjutus", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaEttekirjutusVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "salvestaEttekirjutus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("salvestaEttekirjutus") == null) {
            _myOperations.put("salvestaEttekirjutus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("salvestaEttekirjutus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajaParing"), ee.x_road.mtr.producer.FokaHooldajaParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fokaHooldaja", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajaVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldaja"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fokaHooldaja") == null) {
            _myOperations.put("fokaHooldaja", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fokaHooldaja")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajadParing"), ee.x_road.mtr.producer.FokaHooldajadParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fokaHooldajad", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajadVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "fokaHooldajad"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fokaHooldajad") == null) {
            _myOperations.put("fokaHooldajad", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fokaHooldajad")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "andmeteMuudatusedParing"), ee.x_road.mtr.producer.AndmeteMuudatusedParing.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("andmeteMuudatused", _params, new javax.xml.namespace.QName("", "response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "andmeteMuudatusedVastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://mtr.x-road.ee/producer/", "andmeteMuudatused"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("andmeteMuudatused") == null) {
            _myOperations.put("andmeteMuudatused", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("andmeteMuudatused")).add(_oper);
    }

    public Mtr_bindingSkeleton() {
        this.impl = new ee.x_road.mtr.producer.Mtr_bindingImpl();
    }

    public Mtr_bindingSkeleton(ee.x_road.mtr.producer.Mtr_porttype impl) {
        this.impl = impl;
    }
    public ee.x_road.xsd.x_road_xsd.Legacy_response legacyEttevotja(ee.x_road.xsd.x_road_xsd.holders.ArrayOfStringHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.xsd.x_road_xsd.Legacy_response ret = impl.legacyEttevotja(request);
        return ret;
    }

    public ee.x_road.mtr.producer.EttevotjaVastus ettevotja(ee.x_road.mtr.producer.holders.EttevotjaParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.EttevotjaVastus ret = impl.ettevotja(request);
        return ret;
    }

    public ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja[] ettevotjaDetailne(ee.x_road.mtr.producer.holders.EttevotjaDetailneParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.EttevotjaDetailneVastusEttevotja[] ret = impl.ettevotjaDetailne(request);
        return ret;
    }

    public ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja[] ettevotjaDetailneMuinsuskaitse(ee.x_road.mtr.producer.holders.EttevotjaDetailneMuinsuskaitseParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.EttevotjaDetailneMuinsuskaitseVastusEttevotja[] ret = impl.ettevotjaDetailneMuinsuskaitse(request);
        return ret;
    }

    public void loadClassificator(ee.x_road.mtr.producer.LoadClassificatorRequest request, ee.x_road.mtr.producer.holders.LoadClassificatorResponseRequestHolder request2, ee.x_road.mtr.producer.holders.LoadClassificatorResponseResponseHolder response) throws java.rmi.RemoteException
    {
        impl.loadClassificator(request, request2, response);
    }

    public ee.x_road.mtr.producer.TurismiAlamliigidVastus turismialamliigid(javax.xml.rpc.holders.StringHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TurismiAlamliigidVastus ret = impl.turismialamliigid(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TurismiEttevõtjadVastus turismiettevotjad(ee.x_road.mtr.producer.holders.TurismiettevõtjadPäringHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TurismiEttevõtjadVastus ret = impl.turismiettevotjad(request);
        return ret;
    }

    public ee.x_road.mtr.producer.AsutusDetailne turismiettevotjadetailne(javax.xml.rpc.holders.StringHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.AsutusDetailne ret = impl.turismiettevotjadetailne(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TegevuslubaVastusV2 tegevusluba(ee.x_road.mtr.producer.holders.TegevuslubaParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TegevuslubaVastusV2 ret = impl.tegevusluba(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TegevuslubaVastusV2 tegevuslubaSotsiaalhooldus(ee.x_road.mtr.producer.holders.TegevuslubaSotsiaalhooldusParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TegevuslubaVastusV2 ret = impl.tegevuslubaSotsiaalhooldus(request);
        return ret;
    }

    public ee.x_road.mtr.producer.RegistriKanneVastus registreering(ee.x_road.mtr.producer.holders.RegistreeringParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.RegistriKanneVastus ret = impl.registreering(request);
        return ret;
    }

    public ee.x_road.mtr.producer.RegistreeringDetailneVastus registreeringDetailne(ee.x_road.mtr.producer.holders.RegistreeringDetailneParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.RegistreeringDetailneVastus ret = impl.registreeringDetailne(request);
        return ret;
    }

    public ee.x_road.mtr.producer.RegistreeringMIKOVastus registreeringMIKO(ee.x_road.mtr.producer.holders.RegistreeringMIKOParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.RegistreeringMIKOVastus ret = impl.registreeringMIKO(request);
        return ret;
    }

    public ee.x_road.mtr.producer.SoidukikaardiVastus soidukikaart(ee.x_road.mtr.producer.holders.EttevotjaKoodiParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.SoidukikaardiVastus ret = impl.soidukikaart(request);
        return ret;
    }

    public ee.x_road.mtr.producer.SoitjaveduVastus soitjavedu(ee.x_road.mtr.producer.holders.EttevotjaKoodiParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.SoitjaveduVastus ret = impl.soitjavedu(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaksolubaVastus taksoluba(ee.x_road.mtr.producer.holders.TaksolubaParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaksolubaVastus ret = impl.taksoluba(request);
        return ret;
    }

    public ee.x_road.mtr.producer.VastutavaIsikuTeade[] vastutavaIsikuTeated(ee.x_road.mtr.producer.holders.VastutavaIsikuTeatedParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.VastutavaIsikuTeade[] ret = impl.vastutavaIsikuTeated(request);
        return ret;
    }

    public ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekVastus muudaVastutavaIsikuNousolek(ee.x_road.mtr.producer.holders.MuudaVastutavaIsikuNousolekParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.MuudaVastutavaIsikuNousolekVastus ret = impl.muudaVastutavaIsikuNousolek(request);
        return ret;
    }

    public ee.x_road.mtr.producer.MinuTaotlusedVastus minuTaotlused(ee.x_road.mtr.producer.holders.MinuTaotlusedParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.MinuTaotlusedVastus ret = impl.minuTaotlused(request);
        return ret;
    }

    public ee.x_road.mtr.producer.MinuTaotlusVastus minuTaotlus(ee.x_road.mtr.producer.holders.MinuTaotlusParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.MinuTaotlusVastus ret = impl.minuTaotlus(request);
        return ret;
    }

    public ee.x_road.mtr.producer.SalvestaTaotlusVastus salvestaTaotlus(ee.x_road.mtr.producer.holders.SalvestaTaotlusParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.SalvestaTaotlusVastus ret = impl.salvestaTaotlus(request);
        return ret;
    }

    public ee.x_road.mtr.producer.ValiTaotlusVastus valiTaotlus(ee.x_road.mtr.producer.holders.ValiTaotlusParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.ValiTaotlusVastus ret = impl.valiTaotlus(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseEttevotja[] taotluseEttevotjaOtsing(ee.x_road.mtr.producer.holders.TaotluseEttevotjaOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseEttevotja[] ret = impl.taotluseEttevotjaOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseIsik[] taotluseIsikuOtsing(ee.x_road.mtr.producer.holders.TaotluseIsikuOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseIsik[] ret = impl.taotluseIsikuOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseValdkond[] valiTaotluseTegevusala(ee.x_road.mtr.producer.holders.ValiTaotluseTegevusalaParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseValdkond[] ret = impl.valiTaotluseTegevusala(request);
        return ret;
    }

    public ee.x_road.mtr.producer.Majandustegevus[] kinnitatavMajandustegevus(ee.x_road.mtr.producer.holders.KinnitatavMajandustegevusParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.Majandustegevus[] ret = impl.kinnitatavMajandustegevus(request);
        return ret;
    }

    public ee.x_road.mtr.producer.KinnitaMajandustegevusVastus kinnitaMajandustegevus(ee.x_road.mtr.producer.holders.KinnitaMajandustegevusParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.KinnitaMajandustegevusVastus ret = impl.kinnitaMajandustegevus(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseAadress[] taotluseAadressiOtsing(ee.x_road.mtr.producer.holders.TaotluseAadressiOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseAadress[] ret = impl.taotluseAadressiOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseSoiduk[] taotluseSoidukiOtsing(ee.x_road.mtr.producer.holders.TaotluseSoidukiOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseSoiduk[] ret = impl.taotluseSoidukiOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseKutsetunnistus[] taotluseKutsetunnistuseOtsing(ee.x_road.mtr.producer.holders.TaotluseKutsetunnistuseOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseKutsetunnistus[] ret = impl.taotluseKutsetunnistuseOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotlusePadevustunnistus[] taotlusePadevustunnistuseOtsing(ee.x_road.mtr.producer.holders.TaotlusePadevustunnistuseOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotlusePadevustunnistus[] ret = impl.taotlusePadevustunnistuseOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseLoendiOtsingVastus taotluseLoendiOtsing(ee.x_road.mtr.producer.holders.TaotluseLoendiOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseLoendiOtsingVastus ret = impl.taotluseLoendiOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseKapital[] taotluseKapitaliOtsing(ee.x_road.mtr.producer.holders.TaotluseKapitaliOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseKapital[] ret = impl.taotluseKapitaliOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseHaridus[] taotluseHariduseOtsing(ee.x_road.mtr.producer.holders.TaotluseHariduseOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseHaridus[] ret = impl.taotluseHariduseOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[] taotluseTaksoYlevaatuseOtsing(ee.x_road.mtr.producer.holders.TaotluseTaksoYlevaatuseOtsingParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.TaotluseTaksoYlevaatus[] ret = impl.taotluseTaksoYlevaatuseOtsing(request);
        return ret;
    }

    public ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse_Body checkTransportManagerGoodRepute(ee.x_road.mtr.producer.holders.CheckTransportManagerGoodReputeRequest_BodyHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.CheckTransportManagerGoodReputeResponse_Body ret = impl.checkTransportManagerGoodRepute(request);
        return ret;
    }

    public ee.x_road.mtr.producer.SalvestaEttekirjutusVastus salvestaEttekirjutus(ee.x_road.mtr.producer.holders.SalvestaEttekirjutusParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.SalvestaEttekirjutusVastus ret = impl.salvestaEttekirjutus(request);
        return ret;
    }

    public ee.x_road.mtr.producer.FokaHooldajaVastus fokaHooldaja(ee.x_road.mtr.producer.holders.FokaHooldajaParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.FokaHooldajaVastus ret = impl.fokaHooldaja(request);
        return ret;
    }

    public ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja[] fokaHooldajad(ee.x_road.mtr.producer.holders.FokaHooldajadParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.FokaHooldajadVastusHooldaja[] ret = impl.fokaHooldajad(request);
        return ret;
    }

    public ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus[] andmeteMuudatused(ee.x_road.mtr.producer.holders.AndmeteMuudatusedParingHolder request) throws java.rmi.RemoteException
    {
        ee.x_road.mtr.producer.AndmeteMuudatusedVastusMuudatus[] ret = impl.andmeteMuudatused(request);
        return ret;
    }

}
