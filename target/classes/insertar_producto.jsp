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
			<h1>Insertar Producto</h1>
			<form action="<%=request.getContextPath()%>/VistaInsertarProducto" method="post">
				<table style="with: 100%">
					<tr>
						<td>Id</td>
						<td><input type="text" name="id" /></td>
					</tr>
					<tr>
						<td>Id Categoría</td>
						<td><input type="text" name="id_categoria" /></td>
					</tr>
					<tr>
						<td>Nombre</td>
						<td><input type="text" name="nombre" /></td>
					</tr>
					<tr>
						<td>Descripción</td>
						<td><input type="text" name="descripcion" /></td>
					</tr>
					<tr>
						<td>Precio</td>
						<td><input type="text" name="precio" /></td>
					</tr>
					<tr>
						<td>Stock</td>
						<td><input type="text" name="stock" /></td>
					</tr>
					<tr>
						<td>Fecha alta</td>
						<td><input type="text" name="fecha_alta" /></td>
					</tr>
					<tr>
						<td>Fecha baja</td>
						<td><input type="text" name="fecha_baja" /></td>
					</tr>
					<tr>
						<td>Impuesto</td>
						<td><input type="text" name="impuesto" /></td>
					</tr>
				</table>
				<input type="submit" value="Insertar"/>
			</form>
		</div>
		<jsp:include page="Footer.jsp" />
	</body>
</html>