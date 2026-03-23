package com.atp.ListaEx.repository;

import com.atp.ListaEx.model.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {
}