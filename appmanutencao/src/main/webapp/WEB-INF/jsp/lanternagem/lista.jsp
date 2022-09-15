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
		<h3>Classe: Lanternagem</h3>
		
		<h4><a href="/lanternagem">Novo</a></h4>
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th>id</th>
					<th>valor</th>
					<th>descricao</th>
					<th>situação</th>
					<th>cor</th>
					<th>local</th>
					<th>valor do reparo</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="l" items="${listagem}">
					<tr>
						<td>${l.id}</td>
						<td>${l.valor}</td>
						<td>${l.descricao}</td>
						<td>${l.situacao}</td>
						<td>${l.cor}</td>
						<td>${l.local}</td>
						<td>${l.valor}</td>
						<td><a href="/lanternagem/${l.id}/excluir">excluir</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>