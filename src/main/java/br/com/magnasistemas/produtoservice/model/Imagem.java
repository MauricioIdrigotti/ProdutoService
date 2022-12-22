package br.com.magnasistemas.produtoservice.model;

import br.com.magnasistemas.produtoservice.enums.Tamanho;

public class Imagem {

	private Integer altura;
	private Integer largura;
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
