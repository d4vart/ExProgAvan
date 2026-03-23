package com.atp.ListaEx.model;


import jakarta.persistence.*;

import javax.naming.Name;
import java.math.BigDecimal;

@Entity(name = "Produto")
@Table(name = "tb_produto")
public class ProdutoModel {
    @Id
    @GeneratedValue
    private Long Id;

    @Column(name = "nome_produto")
    private String nome;

    @Column(name = "preco_produto")
    private BigDecimal preco;

    private Integer estoque;

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
