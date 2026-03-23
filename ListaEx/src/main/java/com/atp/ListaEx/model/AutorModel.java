package com.atp.ListaEx.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Autor")
@Table(name = "tb_autor")
public class AutorModel {
    @Id
    @GeneratedValue
    private Long Id;

    @Column(name = "nome_autor")
    private String nome;

    @Column(name="nacionalidadeAutor")
    private String nacionalidade;

    private LocalDate dataNascimento;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
