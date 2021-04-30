<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login exitoso</title>
</head>
<body>
	<div align="center">
		<h1>Bienvenido, ${sessionScope.nombreCompleto}.</h1>
		<table border="1">
			<th>Altas</th>
			<th>Listados</th>
			<tr>
				<td>
					<form method="post"
						action="">
						<input type="submit" formaction="insertar_usuario.jsp" value="Alta de usuario">
					</form>
					<form method="post"
						action="">
						<input type="submit" formaction="insertar_rol.jsp" value="Alta de rol">
					</form>
				</td>
				<td>
					<form method="post"
						action="">
						<input type="submit" formaction="insertar_rol.jsp" value="Listado de usuarios">
					</form>
					<form method="post"
						action="">
						<input type="submit" formaction="insertar_rol.jsp" value="Listado de roles">
					</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>