package com.projetointegrado.sistemacontrolevacina.servicos;

import com.projetointegrado.sistemacontrolevacina.entidades.Endereco;
import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import java.util.List;

public interface EnderecoService {

    void gravaEndereco(Endereco endereco);
    List<Endereco> getListaEndereco();

}
