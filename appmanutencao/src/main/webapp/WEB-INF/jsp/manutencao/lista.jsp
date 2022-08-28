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
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="/suspensao/lista">Suspens�o</a></li>
				<li class="nav-item"><a class="nav-link" href="/motor/lista">Motor</a></li>
				<li class="nav-item"><a class="nav-link" href="/lanternagem/lista">Lanternagem</a></li>
				<li class="nav-item"><a class="nav-link" href="/cliente/lista">Cliente</a></li>
				<li class="nav-item"><a class="nav-link" href="/manutencao/lista">Manuten��o</a></li>
				<li class="nav-item"><a class="nav-link" href="/servico/lista">Servico</a></li>
			</ul>
		</div>
	</nav>

	<div class="container mt-3">
		<h2>AppManutencao</h2>
		<p>Projeto de controle de manuten��o de ve�culos</p>
		<h3>Classe: Manuten��o</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>id</th>
					<th>box</th>
					<th>placa</th>
					<th>data</th>
					<th>cliente</th>
					<th>servi�os</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="m" items="${listagem}">
					<tr>
						<td>${m.id}</td>
						<td>${m.box}</td>
						<td>${m.placa}</td>
						<td>${m.data}</td>
						<td>${m.cliente}</td>
						<td>${m.servicos}</td>
						<td><a href="/manutencao/${m.id}/excluir">excluir</a>
					</tr>
				</c:forEach>				
			</tbody>
		</table>
	</div>
</body>
</html>