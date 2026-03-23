package com.atp.ListaEx.service;

import com.atp.ListaEx.model.FornecedorModel;
import com.atp.ListaEx.repository.FornecedorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public FornecedorModel salvar(FornecedorModel fornecedorModel) {
        return repository.save(fornecedorModel);
    }

    public List<FornecedorModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<FornecedorModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}