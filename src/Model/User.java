/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Model class representing a User.
 * It contains the basic user information such as ID, name, surname, and email.
 * 
 * @author Dani
 */
public class User {
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;

    /**
     * Gets the user ID.
     * 
     * @return The user's ID.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the user ID.
     * 
     * @param id The new ID for the user.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the user's first name.
     * 
     * @return The user's first name.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the user's first name.
     * 
     * @param nombre The new first name for the user.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the user's last name.
     * 
     * @return The user's last name.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Sets the user's last name.
     * 
     * @param apellido The new last name for the user.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Gets the user's email address.
     * 
     * @return The user's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email address.
     * 
     * @param email The new email address for the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
