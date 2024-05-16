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


@WebServlet(name="AddCategoryServlet", urlPatterns="/auth/category")

public class AddCategoryServlet extends HttpServlet {
      
		
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("addCategory.jsp");
        
        dispatcher.forward(req, res);
    }
	
	@Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		fr.campusacademy.productmanager.entity.Category category = new Category();
        String categoryContent = req.getParameter("content");
            
        category.setContent(categoryContent);
        
		DaoFactory.getCategoryDao().addCategory(category);
		
		res.sendRedirect("/ProductManager/list");
    }
	
}
