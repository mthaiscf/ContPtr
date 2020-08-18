package com.worktests.ContPtr.entity;


import java.io.Serializable;


public class Autenticacao implements Serializable {
	
	private static final long serialVersionUID = -8091879091924046844L;
	private final String token;

	public Autenticacao(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}
}
