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
	  <h2>Stacked form</h2>
	  <form action="/login" method="post">
	    <div class="mb-3 mt-3">
	      <label for="email">Email:</label>
	      <input type="email" class="form-control" placeholder="Entre com seu e-mail" name="email">
	    </div>
	    <div class="mb-3">
	      <label for="pwd">Password:</label>
	      <input type="password" class="form-control" placeholder="Entre com sua senha" name="senha">
	    </div>
	    
	    <button type="submit" class="btn btn-primary">Submit</button>
	  </form>
	</div>
</body>
</html>