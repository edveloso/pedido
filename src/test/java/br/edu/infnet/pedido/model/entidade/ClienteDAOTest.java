package br.edu.infnet.pedido.model.entidade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.infnet.pedido.model.JdbcUtil;

public class ClienteDAOTest {

	@Test
	public void test() throws SQLException {
		
		List<Cliente> lista = new ArrayList<>();
		Connection con = JdbcUtil.obterConexao();
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select codigo, nome from cliente");
		while(rs.next()) {
			Cliente cliente = new Cliente(rs.getLong(1), rs.getString(2));
			lista.add(cliente);
		}
	
		System.out.println(lista);
		
		
		Assert.assertEquals(lista.size(), 2);
	}

}
