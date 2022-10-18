package com.projetointegrado.sistemacontrolevacina.servicos.impl;

import com.projetointegrado.sistemacontrolevacina.entidades.Cidade;
import com.projetointegrado.sistemacontrolevacina.entidades.Endereco;
import com.projetointegrado.sistemacontrolevacina.entidades.Estado;
import com.projetointegrado.sistemacontrolevacina.entidades.Pais;
import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import com.projetointegrado.sistemacontrolevacina.repository.CidadeRepository;
import com.projetointegrado.sistemacontrolevacina.repository.EnderecoRepository;
import com.projetointegrado.sistemacontrolevacina.repository.EstadoRepository;
import com.projetointegrado.sistemacontrolevacina.repository.PaisRepository;
import com.projetointegrado.sistemacontrolevacina.repository.PessoaRepository;
import com.projetointegrado.sistemacontrolevacina.servicos.DBServer;
import java.time.LocalDate;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServerImpl implements DBServer {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private PaisRepository paisRepository;


    @Override
    public void insereDadosIniciais() {
        Pessoa pessoa1 = getPessoa(
                1L,
                "Testes",
                LocalDate.now(),
                "final String cidadeNatal",
                getEndereco(),
                1,
                "final String complementoEndereco",
                "final String sexo",
                "final String cpf",
                LocalDate.of(1987, 02, 16),
                "final String telefoneResidencial",
                "final String telefoneCelular",
                "final String documento",
                "final String tipoDocumento",
                "final String senhaAcesso",
                "final String email"
        );
        paisRepository.saveAll(Arrays.asList(getPais()));
        estadoRepository.saveAll(Arrays.asList(getEstado()));
        cidadeRepository.saveAll(Arrays.asList(getCidade()));
        enderecoRepository.saveAll(Arrays.asList(getEndereco()));
        pessoaRepository.saveAll(Arrays.asList(pessoa1));
    }

    private static Pessoa getPessoa(
            final Long codigoPessoa,
            final String nome,
            final LocalDate now,
            final String cidadeNatal,
            final Endereco endereco,
            final int numeroEndereco,
            final String complementoEndereco,
            final String sexo,
            final String cpf,
            final LocalDate dataCadastro,
            final String telefoneResidencial,
            final String telefoneCelular,
            final String documento,
            final String tipoDocumento,
            final String senhaAcesso,
            final String email) {
        return new Pessoa(codigoPessoa,
                nome,
                now,
                cidadeNatal,
                endereco,
                numeroEndereco,
                complementoEndereco,
                sexo,
                cpf,
                dataCadastro,
                telefoneResidencial,
                telefoneCelular,
                documento,
                tipoDocumento,
                senhaAcesso,
                email);
    }

    private static Endereco getEndereco() {
        return new Endereco(1L,
                "final String logradouro",
                "final String bairro",
                "final String cep",
                getCidade());
    }

    private static Cidade getCidade() {
        return new Cidade(1L,
                "final String nome",
                getEstado());
    }

    private static Estado getEstado() {
        return new Estado(1L,
                "final String nome",
                getPais());
    }

    private static Pais getPais() {
        return new Pais(1L, "Brasil");
    }
}
