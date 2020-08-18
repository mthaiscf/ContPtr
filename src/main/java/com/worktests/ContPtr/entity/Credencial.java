package com.worktests.ContPtr.entity;

import java.io.Serializable;


public class Credencial implements Serializable {
	
	private static final long serialVersionUID = -8091879091924046844L;
	
	private String usuario;
	private String senha;

	public Credencial() {}

	public Credencial(String usuario, String senha) {  
		this.setUsuario(usuario);
		this.setSenha(senha);
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
