package com.atp.ListaEx.model;

import jakarta.persistence.*;

@Entity(name = "Categoria")
@Table(name = "tb-categoria")
public class CategoriaModel {

    @Id
    @GeneratedValue
    private Long Id;

    @Column(name = "nome_categoria")
    private String nome;

    @Column(name = "descricao_categoria")
    private String descricao;
}
