package Ejercicio2;

public class ListaCircularDoble {
   private Nodo cabeza;
    private Nodo ultimo;
    
    //el copy de tavo
    public void inserta(Persona p){
        if(cabeza==null){
            cabeza = new Nodo(p);
            ultimo = cabeza;
        }else if(p.getId()<cabeza.getDato().getId()){
            //si lo que voy a insertar debe estar a la izquierda de cabeza
            Nodo aux = new Nodo(p);//creo el nodo aux con el parametro 
            aux.setNext(cabeza);//pongo el nodo aux a la izquierda de la cabeza
            cabeza=aux;//cabeza es el 
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
// este es el insert que vimos en clase
public void insert(Persona personitaInsertada){
    //en caso que la lista doble este vacia
    if(cabeza==null){//si la lista esta vacia solo queda asigndar i listo 
        cabeza = new Nodo(personitaInsertada);//mando el nodo a cabeza
        ultimo = cabeza;//lo igualo la cabeza 
        ultimo.setNext(cabeza);//enlazo el ultimo a la cabeza 
        cabeza.setBack(ultimo);//enlazo el primero al ultimo, y ahi es donde la lista se vuelve ciercular 
    }else if(personitaInsertada.getId()<cabeza.getDato().getId()){
        // si lo que voy a insertar esta a la izquiera de la cabeza (en otras palabras ir a back y no a next)
        Nodo aux = new Nodo(personitaInsertada);//creo el nodo auxiliar con el parametro recien creado
        aux.setNext(cabeza);//pongo el valor aux y le pongo que la cabeza es el siguiente, coloco aux a la izquierda de la cabeza
        cabeza = aux; //cabeza ahora referencia al nuevo elemento 
        ultimo.setNext(cabeza);//enlazo el ultimo con la cabeza
        cabeza.setBack(ultimo);//enlazo cabeza con el ultimo (circular)
    }else if (ultimo.getDato().getId() <=personitaInsertada.getId()){
        //si debo insertar  al final de la lista 
        ultimo.setNext(new Nodo(personitaInsertada));//llamo al next del ultimo directamente y le pongo un nodo nuevo ahi 
        ultimo = ultimo.getNext();//ultimo se actualiza en nuevo nodo 
        ultimo.setNext(cabeza);//enlazo ultimo a la cabeza (circular)
        cabeza.setBack(ultimo);// enlazo cabeza al ultimo (circular)   
    }else{
        Nodo aux = cabeza;
        
        while (aux.getNext().getDato().getId()<personitaInsertada.getId()){
            aux= aux.getNext();
        }
        Nodo temp = new Nodo(personitaInsertada);
        temp.setNext(aux.getNext());
        temp.setBack(aux);
        aux.setNext(temp);
        temp.getNext().setBack(temp);
    }
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
