package Ejercicio1;

import javax.swing.JOptionPane;

public class PracticaExamen2Estructuras {

    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Digite una palabra");
        //crear una lista  
        Lista lista = new Lista();
        //mandar un string para ser partido 
        
        insertarEnLaLista(palabra,lista);
         
         int index = Integer.parseInt(JOptionPane.showInputDialog("Digite un el indice que desea consultar"));
         
         System.out.println(lista.retornarDatos(index));
    }
    public static Lista insertarEnLaLista(String palabra, Lista lista){
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            lista.inserta(c);

        }
        return lista;
    }
    
    
    
}
