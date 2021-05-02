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
		<title>Listado de roles</title>
	</head>
	<body>
		<jsp:include page="Header.jsp" />
		<h2>Listado de roles</h2>
		<form action="" method="post">
			<table border="2">
				<tr>
					<th>Id</th>
					<th>Rol</th>
				</tr>
				<c:forEach items="${sessionScope.roles}" var="role" varStatus="status">
					<tr>
						<td><c:out value="${role.id}"></c:out></td>
						<td><c:out value="${role.rol}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</form>
		<jsp:include page="Footer.jsp" />
	</body>
</html>