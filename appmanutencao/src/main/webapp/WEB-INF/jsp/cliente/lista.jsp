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
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h2>AppManutencao</h2>
		<p>Projeto de controle de manutenção de veículos</p>
		<h3>Classe: Cliente</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>id</th>
					<th>nome</th>
					<th>cpf</th>
					<th>telefone</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${listagem}">
					<tr>
						<td>${c.id}</td>
						<td>${c.nome}</td>
						<td>${c.cpf}</td>
						<td>${c.telefone}</td>
						<td><a href="/cliente/${c.id}/excluir">excluir</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>