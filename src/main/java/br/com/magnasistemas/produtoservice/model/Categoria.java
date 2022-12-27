package br.com.magnasistemas.produtoservice.model;

import java.util.Set;

import jakarta.validation.constraints.NotNull;

public class Categoria {

	@NotNull(message = "A categoria não pode ser nulo")
	private String nomeCategoria;
	
	@NotNull(message = "A sub-categoria não pode ser nulo")
	private String subCategoria;
	
	private Set<Produto> produtosDaCategoria;
	
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
	
	public Set<Produto> getProdutosDaCategoria() {
		return produtosDaCategoria;
	}
	
	public void setProdutosDaCategoria(Set<Produto> produtosDaCategoria) {
		this.produtosDaCategoria = produtosDaCategoria;
	}
}
