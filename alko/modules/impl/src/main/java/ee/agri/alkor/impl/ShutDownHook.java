package ee.agri.alkor.impl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.Scheduler;

import ee.agri.alkor.util.AppContextHelper;

public class ShutDownHook implements ServletContextListener {
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		try	{
			// Get a reference to the Scheduler and shut it down
			Scheduler scheduler = (Scheduler)AppContextHelper.getInstance().getBean("schedulerFactoryController");
			System.out.println("scheduler: " + scheduler.getSchedulerName());
			
			scheduler.shutdown(true);
			
			// Sleep for a bit so that we don't get any errors
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void contextInitialized(ServletContextEvent arg0)
	{
	}
}