package fr.campusacademy.productmanager.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.campusacademy.productmanager.dao.DaoFactory;
import fr.campusacademy.productmanager.dao.OldProductDAO;
import fr.campusacademy.productmanager.dao.jpa.JpaCategoryDao;
import fr.campusacademy.productmanager.entity.Category;
import fr.campusacademy.productmanager.entity.Product;
import fr.campusacademy.productmanager.modelmapping.ProductModelMapping;

@WebServlet(name="InsertProductServlet", urlPatterns="/auth/insert")
public class InsertProductServlet extends HttpServlet { 

		
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        
    	req.setAttribute("categories", DaoFactory.getCategoryDao().getAllCategories());
    	RequestDispatcher dispatcher = req.getRequestDispatcher("addProduct.jsp");
        
        dispatcher.forward(req, res);
    }
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
               
        fr.campusacademy.productmanager.entity.Product product = new Product();
        String productName = req.getParameter(ProductModelMapping.PARAM_NAME);
        String productDescription = req.getParameter(ProductModelMapping.PARAM_DESCRIPTION);
        float productPrice = Float.valueOf(req.getParameter(ProductModelMapping.PARAM_PRICE)); 
        
        product.setName(productName);
        product.setDescription(productDescription);
        product.setPrice(productPrice);
        
        DaoFactory.getProductDao().addProduct(product);
		
		 res.sendRedirect("/ProductManager/show?id=" + product.getId());
    }
       
}
