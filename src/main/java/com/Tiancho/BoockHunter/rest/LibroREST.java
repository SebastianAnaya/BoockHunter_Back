package com.Tiancho.BoockHunter.rest;


import com.Tiancho.BoockHunter.modelo.Libro;
import com.Tiancho.BoockHunter.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libro/")
public class LibroREST {

    @Autowired
    private LibroRepository libroRepository;
    private ResponseEntity<List<Libro>> getAllBibliotecario(){
        return ResponseEntity.ok(libroRepository.findAll());
    }

}
