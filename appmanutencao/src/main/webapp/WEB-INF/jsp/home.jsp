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
		<h3>Classe: Servi�o</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>String</td>
					<td>Descri��o do Servi�o</td>
				</tr>
				<tr>
					<td>situacao</td>
					<td>int</td>
					<td>Situa��o do servico</td>
				</tr>
				<tr>
					<td>valor</td>
					<td>BigDecimal</td>
					<td>Valor do servi�o</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Cliente</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>nome</td>
					<td>String</td>
					<td>Nome do Cliente</td>
				</tr>
				<tr>
					<td>cpf</td>
					<td>String</td>
					<td>N�mero do cadastro de pessoa fis�ca</td>
				</tr>
				<tr>
					<td>telefone</td>
					<td>String</td>
					<td>N�mero de contato telef�nico</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Lanternagem</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>cor</td>
					<td>String</td>
					<td>Cor da pe�a</td>
				</tr>
				<tr>
					<td>local</td>
					<td>String</td>
					<td>Localiza�ao do reparo</td>
				</tr>
				<tr>
					<td>reparo</td>
					<td>String</td>
					<td>Descri��o do reparo a ser realizado</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Manuten��o</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>box</td>
					<td>int</td>
					<td>N�mero do Box onde ser� realizado o servi�o</td>
				</tr>
				<tr>
					<td>placa</td>
					<td>String</td>
					<td>N�mero da plada do ve�culo</td>
				</tr>
				<tr>
					<td>Data</td>
					<td>LocalDate</td>
					<td>Data de agendamento do servi�o</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Motor</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>cilindro</td>
					<td>String</td>
					<td>Tipo do cilindro</td>
				</tr>
				<tr>
					<td>tamanho</td>
					<td>double</td>
					<td>Tipo de motor</td>
				</tr>
				<tr>
					<td>combustivel</td>
					<td>String</td>
					<td>Combust�vel do veiculo</td>
				</tr>
			</tbody>
		</table>
		<h3>Classe: Suspensao</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>pneu</td>
					<td>int</td>
					<td>N�mero do pneu</td>
				</tr>
				<tr>
					<td>amortecedor</td>
					<td>String</td>
					<td>Localiza��o do amortecedor</td>
				</tr>
				<tr>
					<td>mola</td>
					<td>String</td>
					<td>Identifica��o da mola</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>