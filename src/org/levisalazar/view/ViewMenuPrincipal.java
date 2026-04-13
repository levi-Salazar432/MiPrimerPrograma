
package org.levisalazar.view;
import java.util.Scanner;
 
/**
*
* @author levi Salazar 
*/
public class ViewMenuPrincipal{
    //global
    public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    boolean salir = false; 
    int opcionMenu = 0;
        do { 
            System.out.println("*********************************");
            System.out.println("Bienvenido Seleccione una opcion:");
            System.out.println("1.operaciones metematicas        ");
            System.out.println("2.operaciones de texto           ");
            System.out.println("3.operaciones de logica          ");
            System.out.println("4.salir del sistema              ");
            System.out.println("*********************************");
          
            try {
                opcionMenu = Integer.parseInt(sn.nextLine()); 
                
                switch (opcionMenu) {
                    case 1 -> MenuMatematicas(sn);
                    case 2 -> MenuLogico(sn);
                    case 3 -> MenuTexto(sn);
                    case 4 -> {
                        System.out.println("Saliendo del sistema!!");
                        salir = true; 
                    }
                    default -> System.out.println("Opcion no valida");
                } 
            } catch (NumberFormatException e){
                System.out.println("Error numero invalido.");
            }  
        } while (!salir);    
                
            }
                
        } 
    

