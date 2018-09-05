package main;
import dao.ProdutoDAO;
import model.Produto;

public class Main {
	public static void main(String[] args) {
		//produtoDAO
		ProdutoDAO produtoDAO = new ProdutoDAO(); 
		//produtoModel
		Produto produto = new Produto(1, "Coca-cola", 4.50);
		produtoDAO.deletar(produto);

	}

}
