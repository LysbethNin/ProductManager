<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="/errorShowProduct.jsp"%>
    <%@ page import="fr.campusacademy.productmanager.servlet.ShowProductServlet" %>
    <%@ page import="fr.campusacademy.productmanager.entity.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product show</title>
</head>
<body>
    <%@ include file="header.jsp" %>
    <h1>Product show</h1>
    
    <c:if test="${product != null}">
        <p><strong>id - name - description - price</strong></p>
        
        <p><strong>${product.id}</strong> - ${product.name} - ${product.description} - ${product.price}</p>
    </c:if>
        
    <%@ include file="footer.jsp" %>
</body>
</html>