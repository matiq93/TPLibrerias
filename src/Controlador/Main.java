
package Controlador;

import Modelo.LibroInternacional;
import Modelo.LibroNacional;
import Modelo.RevistaDeOcio;
import Modelo.RevistaEspecializada;

import Vista.VistaPrincipal;


public class Main {

    public static Coleccion lista;
    
    public static void main(String[] args) {
        lista=new Coleccion();
        lista.Agregar(new LibroNacional("Cordoba",  5, 1, "geografia", 155, 'A'));
        lista.Agregar(new LibroInternacional("España", 5, 0, "historia", 300, 'A'));
        lista.Agregar(new RevistaEspecializada("jardineria",  5, 0, 75, "jardineria", 'A'));
        lista.Agregar(new RevistaDeOcio("Angel",  2, 0, 50, "algo 1", 'A'));
        lista.Agregar(new LibroNacional("Mendoza",  7, 0, "geografia", 123, 'A'));
        lista.Agregar(new LibroInternacional("Francia",  3, 1, "historia",150, 'A'));
        lista.Agregar(new RevistaEspecializada("cocina",  3, 1, 50, "cocina", 'A'));
        lista.Agregar(new RevistaDeOcio("David",  3, 1, 65, "algo 2", 'A'));
        lista.Agregar(new LibroNacional("Cordoba",  3, 0, "geografia", 240, 'A'));
        lista.Agregar(new LibroInternacional("España",  3, 1, "historia", 250, 'A'));
        lista.Agregar(new RevistaEspecializada("economia",  4, 2, 66, "economia", 'A'));
        lista.Agregar(new RevistaDeOcio("matias",  1, 2, 25, "algo 3", 'A'));
        
        new VistaPrincipal().setVisible(true);
    }
    
}
