<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/sign-in/">
<title>Login</title>
<link href="bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<link href="signin.css" rel="stylesheet">
</head>
<body class="text-center">
	<main class="form-signin">
		<div align="center">
			<form action="<%=request.getContextPath()%>/VistaLogin" method="post">
				<h1 class="h3 mb-3 fw-normal">Por favor, inicia sesión</h1>

				<div class="form-floating">
					<input type="email" name="username" class="form-control" id="floatingInput"
						placeholder="name@example.com"> <label for="floatingInput">Correo electrónico</label>
				</div>
				<div class="form-floating">
					<input type="password" name="password" class="form-control" id="floatingPassword"
						placeholder="Contraseña"> <label for="floatingPassword">Contraseña</label>
				</div>

				<div class="checkbox mb-3">
					<label> <input type="checkbox" value="remember-me">
						Recordar
					</label>
				</div>
				<button class="w-100 btn btn-lg btn-primary" type="submit">Iniciar sesión</button>
				<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
			</form>
		</div>
	</main>
</body>
</html>