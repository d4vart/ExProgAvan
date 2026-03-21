package com.atp.ListaEx.repository;

import com.atp.ListaEx.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {
}
