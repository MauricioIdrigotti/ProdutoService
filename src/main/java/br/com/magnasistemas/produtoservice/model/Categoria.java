package br.com.magnasistemas.produtoservice.model;

import java.util.Set;

public class Categoria {

	private String nomeCategoria;
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
