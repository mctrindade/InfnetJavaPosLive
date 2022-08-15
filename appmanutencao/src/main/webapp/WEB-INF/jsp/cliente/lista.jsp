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
		<h2>AppServico</h2>
		<p>Projeto de controle de servi�os oficina</p>
		<h3>Classe: Cliente</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>nome</th>
					<th>cpf</th>
					<th>telefone</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Miguel Diniz</td>
					<td>777.083.960-26</td>
					<td>99999-0000</td>
				</tr>
				<tr>
					<td>Maria Clara</td>
					<td>602.484.040-32</td>
					<td>99999-0001</td>
				</tr>
				<tr>
					<td>J�lia Beatriz</td>
					<td>150.437.930-66</td>
					<td>99999-0002</td>
				</tr>
			</tbody>
		</table>
		
	</div>
</body>
</html>