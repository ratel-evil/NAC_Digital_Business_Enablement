package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.dao.VendaDAOImpl;
import br.com.fiap.to.VendaTO;

public class VendaBO {
	
	private VendaDAOImpl vd = null;
		
	public List<VendaTO> listar() {
		vd = new VendaDAOImpl();
		return vd.select();
	}
	
	public VendaTO listar(int cod) {
		vd = new VendaDAOImpl();
		return vd.select(cod);
	}
	
	public boolean insert(VendaTO venda) {
		vd = new VendaDAOImpl();
		return vd.insert(venda);
	}
	
	public boolean update(VendaTO venda) {
		vd = new VendaDAOImpl();
		return vd.update(venda);
	}
	
	public void delete(int cod) {
		vd = new VendaDAOImpl();
		vd.delete(cod);
	}
	
}
