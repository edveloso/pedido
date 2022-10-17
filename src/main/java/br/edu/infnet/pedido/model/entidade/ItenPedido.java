package br.edu.infnet.pedido.model.entidade;

public class ItenPedido {
	
	private Long codigo;
	
	private Produto produto;
	
	private int quantidade;

	public ItenPedido(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	

}
