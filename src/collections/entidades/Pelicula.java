package collections.entidades;

import java.util.Comparator;

public class Pelicula {
    /**
     * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
        tendremos una clase Pelicula con el título, director y duración de la película (en horas).
        Implemente las clases y métodos necesarios para esta situación.
     */
    
    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula(){
        //Constructor vacio.
    }
    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator<Pelicula> comprarDuracionDesc = new Comparator<Pelicula>(){
    
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p2.getDuracion().compareTo(p1.getDuracion());
    }
    };
     public static Comparator<Pelicula> comprarDuracionAsc = new Comparator<Pelicula>(){
    
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getDuracion().compareTo(p2.getDuracion());
    }
    };
     
    public static Comparator<Pelicula> comprarDirector = new Comparator<Pelicula>(){
    
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getDirector().compareTo(p2.getDirector());
    }
    };
    
     public static Comparator<Pelicula> comprarTitulo = new Comparator<Pelicula>(){
    
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getTitulo().compareTo(p2.getTitulo());
    }
    };

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
}
