
package collections.main;

import collections.entidades.Tienda;
import collections.servicio.TiendaServicio;
import java.util.Scanner;

public class TiendaMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        TiendaServicio ts = new TiendaServicio();
      
        do{
            System.out.println("1- Ingresar producto\n2- Modificar producto\n3- Eliminar producto\n4- Mostrar producto\n5- Salir");
            opc = sc.nextInt();
            
            switch(opc){
                case 1: 
                    ts.introducirElemento();
                    break;
                case 2:
                    ts.modificarElemento();
                    break;
                case 3:
                    ts.eliminarElemento();
                    break;
                case 4: 
                    ts.mostrarElemento();
                    break;                          
                          
            }
        }while(opc != 5);
    }
}
