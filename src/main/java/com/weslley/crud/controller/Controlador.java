package com.weslley.crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weslley.crud.interfaceservice.PessoaInterfaceService;
import com.weslley.crud.model.Pessoa;

@Controller
@RequestMapping
public class Controlador {	
	
	@Autowired
	private PessoaInterfaceService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Pessoa> pessoas = service.listar();
		model.addAttribute("pessoas", pessoas);	
		
		return "index";
		
	}
	
}
