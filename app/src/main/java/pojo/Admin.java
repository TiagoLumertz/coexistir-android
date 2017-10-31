package pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Admin implements Serializable {	

	private int idAdmin;

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

	private List<EdicaoConteudo> edicaoConteudos;
	
	private List<ElevarAdmin> elevarAdmins;

	public Admin() {
	}

	public int getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
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

	public int getRg() {
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

	public List<EdicaoConteudo> getEdicaoconteudos() {
		return this.edicaoConteudos;
	}

	public void setEdicaoconteudos(List<EdicaoConteudo> edicaoConteudos) {
		this.edicaoConteudos = edicaoConteudos;
	}

	public EdicaoConteudo addEdicaoconteudo(EdicaoConteudo edicaoConteudo) {
		getEdicaoconteudos().add(edicaoConteudo);
		edicaoConteudo.setAdmin(this);
		return edicaoConteudo;
	}

	public EdicaoConteudo removeEdicaoconteudo(EdicaoConteudo edicaoConteudo) {
		getEdicaoconteudos().remove(edicaoConteudo);
		edicaoConteudo.setAdmin(null);
		return edicaoConteudo;
	}

	public List<ElevarAdmin> getElevaradmins() {
		return this.elevarAdmins;
	}

	public void setElevaradmins(List<ElevarAdmin> elevarAdmins) {
		this.elevarAdmins = elevarAdmins;
	}

	public ElevarAdmin addElevaradmin(ElevarAdmin elevarAdmin) {
		getElevaradmins().add(elevarAdmin);
		elevarAdmin.setAdmin(this);
		return elevarAdmin;
	}

	public ElevarAdmin removeElevaradmin(ElevarAdmin elevarAdmin) {
		getElevaradmins().remove(elevarAdmin);
		elevarAdmin.setAdmin(null);
		return elevarAdmin;
	}

}