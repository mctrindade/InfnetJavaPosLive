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
		<h3>Classe: Serviço</h3>
		
		<h4><a href="/servico">Novo</a></h4>
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th>id</th>
					<th>descricao</th>
					<th>situação</th>
					<th>valor</th>
					
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="s" items="${listagem}">
					<tr>
						<td>${s.id}</td>
						<td>${s.descricao}</td>
						<td>${s.situacao}</td>
						<td>${s.valor}</td>
						<td><a href="/servico/${s.id}/excluir">excluir</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>