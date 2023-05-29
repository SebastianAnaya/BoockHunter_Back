package com.Tiancho.BoockHunter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Tiancho.BoockHunter.modelo.Libro;
public interface LibroRepository extends JpaRepository<Libro, Long> {
}
