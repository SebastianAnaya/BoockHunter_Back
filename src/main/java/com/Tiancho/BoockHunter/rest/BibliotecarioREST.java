package com.Tiancho.BoockHunter.rest;

import com.Tiancho.BoockHunter.modelo.Bibliotecario;
import com.Tiancho.BoockHunter.service.BibliotecarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bibliotecario/")
public class BibliotecarioREST {
    @Autowired
    private BibliotecarioService bibliotecarioService;

    private ResponseEntity<List<Bibliotecario>> getAllBibliotecario(){
        return ResponseEntity.ok(bibliotecarioService.findAll());
    }


}
