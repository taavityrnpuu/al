package ee.agri.alkor.web.client;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

	private String name;

	private String styleName;

	private String [] viewRoles;

	private String historyKey;

    private String activeImageString;

    private String inactiveImageString;

	private List  subMenus = new ArrayList();

	public MenuItem() {
		super();
	}

    public MenuItem(String name, String styleName, String targetForm, String[] viewRoles,
            String activeImageString, String inactiveImageString) {
        this(name, styleName, targetForm, viewRoles);
        this.activeImageString = activeImageString;
        this.inactiveImageString = inactiveImageString;
    }

	public MenuItem(String name, String styleName, String targetForm, String[] viewRoles) {
		super();
		this.name = name;
		this.styleName = styleName;
		this.viewRoles = viewRoles;
		this.historyKey = targetForm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public List getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List subMenus) {
		this.subMenus = subMenus;
	}

	public String getHistoryKey() {
		return historyKey;
	}

	public void setHistoryKey(String historyKey) {
		this.historyKey = historyKey;
	}

	public String[] getViewRoles() {
		return viewRoles;
	}

	public void setViewRoles(String[] viewRoles) {
		this.viewRoles = viewRoles;
	}

	public void addSubMenu(MenuItem item) {
		this.subMenus.add(item);
	}

    public String getActiveImageString() {
        return activeImageString;
    }

    public void setActiveImageString(String activeImageString) {
        this.activeImageString = activeImageString;
    }

    public String getInactiveImageString() {
        return inactiveImageString;
    }

    public void setInactiveImageString(String inactiveImageString) {
        this.inactiveImageString = inactiveImageString;
    }

}
