package com.weslley.crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weslley.crud.model.Pessoa;
import com.weslley.crud.service.interface_service.PessoaInterfaceService;

@RestController
@RequestMapping
public class PessoaController {	
	
	@Autowired
	private PessoaInterfaceService pessoaInterfaceService;
	
	@GetMapping()
	public List<Pessoa> findAll() {
		return pessoaInterfaceService.findAll();
	}

	@PostMapping()
	public Pessoa save(Pessoa pessoa) {
		return pessoaInterfaceService.save(pessoa);
	}
	
}
