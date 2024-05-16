package fr.campusacademy.productmanager.dao;

import java.util.List;

import fr.campusacademy.productmanager.entity.Product;

public interface ProductDao {
	
	void addProduct(Product product);
	Product findProductById(Long id);
	List<Product> getAllProducts();
	void removeProduct(Long id);
	
}
