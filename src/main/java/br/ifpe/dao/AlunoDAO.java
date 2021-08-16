package br.ifpe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifpe.models.Aluno;

public interface AlunoDAO extends JpaRepository<Aluno, Integer>{

}
