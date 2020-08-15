package com.worktests.ContPtr.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@Table(name = "Patrimonio")
public class Patrimonio {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numeroDoTombo")
	private Long numeroDoTombo;
	
	@NotNull
	@NotBlank
	@PrimaryKeyJoinColumn(name = "Usuario", referencedColumnName="nome")
	private String nome;
	
	@NotNull
    @PrimaryKeyJoinColumn(name = "Marca", referencedColumnName="id")
	private Long marcaId;
	
	@Column(name = "descricao")
	private String descricao;
	
	
	
	protected Patrimonio() {};
	
	public Patrimonio(String nome, Long marcaId, String descricao) {
		this.nome = nome;
		this.marcaId = marcaId;
		this.descricao = descricao;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getNumeroDoTombo() {
		return numeroDoTombo;
	}

}
