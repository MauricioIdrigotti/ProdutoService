package br.com.magnasistemas.produtoservice.model;

import java.math.BigDecimal;

public class Dimensao {

	private BigDecimal comprimentoCm;
	private BigDecimal larguraCm;
	private BigDecimal alturaCm;
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
