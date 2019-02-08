
package Modelo;

public abstract class Revistas {
    protected int codigo, stock, tiempoDePublicacion;
    protected double precioBase;
    protected String nombre;
    protected char estado;

    public Revistas(int codigo, int stock, int tiempoDePublicacion, double precioBase, String nombre, char estado) {
        this.codigo = codigo;
        this.stock = stock;
        this.tiempoDePublicacion = tiempoDePublicacion;
        this.precioBase = precioBase;
        this.nombre = nombre;
        this.estado = estado;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    

    public Revistas() {
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
    public String toString() {
        return "";
    }
    public abstract double precioDeVenta();
    
}
