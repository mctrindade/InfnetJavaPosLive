<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>AppManutencao</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de Lanternagem</h2>
		<form action="/lanternagem/incluir" method="post">
			
			<c:import url="/WEB-INF/jsp/servico/cadastro.jsp" />
			
			<div class="mb-3 mt-3">
				<label>Cor:</label> <input type="text" class="form-control" placeholder="Entre com a cor" name="cor">
			</div>
			<div class="mb-3 mt-3">
				<label>Local:</label> <input type="text" class="form-control" placeholder="Entre com o local" name="local">
			</div>
			<div class="mb-3 mt-3">
				<label>Valor Reparo:</label> <input type="text" class="form-control" placeholder="Entre com o valor do reparo" name="valorReparo">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>