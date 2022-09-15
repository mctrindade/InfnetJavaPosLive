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
		<h2>Cadastramento de Suspensão</h2>
		<form action="/suspensao/incluir" method="post">
			
			<c:import url="/WEB-INF/jsp/servico/cadastro.jsp" />
			
			<div class="mb-3 mt-3">
				<label>Pneu:</label> <input type="text" class="form-control" placeholder="Entre com o pneu" name="pneu">
			</div>
			<div class="mb-3 mt-3">
				<label>Amortecedor:</label> <input type="text" class="form-control" placeholder="Entre com o amortecedor" name="amortecedor">
			</div>
			<div class="mb-3 mt-3">
				<label>Mola:</label> <input type="text" class="form-control" placeholder="Entre com a mola" name="mola">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>