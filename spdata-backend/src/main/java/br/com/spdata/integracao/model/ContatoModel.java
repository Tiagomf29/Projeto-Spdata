package br.com.spdata.integracao.model;

import java.time.OffsetDateTime;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.spdata.integracao.entity.ContatoAssunto;

public class ContatoModel {

	private int id;	
	@NotBlank
	@Size(max = 80)
	private String nome;
	@Email
	@NotBlank
	@Size(max = 80)
	private String email;
	@NotBlank
	@Size(max = 11)
	private String telefone;
	@NotBlank
	@Size(max = 100)
	private String nomeEmpresa;
	@NotBlank
	@Size(max = 100)
	private String cargo;
	@NotBlank
	@Size(max = 255)
	private String endereco;
	@Size(max = 100)
	private String estado;
	private OffsetDateTime datahora;
	@NotBlank
	private String mensagem;
	
	private List<ContatoAssunto> listaAssuntos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public OffsetDateTime getDatahora() {
		return datahora;
	}
	public void setDatahora(OffsetDateTime datahora) {
		this.datahora = datahora;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public List<ContatoAssunto> getListaAssuntos() {
		return listaAssuntos;
	}
	public void setListaAssuntos(List<ContatoAssunto> listaAssuntos) {
		this.listaAssuntos = listaAssuntos;
	}			
	
}
