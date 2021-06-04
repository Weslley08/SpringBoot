package com.weslley.crud.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weslley.crud.interfaces.PessoaInterface;
import com.weslley.crud.interfaceservice.PessoaInterfaceService;
import com.weslley.crud.model.Pessoa;

@Service
public class PessoaService implements PessoaInterfaceService {

	@Autowired
	private PessoaInterface data;
	
	@Override
	public List<Pessoa> listar() {
		return (List<Pessoa>) data.findAll();
	}

	@Override
	public Optional<Pessoa> listarPeloId(int Id) {
		return null;
	}

	@Override
	public int salvar(Pessoa p) {
		return 0;
	}

	@Override
	public void apagar(int id) {
		
	}

}
