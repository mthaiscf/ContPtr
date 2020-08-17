package com.worktests.ContPtr.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import com.sun.istack.NotNull;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
@Table(name = "Patrimonio")
public class Patrimonio {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroDoTombo;
	
	@NotNull
	@NotBlank
	@PrimaryKeyJoinColumn(name="Usuario", referencedColumnName="nome")
	private String nome;
	
	@NotNull
    @PrimaryKeyJoinColumn(name="Marca", referencedColumnName="id")
	//private Long marcaId;
	private Long marca;
	
	private String descricao;
	
	
	
	protected Patrimonio() {};
	
	public Patrimonio(String nome, Long marca, String descricao) {
		this.nome = nome;
		this.marca = marca;
		this.descricao = descricao;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMarcaId() {
		return marca;
	}

	public void setMarcaId(Long marca) {
		this.marca = marca;
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
