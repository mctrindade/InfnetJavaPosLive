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
		<h2>Cadastramento de Motor</h2>
		<form action="/motor/incluir" method="post">
			
			<c:import url="/WEB-INF/jsp/servico/cadastro.jsp" />
			
			<div class="mb-3 mt-3">
				<label>Cilindro:</label> 
				 <label class="radio-inline">
			      <input type="radio" name="cilindro" value="Em linha" checked>Em linha
			    </label>
			    <label class="radio-inline">
			      <input type="radio" name="cilindro" value="Em V">Em V
			    </label>
			    <label class="radio-inline">
			      <input type="radio" name="cilindro" value="Radial">Radial
			    </label>
			</div>
			<div class="mb-3 mt-3">
				<label>Tamanho:</label> <input type="text" class="form-control" placeholder="Entre com o tamanho" name="tamanho">
			</div>
			<div class="mb-3 mt-3">
				<label>Combustivel:</label>
				 <label class="radio-inline">
			      <input type="radio" name="combustivel" value="Gasolina" checked>Gasolina
			    </label>
			    <label class="radio-inline">
			      <input type="radio" name="combustivel" value="Alcool">Alcool
			    </label>
			    <label class="radio-inline">
			      <input type="radio" name="combustivel" value="Flex">Flex
			    </label>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>