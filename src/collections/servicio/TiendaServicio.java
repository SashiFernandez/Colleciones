package collections.servicio;

import collections.entidades.Tienda;
import java.util.HashMap;
import java.util.Scanner;

public class TiendaServicio {
    
    HashMap<String, Tienda> productos;
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public TiendaServicio() {
        productos = new HashMap();
        
    }
    
    public Tienda introducirElemento() {
        
        Tienda t = new Tienda();
        
        System.out.println("Ingrese nombre del producto");
        String nombre = sc.next();
        System.out.println("Ingrese precio del producto");
        Double precio = sc.nextDouble();
        
        t.setNombre(nombre);
        t.setPrecio(precio);
        
        if (productos.containsKey(nombre)) {
            System.out.println("El producto existe");
        
        } else {
           
            productos.put(nombre, t);
            
            System.out.println("Producto creado");
        }
        
       return t;
    }
    
    public void modificarElemento() {
        
        
        System.out.println("Nombre del elemento a modificar");
        String nombre = sc.next();
        
        
        if(productos.containsKey(nombre)){
            Tienda t = new Tienda();
            System.out.println("El precio actual es: " + productos.get(nombre).getPrecio());
            
            System.out.println("Ingrese el nuevo valor del producto: ");
            Double nPrecio = sc.nextDouble();
            t.setPrecio(nPrecio);
            t.setNombre(nombre);
            productos.replace(nombre, t);
            
            System.out.println("Producto modificado");
        }else{
            System.out.println("El producto no existe");
        }
    }

    public void eliminarElemento() {
           
        System.out.println("Nombre del elemento a eliminar");
        String nombre = sc.next();
        
        if(productos.containsKey(nombre)){
            productos.remove(nombre);
            
            System.out.println("Producto eliminado");
        }else{
            System.out.println("El producto no existe");
        }
        
    }

    public void mostrarElemento() {
        
        System.out.println("Mostrar elementos");
        
        if(productos.isEmpty()){
            
            System.out.println("No existen productos");
            
        }else{
            
            for (Tienda t : productos.values()) {
            System.out.println(t.getNombre() + " " + t.getPrecio());
        }}
    }
}
