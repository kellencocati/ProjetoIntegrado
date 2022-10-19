package com.projetointegrado.sistemacontrolevacina.servicos.impl;

import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
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


    @Override
    public void insereDadosIniciais() {
        Pessoa pessoa1 = getPessoa(
                1L,
                "Testes",
                LocalDate.now(),
                "final String cidadeNatal",
                "Rua Dr. Alarico de Toledo Piza",
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
        pessoaRepository.saveAll(Arrays.asList(pessoa1));
    }

    private static Pessoa getPessoa(
            final Long codigoPessoa,
            final String nome,
            final LocalDate now,
            final String cidadeNatal,
            final String endereco,
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

}
