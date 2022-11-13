package Ejercicio1;

import javax.swing.JOptionPane;

public class PracticaExamen2Estructuras {

    public static void main(String[] args) {

        //String palabra = JOptionPane.showInputDialog("Digite una palabra");
        
        String palabra = JOptionPane.showInputDialog("Escriba una palabra");//escribe la palabra 
        Lista lista = new Lista();//crea la lista
        insertarEnLaLista(palabra,lista);//insertar palabra a la lista
        JOptionPane.showMessageDialog(null,lista.toString());//muestra toda la lista
        int index = Integer.parseInt(JOptionPane.showInputDialog("Escriba el indice que quiere ver \n Tiene que ser un valor entre 0 y "+(palabra.length()-1)));//escribimos el indice que queremos ver        
        if(index>=0 && index<=(palabra.length()-1)){
                    JOptionPane.showMessageDialog(null,lista.retornarDatos(index));//mandamos el indice y que me retorne el valor anterior, el actual y el siguiente
        }else{
            JOptionPane.showMessageDialog(null, "error, escriba un valor entre 0 y " +(palabra.length()-1));
        }
        
        
        
        //testing(palabra, lista); // esto solo se usa para comprobar todas las posiciones
        

         
         
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
