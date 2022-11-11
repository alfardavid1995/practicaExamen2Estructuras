package Ejercicio1;

import javax.swing.JOptionPane;

public class PracticaExamen2Estructuras {

    public static void main(String[] args) {

        //String palabra = JOptionPane.showInputDialog("Digite una palabra");
        
        String palabra = JOptionPane.showInputDialog("Escriba una palabra");
        //crear una lista  
        Lista lista = new Lista();
        //mandar un string para ser partido 
        
        
        insertarEnLaLista(palabra,lista);//inserta lista
        System.out.println(lista.toString());//muestra toda la lista
        testing(palabra, lista);
        
         
        
        
         //int index = Integer.parseInt(JOptionPane.showInputDialog("Digite un el indice que desea consultar"));

         
         
         
         
    }
    
    public static void testing(String palabra, Lista lista){
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println("Valor del dato '"+ palabra.charAt(i)+ "' indice del dato: "+i);
            System.out.print(lista.retornarDatos(i));
        }
    }
    
    public static Lista insertarEnLaLista(String palabra, Lista lista){
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            lista.inserta(c);

        }
        return lista;
    }
    
    
    
}
