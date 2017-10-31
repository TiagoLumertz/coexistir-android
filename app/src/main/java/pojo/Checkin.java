package pojo;

import java.io.Serializable;
import java.util.Date;

public class Checkin implements Serializable {

	private int idCheckIn;
	
	private Date data;

	private int idEvento;

	private Centro centro;

	private Usuario usuario;

	public Checkin() {
	}

	public int getIdCheckIn() {
		return this.idCheckIn;
	}

	public void setIdCheckIn(int idCheckIn) {
		this.idCheckIn = idCheckIn;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public Centro getCentro() {
		return this.centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}