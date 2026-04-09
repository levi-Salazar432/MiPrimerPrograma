
package org.levisalazar.view;
import java.util.Scanner;
 
/**
*
* @author miguel guzman 
*/
public class ViewMenuPrincipal{
    //global
    int opcionMenu =0;
    Scanner leer = new Scanner (System.in);
    public void mostrarMenu(){
        while (opcionMenu == 0){
            System.out.println("Bienvenido Seleccione una opcion:");
            opcionMenu = Integer.parseInt(leer.nextLine());
        }
                }
    public void mostrarMenuMatematicas(){
        System.out.println("Menu de operaciones matematicas  ");
        
    }
}
