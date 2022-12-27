package br.com.magnasistemas.produtoservice.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class ProdutoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_produto")
	private String nomeProduto;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "ean")
	private String EAN;
	
	@Column(name = "ncm")
	private String NCM;
	
	@Column(name = "cest")
	private String CEST;
	
	@Column(name = "mensagem_garantia")
	private String mensagemDeGarantia;
	
	@Column(name = "meses_garantia")
	private Integer mesesDeGarantia;
	
	@Column(name = "custo_produto")
	private BigDecimal custoProduto;
	
	@Column(name = "preco_desconto")
	private BigDecimal precoDesconto;
	
	@Column(name = "data_cadastro")
	private LocalDateTime dataDeCadastro;

	@OneToOne
	private AtributosEntity atributosDoProduto;

	@OneToOne
	private AvaliacaoEntity avaliacao;

	@ManyToOne(fetch = FetchType.LAZY)
	private CategoriaEntity categoriaEntity;

	@OneToMany(mappedBy = "produtoEntity", cascade = CascadeType.ALL)
	private Set<ImagemEntity> imagensDoProduto;

	@OneToOne
	private DimensaoEntity dimensaoDoProduto;

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

	public AtributosEntity getAtributosDoProduto() {
		return atributosDoProduto;
	}

	public void setAtributosDoProduto(AtributosEntity atributosDoProduto) {
		this.atributosDoProduto = atributosDoProduto;
	}

	public AvaliacaoEntity getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(AvaliacaoEntity avaliacao) {
		this.avaliacao = avaliacao;
	}

	public CategoriaEntity getCategoriaEntity() {
		return categoriaEntity;
	}

	public void setCategoriaEntity(CategoriaEntity categoriaEntity) {
		this.categoriaEntity = categoriaEntity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<ImagemEntity> getImagensDoProduto() {
		return imagensDoProduto;
	}

	public void setImagensDoProduto(Set<ImagemEntity> imagensDoProduto) {
		this.imagensDoProduto = imagensDoProduto;
	}

	public DimensaoEntity getDimensaoDoProduto() {
		return dimensaoDoProduto;
	}

	public void setDimensaoDoProduto(DimensaoEntity dimensaoDoProduto) {
		this.dimensaoDoProduto = dimensaoDoProduto;
	}
}
