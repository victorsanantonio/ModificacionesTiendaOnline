<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, modelo.*, vista.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Listado de roles</title>
	</head>
	<body>
		<h2>Listado de roles</h2>
		<form action="" method="post">
			<table border="2">
				<tr>
					<th>Id</th>
					<th>Rol</th>
				</tr>
				<c:forEach items="${pageScope.roles}" var="role"
					varStatus="status" begin="0"
					end="${pageScope.roles.size() - 1}">
					<tr>
						<td><c:out value="${role.id}"></c:out></td>
						<td><c:out value="${role.rol}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>