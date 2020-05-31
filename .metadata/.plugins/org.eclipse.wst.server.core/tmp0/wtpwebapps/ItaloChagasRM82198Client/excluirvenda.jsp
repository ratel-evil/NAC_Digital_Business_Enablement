<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@include file="bootstrap.jsp" %>
<link rel="stylesheet" href="css/style.css">

<title>Cadastro de Produtos</title>

<title>Cancelar venda</title>

</head>
<body>
	<%@include file="navlink.jsp" %>
	<div class="container">
		<div class="row">
			<div class="col">
			<h2>Excluir Produto</h2>
				<!-- FORM DE CADASTRO  -->
				<form name="form" action="remover" method="post">
					<div class="form-row">
	
						<div class="form-group col-md-8">
							<label>Código do produto</label>
							<input
							      type="number"
								  class="form-control" 
								  placeholder="Insira o código do produto" 
								  name="id"
								  id="form_name" 
								  required 
								  autofocus 
								  onblur="valida('id');">
						</div>

						<div class="form-group col-md-4">
							<button 
							      id="btn" 
							      class="btn btn-primary" 
							      >Excluir Produto
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
<footer><p>Cancelar venda</p></footer>
</html>