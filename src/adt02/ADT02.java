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
public class ADT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(Persona.GABRIEL.getApellido());
        
        for (Persona persona: Persona.values()) {
            System.out.println("CONS:"+persona+"   APE:"+persona.getApellido()+"    EDAD:"+persona.getEdad());
        }
    }
    
}
