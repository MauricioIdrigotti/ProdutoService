package br.com.magnasistemas.produtoservice.model;

public class Fabricante {

	private String cnpj;
	private Contato contatoFabricante;
	private Endereco enderecoFabricante;
	private String nomeEmpresaFabricante;

	public String getNomeEmpresaFabricante() {
		return nomeEmpresaFabricante;
	}

	public void setNomeEmpresaFabricante(String nomeEmpresaFabricante) {
		this.nomeEmpresaFabricante = nomeEmpresaFabricante;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEnderecoFabricante() {
		return enderecoFabricante;
	}

	public void setEnderecoFabricante(Endereco enderecoFabricante) {
		this.enderecoFabricante = enderecoFabricante;
	}

	public Contato getContatoFabricante() {
		return contatoFabricante;
	}

	public void setContatoFabricante(Contato contatoFabricante) {
		this.contatoFabricante = contatoFabricante;
	}

}
