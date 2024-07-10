/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// implementes se utiliza para trabajar con interfaz  
package paquete08i;

/**
 *
 * @author reroes
 */
public class EvaluacionEnsayo implements EvaluacionTipoDos {

    private int numeroProblemas;
    private double totalProblemas;
    protected double promedioEnsayo;

    
    public void establecerNumeroProblemas(int n) {
        numeroProblemas = n;
    }

    public void establecerTotalProblemas(double n) {
        totalProblemas = n;
    }

    public int obtenerNumeroProblemas() {
        return numeroProblemas;
    }

    public double obtenerTotalProblemas() {
        return totalProblemas;
    }
    
    // estamos utilizando esos dos metodos por q esta clase esta utilizando
    // "implements" por lo tanto esta en la obligacion de utilizar estos metodos. 
    @Override
    public void establecerPromedioEnsayo() {

        promedioEnsayo = obtenerTotalProblemas() / obtenerNumeroProblemas();

    }

    @Override
    public double obtenerPromedioEnsayo() {
        return promedioEnsayo;

    }
    
}
