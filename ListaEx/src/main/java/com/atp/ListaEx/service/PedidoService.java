package com.atp.ListaEx.service;

import com.atp.ListaEx.model.PedidoModel;
import com.atp.ListaEx.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    private final PedidoRepository repository;

    public PedidoService (PedidoRepository repository){
        this.repository = repository;
    }

    public PedidoModel salvar(PedidoModel pedidoModel){
        return repository.save(pedidoModel);
    }

    public List<PedidoModel> listarTodos(){
        return repository.findAll();
    }

    public Optional<PedidoModel> buscarPorId(Long Id){
        return repository.findById(Id);
    }

    public void deletar(Long Id){
        repository.deleteById(Id);
    }
}
