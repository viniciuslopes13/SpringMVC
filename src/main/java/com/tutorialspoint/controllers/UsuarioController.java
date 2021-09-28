package com.tutorialspoint.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorialspoint.models.Usuario;

@Controller
public class UsuarioController {

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public ModelAndView usuario() {
		Usuario usuario = new Usuario();
		usuario.setFrameworkFavorito(new String[] { "Spring MVC", "Struts 2" });
		usuario.setGenero("M");
		usuario.setNumeroFavorito("2");
		return new ModelAndView("usuario", "command", usuario);
	}

	@RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	public String addUsuario(@ModelAttribute("SpringWeb") Usuario usuario, ModelMap modelMap) {
		modelMap.addAttribute("nome", usuario.getNome());
		modelMap.addAttribute("senha", usuario.getSenha());
		modelMap.addAttribute("endereco", usuario.getEndereco());
		modelMap.addAttribute("receberNoticias", usuario.isReceberNoticias());
		modelMap.addAttribute("frameworkFavorito", usuario.getFrameworkFavorito());
		modelMap.addAttribute("genero", usuario.getGenero());
		modelMap.addAttribute("numeroFavorito", usuario.getNumeroFavorito());
		modelMap.addAttribute("pais", usuario.getPais());
		modelMap.addAttribute("habilidades", usuario.getHabilidades());
		return "usuarios";
	}

	@ModelAttribute("listaFrameworksWeb")
	public List<String> getListaFrameworksWeb() {
		List<String> list = new ArrayList<String>();
		list.add("Spring MVC");
		list.add("Struts 1");
		list.add("Struts 2");
		list.add("Apache Wicket");
		return list;
	}

	@ModelAttribute("listaNumeros")
	public List<String> getListaNumeros() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		return list;
	}

	@ModelAttribute("listaPaises")
	public Map<String, String> getListaPais() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("BR", "Brasil");
		map.put("CH", "China");
		map.put("EUA", "Estados Unidos");
		map.put("AR", "Argentina");
		map.put("AL", "Alemanha");
		return map;
	}

	@ModelAttribute("listaHabilidades")
	public Map<String, String> getListaHabilidades() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Hibernate", "Hibernate");
		map.put("Spring", "Spring");
		map.put("Apache Wicket", "Apache Wicket");
		map.put("Struts", "Struts");
		return map;
	}
}
