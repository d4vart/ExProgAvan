package com.atp.ListaEx.repository;

import com.atp.ListaEx.model.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}