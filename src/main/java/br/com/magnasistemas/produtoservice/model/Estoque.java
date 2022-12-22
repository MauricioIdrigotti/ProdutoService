package br.com.magnasistemas.produtoservice.model;

import java.time.LocalDateTime;

public class Estoque {
	
	private String lote;
	private Integer quantidadeDisponivel;
	private LocalDateTime dataRecebimento;
	private LocalDateTime dataUltimaMovimentacao;
	
	public String getLote() {
		return lote;
	}
	
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	
	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	public LocalDateTime getDataRecebimento() {
		return dataRecebimento;
	}
	
	public void setDataRecebimento(LocalDateTime dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	
	public LocalDateTime getDataUltimaMovimentacao() {
		return dataUltimaMovimentacao;
	}
	
	public void setDataUltimaMovimentacao(LocalDateTime dataUltimaMovimentacao) {
		this.dataUltimaMovimentacao = dataUltimaMovimentacao;
	}
}
