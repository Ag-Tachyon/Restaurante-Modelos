import java.util.Scanner;

import fabricas.Bebida;
import fabricas.Entrada;
import fabricas.PlatoPrincipal;
import fabricas.Postre;
import fabricas.fabricaMenu;
import objetosConcretos.menus.MenuVegetariano;

public class Main {

    // Este método podría ir dentro de la clase Main, pero fuera del método main
    public static boolean preguntarPlato(Scanner scanner , String tipoDeAlimento) {
        System.out.println("¿Quieres " + tipoDeAlimento + "? (s/n)");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("s");
    }


    public static void main(String[] args) {
        System.out.println("\nBienvenido, elige el tipo de menú que quieres: \n1. Vegetariano 🥒 \n2. Infantil 🍔 \n3. Japonés 🍙");
    
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcionElegida = 0;
        
        // Lee el número que el usuario ingresa
        try {
            opcionElegida = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada no válida. Por favor, ingresa un número.");
            return; // Termina la ejecución si la entrada no es un número
        }

        fabricaMenu menuSeleccionado;
        
        switch (opcionElegida) {
            case 1:
                menuSeleccionado = new MenuVegetariano(); // -> Creamos el objeto del menú seleccionado XD
                System.out.println("Has elegido el menú vegetariano.");

                boolean quiereBebida = preguntarPlato(scanner , "Bebida");
                if (quiereBebida) {
                    Bebida bebida = menuSeleccionado.traerBebida();  // Usamos la fábrica para crear la bebida !!!recordar¡¡¡
                    System.out.println(bebida.crearBebida());
                }
                
                boolean quiereEntrada = preguntarPlato(scanner , "Entrada");
                if(quiereEntrada) {
                    Entrada entrada = menuSeleccionado.traerEntrada();  // Usamos la fábrica para crear la bebida !!!recordar¡¡¡
                    System.out.println(entrada.crearEntrada());
                }

                boolean quierePlatoPrincipal = preguntarPlato(scanner , "Plato Principal");
                if(quierePlatoPrincipal){
                    PlatoPrincipal platoPrinc = menuSeleccionado.traerPlatoPrincipal();
                    System.out.println(platoPrinc.crearPlatoPrincipal());
                }

                boolean quierePostre = preguntarPlato(scanner, "Postre");
                if(quierePostre){
                    Postre quierPostre = menuSeleccionado.traerPostre();
                    System.out.println(quierPostre.crearPostre());
                }
                
            break;
            case 2:
                System.out.println("Has elegido el menú infantil.");
                break;
            case 3:
                System.out.println("Has elegido el menú japonés.");
                break;
            default:
                System.out.println("Opción no válida.");
                scanner.close();
                return; // Termina la ejecución
        }
        
        scanner.close();

    }
}