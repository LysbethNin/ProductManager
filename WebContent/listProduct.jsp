<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="fr.campusacademy.productmanager.servlet.ListProductServlet" %>
    <%@ page import="fr.campusacademy.productmanager.modelmapping.ProductModelMapping" %>
    <%@ page import="fr.campusacademy.productmanager.entity.Product" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product list</title>
</head>
<body>
    <%@ include file="header.jsp" %>
    <h1>Product list</h1>
    
  <!--    <c:if test="${products != null && products.size() > 0}">
        <p><strong>id - name - description - price</strong></p>
    </c:if>
    <ul>
        <c:forEach items="${products}" var="product">
            <li><strong>${product.id}</strong> - ${product.name}" - ${product.description} - ${product.price}
            <form method="POST" action="auth/remove">
            <input type="hidden" name="${ProductModelMapping.PARAM_ID}" value="${product.id}"/>
            <input type="submit" value="Delete"/></form></li>
        </c:forEach>
    </ul> -->
    
    <%@ include file="footer.jsp" %>
</body>
</html>