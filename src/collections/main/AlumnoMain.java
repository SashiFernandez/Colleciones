package collections.main;

import collections.servicio.AlumnoServicio;


public class AlumnoMain {
    
    public static void main(String[] args) {
        
        AlumnoServicio as = new AlumnoServicio();
        as.crearAlumno();
        as.notaFinal();
    }
}
