package fr.campusacademy.productmanager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.campusacademy.productmanager.dao.DaoFactory;
import fr.campusacademy.productmanager.dao.OldProductDAO;
import fr.campusacademy.productmanager.entity.Product;


@WebServlet(name="ListProductServlet", urlPatterns="/list")
public class ListProductServlet extends HttpServlet {
    
   
    public static final String PARAM_PRODUCTS = "products";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {        
    	
    	//req.setAttribute(PARAM_PRODUCTS, DaoFactory.getProductDao().getAllProducts());
    	
        RequestDispatcher dispatcher = req.getRequestDispatcher("listProduct.jsp");
        
        dispatcher.forward(req, res);
    }
    
}
