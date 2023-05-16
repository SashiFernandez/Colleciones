package collections.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class IngreseRaza {
    
    public static void main(String[] args) {
        /**
         * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
            programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
            después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
            salir, se mostrará todos los perros guardados en el ArrayList.
         */
        String raza;
        ArrayList<String> RazaPerro = new ArrayList();
        Iterator<String> it;
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        do{
            System.out.println("Ingrese una raza de perro");
            RazaPerro.add(sc.next());
            
            System.out.println("Desea ingresar una nueva raza? si/no");
            raza = sc.next();
        }while(raza.equalsIgnoreCase("si"));
        
        
        /**
         * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
            un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
            está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
            ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
            la lista ordenada.
         */
        
        System.out.println(RazaPerro.toString());
        
        System.out.println("Ingrese una raza a eliminar");
        String eliminar = sc.next();
        
        it = RazaPerro.iterator(); //Asignacion de arraylist al iterator "It", para eliminar un elemento.
        while(it.hasNext()){
            
            if(it.next().equalsIgnoreCase(eliminar)){
                it.remove();
            }
        }
        
        System.out.println("---Lista de raza ordenada---");
        
        
        Collections.sort(RazaPerro);
        System.out.println(RazaPerro.toString());

    }
}
