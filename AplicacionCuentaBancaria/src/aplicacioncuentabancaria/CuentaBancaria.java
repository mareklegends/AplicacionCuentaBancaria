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
        validarCuentaBancaria();
      
        this.saldo = saldo;
    }
    
    
    //validar numero de la cuenta bancaria
    
    private void validarCuentaBancaria(){ 
        
            if (this.numerocuenta.length()==20) {

                entidad = numerocuenta.substring(0, 4);
                oficina = numerocuenta.substring(4, 8);
                digitos_de_control = numerocuenta.substring(8, 10);
                cuenta = numerocuenta.substring(10, 20);

            }else{
                while (this.numerocuenta.length()!=20) {
                    
                    System.out.println("Pon los 20 digitos, el número de cuenta noes valido");
                    Scanner leerdigitos = new Scanner(System.in);
                    numerocuenta = leerdigitos.nextLine();
                    
                }
                
                entidad = numerocuenta.substring(0, 4);
                oficina = numerocuenta.substring(4, 8);
                digitos_de_control = numerocuenta.substring(8, 10);
                cuenta = numerocuenta.substring(10, 20);  
                
        }
        
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
       
       //sacar el codigo de entidad
       
       public String mostrarEntidad(){
           String mentidad="";
           
           mentidad+="\n" + entidad + "\n";
           
           return mentidad;
                   
       }
       
       //sacar la oficina
       
       public String mostrarOficina(){
           String moficina="";
           
           moficina+="\n" + oficina + "\n";
           
           return moficina;
                   
       }
       
             //sacar el ncuenta
       
       public String mostrarNumeroCUENTA(){
           String mncuenta="";
           
           mncuenta+="\n" + cuenta + "\n";
           
           return mncuenta;
                   
       }
       
            //sacar los digitos de control
       
       public String mostrarNCONTROL(){
           String mncontrol="";
           
           mncontrol+="\n" + digitos_de_control + "\n";
           
           return mncontrol;
                   
       }
       
       //para la realizacion del ingreso
       public void meterDINERO(double dinero){
           
           saldo+=dinero;
           
           
       }
    
       //para sacar el dinero
       
        public String sacarDINERO(double dinero){
       
            String info="";
            
            if (dinero>saldo) {
                saldo-=dinero;
                info+="Acción hecha con exito";
                
            } else {
               
                info+="No tienes suficiente dinero";
             
            }
            
           return info;
           
           
       }
        
        
        public void calcularDigitosControl(){
            
            
            
            
            
        }
    
    
    
    
}
