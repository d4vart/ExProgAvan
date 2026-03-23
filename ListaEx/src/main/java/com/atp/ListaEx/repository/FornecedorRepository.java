package com.atp.ListaEx.repository;

import com.atp.ListaEx.model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {
}