package model;

public class Produto {
	
	private int codigoProduto;	
	private String descricaoProduto;
	private double precoProduto;
		
	//constructor
	public Produto(int _codigoProduto, String _descricaoProduto, double _precoProduto){
		this.codigoProduto=_codigoProduto;
		this.descricaoProduto=_descricaoProduto;
		this.precoProduto=_precoProduto;
	}
	
	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	
	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

}
