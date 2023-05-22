package collections.servicio;

import collections.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PeliculaServicio {
    
    /**
     * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
        todos sus datos y guardándolos en el objeto Pelicula.
        Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
        crear otra Pelicula o no.
     */
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas = new ArrayList();
    
    public ArrayList crearPelicula(){
        
        String aux ;
        do{
            
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = sc.next();
            System.out.println("Ingrese el director de la pelicula");
            String director = sc.next();
            System.out.println("Ingrese la duracion del a pelicula en horas");
            Double hora = sc.nextDouble();
            
            Pelicula p = new Pelicula(titulo,director,hora);
            peliculas.add(p);
            
            System.out.println("Desea ingresar otra pelicula? si/no");
            aux = sc.next();
        }while(aux.equalsIgnoreCase("si"));
        
        return peliculas;
    }
    
    /**
     * Mostrar en pantalla todas las películas.
        • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
        pantalla.
        • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
        pantalla.
        • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
        • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    
    public void mostrarPeliculas(){
        
        System.out.println(peliculas.toString());
    }
    
    public void mostrarPeliculaHora(){

        ArrayList<Pelicula> maslargaquesperanzadepobre = new ArrayList();
            
        System.out.println("----Peliculas de mas de una hora------");
        
        for (Pelicula peli : peliculas) {
            
            if(peli.getDuracion()>1){
                maslargaquesperanzadepobre.add(peli);
                
            }
        
        }
           
        System.out.println(maslargaquesperanzadepobre.toString());


    }
    
    public void ordenarPelicula(){
        
        System.out.println("Ordenar peliculas por duracion de manera descendente");
        Collections.sort(peliculas, Pelicula.comprarDuracionDesc);
        mostrarPeliculas();
    }
    
    public void ordenarPeliculaAsc(){
        
        System.out.println("Ordenar peliculas por duracion de manera ascendente");

        Collections.sort(peliculas, Pelicula.comprarDuracionAsc);
        mostrarPeliculas();
    }
     public void ordenarDirector(){
         
         
        System.out.println("Ordenar peliculas por director");

        Collections.sort(peliculas, Pelicula.comprarDirector);
        mostrarPeliculas();
    }
      public void ordenarTitulo(){
          
        System.out.println("Ordenar peliculas por titulo");

        Collections.sort(peliculas, Pelicula.comprarTitulo);
        mostrarPeliculas();
    }
}
