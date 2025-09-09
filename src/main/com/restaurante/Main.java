import java.util.Scanner;

import fabricas.Bebida;
import fabricas.fabricaMenu;
import objetosConcretos.menus.MenuVegetariano;

public class Main {

    // Este método podría ir dentro de la clase Main, pero fuera del método main
    public static boolean preguntarPorBebida(Scanner scanner) {
        System.out.println("¿Quieres una bebida? (s/n)");
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
                menuSeleccionado = new MenuVegetariano();
                System.out.println("Has elegido el menú vegetariano.");

                boolean quiereBebida = preguntarPorBebida(scanner);
        
                if (quiereBebida) {
                    Bebida bebida = menuSeleccionado.traerBebida();  // Usamos la fábrica para crear la bebida !!!recordar¡¡¡
                    System.out.println(bebida.crearBebida());
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