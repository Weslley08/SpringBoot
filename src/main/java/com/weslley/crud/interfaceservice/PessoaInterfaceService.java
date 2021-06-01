package com.weslley.crud.interfaceservice;

import java.util.List;
import java.util.Optional;
import com.weslley.crud.model.Pessoa;

public interface PessoaInterfaceService {

	public List<Pessoa> listar();
	public Optional<Pessoa> listarPeloId(int Id);
	public int salvar(Pessoa p);
	public void apagar(int id);
	
}
