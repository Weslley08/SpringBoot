package com.weslley.crud.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.weslley.crud.repository.PessoaRepository;
import com.weslley.crud.service.interface_service.PessoaInterfaceService;
import com.weslley.crud.model.Pessoa;

@Service
public class PessoaService implements PessoaInterfaceService {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	@Transactional
	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	@Override
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Override
	public void update(String cpf) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(@PathVariable Long id) {
		pessoaRepository.deleteById(id);
	}

}
