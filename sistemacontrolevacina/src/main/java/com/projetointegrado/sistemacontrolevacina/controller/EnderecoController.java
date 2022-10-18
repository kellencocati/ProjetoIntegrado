package com.projetointegrado.sistemacontrolevacina.controller;

import com.projetointegrado.sistemacontrolevacina.entidades.Endereco;
import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import com.projetointegrado.sistemacontrolevacina.servicos.EnderecoService;
import com.projetointegrado.sistemacontrolevacina.servicos.PessoaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.util.CollectionUtils.isEmpty;

@RestController
@RequestMapping(
        value = "/endereco",
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody Endereco endereco) {
        this.service.gravaEndereco(endereco);
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.CREATED);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Endereco>> list() {
        List<Endereco> lista = service.getListaEndereco();
        if (isEmpty(lista)) {
            return new ResponseEntity<>(lista, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(lista, HttpStatus.FOUND);
    }


}
