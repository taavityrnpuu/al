/**
 * TreasuryCustomerBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.x_road.rm_v6.treasury.customer;

public class TreasuryCustomerBindingSkeleton implements eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType, org.apache.axis.wsdl.Skeleton {
    private eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "rkSendTransactionStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", ">rkSendTransactionStatement"), eu.x_road.rm_v6.treasury.customer.RkSendTransactionStatement.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rkSendTransactionStatement", _params, new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", "rkSendTransactionStatementResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://rm-v6.x-road.eu/treasury/customer", ">rkSendTransactionStatementResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "rkSendTransactionStatement"));
        _myOperationsList.add(_oper);
        if (_myOperations.get("rkSendTransactionStatement") == null) {
            _myOperations.put("rkSendTransactionStatement", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rkSendTransactionStatement")).add(_oper);
    }

    public TreasuryCustomerBindingSkeleton() {
        this.impl = new eu.x_road.rm_v6.treasury.customer.TreasuryCustomerBindingImpl();
    }

    public TreasuryCustomerBindingSkeleton(eu.x_road.rm_v6.treasury.customer.TreasuryClientPortType impl) {
        this.impl = impl;
    }
    public eu.x_road.rm_v6.treasury.customer.RkSendTransactionStatementResponse rkSendTransactionStatement(eu.x_road.rm_v6.treasury.customer.RkSendTransactionStatement keha) throws java.rmi.RemoteException
    {
        eu.x_road.rm_v6.treasury.customer.RkSendTransactionStatementResponse ret = impl.rkSendTransactionStatement(keha);
        return ret;
    }

}
