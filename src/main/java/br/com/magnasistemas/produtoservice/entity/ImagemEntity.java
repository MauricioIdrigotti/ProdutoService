package br.com.magnasistemas.produtoservice.entity;

import br.com.magnasistemas.produtoservice.enums.Tamanho;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_IMAGEM")
public class ImagemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private ProdutoEntity produtoEntity;
	
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

	public ProdutoEntity getProdutoEntity() {
		return produtoEntity;
	}

	public void setProdutoEntity(ProdutoEntity produtoEntity) {
		this.produtoEntity = produtoEntity;
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
