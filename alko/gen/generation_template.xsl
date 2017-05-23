<?xml version="1.0" encoding="UTF-8"?>
<!--
	XSLT väljatöötajatel oli kummaline arusaamine maailma asjadest!
	variable - on mittemuudetav (konstant)
	param - saab üle väärustada - aga kui see teha globaalne (deklareerida enne template-sid) siis iga template sees on tal algne väärtus (ja kuna tegelelik väärtus tekib mingi tempalte sees (andmetest), siis teine template seda ei tea ja tal puudub globaalsena mõte. 
	Lahenduseks on see, et template alluvuses deklareeritakse väärtuseta parameeter ja väljakutsuvate (apply-templates ja call-template) alluvuses tuleb parameeter väärtustada (kusjuures parameetri nimi ei paista selles kohas oluline olevat)
	
	template jaoks on atribuut "mode", mis sisuliselt on nimi (apply-templates püüab rakenda kõiki sobivaid, kuid piiranguks on, et sama mode (kui modet ei ütle, siis kõik))

	sõltub generaatorist (xslt teostajast) - Saxon-iga tegeledes on kindlasti vaja juureelementi kirja panna tns, mis on lõplik (seega on generaatori xsl faili iga korda vaja ümber teha) ning (sic!) wsdl definition osas tns samuti välja kirjutada, sest seda saxon miskipärst ei teisenda kui seal on "{$ls_tns}"
-->
<xsl:transform version="2.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" 
	xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
	xmlns:tns="http://alkor2.x-road.eu/"
    xmlns:sec="http://piksel.ee/xsd/securitycontext.xsd"
	xmlns:xrd="http://x-road.eu/xsd/xroad.xsd"
	xmlns:saxon="http://saxon.sf.net/" exclude-result-prefixes="saxon">
	<xsl:strip-space elements="*"/>
	<xsl:output method="xml" indent="yes" encoding="UTF-8"/>

	<xsl:template match="/service">

		<!-- teenuse nimi, mida kasutatakse praktiliselt igal pool -->
		<xsl:param name="ls_nimi" select="name"/>
		<xsl:param name="ls_tns" select="schemanamespace"/> 
		<!-- seda ei lähe enam vaja, kuna laadime üksikute päringute kaupa tüübidefinitsioonid sisse -->
		<!--	<xsl:param name="ls_xsdloc" select="schemaimportlocation"/>
		-->

		<!-- WSDL-i juurelement kõigi vajalike nimeruumidega. atribuut "name" ei ole vajalik, aga mu meelest oleks viisakas kasutada -->
		<wsdl:definitions name="{$ls_nimi}"
			targetNamespace="{$ls_tns}"
			xmlns:tns="http://alkor2.x-road.eu/"
			xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
			xmlns:xrd="http://x-road.eu/xsd/xroad.xsd"
			xmlns:id="http://x-road.eu/xsd/identifiers"
			xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
			xmlns:soap-env="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/"
			xmlns:xmime="http://www.w3.org/2005/05/xmlmime"
			xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/"
			xmlns:rep="http://x-road.eu/xsd/representation.xsd"
			>

			<wsdl:types>
				<xsd:schema targetNamespace="{$ls_tns}" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
					<xsl:comment>x-tee alustüübid on defineeritud RIAs (xsd import)</xsl:comment>
					<xsd:import namespace="http://x-road.eu/xsd/xroad.xsd" schemaLocation="http://x-road.eu/xsd/xroad.xsd"/>
					<xsd:import namespace="http://x-road.eu/xsd/identifiers" schemaLocation="http://x-road.eu/xsd/identifiers.xsd"/>
					<xsd:import namespace="http://x-road.eu/xsd/representation.xsd" schemaLocation="http://x-road.eu/xsd/representation.xsd"/>
					<xsd:import namespace="http://schemas.xmlsoap.org/soap/envelope/" schemaLocation="http://schemas.xmlsoap.org/soap/envelope/" />
					<xsl:for-each select="operations/operation">
						<xsl:apply-templates select="." mode="xsd">
							<xsl:with-param name="as_t_nimi" select="$ls_nimi"/>
						</xsl:apply-templates>
					</xsl:for-each>
					<xsl:variable name="f_nimi" select="concat($ls_nimi, '.korduvkasutatavad.xsd')"/>
					<xsl:variable name="codefile" select="document($f_nimi,/)"/>
					<xsl:comment select="' Korduvkasutatavad tüübid '"/>
					<xsl:copy-of select="$codefile/pseudoroot/node()"/>
				</xsd:schema>
			</wsdl:types>

			<xsl:comment>Message osa. Iga operatsiooni kohta 2 (sisend ja väljund), mille nimed on standardsed (sisendi nimeks on op nimi ja tüübiks samuti)</xsl:comment>
			<xsl:for-each select="operations/operation">
				<xsl:apply-templates select="." mode="message">
					<xsl:with-param name="as_nimi" select="$ls_nimi"/>
				</xsl:apply-templates>
			</xsl:for-each>
			<xsl:comment>lisaks x-tee v6 päiseosa jaoks message, mida kasutatakse iga operatsiooni juures, ja mis omakorda pöördub alustüüpide poole</xsl:comment>
			<wsdl:message name="requestHeader">
				<wsdl:part name="client" element="xrd:client" />
				<wsdl:part name="service" element="xrd:service" />
				<wsdl:part name="userId" element="xrd:userId" />
				<wsdl:part name="id" element="xrd:id" />
				<wsdl:part name="issue" element="xrd:issue" />
				<wsdl:part name="protocolVersion" element="xrd:protocolVersion" />
				<wsdl:part name="requestHash" element="xrd:requestHash" />
				<wsdl:part name="representedParty" element="rep:representedParty" />
			</wsdl:message>
			<xsl:comment>üldine fault (SOAP ENVELOPE oma)</xsl:comment>
			<wsdl:message name="faultMessage">
				<wsdl:part name="fault" element="tns:Fault"/>
			</wsdl:message>

			<xsl:comment>PortType osa (operatsioonid sisutehniliselt)</xsl:comment>
			<wsdl:portType name="{concat($ls_nimi,'port')}">
				<xsl:for-each select="operations/operation">
					<xsl:apply-templates select="." mode="porttype">
						<xsl:with-param name="as_nimi" select="$ls_nimi"/>
					</xsl:apply-templates>
				</xsl:for-each>
			</wsdl:portType>

			<xsl:comment>Bindingud osa (operatsioonid teostustehniliselt)</xsl:comment>
			<wsdl:binding name="{concat($ls_nimi,'binding')}" type="{concat('tns:',$ls_nimi,'port')}">
				<soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
				<xsl:for-each select="operations/operation">
					<xsl:apply-templates select="." mode="bind">
						<xsl:with-param name="as_nimi" select="$ls_nimi"/>
					</xsl:apply-templates>
				</xsl:for-each>
			</wsdl:binding>

			<wsdl:service name="{$ls_nimi}">
				<wsdl:port name="{concat($ls_nimi,'port')}" binding="{concat('tns:',$ls_nimi,'binding')}">
					<soap:address location="https://192.168.0.6/cgi-bin/consumer_proxy/" />
				</wsdl:port>
			</wsdl:service>
		</wsdl:definitions>
	</xsl:template>

	<!-- korduvad osad -->
	<xsl:template match="operation" mode="xsd">
		<xsl:param name="as_t_nimi"/>
		<xsl:variable name="f_nimi" select="concat($as_t_nimi, '.', name, '.', xteever,'.xsd')"/>
		<xsl:variable name="codefile" select="document($f_nimi,/)"/>
		<xsl:comment select="concat(' ', name, ' ')"/>
		<xsl:copy-of select="$codefile/pseudoroot/node()"/>
	</xsl:template>

	<xsl:template match="operation" mode="message">
		<xsl:param name="as_nimi"/>
		<xsl:variable name="ls_nimi" select="name"/>
		<wsdl:message name="{concat($ls_nimi,'')}">
			<wsdl:part name="body" element="{concat('tns:',$ls_nimi,'')}"></wsdl:part>
		</wsdl:message>
		<wsdl:message name="{concat($ls_nimi,'Response')}">
			<wsdl:part name="body" element="{concat('tns:',$ls_nimi,'Response')}"></wsdl:part>
		</wsdl:message>
	</xsl:template>

	<xsl:template match="operation" mode="porttype">
		<xsl:param name="as_nimi"/>
		<xsl:variable name="ls_nimi" select="name"/>
		<wsdl:operation name="{$ls_nimi}">
			<!-- if test=xteetitle" -->
			<wsdl:documentation>
				<xrd:title><xsl:value-of select="xteetitle"/> (<xsl:value-of select="name"/>)</xrd:title>
				<xrd:notes><xsl:value-of select="xteenotes"/></xrd:notes>
				<sec:datalevel><xsl:value-of select="secdatalevel"/></sec:datalevel>
				<sec:declaration><xsl:value-of select="secdeclaration"/></sec:declaration>
			</wsdl:documentation>
			<wsdl:input message="{concat('tns:',$ls_nimi)}" />
			<wsdl:output message="{concat('tns:',$ls_nimi, 'Response')}" />
			<wsdl:fault name="fault" message="tns:faultMessage"/>
		</wsdl:operation>
	</xsl:template>

	<xsl:template match="operation" mode="bind">
		<xsl:param name="as_nimi"/>
		<xsl:variable name="ls_nimi" select="name"/>
		<wsdl:operation name="{$ls_nimi}">
			<soap:operation soapAction="" style="document"/>
			<xrd:version><xsl:value-of select="xteever"/></xrd:version>
			<wsdl:input>
				<soap:body use="literal" />
				<soap:header message="tns:requestHeader" part="client" use="literal" />
				<soap:header message="tns:requestHeader" part="service" use="literal" />
				<soap:header message="tns:requestHeader" part="userId" use="literal" />
				<soap:header message="tns:requestHeader" part="id" use="literal" />
				<soap:header message="tns:requestHeader" part="issue" use="literal" />
				<soap:header message="tns:requestHeader" part="protocolVersion" use="literal" />
				<soap:header message="tns:requestHeader" part="representedParty" use="literal" />
			</wsdl:input>
			<wsdl:output>
				<soap:body use="literal" />
				<soap:header message="tns:requestHeader" part="client" use="literal" />
				<soap:header message="tns:requestHeader" part="service" use="literal" />
				<soap:header message="tns:requestHeader" part="userId" use="literal" />
				<soap:header message="tns:requestHeader" part="id" use="literal" />
				<soap:header message="tns:requestHeader" part="issue" use="literal" />
				<soap:header message="tns:requestHeader" part="protocolVersion" use="literal" />
				<soap:header message="tns:requestHeader" part="requestHash" use="literal" />
				<soap:header message="tns:requestHeader" part="representedParty" use="literal" />
			</wsdl:output>
			<wsdl:fault name="fault">
				<soap:fault use="literal" name="fault"/>
			</wsdl:fault>
		</wsdl:operation>
	</xsl:template>

</xsl:transform>
