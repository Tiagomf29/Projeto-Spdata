package br.com.spdata.integracao.exception;

import java.time.OffsetDateTime;
import java.util.List;

public class RetornoException {
	
	private Integer status;
	private String mensagem;
	private OffsetDateTime dataHoraErro;
	private List<ErrorCamposException>erros;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public OffsetDateTime getDataHoraErro() {
		return dataHoraErro;
	}
	public void setDataHoraErro(OffsetDateTime dataHoraErro) {
		this.dataHoraErro = dataHoraErro;
	}
	public List<ErrorCamposException> getErros() {
		return erros;
	}
	public void setErros(List<ErrorCamposException> erros) {
		this.erros = erros;
	}

	
	
}
