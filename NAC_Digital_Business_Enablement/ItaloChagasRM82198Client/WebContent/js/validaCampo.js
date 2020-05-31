function valida(campo) {
	var 
	    nome = form.codigo.value,
		nome = form.nome.value, 
		preco = form.preco.value, 
		desc = form.desc.value, 
		date = form.date.value
	
	if (campo == "codigo") {
		if ((codigo == "") || (form.codigo.value.length < 3)) {
				
			form.codigo.style.border = "2px solid red";
			return false;

		} else {
			form.codigo.style.border = "2px solid green";
		}
	}
		
	if (campo == "nome") {
		if ((nome == "") || (form.nome.value.length < 3)) {

			form.nome.style.border = "2px solid red";
			return false;

		} else {
			form.nome.style.border = "2px solid green";
		}
	}

	if (campo == "preco") {
		if (preco == "") {

			form.preco.style.border = "2px solid red";	
			return false;

		} else {
			form.preco.style.border = "2px solid green";
		}
	}
	
	if (campo == "desc") {
		if (desc == "") {
			form.desc.style.border = "2px solid red";
		} else {
			form.desc.style.border = "2px solid green";
		}
	}

	if (campo == "date") {
		if (date == "") {
			form.date.style.border = "2px solid red";

		} else {
			form.date.style.border = "2px solid green";
		}
	}
};



