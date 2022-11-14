package Ejercicio2;

import Ejercicio1.*;

public class Lista {
    private Nodo cabeza;
    
//    public void inserta(Casa c){
//        if(cabeza==null){
//            cabeza = new Nodo(c);
//        }else{
//        
//           Nodo aux = cabeza;
//           while (aux.getNext() != null ){
//               aux=aux.getNext();
//           }
//           Nodo temp = new Nodo(c);
//           temp.setNext(aux.getNext());
//           aux.setNext(temp);
//        } 
//    }
//    
//    
//    public void reemplazar(Casa casa){
//          Nodo aux = cabeza;
//          Nodo nueva = new Nodo(casa);
//        if (casa.getAnio()<cabeza.getDato().getAnio()){
//            //usar el segundo de la lista y tenerlo ahi como referencia
//            aux=cabeza.getNext();
//  
//           //eliminar cabeza
//           elimina(cabeza.getDato().getAnio());
//     
//           //definir casa como nueva cabeza
//            cabeza=nueva;
//           //agregar el aux como siguiente de la cabeza
//            cabeza.setNext(aux);
//        }else{
//            //la casa la agrega al final de la lista
//              aux = cabeza;
//           while (aux.getNext() != null ){
//               aux=aux.getNext();
//           }
//           
//           nueva.setNext(aux.getNext());
//           aux.setNext(nueva);
//        }
//    }
//   
//    public void elimina (int anio) {
//        //Si una persona tiene el id, lo elimina
//        if (cabeza != null) { //Si hay algo en la lista buscaré
//            if (cabeza.getDato().getAnio() == anio) 
//            {
//                cabeza = cabeza.getNext();
//            } 
//            else {
//                Nodo aux = cabeza; //utilizo aux como indice
//                //Mientras no se acabe la lista y el elemento
//                //de la lista sea menor que el buscado
//                while (aux. getNext () != null &&
//                    aux.getNext () .getDato () .getAnio()< anio) {
//                    aux = aux.getNext () ;
//                }
//                //avanzo en la lista
//            
//                // si es el de adelante lo borro
//                if (aux.getNext () != null &&
//                aux.getNext () .getDato () .getAnio () == anio) {
//                    aux. setNext (aux.getNext () .getNext ()); //cambio las referencias
//                }
//            }
//        }
//    }
//    

    
    @Override
    public String toString(){
        Nodo aux = cabeza;
        String s="Lista\n ";
        while(aux!=null){
            s+=aux+"\n, ";
            aux=aux.getNext();
        }
        return s;
    }
}
