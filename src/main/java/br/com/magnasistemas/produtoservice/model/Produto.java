package br.com.magnasistemas.produtoservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class Produto {

	@NotNull(message = "O nome do produto não pode ser nulo")
	private String nomeProduto;
	
	@NotNull(message = "A descrição não pode ser nula")
	private String descricao;
	
	@NotNull(message = "O EAN não pode ser nulo")
	private String EAN;
	
	@Nullable
	private String NCM;
	
	@Nullable
	private String CEST;
	
	@Nullable
	private String mensagemDeGarantia;
	
	@Nullable
	private Integer mesesDeGarantia;
	
	@NotNull(message = "O custo do produto não pode ser nulo")
	private BigDecimal custoProduto;
	
	@NotNull(message = "O preço não pode ser nulo")
	private BigDecimal precoDesconto;
	
	@NotNull(message = "A data não pode ser nula")
	private LocalDateTime dataDeCadastro;
	
	private Atributos atributosDoProduto;
	private Avaliacao avaliacao;
	private Categoria categoria;
	private Set<Imagem> imagensDoProduto;
	private Dimensao dimensaoDoProduto;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEAN() {
		return EAN;
	}

	public void setEAN(String eAN) {
		EAN = eAN;
	}

	public String getNCM() {
		return NCM;
	}

	public void setNCM(String nCM) {
		NCM = nCM;
	}

	public String getCEST() {
		return CEST;
	}

	public void setCEST(String cEST) {
		CEST = cEST;
	}

	public String getMensagemDeGarantia() {
		return mensagemDeGarantia;
	}

	public void setMensagemDeGarantia(String mensagemDeGarantia) {
		this.mensagemDeGarantia = mensagemDeGarantia;
	}

	public Integer getMesesDeGarantia() {
		return mesesDeGarantia;
	}

	public void setMesesDeGarantia(Integer mesesDeGarantia) {
		this.mesesDeGarantia = mesesDeGarantia;
	}

	public BigDecimal getCustoProduto() {
		return custoProduto;
	}

	public void setCustoProduto(BigDecimal custoProduto) {
		this.custoProduto = custoProduto;
	}

	public BigDecimal getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(BigDecimal precoDesconto) {
		this.precoDesconto = precoDesconto;
	}

	public LocalDateTime getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public Atributos getAtributosDoProduto() {
		return atributosDoProduto;
	}

	public void setAtributosDoProduto(Atributos atributosDoProduto) {
		this.atributosDoProduto = atributosDoProduto;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<Imagem> getImagensDoProduto() {
		return imagensDoProduto;
	}

	public void setImagensDoProduto(Set<Imagem> imagensDoProduto) {
		this.imagensDoProduto = imagensDoProduto;
	}

	public Dimensao getDimensaoDoProduto() {
		return dimensaoDoProduto;
	}

	public void setDimensaoDoProduto(Dimensao dimensaoDoProduto) {
		this.dimensaoDoProduto = dimensaoDoProduto;
	}
}
