package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.print.attribute.SetOfIntegerSyntax;

import model.Produto;

public class ProdutoDAO {
	private Connection conn;
	private PreparedStatement stmt;
	
	public ProdutoDAO() {
		conn = new ConnectionFactory().getConnetion();
	}
	
	public void inserir(Produto produto) {
		String sql = "INSERT INTO produto (codigo_produto, descricao_produto,preco_produto) VALUES (?, ?,?)";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, produto.getCodigoProduto());
			stmt.setString(2, produto.getDescricaoProduto());
			stmt.setDouble(3, produto.getPrecoProduto());
			stmt.execute();
			stmt.close();
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public void alterar(Produto produto) {
		String sql = "UPDATE produto SET descricao_produto=?,preco_produto=? WHERE codigo_produto=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, produto.getDescricaoProduto());
			stmt.setDouble(2, produto.getPrecoProduto());
			stmt.setInt(3, produto.getCodigoProduto());
			stmt.execute();
			stmt.close();
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public void deletar(Produto produto) {
		String sql = "DELETE FROM produto WHERE codigo_produto=?";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, produto.getCodigoProduto());
			stmt.execute();
			stmt.close();
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	

}
