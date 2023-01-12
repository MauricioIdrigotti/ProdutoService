package br.com.magnasistemas.produtoservice.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public class Dimensao {
	
	@NotNull(message = "O comprimento não pode ser nulo")
	private BigDecimal comprimentoCm;
	
	@NotNull(message = "A largura não pode ser nula")
	private BigDecimal larguraCm;
	
	@NotNull(message = "A altura não pode ser nula")
	private BigDecimal alturaCm;
	
	@NotNull(message = "O peso não pode ser nulo")
	private BigDecimal pesoKg;

	public Dimensao(@NotNull(message = "O comprimento não pode ser nulo") BigDecimal comprimentoCm,
			@NotNull(message = "A largura não pode ser nula") BigDecimal larguraCm,
			@NotNull(message = "A altura não pode ser nula") BigDecimal alturaCm,
			@NotNull(message = "O peso não pode ser nulo") BigDecimal pesoKg) {
		super();
		this.comprimentoCm = comprimentoCm;
		this.larguraCm = larguraCm;
		this.alturaCm = alturaCm;
		this.pesoKg = pesoKg;
	}
	
	public Dimensao() {
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
