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
    
    //añadir una cuenta

    public CuentaBancaria(String nombre_titular, String entidad, String oficina, String digitos_de_control, String cuenta) {
        this.nombre_titular = nombre_titular;
        
        this.entidad = entidad;
        this.oficina = oficina;
        this.digitos_de_control = digitos_de_control;
        this.cuenta = cuenta;
    }
    
    
    
    
    
}
