package com.atp.ListaEx.service;


import com.atp.ListaEx.model.ProdutoModel;
import com.atp.ListaEx.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }

    public ProdutoModel salvar(ProdutoModel produtoModel){
        return repository.save(produtoModel);
    }

    public List<ProdutoModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<ProdutoModel> buscarPorId(Long Id){
        return repository.findById(Id);
    }

    public void deletar(Long Id){
        repository.deleteById(Id);
    }
}
