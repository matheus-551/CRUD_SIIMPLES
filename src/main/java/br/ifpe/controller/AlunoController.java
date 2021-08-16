package br.ifpe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.dao.AlunoDAO;
import br.ifpe.models.Aluno;

@Controller	
public class AlunoController {
	
	//private List<Aluno>Alunos = new ArrayList<Aluno>();
	@Autowired
	private AlunoDAO alunodao;
	
	@GetMapping("/")
	public String exibirHome() {
		return"Home";
	}
	
	@GetMapping("/CadastroAluno")
	public String exibirFormCadastro() {
		return"CadastroAluno";
	}
	
	@PostMapping("/EnviaForm")
	public String EnviaForm(Aluno aluno) {
		this.alunodao.save(aluno);
		System.out.println(aluno);
		return"redirect:/";
	}
	
	@ModelAttribute("ListaAluno")
	public List<Aluno> getList() {
		return this.alunodao.findAll();
	}
}
