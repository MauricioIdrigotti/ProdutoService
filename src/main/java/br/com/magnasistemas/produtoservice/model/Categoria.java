package br.com.magnasistemas.produtoservice.model;

import jakarta.validation.constraints.NotNull;

public class Categoria {

	@NotNull(message = "A categoria não pode ser nulo")
	private String nomeCategoria;

	@NotNull(message = "A sub-categoria não pode ser nulo")
	private String subCategoria;

	public Categoria(@NotNull(message = "A categoria não pode ser nulo") String nomeCategoria,
			@NotNull(message = "A sub-categoria não pode ser nulo") String subCategoria) {
		super();
		this.nomeCategoria = nomeCategoria;
		this.subCategoria = subCategoria;
	}

	public Categoria() {
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

}
