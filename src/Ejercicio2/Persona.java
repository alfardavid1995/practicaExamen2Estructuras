/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Wstov
 */
public class Persona {
    private int edad;
    private String nombre;
    
    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public Persona(){}

    public int getId() {
        return edad;
    }

    public void setId(int id) {
        this.edad = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Persona{" + "id="+edad+", nombre="+nombre+'}';
    }
}
