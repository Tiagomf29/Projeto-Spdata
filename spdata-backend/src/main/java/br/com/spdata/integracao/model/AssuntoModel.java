package br.com.spdata.integracao.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AssuntoModel {

	private int id;
	@NotBlank
	@Size(max = 80)
	private String descricao;
	
	@Size(max = 2)
	private String ativo;
	
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
