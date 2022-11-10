
package Ejercicio1;


public class Nodo {
    private Dato datico;
    private Nodo next;
    
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+datico+'}';
    }

    public Nodo(Dato datico) {
        this.datico = datico;
      
    }
    
    

    public Dato getDatico() {
        return datico;
    }

    public void setDatico(Dato datico) {
        this.datico = datico;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
   
}
