<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login exitoso</title>
</head>
<body>
	<jsp:include page="Header.jsp" />
	<div align="center">
		<h1>Bienvenido, ${sessionScope.nombreCompleto}.</h1>
		<c:choose>
			<c:when test="${sessionScope.idRolUsuario=='1'}">
				<table border="1">
					<th>Altas</th>
					<th>Listados</th>
					<tr>
						<td>
							<form method="post" action="">
								<input type="submit" formaction="insertar_usuario.jsp"
									value="Alta de usuario">
							</form>
							<form method="post" action="">
								<input type="submit" formaction="insertar_rol.jsp"
									value="Alta de rol">
							</form>
						</td>
						<td>
							<form method="post" action="">
								<input type="submit" formaction="VistaListarUsuarios"
									value="Listado de usuarios">
							</form>
							<form method="post" action="">
								<input type="submit" formaction="VistaListarRoles"
									value="Listado de roles">
							</form>
						</td>
					</tr>
				</table>
			</c:when>
			<c:when test="${sessionScope.idRolUsuario=='2'}">
				<table border="1">
					<th>Listados</th>
					<tr>
						<td>
							<form method="post" action="">
								<input type="submit" formaction="VistaListarUsuarios"
									value="Listado de usuarios">
							</form>
							<form method="post" action="">
								<input type="submit" formaction="VistaListarRoles"
									value="Listado de roles">
							</form>
						</td>
					</tr>
				</table>
			</c:when>
			<c:when test="${sessionScope.idRolUsuario=='3'}">
				<p>Inicio de sesión exitoso</p>
			</c:when>
		</c:choose>
	</div>
	<jsp:include page="Footer.jsp" />
</body>
</html>