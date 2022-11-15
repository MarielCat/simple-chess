package icc.ajedrez;

import java.util.ArrayList;
import java.util.Scanner;


public class UsoAjedrez {
 
    public static void main(String[] args) {
		
            Scanner sc =new Scanner(System.in);
       
	   System.out.println("Ingrese una posición");
            System.out.println("Renglon: ");
            int renPrueba=sc.nextInt();
            System.out.println("\nColumna: ");
            char colPrueba=sc.next().charAt(0);
                
            Caballo caballo= new Caballo(renPrueba,colPrueba);
		    Reina reina= new Reina(renPrueba,colPrueba);
            Rey rey= new Rey(renPrueba,colPrueba);     
                

            ArrayList<Posicion> movsCaballo=caballo.posiblesMovimientos();
            ArrayList<Posicion> movsReina=reina.posiblesMovimientos();
            ArrayList<Posicion> movsRey=rey.posiblesMovimientos();
                
            System.out.println("Movimientos válidos de Caballo:");
                System.out.println(movsCaballo);

            System.out.println("Movimientos válidos de Reina: ");
                System.out.println(movsReina);

            System.out.println("Movimientos válidos de Rey");
                System.out.println(movsRey);

                
            System.out.println("Ingrese posición a verificar: ");
            System.out.println("Renglon: ");
            int renVeri=sc.nextInt();
            System.out.println("\nColumna: ");
            char colVeri=sc.next().charAt(0);
                
            System.out.println("Renglon "+renVeri+" Columna "+colVeri);
            System.out.println("Reina:");
            System.out.println(reina.esValida(renVeri,colVeri)?"Es valido":"Es invalido");
            System.out.println("Caballo:");
            System.out.println(caballo.esValida(renVeri,colVeri)?"Es valido":" Es invalida");
             System.out.println("Rey:");
            System.out.println(rey.esValida(renVeri,colVeri)?"Es valido":"Es invalido");
		
                
	}
    
}
