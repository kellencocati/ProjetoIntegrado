package com.projetointegrado.sistemacontrolevacina.entidades;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONSULTA")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long codigoConsulta;
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    @OneToOne
    @JoinColumn(name = "unidade_id")
    private UnidadeSanitaria unidade;
    @ManyToOne
    @JoinColumn(name = "vacina_id")
    private Vacina vacina;
    private LocalDate dataConsulta;
    @OneToOne
    @JoinColumn(name = "campanha_id")
    private Campanha campanha;

    public Consulta() {
    }

    public Long getCodigoConsulta() {
        return codigoConsulta;
    }

    public void setCodigoConsulta(Long codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public UnidadeSanitaria getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeSanitaria unidade) {
        this.unidade = unidade;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }
}
