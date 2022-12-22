package br.com.magnasistemas.produtoservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Produto {

	private String nomeProduto;
	private String descricao;
	private String EAN;
	private String NCM;
	private String CEST;
	private String mensagemDeGarantia;
	private Integer mesesDeGarantia;
	private BigDecimal custoProduto;
	private BigDecimal preco_desconto;
	private LocalDateTime dataDeCadastro;
	private Atributos atributosDoProduto;
	private Fabricante fabricante;
	private Avaliacao avaliacao;
	private Categoria categoria;
	private Estoque estoque;
	private Imagem imagensDoProduto;
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

	public BigDecimal getPreco_desconto() {
		return preco_desconto;
	}

	public void setPreco_desconto(BigDecimal preco_desconto) {
		this.preco_desconto = preco_desconto;
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

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
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

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Imagem getImagensDoProduto() {
		return imagensDoProduto;
	}

	public void setImagensDoProduto(Imagem imagensDoProduto) {
		this.imagensDoProduto = imagensDoProduto;
	}

	public Dimensao getDimensaoDoProduto() {
		return dimensaoDoProduto;
	}

	public void setDimensaoDoProduto(Dimensao dimensaoDoProduto) {
		this.dimensaoDoProduto = dimensaoDoProduto;
	}
}
