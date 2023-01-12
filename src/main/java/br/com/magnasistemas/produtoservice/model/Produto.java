package br.com.magnasistemas.produtoservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import br.com.magnasistemas.produtoservice.entity.ImagemEntity;
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
	private Set<ImagemEntity> imagensDoProduto;
	private Dimensao dimensaoDoProduto;

	public Produto(@NotNull(message = "O nome do produto não pode ser nulo") String nomeProduto,
			@NotNull(message = "A descrição não pode ser nula") String descricao,
			@NotNull(message = "O EAN não pode ser nulo") String eAN, String nCM, String cEST,
			String mensagemDeGarantia, Integer mesesDeGarantia,
			@NotNull(message = "O custo do produto não pode ser nulo") BigDecimal custoProduto,
			@NotNull(message = "O preço não pode ser nulo") BigDecimal precoDesconto,
			@NotNull(message = "A data não pode ser nula") LocalDateTime dataDeCadastro, Atributos atributosDoProduto,
			Avaliacao avaliacao, Categoria categoria, Set<ImagemEntity> imagensDoProduto, Dimensao dimensaoDoProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		EAN = eAN;
		NCM = nCM;
		CEST = cEST;
		this.mensagemDeGarantia = mensagemDeGarantia;
		this.mesesDeGarantia = mesesDeGarantia;
		this.custoProduto = custoProduto;
		this.precoDesconto = precoDesconto;
		this.dataDeCadastro = dataDeCadastro;
		this.atributosDoProduto = atributosDoProduto;
		this.avaliacao = avaliacao;
		this.categoria = categoria;
		this.imagensDoProduto = imagensDoProduto;
		this.dimensaoDoProduto = dimensaoDoProduto;
	}

	public Produto() {
	}

	public static class ProdutoBuilder {
		private String nomeProduto;
		private String descricao;
		private String EAN;
		private String NCM;
		private String CEST;
		private String mensagemDeGarantia;
		private Integer mesesDeGarantia;
		private BigDecimal custoProduto;
		private BigDecimal precoDesconto;
		private LocalDateTime dataDeCadastro;
		private Atributos atributosDoProduto;
		private Avaliacao avaliacao;
		private Categoria categoria;
		private Set<ImagemEntity> imagensDoProduto;
		private Dimensao dimensaoDoProduto;
		
		public ProdutoBuilder nomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
			return this;
		}
		
		public ProdutoBuilder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}
		
		public ProdutoBuilder EAN(String EAN) {
			this.EAN = EAN;
			return this;
		}
		
		public ProdutoBuilder NCM(String NCM) {
			this.NCM = NCM;
			return this;
		}
		
		public ProdutoBuilder CEST(String CEST) {
			this.CEST = CEST;
			return this;
		}
		
		public ProdutoBuilder mensagemDeGarantia(String mensagemDeGarantia) {
			this.mensagemDeGarantia = mensagemDeGarantia;
			return this;
		}
		
		public ProdutoBuilder mesesDeGarantia(Integer mesesDeGarantia) {
			this.mesesDeGarantia = mesesDeGarantia;
			return this;
		}
		
		public ProdutoBuilder custoProduto(BigDecimal custoProduto) {
			this.custoProduto = custoProduto;
			return this;
		}
		
		public ProdutoBuilder precoDesconto(BigDecimal precoDesconto) {
			this.precoDesconto = precoDesconto;
			return this;
		}
		
		public ProdutoBuilder atributosDoProduto(Atributos atributosDoProduto) {
			this.atributosDoProduto = atributosDoProduto;
			return this;
		}
		
		public ProdutoBuilder avaliacao(Avaliacao avaliacao) {
			this.avaliacao = avaliacao;
			return this;
		}
		
		public ProdutoBuilder dataDeCadastro(LocalDateTime dataDeCadastro) {
			this.dataDeCadastro = dataDeCadastro;
			return this;
		}
		
		public ProdutoBuilder categoria(Categoria categoria) {
			this.categoria = categoria;
			return this;
		}
		
		public ProdutoBuilder imagensDoProduto(Set<ImagemEntity> imagensDoProduto) {
			this.imagensDoProduto = imagensDoProduto;
			return this;
		}
		
		public ProdutoBuilder dimensaoDoProduto(Dimensao dimensaoDoProduto) {
			this.dimensaoDoProduto = dimensaoDoProduto;
			return this;
		}
		
		public Produto build() {
			return new Produto(nomeProduto, descricao, EAN, NCM, CEST, mensagemDeGarantia, mesesDeGarantia, custoProduto, precoDesconto, dataDeCadastro, atributosDoProduto, avaliacao, categoria, imagensDoProduto, dimensaoDoProduto); 
		}
	}

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

	public Set<ImagemEntity> getImagensDoProduto() {
		return imagensDoProduto;
	}

	public void setImagensDoProduto(Set<ImagemEntity> imagensDoProduto) {
		this.imagensDoProduto = imagensDoProduto;
	}

	public Dimensao getDimensaoDoProduto() {
		return dimensaoDoProduto;
	}

	public void setDimensaoDoProduto(Dimensao dimensaoDoProduto) {
		this.dimensaoDoProduto = dimensaoDoProduto;
	}
}
