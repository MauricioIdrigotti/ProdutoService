package br.com.magnasistemas.produtoservice.model;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class Atributos {
	
	@Nullable
	private String publicoAlvo;
	
	@NotNull(message = "A cor não pode ser nulo")
	private String cor;
	
	@NotNull(message = "O material não pode ser nulo")
	private String material;
	
	public Atributos(String publicoAlvo, @NotNull(message = "A cor não pode ser nulo") String cor,
			@NotNull(message = "O material não pode ser nulo") String material) {
		super();
		this.publicoAlvo = publicoAlvo;
		this.cor = cor;
		this.material = material;
	}

	public Atributos() {
	}

	public String getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
