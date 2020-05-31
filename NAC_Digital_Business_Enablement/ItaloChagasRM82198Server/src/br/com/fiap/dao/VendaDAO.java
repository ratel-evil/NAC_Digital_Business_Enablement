package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.to.VendaTO;

public interface VendaDAO {
	
	public List<VendaTO> select();
	
	public VendaTO select(int cod);
	
	public boolean insert(VendaTO venda);
	
	public boolean update(VendaTO venda);
	
	public void delete(int cod);
	
	
}
