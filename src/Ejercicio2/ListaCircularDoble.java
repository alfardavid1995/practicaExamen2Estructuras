package Ejercicio2;

public class ListaCircularDoble {
   private Nodo cabeza;
    private Nodo ultimo;
    
    public void inserta(Persona p){
        if(cabeza==null){
            cabeza = new Nodo(p);
            ultimo = cabeza;
        }else if(p.getId()<cabeza.getDato().getId()){
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(ultimo.getDato().getId() <= p.getId()){
            ultimo.setNext(new Nodo(p));
            ultimo = ultimo.getNext();
        }else{
           Nodo aux = cabeza;
           while (aux.getNext().getDato().getId() < p.getId()){
               aux=aux.getNext();
           }
           Nodo temp = new Nodo(p);
           temp.setNext(aux.getNext());
           temp.setBack(aux);
           aux.setNext(temp);
           temp.getNext().setBack(temp); //nuevo
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo); 
    }    
    @Override
    public String toString(){
        Nodo aux = cabeza;
        String s="Lista: ";
        if (aux != null){
            s+=aux+", ";
            aux=aux.getNext();
            while(aux != cabeza){
                s+=aux+", ";
                aux=aux.getNext();
            }
        } else{
            s+="vacia";
        }
        return s;
    } 
}
