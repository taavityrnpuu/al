/**
 * Alkor2BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.alkor2;

public class Alkor2BindingSkeleton implements eu.x_road.alkor2.Alkor2Port, org.apache.axis.wsdl.Skeleton {
    private eu.x_road.alkor2.Alkor2Port impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "testSystem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("testSystem", _params, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "testSystemResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "testSystem"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("testSystem") == null) {
            _myOperations.put("testSystem", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("testSystem")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Moka"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "MokaType"), eu.x_road.alkor2.types.MokaType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("transactionStatement", _params, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "transactionStatementResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">transactionStatementResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "transactionStatement"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("transactionStatement") == null) {
            _myOperations.put("transactionStatement", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("transactionStatement")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "l_date_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "l_date_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "periodStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aruandeperiood"), eu.x_road.alkor2.types.Aruandeperiood.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "periodEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aruandeperiood"), eu.x_road.alkor2.types.Aruandeperiood.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resp_attach"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "teade"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruanded"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">>aruandeparingResponse>aruanded"), eu.x_road.alkor2.types.Aruandeparing_vastuserida[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruanded_csv"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "csv"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("aruandeparing", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aruandeparing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("aruandeparing") == null) {
            _myOperations.put("aruandeparing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("aruandeparing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aruandeperioodReq"), eu.x_road.alkor2.types.AruandeperioodReq.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruanne"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "teade"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "vead"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">>eitlaadibResponse>vead"), eu.x_road.alkor2.types.Reaviga[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("eitlaadib", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "eitlaadib"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("eitlaadib") == null) {
            _myOperations.put("eitlaadib", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("eitlaadib")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruandja"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aruandjakoodigaareto"), eu.x_road.alkor2.types.Aruandjakoodigaareto.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aruandeperioodReq"), eu.x_road.alkor2.types.AruandeperioodReq.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aruanne"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "teade"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "vead"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">>aretolaadibResponse>vead"), eu.x_road.alkor2.types.Reaviga[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("aretolaadib", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aretolaadib"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("aretolaadib") == null) {
            _myOperations.put("aretolaadib", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("aretolaadib")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_book_nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "status_t"), eu.x_road.alkor2.types.Status_t.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "item"), eu.x_road.alkor2.types.Item.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("kammparing", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "kammparing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("kammparing") == null) {
            _myOperations.put("kammparing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("kammparing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_book_nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_fromS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_toS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_fromE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_toE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "producttype"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "tooteliik"), eu.x_road.alkor2.types.Tooteliik.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "man_actor_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "CountryType"), eu.x_road.alkor2.types.CountryType.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "volume"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "CapacityType"), eu.x_road.alkor2.types.CapacityType.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ethanol_vol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resp_attach"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "teade"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tooted"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">>tooteparingResponse>tooted"), eu.x_road.alkor2.types.Tooteparing_vastuserida[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tooted_csv"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "csv"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("tooteparing", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "tooteparing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("tooteparing") == null) {
            _myOperations.put("tooteparing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("tooteparing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_book_nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ent_reg_nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ent_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "market"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addr_county"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addr_town"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addr_str"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "p_nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "p_cnt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "l_date_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "l_date_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "aruandeperiood"), eu.x_road.alkor2.types.Aruandeperiood.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resp_attach"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "teade"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "liikumised"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", ">>liikumineParingResponse>liikumised"), eu.x_road.alkor2.types.Liikumine[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "liikumised_csv"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "csv"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("liikumineParing", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "liikumineParing"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("liikumineParing") == null) {
            _myOperations.put("liikumineParing", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("liikumineParing")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "ArrayOfString"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "teade"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "url"), org.apache.axis.types.URI.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("legacy1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://alkor2.x-road.eu/types", "legacy1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("legacy1") == null) {
            _myOperations.put("legacy1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("legacy1")).add(_oper);
    }

    public Alkor2BindingSkeleton() {
        this.impl = new eu.x_road.alkor2.Alkor2BindingImpl();
    }

    public Alkor2BindingSkeleton(eu.x_road.alkor2.Alkor2Port impl) {
        this.impl = impl;
    }
    public java.lang.Object testSystem(java.lang.Object body) throws java.rmi.RemoteException
    {
        java.lang.Object ret = impl.testSystem(body);
        return ret;
    }

    public eu.x_road.alkor2.types.TransactionStatementResponse transactionStatement(eu.x_road.alkor2.types.MokaType moka) throws java.rmi.RemoteException
    {
        eu.x_road.alkor2.types.TransactionStatementResponse ret = impl.transactionStatement(moka);
        return ret;
    }

    public void aruandeparing(java.util.Date l_date_from, java.util.Date l_date_to, eu.x_road.alkor2.types.Aruandeperiood periodStart, eu.x_road.alkor2.types.Aruandeperiood periodEnd, boolean resp_attach, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.AruandeparingResponseAruandedHolder aruanded, javax.xml.rpc.holders.StringHolder aruanded_csv) throws java.rmi.RemoteException
    {
        impl.aruandeparing(l_date_from, l_date_to, periodStart, periodEnd, resp_attach, teade, aruanded, aruanded_csv);
    }

    public void eitlaadib(eu.x_road.alkor2.types.AruandeperioodReq period, byte[] aruanne, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.EitlaadibResponseVeadHolder vead) throws java.rmi.RemoteException
    {
        impl.eitlaadib(period, aruanne, teade, vead);
    }

    public void aretolaadib(eu.x_road.alkor2.types.Aruandjakoodigaareto aruandja, eu.x_road.alkor2.types.AruandeperioodReq period, byte[] aruanne, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.AretolaadibResponseVeadHolder vead) throws java.rmi.RemoteException
    {
        impl.aretolaadib(aruandja, period, aruanne, teade, vead);
    }

    public void kammparing(java.lang.String reg_book_nr, java.util.Date reg_date, eu.x_road.alkor2.types.holders.Status_tHolder status, eu.x_road.alkor2.types.holders.ItemHolder item) throws java.rmi.RemoteException
    {
        impl.kammparing(reg_book_nr, reg_date, status, item);
    }

    public void tooteparing(java.lang.String reg_book_nr, java.util.Date date_fromS, java.util.Date date_toS, java.util.Date date_fromE, java.util.Date date_toE, java.lang.String item_name, eu.x_road.alkor2.types.Tooteliik producttype, java.lang.String man_actor_name, eu.x_road.alkor2.types.CountryType country, eu.x_road.alkor2.types.CapacityType volume, java.lang.String ethanol_vol, java.lang.String desc, java.lang.Boolean status1, java.lang.Boolean status2, boolean resp_attach, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.TooteparingResponseTootedHolder tooted, javax.xml.rpc.holders.StringHolder tooted_csv) throws java.rmi.RemoteException
    {
        impl.tooteparing(reg_book_nr, date_fromS, date_toS, date_fromE, date_toE, item_name, producttype, man_actor_name, country, volume, ethanol_vol, desc, status1, status2, resp_attach, teade, tooted, tooted_csv);
    }

    public void liikumineParing(java.lang.String reg_book_nr, java.lang.String ent_reg_nr, java.lang.String ent_name, java.lang.String receiver, java.lang.String market, java.lang.String addr_county, java.lang.String addr_town, java.lang.String addr_str, java.lang.String p_nr, java.lang.String p_cnt, java.util.Date l_date_from, java.util.Date l_date_to, eu.x_road.alkor2.types.Aruandeperiood period, java.lang.Integer report_id, java.lang.Boolean resp_attach, javax.xml.rpc.holders.StringHolder teade, eu.x_road.alkor2.types.holders.LiikumineParingResponseLiikumisedHolder liikumised, javax.xml.rpc.holders.StringHolder liikumised_csv) throws java.rmi.RemoteException
    {
        impl.liikumineParing(reg_book_nr, ent_reg_nr, ent_name, receiver, market, addr_county, addr_town, addr_str, p_nr, p_cnt, l_date_from, l_date_to, period, report_id, resp_attach, teade, liikumised, liikumised_csv);
    }

    public void legacy1(java.lang.String[] keha, javax.xml.rpc.holders.StringHolder teade, org.apache.axis.holders.URIHolder url) throws java.rmi.RemoteException
    {
        impl.legacy1(keha, teade, url);
    }

}
