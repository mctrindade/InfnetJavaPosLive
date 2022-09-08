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
		<table class="table table-striped">
			<thead>
				<tr>
					<th>valor</th>
					<th>descrição</th>
					<th>situação</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>10.00</td>
					<td>Serviço de Lanternagem - Porta</td>
					<td>Aguardando</td>
				</tr>
				<tr>
					<td>20.00</td>
					<td>Serviço de Lanternagem - Capuz</td>
					<td>Iniciado</td>
				</tr>
				<tr>
					<td>30.00</td>
					<td>Serviço de Lanternagem - Porta Mala</td>
					<td>Finalizado</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>