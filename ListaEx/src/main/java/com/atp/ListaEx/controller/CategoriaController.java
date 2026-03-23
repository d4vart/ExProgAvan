package com.atp.ListaEx.controller;


import com.atp.ListaEx.model.CategoriaModel;
import com.atp.ListaEx.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private final CategoriaService service;

    public CategoriaController(CategoriaService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CategoriaModel>criar(@RequestBody CategoriaModel categoriaModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(categoriaModel));
    }

    @GetMapping
    public ResponseEntity<List<CategoriaModel>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }
    @GetMapping("/Id")
    public ResponseEntity<CategoriaModel> buscarPorId(@PathVariable Long Id){
        return service.bucarPorId(Id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deletar(@PathVariable Long Id){
        service.deletar(Id);
        return ResponseEntity.noContent().build();
    }

}
