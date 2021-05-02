<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.*, java.time.format.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	<title></title>
	</head>
	<body>
		<div class="headerText center">
			<div>${sessionScope.nombreCompleto}, ha iniciado sesión: =&nbsp<%=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS"))%></div>
			<div>
				<form method="post" action="">
					<input type="submit" formaction="logout.jsp"
						value="Cerrar sesión">
				</form>
			</div>
			<div>
				<button type="button" onclick="window.history.back()">Volver</button>
			</div>
		</div>
	</body>
</html>