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
		<h3>Cadastramento de Usu�rios</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>nome</th>
					<th>email</th>
					<th>senha</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${listagem}">
					<tr>
						<td>${u.nome}</td>
						<td>${u.email}</td>
						<td>${u.senha}</td>
						<td><a href="/suspensao/${s.id}/excluir">excluir</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>