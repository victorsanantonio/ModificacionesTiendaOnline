<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insertar Producto</title>
	</head>
	<body>
		<jsp:include page="Header.jsp" />
		<div align="center">
			<h1>Insertar Categoría</h1>
			<form action="<%=request.getContextPath()%>/VistaInsertarCategoria" method="post">
				<table style="with: 100%">
					<tr>
						<td>Id</td>
						<td><input type="text" name="id" /></td>
					</tr>
					<tr>
						<td>Nombre</td>
						<td><input type="text" name="nombre" /></td>
					</tr>
					<tr>
						<td>Descripción</td>
						<td><input type="text" name="descripcion" /></td>
					</tr>
				</table>
				<input type="submit" value="Insertar"/>
			</form>
		</div>
		<jsp:include page="Footer.jsp" />
	</body>
</html>