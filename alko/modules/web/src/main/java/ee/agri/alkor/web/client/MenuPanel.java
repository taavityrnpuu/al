package ee.agri.alkor.web.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.ConstantsWithLookup;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import ee.agri.alkor.web.client.common.UIutils;

public class MenuPanel extends Composite {

	private final VerticalPanel vpanel = new VerticalPanel();
	private static ArrayList subListenerList = new ArrayList();
	private static ArrayList listenerList = new ArrayList();
	private static ConstantsWithLookup messages;
	private String defaultToken;	
	private boolean canEditEnterprise;

	public Object getConstantsWithLookup() {
		if ("est".equals(ServiceContext.getInstance().getLanguage()))
			return GWT.create(MenuEstMsgs.class);
		else
			return GWT.create(MenuEngMsgs.class);
	}

	public MenuPanel(String defaultToken, boolean canEditEnterprise) {
		super();
		this.canEditEnterprise = canEditEnterprise;
		this.defaultToken = defaultToken != null ? defaultToken : "";
		messages = (ConstantsWithLookup) getConstantsWithLookup();
		buildMenus();
		initWidget(vpanel);
	}

	private void buildMenus() {
		
//
//		ServiceContext.getInstance().getRegistryService().getCanEditEnterprise(new AsyncCallback() {
//
//			public void onFailure(Throwable caught) {
//				Window.alert(String.valueOf(caught.getMessage()));
//			}
//
//			public void onSuccess(Object result) {
//				String val = String.valueOf(result);			
//				boolean canEditEnterprise = ((Boolean) result)
//						.booleanValue();
				boolean isEstLang = "est".equals(ServiceContext.getInstance().getLanguage());
				GWT.log("TEMP:" + defaultToken);
				for (Iterator it = MenuConfig.getConfig(canEditEnterprise).iterator(); it.hasNext();) {
					MenuItem menuItem = (MenuItem) it.next();
					boolean condition1 = getLabel("menuHome").equals(menuItem.getName());
					boolean condition2 = getLabel("menuForms").equals(menuItem.getName());
					boolean condition3 = getLabel("menuContacts").equals(menuItem.getName());
					boolean engCondition = condition1 || condition2 || condition3;
					boolean hasPrivs = UIutils.userHasPriviledge(menuItem.getViewRoles());
					if (hasPrivs && (isEstLang || engCondition)) {
						buildSubMenu(menuItem);
					}
				}
				
				
//			}
//		});

		
	}

	public static void refreshMenus() {
		String token = History.getToken();
		GWT.log("listenerList" + listenerList.size());
		for (Object subListener : subListenerList) {
			((OpenCloseListener) subListener).setActive(false);
		}
		for (Object listener : listenerList) {
			if (listener instanceof HistoryClickListener && token.equals(((HistoryClickListener) listener).getKey())) {
				if (((HistoryClickListener) listener).getParentListener() != null) {
					GWT.log("parent activated");
					((HistoryClickListener) listener).getParentListener().setActive(true);
				}
				GWT.log("historyclick activate");
				((HistoryClickListener) listener).setActive();
			}
		}
	}

	private void buildSubMenu(MenuItem item) {

		if (item.getSubMenus().size() > 0) {
			OpenCloseListener listener = new OpenCloseListener();
			subListenerList.add(listener);
			createSubMenu(item.getName(), item.getStyleName(), listener);
			activate(listener, item);
			int i = 0;
			for (Iterator it = item.getSubMenus().iterator(); it.hasNext(); i++) {
				MenuItem subItem = (MenuItem) it.next();
				if (UIutils.userHasPriviledge(subItem.getViewRoles())) {
					HistoryClickListener def = new HistoryClickListener(subItem.getHistoryKey());
					if (i == 0)
						listener.setDefault(def);
					listener.add(createSubMenu(subItem.getName(), subItem.getStyleName(), def, listener));
					activate(def, listener, subItem);
					listenerList.add(def);
				} else {
					i--;
				}
			}
		} else {
			HistoryClickListener def = new HistoryClickListener(item.getHistoryKey());
			createSubMenu(item.getName(), item.getStyleName(), def);
			activate(def, null, item);
			listenerList.add(def);
		}
	}

	private void activate(HistoryClickListener def, OpenCloseListener listener, MenuItem subItem) {
		if (History.getToken().equals(subItem.getHistoryKey()) || defaultToken.equals(subItem.getHistoryKey())) {
			def.setActive();
			if (listener != null)
				listener.setActive();
		}
	}

	private void activate(OpenCloseListener listener, MenuItem item) {
		if (History.getToken().equals(item.getHistoryKey()) || defaultToken.equals(item.getHistoryKey())) {
			listener.setActive();
		}
	}

	// private HorizontalPanel createSubMenu(MenuItem item, ClickListener
	// listener) {
	// HorizontalPanel panel = new HorizontalPanel();
	// panel.setWidth("100%");
	// panel.setStyleName(item.getStyleName());
	// panel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
	// Image image = new Image(item.getInactiveImageString());
	// panel.add(image);
	// Label theLabel = new Label(item.getName());
	// panel.add(theLabel);
	// panel.setCellWidth(theLabel, "100%");
	// vpanel.add(panel);
	// if (listener instanceof OpenCloseListener) {
	// ((OpenCloseListener) listener).init(panel, image);
	// theLabel.addClickListener(listener);
	// }
	// }

	/**
	 * Abimeetod alammenüü loomiseks.
	 */
	private HorizontalPanel createSubMenu(String label, String style, ClickListener listener) {
		return createSubMenu(label, style, listener, null);
	}

	/**
	 * Geneeriline abimeetod alammenüü loomiseks.
	 * 
	 * @param label
	 *            silt
	 * @param style
	 *            stiil
	 * @param listener
	 *            tema enda kuulaja
	 * @param parentListener
	 *            ülemkuulaja
	 * @return
	 */
	private HorizontalPanel createSubMenu(String label, String style, ClickListener listener, ClickListener parentListener) {
		HorizontalPanel item = new HorizontalPanel();
		item.setWidth("100%");
		item.setStyleName(style);
		item.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		Image image = new Image("images/suur_tarn.gif");
		item.add(image);
		Label theLabel = new Label(label);
		item.add(theLabel);
		item.setCellWidth(theLabel, "100%");
		vpanel.add(item);
		if (listener instanceof OpenCloseListener) {
			((OpenCloseListener) listener).init(item, image);
			theLabel.addClickListener(listener);
		} else if (listener instanceof HistoryClickListener) {
			((HistoryClickListener) listener).init(item, image, parentListener);
			theLabel.addClickListener(listener);
		}
		return item;
	}

	private class OpenCloseListener implements ClickListener {

		private HistoryClickListener def;

		private Image image;

		private HorizontalPanel mainMenu;

		private boolean visible = false;

		private final List widgets = new ArrayList();

		public List getWidgets() {
			return widgets;
		}

		public void disableMenu() {
			image.setUrl("images/suur_tarn.gif");
			mainMenu.setStyleName("MainMenu");
			visible = false;
			setItemsVisibility();
		}

		public void enableMenu() {
			image.setUrl("images/nool_mitteaktiivne.gif");
			mainMenu.setStyleName("OpenMenu");
			visible = true;
			setItemsVisibility();
		}

		private void setItemsVisibility() {
			for (int i = 0; i < widgets.size(); i++) {
				((Widget) widgets.get(i)).setVisible(visible);
			}
		}

		public void setDefault(HistoryClickListener def) {
			this.def = def;
		}

		public void init(HorizontalPanel mainMenu, Image image) {
			this.image = image;
			this.mainMenu = mainMenu;
		}

		public void add(Widget widget) {
			widget.setVisible(visible);
			widgets.add(widget);
		}

		private void closeOtherMenus() {
			Iterator it = subListenerList.iterator();
			while (it.hasNext()) {
				OpenCloseListener list = (OpenCloseListener) it.next();
				if (!list.equals(this)) {
					list.disableMenu();
					Iterator wIterator = list.getWidgets().iterator();
					while (wIterator.hasNext()) {
						Widget widg = (Widget) wIterator.next();
						if (widg.isVisible())
							widg.setVisible(false);
					}
				}
			}
		}

		public boolean getActive() {
			return visible;
		}

		public void onClick(Widget sender) {
			setActive();
			def.onClick(sender, false);
		}

		public void setActive() {
			setActive(!visible);
		}

		public void setActive(boolean visible) {
			closeOtherMenus();
			this.visible = visible;
			GWT.log("openclose" + visible);
			if (visible) {
				enableMenu();
			} else {
				disableMenu();
			}
			setItemsVisibility();
		}

	}

	/**
	 * Peab meeles menüü ajalugu et oleks võimalik back'i abil
	 * menüüpunktide vahel navigeerida
	 * 
	 */

	private static class HistoryClickListener implements ClickListener {

		private static List images = new ArrayList();
		private static List subImages = new ArrayList();
		private static List menus = new ArrayList();
		private final String key;
		private OpenCloseListener parentListener;
		private Image image;
		private HorizontalPanel menu;

		public HistoryClickListener(String key) {
			this.key = key;
		}

		public void init(HorizontalPanel menu, Image image, ClickListener parentListener) {
			this.image = image;
			this.menu = menu;
			if (parentListener != null && parentListener instanceof OpenCloseListener) {
				this.parentListener = (OpenCloseListener) parentListener;
				subImages.add(image);
			} else {
				images.add(image);
			}
			menus.add(menu);
		}

		private void closeOtherMenus(Widget sender) {
			Iterator it = subListenerList.iterator();
			while (it.hasNext()) {
				OpenCloseListener list = (OpenCloseListener) it.next();
				list.disableMenu();
				Iterator wIterator = list.getWidgets().iterator();
				while (wIterator.hasNext()) {
					HorizontalPanel widg = (HorizontalPanel) wIterator.next();
					if (widg.getWidget(1).equals(sender)) {
						list.enableMenu();
						break;
					}
					if (widg.isVisible()) {
						widg.setVisible(false);
					}
				}
			}
		}

		public void onClick(Widget sender) {
			onClick(sender, true);
		}

		public void onClick(Widget sender, boolean noClose) {
			if (noClose)
				closeOtherMenus(sender);
			if (!History.getToken().equals(key))
				UIutils.setLoadMessageVisible(true);
			setActive();

			if (History.getToken().equals(key)) {
				History.onHistoryChanged(key);
			}
			History.newItem(key);

		}

		public void setActive() {
			GWT.log("historyclick");
			for (int i = 0; i < subImages.size(); i++) {
				((Image) subImages.get(i)).setUrl("images/nool_mitteaktiivne.gif");
			}
			for (int i = 0; i < images.size(); i++) {
				((Image) images.get(i)).setUrl("images/suur_tarn.gif");
			}
			image.setUrl("images/nool_aktiivne.gif");
			for (int i = 0; i < menus.size(); i++) {
				((HorizontalPanel) menus.get(i)).removeStyleName("SelectedMenu");
			}
			menu.addStyleName("SelectedMenu");
		}

		public String getKey() {
			return key;
		}

		public OpenCloseListener getParentListener() {
			return parentListener;
		}

	}

	private String getLabel(String key) {
		String parsed = key.replace('.', '_');
		try {
			return messages.getString(parsed);
		} catch (Exception e) {
			return "[NO_MESSAGE]";
		}
	}

}