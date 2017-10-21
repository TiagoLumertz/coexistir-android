package pojo;

import java.io.Serializable;

public class Avaliacao implements Serializable {	


	private int idAvaliacao;

	private String comentarioAvaliativo;

	private String sugestao;

	private Usuario usuario;

	public Avaliacao() {
	}

	public int getIdAvaliacao() {
		return this.idAvaliacao;
	}

	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public String getcomentarioAvaliativo() {
		return this.comentarioAvaliativo;
	}

	public void setcomentarioAvaliativo(String comentarioAvaliativo) {
		this.comentarioAvaliativo = comentarioAvaliativo;
	}

	public String getSugestao() {
		return this.sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}