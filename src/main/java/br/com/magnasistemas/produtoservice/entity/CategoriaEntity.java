package br.com.magnasistemas.produtoservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CATEGORIA")
public class CategoriaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_categoria")
	private String nomeCategoria;
	
	@Column(name = "nome_subcategoria")
	private String subCategoria;

//	@OneToMany(mappedBy = "categoriaEntity", cascade = CascadeType.PERSIST)
//	private Set<ProdutoEntity> produtosDaCategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

//	public Set<ProdutoEntity> getProdutosDaCategoria() {
//		return produtosDaCategoria;
//	}
//
//	public void setProdutosDaCategoria(Set<ProdutoEntity> produtosDaCategoria) {
//		this.produtosDaCategoria = produtosDaCategoria;
//	}
}
