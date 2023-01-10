package br.com.magnasistemas.produtoservice.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DimensaoEntity {
	
	@Column(name = "comprimento_produto")
	private BigDecimal comprimentoCm;
	
	@Column(name = "largura_produto")
	private BigDecimal larguraCm;
	
	@Column(name = "altura_produto")
	private BigDecimal alturaCm;
	
	@Column(name = "peso_produto")
	private BigDecimal pesoKg;

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
