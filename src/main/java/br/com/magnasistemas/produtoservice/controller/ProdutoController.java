package br.com.magnasistemas.produtoservice.controller;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magnasistemas.produtoservice.model.Produto;
import br.com.magnasistemas.produtoservice.service.ProdutoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<Vector<Produto>> readAll() {
		return ResponseEntity.status(HttpStatus.OK).body(produtoService.mostrarTodosOsProdutos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> readById(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(produtoService.mostrarProdutoPorId(id));
	}

	@PostMapping
	public ResponseEntity<String> create(@RequestBody @Valid Produto produto) {
		produtoService.cadastrarProduto(produto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		produtoService.deletarProduto(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable Long id, @RequestBody @Valid Produto produto) {
		produtoService.atualizarProduto(id, produto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
