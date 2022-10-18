package com.projetointegrado.sistemacontrolevacina.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VACINA")
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long codigoVacina;
    private String nome;
    private String descricao;
    private Integer numeroDoses;
    private Integer idadeMinima;
    private Integer idadeMaxima;
    private Integer validade;
    private Boolean obrigatoria;

    public Vacina() {
    }

    public Long getCodigoVacina() {
        return codigoVacina;
    }

    public void setCodigoVacina(Long codigoVacina) {
        this.codigoVacina = codigoVacina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumeroDoses() {
        return numeroDoses;
    }

    public void setNumeroDoses(Integer numeroDoses) {
        this.numeroDoses = numeroDoses;
    }

    public Integer getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(Integer idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Integer getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(Integer idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public Integer getValidade() {
        return validade;
    }

    public void setValidade(Integer validade) {
        this.validade = validade;
    }

    public Boolean getObrigatoria() {
        return obrigatoria;
    }

    public void setObrigatoria(Boolean obrigatoria) {
        this.obrigatoria = obrigatoria;
    }
}
