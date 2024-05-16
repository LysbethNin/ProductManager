<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="fr.campusacademy.productmanager.servlet.LoginServlet" %>
<header>
    <a href="/ProductManager/list">Product list</a>
    
    <c:choose> 
	    <c:when test="${username != null}">
	        <a href="/ProductManager/auth/insert">Add product</a>
	        <a href="/ProductManager/auth/category">Add category</a>
	        <a href="/ProductManager/cheap">Cheapest products</a>
	        <a href="/ProductManager/logout">Logout</a>
	        <br/>Connected user : <strong><c:out value="${username}"/></strong>
	    </c:when>
	    <c:when test="${username == null}">
	       <a href="/ProductManager/login">Login</a>
	    </c:when>
    </c:choose>
    
</header>