package br.com.magnasistemas.produtoservice.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_DIMENSAO")
public class DimensaoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private ProdutoEntity produto;
	
	private BigDecimal comprimentoCm;
	private BigDecimal larguraCm;
	private BigDecimal alturaCm;
	private BigDecimal pesoKg;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProdutoEntity getProduto() {
		return produto;
	}

	public void setProduto(ProdutoEntity produto) {
		this.produto = produto;
	}

	public BigDecimal getComprimentoCm() {
		return comprimentoCm;
	}

	public void setComprimentoCm(BigDecimal comprimentoCm) {
		this.comprimentoCm = comprimentoCm;
	}

	public BigDecimal getLarguraCm() {
		return larguraCm;
	}

	public void setLarguraCm(BigDecimal larguraCm) {
		this.larguraCm = larguraCm;
	}

	public BigDecimal getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(BigDecimal alturaCm) {
		this.alturaCm = alturaCm;
	}

	public BigDecimal getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(BigDecimal pesoKg) {
		this.pesoKg = pesoKg;
	}

}
