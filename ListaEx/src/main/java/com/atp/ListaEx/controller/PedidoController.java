package com.atp.ListaEx.controller;

import com.atp.ListaEx.model.PedidoModel;
import com.atp.ListaEx.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

import java.util.List;

@RequestMapping("/pedido")
@RestController
public class PedidoController {
    private final PedidoService service;
    private final ResourceUrlProvider resourceUrlProvider;

    public PedidoController(PedidoService service, ResourceUrlProvider resourceUrlProvider){
        this.service =  service;
        this.resourceUrlProvider = resourceUrlProvider;
    }

    @PostMapping
    public ResponseEntity<PedidoModel> criar(@RequestBody PedidoModel pedidoModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(pedidoModel));
    }

    @GetMapping
    public  ResponseEntity<List<PedidoModel>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/Id")
    public ResponseEntity<PedidoModel> buscarPorId(@PathVariable Long Id){
        return service.buscarPorId(Id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("deleteId")
    public ResponseEntity<Void> deletar(@PathVariable Long Id){
        service.deletar(Id);
        return  ResponseEntity.noContent().build();
    }
}
