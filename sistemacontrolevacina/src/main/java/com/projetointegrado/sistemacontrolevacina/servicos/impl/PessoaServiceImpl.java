package com.projetointegrado.sistemacontrolevacina.servicos.impl;

import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import com.projetointegrado.sistemacontrolevacina.repository.PessoaRepository;
import com.projetointegrado.sistemacontrolevacina.servicos.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository repository;

    @Override
    public void gravaPessoa(Pessoa pessoa) {
        repository.save(pessoa);
    }

    @Override
    public List<Pessoa> getListaPessoa() {
        return repository.findAll();
    }

}
