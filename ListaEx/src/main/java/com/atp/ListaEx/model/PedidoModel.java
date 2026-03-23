package com.atp.ListaEx.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="tb_pedido")
public class PedidoModel {
    @Id
    @GeneratedValue
    private Long Id;

    @Column(name = "data_pedido")
    private LocalDateTime data;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    private String status;
}
