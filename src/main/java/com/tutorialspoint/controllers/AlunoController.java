package com.tutorialspoint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorialspoint.models.Aluno;

@Controller
public class AlunoController {
	
	@Autowired
	@Qualifier("alunoValidator")
	private Validator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	public ModelAndView aluno() {
		return new ModelAndView("aluno","command",new Aluno());
	}
	
	@ModelAttribute("aluno")
	public Aluno criaAlunoModel() {
		return new Aluno();
	}
	
	@RequestMapping(value = "/addAluno", method = RequestMethod.POST)
	public String addAluno(@ModelAttribute("aluno") @Validated Aluno aluno, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "aluno";
		}
		model.addAttribute("nome", aluno.getNome());
		model.addAttribute("id", aluno.getId());
		model.addAttribute("idade", aluno.getIdade());
		return "resultado";
	}
}
