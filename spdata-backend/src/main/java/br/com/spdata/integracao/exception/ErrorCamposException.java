package br.com.spdata.integracao.exception;

public class ErrorCamposException {
	
	private String campo;
	private String error;
	
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
