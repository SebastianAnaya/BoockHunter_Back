/**
 * Quien hace uso de los libros.
 *
 * @author (Kevin Anaya, Laura Mendez)
 * @version (1)
 */
package com.Tiancho.BoockHunter.modelo;
import java.time.LocalDate;
import javax.persistence.*;
@Entity
@Table(name="lector")
public class Lector
{
    // instance variables - replace the example below with your own

    @Column
    private String nombreUsuario;
    @Column
    private String contraseña;
    @Column
    private String correo;
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private LocalDate fechaNacimiento;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String direccion;
    @Column
    private long telefono;

    /**
     * Constructor for objects of class Lector
     */
    public Lector(String nombreUsuario, String contraseña, String correo, LocalDate fechaNacimiento, String nombre, String apellidos, String direccion, long telefono) {

        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int teelfono) {
        this.telefono = telefono;
    }

}
