package br.com.magnasistemas.produtoservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AvaliacaoEntity {

	@Column(name = "valor_avaliacao")
	private Integer valorAvaliacao;
	
	@Column(name = "comentario_avaliacao")
	private String comentario;

	public Integer getValorAvaliacao() {
		return valorAvaliacao;
	}

	public void setValorAvaliacao(Integer valorAvaliacao) {
		this.valorAvaliacao = valorAvaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
