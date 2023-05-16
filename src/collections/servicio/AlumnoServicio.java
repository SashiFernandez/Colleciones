package collections.servicio;

import collections.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class AlumnoServicio {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList <Alumno> lalumno = new ArrayList();
    private ArrayList <Integer> nota = new ArrayList();
    
    /**
     * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
        toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        pregunta al usuario si quiere crear otro Alumno o no.
     */
    
    public void crearAlumno(){
        String nombre;
        Integer nota1,nota2,nota3;
        Alumno a;
        String aux;
        
    do{ 
        System.out.println("Ingrese nombre del alumno");
        nombre = sc.next();
        
        System.out.println("Ingrese la primer nota");
        nota1 = sc.nextInt();
        nota.add(nota1);
        
        System.out.println("Ingrese la segunda nota");
        nota2 = sc.nextInt();
        nota.add(nota2);
        
        System.out.println("Ingrese la tercer nota");
        nota3 = sc.nextInt();
        nota.add(nota3);
        
        a = new Alumno(nombre, nota);
        lalumno.add(a);
        
        System.out.println("Desea ingresar otro alumno? si/no");
        aux = sc.next();
        
    }while(aux.equalsIgnoreCase("si"));
        
    }
    
    public void notaFinal(){
        /**
         * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
            final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
            del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
            promedio final, devuelto por el método y mostrado en el main.
         */
        String nombre;
        Integer notaFin = 0;
        Iterator<Alumno> it;

        System.out.println("Ingrese nombre del alumno que quiere calcular la nota final");
        nombre = sc.next();
        
        it = lalumno.iterator();
          while(it.hasNext()){
            
              if(it.next().getNombre().equalsIgnoreCase(nombre)){
                  
                  for(Integer var : nota){
                      notaFin+= var;
                  }
              }
          
        }
        
          System.out.println("La nota del alumno es: " + (notaFin/nota.size()));
    }
    
}
