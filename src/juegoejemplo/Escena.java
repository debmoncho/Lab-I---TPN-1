/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoejemplo;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Escena {
    private Auto auto;
    private Pared pared;

    public Escena(Auto auto) {
       this.auto=auto;
       pared=new Pared();
    }
    
    public void Jugar(){
    Scanner leer=new Scanner(System.in);
//        System.out.println("Ingese la Direccion");
    String op;
    System.out.println("Ingese la Direccion");
     op=leer.nextLine();
       boolean choco=false;
 while(!op.equals("E")){
      switch(op){
        case "A":
            if (auto.getPosX()!=pared.getPosX()) {
              auto.moverIzquierda();
               System.out.println("Posicion "+" X "+auto.getPosX()+" Y "+auto.getPosY());              
              break;               
            } else{               
//                System.out.println("El auto choco");
//                choco=true;                
            }break;            
        case "D":
            if (auto.getPosX()!=pared.getPosX()) {
              auto.moverDerecha();
               System.out.println("Posicion "+" X "+auto.getPosX()+" Y "+auto.getPosY());              
              break;             
            } else{
//                System.out.println("El auto choco");
//                choco=true;
            }break;  
        case "W":
            if (auto.getPosY()!=pared.getPosY()) {
              auto.moverArriba();
                System.out.println("Posicion "+" X "+auto.getPosX()+" Y "+auto.getPosY());
              break; 
  
            } else{
//                System.out.println("El auto choco esta en y");
//                choco=true;
            }break;
        case "S":
            if (auto.getPosY()!=pared.getPosY()) {
              auto.moverAbajo();
               System.out.println("Posicion "+" X "+auto.getPosX()+" Y "+auto.getPosY());
              break;  
            }else{
//                System.out.println("El auto choco");
//                choco=true;
            }break; 
        case "E":
            break;
          default:
        System.out.println("La letra ingresada no es valida. No se puede mover");
        
        break;
        }      
          System.out.println("La pared se encuentra en x "+pared.getPosX()+" y en Y "+pared.getPosY());
          if (auto.getPosX()==pared.getPosX()&&auto.getPosY()==pared.getPosY()) {
         choco=true;
     }
     if (choco==true) {
           System.out.println("El auto choco. No se puede mover");
         break;
     }
          System.out.println("Ingese la Direccion");
            op=leer.nextLine();
            
    }
    
 }
            
}
