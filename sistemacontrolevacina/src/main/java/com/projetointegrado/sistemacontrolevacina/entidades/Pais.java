package com.projetointegrado.sistemacontrolevacina.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAIS")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoPais;
    private String nome;

    public Pais() {
    }

    public Pais(
            final Long codigoPais,
            final String nome) {
        this.codigoPais = codigoPais;
        this.nome = nome;
    }

    public Long getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Long codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
