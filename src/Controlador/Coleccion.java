
package Controlador;


import Modelo.Libro;
import Modelo.LibroInternacional;
import Modelo.LibroNacional;
import Modelo.RevistaDeOcio;
import Modelo.RevistaEspecializada;
import Modelo.Revistas;
import java.util.ArrayList;
import javax.swing.JTable;

public class Coleccion {
    private ArrayList  lista;
    
    public Coleccion(){
        lista=new ArrayList <Object>();
    }
    //ABM
    public void Agregar(Object agregar){
        lista.add(agregar);
    }
    public boolean existe(int codigo){
        boolean existe=false;
        for (Object aux:lista)
        {
            if (aux instanceof Libro)
            {
                if (((Libro) aux).getCodigo()==codigo)
                {
                    existe=true;
                    break;
                } 
            }else if(aux instanceof Revistas){
                if (((Revistas) aux).getCodigo()==codigo)
                {
                    existe=true;
                    break;
                }
            }
        }
        return existe;
    }
    
    public void modificar(int codigo, double nuevoprecio){
        for (Object aux:lista)
        {
            if (aux instanceof Libro)
            {
                if (((Libro) aux).getCodigo()==codigo)
                {
                    ((Libro) aux).setPrecioBase(nuevoprecio);
                } 
            }else if(aux instanceof Revistas){
                if (((Revistas) aux).getCodigo()==codigo)
                {
                    ((Revistas) aux).setPrecioBase(nuevoprecio);
                }
            }
        }
    }
    
    public void eliminar(int codigo){
        for (Object aux:lista)
        {
            if (aux instanceof Libro)
            {
                if (((Libro) aux).getCodigo()==codigo)
                {
                    ((Libro) aux).setEstado('P');
                } 
            }else if(aux instanceof Revistas){
                if (((Revistas) aux).getCodigo()==codigo)
                {
                    ((Revistas) aux).setEstado('P');
                }
            }
        }
    }
    //Libro
    public String [][] ListaPreciosLibro(){
        
        int cant=0;
        
        for (Object aux:lista)
        {
            if (aux instanceof Libro)
            {
                if (((Libro) aux).getEstado() != 'P') {
                    cant++;
                }
            }
        }
        String mostrar[][] = new String[cant][3];
        int pos = 0;
        for (Object aux : lista) {
            if (aux instanceof Libro) {
                if (((Libro) aux).getEstado() != 'P') {
                    mostrar[pos][0] = ((Libro) aux).getCodigo() + "";
                    mostrar[pos][1] = ((Libro) aux).getDescripcion() + "";
                    mostrar[pos][2] = ((Libro) aux).precioDeVenta() + "";
                    pos++;
                }
            }
        }

        return mostrar;
    }

    public String [][] StockInternacionales(){
        String mostrar="";
        int cont=0;
        String tabla[][];
        int acu=0;
        for (Object aux:lista)
        {
            if (aux instanceof LibroInternacional)
            {
                cont++;
               }
        }
      
        tabla=new String [cont][3];
        int pos=0;
        
        for (Object aux:lista)
        {
            if (aux instanceof LibroInternacional)
            {
                tabla [pos][0]=((LibroInternacional) aux).getCodigo()+"";
                tabla [pos][1]=((LibroInternacional) aux).getDescripcion();
                tabla [pos][2]=((LibroInternacional) aux).getStock()+"";
                pos++;
            }
        }
        return tabla;
                
    }
    
    public String[][] LibrosNacionalesPrecioMayorA(double precio){
        String mostrar[][];
        int cont=0;
        for (Object aux:lista)
        {
            if (aux instanceof LibroNacional)
            {
                if (((LibroNacional) aux).precioDeVenta()>precio)
                {
                    cont++;
                }
            }
        }
        int pos=0;
        mostrar=new String [cont][3];
        
        for (Object aux:lista)
        {
            if (aux instanceof LibroNacional)
            {
                if (((LibroNacional) aux).precioDeVenta()>precio)
                {
                    mostrar[pos][0]=((LibroNacional) aux).getCodigo()+"";
                    mostrar[pos][1]=((LibroNacional) aux).getDescripcion();
                    mostrar[pos][2]=((LibroNacional) aux).precioDeVenta()+"";
                    pos++;
                }
            }
        }
        return mostrar;
    }
    
    public double PorcentajeLibrosInternacionales(){
        int contlibro=0,continternacionales=0;
        for (Object aux:lista)
        {
            if ( aux instanceof Libro)
            {
                contlibro++;
                if (aux instanceof LibroInternacional)
                {
                    continternacionales++;
                }
            }
        }
        double a=continternacionales;
        double b=contlibro;
        return (a/b)*100;
    }      
    
    public double PromedioNacionales(){
        double sumaprecio=0;
        int cont=0;
        for (Object aux:lista)
        {
            if (aux instanceof LibroNacional)
            {
                sumaprecio+=((LibroNacional) aux).precioDeVenta();
                cont++;
            }
        }
        return sumaprecio/cont;
    }
    
    public String NacionalMasCostoso(){
        String mostrar="";
        double preciomayor=0;
        for (Object aux:lista)
        {
            if (aux instanceof LibroNacional)
            {
                if (((LibroNacional) aux).precioDeVenta()>preciomayor)
                {
                    mostrar=aux.toString();
                    preciomayor=((LibroNacional) aux).precioDeVenta();
                }
            }
        }      
        return mostrar;
    }
    
    public double PorcentajeLibrosInternacionalesPrecioMayorA(double precio){
        int contlibro=0,continternacionales=0;
        for (Object aux:lista)
        {
            if (aux instanceof LibroInternacional)
            {
                contlibro++;
                if (((LibroInternacional) aux).precioDeVenta()>precio)
                {
                    continternacionales++;
                }
            }
        }
        double a=continternacionales;
        double b=contlibro;
        return (a/b)*100;
    } 
    
    //Revistas
    
    public String ListaPrecioRevista(){
        String mostrar="";
        for (Object aux:lista)
        {
            if (aux instanceof Revistas)
            {
                if (((Revistas) aux).getEstado()!='P')
                {
                    mostrar+=aux.toString()+"\n";
                }
            }
        }
        return mostrar;
    }
    
    public String StockOcio(){
        String mostrar="";
        int acu=0;
        for (Object aux:lista)
        {
            if (aux instanceof RevistaDeOcio)
            {
                mostrar+=((RevistaDeOcio) aux).toStringStock()+"\n";
                acu++;
            }
        }
        mostrar += "\nTotal:     "+acu+" unidades";
        return mostrar;
    }
    
    public String RevistasPrecioMayorA(double precio){
        String mostrar="";
        int cont=0;
        for (Object aux:lista)
        {
            if (aux instanceof RevistaEspecializada)
            {
                if (((Revistas) aux).precioDeVenta()>precio)
                {
                    mostrar+= aux.toString()+"\n";
                    cont++;
                }
            }
        }
        String mostrar2="Hay "+cont+" Revistas con precio mayor a: $"+precio+"\n\n"+mostrar;
        return mostrar2;
    }
    
    public String porcentajes(){
       String mostrar="";
       int cantocio=0,cantesp=0, canttot=0;
        for (Object aux:lista)
        {
            if (aux instanceof RevistaDeOcio)
            {
                cantocio++;
                canttot++;                
            }else if (aux instanceof RevistaEspecializada)
            {
                cantesp++;
                canttot++;
            }
        }
        double porcentajeOcio=(cantocio/canttot)*100;
        double porcentajeEsp= (cantesp/canttot)*100;
        mostrar = "Porcentaje de revistas de ocio: "+String.format("%.02f", porcentajeOcio)+"%\nPorcentaje de revistas especializadas: "+String.format("%.02f", porcentajeEsp)+"%";
       return mostrar;
    }
    
        public double PromedioOcio(){
            int cont=0;
            double acu=0;
            for (Object aux:lista) {
                if (aux instanceof RevistaDeOcio) {
                    cont++;
                    acu+=((RevistaDeOcio) aux).precioDeVenta();
                }
            }
            return acu/cont;
        }
    
        public String RevistaMasCostosa(){
            String mostrar="";
            double mayorprecio=0;
            for (Object aux:lista) {
                if (aux instanceof Revistas) {
                    if (((Revistas) aux).precioDeVenta()>mayorprecio) {
                        mostrar=aux.toString();
                        mayorprecio=((Revistas) aux).precioDeVenta();
                    }
                }
            }
            return mostrar;
        }   
}

    