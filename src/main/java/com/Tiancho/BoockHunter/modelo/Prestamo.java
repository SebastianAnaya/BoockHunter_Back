/**
 * Dar fecha de inicio y de finalización del periodo de préstamo de un ejemplar
 * Controlar el retraso en la entrega de un libro.
 *
 * @author (Kevin Anaya, Laura Mendez)
 * @version (1)
 */
package com.Tiancho.BoockHunter.modelo;
import java.time.LocalDate;
import javax.persistence.*;
@Entity
@Table (name="prestamo")
public class Prestamo
{
    @Column
    private LocalDate inicio;
    @Column
    private LocalDate fin;
    @ManyToOne
    @JoinColumn(name = "ejemplar_id")
    private Ejemplar ejemplar;
    @ManyToOne
    @JoinColumn(name = "lector_id")
    private Lector lector;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    /**
     * Constructor for objects of class Libro
     */
    public Prestamo(Lector lector, Ejemplar ejemplar){
        this.lector=lector;
        this.ejemplar=ejemplar;
    }
    public Prestamo(Lector lector , LocalDate inicio, LocalDate fin) {
        this.inicio = inicio;
        this.fin = fin;
        this.lector = lector;
//        this.ejemplar = ejemplar;
    }

    /**
     *
     * Aceptar un prestamo creado apartir de un ejemplar y lector existentes
     * Este metodo es usado por el roll del bibliotecario
     */

    public void aceptarPrestamo(){
        ejemplar.prestarEjemplar();
        if(ejemplar.getEstado()){
            inicio = LocalDate.now();
            fin = inicio.plusDays(30);
        }
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }
}
