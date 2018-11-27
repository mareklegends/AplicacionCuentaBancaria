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
           CuentaBancaria nuevacuenta=null;
        
       do{
           
           
        if (empezar==false) {
            
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");    
           
            
            
        String nombre="";
        String numerocuenta="";
        double saldo=0.00;    
        
        System.out.println("Dime tu nombre");   
            Scanner leer1 = new Scanner(System.in);  
            nombre = leer1.nextLine();
        
        System.out.println("Dime el numero de cuenta");
            Scanner leer2 = new Scanner(System.in);        
            numerocuenta = leer2.nextLine();
           
            
        System.out.println("Dime el saldo de la cuenta");
            Scanner leer3 = new Scanner(System.in);        
            saldo = leer3.nextDouble();
            
        nuevacuenta = new CuentaBancaria(nombre, numerocuenta, saldo);
        
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
        
                 System.out.println(nuevacuenta.mostrarNCUENTA());
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
                
                
                break;
            
            case 2:
                
                 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
        
                 System.out.println(nuevacuenta.mostrarTitular());
                
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
        
                  System.out.println(nuevacuenta.mostrarSALDO());
                
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
