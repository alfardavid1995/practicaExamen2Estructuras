package Ejercicio2;

import Ejercicio1.*;

public class Nodo {
    private Casa dato;
    private Nodo next;
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public Nodo(Casa dato){
        this.dato=dato;
    }

    public Casa getDato() {
        return dato;
    }

    public void setDato(Casa dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
