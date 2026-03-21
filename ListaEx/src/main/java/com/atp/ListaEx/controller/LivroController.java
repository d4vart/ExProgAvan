package com.atp.ListaEx.controller;


import com.atp.ListaEx.model.LivroModel;
import com.atp.ListaEx.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Livors")
public class LivroController {
    private final LivroService service;

    public LivroController(LivroService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<LivroModel>criar(@RequestBody LivroModel livroModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(livroModel));
    }

    @GetMapping
    public ResponseEntity<List<LivroModel>> listar(){
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/Id")
    public ResponseEntity<LivroModel> bucarPorId(@PathVariable Long Id){
        return service.buscarPorId(Id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/Id")
    public ResponseEntity<Void> deletar(@PathVariable Long Id){
        service.deletar(Id);
        return ResponseEntity.notFound().build();
    }


}
