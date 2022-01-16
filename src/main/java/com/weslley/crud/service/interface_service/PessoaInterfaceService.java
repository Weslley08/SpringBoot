package com.weslley.crud.service.interface_service;

import java.util.List;
import com.weslley.crud.model.Pessoa;

public interface PessoaInterfaceService {

	public List<Pessoa> findAll();
	public Pessoa save(Pessoa pessoa);
	public void update(String cpf);
	public void delete(Long id);
	
}
