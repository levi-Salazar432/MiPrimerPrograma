
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
    int opcionMenu =0; 
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
                    case 1 ->MenuMatematicas(sn);
                    case 2 ->MenuLogico(sn);
                    case 3 ->MenuTexto(sn);
                    case 4 -> {
                        System.out.println("Saliendo del sistema!!");
                        salir = true; 
                    }
                    default -> System.out.println("Opcion no valida");
                } 
            } catch (NumberFormatException e){
                System.out.println("Error numero invalido."  );
            }  
        } while (!salir);    
                
     }
    
        //---submenu de Matematicas---
    boolean volver = false; 
    do{
        System.out.println("Caclculo De Operaciones Matimaticas");
        System.out.println("1. Caclculadora de salario");
        System.out.println("2. Área de un triangulo");
        System.out.println("3. Promedio Academico");
        System.out.println("4. Convertidor de Temperatura");
        System.out.println("5. Perímetro de Círculo");
        System.out.println("6. Volumen de un Cilindro");
        System.out.println("7. Hipotenusa");
        System.out.println("8. Días a Minutos");
        System.out.println("9. Resto de Division");
        System.out.println("10. Potencia al cubo");
        System.out.println("11. Volver al Menú Principal");
        System.out.print("Seleccione una operacion");
        
        int opcion = Integer.parseInt(sn.nextLine());
        if(opcion == 11) volver = true;
        else System.out.println("Ejecutando opcion" + opcion);
    
      } while(!volver);
    }
    

