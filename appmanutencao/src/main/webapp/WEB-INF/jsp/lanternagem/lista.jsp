<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>AppServico</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="/suspensao/lista">Suspensão</a></li>
				<li class="nav-item"><a class="nav-link" href="/motor/lista">Motor</a></li>
				<li class="nav-item"><a class="nav-link" href="/lanternagem/lista">Lanternagem</a></li>
				<li class="nav-item"><a class="nav-link" href="/cliente/lista">Cliente</a></li>
				<li class="nav-item"><a class="nav-link" href="/manutencao/lista">Manutenção</a></li>
				<li class="nav-item"><a class="nav-link" href="/servico/lista">Servico</a></li>
			</ul>
		</div>
	</nav>

	<div class="container mt-3">
		<h2>AppServico</h2>
		<p>Projeto de controle de serviços oficina</p>
		<h3>Classe: Lanternagem</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>valor</th>
					<th>descricao</th>
					<th>situação</th>
					<th>cor</th>
					<th>local</th>
					<th>valor do reparo</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>10.00</td>
					<td>Serviço de Lanternagem - Porta</td>
					<td>Aguardando</td>
					<td>Azul</td>
					<td>Porta</td>
					<td>10.00</td>
				</tr>
				<tr>
					<td>20.00</td>
					<td>Serviço de Lanternagem - Capuz</td>
					<td>Iniciado</td>
					<td>Verde</td>
					<td>Capuz</td>
					<td>20.00/td>
				</tr>
				<tr>
					<td>30.00</td>
					<td>Serviço de Lanternagem - Porta Mala</td>
					<td>Finalizado</td>
					<td>Porta Mala</td>
					<td>Porta Mala</td>
					<td>30.00</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>