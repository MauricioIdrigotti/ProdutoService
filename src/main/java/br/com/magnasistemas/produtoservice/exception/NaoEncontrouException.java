package br.com.magnasistemas.produtoservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NaoEncontrouException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public NaoEncontrouException(String mensagem) {
		super(mensagem);
	}
}
