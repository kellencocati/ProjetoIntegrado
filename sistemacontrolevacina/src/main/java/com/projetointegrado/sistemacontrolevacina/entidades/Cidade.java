package com.projetointegrado.sistemacontrolevacina.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CIDADE")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCidade;
    private String nome;
    @OneToOne
    @JoinColumn(name = "estado_ID")
    private Estado estado;

    public Cidade() {
    }

    public Cidade(
            final Long codigoCidade,
            final String nome,
            final Estado estado) {
        this.codigoCidade = codigoCidade;
        this.nome = nome;
        this.estado = estado;
    }

    public Long getCodigoCidade() {
        return codigoCidade;
    }

    public void setCodigoCidade(Long codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
