package com.atp.ListaEx.service;

import com.atp.ListaEx.model.TarefaModel;
import com.atp.ListaEx.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public TarefaModel salvar(TarefaModel tarefaModel) {
        return repository.save(tarefaModel);
    }

    public List<TarefaModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<TarefaModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}