package icc.ajedrez;
import java.util.ArrayList;   

public class Reina extends Pieza{
    public Reina (int renglon, char columna){ //Creamos nuestro método que tendra los mismos parametros que su clase padre 
        super (renglon, columna); //Con la palabra reservada super invocamos al método constructor de una clase superior 

    }

    public ArrayList <Posicion> posiblesMovimientos() {//Hacemos nuestra lista del tipo Posicion
        ArrayList<Posicion> lista=new ArrayList<Posicion>(); 
       for(int i=1;i<9;i++){ /*Tenemos dos iteradores que ambos nos serviran tanto para recorrer filas y columnas*/          
       for(int j=1;j<9;j++){ 
       char r = (char)(j+96);  //Convertimos a char y sumamos a las 96 posiciones de ascii
       if(this.esValida(i,r)){ // Con nuestro if compararemos si es válida 
       lista.add(new Posicion(i,r)); //Si la posición es válida la agregaremos a la lista
       }
       }
       } 
      return lista;  //Regresamos la lista 
} 

    public boolean esValida(int renglon, char columna) { //Declaramos nuestro método esValida
        int v1=super.getColumna(); //Llamamos de nuestra clase padre con super a getColumna.
        int v2=columna;
        v1=v1-96; // Hacemos que v1 y v2 tomen diferentes valores restandole la columna en ascii
        v2=v2-96;
        try {
        Posicion p=new Posicion(renglon,columna);    //Tratamos de crear nuestro objeto 
        } catch (Exception e) { //Si no puede ser creado imprimimos que esta fuera del tablero
            System.out.println("Lugar fuera del tablero");
            return false;
        }
        if((this.getRenglon()==renglon) && (v1==v2)){ //Hacemos nuestras condiciones para que sea válida
            return true;
        }else{
           
           if(this.getRenglon()==renglon){
           return true;
           }
           if(v2==v1){
           return true;
           }
           if((v2-v1)==(renglon-this.getRenglon())){
           return true;
           }
    }
    return false; //Si no se cumple regresamos falso
    }
    
        public String toString() { //Nuestro último método toString nos ayuda a convertirlo todo a texto
        return "Reina: ("+this.getRenglon()+", "+this.getColumna()+ ")";
        }

}
