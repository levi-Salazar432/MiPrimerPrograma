
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
    int opcionMenu; 
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
                System.out.println("Error numero invalido."  );
            }  
        } while (!salir);    
                
     }
    
        //---submenu de Matematicas---
    public static void MenuMatematicas(Scanner sn){
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
        if (opcion == 11) volver = true;
        else System.out.println("Ejecutando opcion" + opcion);
    
      } while(!volver);
    }

    //---SubMenu de Logico---
  public static void MenuLogico(Scanner sn){
      boolean volver = false; 
      do {
          System.out.println("Menu de logica");
          System.out.println("12. Verificador de edad");
          System.out.println("13. Numero par");
          System.out.println("14. Semáforo");
          System.out.println("15. Rango Numérico");
          System.out.println("16. login Simple");
          System.out.println("17. Mayor de Dos");
          System.out.println("18. Año Bisiesto");
          System.out.println("19. Aprobado/Desaprobado");
          System.out.println("20. Validador de Triangulo");
          System.out.println("21. Comparador de Cadenas");
          System.out.println("22. Volver al Menú Principal");
          System.out.print("Seleccione una opcion: ");
          
          int opcion = Integer.parseInt(sn.nextLine());
          if (opcion == 22) volver = true; 
          else System.out.println("Ejecutando la opcion" + opcion);
          
      }while (!volver);
    }
  
  //---subMenu de texto---
  public static void MenuTexto(Scanner sn){
    boolean volver = false; 
    do{
       System.out.println("---Menu de Texto---");
       System.out.println("23. Concatenador de Nombre");
       System.out.println("24. Concatenador de Longitud");
       System.out.println("25. Inversor de Texto");
       System.out.println("26. Detector de Vocales");
       System.out.println("27. Extractor de Iniciales");
       System.out.println("28. Normalizador a Mayúscula");
       System.out.println("29. Conversor de Binario");
       System.out.println("30. Repetidor de palabras");
       System.out.println("31. Validador de contraseña");
       System.out.println("32. Generador de correo");
       System.out.println("33.Volver al menú principal");
       System.out.print("Seleccione una opción");
       
       int opcion = Integer.parseInt(sn.nextLine());
       if (opcion == 33) volver = true; 
       else System.out.println("Ejecutando opcion" + opcion);
       
    
       }while (!volver);
      
    }
}

    

