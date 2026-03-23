package com.atp.ListaEx.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
