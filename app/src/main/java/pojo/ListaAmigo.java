package pojo;

import java.io.Serializable;

public class ListaAmigo implements Serializable {	


	private int idListaAmigos;

	private int idAmigo;

	private Usuario usuario;

	public ListaAmigo() {
	}

	public int getIdListaAmigos() {
		return this.idListaAmigos;
	}

	public void setIdListaAmigos(int idListaAmigos) {
		this.idListaAmigos = idListaAmigos;
	}

	public int getIdAmigo() {
		return this.idAmigo;
	}

	public void setIdAmigo(int idAmigo) {
		this.idAmigo = idAmigo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}