/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.servicio;

/**
 *
 * @author Sashi
 */
import collections.entidades.PaisesEnt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class PaisesServ {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<PaisesEnt> paises = new HashSet<PaisesEnt>();
    PaisesEnt pais;

    public HashSet cargarPaises() {
        String country;
        String rta1;
        do {
            System.out.println("ingrese un pais");
            country = leer.next();
            System.out.println("desea continuar? s ó n");
            rta1 = leer.next();
            pais = new PaisesEnt(country);
            paises.add(pais);
        } while (rta1.equalsIgnoreCase("s"));

        return paises;
    }

    public void mostrarPais() {
        for (PaisesEnt aux : paises) {
            System.out.println(aux);

        }
    }

    public void ordenarPaises(PaisesEnt pais) {
        ArrayList<PaisesEnt> orden = new ArrayList(paises);
        orden.sort(PaisesEnt.comparaPais);
        System.out.println(orden);

    }

    public void borrarPais() {
        
       System.out.println("Ingrese un pais para eliminar");
       String eliminar = leer.next();
       
       Iterator<PaisesEnt> it = paises.iterator();

       while(it.hasNext()){
        
       //    PaisesEnt aux = it.next();

           if(it.next().getPais().equals(eliminar)){
               
               it.remove();
               
           }
           break;
       }
      
    }

}
