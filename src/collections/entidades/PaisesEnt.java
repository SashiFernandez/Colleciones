/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.entidades;

import java.util.Comparator;
import java.util.Objects;

public class PaisesEnt {

    private String pais;

    public PaisesEnt() {
    }

    public PaisesEnt(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static Comparator<PaisesEnt> comparaPais = new Comparator<PaisesEnt>() {
        @Override

        public int compare(PaisesEnt p1, PaisesEnt p2) {
            return p1.getPais().compareToIgnoreCase(p2.getPais());

        }
    };

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisesEnt other = (PaisesEnt) obj;
        return Objects.equals(this.pais, other.pais);
    }

    @Override
    public String toString() {
        return pais;
    }

}