package pojo;

import java.io.Serializable;
import java.util.Date;

public class Leitura implements Serializable {	

	private int idLeitura;

	private Date data;
	
	private Conteudo conteudo;

	private Usuario usuario;

	public Leitura() {
	}

	public int getIdLeitura() {
		return this.idLeitura;
	}

	public void setIdLeitura(int idLeitura) {
		this.idLeitura = idLeitura;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Conteudo getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}