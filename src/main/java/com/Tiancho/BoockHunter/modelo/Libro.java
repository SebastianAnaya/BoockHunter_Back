/**
 * Clase creada para ontener la información que lo identifica: titulo, descripción, autor,
 * año de publicación y categoría de los libros de la biblioteca
 *  @author (Kevin Anaya, Laura Mendez)
 *  @version (1)
 */
package com.Tiancho.BoockHunter.modelo;
import javax.persistence.*;
@Entity
@Table(name="libro")

public class Libro {
    // instance variables - replace the example below with your own
    private String nombre, descripcion, autor, categoria;
    private int añoPublicacion;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String nombre, String descripcion, String autor, String categoria, int añoPublicacion)
    {
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.autor= autor;
        this.categoria=categoria;
        this.añoPublicacion=añoPublicacion;
    }
    //constructor sin descripcion en caso de no tenerla
    public Libro(String nombre, String autor, String categoria, int añoPublicacion)
    {
        this.nombre= nombre;
        this.autor= autor;
        this.categoria=categoria;
        this.añoPublicacion=añoPublicacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomrbe) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
}
