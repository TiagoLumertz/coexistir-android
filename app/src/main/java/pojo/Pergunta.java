package pojo;

import java.io.Serializable;

public class Pergunta implements Serializable {

	private int idPerguntas;

	private String descricao;
	
	private Conteudo conteudo;

	public Pergunta() {
	}

	public int getIdPerguntas() {
		return this.idPerguntas;
	}

	public void setIdPerguntas(int idPerguntas) {
		this.idPerguntas = idPerguntas;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Conteudo getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

}