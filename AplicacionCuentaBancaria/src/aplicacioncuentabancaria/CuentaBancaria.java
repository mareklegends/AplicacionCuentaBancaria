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
        
    private boolean confirmarCuenta(){
        boolean confirmado=false;
        int resultado=0;
        int codigo1=11;
        int codigo2=11;
        int codigototal=0;
       resultado+=(Integer.parseInt(entidad.substring(0,1))*4); 
       resultado+=(Integer.parseInt(entidad.substring(1,2))*8); 
       resultado+=(Integer.parseInt(entidad.substring(2,3))*5); 
       resultado+=(Integer.parseInt(entidad.substring(3,4))*10); 
       resultado+=(Integer.parseInt(entidad.substring(0,1))*9);
       resultado+=(Integer.parseInt(entidad.substring(1,2))*7);
       resultado+=(Integer.parseInt(entidad.substring(2,3))*3);
       resultado+=(Integer.parseInt(entidad.substring(3,4))*6);
       resultado=resultado%11;
       codigo1-=resultado;
        if (codigo1==10) {
            codigo1=1;
        }
        if (codigo1==11) {
            codigo1=0;
        }
        resultado=0;
        resultado+=(Integer.parseInt(cuenta.substring(0,1))*1);
        resultado+=(Integer.parseInt(cuenta.substring(1,2))*2);
        resultado+=(Integer.parseInt(cuenta.substring(2,3))*4);
        resultado+=(Integer.parseInt(cuenta.substring(3,4))*8);
        resultado+=(Integer.parseInt(cuenta.substring(4,5))*5);
        resultado+=(Integer.parseInt(cuenta.substring(5,6))*10);
        resultado+=(Integer.parseInt(cuenta.substring(6,7))*9);
        resultado+=(Integer.parseInt(cuenta.substring(7,8))*7);
        resultado+=(Integer.parseInt(cuenta.substring(8,9))*3);
        resultado+=(Integer.parseInt(cuenta.substring(9,10))*6);
        resultado=resultado%11;
        codigo2-=resultado;
          if (codigo2==10) {
            codigo2=1;
        }
        if (codigo2==11) {
            codigo2=0;
        }
        codigototal=(codigo1*10)+(codigo2);
        if (codigototal==Integer.parseInt(digitos_de_control)) {
            confirmado=true;
        }else{
            this.numerocuenta="";
        }
        return confirmado;
    }   
            
          
            
            
  
    
    
    
    
}
