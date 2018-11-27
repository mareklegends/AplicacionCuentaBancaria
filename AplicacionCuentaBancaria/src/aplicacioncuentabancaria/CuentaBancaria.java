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
public class CuentaBancaria {
    
    private String nombre_titular;
    
    private String entidad;
    private String oficina;
    private String digitos_de_control;
    private String cuenta;

    private String numerocuenta;    
    
    private double saldo;   
    
    
    //añadir una cuenta

    public CuentaBancaria(String nombre_titular, String numerocuenta, double saldo) {
        
        if(nombre_titular.length()>19){
            this.nombre_titular = nombre_titular.substring(0, 19);
        }else{
            this.nombre_titular = nombre_titular; 
        }
        this.numerocuenta = numerocuenta;
      
        this.saldo = saldo;
    }
    
    
    //validar numero de la cuenta bancaria
    
    private boolean validarCuentaBancaria(){
        boolean bandera=false;
        
       
        
            if (numerocuenta.length()==20) {

                entidad = numerocuenta.substring(0, 4);
                oficina = numerocuenta.substring(5, 9);
                digitos_de_control = numerocuenta.substring(10, 11);
                cuenta = numerocuenta.substring(12, 20);

                bandera = true;

            }else{
                 while ( (numerocuenta.length()!=20) && (bandera=false) ) {
                     System.out.println("Pon los 20 digitos");
                     Scanner leerdigitos = new Scanner(System.in);
                     numerocuenta = leerdigitos.nextLine();
                 }
        }
        
        
        
        return bandera;
    }
    
    //mostrar en paso1 que es motrar el numero de cuenta completo
    
    public String mostrarNCUENTA(){
        String a="";
        
        a+="\n" + nombre_titular +" > > "+ numerocuenta + "\n";
        
        return a;
    }
    
    //sacar el saldo de la cuenta
    
       public String mostrarSALDO(){
        String a="";
        
        a+="\n" + nombre_titular +" > > "+ saldo +"€ \n";
        
        return a;
    }

  //sacar el titular de la cuenta
       
       public String mostrarTitular(){
           String titular="";
           
           titular+="\n" + nombre_titular + "\n";
           
           return titular;
                   
       }
    
    
    
    
}
