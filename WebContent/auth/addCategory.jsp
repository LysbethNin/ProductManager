<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="fr.campusacademy.productmanager.entity.Category" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add category</title>
</head>
<body>
	<%@ include file="../header.jsp" %>
    <h1>Add category</h1>
    
    <form method="POST">
	    <label for="content">Content</label>
	    <br/>
	    <input type="text" name="content" id="content" required/>
	    <br/>	    
	    <input type="submit" value="Create"/>	    
    </form>
    
    <%@ include file="../footer.jsp" %>
</body>
</html>