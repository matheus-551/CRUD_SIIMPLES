package br.ifpe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Nome;
	private String Email;
	private String Curso;
	
	public Aluno() {
		
	}
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer Id) {
		this.Id = Id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String Curso) {
		this.Curso = Curso;
	}

	@Override
	public String toString() {
		return "Aluno [Id=" + Id + ", Nome=" + Nome + ", Email=" + Email + ", Curso=" + Curso + "]";
	}
}
