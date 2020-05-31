package br.com.fiap.to;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VendaTO {

	private int codigo;
	private String nomeCliente; 
	private Date data;
	private String descricao;
	private double valor; 
	private boolean status;
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Date getData() {
		
	//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return data;
				//sdf.format(this.data);
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public VendaTO(int codigo, String nomeCliente, Calendar data, String descricao, double valor,
			boolean status) {
		this.codigo = codigo;
		this.nomeCliente = nomeCliente;
		this.data = data.getTime();
		this.descricao = descricao;
		this.valor = valor;
		this.status = status;
	}
	public VendaTO() {
	}
	
	
	
	
}
