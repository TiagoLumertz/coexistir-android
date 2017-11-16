package pojo;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {

	private long idUsuario;
	private String apelido;
	private String cidade;
	private Date dataNasc;
	private String email;
	private String genero;
	private String nome;
	private String posReligiosa;
	private int rg;
	private String senha;
	private String uf;
	
	public Usuario() {}
	
	public Usuario(String apelido, String cidade, Date dataNasc, String email, String genero, String nome,
			String posReligiosa, int rg, String senha, String uf) {
	this.apelido = apelido;
	this.cidade = cidade;
	this.dataNasc = dataNasc;
	this.email = email;
	this.genero = genero;
	this.nome = nome;
	this.posReligiosa = posReligiosa;
	this.rg = rg;
	this.senha = senha;
	this.uf = uf;
	}

	public long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApelido() {
		return this.apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Date getDataNasc() {
		return this.dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosReligiosa() {
		return this.posReligiosa;
	}

	public void setPosReligiosa(String posReligiosa) {
		this.posReligiosa = posReligiosa;
	}

	public long getRg() {
		return this.rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}