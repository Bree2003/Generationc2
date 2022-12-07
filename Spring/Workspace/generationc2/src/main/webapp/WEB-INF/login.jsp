<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<h2>Login Formulario</h2>
    
<c:if test="${msgError!=null}">
<div class="alert alert-danger" role="alert">
<c:out value="${msgError}"></c:out>
</div>
</c:if>
<c:if test="${msgOk!=null}">
    		<div class="alert alert-success" role="alert">
				<c:out value="${msgOk}"></c:out>
			</div>
    	</c:if>

<div class="container">
<form action="/registro/login" method="post">
<label for="correo" class="form-label">Email</label>
<input type="email" id="correo" name="correo" class="form-control" placeholder="Ingrese email" required="required">
<!--  con el name lo capturamos en el backend-->
<br>
<label for="pass" class="form-label"></label>
<input type="password" id="pass" name="pass" class="form-control" placeholder="Ingrese contraseņa" required="required">
<br>
<input type="submit" class="btn btn-outline-primary btn-lg" value="Ingresar">
<a role="button" class="btn btn-primary" href="/registro/usuario">Registro</a>
</form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>