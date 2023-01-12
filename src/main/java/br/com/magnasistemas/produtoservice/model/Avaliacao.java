package br.com.magnasistemas.produtoservice.model;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class Avaliacao {
	
	@NotNull(message = "O valor não pode ser nulo")
	private Integer valorAvaliacao;
	
	@Nullable
	private String comentario;
	
	public Avaliacao(@NotNull(message = "O valor não pode ser nulo") Integer valorAvaliacao, String comentario) {
		super();
		this.valorAvaliacao = valorAvaliacao;
		this.comentario = comentario;
	}

	public Avaliacao() {
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
