package pojo;

import java.io.Serializable;
import java.util.Date;

public class ElevarAdmin implements Serializable {	

	private int idElevAdmin;
	
	private Date data;

	private Admin admin;

	private Usuario usuario;

	public ElevarAdmin() {
	}

	public int getIdElevAdmin() {
		return this.idElevAdmin;
	}

	public void setIdElevAdmin(int idElevAdmin) {
		this.idElevAdmin = idElevAdmin;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}