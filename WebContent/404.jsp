<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ERROR</title>
</head>
<body>

<img alt="404Img" src="<%=request.getContextPath() + "/files/error404.PNG"%>" style="width: 900px; height: 400px;"/>
<p >Tu peux essayer de te <a href="/ProductManager/login">Connecter</a> </p>
</body>
</html>