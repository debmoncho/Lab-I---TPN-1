
package juegoejemplo;

import java.util.Scanner;


public class JuegoEjemplo {

   
    public static void main(String[] args) {
        // TODO code application logic here
       Auto ford = new Auto("rojo", 10,5);
//        Pared pared= new Pared();
        Escena escena=new Escena(ford);
//      
//        for(int i=0;i<10;i++){
//            
//        }
    escena.Jugar();
        
//        System.out.println("Posicion de la pared "+pared.getPosX()+" "+pared.getPosY());
        System.out.println("Posicion(X,Y)"+ford.getPosX()+" "+ford.getPosY());
      
      
        
        
        
    }
    
}
