<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${message}</h1>
<form action="update" method="put">
	Enter order Id: <input type="text" name="orderId"/><br/>
	Enter current status : <input type="text" name="orderStatus"/><br/>
	<input type="submit"/>
</form>
</body>
</html>