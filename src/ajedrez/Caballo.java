package icc.ajedrez;
import java.util.ArrayList;

public class Caballo extends Pieza{
    public Caballo (int renglon, char columna){
        super (renglon, columna);
        
}
    @Override
    public ArrayList <Posicion> posiblesMovimientos() {
        ArrayList<Posicion> x=new ArrayList<Posicion>();
       for(int i=1;i<9;i++){
       for(int j=1;j<9;j++){
       char b = (char)(j+96);
       if(this.esValida(i,b)){
       x.add(new Posicion(i,b));
       }
       }
       } 
      return x;  
        
    }
    public boolean esValida(int renglon, char columna) {
        int a1=super.getColumna();
        int a2=columna;
        a1=a1-96;
        a2=a2-96;
        try {
        Posicion p=new Posicion(renglon,columna);    
        } catch (Exception e) {
            System.out.println("Posición fuera del tablero");
            return false;
        }
        
    if((this.getRenglon()==renglon) && (a1==a2)){
        return true;
    }else{
           
           if(((a2-a1)==2) && (renglon-this.getRenglon())==1){
           return true;
           }
           if(((a2-a1)==1) && (renglon-this.getRenglon()==2)){
           return true;
           }
        }

    return false;
    }

    public String toString() {
    return "Caballo: "+this.getRenglon()+", "+this.getColumna();
    }

}
