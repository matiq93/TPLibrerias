
package Modelo;

public class LibroInternacional extends Libro {

    private String PaisOrigen;

    public LibroInternacional(String PaisOrigen,  int stock, int tipo, String descripcion, double precioBase, char estado) {
        super( stock, tipo, descripcion, precioBase, estado);
        this.PaisOrigen = PaisOrigen;
    }
   
    public LibroInternacional() {
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
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
    public double precioDeVenta() {
        double precioVenta=0;
        if (this.tipo==0)
        {
            precioVenta= (this.precioBase+40)*1.2;
        }else if(this.tipo==1){
            precioVenta= (this.precioBase+50)*1.2;
        }
        return precioVenta;   
    }

    @Override
    public String toString() {
        return "Codigo: "+String.format("%04d", this.codigo)+"     Titulo: "+this.descripcion+"     Precio: $"+precioDeVenta();
    }
    
    public String toStringStock(){
        return "Titulo: "+this.descripcion+"     Stock: "+this.stock+" unidad/es";
    }
    
}
