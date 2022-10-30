package com.projetointegrado.sistemacontrolevacina.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import java.time.LocalDate;

public class Utilitario {

    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();
        Pessoa person = Utilitario.getPessoa();
        try {
            String jsonString = om.writerWithDefaultPrettyPrinter().writeValueAsString(person);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        ObjectMapper om = new ObjectMapper();
//        Endereco person = Utilitario.getEndereco();
//        try {
//            String jsonString = om.writerWithDefaultPrettyPrinter().writeValueAsString(person);
//            System.out.println(jsonString);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static Pessoa getPessoa(){
        Pessoa person = new Pessoa();
        person.setCodigoPessoa(1L);
        person.setCidadeNatal("São Paulo");
        person.setCpf("18700631509");
        person.setNome("João");
        person.setDocumento("279650332");
        person.setTipoDocumento("RG");
        person.setEmail("ricardo.test@gmail.com");
        person.setEndereco("Rua Dr Alarico de Toledo Piza");
        person.setNumeroEndereco(28);
        person.setComplementoEndereco("A casa 23");
        person.setDataCadastro(LocalDate.now().toString());
        person.setDataNascimento("16/02/1978");
        person.setSenhaAcesso("123456");
        person.setSexo("Masculino");
        person.setTelefoneCelular("11980880708");
        person.setTelefoneResidencial("1125622333");
        return person;
    }

}
