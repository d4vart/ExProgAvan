package com.atp.ListaEx.repository;

import com.atp.ListaEx.model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
}