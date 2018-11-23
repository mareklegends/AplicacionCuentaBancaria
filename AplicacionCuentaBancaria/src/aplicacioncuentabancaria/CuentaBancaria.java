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
    
    private int entidad;
    private int oficina;
    private int digitos_de_control;
    private int cuenta;
    
    private int saldo;
    
    private int ncuenta;
    
    //añadir una cuenta

    public CuentaBancaria(String nombre_titular, int entidad, int oficina, int digitos_de_control, int cuenta, int saldo) {
        this.nombre_titular = nombre_titular;
        this.entidad = entidad;
        this.oficina = oficina;
        this.digitos_de_control = digitos_de_control;
        this.cuenta = cuenta;
        this.saldo = saldo;
        ncuenta = entidad + oficina + digitos_de_control + cuenta;
    }

  
    
    
    
    
}
