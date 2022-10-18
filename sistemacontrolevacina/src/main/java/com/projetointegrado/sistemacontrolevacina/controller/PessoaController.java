package com.projetointegrado.sistemacontrolevacina.controller;

import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import com.projetointegrado.sistemacontrolevacina.servicos.PessoaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.util.CollectionUtils.isEmpty;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(
        value = "/pessoa",
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity<Boolean> createBook(@RequestBody Pessoa pessoa) {
        this.service.gravaPessoa(pessoa);
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.CREATED);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Pessoa>> listPessoas() {
        List<Pessoa> lista = service.getListaPessoa();
        if (isEmpty(lista)) {
            return new ResponseEntity<>(lista, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}
