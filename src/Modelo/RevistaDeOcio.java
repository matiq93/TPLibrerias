
package Modelo;

public class RevistaDeOcio extends Revistas{
    
    private String AyNPersonaje;

    public RevistaDeOcio(String AyNPersonaje, int stock, int tiempoDePublicacion, double precioBase, String nombre, char estado) {
        super(stock, tiempoDePublicacion, precioBase, nombre, estado);
        this.AyNPersonaje = AyNPersonaje;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

   

    public RevistaDeOcio() {
    }

    public String getAyNPersonaje() {
        return AyNPersonaje;
    }

    public void setAyNPersonaje(String AyNPersonaje) {
        this.AyNPersonaje = AyNPersonaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getTiempoDePublicacion() {
        return tiempoDePublicacion;
    }

    public void setTiempoDePublicacion(int tiempoDePublicacion) {
        this.tiempoDePublicacion = tiempoDePublicacion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
           
    @Override
    public double precioDeVenta() {
        double precioVenta=0;
        switch (this.tiempoDePublicacion){
            case 0:{
               precioVenta= this.precioBase*1.1;
               break;
            }
            case 1:{
               precioVenta= this.precioBase*1.12;
               break; 
            }
            case 2:{
               precioVenta= this.precioBase*1.25;
               break;
            }
        }
        return precioVenta;
    }

    @Override
    public String toString() {
        return "Codigo: "+String.format("%04d", this.codigo)+"     Titulo: "+this.nombre+"     Precio: $"+String.format("%.2f",precioDeVenta());
    }
    
    
}
