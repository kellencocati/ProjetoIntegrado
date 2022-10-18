package com.projetointegrado.sistemacontrolevacina.servicos;

import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;

import java.util.List;

public interface PessoaService {

    void gravaPessoa(Pessoa pessoa);
    List<Pessoa> getListaPessoa();

}
