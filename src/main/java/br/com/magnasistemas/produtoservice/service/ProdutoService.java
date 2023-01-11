package br.com.magnasistemas.produtoservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.magnasistemas.produtoservice.entity.AtributosEntity;
import br.com.magnasistemas.produtoservice.entity.AvaliacaoEntity;
import br.com.magnasistemas.produtoservice.entity.CategoriaEntity;
import br.com.magnasistemas.produtoservice.entity.DimensaoEntity;
import br.com.magnasistemas.produtoservice.entity.ProdutoEntity;
import br.com.magnasistemas.produtoservice.exception.NaoEncontrouException;
import br.com.magnasistemas.produtoservice.model.Atributos;
import br.com.magnasistemas.produtoservice.model.Avaliacao;
import br.com.magnasistemas.produtoservice.model.Categoria;
import br.com.magnasistemas.produtoservice.model.Dimensao;
import br.com.magnasistemas.produtoservice.model.Produto;
import br.com.magnasistemas.produtoservice.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public ProdutoEntity converterProdutoModelParaProdutoEntity(Produto produto) {
		ProdutoEntity produtoEntity = new ProdutoEntity();
		AtributosEntity atributosEntity = InstanciarAtributoEntity(produto);
		AvaliacaoEntity avaliacaoEntity = InstanciarAvaliacaoEntity(produto);
		DimensaoEntity dimensaoEntity = InstanciarDimensaoEntity(produto);
		CategoriaEntity categoriaEntity = InstanciarCategoriaEntity(produto);
		produtoEntity.setAtributosDoProduto(atributosEntity);
		produtoEntity.setAvaliacao(avaliacaoEntity);
		produtoEntity.setDimensaoDoProduto(dimensaoEntity);
		produtoEntity.setCategoria(categoriaEntity);
		produtoEntity.setCEST(produto.getCEST());
		produtoEntity.setCustoProduto(produto.getCustoProduto());
		produtoEntity.setDataDeCadastro(produto.getDataDeCadastro());
		produtoEntity.setDescricao(produto.getDescricao());
		produtoEntity.setEAN(produto.getEAN());
		produtoEntity.setMensagemDeGarantia(produto.getMensagemDeGarantia());
		produtoEntity.setMesesDeGarantia(produto.getMesesDeGarantia());
		produtoEntity.setNCM(produto.getNCM());
		produtoEntity.setNomeProduto(produto.getNomeProduto());
		produtoEntity.setPrecoDesconto(produto.getPrecoDesconto());
		produtoEntity.setImagensDoProduto(produto.getImagensDoProduto());
		return produtoEntity;
	}

	public Produto converterProdutoEntityParaProdutoModel(ProdutoEntity produto) {
		Produto produtoModel = new Produto();
		Atributos atributos = InstanciarAtributoModel(produto);
		Avaliacao avaliacao = InstanciarAvaliacaoModel(produto);
		Dimensao dimensao = InstanciarDimensaoModel(produto);
		Categoria categoria = InstanciarCategoriaModel(produto);
		produtoModel.setAtributosDoProduto(atributos);
		produtoModel.setAvaliacao(avaliacao);
		produtoModel.setDimensaoDoProduto(dimensao);
		produtoModel.setCategoria(categoria);
		produtoModel.setCEST(produto.getCEST());
		produtoModel.setCustoProduto(produto.getCustoProduto());
		produtoModel.setDataDeCadastro(produto.getDataDeCadastro());
		produtoModel.setDescricao(produto.getDescricao());
		produtoModel.setEAN(produto.getEAN());
		produtoModel.setMensagemDeGarantia(produto.getMensagemDeGarantia());
		produtoModel.setMesesDeGarantia(produto.getMesesDeGarantia());
		produtoModel.setNCM(produto.getNCM());
		produtoModel.setNomeProduto(produto.getNomeProduto());
		produtoModel.setPrecoDesconto(produto.getPrecoDesconto());
		produtoModel.setImagensDoProduto(produto.getImagensDoProduto());
		return produtoModel;
	}
	
	public Page<Produto> mostrarTodosOsProdutos(Pageable pageable) {
		return produtoRepository.findAll(pageable).map(this::converterProdutoEntityParaProdutoModel);
	}

	public Produto mostrarProdutoPorId(Long id) {
		Optional<ProdutoEntity> produto = Optional.of(produtoRepository.findById(id)
				.orElseThrow(() -> new NaoEncontrouException("Nenhum produto foi encontrado!")));
		ProdutoEntity produtoEntity = produto.get();
		return this.converterProdutoEntityParaProdutoModel(produtoEntity);
	}

	public String cadastrarProduto(Produto produto) {
		produtoRepository.save(converterProdutoModelParaProdutoEntity(produto));
		return "Produto criado com sucesso";
	}

	public String deletarProduto(Long id) {
		mostrarProdutoPorId(id);
		produtoRepository.deleteById(id);
		return "Produto deletado com sucesso!";
	}

	public String atualizarProduto(Long id, Produto produto) {
		Optional<ProdutoEntity> produtoEntity = Optional.of(produtoRepository.findById(id)
				.orElseThrow(() -> new NaoEncontrouException("Nenhum produto foi encontrado!")));
		ProdutoEntity entity = produtoEntity.get();
		entity.setNomeProduto(produto.getNomeProduto());
		entity.setDescricao(produto.getDescricao());
		entity.setEAN(produto.getEAN());
		entity.setNCM(produto.getNCM());
		entity.setCEST(produto.getCEST());
		entity.setMensagemDeGarantia(produto.getMensagemDeGarantia());
		entity.setMesesDeGarantia(produto.getMesesDeGarantia());
		entity.setCustoProduto(produto.getCustoProduto());
		entity.setPrecoDesconto(produto.getPrecoDesconto());
		entity.setDataDeCadastro(produto.getDataDeCadastro());
		ProdutoEntity atualizarProduto = produtoRepository.save(produtoEntity.get());
		converterProdutoEntityParaProdutoModel(atualizarProduto);
		return "Produto atualizado com sucesso!";
	}
	
	private AtributosEntity InstanciarAtributoEntity(Produto produto) {
		AtributosEntity atributosEntity = new AtributosEntity();
		atributosEntity.setCor(produto.getAtributosDoProduto().getCor());
		atributosEntity.setMaterial(produto.getAtributosDoProduto().getMaterial());
		atributosEntity.setPublicoAlvo(produto.getAtributosDoProduto().getPublicoAlvo());
		return atributosEntity;
	}

	private AvaliacaoEntity InstanciarAvaliacaoEntity(Produto produto) {
		AvaliacaoEntity avaliacaoEntity = new AvaliacaoEntity();
		avaliacaoEntity.setComentario(produto.getAvaliacao().getComentario());
		avaliacaoEntity.setValorAvaliacao(produto.getAvaliacao().getValorAvaliacao());
		return avaliacaoEntity;
	}

	private DimensaoEntity InstanciarDimensaoEntity(Produto produto) {
		DimensaoEntity dimensaoEntity = new DimensaoEntity();
		dimensaoEntity.setAlturaCm(produto.getDimensaoDoProduto().getAlturaCm());
		dimensaoEntity.setComprimentoCm(produto.getDimensaoDoProduto().getComprimentoCm());
		dimensaoEntity.setLarguraCm(produto.getDimensaoDoProduto().getLarguraCm());
		dimensaoEntity.setPesoKg(produto.getDimensaoDoProduto().getPesoKg());
		return dimensaoEntity;
	}

	private CategoriaEntity InstanciarCategoriaEntity(Produto produto) {
		CategoriaEntity categoriaEntity = new CategoriaEntity();
		categoriaEntity.setNomeCategoria(produto.getCategoria().getNomeCategoria());
		categoriaEntity.setSubCategoria(produto.getCategoria().getSubCategoria());
		return categoriaEntity;
	}
	
	private Categoria InstanciarCategoriaModel(ProdutoEntity produto) {
		Categoria categoria = new Categoria();
		categoria.setNomeCategoria(produto.getCategoria().getNomeCategoria());
		categoria.setSubCategoria(produto.getCategoria().getSubCategoria());
		return categoria;
	}

	private Dimensao InstanciarDimensaoModel(ProdutoEntity produto) {
		Dimensao dimensao = new Dimensao();
		dimensao.setAlturaCm(produto.getDimensaoDoProduto().getAlturaCm());
		dimensao.setComprimentoCm(produto.getDimensaoDoProduto().getComprimentoCm());
		dimensao.setLarguraCm(produto.getDimensaoDoProduto().getLarguraCm());
		dimensao.setPesoKg(produto.getDimensaoDoProduto().getPesoKg());
		return dimensao;
	}

	private Avaliacao InstanciarAvaliacaoModel(ProdutoEntity produto) {
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setComentario(produto.getAvaliacao().getComentario());
		avaliacao.setValorAvaliacao(produto.getAvaliacao().getValorAvaliacao());
		return avaliacao;
	}

	private Atributos InstanciarAtributoModel(ProdutoEntity produto) {
		Atributos atributos = new Atributos();
		atributos.setCor(produto.getAtributosDoProduto().getCor());
		atributos.setMaterial(produto.getAtributosDoProduto().getMaterial());
		atributos.setPublicoAlvo(produto.getAtributosDoProduto().getPublicoAlvo());
		return atributos;
	}
}
