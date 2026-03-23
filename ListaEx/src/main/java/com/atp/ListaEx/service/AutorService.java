package com.atp.ListaEx.service;

import com.atp.ListaEx.model.AutorModel;
import com.atp.ListaEx.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    private final AutorRepository repository;

    public AutorService(AutorRepository repository){
        this.repository = repository;
    }

    public AutorModel salvar(AutorModel autorModel){
        return repository.save(autorModel);
    }

    public List<AutorModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<AutorModel> buscarPorId(Long Id){
        return repository.findById(Id);
    }

    public void deletar(Long Id){
        repository.deleteById(Id);
    }
}
