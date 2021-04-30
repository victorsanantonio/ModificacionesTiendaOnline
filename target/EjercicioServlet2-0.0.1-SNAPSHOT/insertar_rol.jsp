<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<div align="center">
			<h1>Insertar Rol</h1>
			<form action="<%=request.getContextPath()%>/VistaInsertarRol" method="post">
				<table style="with: 100%">
					<tr>
						<td>Id</td>
						<td><input type="text" name="id" /></td>
					</tr>
					<tr>
						<td>Rol</td>
						<td><input type="text" name="rol" /></td>
					</tr>
				</table>
				<input type="submit" value="Insertar"/>
			</form>
		</div>
	</body>
</html>