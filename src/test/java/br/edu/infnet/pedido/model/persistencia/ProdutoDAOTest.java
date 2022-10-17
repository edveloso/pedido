package br.edu.infnet.pedido.model.persistencia;

import org.junit.Test;

import br.edu.infnet.pedido.model.entidade.Produto;

public class ProdutoDAOTest {

	@Test
	public void salvarProdutoTest() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = new Produto("Bife com batatas", 38.8);
		produtoDAO.salvar(produto);
	}

}
