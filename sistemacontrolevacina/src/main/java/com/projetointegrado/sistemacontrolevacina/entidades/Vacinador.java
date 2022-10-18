package com.projetointegrado.sistemacontrolevacina.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VACINADOR")
public class Vacinador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long codigoVacinador;
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    private String matricula;
    @OneToOne
    @JoinColumn(name = "unidade_id")
    private UnidadeSanitaria unidade;

    public Vacinador() {
    }

    public Long getCodigoVacinador() {
        return codigoVacinador;
    }

    public void setCodigoVacinador(Long codigoVacinador) {
        this.codigoVacinador = codigoVacinador;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public UnidadeSanitaria getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeSanitaria unidade) {
        this.unidade = unidade;
    }
}
