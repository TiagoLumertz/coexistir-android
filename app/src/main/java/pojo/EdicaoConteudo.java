package pojo;

import java.io.Serializable;
import java.util.Date;

public class EdicaoConteudo implements Serializable {	


	private int idEdConteudo;

	private Date data;

	private Admin admin;
	
	private Conteudo conteudo;

	public EdicaoConteudo() {
	}

	public int getIdEdConteudo() {
		return this.idEdConteudo;
	}

	public void setIdEdConteudo(int idEdConteudo) {
		this.idEdConteudo = idEdConteudo;
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

	public Conteudo getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

}