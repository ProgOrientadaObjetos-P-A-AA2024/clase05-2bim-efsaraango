/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        // TarjetaCredito t1 = new TarjetaCredito("Visa", "110011001");
        TarjetaCredito t1 = new TarjetaCredito();
        t1.establecerNombre("Visa");
        t1.establecerNumero("110011001");
        Banco b1 = new Banco();
        b1.establecerNombre("Banco");
        
        MayorEdad representante = new MayorEdad("José", t1, b1);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Tarjeta:%s - Nombre:%s\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjetaCredito()
                        .obtenerNumero(),
                menor.obtenerRepresentante().obtenerTarjetaCredito()
                        .obtenerNombre());

    }
}
