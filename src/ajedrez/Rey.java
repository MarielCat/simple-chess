package icc.ajedrez;
import java.util.ArrayList;

public class Rey extends Pieza{
    
      public Rey (int renglon, char columna){//Creamos nuestro método que tendra los mismos parametros que su clase padre 
        super (renglon, columna); //Con la palabra reservada super invocamos al método constructor de una clase superior 
        
}
    public ArrayList <Posicion> posiblesMovimientos() {  //Hacemos nuestra lista del tipo Posicion
        ArrayList<Posicion> x=new ArrayList<Posicion>();
       for(int i=1;i<9;i++){
       for(int j=1;j<9;j++){
       char b = (char)(j+96);
       if(this.esValida(i,b)){ //Seguimos el mismo esquema de Reina y caballo
       x.add(new Posicion(i,b));
       }
       }
       } 
      return x;  
        
    }
    public boolean esValida(int renglon, char columna) { //El método esValida es donde se diferencia de las otras
        int a1=super.getColumna();
        int a2=columna;
        a1=a1-96;
        a2=a2-96;
        try {
        Posicion p=new Posicion(renglon,columna);    
        } catch (Exception e) {
            System.out.println("Lugar fuera del tablero");
            return false;
        }
        
    if((this.getRenglon()==renglon) && (a1==a2)){ //Tenemos condiciones diferentes para determinar si es válida 
        return true;
    }else{
           
           if(((a2-a1)<=1) && (renglon-this.getRenglon())<=1){
           return true;
           }
    }
    return false;
    }

    public String toString() { // Convertimos nuestros valores a texto
    return "Rey: ("+this.getRenglon()+", "+this.getColumna() + ")";
    }
   
}