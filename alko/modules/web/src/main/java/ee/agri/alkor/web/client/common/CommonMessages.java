package ee.agri.alkor.web.client.common;

import com.google.gwt.i18n.client.Messages;

public interface CommonMessages extends Messages {

	String errorMsgRequired(String fieldName);
	String errorMsgInteger(String fieldName);
	String errorMsgDate(String fieldName);
	String errorMsgNumber(String fieldName);
	String errorMsgName(String fieldName);
	String errorMsgLength(String fieldName, int min, int max);
	String saveSuccess();
	String buttonBack();
	String buttonSave();
	String stringQueryPattern();

}