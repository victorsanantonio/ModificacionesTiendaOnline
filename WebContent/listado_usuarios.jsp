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
		<title>Listado de usuarios</title>
	</head>
	<body>
		<h2>Listado de usuarios</h2>
		<form action="" method="post">
			<table border="2">
				<tr>
					<th>Id</th>
					<th>Id Rol</th>
					<th>Email</th>
					<th>Clave</th>
					<th>Nombre</th>
					<th>Primer apellido</th>
					<th>Segundo apellido</th>
					<th>Dirección</th>
					<th>Localidad</th>
					<th>Provincia</th>
					<th>Teléfono</th>
					<th>DNI</th>
				</tr>
				<c:forEach items="${sessionScope.usuarios}" var="usuario"
					varStatus="status">
					<tr>
						<td><c:out value="${usuario.id}"></c:out></td>
						<td><c:out value="${usuario.id_rol}"></c:out></td>
						<td><c:out value="${usuario.email}"></c:out></td>
						<td><c:out value="${usuario.clave}"></c:out></td>
						<td><c:out value="${usuario.nombre}"></c:out></td>
						<td><c:out value="${usuario.apellido1}"></c:out></td>
						<td><c:out value="${usuario.apellido2}"></c:out></td>
						<td><c:out value="${usuario.direccion}"></c:out></td>
						<td><c:out value="${usuario.localidad}"></c:out></td>
						<td><c:out value="${usuario.provincia}"></c:out></td>
						<td><c:out value="${usuario.telefono}"></c:out></td>
						<td><c:out value="${usuario.dni}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>