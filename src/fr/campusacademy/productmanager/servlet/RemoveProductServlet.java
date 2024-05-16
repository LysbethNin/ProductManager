package fr.campusacademy.productmanager.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.campusacademy.productmanager.dao.OldProductDAO;
import fr.campusacademy.productmanager.entity.Product;
import fr.campusacademy.productmanager.modelmapping.ProductModelMapping;

@WebServlet(name="RemoveProductServlet", urlPatterns="/auth/remove")
public class RemoveProductServlet extends HttpServlet { 
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        OldProductDAO.removeProduct(Long.valueOf(req.getParameter(ProductModelMapping.PARAM_ID)));
        
        res.sendRedirect("/ProductManager/list");
    }
    
}
