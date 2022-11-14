package Ejercicio2;

public class ListaCircularDoble {

    private Nodo cabeza;
    private Nodo ultimo;

    //el copy de tavo
    public void inserta(Persona p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza;
        } else if (p.getId() < cabeza.getDato().getId()) {
            //si lo que voy a insertar debe estar a la izquierda de cabeza
            Nodo aux = new Nodo(p);//creo el nodo aux con el parametro 
            aux.setNext(cabeza);//pongo el nodo aux a la izquierda de la cabeza
            cabeza = aux;//cabeza es el 
        } else if (ultimo.getDato().getId() <= p.getId()) {
            ultimo.setNext(new Nodo(p));
            ultimo = ultimo.getNext();
        } else {
            Nodo aux = cabeza;
            while (aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
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
    public void insert(Persona personitaInsertada) {

        if (cabeza == null) {//si la lista esta vacia solo queda asigndar el nodo con los parametros y listo  
            cabeza = new Nodo(personitaInsertada);//mando el nodo a cabeza
            ultimo = cabeza;//lo igualo la cabeza 
            ultimo.setNext(cabeza);//enlazo el ultimo a la cabeza 
            cabeza.setBack(ultimo);//enlazo el primero al ultimo, y ahi es donde la lista se vuelve ciercular 
        } else if (personitaInsertada.getId() > cabeza.getDato().getId()) {// si el dato de la cabeza es menor a 
            // si lo que voy a insertar esta a la izquiera de la cabeza (en otras palabras ir a back y no a next)
            Nodo aux = new Nodo(personitaInsertada);//creo el nodo auxiliar con el parametro recien creado
            aux.setNext(cabeza);//pongo el valor aux y le pongo que la cabeza es el siguiente, coloco aux a la izquierda de la cabeza
            cabeza = aux; //cabeza ahora referencia al nuevo elemento 
            ultimo.setNext(cabeza);//enlazo el ultimo con la cabeza
            cabeza.setBack(ultimo);//enlazo cabeza con el ultimo (circular)
        } else if (ultimo.getDato().getId() <= personitaInsertada.getId()) {
            //si debo insertar  al final de la lista 
            ultimo.setNext(new Nodo(personitaInsertada));//llamo al next del ultimo directamente y le pongo un nodo nuevo ahi 
            ultimo = ultimo.getNext();//ultimo se actualiza en nuevo nodo 
            ultimo.setNext(cabeza);//enlazo ultimo a la cabeza (circular)
            cabeza.setBack(ultimo);// enlazo cabeza al ultimo (circular)   
        } else {
            Nodo aux = cabeza;//defino aux como cabeza
            //mientras el dato del siguiente sea menor que el dato que voy a insertar,
            //insertar avance en la lista

            while (aux.getNext().getDato().getId() < personitaInsertada.getId()) {
                aux = aux.getNext();
            }
            // ya una vez ubicado procede a hacer el enlazamiento que corresponde
            Nodo temp = new Nodo(personitaInsertada);// creo nodo temp para crear el nodo con p
            temp.setNext(aux.getNext());// enlazo temp al siguiente de aux
            temp.setBack(aux);//enlazo temp al de atras
            aux.setNext(temp);//enlazo el siguiente de aux como temp
            temp.getNext().setBack(temp);// enlazo el siguiente de temp
        }
    }

    public void insertaTest(Persona p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(ultimo);

        } else if (p.getId() < cabeza.getDato().getId()) {

            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (ultimo.getDato().getId() <= p.getId()) {

            ultimo.setNext(new Nodo(p));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else {

            Nodo aux = cabeza;

            while (aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
            }

            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo);
    }

    public void insertaTavoModificado(Persona p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza;
        } else if (p.getId() < 17) {
            //si lo que voy a insertar debe estar a la izquierda de cabeza
            Nodo aux = new Nodo(p);//creo el nodo aux con el parametro 
            aux.setNext(cabeza);//pongo el nodo aux a la izquierda de la cabeza
            cabeza = aux;//cabeza es el 
        } else if (18 <= p.getId()) {
            ultimo.setNext(new Nodo(p));
            ultimo = ultimo.getNext();
        } else {
            Nodo aux = cabeza;
            while (aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
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

    public void metodoAlemodificadoEnlaceBack(Persona personita) {
        if (cabeza == null) {
            cabeza = new Nodo(personita);
            cabeza.setNext(cabeza);
            cabeza.setBack(cabeza);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            ultimo.setBack(cabeza);
        } else if (personita.getId() < cabeza.getDato().getId()) {//es caso de que el numero sea a la izquierda de la cabeza
           
            //creamos el nodo que se llame aux
             Nodo aux = new Nodo(personita);
            //le ponemos que el next de aux sea la cabaza
            aux.setNext(cabeza);
            //le especificamos que el back de aux que sea el ultimo
            aux.setBack(ultimo);
            //tenmos que hacer que cabeza back apunte a aux 
            cabeza.setBack(aux);
            //tenemos que hacer que el ultimo next apunte a aux
            ultimo.setNext(aux);
            //hacemos que aux sea nueva cabeza
            cabeza=aux;
        } else if (personita.getId() >= ultimo.getDato().getId()) {

            //en caso para 3 o mas, para insertar de ultimo
            //creamos el nodo aux y le insertamos el nuevo dato
             Nodo aux = new Nodo(personita);
            //ultimo setnext aux
            ultimo.setNext(aux);
            //aux setback ultimo
            aux.setBack(ultimo);
            //ultimo es aux
            ultimo=aux;
            //ultimo set next cabeza
            ultimo.setNext(cabeza);
            //cabeza set back ultimo
            cabeza.setBack(ultimo);
       
        }else{//en caso de en medio
            
//            en caso de insertar en medio
              Nodo nuevoNodo = new Nodo(personita); 
//            nodo aux es cabeza
              Nodo aux = cabeza;
              while(aux.getDato().getId()< nuevoNodo.getDato().getId()){
               aux=aux.getNext();
              }
              //usamos el back de aux como referencia
              Nodo auxAnterior= aux.getBack();
              //unimos el next de auxAterior de referencia con el nuevo nodo
              auxAnterior.setNext(nuevoNodo);
               //unimos el back de nuevoNodo con el auxAnterior de referencia
              nuevoNodo.setBack(auxAnterior);
              //unimos el next de nuevoNodo con el aux 
              nuevoNodo.setNext(aux);
               //unimos el back de aux con el nuevoNodo
              aux.setBack(nuevoNodo);
        }
    }

    public void metodoModificadoDavid(Persona personitaInsertada) {

        if (cabeza == null) {//si la lista esta vacia solo queda asigndar el nodo con los parametros y listo  
            cabeza = new Nodo(personitaInsertada);//mando el nodo a cabeza
            ultimo = cabeza;//lo igualo la cabeza 
            ultimo.setNext(cabeza);//enlazo el ultimo a la cabeza 
            cabeza.setBack(ultimo);//enlazo el primero al ultimo, y ahi es donde la lista se vuelve ciercular 
        } else if (personitaInsertada.getId() > cabeza.getDato().getId()) {
            // si lo que voy a insertar esta a la izquiera de la cabeza (en otras palabras ir a back y no a next)
            Nodo aux = new Nodo(personitaInsertada);//creo el nodo auxiliar con el parametro recien creado
            aux.setNext(cabeza);//pongo el valor aux y le pongo que la cabeza es el siguiente, coloco aux a la izquierda de la cabeza
            cabeza = aux; //cabeza ahora referencia al nuevo elemento 
            ultimo.setNext(cabeza);//enlazo el ultimo con la cabeza
            cabeza.setBack(ultimo);//enlazo cabeza con el ultimo (circular)
        } else if (ultimo.getDato().getId() <= personitaInsertada.getId()) {
            //si debo insertar  al final de la lista 
            ultimo.setNext(new Nodo(personitaInsertada));//llamo al next del ultimo directamente y le pongo un nodo nuevo ahi 
            ultimo = ultimo.getNext();//ultimo se actualiza en nuevo nodo 
            ultimo.setNext(cabeza);//enlazo ultimo a la cabeza (circular)
            cabeza.setBack(ultimo);// enlazo cabeza al ultimo (circular)   
        } else {
            Nodo aux = cabeza;//defino aux como cabeza
            //mientras el dato del siguiente sea menor que el dato que voy a insertar,
            //insertar avance en la lista

            while (aux.getNext().getDato().getId() < personitaInsertada.getId()) {
                aux = aux.getNext();
            }
            // ya una vez ubicado procede a hacer el enlazamiento que corresponde
            Nodo temp = new Nodo(personitaInsertada);// creo nodo temp para crear el nodo con p
            temp.setNext(aux.getNext());// enlazo temp al siguiente de aux
            temp.setBack(aux);//enlazo temp al de atras
            aux.setNext(temp);//enlazo el siguiente de aux como temp
            temp.getNext().setBack(temp);// enlazo el siguiente de temp
        }
    }

    @Override
    public String toString() {
        Nodo aux = cabeza;

        String s = "Lista: \n";
        if (aux != null) {
            s += "back: " + aux.getBack() + ",\n";
            s += "Nodo actual: " + aux + ",\n ";
            s += "Next: " + aux.getNext() + ",\n";
            s += "--------------------------\n";
            aux = aux.getNext();
            while (aux != cabeza) {

            s += "back: " + aux.getBack() + ",\n";
            s += "Nodo actual: " + aux + ",\n ";
            s += "Next: " + aux.getNext() + ",\n";
            s += "--------------------------\n";
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;
    }
    
   public String toStringcopia(){
       Nodo aux=cabeza;
       String s="Lista: ";
       if (aux!=null) {
           s+=aux+", ";
           aux=aux.getNext();
           
           while(aux!=cabeza){
           s+=aux+", ";
           aux = aux.getNext();
           
           }
           
           
       }else{s += "vacia";
       
       }
       
       return s;
   }    
    
}
