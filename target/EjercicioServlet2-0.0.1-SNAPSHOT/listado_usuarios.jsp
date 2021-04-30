<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, modelo.*, vista.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Listado de usuarios</title>
		<link rel="stylesheet" type="text/css" href="css/app_styles.css"
			media="screen">
	</head>
	<body>
		<h2>Listado de usuarios</h2>
		<form action="" method="post">
			<table border="2">
				<tr>
					<th>Añadir</th>
					<th>Producto</th>
					<th>Descripción</th>
					<th>Precio</th>
				</tr>
				<c:forEach items="${pageScope.productList}" var="producto"
					varStatus="status" begin="0"
					end="${pageScope.productList.size() - 1}">
					<tr>
						<td><c:out value="${producto.nombre}"></c:out></td>
						<td><c:out value="${producto.descripcion}"></c:out></td>
						<td><fmt:formatNumber value="${producto.precio}"
								type="currency" /></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>