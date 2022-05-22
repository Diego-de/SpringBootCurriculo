package com.example.Model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "experiencia_table")
public class Experiencias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "instituicao_name", nullable = false)
	private String instituicao;
	
	@Column(name = "conhecimentos", nullable = false)
	private String conhecimento;

	
	public Experiencias() {
			
	}
	
	public Experiencias(int id, String instituicao, String conhecimento) {
		super();
		this.id = id;
		this.instituicao = instituicao;
		this.conhecimento = conhecimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(String conhecimento) {
		this.conhecimento = conhecimento;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Experiencias other = (Experiencias) obj;
		return id == other.id;
	}
	
	
	
	
	
}
