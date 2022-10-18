package com.projetointegrado.sistemacontrolevacina.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEndereco;
    private String logradouro;
    private String bairro;
    private String cep;
    @OneToOne
    @JoinColumn(name = "cidade_codigo_cidade")
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(
            final Long codigoEndereco,
            final String logradouro,
            final String bairro,
            final String cep,
            final Cidade cidade) {
        this.codigoEndereco = codigoEndereco;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public Long getCodigoEndereco() {
        return codigoEndereco;
    }

    public void setCodigoEndereco(Long codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
