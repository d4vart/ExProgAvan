package com.atp.ListaEx.controller;


import com.atp.ListaEx.model.AutorModel;
import com.atp.ListaEx.service.AutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Autor")
public class AutorController {
    private final AutorService service;

    public AutorController ( AutorService service){
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<AutorModel> criar (@RequestBody AutorModel autorModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(autorModel));
    }

    @GetMapping
    public ResponseEntity<List<AutorModel>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/Id")
    public ResponseEntity<AutorModel> buscarPorId(@PathVariable Long Id){
        return service.buscarPorId(Id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/Id")
    public ResponseEntity<Void> deletar(@PathVariable Long Id){
        service.deletar(Id);
        return ResponseEntity.noContent().build();
    }
}
