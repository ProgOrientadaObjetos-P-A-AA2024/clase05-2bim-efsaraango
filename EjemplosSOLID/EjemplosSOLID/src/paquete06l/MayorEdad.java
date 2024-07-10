/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class MayorEdad extends Persona{
    private TarjetaCredito tarjeta;
    
    public MayorEdad(String n, TarjetaCredito tj){
        super(n);
        tarjeta = tj;
    }
    
    public void establecerTarjetaCredito(TarjetaCredito n){
        tarjeta = n;
    }
    
    public TarjetaCredito obtenerTarjetaCredito(){
        return tarjeta;
    }

    
}
