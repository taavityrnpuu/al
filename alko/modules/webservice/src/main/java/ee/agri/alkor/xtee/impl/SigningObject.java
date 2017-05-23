package ee.agri.alkor.xtee.impl;

import java.io.Serializable;

public class SigningObject implements Serializable{
	private int sessId;
	private String digestHex;
	private String signatureId;
	
	public SigningObject(int sessId, String digestHex, String signatureId){
		setSessId(sessId);
		setDigestHex(digestHex);
		setSignatureId(signatureId);
	}
	
	/**
	 * @return the sessId
	 */
	public int getSessId() {
		return sessId;
	}
	/**
	 * @param sessId the sessId to set
	 */
	public void setSessId(int sessId) {
		this.sessId = sessId;
	}
	/**
	 * @return the digestHex
	 */
	public String getDigestHex() {
		return digestHex;
	}
	/**
	 * @param digestHex the digestHex to set
	 */
	public void setDigestHex(String digestHex) {
		this.digestHex = digestHex;
	}
	/**
	 * @return the signatureId
	 */
	public String getSignatureId() {
		return signatureId;
	}
	/**
	 * @param signatureId the signatureId to set
	 */
	public void setSignatureId(String signatureId) {
		this.signatureId = signatureId;
	}
	
	
}
