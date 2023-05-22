package collections.entidades;

public class Tienda {
    private String nombre;
    private Double precio;

    public Tienda(){
        //Constructor vacio
    }
    public Tienda(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}
