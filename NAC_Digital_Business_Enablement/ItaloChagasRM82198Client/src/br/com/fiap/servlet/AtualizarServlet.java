package br.com.fiap.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Atualizar;
import br.com.fiap.to.VendaTO;

@WebServlet("/atualizar")
public class AtualizarServlet extends HttpServlet{

	private static final long serialVersionUID = 6079183412322493525L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int codigo = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		double preco = Double.parseDouble(req.getParameter("preco"));
		boolean foiPago = false;
		String status = req.getParameter("status"); 

		if(status == null) {
			foiPago = false;
		}else {
			foiPago = true;
		}
		
		String descricao = req.getParameter("desc");
		
		String data = req.getParameter("dataEntrada");
		
		
		DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
	    DateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date date = null;
	     
		try {
			date = originalFormat.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	     String formattedDate = targetFormat.format(date); 
	   
	     Calendar dataVenda = Calendar.getInstance();
	     dataVenda.setTime(date);

		
		VendaTO venda = new VendaTO(codigo, nome, dataVenda, descricao, preco, foiPago);
		Atualizar.putService(venda);
		
		req.getRequestDispatcher("AlterarSucesso.jsp").forward(req, resp);	

		
	}

}
