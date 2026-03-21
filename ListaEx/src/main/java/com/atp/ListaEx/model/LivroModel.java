package com.atp.ListaEx.model;

import jakarta.persistence.*;

@Entity
@Table(name="Tb_Livros")
public class LivroModel {
    @Id
    @GeneratedValue
    private Long Id;

    @Column(name= "titulo_livro")
    private String Titulo;

    @Column(name = "autor_Livro")
    private String autor;

    private Integer anoPublicacao;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
