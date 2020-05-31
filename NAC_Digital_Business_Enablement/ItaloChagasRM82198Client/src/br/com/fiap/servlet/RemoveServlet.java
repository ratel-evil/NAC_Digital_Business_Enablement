package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Remover;

@WebServlet("/remover")
public class RemoveServlet extends HttpServlet{

	private static final long serialVersionUID = -5416543598913219177L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		Remover remover = new Remover(); 
		
		remover.deleteService(id);
		req.getRequestDispatcher("excluirSucesso.jsp").forward(req, resp);

	}
	
	
}
