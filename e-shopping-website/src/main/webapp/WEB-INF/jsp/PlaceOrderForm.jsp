<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>

	<form action="newOrder">


		Enter date: <input type="date" name="orderDate" /> <br /> <br>
		Enter customer Id: <input type="text" name="customerId" /><br /> <br>
		Enter amount: <input type="text" name="amountPaid" /><br /> <br>
		Enter mode of payment: <input type="text" name="modeOfPayment" /><br />
		<br> Enter status: <input type="text" name="orderStatus" /><br />
		<br> Enter quantity: <input type="text" name="quantity" /><br />
		<br> full name: <input name="address.fullName" /><br>
		<br> mobile number : <input name="address.mobileNumber" /><br>
		<br> flat number : <input name="address.flatNumber" /><br>
		<br> State : <input name="address.state" /><br> <br> 
		 product id : <input name="product.productId" /><br>
		<br> product name : <input name="product.productName" /><br> <br>
		<input type="submit" />

	</form>
	<div>
	<table>

		<tr>
			<th>Orders orderId</th>
			<th>Date</th>
			<th>customer id</th>
			<th>Price</th>
			<th>mode of payment</th>
			<th>status</th>
			<th>quantity</th>
			<th> full name</th>
			<th>phone number</th>
			<th> flat number</th>
			<th> state</th>
			<th> product id</th>
			<th> product name</th>
		</tr>
		
			<tr>
				<td>${orders.orderId}</td>
				<td>${orders.orderDate}</td>
				<td>${orders.customerId}</td>
				<td>${orders.modeOfPayment}</td>
				<td>${orders.orderStatus}</td>
				<td>${orders.quantity}</td>
				<td>${orders.address.fullName}</td>
				<td>${orders.address.mobileNumber}</td>
				<td>${orders.address.flatNumber}</td>
				<td>${orders.address.state}</td>
				<td>${orders.product.productId}</td>
				<td>${orders.product.productName}</td>
			</tr>
	
	</table>
	</div>
</body>
</html>