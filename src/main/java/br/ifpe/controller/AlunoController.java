package br.ifpe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifpe.dao.AlunoDAO;
import br.ifpe.models.Aluno;

@Controller	
public class AlunoController {
	
	@Autowired
	private AlunoDAO alunodao;
	
	@GetMapping("/")
	public String exibirHome() {
		return"Home";
	}
	
	@GetMapping("/CadastroAluno")
	public String exibirFormCadastro(Integer id, Model model) {
		if(id != null) {
			Aluno aluno = this.alunodao.getById(id);
			model.addAttribute("aluno", aluno);
		}else {
			model.addAttribute("aluno", new Aluno());
		}
		
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
	
	@GetMapping("/excluirAluno")
	public String excluirAluno(Integer id) {
		this.alunodao.deleteById(id);
		return"redirect:/";
	}
}
