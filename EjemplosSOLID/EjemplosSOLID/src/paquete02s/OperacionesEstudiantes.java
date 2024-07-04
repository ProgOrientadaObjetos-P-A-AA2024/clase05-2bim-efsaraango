/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerEdadMinima() {
        edadminima = 100;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() < edadminima) {
                edadminima = estudiantes.get(i).obtenerEdad();
            }
        }
    }

    public void establecerEdadMaxima() {
        edadmaxima = 0; // Inicializamos a un valor mínimo posible
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() > edadmaxima) {
                edadmaxima = estudiantes.get(i).obtenerEdad();
            }
        }
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public void establecerListaCiudadesEstudiante() {
        String cadena = "";

        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%s\n%s", cadena, 
                    estudiantes.get(i).obtenerCiudad().obtenerNombre());
        }
        
        listaCiudadesEstudiantes = cadena;
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public int obtenerEdadMaxina() {
        return edadmaxima;
    }

    public int obtenerEdadMinima() {
        return edadminima;
    }
    
    public String obtenerListaCiudadesEstudiante(){
        return listaCiudadesEstudiantes;
    }

    @Override

    public String toString(){
        String cadena = String.format("Promedio de edad: %.2f\n"
                + "Edad Minima: %d\n"
                + "Edad Maxima: %d\n"
                + "Lista Ciudades: \n%s\n"
                , obtenerPromedioEdades()
                , obtenerEdadMinima()
                , obtenerEdadMaxina()
                , obtenerListaCiudadesEstudiante()
                );
        
        return cadena;
    
    }
    
}
