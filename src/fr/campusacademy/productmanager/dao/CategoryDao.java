package fr.campusacademy.productmanager.dao;

import java.util.List;

import fr.campusacademy.productmanager.entity.Category;
import fr.campusacademy.productmanager.entity.Product;

public interface CategoryDao {

	
	void addCategory(Category category);
	
	Category findCategoryById(Long id);
	
	List<Category> getAllCategories();
	
	void removeCategory(Long id);
	

}
