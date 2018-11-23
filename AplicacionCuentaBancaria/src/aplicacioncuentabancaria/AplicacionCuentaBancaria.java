/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncuentabancaria;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AplicacionCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
           boolean bandera = true;
      
        
        //inicializar el juego
        
      
        
       do{
        Scanner leerprincipio = new Scanner(System.in);    
        int nmenu;  
        Menu.mostrarMenu();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
        
        
        switch(nmenu){
            
            case 1:
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                break;
            
            case 2:
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                break;
            
            case 3:
                
                  System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                
                break;
            
            case 4:
               
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                break;
                
            case 5:
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                break;
                
            case 6:
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                break;
            
            case 7:
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                break;
            
            case 8:
                
                  System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                
                break;
            
            case 9:
               
                System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                break;
                
            case 10:
                
                  System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                System.out.println("Saliendo...");  
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                bandera=false;
                
                break;
            
            
        }
           
       }while(bandera!=false);
        
        
        
    }
    
}
