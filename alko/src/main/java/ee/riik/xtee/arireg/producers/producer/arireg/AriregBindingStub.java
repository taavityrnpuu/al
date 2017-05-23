/**
 * AriregBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 24, 2007 (04:57:42 EEST) WSDL2Java emitter.
 */

package ee.riik.xtee.arireg.producers.producer.arireg;

import org.apache.axis.utils.XMLUtils;

import ee.agri.alkor.xtee.Util;
import org.apache.log4j.Logger;

public class AriregBindingStub extends org.apache.axis.client.Stub implements
		ee.riik.xtee.arireg.producers.producer.arireg.AriregPort {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	private static Logger LOGGER = Logger.getLogger(AriregBindingStub.class);

	static {
		_operations = new org.apache.axis.description.OperationDesc[1];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("paringliht_v4");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "keha"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
						"http://producers.arireg.xtee.riik.ee/producer/arireg",
						"paringliht_v4_paring"),
				ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring.class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName(
						"http://x-tee.riik.ee/xsd/xtee.xsd", "asutus"),
				org.apache.axis.description.ParameterDesc.INOUT,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, true, true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName(
						"http://x-tee.riik.ee/xsd/xtee.xsd", "andmekogu"),
				org.apache.axis.description.ParameterDesc.INOUT,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, true, true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName(
						"http://x-tee.riik.ee/xsd/xtee.xsd", "isikukood"),
				org.apache.axis.description.ParameterDesc.INOUT,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, true, true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName(
						"http://x-tee.riik.ee/xsd/xtee.xsd", "id"),
				org.apache.axis.description.ParameterDesc.INOUT,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, true, true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName(
						"http://x-tee.riik.ee/xsd/xtee.xsd", "nimi"),
				org.apache.axis.description.ParameterDesc.INOUT,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, true, true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName(
						"http://x-tee.riik.ee/xsd/xtee.xsd", "toimik"),
				org.apache.axis.description.ParameterDesc.INOUT,
				new javax.xml.namespace.QName(
						"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, true, true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "paring"),
				org.apache.axis.description.ParameterDesc.OUT,
				new javax.xml.namespace.QName(
						"http://producers.arireg.xtee.riik.ee/producer/arireg",
						"paringliht_v4_paring"),
				ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring.class,
				false, false);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "keha"),
				org.apache.axis.description.ParameterDesc.OUT,
				new javax.xml.namespace.QName(
						"http://producers.arireg.xtee.riik.ee/producer/arireg",
						"paringliht_v4_vastus"),
				ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_vastus.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[0] = oper;

	}

	public AriregBindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public AriregBindingStub(java.net.URL endpointURL,
			javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public AriregBindingStub(javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service)
				.setTypeMappingVersion("1.2");
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
		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_kehtetudnimed");
		cachedSerQNames.add(qName);
		cls = ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_kehtetunimi[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_kehtetunimi");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_kehtetunimi");
		cachedSerQNames.add(qName);
		cls = ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_kehtetunimi.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_v4_ettevote");
		cachedSerQNames.add(qName);
		cls = ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_ettevote.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_v4_ettevotted");
		cachedSerQNames.add(qName);
		cls = ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_ettevote[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_v4_ettevote");
		qName2 = null;
		cachedSerFactories
				.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
						qName, qName2));
		cachedDeserFactories
				.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_v4_evaadress");
		cachedSerQNames.add(qName);
		cls = ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_evaadress.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_v4_evkapital");
		cachedSerQNames.add(qName);
		cls = ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_evkapital.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_v4_paring");
		cachedSerQNames.add(qName);
		cls = ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_v4_vastus");
		cachedSerQNames.add(qName);
		cls = ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_vastus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall()
			throws java.rmi.RemoteException {
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
						java.lang.Class cls = (java.lang.Class) cachedSerClasses
								.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames
								.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories
									.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault(
					"Failure trying to get the Call object", _t);
		}
	}

	private static void LogMessage(String msgName, org.apache.axis.Message msg) {
		try {
			if (msg == null) {
				return;
			} else {
				String s = XMLUtils.DocumentToString(msg.getSOAPEnvelope()
						.getAsDocument());
				String hs = java.text.MessageFormat.format(
						"{0} Message: Length={1}", new Object[] { msgName,
								new Integer(s.length()) });
				System.out.println("LogMessage : " + hs);
				System.out.println(hs);
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("ClientCredentialHandler: failed to log SOAP message.");
		}
	}

	public void paringliht_v4(
			ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring keha,
			javax.xml.rpc.holders.StringHolder asutus,
			javax.xml.rpc.holders.StringHolder andmekogu,
			javax.xml.rpc.holders.StringHolder isikukood,
			javax.xml.rpc.holders.StringHolder id,
			javax.xml.rpc.holders.StringHolder nimi,
			javax.xml.rpc.holders.StringHolder toimik,
			ee.riik.xtee.arireg.producers.producer.arireg.holders.Paringliht_v4_paringHolder paring,
			ee.riik.xtee.arireg.producers.producer.arireg.holders.Paringliht_v4_vastusHolder keha2)
			throws java.rmi.RemoteException {
		//LOGGER.info("LogMessage: " + keha.serialize());		
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
				"http://producers.arireg.xtee.riik.ee/producer/arireg",
				"paringliht_v4"));
		setRequestHeaders(_call);
		setAttachments(_call);
		try {			
			LOGGER.info("LogMessage: " + asutus.value);
			LOGGER.info("LogMessage: " + andmekogu.value);
			LOGGER.info("LogMessage: " + isikukood.value);
			LOGGER.info("LogMessage: " + id.value);
			LOGGER.info("LogMessage: " + nimi.value);
			LOGGER.info("LogMessage: " + toimik.value);
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
					keha, asutus.value, andmekogu.value, isikukood.value,
					id.value, nimi.value, toimik.value });
			LOGGER.info("LogMessage: samm11");
			if (_resp instanceof java.rmi.RemoteException) {
				LOGGER.info("LogMessage: samm12 true");
				throw (java.rmi.RemoteException) _resp;
			} else {
				LOGGER.info("LogMessage: samm12 false");
				Util.LogMessage(
						"paringliht_v4:Request",
						(_call != null && _call.getMessageContext() != null) ? _call
								.getMessageContext().getRequestMessage() : null);
				Util.LogMessage(
						"paringliht_v4:Response",
						(_call != null && _call.getMessageContext() != null) ? _call
								.getMessageContext().getResponseMessage()
								: null);
				extractAttachments(_call);
				java.util.Map _output;
				_output = _call.getOutputParams();
				try {
					asutus.value = (java.lang.String) _output
							.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd",
									"asutus"));
				} catch (java.lang.Exception _exception) {
					asutus.value = (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_output.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd",
									"asutus")), java.lang.String.class);
				}
				try {
					andmekogu.value = (java.lang.String) _output
							.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd",
									"andmekogu"));
				} catch (java.lang.Exception _exception) {
					andmekogu.value = (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_output.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd",
									"andmekogu")), java.lang.String.class);
				}
				try {
					isikukood.value = (java.lang.String) _output
							.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd",
									"isikukood"));
				} catch (java.lang.Exception _exception) {
					isikukood.value = (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_output.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd",
									"isikukood")), java.lang.String.class);
				}
				try {
					id.value = (java.lang.String) _output
							.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd", "id"));
				} catch (java.lang.Exception _exception) {
					id.value = (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(
									_output.get(new javax.xml.namespace.QName(
											"http://x-tee.riik.ee/xsd/xtee.xsd",
											"id")), java.lang.String.class);
				}
				try {
					nimi.value = (java.lang.String) _output
							.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd", "nimi"));
				} catch (java.lang.Exception _exception) {
					nimi.value = (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(
									_output.get(new javax.xml.namespace.QName(
											"http://x-tee.riik.ee/xsd/xtee.xsd",
											"nimi")), java.lang.String.class);
				}
				try {
					toimik.value = (java.lang.String) _output
							.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd",
									"toimik"));
				} catch (java.lang.Exception _exception) {
					toimik.value = (java.lang.String) org.apache.axis.utils.JavaUtils
							.convert(_output.get(new javax.xml.namespace.QName(
									"http://x-tee.riik.ee/xsd/xtee.xsd",
									"toimik")), java.lang.String.class);
				}
				try {
					paring.value = (ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring) _output
							.get(new javax.xml.namespace.QName("", "paring"));
				} catch (java.lang.Exception _exception) {
					paring.value = (ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring) org.apache.axis.utils.JavaUtils
							.convert(
									_output.get(new javax.xml.namespace.QName(
											"", "paring")),
									ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_paring.class);
				}
				try {
					keha2.value = (ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_vastus) _output
							.get(new javax.xml.namespace.QName("", "keha"));
				} catch (java.lang.Exception _exception) {
					keha2.value = (ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_vastus) org.apache.axis.utils.JavaUtils
							.convert(
									_output.get(new javax.xml.namespace.QName(
											"", "keha")),
									ee.riik.xtee.arireg.producers.producer.arireg.Paringliht_v4_vastus.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			LOGGER.info("LogMessage: samm13");
			throw axisFaultException;
		}
	}

}
