package br.edu.infnet.pedido.model.entidade;

import java.time.LocalDate;
import java.util.List;

public class Pedido {

	private Long numero;
	
	private LocalDate data;
	
	private Cliente cliente;
	
	private List<ItenPedido> itens;
	
	public Pedido() {
	}

	public Pedido(Cliente cliente, List<ItenPedido> itens) {
		super();
		this.data = LocalDate.now();
		this.cliente = cliente;
		this.itens = itens;
	}



	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItenPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItenPedido> itens) {
		this.itens = itens;
	}
	
	
}
