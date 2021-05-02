<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, modelo.*, vista.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Listado de productos</title>
	</head>
	<body>
		<jsp:include page="Header.jsp" />
		<h2>Listado de productos</h2>
		<form action="" method="post">
			<table border="2">
				<tr>
					<th>Id</th>
					<th>Id Categoría</th>
					<th>Nombre</th>
					<th>Descripción</th>
					<th>Precio</th>
					<th>Stock</th>
					<th>Fecha de alta</th>
					<th>Fecha de baja</th>
					<th>Impuesto</th>
				</tr>
				<c:forEach items="${sessionScope.productos}" var="producto"
					varStatus="status">
					<tr>
						<td><c:out value="${producto.id}"></c:out></td>
						<td><c:out value="${producto.id_categoria}"></c:out></td>
						<td><c:out value="${producto.nombre}"></c:out></td>
						<td><c:out value="${producto.descripcion}"></c:out></td>
						<td><c:out value="${producto.precio}"></c:out></td>
						<td><c:out value="${producto.stock}"></c:out></td>
						<td><c:out value="${producto.fecha_alta}"></c:out></td>
						<td><c:out value="${producto.fecha_baja}"></c:out></td>
						<td><c:out value="${producto.impuesto}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</form>
		<jsp:include page="Footer.jsp" />
	</body>
</html>