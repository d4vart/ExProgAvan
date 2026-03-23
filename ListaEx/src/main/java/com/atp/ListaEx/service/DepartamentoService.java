package com.atp.ListaEx.service;

import com.atp.ListaEx.model.DepartamentoModel;
import com.atp.ListaEx.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public DepartamentoService(DepartamentoRepository repository) {
        this.repository = repository;
    }

    public DepartamentoModel salvar(DepartamentoModel departamentoModel) {
        return repository.save(departamentoModel);
    }

    public List<DepartamentoModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<DepartamentoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}