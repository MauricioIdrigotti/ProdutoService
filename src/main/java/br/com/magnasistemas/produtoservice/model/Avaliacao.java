package br.com.magnasistemas.produtoservice.model;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class Avaliacao {

	private Produto produto;
	
	@NotNull(message = "O valor não pode ser nulo")
	private Integer valorAvaliacao;
	
	@Nullable
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
	
//	public static class AvaliacaoBuilder {
//		
//		private Produto produto;
//		private Integer valorAvaliacao;
//		private String comentario;
//		
//		public AvaliacaoBuilder produto(Produto produto) {
//			this.produto = produto;
//			return this;
//		}
//		
//		public AvaliacaoBuilder valorAvaliacao(Integer valorAvaliacao) {
//			this.valorAvaliacao = valorAvaliacao;
//			return this;
//		}
//		
//		public AvaliacaoBuilder comentario(String comentario) {
//			this.comentario = comentario;
//			return this;
//		}
//	}
}
