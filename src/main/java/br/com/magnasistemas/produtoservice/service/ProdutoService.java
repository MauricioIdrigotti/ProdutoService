package br.com.magnasistemas.produtoservice.service;

import java.util.Vector;

import org.springframework.stereotype.Service;

import br.com.magnasistemas.produtoservice.model.Produto;

@Service
public class ProdutoService {

	public Vector<Produto> mostrarTodosOsProdutos() {
		return null;
	}

	public Produto mostrarProdutoPorId(Long id) {
		return null;
	}

	public String cadastrarProduto(Produto produto) {
		return "Produto cadastrado com sucesso!";
	}

	public String deletarProduto(Long id) {
		return "Produto deletado com sucesso!";
	}

	public String atualizarProduto(Long id, Produto produto) {
		return "Produto atualizado com sucesso!";
	}
}
