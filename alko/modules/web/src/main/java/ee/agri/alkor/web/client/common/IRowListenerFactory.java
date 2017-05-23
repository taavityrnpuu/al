package ee.agri.alkor.web.client.common;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;

/**
 * Interface for creating table row listeners.
 * 
 * @author suisalu
 *
 */
public interface IRowListenerFactory {

	ClickListener create(String listenerType, Object row);
}
