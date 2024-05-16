package fr.campusacademy.productmanager.dao;

import fr.campusacademy.productmanager.dao.jpa.JpaCategoryDao;
import fr.campusacademy.productmanager.dao.jpa.JpaProductDao;

public class DaoFactory {

	private DaoFactory() {
		
	}
	
	public static CategoryDao getCategoryDao() {
		return new JpaCategoryDao();
	}
	
	public static ProductDao getProductDao() {
		return new JpaProductDao();
	}
	
}
