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

import fr.campusacademy.productmanager.dao.OldProductDAO;
import fr.campusacademy.productmanager.entity.Product;
import fr.campusacademy.productmanager.modelmapping.ProductModelMapping;

@WebServlet(name="ShowProductServlet", urlPatterns="/show")
public class ShowProductServlet extends HttpServlet {
    
    public static final String PARAM_PRODUCT = "product";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {        
        Long id = Long.valueOf(req.getParameter(ProductModelMapping.PARAM_ID));
        
        req.setAttribute(PARAM_PRODUCT, OldProductDAO.findProduct(id));
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("showProduct.jsp");
        
        dispatcher.forward(req, res);
    }
    
}
