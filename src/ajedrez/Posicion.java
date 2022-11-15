package icc.ajedrez;
import java.lang.IllegalArgumentException; //Clase que nos ayudara a indicar que el valor recibido no es el esperado.

/**
 * Clase que representa la posición de una pieza en
 * el tablero de ajedrez.
 */
public class Posicion {
    public int renglon; //Atributo renglon
    public char columna; //Atributo columna

    public Posicion (){
        this.renglon =0;
        this.columna = 0;
    }

    public Posicion(int renglon, char columna){ //Método constructor que asigna valores a los atributos de clase
        if (renglon <= 8){
            this.renglon = renglon;
        }
        else {
            throw new IllegalArgumentException("No es un argumento valido"); }


        int col=columna;
        if(col>96 && col<105){
            this.columna=columna;
        }
        else {
            throw new IllegalArgumentException("No es un argumento valido"); }

    }

    //Métodos getters

    public int getRenglon(){
        return this.renglon;
    }

    public char getColumna(){
        return this.columna;
    }

    //Métodos setters

    public void setRenglon(int renglon){
        if (renglon <= 8){
            this.renglon = renglon;
        }
        else {
            throw new IllegalArgumentException("No es un argumento valido"); }
        
    }
    

    public void setColumna(char columna){
        int col=columna;

        if(col>96 && col<105){
            this.columna=columna;
        }
        else {
            throw new IllegalArgumentException("No es un argumento valido"); }


    }

    public String toString(){
        return "Renglon:" + this.renglon + "  Columna:" + this.columna; 
    }


}
