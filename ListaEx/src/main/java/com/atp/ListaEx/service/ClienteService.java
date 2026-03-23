package com.atp.ListaEx.service;

import com.atp.ListaEx.model.ClienteModel;
import com.atp.ListaEx.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public ClienteModel salvar(ClienteModel clienteModel) {
        return repository.save(clienteModel);
    }

    public List<ClienteModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<ClienteModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}