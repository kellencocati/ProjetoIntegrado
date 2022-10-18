package com.projetointegrado.sistemacontrolevacina.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEstado;
    private String nome;
    @OneToOne
    @JoinColumn(name = "pais_ID")
    private Pais pais;

    public Estado() {
    }

    public Estado(
            final Long codigoEstado,
            final String nome,
            final Pais pais) {
        this.codigoEstado = codigoEstado;
        this.nome = nome;
        this.pais = pais;
    }

    public Long getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(Long codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
