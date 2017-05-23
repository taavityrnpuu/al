package ee.agri.alkor.web.client.dto;

public class DecisionMap extends ABaseDTOMap {

	public static final String NR = "nr";
	public static final String DATE = "date";
	public static final String EXTEND_UNTIL_DATE = "extendUntilDate";
	public static final String TYPE = "type";
	public static final String EXPLANATION = "explanation";
	public static final String EXTEND_UNTIL_EXPLANATION = "extendUntilExplanation";
	public static final String ENTRY_DECISION = "regEntryDecision";
	public static final String EXTEND_DECISION = "extendRegEntryDecision";
	public static final String EXAMPLES_DECISION = "prodExamplesDecision";
	public static final String SIGNER = "signer";

	/**
	 * Nested propteries.
	 */
	public static final String ENTRY_DECISION_NAME = "regEntryDecision.name";
	public static final String EXAMPLES_DECISION_NAME = "prodExamplesDecision.name";
	public static final String ENTRY_DECISION_TYPE = ENTRY_DECISION + "." + TYPE;

}
