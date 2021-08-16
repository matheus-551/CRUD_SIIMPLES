package br.ifpe.models;

public class Aluno {
	
	private String Nome;
	private String Email;
	private String Curso;
	
	public Aluno() {
		
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
		return "Aluno [Nome=" + Nome + ", Email=" + Email + ", Curso=" + Curso + "]";
	}

}
