
package Modelo;

public abstract class Libro {
    protected static int aux=1;
    protected int  codigo,stock,tipo;
    protected String descripcion;
    protected double precioBase;
    protected char estado;

    public Libro( int stock, int tipo, String descripcion, double precioBase, char estado) {
        this.codigo = aux;
        this.stock = stock;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.estado = estado;
        aux++;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    

    public Libro() {
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "";
    }
    
   public  abstract double precioDeVenta();
    
    
}
