
package Modelo;

public class RevistaEspecializada extends Revistas {
    private String tema;

    public RevistaEspecializada(String tema, int codigo, int stock, int tiempoDePublicacion, double precioBase, String nombre, char estado) {
        super(codigo, stock, tiempoDePublicacion, precioBase, nombre, estado);
        this.tema = tema;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

   

    public RevistaEspecializada() {
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
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
               precioVenta= this.precioBase+40;
               break;
            }
            case 1:{
               precioVenta= this.precioBase+50;
               break; 
            }
            case 2:{
               precioVenta= this.precioBase+80;
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
