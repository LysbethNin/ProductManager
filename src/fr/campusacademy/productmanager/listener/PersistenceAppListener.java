package fr.campusacademy.productmanager.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.campusacademy.productmanager.utils.PersistenceManager;

@WebListener
public class PersistenceAppListener implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent evt){
	    PersistenceManager.getEmf();
	}

	// Call on application destruction
	@Override
	public void contextDestroyed(ServletContextEvent evt) {
	    PersistenceManager.closeEmf();
	}

}
