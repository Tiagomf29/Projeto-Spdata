package br.com.spdata.integracao.exception;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiException extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		List<ErrorCamposException> errosCampos = new ArrayList<ErrorCamposException>();
		
		for(ObjectError error : ex.getBindingResult().getAllErrors()) {
			
			ErrorCamposException ece = new ErrorCamposException();
			ece.setCampo(((FieldError)error).getField());
			ece.setError(error.getDefaultMessage());
			errosCampos.add(ece);			
		}
		
		RetornoException retornoException = new RetornoException();
		retornoException.setStatus(status.value());
		retornoException.setMensagem("Um ou mais campos estão com valóres inválidos!");
		retornoException.setDataHoraErro(OffsetDateTime.now());
		retornoException.setErros(errosCampos);
		
		return super.handleExceptionInternal(ex, retornoException, headers, status, request);
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		RetornoException retornoException = new RetornoException();
		retornoException.setStatus(status.value());
		retornoException.setMensagem("Um ou mais campos da mensagem não está legível. Verifique");
		retornoException.setDataHoraErro(OffsetDateTime.now());
				
		return super.handleExceptionInternal(ex, retornoException, headers, status, request);
	}

}
