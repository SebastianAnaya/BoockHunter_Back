/**
 * Encargado de gestionar y administrar la biblioteca.
 *
 * @author (Kevin Anaya, Laura Mendez)
 * @version (1)
 */
package com.Tiancho.BoockHunter.modelo;
import javax.persistence.*;
@Entity
@Table(name="bibliotecario")
public class Bibliotecario
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

    /**
     * Constructor for objects of class Bibliotecario
     */
    public Bibliotecario(String nombreUsuario, String contrasenna, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
