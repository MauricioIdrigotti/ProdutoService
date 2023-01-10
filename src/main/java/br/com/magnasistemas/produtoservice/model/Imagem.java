package br.com.magnasistemas.produtoservice.model;

import br.com.magnasistemas.produtoservice.enums.Tamanho;
import jakarta.validation.constraints.NotNull;

public class Imagem {
	
	@NotNull(message = "A altura não pode ser nula")
	private Integer altura;
	
	@NotNull(message = "A largura não pode ser nula")
	private Integer largura;
	
	@NotNull(message = "O tamanho não pode ser nulo")
	private Tamanho tamanhoImagem;

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getLargura() {
		return largura;
	}

	public void setLargura(Integer largura) {
		this.largura = largura;
	}

	public Tamanho getTamanhoImagem() {
		return tamanhoImagem;
	}

	public void setTamanhoImagem(Tamanho tamanhoImagem) {
		this.tamanhoImagem = tamanhoImagem;
	}

}
