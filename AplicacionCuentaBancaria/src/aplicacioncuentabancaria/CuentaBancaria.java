/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncuentabancaria;

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
        this.entidad = entidad;
        this.oficina = oficina;
        this.digitos_de_control = digitos_de_control;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }
    
    //mostrar en paso1 que es motrar el numero de cuenta completo
    
    public String mostrarNCUENTA(){
        String a="";
        
        a+="\n" + nombre_titular +" > > "+ numerocuenta + "\n";
        
        return a;
    }
    
       public String mostrarSALDO(){
        String a="";
        
        a+="\n" + nombre_titular +" > > "+ saldo +"€ \n";
        
        return a;
    }

  
    
    
    
    
}
