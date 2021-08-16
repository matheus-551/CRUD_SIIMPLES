package br.ifpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class AlunoController {
	
	@GetMapping("/")
	public String exibirHome() {
		return"Home";
	}
	
	@GetMapping("/CadastroAluno")
	public String exibirFormCadastro() {
		return"CadastroAluno";
	}
}
