/**
 * AriregXteeSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.arireg.producer;

public class AriregXteeSkeleton implements eu.x_road.arireg.producer.AriregXtee, org.apache.axis.wsdl.Skeleton {
    private eu.x_road.arireg.producer.AriregXtee impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1_IN"), eu.x_road.arireg.producer.DebugAdapter_v1_IN.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1_IN"), eu.x_road.arireg.producer.DebugAdapter_v1_IN.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1_OUT"), eu.x_road.arireg.producer.DebugAdapter_v1_OUT.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("debugAdapter_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "debugAdapter_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("debugAdapter_v1") == null) {
            _myOperations.put("debugAdapter_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("debugAdapter_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_Query"), eu.x_road.arireg.producer.Detailandmed_v5_Query.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_Query"), eu.x_road.arireg.producer.Detailandmed_v5_Query.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v5_Vastus"), eu.x_road.arireg.producer.Detailandmed_v5_Vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("detailandmed_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("detailandmed_v1") == null) {
            _myOperations.put("detailandmed_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("detailandmed_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokumentide_loetelu_paring_v2"), eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokumentide_loetelu_paring_v2"), eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_dokumentide_loetelu_vastus_v2"), eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_vastus_v2.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaDokumentideLoetelu_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaDokumentideLoetelu_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaDokumentideLoetelu_v1") == null) {
            _myOperations.put("ettevotjaDokumentideLoetelu_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaDokumentideLoetelu_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded_paring"), eu.x_road.arireg.producer.Ettevotja_esmakanded_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded_paring"), eu.x_road.arireg.producer.Ettevotja_esmakanded_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_esmakanded_vastus"), eu.x_road.arireg.producer.Ettevotja_esmakanne[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaEsmakanded_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaEsmakanded_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaEsmakanded_v1") == null) {
            _myOperations.put("ettevotjaEsmakanded_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaEsmakanded_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuline_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuline_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuline_vastus"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaMuudatusedTasuline_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaMuudatusedTasuline_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaMuudatusedTasuline_v1") == null) {
            _myOperations.put("ettevotjaMuudatusedTasuline_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaMuudatusedTasuline_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_fail_paring"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_fail_paring"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_fail_vastus"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaRekvisiididFail_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaRekvisiididFail_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaRekvisiididFail_v1") == null) {
            _myOperations.put("ettevotjaRekvisiididFail_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaRekvisiididFail_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_paring"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_paring"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_rekvisiidid_vastus"), eu.x_road.arireg.producer.Ettevotja_rekvisiidid_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaRekvisiidid_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaRekvisiidid_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaRekvisiidid_v1") == null) {
            _myOperations.put("ettevotjaRekvisiidid_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaRekvisiidid_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottega_seotud_isikud_paring"), eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottega_seotud_isikud_paring"), eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottega_seotud_isikud_vastus"), eu.x_road.arireg.producer.Seos[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevottegaSeotudIsikud_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevottegaSeotudIsikud_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevottegaSeotudIsikud_v1") == null) {
            _myOperations.put("ettevottegaSeotudIsikud_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevottegaSeotudIsikud_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_paring"), eu.x_road.arireg.producer.Paringesindus_v4_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_paring"), eu.x_road.arireg.producer.Paringesindus_v4_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_v4_vastus"), eu.x_road.arireg.producer.Paringesindus_v4_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("esindus_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esindus_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("esindus_v1") == null) {
            _myOperations.put("esindus_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("esindus_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_paring"), eu.x_road.arireg.producer.Klassifikaatorid_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_paring"), eu.x_road.arireg.producer.Klassifikaatorid_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_vastus"), eu.x_road.arireg.producer.Klassifikaator[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("klassifikaatorid_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "klassifikaatorid_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("klassifikaatorid_v1") == null) {
            _myOperations.put("klassifikaatorid_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("klassifikaatorid_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_paring"), eu.x_road.arireg.producer.Paringliht_tasuta_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_paring"), eu.x_road.arireg.producer.Paringliht_tasuta_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_tasuta_vastus"), eu.x_road.arireg.producer.Paringliht_tasuta_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("lihtandmedTasuta_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "lihtandmedTasuta_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("lihtandmedTasuta_v1") == null) {
            _myOperations.put("lihtandmedTasuta_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("lihtandmedTasuta_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_paring"), eu.x_road.arireg.producer.Paringliht_v5_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_paring"), eu.x_road.arireg.producer.Paringliht_v5_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringliht_v5_vastus"), eu.x_road.arireg.producer.Paringliht_v5_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("lihtandmed_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "lihtandmed_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("lihtandmed_v1") == null) {
            _myOperations.put("lihtandmed_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("lihtandmed_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_loetelu_paring"), eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_loetelu_paring"), eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_loetelu_vastus"), eu.x_road.arireg.producer.Majandusaasta_aruanne[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("majandusaastaAruanneteLoetelu_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaastaAruanneteLoetelu_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("majandusaastaAruanneteLoetelu_v1") == null) {
            _myOperations.put("majandusaastaAruanneteLoetelu_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("majandusaastaAruanneteLoetelu_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_kirjed_paring"), eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_kirjed_paring"), eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaasta_aruannete_kirjed_vastus"), eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("majandusaastaAruanneteKirjed_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "majandusaastaAruanneteKirjed_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("majandusaastaAruanneteKirjed_v1") == null) {
            _myOperations.put("majandusaastaAruanneteKirjed_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("majandusaastaAruanneteKirjed_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotud_isiku_otsing_paring"), eu.x_road.arireg.producer.Seotud_isiku_otsing_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotud_isiku_otsing_paring"), eu.x_road.arireg.producer.Seotud_isiku_otsing_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotud_isiku_otsing_vastus"), eu.x_road.arireg.producer.Seotud_isiku_otsing_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("seotudIsikuOtsing_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "seotudIsikuOtsing_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("seotudIsikuOtsing_v1") == null) {
            _myOperations.put("seotudIsikuOtsing_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("seotudIsikuOtsing_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_paring"), eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_paring"), eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_auditeerimiseandmed_vastus"), eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("aruandeAuditeerimiseAndmed_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruandeAuditeerimiseAndmed_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("aruandeAuditeerimiseAndmed_v1") == null) {
            _myOperations.put("aruandeAuditeerimiseAndmed_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("aruandeAuditeerimiseAndmed_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_paring"), eu.x_road.arireg.producer.Aruande_myygitulu_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_paring"), eu.x_road.arireg.producer.Aruande_myygitulu_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruande_myygitulu_vastus"), eu.x_road.arireg.producer.Aruande_myygitulu_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("aruandeMyygituluEMTAKjargi_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "aruandeMyygituluEMTAKjargi_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("aruandeMyygituluEMTAKjargi_v1") == null) {
            _myOperations.put("aruandeMyygituluEMTAKjargi_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("aruandeMyygituluEMTAKjargi_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_paring"), eu.x_road.arireg.producer.Paringarikeelud_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_paring"), eu.x_road.arireg.producer.Paringarikeelud_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringarikeelud_vastus"), eu.x_road.arireg.producer.Paringarikeelud_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("arikeelud_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "arikeelud_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("arikeelud_v1") == null) {
            _myOperations.put("arikeelud_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("arikeelud_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_Request"), eu.x_road.arireg.producer.Ariregistri_toimik_Request.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_Request"), eu.x_road.arireg.producer.Ariregistri_toimik_Request.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistri_toimik_Response"), eu.x_road.arireg.producer.Ariregistri_toimik_Response.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ariregistriToimik_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ariregistriToimik_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ariregistriToimik_v1") == null) {
            _myOperations.put("ariregistriToimik_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ariregistriToimik_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_ep_v1_Query"), eu.x_road.arireg.producer.Detailandmed_ep_v1_Query.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_ep_v1_Query"), eu.x_road.arireg.producer.Detailandmed_ep_v1_Query.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmed_ep_v1_Vastus"), eu.x_road.arireg.producer.Detailandmed_ep_v1_Vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("detailandmedEP_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "detailandmedEP_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("detailandmedEP_v1") == null) {
            _myOperations.put("detailandmedEP_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("detailandmedEP_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_paring"), eu.x_road.arireg.producer.Erakondakuuluvus_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_paring"), eu.x_road.arireg.producer.Erakondakuuluvus_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondakuuluvus_vastus"), eu.x_road.arireg.producer.Erakondakuuluvus_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("erakondaKuuluvus_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakondaKuuluvus_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("erakondaKuuluvus_v1") == null) {
            _myOperations.put("erakondaKuuluvus_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("erakondaKuuluvus_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_paring"), eu.x_road.arireg.producer.Erakonnanimekiri_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_paring"), eu.x_road.arireg.producer.Erakonnanimekiri_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnanimekiri_vastus"), eu.x_road.arireg.producer.Erakonnanimekiri_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("erakonnaNimekiri_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "erakonnaNimekiri_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("erakonnaNimekiri_v1") == null) {
            _myOperations.put("erakonnaNimekiri_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("erakonnaNimekiri_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_paring"), eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_paring"), eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringesindus_iseendakohta_vastus"), eu.x_road.arireg.producer.Paringesindus_iseendakohta_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("esindusIseendaKohta_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "esindusIseendaKohta_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("esindusIseendaKohta_v1") == null) {
            _myOperations.put("esindusIseendaKohta_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("esindusIseendaKohta_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriDokumendidParing_v1"), eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriDokumendidParing_v1"), eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriDokumendidVastus_v1"), eu.x_road.arireg.producer.DigiteeriDokumendidVastus_v1.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evportaalDigiteeriDokumendid_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evportaalDigiteeriDokumendid_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evportaalDigiteeriDokumendid_v1") == null) {
            _myOperations.put("evportaalDigiteeriDokumendid_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evportaalDigiteeriDokumendid_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriToimikParing_v1"), eu.x_road.arireg.producer.DigiteeriToimikParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriToimikParing_v1"), eu.x_road.arireg.producer.DigiteeriToimikParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "DigiteeriToimikVastus_v1"), eu.x_road.arireg.producer.DigiteeriToimikVastus_v1.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evportaalDigiteeriToimik_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evportaalDigiteeriToimik_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evportaalDigiteeriToimik_v1") == null) {
            _myOperations.put("evportaalDigiteeriToimik_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evportaalDigiteeriToimik_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MargiKattetoimetatuksParing_v1"), eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MargiKattetoimetatuksParing_v1"), eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MargiKattetoimetatuksVastus_v1"), eu.x_road.arireg.producer.MargiKattetoimetatuksVastus_v1.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evportaalMargiKattetoimetatuks_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evportaalMargiKattetoimetatuks_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evportaalMargiKattetoimetatuks_v1") == null) {
            _myOperations.put("evportaalMargiKattetoimetatuks_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evportaalMargiKattetoimetatuks_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_tootukassa_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_tootukassa_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_tootukassa_vastus"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaMuudatusedTasutaTootukassa_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaMuudatusedTasutaTootukassa_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaMuudatusedTasutaTootukassa_v1") == null) {
            _myOperations.put("ettevotjaMuudatusedTasutaTootukassa_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaMuudatusedTasutaTootukassa_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_paring"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotja_muudatused_tasuta_vastus"), eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ettevotjaMuudatusedTasuta_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ettevotjaMuudatusedTasuta_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ettevotjaMuudatusedTasuta_v1") == null) {
            _myOperations.put("ettevotjaMuudatusedTasuta_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ettevotjaMuudatusedTasuta_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVK_kanded_v1_paring"), eu.x_road.arireg.producer.EVK_kanded_v1_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVK_kanded_v1_paring"), eu.x_road.arireg.producer.EVK_kanded_v1_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVK_kanded_v1_vastus"), eu.x_road.arireg.producer.EVK_kanded_v1_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("EVKKanded_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVKKanded_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("EVKKanded_v1") == null) {
            _myOperations.put("EVKKanded_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("EVKKanded_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_paring"), eu.x_road.arireg.producer.Kustutamine_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_paring"), eu.x_road.arireg.producer.Kustutamine_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_vastus"), eu.x_road.arireg.producer.Kustutamine_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("kustutamine_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kustutamine_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("kustutamine_v1") == null) {
            _myOperations.put("kustutamine_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("kustutamine_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Query"), eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Query"), eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_menetlusinfo_v2_Vastus"), eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("kyMenetlusinfo_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kyMenetlusinfo_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("kyMenetlusinfo_v1") == null) {
            _myOperations.put("kyMenetlusinfo_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("kyMenetlusinfo_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Query"), eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Query"), eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "ky_registriosamuut_v1_Vastus"), eu.x_road.arireg.producer.Ky_registriosamuut_v1_Vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("kyRegistriosaMuutused_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "kyRegistriosaMuutused_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("kyRegistriosaMuutused_v1") == null) {
            _myOperations.put("kyRegistriosaMuutused_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("kyRegistriosaMuutused_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruse_dokument_Request"), eu.x_road.arireg.producer.Maaruse_dokument_Request.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruse_dokument_Request"), eu.x_road.arireg.producer.Maaruse_dokument_Request.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruse_dokument_Vastus"), eu.x_road.arireg.producer.Maaruse_dokument_Vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("maaruseDokument_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "maaruseDokument_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("maaruseDokument_v1") == null) {
            _myOperations.put("maaruseDokument_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("maaruseDokument_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_paring"), eu.x_road.arireg.producer.Menetlusinfo_v3_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_paring"), eu.x_road.arireg.producer.Menetlusinfo_v3_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v3_vastus"), eu.x_road.arireg.producer.Menetlusinfo_v3_menetlused[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("menetlusinfo_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "menetlusinfo_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("menetlusinfo_v1") == null) {
            _myOperations.put("menetlusinfo_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("menetlusinfo_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring"), eu.x_road.arireg.producer.Mtabilanssv3_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring"), eu.x_road.arireg.producer.Mtabilanssv3_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_vastus"), eu.x_road.arireg.producer.Mtabilanssv3_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaBilanss_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaBilanss_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaBilanss_v1") == null) {
            _myOperations.put("mtaBilanss_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaBilanss_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring"), eu.x_road.arireg.producer.Mtabilanssv3_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssv3_paring"), eu.x_road.arireg.producer.Mtabilanssv3_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilanssfv3_vastus"), eu.x_road.arireg.producer.Mtabilanssfv3_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaBilanssFail_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaBilanssFail_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaBilanssFail_v1") == null) {
            _myOperations.put("mtaBilanssFail_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaBilanssFail_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring"), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring"), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_vastus"), eu.x_road.arireg.producer.Mtabilsisuv2_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaBilSisu_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaBilSisu_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaBilSisu_v1") == null) {
            _myOperations.put("mtaBilSisu_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaBilSisu_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring"), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisuv2_paring"), eu.x_road.arireg.producer.Mtabilsisuv2_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtabilsisufv2_vastus"), eu.x_road.arireg.producer.Mtabilsisufv2_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaBilSisuFail_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaBilSisuFail_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaBilSisuFail_v1") == null) {
            _myOperations.put("mtaBilSisuFail_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaBilSisuFail_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_paring"), eu.x_road.arireg.producer.Mtaev_seisundid_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_paring"), eu.x_road.arireg.producer.Mtaev_seisundid_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaev_seisundid_vastus"), eu.x_road.arireg.producer.Mtaev_seisundid_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaEvSeisundid_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaEvSeisundid_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaEvSeisundid_v1") == null) {
            _myOperations.put("mtaEvSeisundid_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaEvSeisundid_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_paring"), eu.x_road.arireg.producer.Mtahoiatused_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_paring"), eu.x_road.arireg.producer.Mtahoiatused_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtahoiatused_vastus"), eu.x_road.arireg.producer.Mtahoiatused_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaHoiatused_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaHoiatused_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaHoiatused_v1") == null) {
            _myOperations.put("mtaHoiatused_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaHoiatused_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_paring"), eu.x_road.arireg.producer.Mtamajpaevik_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_paring"), eu.x_road.arireg.producer.Mtamajpaevik_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamajpaevik_vastus"), eu.x_road.arireg.producer.Mtamajpaevik_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaMajPaevik_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaMajPaevik_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaMajPaevik_v1") == null) {
            _myOperations.put("mtaMajPaevik_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaMajPaevik_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_paring"), eu.x_road.arireg.producer.Mtamaruosad_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_paring"), eu.x_road.arireg.producer.Mtamaruosad_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtamaruosad_vastus"), eu.x_road.arireg.producer.Mtamaruosad_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaMajAruOsad_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaMajAruOsad_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaMajAruOsad_v1") == null) {
            _myOperations.put("mtaMajAruOsad_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaMajAruOsad_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_paring"), eu.x_road.arireg.producer.Mtaotsused_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_paring"), eu.x_road.arireg.producer.Mtaotsused_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaotsused_vastus"), eu.x_road.arireg.producer.Mtaotsused_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaOtsused_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaOtsused_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaOtsused_v1") == null) {
            _myOperations.put("mtaOtsused_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaOtsused_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_paring"), eu.x_road.arireg.producer.Mtapaevik_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_paring"), eu.x_road.arireg.producer.Mtapaevik_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtapaevik_vastus"), eu.x_road.arireg.producer.Mtapaevik_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaPaevik_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaPaevik_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaPaevik_v1") == null) {
            _myOperations.put("mtaPaevik_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaPaevik_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_paring"), eu.x_road.arireg.producer.Mtatrahvid_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_paring"), eu.x_road.arireg.producer.Mtatrahvid_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtatrahvid_vastus"), eu.x_road.arireg.producer.Mtatrahvid_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mtaTrahvid_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "mtaTrahvid_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mtaTrahvid_v1") == null) {
            _myOperations.put("mtaTrahvid_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mtaTrahvid_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineQuery"), eu.x_road.arireg.producer.NapTasumiseLisamineQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineQuery"), eu.x_road.arireg.producer.NapTasumiseLisamineQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "NapTasumiseLisamineResponse"), eu.x_road.arireg.producer.NapTasumiseLisamineResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("napTasumiseLisamine_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "napTasumiseLisamine_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("napTasumiseLisamine_v1") == null) {
            _myOperations.put("napTasumiseLisamine_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("napTasumiseLisamine_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_paring"), eu.x_road.arireg.producer.Paringnimesobivus_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_paring"), eu.x_road.arireg.producer.Paringnimesobivus_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paringnimesobivus_v2_vastus"), eu.x_road.arireg.producer.Paringnimesobivus_v2_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("nimeSobivus_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "nimeSobivus_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("nimeSobivus_v1") == null) {
            _myOperations.put("nimeSobivus_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("nimeSobivus_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutusedParing_v1"), eu.x_road.arireg.producer.RKOARRAsutusedParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutusedParing_v1"), eu.x_road.arireg.producer.RKOARRAsutusedParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "RKOARRAsutusedVastus_v1"), eu.x_road.arireg.producer.RKOARRAsutused_v1_Asutus[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rkoarr_asutused_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "rkoarr_asutused_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rkoarr_asutused_v1") == null) {
            _myOperations.put("rkoarr_asutused_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rkoarr_asutused_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_paring"), eu.x_road.arireg.producer.Registrikaart_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_paring"), eu.x_road.arireg.producer.Registrikaart_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_vastus"), eu.x_road.arireg.producer.Registrikaart_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("registrikaart_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "registrikaart_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("registrikaart_v1") == null) {
            _myOperations.put("registrikaart_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("registrikaart_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "SooritaKanne_v4"), eu.x_road.arireg.producer.SooritaKanne_v4.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "SooritaKanne_v4"), eu.x_road.arireg.producer.SooritaKanne_v4.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "SooritaKanneVastus_v4"), eu.x_road.arireg.producer.SooritaKanneVastus_v4.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sooritaKanne_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "sooritaKanne_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sooritaKanne_v1") == null) {
            _myOperations.put("sooritaKanne_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sooritaKanne_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendidRequest"), eu.x_road.arireg.producer.Toimiku_dokumendidRequest.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendidRequest"), eu.x_road.arireg.producer.Toimiku_dokumendidRequest.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokumendidVastus"), eu.x_road.arireg.producer.Toimiku_dokumendidVastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("toimikuDokumendid_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimikuDokumendid_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("toimikuDokumendid_v1") == null) {
            _myOperations.put("toimikuDokumendid_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("toimikuDokumendid_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokument_v2_Request"), eu.x_road.arireg.producer.Toimiku_dokument_v2_Request.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokument_v2_Request"), eu.x_road.arireg.producer.Toimiku_dokument_v2_Request.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimiku_dokument_v2_Vastus"), eu.x_road.arireg.producer.Toimiku_dokument_v2_Vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("toimikuDokument_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "toimikuDokument_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("toimikuDokument_v1") == null) {
            _myOperations.put("toimikuDokument_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("toimikuDokument_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaQuery"), eu.x_road.arireg.producer.MokaQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaQuery"), eu.x_road.arireg.producer.MokaQuery.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "MokaResponse"), eu.x_road.arireg.producer.MokaResponse.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("transactionStatement", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "transactionStatement"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("transactionStatement") == null) {
            _myOperations.put("transactionStatement", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("transactionStatement")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneParing_v1"), eu.x_road.arireg.producer.EVapiLooKanneParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneParing_v1"), eu.x_road.arireg.producer.EVapiLooKanneParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiLooKanneVastus_v1"), eu.x_road.arireg.producer.EVapiLooKanneVastus_v1.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evapiLooKanne_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiLooKanne_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evapiLooKanne_v1") == null) {
            _myOperations.put("evapiLooKanne_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evapiLooKanne_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKinnitaKanneParing_v1"), eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKinnitaKanneParing_v1"), eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKinnitaKanneVastus_v1"), eu.x_road.arireg.producer.EVapiKinnitaKanneVastus_v1.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evapiKinnitaKanne_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiKinnitaKanne_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evapiKinnitaKanne_v1") == null) {
            _myOperations.put("evapiKinnitaKanne_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evapiKinnitaKanne_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKustutaKanneParing_v1"), eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKustutaKanneParing_v1"), eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiKustutaKanneVastus_v1"), eu.x_road.arireg.producer.EVapiKustutaKanneVastus_v1.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evapiKustutaKanne_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiKustutaKanne_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evapiKustutaKanne_v1") == null) {
            _myOperations.put("evapiKustutaKanne_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evapiKustutaKanne_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMaaruseDokumentParing_v1"), eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMaaruseDokumentParing_v1"), eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMaaruseDokumentVastus_v1"), eu.x_road.arireg.producer.EVapiMaaruseDokumentVastus_v1.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evapiMaaruseDokument_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiMaaruseDokument_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evapiMaaruseDokument_v1") == null) {
            _myOperations.put("evapiMaaruseDokument_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evapiMaaruseDokument_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfoParing_v1"), eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfoParing_v1"), eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiMenetlusinfoVastus_v1"), eu.x_road.arireg.producer.EVapiMenetlusinfo_v1_Menetlused[].class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evapiMenetlusinfo_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiMenetlusinfo_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evapiMenetlusinfo_v1") == null) {
            _myOperations.put("evapiMenetlusinfo_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evapiMenetlusinfo_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiRiigiloivuViitenumberParing_v1"), eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiRiigiloivuViitenumberParing_v1"), eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "EVapiRiigiloivuViitenumberVastus_v1"), eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberVastus_v1.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("evapiRiigiloivuViitenumber_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "evapiRiigiloivuViitenumber_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("evapiRiigiloivuViitenumber_v1") == null) {
            _myOperations.put("evapiRiigiloivuViitenumber_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("evapiRiigiloivuViitenumber_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_naitajad_paring"), eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_naitajad_paring"), eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrl_aruande_naitajad_vastus"), eu.x_road.arireg.producer.Xbrl_aruande_naitajad_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("xbrlAruandeNaitajad_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlAruandeNaitajad_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("xbrlAruandeNaitajad_v1") == null) {
            _myOperations.put("xbrlAruandeNaitajad_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("xbrlAruandeNaitajad_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_paring"), eu.x_road.arireg.producer.Xbrlesita_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_paring"), eu.x_road.arireg.producer.Xbrlesita_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesita_vastus"), eu.x_road.arireg.producer.Xbrlesita_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("xbrlEsita_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlEsita_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("xbrlEsita_v1") == null) {
            _myOperations.put("xbrlEsita_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("xbrlEsita_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_paring"), eu.x_road.arireg.producer.Xbrlpdfesita_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_paring"), eu.x_road.arireg.producer.Xbrlpdfesita_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlpdfesita_vastus"), eu.x_road.arireg.producer.Xbrlpdfesita_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("xbrlPdfEsita_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlPdfEsita_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("xbrlPdfEsita_v1") == null) {
            _myOperations.put("xbrlPdfEsita_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("xbrlPdfEsita_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_paring"), eu.x_road.arireg.producer.Xbrlesindusv2_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_paring"), eu.x_road.arireg.producer.Xbrlesindusv2_paring.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlesindusv2_vastus"), eu.x_road.arireg.producer.Xbrlesindusv2_vastus.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("xbrlEsindus_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "xbrlEsindus_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("xbrlEsindus_v1") == null) {
            _myOperations.put("xbrlEsindus_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("xbrlEsindus_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_IN"), eu.x_road.arireg.producer.EarveLisaKlient_v1_IN.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_IN"), eu.x_road.arireg.producer.EarveLisaKlient_v1_IN.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1_OUT"), eu.x_road.arireg.producer.EarveLisaKlient_v1_OUT.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("earveLisaKlient_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveLisaKlient_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("earveLisaKlient_v1") == null) {
            _myOperations.put("earveLisaKlient_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("earveLisaKlient_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_IN"), eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_IN"), eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1_OUT"), eu.x_road.arireg.producer.EarveEemaldaKlient_v1_OUT.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("earveEemaldaKlient_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveEemaldaKlient_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("earveEemaldaKlient_v1") == null) {
            _myOperations.put("earveEemaldaKlient_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("earveEemaldaKlient_v1")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_IN"), eu.x_road.arireg.producer.EarveRegistriParing_v1_IN.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "paring"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_IN"), eu.x_road.arireg.producer.EarveRegistriParing_v1_IN.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "keha"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1_OUT"), eu.x_road.arireg.producer.EarveRegistriParing_v1_OUT.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("earveRegistriParing_v1", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://arireg.x-road.eu/producer/", "earveRegistriParing_v1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("earveRegistriParing_v1") == null) {
            _myOperations.put("earveRegistriParing_v1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("earveRegistriParing_v1")).add(_oper);
    }

    public AriregXteeSkeleton() {
        this.impl = new eu.x_road.arireg.producer.AriregXteeImpl();
    }

    public AriregXteeSkeleton(eu.x_road.arireg.producer.AriregXtee impl) {
        this.impl = impl;
    }
    public void debugAdapter_v1(eu.x_road.arireg.producer.DebugAdapter_v1_IN keha, eu.x_road.arireg.producer.holders.DebugAdapter_v1_INHolder paring, eu.x_road.arireg.producer.holders.DebugAdapter_v1_OUTHolder keha2) throws java.rmi.RemoteException
    {
        impl.debugAdapter_v1(keha, paring, keha2);
    }

    public void detailandmed_v1(eu.x_road.arireg.producer.Detailandmed_v5_Query keha, eu.x_road.arireg.producer.holders.Detailandmed_v5_QueryHolder paring, eu.x_road.arireg.producer.holders.Detailandmed_v5_VastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.detailandmed_v1(keha, paring, keha2);
    }

    public void ettevotjaDokumentideLoetelu_v1(eu.x_road.arireg.producer.Ettevotja_dokumentide_loetelu_paring_v2 keha, eu.x_road.arireg.producer.holders.Ettevotja_dokumentide_loetelu_paring_v2Holder paring, eu.x_road.arireg.producer.holders.Ettevotja_dokumentide_loetelu_vastus_v2Holder keha2) throws java.rmi.RemoteException
    {
        impl.ettevotjaDokumentideLoetelu_v1(keha, paring, keha2);
    }

    public void ettevotjaEsmakanded_v1(eu.x_road.arireg.producer.Ettevotja_esmakanded_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_esmakanded_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_esmakanded_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.ettevotjaEsmakanded_v1(keha, paring, keha2);
    }

    public void ettevotjaMuudatusedTasuline_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuline_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuline_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuline_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.ettevotjaMuudatusedTasuline_v1(keha, paring, keha2);
    }

    public void ettevotjaRekvisiididFail_v1(eu.x_road.arireg.producer.Ettevotja_rekvisiidid_fail_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_fail_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_fail_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.ettevotjaRekvisiididFail_v1(keha, paring, keha2);
    }

    public void ettevotjaRekvisiidid_v1(eu.x_road.arireg.producer.Ettevotja_rekvisiidid_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_rekvisiidid_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.ettevotjaRekvisiidid_v1(keha, paring, keha2);
    }

    public void ettevottegaSeotudIsikud_v1(eu.x_road.arireg.producer.Ettevottega_seotud_isikud_paring keha, eu.x_road.arireg.producer.holders.Ettevottega_seotud_isikud_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevottega_seotud_isikud_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.ettevottegaSeotudIsikud_v1(keha, paring, keha2);
    }

    public void esindus_v1(eu.x_road.arireg.producer.Paringesindus_v4_paring keha, eu.x_road.arireg.producer.holders.Paringesindus_v4_paringHolder paring, eu.x_road.arireg.producer.holders.Paringesindus_v4_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.esindus_v1(keha, paring, keha2);
    }

    public void klassifikaatorid_v1(eu.x_road.arireg.producer.Klassifikaatorid_paring keha, eu.x_road.arireg.producer.holders.Klassifikaatorid_paringHolder paring, eu.x_road.arireg.producer.holders.Klassifikaatorid_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.klassifikaatorid_v1(keha, paring, keha2);
    }

    public void lihtandmedTasuta_v1(eu.x_road.arireg.producer.Paringliht_tasuta_paring keha, eu.x_road.arireg.producer.holders.Paringliht_tasuta_paringHolder paring, eu.x_road.arireg.producer.holders.Paringliht_tasuta_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.lihtandmedTasuta_v1(keha, paring, keha2);
    }

    public void lihtandmed_v1(eu.x_road.arireg.producer.Paringliht_v5_paring keha, eu.x_road.arireg.producer.holders.Paringliht_v5_paringHolder paring, eu.x_road.arireg.producer.holders.Paringliht_v5_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.lihtandmed_v1(keha, paring, keha2);
    }

    public void majandusaastaAruanneteLoetelu_v1(eu.x_road.arireg.producer.Majandusaasta_aruannete_loetelu_paring keha, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_loetelu_paringHolder paring, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_loetelu_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.majandusaastaAruanneteLoetelu_v1(keha, paring, keha2);
    }

    public void majandusaastaAruanneteKirjed_v1(eu.x_road.arireg.producer.Majandusaasta_aruannete_kirjed_paring keha, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_kirjed_paringHolder paring, eu.x_road.arireg.producer.holders.Majandusaasta_aruannete_kirjed_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.majandusaastaAruanneteKirjed_v1(keha, paring, keha2);
    }

    public void seotudIsikuOtsing_v1(eu.x_road.arireg.producer.Seotud_isiku_otsing_paring keha, eu.x_road.arireg.producer.holders.Seotud_isiku_otsing_paringHolder paring, eu.x_road.arireg.producer.holders.Seotud_isiku_otsing_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.seotudIsikuOtsing_v1(keha, paring, keha2);
    }

    public void aruandeAuditeerimiseAndmed_v1(eu.x_road.arireg.producer.Aruande_auditeerimiseandmed_paring keha, eu.x_road.arireg.producer.holders.Aruande_auditeerimiseandmed_paringHolder paring, eu.x_road.arireg.producer.holders.Aruande_auditeerimiseandmed_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.aruandeAuditeerimiseAndmed_v1(keha, paring, keha2);
    }

    public void aruandeMyygituluEMTAKjargi_v1(eu.x_road.arireg.producer.Aruande_myygitulu_paring keha, eu.x_road.arireg.producer.holders.Aruande_myygitulu_paringHolder paring, eu.x_road.arireg.producer.holders.Aruande_myygitulu_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.aruandeMyygituluEMTAKjargi_v1(keha, paring, keha2);
    }

    public void arikeelud_v1(eu.x_road.arireg.producer.Paringarikeelud_paring keha, eu.x_road.arireg.producer.holders.Paringarikeelud_paringHolder paring, eu.x_road.arireg.producer.holders.Paringarikeelud_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.arikeelud_v1(keha, paring, keha2);
    }

    public void ariregistriToimik_v1(eu.x_road.arireg.producer.Ariregistri_toimik_Request keha, eu.x_road.arireg.producer.holders.Ariregistri_toimik_RequestHolder paring, eu.x_road.arireg.producer.holders.Ariregistri_toimik_ResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.ariregistriToimik_v1(keha, paring, keha2);
    }

    public void detailandmedEP_v1(eu.x_road.arireg.producer.Detailandmed_ep_v1_Query keha, eu.x_road.arireg.producer.holders.Detailandmed_ep_v1_QueryHolder paring, eu.x_road.arireg.producer.holders.Detailandmed_ep_v1_VastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.detailandmedEP_v1(keha, paring, keha2);
    }

    public void erakondaKuuluvus_v1(eu.x_road.arireg.producer.Erakondakuuluvus_paring keha, eu.x_road.arireg.producer.holders.Erakondakuuluvus_paringHolder paring, eu.x_road.arireg.producer.holders.Erakondakuuluvus_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.erakondaKuuluvus_v1(keha, paring, keha2);
    }

    public void erakonnaNimekiri_v1(eu.x_road.arireg.producer.Erakonnanimekiri_paring keha, eu.x_road.arireg.producer.holders.Erakonnanimekiri_paringHolder paring, eu.x_road.arireg.producer.holders.Erakonnanimekiri_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.erakonnaNimekiri_v1(keha, paring, keha2);
    }

    public void esindusIseendaKohta_v1(eu.x_road.arireg.producer.Paringesindus_iseendakohta_paring keha, eu.x_road.arireg.producer.holders.Paringesindus_iseendakohta_paringHolder paring, eu.x_road.arireg.producer.holders.Paringesindus_iseendakohta_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.esindusIseendaKohta_v1(keha, paring, keha2);
    }

    public void evportaalDigiteeriDokumendid_v1(eu.x_road.arireg.producer.DigiteeriDokumendidParing_v1 keha, eu.x_road.arireg.producer.holders.DigiteeriDokumendidParing_v1Holder paring, eu.x_road.arireg.producer.holders.DigiteeriDokumendidVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evportaalDigiteeriDokumendid_v1(keha, paring, keha2);
    }

    public void evportaalDigiteeriToimik_v1(eu.x_road.arireg.producer.DigiteeriToimikParing_v1 keha, eu.x_road.arireg.producer.holders.DigiteeriToimikParing_v1Holder paring, eu.x_road.arireg.producer.holders.DigiteeriToimikVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evportaalDigiteeriToimik_v1(keha, paring, keha2);
    }

    public void evportaalMargiKattetoimetatuks_v1(eu.x_road.arireg.producer.MargiKattetoimetatuksParing_v1 keha, eu.x_road.arireg.producer.holders.MargiKattetoimetatuksParing_v1Holder paring, eu.x_road.arireg.producer.holders.MargiKattetoimetatuksVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evportaalMargiKattetoimetatuks_v1(keha, paring, keha2);
    }

    public void ettevotjaMuudatusedTasutaTootukassa_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_tootukassa_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_tootukassa_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_tootukassa_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.ettevotjaMuudatusedTasutaTootukassa_v1(keha, paring, keha2);
    }

    public void ettevotjaMuudatusedTasuta_v1(eu.x_road.arireg.producer.Ettevotja_muudatused_tasuta_paring keha, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_paringHolder paring, eu.x_road.arireg.producer.holders.Ettevotja_muudatused_tasuta_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.ettevotjaMuudatusedTasuta_v1(keha, paring, keha2);
    }

    public void EVKKanded_v1(eu.x_road.arireg.producer.EVK_kanded_v1_paring keha, eu.x_road.arireg.producer.holders.EVK_kanded_v1_paringHolder paring, eu.x_road.arireg.producer.holders.EVK_kanded_v1_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.EVKKanded_v1(keha, paring, keha2);
    }

    public void kustutamine_v1(eu.x_road.arireg.producer.Kustutamine_paring keha, eu.x_road.arireg.producer.holders.Kustutamine_paringHolder paring, eu.x_road.arireg.producer.holders.Kustutamine_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.kustutamine_v1(keha, paring, keha2);
    }

    public void kyMenetlusinfo_v1(eu.x_road.arireg.producer.Ky_menetlusinfo_v2_Query keha, eu.x_road.arireg.producer.holders.Ky_menetlusinfo_v2_QueryHolder paring, eu.x_road.arireg.producer.holders.Ky_menetlusinfo_v2_VastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.kyMenetlusinfo_v1(keha, paring, keha2);
    }

    public void kyRegistriosaMuutused_v1(eu.x_road.arireg.producer.Ky_registriosamuut_v1_Query keha, eu.x_road.arireg.producer.holders.Ky_registriosamuut_v1_QueryHolder paring, eu.x_road.arireg.producer.holders.Ky_registriosamuut_v1_VastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.kyRegistriosaMuutused_v1(keha, paring, keha2);
    }

    public void maaruseDokument_v1(eu.x_road.arireg.producer.Maaruse_dokument_Request keha, eu.x_road.arireg.producer.holders.Maaruse_dokument_RequestHolder paring, eu.x_road.arireg.producer.holders.Maaruse_dokument_VastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.maaruseDokument_v1(keha, paring, keha2);
    }

    public void menetlusinfo_v1(eu.x_road.arireg.producer.Menetlusinfo_v3_paring keha, eu.x_road.arireg.producer.holders.Menetlusinfo_v3_paringHolder paring, eu.x_road.arireg.producer.holders.Menetlusinfo_v3_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.menetlusinfo_v1(keha, paring, keha2);
    }

    public void mtaBilanss_v1(eu.x_road.arireg.producer.Mtabilanssv3_paring keha, eu.x_road.arireg.producer.holders.Mtabilanssv3_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilanssv3_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaBilanss_v1(keha, paring, keha2);
    }

    public void mtaBilanssFail_v1(eu.x_road.arireg.producer.Mtabilanssv3_paring keha, eu.x_road.arireg.producer.holders.Mtabilanssv3_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilanssfv3_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaBilanssFail_v1(keha, paring, keha2);
    }

    public void mtaBilSisu_v1(eu.x_road.arireg.producer.Mtabilsisuv2_paring keha, eu.x_road.arireg.producer.holders.Mtabilsisuv2_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilsisuv2_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaBilSisu_v1(keha, paring, keha2);
    }

    public void mtaBilSisuFail_v1(eu.x_road.arireg.producer.Mtabilsisuv2_paring keha, eu.x_road.arireg.producer.holders.Mtabilsisuv2_paringHolder paring, eu.x_road.arireg.producer.holders.Mtabilsisufv2_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaBilSisuFail_v1(keha, paring, keha2);
    }

    public void mtaEvSeisundid_v1(eu.x_road.arireg.producer.Mtaev_seisundid_paring keha, eu.x_road.arireg.producer.holders.Mtaev_seisundid_paringHolder paring, eu.x_road.arireg.producer.holders.Mtaev_seisundid_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaEvSeisundid_v1(keha, paring, keha2);
    }

    public void mtaHoiatused_v1(eu.x_road.arireg.producer.Mtahoiatused_paring keha, eu.x_road.arireg.producer.holders.Mtahoiatused_paringHolder paring, eu.x_road.arireg.producer.holders.Mtahoiatused_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaHoiatused_v1(keha, paring, keha2);
    }

    public void mtaMajPaevik_v1(eu.x_road.arireg.producer.Mtamajpaevik_paring keha, eu.x_road.arireg.producer.holders.Mtamajpaevik_paringHolder paring, eu.x_road.arireg.producer.holders.Mtamajpaevik_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaMajPaevik_v1(keha, paring, keha2);
    }

    public void mtaMajAruOsad_v1(eu.x_road.arireg.producer.Mtamaruosad_paring keha, eu.x_road.arireg.producer.holders.Mtamaruosad_paringHolder paring, eu.x_road.arireg.producer.holders.Mtamaruosad_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaMajAruOsad_v1(keha, paring, keha2);
    }

    public void mtaOtsused_v1(eu.x_road.arireg.producer.Mtaotsused_paring keha, eu.x_road.arireg.producer.holders.Mtaotsused_paringHolder paring, eu.x_road.arireg.producer.holders.Mtaotsused_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaOtsused_v1(keha, paring, keha2);
    }

    public void mtaPaevik_v1(eu.x_road.arireg.producer.Mtapaevik_paring keha, eu.x_road.arireg.producer.holders.Mtapaevik_paringHolder paring, eu.x_road.arireg.producer.holders.Mtapaevik_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaPaevik_v1(keha, paring, keha2);
    }

    public void mtaTrahvid_v1(eu.x_road.arireg.producer.Mtatrahvid_paring keha, eu.x_road.arireg.producer.holders.Mtatrahvid_paringHolder paring, eu.x_road.arireg.producer.holders.Mtatrahvid_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.mtaTrahvid_v1(keha, paring, keha2);
    }

    public void napTasumiseLisamine_v1(eu.x_road.arireg.producer.NapTasumiseLisamineQuery keha, eu.x_road.arireg.producer.holders.NapTasumiseLisamineQueryHolder paring, eu.x_road.arireg.producer.holders.NapTasumiseLisamineResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.napTasumiseLisamine_v1(keha, paring, keha2);
    }

    public void nimeSobivus_v1(eu.x_road.arireg.producer.Paringnimesobivus_paring keha, eu.x_road.arireg.producer.holders.Paringnimesobivus_paringHolder paring, eu.x_road.arireg.producer.holders.Paringnimesobivus_v2_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.nimeSobivus_v1(keha, paring, keha2);
    }

    public void rkoarr_asutused_v1(eu.x_road.arireg.producer.RKOARRAsutusedParing_v1 keha, eu.x_road.arireg.producer.holders.RKOARRAsutusedParing_v1Holder paring, eu.x_road.arireg.producer.holders.RKOARRAsutusedVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.rkoarr_asutused_v1(keha, paring, keha2);
    }

    public void registrikaart_v1(eu.x_road.arireg.producer.Registrikaart_paring keha, eu.x_road.arireg.producer.holders.Registrikaart_paringHolder paring, eu.x_road.arireg.producer.holders.Registrikaart_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.registrikaart_v1(keha, paring, keha2);
    }

    public void sooritaKanne_v1(eu.x_road.arireg.producer.SooritaKanne_v4 keha, eu.x_road.arireg.producer.holders.SooritaKanne_v4Holder paring, eu.x_road.arireg.producer.holders.SooritaKanneVastus_v4Holder keha2) throws java.rmi.RemoteException
    {
        impl.sooritaKanne_v1(keha, paring, keha2);
    }

    public void toimikuDokumendid_v1(eu.x_road.arireg.producer.Toimiku_dokumendidRequest keha, eu.x_road.arireg.producer.holders.Toimiku_dokumendidRequestHolder paring, eu.x_road.arireg.producer.holders.Toimiku_dokumendidVastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.toimikuDokumendid_v1(keha, paring, keha2);
    }

    public void toimikuDokument_v1(eu.x_road.arireg.producer.Toimiku_dokument_v2_Request keha, eu.x_road.arireg.producer.holders.Toimiku_dokument_v2_RequestHolder paring, eu.x_road.arireg.producer.holders.Toimiku_dokument_v2_VastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.toimikuDokument_v1(keha, paring, keha2);
    }

    public void transactionStatement(eu.x_road.arireg.producer.MokaQuery keha, eu.x_road.arireg.producer.holders.MokaQueryHolder paring, eu.x_road.arireg.producer.holders.MokaResponseHolder keha2) throws java.rmi.RemoteException
    {
        impl.transactionStatement(keha, paring, keha2);
    }

    public void evapiLooKanne_v1(eu.x_road.arireg.producer.EVapiLooKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiLooKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiLooKanneVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evapiLooKanne_v1(keha, paring, keha2);
    }

    public void evapiKinnitaKanne_v1(eu.x_road.arireg.producer.EVapiKinnitaKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiKinnitaKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiKinnitaKanneVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evapiKinnitaKanne_v1(keha, paring, keha2);
    }

    public void evapiKustutaKanne_v1(eu.x_road.arireg.producer.EVapiKustutaKanneParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiKustutaKanneParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiKustutaKanneVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evapiKustutaKanne_v1(keha, paring, keha2);
    }

    public void evapiMaaruseDokument_v1(eu.x_road.arireg.producer.EVapiMaaruseDokumentParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiMaaruseDokumentParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiMaaruseDokumentVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evapiMaaruseDokument_v1(keha, paring, keha2);
    }

    public void evapiMenetlusinfo_v1(eu.x_road.arireg.producer.EVapiMenetlusinfoParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiMenetlusinfoParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiMenetlusinfoVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evapiMenetlusinfo_v1(keha, paring, keha2);
    }

    public void evapiRiigiloivuViitenumber_v1(eu.x_road.arireg.producer.EVapiRiigiloivuViitenumberParing_v1 keha, eu.x_road.arireg.producer.holders.EVapiRiigiloivuViitenumberParing_v1Holder paring, eu.x_road.arireg.producer.holders.EVapiRiigiloivuViitenumberVastus_v1Holder keha2) throws java.rmi.RemoteException
    {
        impl.evapiRiigiloivuViitenumber_v1(keha, paring, keha2);
    }

    public void xbrlAruandeNaitajad_v1(eu.x_road.arireg.producer.Xbrl_aruande_naitajad_paring keha, eu.x_road.arireg.producer.holders.Xbrl_aruande_naitajad_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrl_aruande_naitajad_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.xbrlAruandeNaitajad_v1(keha, paring, keha2);
    }

    public void xbrlEsita_v1(eu.x_road.arireg.producer.Xbrlesita_paring keha, eu.x_road.arireg.producer.holders.Xbrlesita_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlesita_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.xbrlEsita_v1(keha, paring, keha2);
    }

    public void xbrlPdfEsita_v1(eu.x_road.arireg.producer.Xbrlpdfesita_paring keha, eu.x_road.arireg.producer.holders.Xbrlpdfesita_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlpdfesita_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.xbrlPdfEsita_v1(keha, paring, keha2);
    }

    public void xbrlEsindus_v1(eu.x_road.arireg.producer.Xbrlesindusv2_paring keha, eu.x_road.arireg.producer.holders.Xbrlesindusv2_paringHolder paring, eu.x_road.arireg.producer.holders.Xbrlesindusv2_vastusHolder keha2) throws java.rmi.RemoteException
    {
        impl.xbrlEsindus_v1(keha, paring, keha2);
    }

    public void earveLisaKlient_v1(eu.x_road.arireg.producer.EarveLisaKlient_v1_IN keha, eu.x_road.arireg.producer.holders.EarveLisaKlient_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveLisaKlient_v1_OUTHolder keha2) throws java.rmi.RemoteException
    {
        impl.earveLisaKlient_v1(keha, paring, keha2);
    }

    public void earveEemaldaKlient_v1(eu.x_road.arireg.producer.EarveEemaldaKlient_v1_IN keha, eu.x_road.arireg.producer.holders.EarveEemaldaKlient_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveEemaldaKlient_v1_OUTHolder keha2) throws java.rmi.RemoteException
    {
        impl.earveEemaldaKlient_v1(keha, paring, keha2);
    }

    public void earveRegistriParing_v1(eu.x_road.arireg.producer.EarveRegistriParing_v1_IN keha, eu.x_road.arireg.producer.holders.EarveRegistriParing_v1_INHolder paring, eu.x_road.arireg.producer.holders.EarveRegistriParing_v1_OUTHolder keha2) throws java.rmi.RemoteException
    {
        impl.earveRegistriParing_v1(keha, paring, keha2);
    }

}
