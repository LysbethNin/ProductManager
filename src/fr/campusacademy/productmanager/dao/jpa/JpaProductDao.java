package fr.campusacademy.productmanager.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.campusacademy.productmanager.dao.ProductDao;
import fr.campusacademy.productmanager.entity.Product;

public class JpaProductDao implements ProductDao{

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProductManagerPersistenceUnit");	  

	@Override
	public void addProduct(Product product) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction t = em.getTransaction();
		
		try {
			t.begin();
			em.persist(product);
			t.commit();
		} finally {
			if (t.isActive()) t.rollback();
			em.close();
		}
		
	}

	@Override
	public Product findProductById(Long id) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction t = em.getTransaction();
		
		Product product = null;
		
		try {
			t.begin();
			product = em.find(Product.class, id);
			t.commit();
		} finally {
			if (t.isActive()) t.rollback();
			em.close();
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT p FROM Product AS p");
			
		@SuppressWarnings("unchecked")
		List<Product> list = query.getResultList();
		
		em.close();
		
		return list;
	}

	@Override
	public void removeProduct(Long id) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction t = em.getTransaction();
		
		try {
			t.begin();
			em.remove(id);
			t.commit();
		} finally {
			if (t.isActive()) t.rollback();
			em.close();
		}
	}
	
}
