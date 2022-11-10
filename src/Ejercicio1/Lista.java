package Ejercicio1;

import javax.swing.JOptionPane;

public class Lista {

    private Nodo cabeza;
    int index = 0;

    public void inserta(char charcito) {
        Dato p = new Dato(charcito, index);
        if (cabeza == null) {
            cabeza = new Nodo(p);
        } else if (p.getIndex() < cabeza.getDatico().getIndex()) {
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new Nodo(p));
        } else {
            Nodo aux = cabeza;
            while (aux.getNext() != null
                    && aux.getNext().getDatico().getIndex()
                    < p.getIndex()) {
                aux = aux.getNext();
            }
            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
        index += 1;
    }

    public boolean existe(int index) {
        boolean esta = false;
        //Busca en lista, y retorna true si una persona tiene el id
        //en la lista
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            Nodo aux = cabeza;
            //utilizo aux como indice

            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDatico().getIndex() < index) {
                aux = aux.getNext();//avanzo en la lista
            }

            //verdadero si lo encontró
            esta = (aux != null && aux.getDatico().getIndex() == index);
        }

        return esta;
    }

    public String retornarDatos(int index) {
        String s = "";
//        if (existe(index)) {
//  
//            s=s+"-"+retornarIndex(index);
//            if (existe(index - 1)) {
//               s=s+"-"+ retornarIndexBefore(index - 1);
//            } else {
//                JOptionPane.showMessageDialog(null, "No existe una letra en el indice anterior al indicado");
//            }
//            if (existe(index + 1)) {
//              s=s+"-"+ retornarIndexNext(index + 1);
//            } else {
//                JOptionPane.showMessageDialog(null, "No existe una letra en el indice siguiente al indicado");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "No existe una letra en el indice indicado");
//        }
        retornarIndexBefore(index);
        retornarIndex(index);
        retornarIndexNext(index);
        System.out.print("\n\n");
        
        return s;
    }

    private char retornarIndex(int index) {
        char caracter = 'o';
        Nodo aux = cabeza; //utilizo aux como indice
        //Mientras no se acabe la lista y el elemento
        //de la lista sea menor que el buscado
        while (aux.getNext() != null){
            
            if(aux.getDatico().getIndex()==index){
                caracter=aux.getDatico().getDatoChar();   
                break;
            }
            aux= aux.getNext();
        }
        System.out.println("valor a retornar: "+aux.getDatico().getDatoChar()+" "+ aux.getDatico().getIndex());
        return caracter;
    }

    private char retornarIndexNext(int index) {
        char caracter = 'o';
        Nodo aux = cabeza; //utilizo aux como indice
        //Mientras no se acabe la lista y el elemento
        //de la lista sea menor que el buscado
        while (aux.getNext() != null){
            aux= aux.getNext();
            if(aux.getDatico().getIndex()==index+1){
                caracter=aux.getDatico().getDatoChar();
                break;
            }  
        }
        System.out.println("valor a retornar Next: "+aux.getDatico().getDatoChar()+" "+ aux.getDatico().getIndex());
        return caracter;
    }

    private char retornarIndexBefore(int index) {
        char caracter = 'o';
        //mierda
        Nodo aux = cabeza; //utilizo aux como indice
        //Mientras no se acabe la lista y el elemento
        //de la lista sea menor que el buscado
        
if (index-1 <= 0){
           caracter = '#'; 
        }else{
            while (aux.getNext() != null){
                System.out.println("$$$$$$ recorrer before $$$$$$$$$ "+aux.getDatico().getDatoChar()+" "+ aux.getDatico().getIndex());
                if(aux.getDatico().getIndex()==index-1){
                    caracter=aux.getNext().getDatico().getDatoChar();
                    System.out.println("###### insertar before ####### "+aux.getDatico().getDatoChar()+" "+ aux.getDatico().getIndex());
                break;
                }
                aux= aux.getNext();
            }
        }
        
        System.out.println("valor a retornar Before: "+aux.getDatico().getDatoChar()+" "+ aux.getDatico().getIndex());
        return caracter;
    }

//    public void modifica (Persona p) {
//        //busca a si existe alguien con el id, y le actualiza el nombre
//        if (cabeza != null) {
//            //Si hay algo en la lista buscaré
//            Nodo aux = cabeza; //utilizo aux como indice
//            //Mientras no se acabe la lista y el elemento
//            //de la lista sea menor que el buscado
//            while (aux != null && aux.getDato().getId() < p.getId()) {
//                aux = aux. getNext (); //avanzo en la lista
//            }
//            // Si lo encuentra hago el cambio
//            if (aux != null && aux. getDato () .getId () == p.getId ()){
//                //Solo básta cambiar nombre
//                aux.getDato().setNombre(p.getNombre()) ;
//            }
//        }
//    } 
//    public void elimina (int id) {
//        //Si una persona tiene el id, lo elimina
//        if (cabeza != null) { //Si hay algo en la lista buscaré
//            if (cabeza.getDato().getId() == id) 
//            {
//                cabeza = cabeza.getNext();
//            } 
//            else {
//                Nodo aux = cabeza; //utilizo aux como indice
//                //Mientras no se acabe la lista y el elemento
//                //de la lista sea menor que el buscado
//                while (aux. getNext () != null &&
//                    aux.getNext () .getDato () .getId() < id) {
//                    aux = aux.getNext () ;
//                }
//                //avanzo en la lista
//            
//                // si es el de adelante lo borro
//                if (aux.getNext () != null &&
//                aux.getNext () .getDato () .getId () == id) {
//                    aux. setNext (aux.getNext () .getNext ()); //cambio las referencias
//                }
//            }
//        }
//    }
    public Dato extrae(int index) {
        Dato p = null;
        //si una persona tiene el id, lo extrae (eliminando y retornando)
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if (cabeza.getDatico().getIndex() == index) {
                cabeza = cabeza.getNext();
            } else {
                Nodo aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux.getNext() != null && aux.getNext().getDatico().getIndex()
                        < index) {
                    aux = aux.getNext();
                    //avanzo en la lista
                }
                // Si es el de adelante... quardo la persona y lo borro
                if (aux.getNext() != null && aux.getNext().getDatico().getIndex() == index) {
                    p = aux.getNext().getDatico();
                    aux.setNext(aux.getNext().getNext());//cambio las referencias
                }
            }
        }
        return p;
    }

    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s = "Lista:\n";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }
}
