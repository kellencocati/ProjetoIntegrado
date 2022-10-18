package com.projetointegrado.sistemacontrolevacina.servicos.impl;

import com.projetointegrado.sistemacontrolevacina.entidades.Endereco;
import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import com.projetointegrado.sistemacontrolevacina.repository.CidadeRepository;
import com.projetointegrado.sistemacontrolevacina.repository.EnderecoRepository;
import com.projetointegrado.sistemacontrolevacina.repository.EstadoRepository;
import com.projetointegrado.sistemacontrolevacina.repository.PaisRepository;
import com.projetointegrado.sistemacontrolevacina.repository.PessoaRepository;
import com.projetointegrado.sistemacontrolevacina.servicos.EnderecoService;
import com.projetointegrado.sistemacontrolevacina.servicos.PessoaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository repository;
    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private PaisRepository paisRepository;

    @Override
    public void gravaEndereco(Endereco endereco) {
        paisRepository.save(endereco.getCidade().getEstado().getPais());
        estadoRepository.save(endereco.getCidade().getEstado());
        cidadeRepository.save(endereco.getCidade());
        repository.save(endereco);
    }

    @Override
    public List<Endereco> getListaEndereco() {
        return repository.findAll();
    }
}
