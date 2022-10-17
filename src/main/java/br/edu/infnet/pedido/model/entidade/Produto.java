package br.edu.infnet.pedido.model.entidade;

public class Produto {

	private Long codigo;
	private String descricao;
	private Double preco;

	public Produto(String descricao, Double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public Double getPreco() {
		return preco;
	}
	
	

}
