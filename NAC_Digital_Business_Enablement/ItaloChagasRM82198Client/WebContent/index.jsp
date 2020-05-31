<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@include file="bootstrap.jsp" %>
<link rel="stylesheet" href="css/style.css">



<title>Cadastrar venda</title>

</head>
<body>
	<%@include file="navlink.jsp" %>
	<div class="container">
		<div class="row">
			<div class="col">
			
				<!-- FORM DE CADASTRO  -->
				<form name="form" action="cadastrar" method="post">
					<h2>Cadastrar Vendas</h2>
					
					<div class="form-row">

						<div class="form-group col-md-6">
							<label>Nome do cliente</label> 
							<input
								  class="form-control" 
								  placeholder="Insira o nome do cliente" 
								  name="nome"
								  id="form_name" 
								  required autofocus 
								  onblur="valida('nome');">
						</div>

						<div class="form-group col-md-6">
							<label>Preço</label> 
							<input
								 class="form-control" 
								 placeholder="Insira o preço do produto" 
								 type="number" 
								 name="preco"
								 id="form_name" 
								 required 
								 onblur="valida('preco');">
						</div>

						<div class="form-group col-md-6">
							<label>Descrição</label> 
							<input 
							       id="desc" 
							       required
								   name="desc" 
								   type="text" 
								   onblur="valida('desc');" 
								   placeholder="Insira a descrição do produto" 
								   class="form-control">
						</div>


						<div class="form-group col-md-6">
							<label>Data</label> 
							<input 
							       type="date" 
							       class="form-control"
								   placeholder="Insira data de entrada" 
								   name="dataEntrada" 
								   id="dtEntrada" 
								   required
								   onblur="valida('date');">
						</div>
						
												<div class="form-group col-md-12">
							<div class="custom-control custom-checkbox">
	  							<input 
	  							     id="customCheck1"
	  							     type="checkbox" 

	  							     class="custom-control-input"
	  							     name="status"
	  							     >
	  							<label 
	  							     class="custom-control-label" 
	  							     for="customCheck1">
	  							     venda finalizada?
	  							 </label>
						    </div>
						</div>

						<div class="form-group col-md-12">
							<button 
							      id="btn" 
							      class="btn btn-primary" 
							      name="tarefa"
								  value="Cadastrar">Cadastrar
						   </button>
						</div>
					</div>

				</form>
			</div>
		</div>
	</div>

	<!------------------------------------------------------------------------------------------------------------------------------------------------------->

	
	
	
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
		
	<script type="text/javascript" src="js/validaCampo.js"></script>
	
</body>
<footer><p>Cadastrar Vendas</p></footer>
</html>