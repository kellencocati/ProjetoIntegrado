package com.projetointegrado.sistemacontrolevacina.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UNIDADE_SANITARIA")
public class UnidadeSanitaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long codigoUnidade;
    private String nome;
    private String razaoSocial;
    private String cnpj;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public UnidadeSanitaria() {
    }

    public Long getCodigoUnidade() {
        return codigoUnidade;
    }

    public void setCodigoUnidade(Long codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
