package br.com.magnasistemas.produtoservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.magnasistemas.produtoservice.enums.Tamanho;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_IMAGEM")
public class ImagemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
	@Column(name = "altura_produto")
	private Integer altura;
	
	@Column(name = "largura_produto")
	private Integer largura;
	
	@Column(name = "tamanho_imagem")
	private Tamanho tamanhoImagem;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
