/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author Det-Pc
 */
public class TransporteMaritimo extends Transporte{
     private String cooperativaMaritimo;

    public void establecerCooperativaMaritimo(String n) {
        cooperativaMaritimo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 15.00 + 0.80;
    }

    public String obtenerCooperativaMaritimo() {
        return cooperativaMaritimo;
    }
}
