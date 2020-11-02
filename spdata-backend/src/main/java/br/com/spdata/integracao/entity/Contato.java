package br.com.spdata.integracao.entity;

import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_contato")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private String nome;
	private String email;
	private String telefone;
	@Column(name = "nome_empresa")
	private String nomeEmpresa;
	private String cargo;
	private String endereco;
	private String estado;
	@Column(name = "data_hora")
	private OffsetDateTime datahora;
	private String mensagem;
	
	@OneToMany(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_contato",insertable = false, updatable = false)
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
