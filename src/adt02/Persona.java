/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt02;

/**
 *
 * @author alejandro
 */
public enum Persona {
    
    ALEX("Martinez",23), GABRIEL("Zempoalteca",25), DIEGO("Montero",24);
    
    String apellido;
    int edad;

    private Persona(String apellido, int edad) {
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    
}
