package com.weslley.crud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weslley.crud.model.Pessoa;

@Repository
public interface PessoaInterface extends CrudRepository<Pessoa, Integer> {

}
