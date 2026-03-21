package com.atp.ListaEx.service;

import com.atp.ListaEx.model.LivroModel;
import com.atp.ListaEx.repository.LivroRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public LivroModel salvar(LivroModel livroModel) {
        return repository.save(livroModel);
    }

    public List<LivroModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<LivroModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}