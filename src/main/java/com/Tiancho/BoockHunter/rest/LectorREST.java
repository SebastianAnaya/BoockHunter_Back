package com.Tiancho.BoockHunter.rest;


import com.Tiancho.BoockHunter.modelo.Lector;
import com.Tiancho.BoockHunter.repository.LectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lector/")
public class LectorREST {
    @Autowired
    private LectorRepository lectorRepository;

    private ResponseEntity<List<Lector>> getAllBibliotecario(){
        return ResponseEntity.ok(lectorRepository.findAll());
    }
}
