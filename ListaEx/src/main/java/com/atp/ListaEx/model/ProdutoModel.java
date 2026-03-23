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


}
