package br.edu.infnet.pedido.model.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.edu.infnet.pedido.model.JdbcUtil;
import br.edu.infnet.pedido.model.entidade.Produto;

public class ProdutoDAO {
	
	private static Logger logger = LoggerFactory.getLogger(ProdutoDAO.class);

	private Connection con;
	private PreparedStatement pstm;
	
	public ProdutoDAO() {
		this.con = JdbcUtil.obterConexao();
	}
	public boolean salvar(Produto produto)  {
		logger.info("Cadastrando o produto");
		String sql = "insert into produto(codigo, descricao, preco)"
				+ "values (null,?,?);";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, produto.getDescricao());
			pstm.setDouble(2, produto.getPreco());
			return pstm.execute();
		} catch (SQLException e) {
			logger.error(sql, e);
			return false;
		}
	}
	
	
}
