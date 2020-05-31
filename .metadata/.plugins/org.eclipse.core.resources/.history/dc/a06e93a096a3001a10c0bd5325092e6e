<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="br.com.fiap.to.VendaTO"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="bootstrap.jsp"%>
<link rel="stylesheet" href="css/style.css">

<title>Vendas</title>

</head>
<body>
	<%@include file="navlink.jsp"%>
		
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Listar Produtos</h2>
				<div class="form-group col-md-12">
				
				<form action="listar" method="get">
					<div class="form-group col-md-6">
							<label>Código</label> 
							<input
								 class="form-control" 
								 placeholder="Insira o código da venda" 
								 type="number" 
								 name="id"
								 id="form_name" 
								 onblur="valida('id');">
								 
								<button 
							      id="btn" 
							      class="btn btn-primary" 							
								  value="Cadastrar">Pesquisar
								  
						   </button>
						</div>
					
					</form>
						
					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th scope="col">Código</th>
								<th scope="col">Nome Cliente</th>
								<th scope="col">Preço</th>
								<th scope="col">Descrição produto</th>
								<th scope="col">Data de entrada</th>
								<th scope="col">Status</th>
							</tr>
						</thead>
						
						<c:choose>
  							<c:when test="${not empty venda}">
   							
							
										<tr>
										<td>${venda.getCodigo()}</td>
										<td>${venda.getNomeCliente()}</td>
										<td>${venda.getValor()} </td>
										<td>${venda.getDescricao()} </td>
										<td><fmt:formatDate value="${venda.getData()}" pattern="dd/MM/yyyy" /></td>
								
																
										<td>${venda.isStatus() ? "Finalizada" : "Em andamento" } </td>
									</tr>

							</c:when>
						
						
						<c:otherwise>
   									<c:forEach var="venda" items="${vendas}">
										<tr>
										<td>${venda.getCodigo()}</td>
										<td>${venda.getNomeCliente()}</td>
										<td>${venda.getValor()} </td>
										<td>${venda.getDescricao()} </td>
										<td><fmt:formatDate value="${venda.getData()}" pattern="dd/MM/yyyy" /></td>
								
																
										<td>${venda.isStatus() ? "Finalizada" : "Em andamento" } </td>
									</tr>
									</c:forEach>
							</c:otherwise>
							
						</c:choose>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<!------------------------------------------------------------------------------------------------------------------------------------------------------->




	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

	<script type="text/javascript" src="js/validaCampo.js"></script>
</body>
<footer >
	<p>Lista de vendas</p>
</footer>
</html>