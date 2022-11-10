
package Ejercicio1;

public class Dato {
    char datoChar;
    int index;

    public Dato() {
    }

    public Dato(char datoChar, int index) {
        this.datoChar = datoChar;
        this.index = index;
    }

    public char getDatoChar() {
        return datoChar;
    }

    public void setDatoChar(char datoChar) {
        this.datoChar = datoChar;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Dato{" + "datoChar=" + datoChar + ", index=" + index + '}';
    }
    
    
    
}
