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
	
		<c:if test="${not empty mensagem}">
			<div class="alert ${tipo}">
			  <strong>Informa??o</strong> ${mensagem}
			</div>
		</c:if>
	
		<h2>AppManutencao</h2>
		<p>Projeto de controle de manuten??o de ve?culos</p>
		<h3>Classe: Cliente</h3>
		
		<h4><a href="/cliente">Novo</a></h4>
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th>id</th>
					<th>nome</th>
					<th>cpf</th>
					<th>telefone</th>
					<th>usuario</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${listagem}">
					<tr>
						<td>${c.id}</td>
						<td>${c.nome}</td>
						<td>${c.cpf}</td>
						<td>${c.telefone}</td>
						<th>${c.usuario.email}</th>
						<td><a href="/cliente/${c.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>