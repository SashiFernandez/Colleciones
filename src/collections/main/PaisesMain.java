/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.main;

import collections.entidades.PaisesEnt;
import collections.servicio.PaisesServ;

/**
 *
 * @author Sashi
 */
public class PaisesMain {
    public static void main(String[] args) {
         PaisesServ pais = new PaisesServ();
        PaisesEnt p = new PaisesEnt();
        pais.cargarPaises();
        pais.mostrarPais();
        pais.ordenarPaises(p);
        pais.borrarPais();
        pais.mostrarPais();
    }
}
