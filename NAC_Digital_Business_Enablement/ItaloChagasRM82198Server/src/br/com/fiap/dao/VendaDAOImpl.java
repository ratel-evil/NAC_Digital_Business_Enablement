package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.to.VendaTO;

public class VendaDAOImpl implements VendaDAO{

	public static List<VendaTO> listaVenda = null;

	public VendaDAOImpl() {
		
		if(listaVenda == null) {
			listaVenda = new ArrayList<VendaTO>();
			
			VendaTO venda = new VendaTO();
			venda.setCodigo(1);
			
			Calendar c = Calendar.getInstance();
			c.set(2020, Calendar.JANUARY, 22);
			
			venda.setData(c.getTime());
			venda.setNomeCliente("Italo");
			venda.setDescricao("Teclado Corsair 55K gamer");
			venda.setStatus(true);
			venda.setValor(150.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(2);
			
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());
			venda.setNomeCliente("Adriano");
			venda.setDescricao("Mouse HyperX");
			venda.setStatus(true);
			venda.setValor(220.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(3);
			venda.setNomeCliente("Breno");
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("Monitor Benq 24' 144hz");
			venda.setStatus(false);
			venda.setValor(1150.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(4);
			venda.setNomeCliente("Italo");
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("MousePad Fallen R6");
			venda.setStatus(true);
			venda.setValor(120.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(5);
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("Gears Of War 5 Ultimate Edition");
			venda.setStatus(true);
			venda.setValor(130.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(6);
			venda.setNomeCliente("Cryslan");
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("HeadSet HyperX cloud revolver");
			venda.setStatus(true);
			venda.setValor(450.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(7);
			venda.setNomeCliente("Renan");
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("Teclado Logitech gamer");
			venda.setStatus(true);
			venda.setValor(350.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(8);
			venda.setNomeCliente("Adriano");
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("The Witcher 3: Wild Hunt Gold Edition");
			venda.setStatus(false);
			venda.setValor(80.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(9);
			venda.setNomeCliente("Adriano");
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("The Witcher 2");
			venda.setStatus(false);
			venda.setValor(30.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setCodigo(10);
			venda.setNomeCliente("Marcos");
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("The Witcher");
			venda.setStatus(false);
			venda.setValor(30.50);
			listaVenda.add(venda);
			
			venda = new VendaTO();
			venda.setNomeCliente("Marcelo");
			venda.setCodigo(11);
			c.set(2020, Calendar.JANUARY, 22);
			venda.setData(c.getTime());			venda.setDescricao("Bioshock Collection");
			venda.setStatus(false);
			venda.setValor(220.00);
			listaVenda.add(venda);		
		}
		
	}
		
	@Override
	public List<VendaTO> select() {
		return listaVenda;
	}

	@Override
	public VendaTO select(int cod) {
		for (VendaTO venda : listaVenda) {
			if(venda.getCodigo() == cod) {
				return venda;
			}
		}
		return null;
	}

	@Override
	public boolean insert(VendaTO venda) {
		if(venda != null) {
			return listaVenda.add(venda);
		}else {
			return false;
		}
	}

	@Override
	public boolean update(VendaTO venda) {
		for (VendaTO vendaTO : listaVenda) {
			if(vendaTO.getCodigo() == venda.getCodigo()) {
				listaVenda.remove(listaVenda.indexOf(vendaTO));
				listaVenda.add(venda);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void delete(int cod) {
		VendaTO venda = null;
		for (VendaTO vendaTO : listaVenda) {
			if(vendaTO.getCodigo() == cod) {
				venda = vendaTO;
				break; 
			}
		}
			
		listaVenda.remove(listaVenda.indexOf(venda));		
			
	}	
}
