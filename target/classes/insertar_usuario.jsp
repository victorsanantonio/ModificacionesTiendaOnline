<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<jsp:include page="Header.jsp" />
		<div align="center">
			<h1>Insertar Usuario</h1>
			<form action="<%=request.getContextPath()%>/VistaInsertarUsuario" method="post">
				<table style="with: 100%">
					<tr>
						<td>Id</td>
						<td><input type="text" name="id" /></td>
					</tr>
					<tr>
						<td>Id Rol</td>
						<td><input type="text" name="id_rol" /></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email" /></td>
					</tr>
					<tr>
						<td>Clave</td>
						<td><input type="text" name="clave" /></td>
					</tr>
					<tr>
						<td>Nombre</td>
						<td><input type="text" name="nombre" /></td>
					</tr>
					<tr>
						<td>Primer apellido</td>
						<td><input type="text" name="apellido1" /></td>
					</tr>
					<tr>
						<td>Segundo apellido</td>
						<td><input type="text" name="apellido2" /></td>
					</tr>
					<tr>
						<td>Dirección</td>
						<td><input type="text" name="direccion" /></td>
					</tr>
					<tr>
						<td>Localidad</td>
						<td><input type="text" name="localidad" /></td>
					</tr>
					<tr>
						<td>Provincia</td>
						<td><input type="text" name="provincia" /></td>
					</tr>
					<tr>
						<td>Teléfono</td>
						<td><input type="text" name="telefono" /></td>
					</tr>
					<tr>
						<td>DNI</td>
						<td><input type="text" name="dni" /></td>
					</tr>
				</table>
				<input type="submit" value="Insertar"/>
			</form>
		</div>
		<jsp:include page="Footer.jsp" />
	</body>
</html>