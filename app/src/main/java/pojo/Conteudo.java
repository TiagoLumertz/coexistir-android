package pojo;

import java.io.Serializable;
import java.util.List;

public class Conteudo implements Serializable {


	private int idConteudo;

	private String descricao;

	private String nome;

	private List<EdicaoConteudo> edicaoConteudos;

	private List<Leitura> leituras;

	private List<Pergunta> perguntas;

	public Conteudo() {
	}

	public int getIdConteudo() {
		return this.idConteudo;
	}

	public void setIdConteudo(int idConteudo) {
		this.idConteudo = idConteudo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<EdicaoConteudo> getEdicaoconteudos() {
		return this.edicaoConteudos;
	}

	public void setEdicaoconteudos(List<EdicaoConteudo> edicaoConteudos) {
		this.edicaoConteudos = edicaoConteudos;
	}

	public EdicaoConteudo addEdicaoconteudo(EdicaoConteudo edicaoConteudo) {
		getEdicaoconteudos().add(edicaoConteudo);
		edicaoConteudo.setConteudo(this);

		return edicaoConteudo;
	}

	public EdicaoConteudo removeEdicaoconteudo(EdicaoConteudo edicaoConteudo) {
		getEdicaoconteudos().remove(edicaoConteudo);
		edicaoConteudo.setConteudo(null);

		return edicaoConteudo;
	}

	public List<Leitura> getLeituras() {
		return this.leituras;
	}

	public void setLeituras(List<Leitura> leituras) {
		this.leituras = leituras;
	}

	public Leitura addLeitura(Leitura leitura) {
		getLeituras().add(leitura);
		leitura.setConteudo(this);

		return leitura;
	}

	public Leitura removeLeitura(Leitura leitura) {
		getLeituras().remove(leitura);
		leitura.setConteudo(null);

		return leitura;
	}

	public List<Pergunta> getPerguntas() {
		return this.perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public Pergunta addPergunta(Pergunta pergunta) {
		getPerguntas().add(pergunta);
		pergunta.setConteudo(this);

		return pergunta;
	}

	public Pergunta removePergunta(Pergunta pergunta) {
		getPerguntas().remove(pergunta);
		pergunta.setConteudo(null);

		return pergunta;
	}

}