<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, modelo.*, vista.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Listado de categorías</title>
	</head>
	<body>
		<jsp:include page="Header.jsp" />
		<h2>Listado de categorías</h2>
		<form action="" method="post">
			<table border="2">
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Descripción</th>
				</tr>
				<c:forEach items="${sessionScope.categorias}" var="categoria" varStatus="status">
					<tr>
						<td><c:out value="${categoria.id}"></c:out></td>
						<td><c:out value="${categoria.nombre}"></c:out></td>
						<td><c:out value="${categoria.descripcion}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</form>
		<jsp:include page="Footer.jsp" />
	</body>
</html>