package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Consultar;
import br.com.fiap.to.VendaTO;

@WebServlet("/listar")
public class ListarServlet extends HttpServlet{


	private static final long serialVersionUID = 7661371151554059409L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Integer id = null;
		if(req.getParameter("id") != null) {
			if (!req.getParameter("id").isEmpty()) {
				id = Integer.parseInt(req.getParameter("id"));
				
				System.out.println(id);
			} 
			
		}
		
		if(id == null) {
			VendaTO[] vendas = Consultar.getService();
			req.setAttribute("vendas",vendas);
		}else {
			VendaTO venda = Consultar.getService(id);
			req.setAttribute("venda",venda);
		}
		
		
		
		req.getRequestDispatcher("listadevendas.jsp").forward(req, resp);

	}
}
