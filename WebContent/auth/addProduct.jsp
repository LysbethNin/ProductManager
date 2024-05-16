<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="fr.campusacademy.productmanager.entity.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add product</title>
</head>
<body>
    <%@ include file="../header.jsp" %>
    <h1>Add product</h1>
    
    <form action="insert" method="POST">
	    <label for="name">Name</label>
	    <br/>
	    <input type="text" name="name" id="name" required/>
	    <br/>
	    <label for="description">Description</label>
	    <br/>
	    <input type="text" name="description" id="description" required/>
	    <br/>
	    <label for="price">Price</label>
	    <br/>
	    <input type="number" name="price" id="price" value="0" step="0.01"/>
	    <br/>
	    <select name="listeCategory">
            <c:forEach var="category" items="${categories}">
                <option name="nameCategory" value=" ${category.content} " > ${category.content} </option>
            </c:forEach>
        </select>
	    <input type="submit" value="Create"/>	    
    </form>
    
    <%@ include file="../footer.jsp" %>
</body>
</html>