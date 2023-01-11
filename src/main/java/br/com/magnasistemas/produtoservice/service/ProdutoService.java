package br.com.magnasistemas.produtoservice.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
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
import br.com.magnasistemas.produtoservice.model.Produto;
import br.com.magnasistemas.produtoservice.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public ProdutoEntity converterProdutoModelParaProdutoEntity(Produto produto) {
		ProdutoEntity produtoEntity = new ProdutoEntity();
		AtributosEntity atributosEntity = new AtributosEntity();
		atributosEntity.setCor(produto.getAtributosDoProduto().getCor());
		atributosEntity.setMaterial(produto.getAtributosDoProduto().getMaterial());
		atributosEntity.setPublicoAlvo(produto.getAtributosDoProduto().getPublicoAlvo());
		AvaliacaoEntity avaliacaoEntity = new AvaliacaoEntity();
		avaliacaoEntity.setComentario(produto.getAvaliacao().getComentario());
		avaliacaoEntity.setValorAvaliacao(produto.getAvaliacao().getValorAvaliacao());
		DimensaoEntity dimensaoEntity = new DimensaoEntity();
		dimensaoEntity.setAlturaCm(produto.getDimensaoDoProduto().getAlturaCm());
		dimensaoEntity.setComprimentoCm(produto.getDimensaoDoProduto().getComprimentoCm());
		dimensaoEntity.setLarguraCm(produto.getDimensaoDoProduto().getLarguraCm());
		dimensaoEntity.setPesoKg(produto.getDimensaoDoProduto().getPesoKg());
		CategoriaEntity categoriaEntity = new CategoriaEntity();
		categoriaEntity.setNomeCategoria(produto.getCategoria().getNomeCategoria());
		categoriaEntity.setSubCategoria(produto.getCategoria().getSubCategoria());
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
		Produto produtoVo = new Produto();
		BeanUtils.copyProperties(produto, produtoVo);
		return produtoVo;
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
}
