package fr.campusacademy.productmanager.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.campusacademy.productmanager.dao.CategoryDao;
import fr.campusacademy.productmanager.entity.Category;
import fr.campusacademy.productmanager.entity.Product;

public class JpaCategoryDao implements CategoryDao{

	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProductManagerPersistenceUnit");	  
	
	@Override
	public void addCategory(Category category) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction t = em.getTransaction();
		
		try {
			t.begin();
			em.persist(category);
			t.commit();
		} finally {
			if (t.isActive()) t.rollback();
			em.close();
		}
	}

	@Override
	public Category findCategoryById(Long id) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction t = em.getTransaction();
		
		Category category = null;
		
		try {
			t.begin();
			category = em.find(Category.class, id);
			t.commit();
		} finally {
			if (t.isActive()) t.rollback();
			em.close();
		}
		return category;
	}

	@Override
	public List<Category> getAllCategories() {
		
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT c FROM Category AS c");
			
		@SuppressWarnings("unchecked")
		List<Category> list = query.getResultList();
		
		em.close();
		
		return list;
	}

	@Override
	public void removeCategory(Long id) {
		
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
