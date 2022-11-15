package icc.ajedrez;
import java.util.ArrayList;
public abstract class Pieza extends Posicion {
    protected Posicion posicion;

    public Pieza (int renglon, char columna){
        posicion = new Posicion (renglon, columna);
    }


    public abstract ArrayList <Posicion> posiblesMovimientos();
    public abstract boolean esValida(int renglon, char columna);
    public abstract String toString();

    public void setRenglon(int renglon){
        posicion.setRenglon(renglon);
    }

    public void setColumna(char columna){
        posicion.setColumna(columna);
    }

    public int getRenglon(){
        return posicion.getRenglon();
    }

    public char getColumna(){
        return posicion.getColumna();
    }

    


} 

    