package com.projetointegrado.sistemacontrolevacina.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.projetointegrado.sistemacontrolevacina.entidades.Cidade;
import com.projetointegrado.sistemacontrolevacina.entidades.Endereco;
import com.projetointegrado.sistemacontrolevacina.entidades.Estado;
import com.projetointegrado.sistemacontrolevacina.entidades.Pais;
import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import java.time.LocalDate;

public class Utilitario {

//    public static void main(String[] args) {
//        ObjectMapper om = new ObjectMapper();
//        Pessoa person = Utilitario.getPessoa();
//        try {
//            String jsonString = om.writerWithDefaultPrettyPrinter().writeValueAsString(person);
//            System.out.println(jsonString);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();
        Endereco person = Utilitario.getEndereco();
        try {
            String jsonString = om.writerWithDefaultPrettyPrinter().writeValueAsString(person);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Pessoa getPessoa(){
        Pessoa person = new Pessoa();
        person.setCodigoPessoa(1L);
        person.setCidadeNatal("São Paulo");
        person.setCpf("18700631509");
        person.setNome("João");
        person.setDocumento("279650332");
        person.setTipoDocumento("RG");
        person.setEmail("ricardo.test@gmail.com");
        person.setEndereco(getEndereco());
        person.setComplementoEndereco("A casa 23");
        person.setDataCadastro(LocalDate.now());
        person.setDataNascimento(LocalDate.of(1978, 2, 16));
        person.setNumeroEndereco(28);
        person.setSenhaAcesso("123456");
        person.setSexo("Masculino");
        person.setTelefoneCelular("11980880708");
        person.setTelefoneResidencial("1125622333");
        return person;
    }

    public static Endereco getEndereco(){
        Endereco endereco = new Endereco();
        Pais pais = new Pais();
        pais.setCodigoPais(1L);
        pais.setNome("Brasil");
        Estado estado = new Estado();
        estado.setCodigoEstado(1L);
        estado.setNome("São Paulo");
        estado.setPais(pais);
        Cidade cidade = new Cidade();
        cidade.setCodigoCidade(1L);
        cidade.setNome("São Paulo");
        cidade.setEstado(estado);
        endereco.setCidade(cidade);
        endereco.setCodigoEndereco(1L);
        endereco.setBairro("São Miguel Paulista");
        endereco.setCep("08118002");
        endereco.setLogradouro("Rua 10");
        return endereco;
    }

}
