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
           boolean empezar = false;
      
        
        //inicializar el juego
        
        
        
           
        
      
        
       do{
           
           
        if (empezar==false) {
            
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");    
           
            
            
        String nombre="";
        int entidad=0;
        int oficina=0;
        int digitos_de_control=0;
        int cuenta=0;
        int saldo=0;    
        
        System.out.println("Dime tu nombre");   
            Scanner leer = new Scanner(System.in);        
            nombre = leer.nextLine();
        
        System.out.println("Dime tu entidad");
            Scanner leer1 = new Scanner(System.in);        
            entidad = leer1.nextInt();
        
        System.out.println("Dime tu ofcina");
            Scanner leer2 = new Scanner(System.in);        
            oficina = leer2.nextInt();
        
        System.out.println("Dime tus digitos de control");
            Scanner leer3 = new Scanner(System.in);        
            digitos_de_control = leer3.nextInt();
        
        System.out.println("Diem tu número de cuenta");
            Scanner leer4 = new Scanner(System.in);        
            cuenta = leer4.nextInt();
            
        CuentaBancaria nuevacuenta = new CuentaBancaria(nombre, entidad, oficina, digitos_de_control, cuenta, 0);
        
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        empezar = true;
            
            
        }   
           
           
           
        Scanner leerprincipio = new Scanner(System.in);    
        int nmenu;  
        Menu.mostrarMenu();
        System.out.println("Pulsa un número");
        nmenu = leerprincipio.nextInt(); 
        
                
        switch(nmenu){
            
            case 1:
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 System.out.println("Hola");
                
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
           
       }while(bandera!=false );
        
     
       
 
       
        
    }
    
}
