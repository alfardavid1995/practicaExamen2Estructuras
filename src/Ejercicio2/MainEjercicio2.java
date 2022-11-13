/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author css124646
 */
public class MainEjercicio2 {
public static ListaCircularDoble listaCircularDoble =  new ListaCircularDoble ();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        
        insertarpersona (new Persona(20, "Mengano"));
        insertarpersona (new Persona(14, "Sutano"));
        insertarpersona (new Persona(25, "Perensejo"));
        insertarpersona (new Persona(23, "Fulano"));
        insertarpersona (new Persona(24, "Pedro el escamoso"));
        insertarpersona (new Persona(8, "Betty la fea"));
        insertarpersona (new Persona(30, "Sheldon"));
        insertarpersona (new Persona(3, "Bob Esponja"));
        

        
        System.out.println(listaCircularDoble.toString());    
    }
    
    public static void  insertarpersona(Persona persona){
            listaCircularDoble.insertaTavoModificado(persona);

    }
    
}
