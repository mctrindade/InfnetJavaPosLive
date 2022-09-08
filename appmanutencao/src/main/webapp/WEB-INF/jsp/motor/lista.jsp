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
		<h3>Classe: Motor</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>id</th>
					<th>valor</th>
					<th>descricao</th>
					<th>situação</th>
					<th>cilindros</th>
					<th>tamanho</th>
					<th>combustivel</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="m" items="${listagem}">
					<tr>
						<td>${m.id}</td>
						<td>${m.valor}</td>
						<td>${m.descricao}</td>
						<td>${m.situacao}</td>
						<td>${m.cilindro}</td>
						<td>${m.tamanho}</td>
						<td>${m.combustivel}</td>
						<td><a href="/motor/${m.id}/excluir">excluir</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>