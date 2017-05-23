/**
 * AretoBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.alkor2.producers.producer.alkor2;

public class AretoBindingSkeleton implements ee.riik.xtee.alkor2.producers.producer.alkor2.AretoPortType, org.apache.axis.wsdl.Skeleton {
    private ee.riik.xtee.alkor2.producers.producer.alkor2.AretoPortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("listMethods", _params, new javax.xml.namespace.QName("", "keha"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "listMethods_vastus"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "listMethods"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("listMethods") == null) {
            _myOperations.put("listMethods", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("listMethods")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://x-tee.riik.ee/xsd/xtee.xsd", "ArrayOfString"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "legacy_response"), ee.riik.xtee.alkor2.producers.producer.alkor2.Legacy_response.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("legacy1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "legacy1"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("legacy1") == null) {
            _myOperations.put("legacy1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("legacy1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruanne"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "DataHandler"), javax.activation.DataHandler.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("eitlaadib", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("", "eitlaadib"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("eitlaadib") == null) {
            _myOperations.put("eitlaadib", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("eitlaadib")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aretolaadib_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruanne"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "DataHandler"), javax.activation.DataHandler.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aretolaadib_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitlaadib_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("aretolaadib", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "aretolaadib"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("aretolaadib") == null) {
            _myOperations.put("aretolaadib", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("aretolaadib")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "liikumine_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("liikumine", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "liikumine"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("liikumine") == null) {
            _myOperations.put("liikumine", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("liikumine")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitparib_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("eitparib", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "eitparib"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("eitparib") == null) {
            _myOperations.put("eitparib", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("eitparib")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandjaparija_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandjaparija_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "eitparib_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Eitparib_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("aruandjaparija", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "aruandjaparija"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("aruandjaparija") == null) {
            _myOperations.put("aruandjaparija", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("aruandjaparija")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "aruandeparing_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("aruandeparing", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "aruandeparing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("aruandeparing") == null) {
            _myOperations.put("aruandeparing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("aruandeparing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "tooteparing_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("tooteparing", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "tooteparing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("tooteparing") == null) {
            _myOperations.put("tooteparing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("tooteparing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_paring"), ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "kammparing_vastus"), ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("kammparing", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "kammparing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("kammparing") == null) {
            _myOperations.put("kammparing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("kammparing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "MokaResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.MokaResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("transactionStatement", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "transactionStatement"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("transactionStatement") == null) {
            _myOperations.put("transactionStatement", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("transactionStatement")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getApplicationDocuments", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "getApplicationDocuments"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("getApplicationDocuments") == null) {
            _myOperations.put("getApplicationDocuments", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getApplicationDocuments")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doc1"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "DataHandler"), javax.activation.DataHandler.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationDocumentsQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateApplicationDocuments", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer.alkor2", "updateApplicationDocuments"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateApplicationDocuments") == null) {
            _myOperations.put("updateApplicationDocuments", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateApplicationDocuments")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addApplication", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "addApplication"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("addApplication") == null) {
            _myOperations.put("addApplication", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addApplication")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateApplication", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "updateApplication"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateApplication") == null) {
            _myOperations.put("updateApplication", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateApplication")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AppFollowResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.AppFollowResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("applyedApplications", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "applyedApplications"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("applyedApplications") == null) {
            _myOperations.put("applyedApplications", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("applyedApplications")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationsResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationsResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("acceptedApplications", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "acceptedApplications"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("acceptedApplications") == null) {
            _myOperations.put("acceptedApplications", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("acceptedApplications")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("prolongApplication", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "prolongApplication"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("prolongApplication") == null) {
            _myOperations.put("prolongApplication", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("prolongApplication")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("prolongApp60", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "prolongApp60"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("prolongApp60") == null) {
            _myOperations.put("prolongApp60", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("prolongApp60")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getApplication", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "getApplication"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("getApplication") == null) {
            _myOperations.put("getApplication", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getApplication")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "UpdateApplicationResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("checkApplication", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "checkApplication"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("checkApplication") == null) {
            _myOperations.put("checkApplication", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("checkApplication")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "ExtendResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.ExtendResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("extendApps", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "extendApps"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("extendApps") == null) {
            _myOperations.put("extendApps", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("extendApps")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnterpriseQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnterpriseQuery"), ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "EnterpriseResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEnterprise", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "getEnterprise"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEnterprise") == null) {
            _myOperations.put("getEnterprise", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEnterprise")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Enterprise"), ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "Enterprise"), ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "AddEnterpriseResponse"), ee.riik.xtee.alkor2.producers.producer.alkor2.AddEnterpriseResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addEnterprise", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://producers.alkor2.xtee.riik.ee/producer/alkor2", "addEnterprise"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("addEnterprise") == null) {
            _myOperations.put("addEnterprise", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addEnterprise")).add(_oper);
    }

    public AretoBindingSkeleton() {
        this.impl = new ee.riik.xtee.alkor2.producers.producer.alkor2.AretoBindingImpl();
    }

    public AretoBindingSkeleton(ee.riik.xtee.alkor2.producers.producer.alkor2.AretoPortType impl) {
        this.impl = impl;
    }
    public java.lang.String[] listMethods(java.lang.String keha) throws java.rmi.RemoteException
    {
        java.lang.String[] ret = impl.listMethods(keha);
        return ret;
    }

    public void legacy1(java.lang.String[] keha, ee.riik.x_tee.xsd.xtee_xsd.holders.ArrayOfStringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Legacy_responseHolder keha2) throws java.rmi.RemoteException
    {
        impl.legacy1(keha, paring, keha2);
    }

    public void eitlaadib(ee.riik.xtee.alkor2.producers.producer.alkor2.Eitlaadib_paring keha, org.apache.axis.holders.DataHandlerHolder aruanne, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.eitlaadib(keha, aruanne, paring, keha2);
    }

    public void aretolaadib(ee.riik.xtee.alkor2.producers.producer.alkor2.Aretolaadib_paring keha, org.apache.axis.holders.DataHandlerHolder aruanne, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aretolaadib_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitlaadib_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.aretolaadib(keha, aruanne, paring, keha2);
    }

    public void liikumine(ee.riik.xtee.alkor2.producers.producer.alkor2.Liikumine_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Liikumine_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.liikumine(keha, paring, keha2);
    }

    public void eitparib(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.eitparib(keha, paring, keha2);
    }

    public void aruandjaparija(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandjaparija_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandjaparija_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Eitparib_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.aruandjaparija(keha, paring, keha2);
    }

    public void aruandeparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Aruandeparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Aruandeparing_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.aruandeparing(keha, paring, keha2);
    }

    public void tooteparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Tooteparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Tooteparing_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.tooteparing(keha, paring, keha2);
    }

    public void kammparing(ee.riik.xtee.alkor2.producers.producer.alkor2.Kammparing_paring keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_paringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.Kammparing_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.kammparing(keha, paring, keha2);
    }

    public void transactionStatement(ee.riik.xtee.alkor2.producers.producer.alkor2.MokaQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.MokaResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.transactionStatement(keha, paring, keha2);
    }

    public void getApplicationDocuments(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.getApplicationDocuments(keha, paring, keha2);
    }

    public void updateApplicationDocuments(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationDocumentsQuery keha, org.apache.axis.holders.DataHandlerHolder doc1, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationDocumentsQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.updateApplicationDocuments(keha, doc1, paring, keha2);
    }

    public void addApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.AddApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddApplicationResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.addApplication(keha, paring, keha2);
    }

    public void updateApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.updateApplication(keha, paring, keha2);
    }

    public void applyedApplications(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AppFollowResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.applyedApplications(keha, paring, keha2);
    }

    public void acceptedApplications(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationsResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.acceptedApplications(keha, paring, keha2);
    }

    public void prolongApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.prolongApplication(keha, paring, keha2);
    }

    public void prolongApp60(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.prolongApp60(keha, paring, keha2);
    }

    public void getApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.ApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder keha2) throws java.rmi.RemoteException
    {
        impl.getApplication(keha, paring, keha2);
    }

    public void checkApplication(ee.riik.xtee.alkor2.producers.producer.alkor2.UpdateApplicationQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.UpdateApplicationResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.checkApplication(keha, paring, keha2);
    }

    public void extendApps(java.lang.String keha, javax.xml.rpc.holders.StringHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.ExtendResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.extendApps(keha, paring, keha2);
    }

    public void getEnterprise(ee.riik.xtee.alkor2.producers.producer.alkor2.EnterpriseQuery keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseQueryHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.getEnterprise(keha, paring, keha2);
    }

    public void addEnterprise(ee.riik.xtee.alkor2.producers.producer.alkor2.Enterprise keha, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.EnterpriseHolder paring, ee.riik.xtee.alkor2.producers.producer.alkor2.holders.AddEnterpriseResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.addEnterprise(keha, paring, keha2);
    }

}
