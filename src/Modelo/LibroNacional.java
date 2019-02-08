
package Modelo;

public class LibroNacional extends Libro {
    private String provinciaOrigen;

    public LibroNacional(String provinciaOrigen, int stock, int tipo, String descripcion, double precioBase, char estado) {
        super(stock, tipo, descripcion, precioBase, estado);
        this.provinciaOrigen = provinciaOrigen;
    }

    

    public LibroNacional() {
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public void setProvinciaOrigen(String provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
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

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
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
    public double precioDeVenta() {
        double precioVenta=0;
        if (this.tipo==0)
        {
            precioVenta= this.precioBase+40;
        }else if(this.tipo==1){
            precioVenta= this.precioBase+50;
        }
        return precioVenta;        
    }

    @Override
    public String toString() {
        return "Codigo: "+String.format("%04d", this.codigo)+"     Titulo: "+this.descripcion+"     Precio: $"+precioDeVenta();
    }
    
            
    
}
