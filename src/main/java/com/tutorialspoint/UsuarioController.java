package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public ModelAndView usuario() {
		return new ModelAndView("usuario","command",new Usuario());
	}
	
	@RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	public String addUsuario(@ModelAttribute("SpringWeb") Usuario usuario, ModelMap modelMap) {
		modelMap.addAttribute("nome", usuario.getNome());
		modelMap.addAttribute("senha", usuario.getSenha());
		return "usuarios";
	}
	
}
