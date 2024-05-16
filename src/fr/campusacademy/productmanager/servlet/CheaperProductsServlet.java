package fr.campusacademy.productmanager.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.campusacademy.productmanager.entity.Product;

@WebServlet(name="ListProductServlet", urlPatterns="/cheap")
public class CheaperProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
private EntityManagerFactory emf;
	
		
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
       
        EntityManager em = emf.createEntityManager();
				
		try {
		Query query = em.createQuery("SELECT p FROM Product AS p WHERE "
					+ "p.price < 100");
			
		@SuppressWarnings("unchecked")
		List<Product> list = query.getResultList();
		req.setAttribute( "products", list );
		}catch(Exception e){
			e.printStackTrace();
		}
		em.close();
	
		
		 RequestDispatcher dispatcher = req.getRequestDispatcher("listProduct.jsp");	        
	     dispatcher.forward(req, res);
    }
	
	
}
