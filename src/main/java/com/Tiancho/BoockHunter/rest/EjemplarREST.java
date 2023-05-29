package com.Tiancho.BoockHunter.rest;


import com.Tiancho.BoockHunter.modelo.Ejemplar;
import com.Tiancho.BoockHunter.repository.EjemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ejemplar/")
public class EjemplarREST {
    @Autowired
    private EjemplarRepository ejemplarRepository;
    private ResponseEntity<List<Ejemplar>> getAllBibliotecario(){
        return ResponseEntity.ok(ejemplarRepository.findAll());
    }
}
