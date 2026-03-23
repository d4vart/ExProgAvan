package com.atp.ListaEx.service;


import com.atp.ListaEx.model.CategoriaModel;
import com.atp.ListaEx.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaService ( CategoriaRepository repository){
        this.repository = repository;
    }

    public CategoriaModel salvar (CategoriaModel categoriaModel){
        return repository.save(categoriaModel);
    }

    public List<CategoriaModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<CategoriaModel> bucarPorId(Long Id){
        return repository.findById(Id);
    }

    public void deletar(Long Id){
        repository.deleteById(Id);
    }
}
