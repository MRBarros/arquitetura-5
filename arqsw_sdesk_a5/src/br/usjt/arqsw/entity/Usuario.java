package br.usjt.arqsw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 @Autora Marina Barros - RA 816155372
 
 */


@Entity
public class Usuario{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@NotNull (message="usuario nao pode ser vazio")
	@Size(min=5, max=50, message="usuario minimo 5 caracter, maximo 50!")
	@Column(name="usarname")
	private String username;
	
	@NotNull (message="Senha nao pode ser vazia!")
	@Size(min=8, max=20, message="Senha minimo 8 maximo 20!")
	@Column(name="password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
