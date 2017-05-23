/**
 * DigiDocServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl;

public class DigiDocServiceImpl implements ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DigiDocServicePortType{
    public void startSession(java.lang.String signingProfile, java.lang.String sigDocXML, boolean bHoldSession, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DataFileData datafile, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.IntHolder sesscode, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder signedDocInfo) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        sesscode.value = 0;
        signedDocInfo.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignedDocInfo();
    }

    public java.lang.String closeSession(int sesscode) throws java.rmi.RemoteException {
        return null;
    }

    public void createSignedDoc(int sesscode, java.lang.String format, java.lang.String version, javax.xml.rpc.holders.StringHolder status, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder signedDocInfo) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signedDocInfo.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignedDocInfo();
    }

    public void addDataFile(int sesscode, java.lang.String fileName, java.lang.String mimeType, java.lang.String contentType, int size, java.lang.String digestType, java.lang.String digestValue, java.lang.String content, javax.xml.rpc.holders.StringHolder status, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder signedDocInfo) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signedDocInfo.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignedDocInfo();
    }

    public void removeDataFile(int sesscode, java.lang.String dataFileId, javax.xml.rpc.holders.StringHolder status, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder signedDocInfo) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signedDocInfo.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignedDocInfo();
    }

    public void getSignedDoc(int sesscode, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder signedDocData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signedDocData.value = new java.lang.String();
    }

    public void getSignedDocInfo(int sesscode, javax.xml.rpc.holders.StringHolder status, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder signedDocInfo) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signedDocInfo.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignedDocInfo();
    }

    public void getDataFile(int sesscode, java.lang.String dataFileId, javax.xml.rpc.holders.StringHolder status, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.DataFileDataHolder dataFileData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        dataFileData.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DataFileData();
    }

    public void getSignersCertificate(int sesscode, java.lang.String signatureId, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder certificateData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        certificateData.value = new java.lang.String();
    }

    public void getNotarysCertificate(int sesscode, java.lang.String signatureId, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder certificateData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        certificateData.value = new java.lang.String();
    }

    public void getNotary(int sesscode, java.lang.String signatureId, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder ocspData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        ocspData.value = new java.lang.String();
    }

    public void getTSACertificate(int sesscode, java.lang.String timestampId, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder certificateData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        certificateData.value = new java.lang.String();
    }

    public void getTimestamp(int sesscode, java.lang.String timestampId, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder timestampData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        timestampData.value = new java.lang.String();
    }

    public void getCRL(int sesscode, java.lang.String signatureId, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder CRLData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        CRLData.value = new java.lang.String();
    }

    public void getSignatureModules(int sesscode, java.lang.String platform, java.lang.String phase, java.lang.String type, javax.xml.rpc.holders.StringHolder status, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignatureModulesArrayHolder modules) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        modules.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignatureModule[0];
    }

    public void prepareSignature(int sesscode, java.lang.String signersCertificate, java.lang.String signersTokenId, java.lang.String role, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String country, java.lang.String signingProfile, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder signatureId, javax.xml.rpc.holders.StringHolder signedInfoDigest) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signatureId.value = new java.lang.String();
        signedInfoDigest.value = new java.lang.String();
    }

    public void finalizeSignature(int sesscode, java.lang.String signatureId, java.lang.String signatureValue, javax.xml.rpc.holders.StringHolder status, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder signedDocInfo) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signedDocInfo.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignedDocInfo();
    }

    public void removeSignature(int sesscode, java.lang.String signatureId, javax.xml.rpc.holders.StringHolder status, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder signedDocInfo) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signedDocInfo.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignedDocInfo();
    }

    public void getVersion(javax.xml.rpc.holders.StringHolder name, javax.xml.rpc.holders.StringHolder version, javax.xml.rpc.holders.StringHolder libraryVersion) throws java.rmi.RemoteException {
        name.value = new java.lang.String();
        version.value = new java.lang.String();
        libraryVersion.value = new java.lang.String();
    }

    public void mobileSign(int sesscode, java.lang.String signerIDCode, java.lang.String signersCountry, java.lang.String signerPhoneNo, java.lang.String serviceName, java.lang.String additionalDataToBeDisplayed, java.lang.String language, java.lang.String role, java.lang.String city, java.lang.String stateOrProvince, java.lang.String postalCode, java.lang.String countryName, java.lang.String signingProfile, java.lang.String messagingMode, int asyncConfiguration, boolean returnDocInfo, boolean returnDocData, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder statusCode, javax.xml.rpc.holders.StringHolder challengeID) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        statusCode.value = new java.lang.String();
        challengeID.value = new java.lang.String();
    }

    public void getStatusInfo(int sesscode, boolean returnDocInfo, boolean waitSignature, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder statusCode, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.holders.SignedDocInfoHolder signedDocInfo) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        statusCode.value = new java.lang.String();
        signedDocInfo.value = new ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.SignedDocInfo();
    }

    public void mobileAuthenticate(java.lang.String IDCode, java.lang.String countryCode, java.lang.String phoneNo, java.lang.String language, java.lang.String serviceName, java.lang.String messageToDisplay, java.lang.String SPChallenge, java.lang.String messagingMode, int asyncConfiguration, boolean returnCertData, boolean returnRevocationData, javax.xml.rpc.holders.IntHolder sesscode, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder userIDCode, javax.xml.rpc.holders.StringHolder userGivenname, javax.xml.rpc.holders.StringHolder userSurname, javax.xml.rpc.holders.StringHolder userCountry, javax.xml.rpc.holders.StringHolder userCN, javax.xml.rpc.holders.StringHolder certificateData, javax.xml.rpc.holders.StringHolder challengeID, javax.xml.rpc.holders.StringHolder challenge, javax.xml.rpc.holders.StringHolder revocationData) throws java.rmi.RemoteException {
        sesscode.value = 0;
        status.value = new java.lang.String();
        userIDCode.value = new java.lang.String();
        userGivenname.value = new java.lang.String();
        userSurname.value = new java.lang.String();
        userCountry.value = new java.lang.String();
        userCN.value = new java.lang.String();
        certificateData.value = new java.lang.String();
        challengeID.value = new java.lang.String();
        challenge.value = new java.lang.String();
        revocationData.value = new java.lang.String();
    }

    public void getMobileAuthenticateStatus(int sesscode, boolean waitSignature, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder signature) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signature.value = new java.lang.String();
    }

    public void mobileCreateSignature(java.lang.String IDCode, java.lang.String signersCountry, java.lang.String phoneNo, java.lang.String language, java.lang.String serviceName, java.lang.String messageToDisplay, java.lang.String role, java.lang.String city, java.lang.String stateOrProvince, java.lang.String postalCode, java.lang.String countryName, java.lang.String signingProfile, ee.sk.www.DigiDocService.DigiDocService_2_3_wsdl.DataFileDigest[] dataFiles, java.lang.String format, java.lang.String version, java.lang.String signatureID, java.lang.String messagingMode, int asyncConfiguration, javax.xml.rpc.holders.IntHolder sesscode, javax.xml.rpc.holders.StringHolder challengeID, javax.xml.rpc.holders.StringHolder status) throws java.rmi.RemoteException {
        sesscode.value = 0;
        challengeID.value = new java.lang.String();
        status.value = new java.lang.String();
    }

    public void getMobileCreateSignatureStatus(javax.xml.rpc.holders.IntHolder sesscode, boolean waitSignature, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder signature) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        signature.value = new java.lang.String();
    }

    public void getMobileCertificate(java.lang.String IDCode, java.lang.String country, java.lang.String phoneNo, java.lang.String returnCertData, javax.xml.rpc.holders.StringHolder authCertStatus, javax.xml.rpc.holders.StringHolder signCertStatus, javax.xml.rpc.holders.StringHolder authCertData, javax.xml.rpc.holders.StringHolder signCertData) throws java.rmi.RemoteException {
        authCertStatus.value = new java.lang.String();
        signCertStatus.value = new java.lang.String();
        authCertData.value = new java.lang.String();
        signCertData.value = new java.lang.String();
    }

    public void checkCertificate(java.lang.String certificate, boolean returnRevocationData, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder userIDCode, javax.xml.rpc.holders.StringHolder userGivenname, javax.xml.rpc.holders.StringHolder userSurname, javax.xml.rpc.holders.StringHolder userCountry, javax.xml.rpc.holders.StringHolder userOrganisation, javax.xml.rpc.holders.StringHolder userCN, javax.xml.rpc.holders.StringHolder issuerCN, javax.xml.rpc.holders.StringHolder keyUsage, javax.xml.rpc.holders.StringHolder enhancedKeyUsage, javax.xml.rpc.holders.StringHolder revocationData) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        userIDCode.value = new java.lang.String();
        userGivenname.value = new java.lang.String();
        userSurname.value = new java.lang.String();
        userCountry.value = new java.lang.String();
        userOrganisation.value = new java.lang.String();
        userCN.value = new java.lang.String();
        issuerCN.value = new java.lang.String();
        keyUsage.value = new java.lang.String();
        enhancedKeyUsage.value = new java.lang.String();
        revocationData.value = new java.lang.String();
    }

}
