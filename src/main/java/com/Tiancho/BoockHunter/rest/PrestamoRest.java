package com.Tiancho.BoockHunter.rest;


import com.Tiancho.BoockHunter.modelo.Prestamo;
import com.Tiancho.BoockHunter.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prestamo/")
public class PrestamoRest {
    @Autowired
    private PrestamoRepository prestamoRepository;

    private ResponseEntity<List<Prestamo>> getAllBibliotecario(){
        return ResponseEntity.ok(prestamoRepository.findAll());
    }
}
