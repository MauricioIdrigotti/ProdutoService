package br.com.magnasistemas.produtoservice.model;

public class Avaliacao {

	private Produto produto;
	private Integer valorAvaliacao;
	private String comentario;
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getValorAvaliacao() {
		return valorAvaliacao;
	}

	public void setValorAvaliacao(Integer valorAvaliacao) {
		this.valorAvaliacao = valorAvaliacao;
	}

}
