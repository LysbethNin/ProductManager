package fr.campusacademy.productmanager.dao;

import java.util.ArrayList;
import java.util.List;

import fr.campusacademy.productmanager.entity.Product;


public class OldProductDAO {
    
    
    private static int currentId = 0;
    
    
    private static final List<Product> PRODUCTS = new ArrayList<>();

   
    public static List<Product> getAllProducts() {
        return PRODUCTS;
    }
    
    
    public static void addProduct(Product product) {
        ++currentId;
        
        product.setId(Long.valueOf(currentId));        
        PRODUCTS.add(product); 
    }
    
    
    public static Product findProduct(Long id) {
        Product product = null;
        
        for (Product browsed : PRODUCTS) {
            if (browsed.getId() == id) {
                product = browsed;
                
                break;
            }
        }
        
        return product;
    }
    
   
    public static void removeProduct(Long id) {
        for (int i = 0; i < PRODUCTS.size(); ++i) {
            if (PRODUCTS.get(i).getId() == id) {
                PRODUCTS.remove(i);
                
                break;
            }
        }
    }
    
}
