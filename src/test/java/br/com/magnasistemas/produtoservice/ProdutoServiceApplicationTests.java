package br.com.magnasistemas.produtoservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.magnasistemas.produtoservice.model.Atributos;
import br.com.magnasistemas.produtoservice.model.Avaliacao;
import br.com.magnasistemas.produtoservice.model.Categoria;
import br.com.magnasistemas.produtoservice.model.Dimensao;
import br.com.magnasistemas.produtoservice.model.Produto;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProdutoServiceApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("Esse teste garante o retorno de uma lista com todos os produtos cadastrados e a verificação de retorno do status HTTP 200 (OK)")
	void buscarTodosOsProdutosExistentes()  {
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto", HttpMethod.GET, null, Produto.class);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	@DisplayName("Esse teste garante o retorno de um produto cadastrado de acordo com o seu ID passado na URL e a verificação de retorno do status HTTP 200 (OK)")
	void buscarProdutoPeloID() {
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto/2", HttpMethod.GET, null, Produto.class);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());				
	}
	
	@Test
	@DisplayName("Esse teste demonstra uma falha na aplicação ao tentar buscar um produto e passar um ID incorreto na URL e a verificação de retorno do status HTTP 400 (BAD REQUEST)")
	void erroAoBuscarProdutoPeloIDPoisIdEhInvalido() {
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto/d", HttpMethod.GET, null, Produto.class);
		assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());				
	}

	@Test
	@DisplayName("Esse teste garante o cadastro de um produto e a verificação de retorno do status HTTP 201 (CREATED)")
	void cadastrarProduto() {
		Produto build = new Produto.ProdutoBuilder()
				.CEST("123456")
				.custoProduto(new BigDecimal(75.0))
				.dataDeCadastro(LocalDateTime.now())
				.descricao("123456")
				.EAN("123456")
				.mesesDeGarantia(25)
				.mensagemDeGarantia("123456")
				.NCM("123456")
				.precoDesconto(new BigDecimal(75.0))
				.nomeProduto("123456")
				.atributosDoProduto(new Atributos("Infantil", "vermelho", "plástico"))
				.avaliacao(new Avaliacao(4, "Bom"))
				.categoria(new Categoria("Brinquedos", "Carrinhos"))
				.dimensaoDoProduto(new Dimensao(new BigDecimal(75.0), new BigDecimal(75.0), new BigDecimal(75.0), new BigDecimal(75.0)))
				.imagensDoProduto(null)
				.build();
		HttpEntity<Produto> entity = new HttpEntity<Produto>(build);
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto", HttpMethod.POST, entity, Produto.class);
		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
	}
	
	@Test
	@DisplayName("Esse teste demonstra uma falha na aplicação ao tentar cadastrar um produto sem passar informações no corpo da requisição e a verificação de retorno do status HTTP 415 (UNSUPPORTED MEDIA TYPE)")
	void erroAoCadastrarProdutoPoisEhNecessarioPreencherOsAtributos() {
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto", HttpMethod.POST, null, Produto.class);
		assertEquals(HttpStatus.UNSUPPORTED_MEDIA_TYPE, responseEntity.getStatusCode());		
	}
	
	@Test
	@DisplayName("Esse teste garante a atualização de um produto de acordo com o seu ID passado na URL e a verificação de retorno do status HTTP 201 (CREATED)")
	void atualizarProduto() {
		Produto build = new Produto.ProdutoBuilder()
				.CEST("123456")
				.custoProduto(new BigDecimal(75.0))
				.dataDeCadastro(LocalDateTime.now())
				.descricao("123456")
				.EAN("123456")
				.mesesDeGarantia(25)
				.mensagemDeGarantia("123456")
				.NCM("123456")
				.precoDesconto(new BigDecimal(75.0))
				.nomeProduto("123456")
				.atributosDoProduto(new Atributos("Infantil", "vermelho", "plástico"))
				.avaliacao(new Avaliacao(4, "Bom"))
				.categoria(new Categoria("Brinquedos", "Carrinhos"))
				.dimensaoDoProduto(new Dimensao(new BigDecimal(75.0), new BigDecimal(75.0), new BigDecimal(75.0), new BigDecimal(75.0)))
				.imagensDoProduto(null)
				.build();
		HttpEntity<Produto> entity = new HttpEntity<Produto>(build);
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto/2", HttpMethod.PUT, entity, Produto.class);
		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
	}
	
	@Test
	@DisplayName("Esse teste demonstra uma falha na aplicação ao tentar atualizar um produto sem passar informações no corpo da requisição e a verificação de retorno do status HTTP 400 (BAD REQUEST)")
	void erroAoAtualizarOProdutoPoisEhNecessarioPreencherOsAtributos() {
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto/1", HttpMethod.PUT, null, Produto.class);
		assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());		
	}

	@Test
	@DisplayName("Esse teste garante a exclusão de um produto de acordo com o seu ID passado na URL e a verificação de retorno do status HTTP 204 (NO CONTENT)")
	void deletarProduto() {
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto/14", HttpMethod.DELETE, null, Produto.class);
		assertEquals(HttpStatus.NO_CONTENT, responseEntity.getStatusCode());
	}
	
	@Test
	@DisplayName("Esse teste demonstra uma falha na aplicação ao tentar deletar um produto e passar um ID incorreto na URL e a verificação de retorno do status HTTP 400 (BAD REQUEST)")
	void erroAoDeletarProdutoPoisOIdEhInvalido() {
		ResponseEntity<Produto> responseEntity = restTemplate.exchange("/produto/j", HttpMethod.DELETE, null, Produto.class);
		assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
	}
}
