package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.ClickListener;

public class Column {

	private String name;

	private String property;

	private String order = "ASC";

	private String text;

	private String style;

	private String rowListenerType;

	private ClickListener listener;

	public static final String COPY = "kopeeri";

	public static final String SELECT = "vali";

	public static final String CHANGE = "muuda";

	public static final String DELETE = "kustuta";

	public static final String VIEW = "vaata";
	
	public static final String VIEWEIT = "laadi alla";

	public static String styleNormal = "xx";

	public static String styleSort = "Sort";

	public static String styleDelete = "xx";

	public static String styleUrl = "Link";

	public static String styleUserSet = "UserSet";
	
	public static String styleUserNotSet = "UserNotSet";

	public Column(String name) {
		this(name, null, null, styleNormal, null);
	}

	public Column(String name, String style) {
		this(name, null, null, style, null);
	}

	/**
     *
     * @author Sven
     * @param name
     *            päise tekst
     * @param property
     *            data property name
     * @param style
     *            veeru stiil
     */
	public Column(String name, String property, String style) {
		this(name, property, null, style, null);
	}

	/**
     *
     * @param name
     *            päise tekst
     * @param property
     *            data property name
     * @param text
     *            text constant in columns
     * @param style
     *            millise veeruga on tegemist
     * @param rowListenerType
     *            clicklistener mis määrab kuhu klikkamine viib
     */
	public Column(String name, String property, String text, String style,
			String rowListenerType) {
		this.name = name;
		this.style = style;
		this.rowListenerType = rowListenerType;
		this.property = property;
		this.text = text;
	}

	/**
     *
     * @param name
     * @param property
     * @param text
     * @param style
     * @param listener
     */
	public Column(String name, String property, String style,
			ClickListener listener) {
		this.name = name;
		this.style = style;
		this.listener = listener;
		this.property = property;
	}

	/**
     * @return veeru pealkiri
     */
	public String getName() {
		return name;
	}

	public String getOrder() {
		return order;
	}

	public String getProperty() {
		return property;
	}

	public String getText() {
		return text;
	}

	/**
     * @return Veeru ridade stiil
     */
	public String getStyle() {
		return style;
	}

	/**
	 */

	public boolean equals(Object o) {
		if (o instanceof Column) {
			return this.getName().equals(((Column) o).getName());
		} else if (o instanceof String) {
			return this.getName().equals((String) o);
		}
		return this.equals(o);
	}

	public static String getStyleDelete() {
		return styleDelete;
	}

	public static void setStyleDelete(String styleDelete) {
		Column.styleDelete = styleDelete;
	}

	public static String getStyleNormal() {
		return styleNormal;
	}

	public static void setStyleNormal(String styleNormal) {
		Column.styleNormal = styleNormal;
	}

	public static String getStyleSort() {
		return styleSort;
	}

	public static void setStyleSort(String styleSort) {
		Column.styleSort = styleSort;
	}

	public static String getStyleUrl() {
		return styleUrl;
	}

	public static void setStyleUrl(String styleUrl) {
		Column.styleUrl = styleUrl;
	}

	public static Column getCopyInstance() {
		return new Column(null, null, COPY, Column.styleUrl, ResultTable.COPY);
	}

	/**
     * Tagastab veeru, mille sisu on alati objekti muutmise link.
     */
	public static Column getChangeInstance() {
		return new Column(null, null, CHANGE, Column.styleUrl,
				ResultTable.CHANGE);
	}

	/**
     * Tagastab veeru, mille sisu on alati objekti kättesaamise link.
     */
	public static Column getSelectInstance() {
		return new Column(null, null, SELECT, Column.styleUrl,
				ResultTable.SELECT);
	}

	/**
     * Tagastab veeru, mille sisu on alati objekti vaatamise link.
     */
	public static Column getViewInstance() {
		return new Column(null, null, VIEW, Column.styleUrl, ResultTable.VIEW);
	}
	
	public static Column getViewEITInstance() {
		return new Column(null, null, VIEWEIT, Column.styleUrl, ResultTable.VIEWEIT);
	}

	/**
     * Tagastab veeru, mille sisu on alati objekti kustutamise link.
     */
	public static Column getDeleteInstance() {
		return new Column(null, null, DELETE, Column.styleUrl,
				ResultTable.DELETE);
	}

	public String getRowListenerType() {
		return rowListenerType;
	}

	public void setRowListenerType(String rowListenerType) {
		this.rowListenerType = rowListenerType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public void setText(String text) {
		this.text = text;
	}

	/**
     * @return the listener
     */
	public ClickListener getListener() {
		return listener;
	}

	/**
     * @param listener
     *            the listener to set
     */
	public void setListener(ClickListener listener) {
		this.listener = listener;
	}

}