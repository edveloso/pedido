package br.edu.infnet.pedido.model;

import java.util.List;

import org.junit.Test;

import br.edu.infnet.pedido.model.entidade.Cliente;
import br.edu.infnet.pedido.model.entidade.ItenPedido;
import br.edu.infnet.pedido.model.entidade.Pedido;

public class CadastroPedidoTest {

	@Test
	public void CadastrarPedidotest() {
		List<ItenPedido> itens = null;
		Cliente cliente = null;
		Pedido pedido=  new Pedido(cliente, itens);
		
		
	}

}
