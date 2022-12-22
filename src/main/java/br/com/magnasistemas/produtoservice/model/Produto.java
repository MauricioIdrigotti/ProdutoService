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
	private Fabricante fabricante;
	private Avaliacao avaliacao;
	private Categoria categoria;
	private Estoque estoque;
	private Imagem imagensDoProduto;
	private Dimensao dimensaoDoProduto;
}
