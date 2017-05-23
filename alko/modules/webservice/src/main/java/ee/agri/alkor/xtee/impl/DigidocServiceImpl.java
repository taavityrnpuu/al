package ee.agri.alkor.xtee.impl;

import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.rpc.Stub;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;

import org.digidoc4j.DataFile;

import ee.agri.alkor.service.SystemException;
import ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DataFileData;
import ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder;
import ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServiceLocator;
import ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServiceStub;
import ee.agri.alkor.xtee.impl.SigningObject;

public class DigidocServiceImpl {
	
	private String endpointServiceURL = "";
	
	public DigidocServiceImpl(String endpoint){
		endpointServiceURL = endpoint;
	}

	public SigningObject signDoc(DataFileData datafile, String certInHex) {
		DigiDocServiceLocator service = new DigiDocServiceLocator();
		DigiDocServiceStub port = null;
		try {
			port = (DigiDocServiceStub) service.getDigiDocService(new URL(
					endpointServiceURL));
		} catch (Exception e) {
			throw new SystemException(e);
		}
		((Stub) port)._setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);

		IntHolder sesscode = new IntHolder();
		StringHolder status = new StringHolder();
		SignedDocInfoHolder signedDocInfo = new SignedDocInfoHolder();		
		boolean bHoldSession = true;
		String sigDocXML = "";
		String signingProfile = null;
		
		int sessId = 0;
		String digestHex = null;
		String signatureId = null;

		try {
			port.startSession(signingProfile, sigDocXML, bHoldSession,
					null, status, sesscode, signedDocInfo);


			
			port.createSignedDoc(sesscode.value, "BDOC", "2.1", status, signedDocInfo);
						

			port.addDataFile(sesscode.value, datafile.getFilename(), datafile.getMimeType(), datafile.getContentType(), datafile.getSize(), datafile.getDigestType(), datafile.getDigestValue(), datafile.getDfData(), status, signedDocInfo);
			

			StringHolder signatureIdHolder = new StringHolder();
			StringHolder signedInfoDigest = new StringHolder();			

			port.prepareSignature(sesscode.value, certInHex, "", "", "",
					"", "", "", signingProfile, status, signatureIdHolder, signedInfoDigest);


			sessId = sesscode.value;
			digestHex = signedInfoDigest.value;
			signatureId = signatureIdHolder.value;			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return new SigningObject(sessId, digestHex, signatureId);		
	}
	
	
	public String finalizeSignature(SigningObject data, String signatureInHex){
		String result = null;
		
		DigiDocServiceLocator service = new DigiDocServiceLocator();
		DigiDocServiceStub port = null;
		try {
			port = (DigiDocServiceStub) service.getDigiDocService(new URL(
					endpointServiceURL));
		} catch (Exception e) {
			throw new SystemException(e);
		}
		((Stub) port)._setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS,
				Boolean.FALSE);

		try{
			StringHolder status = new StringHolder();
			SignedDocInfoHolder signedDocInfo = new SignedDocInfoHolder();
			
			port.finalizeSignature(data.getSessId(), data.getSignatureId(),
					signatureInHex, status, signedDocInfo);
			

			StringHolder signedDocData = new StringHolder();
			port.getSignedDoc(data.getSessId(), status, signedDocData);
			

			result = signedDocData.value;
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		return result;
	}

}
