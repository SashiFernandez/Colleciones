package collections.main;

import collections.servicio.PeliculaServicio;


public class PeliculaMain {
    
    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        ps.crearPelicula();
        ps.mostrarPeliculas();
        ps.mostrarPeliculaHora();
        ps.ordenarPeliculaAsc();
        ps.ordenarPelicula();
        ps.ordenarDirector();
        ps.ordenarTitulo();
    }
}
