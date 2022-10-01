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
	
	<c:set var="ativarBotao" value="" />
	
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de Pedidos</h2>
		<form action="/manutencao/incluir" method="post">
			
			<div class="mb-3 mt-3">
				<label>Placa:</label> <input type="text" class="form-control" placeholder="Entre com a placa" name="placa">
			</div>
			
			<div class="mb-3 mt-3">
				<c:if test="${not empty clientes}">	
					<label>Cliente:</label> 
					<select  name="cliente" class="form-control" id="sel1">
						<c:forEach var="c" items="${clientes}">
							<option value="${c.id}" >${c.nome}</option>
						</c:forEach>
					</select>
				</c:if>
				<c:if test="${empty clientes}">
			        <label>Não existem clientes cadastrados!</label>
			        <c:set var="ativarBotao" value="disabled" />
			    </c:if>
			</div>
			
			<div class="mb-3 mt-3">
				<c:if test="${not empty servicos}">
					<label>Servicos:</label> 
					<c:forEach var="s" items="${servicos}">
						<div class="checkbox">
				      		<label><input type="checkbox" name="servicos" value="${s.id}">${s.descricao}</label>
				    	</div>
					</c:forEach>
				</c:if>
				<c:if test="${empty servicos}">
			        <label>Não existem servicos cadastrados!</label>
			        <c:set var="ativarBotao" value="disabled" />
			    </c:if>
			</div>
			
			<button ${ativarBotao} type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>