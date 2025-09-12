import java.util.Scanner;

import fabricas.Bebida;
import fabricas.Entrada;
import fabricas.PlatoPrincipal;
import fabricas.Postre;
import fabricas.fabricaMenu;
import objetosConcretos.menus.MenuVegetariano;
import objetosConcretos.alimentos.gourmet.PostreGourmet;
import objetosConcretos.alimentos.vegetariana.platoPrincipalVeg;
import objetosConcretos.menus.MenuGourmet;
import objetosConcretos.menus.MenuJapon;

public class Main {

    // Este método podría ir dentro de la clase Main, pero fuera del método main
    public static boolean preguntarPlato(Scanner scanner , String tipoDeAlimento) {
        System.out.println("¿Quieres " + tipoDeAlimento + "? (s/n)");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("s");
    }

    public static void main(String[] args) {
        System.out.println("\nBienvenido, elige el tipo de menú que quieres: \n1. Vegetariano 🥒 \n2. Gourmet 🍔 \n3. Japonés 🍙");
    
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
                menuSeleccionado = new MenuGourmet();
                System.out.println("Has elegido el menú Gourmet.");

                boolean quiereBebidaGourmet = preguntarPlato(scanner, "Bebida Gourmet");
                if(quiereBebidaGourmet){
                    Postre postreGourmet = menuSeleccionado.traerPostre();
                    System.out.println(postreGourmet.crearPostre());
                }

                boolean quiereEntradaGourmet = preguntarPlato(scanner, "Entrada");
                if(quiereEntradaGourmet){
                    Entrada entradaGourmet = menuSeleccionado.traerEntrada();
                    System.out.println(entradaGourmet.crearEntrada());
                }

                boolean quierePlatoPrincipalGourmet = preguntarPlato(scanner, "Plato Principal");
                if(quierePlatoPrincipalGourmet){
                    PlatoPrincipal PlatoPrincipalGourmet = menuSeleccionado.traerPlatoPrincipal();
                    System.out.println(PlatoPrincipalGourmet.crearPlatoPrincipal());
                }

                boolean quierePostreGourmet = preguntarPlato(scanner, "Postre");
                if(quierePostreGourmet){
                    Postre postreFinalGourmet = menuSeleccionado.traerPostre();
                    System.out.println(postreFinalGourmet.crearPostre());
                }

                break;
            case 3:
                menuSeleccionado = new MenuJapon();
                System.out.println("Has elegido el menú japonés.");

                boolean quiereEntradaJapon = preguntarPlato(scanner, "Entrada");
                if(quiereEntradaJapon){
                    Entrada entradaFinalJapon = menuSeleccionado.traerEntrada();
                    System.out.println(entradaFinalJapon.crearEntrada());
                }

                boolean quiereBebidaJapon = preguntarPlato(scanner, "Bebida");
                if(quiereBebidaJapon){
                    Bebida babidaFinalJapon = menuSeleccionado.traerBebida();
                    System.out.println(babidaFinalJapon.crearBebida());
                }
                
                boolean quierePlatoPrincipalJapon = preguntarPlato(scanner, "Plato Principal");
                if(quierePlatoPrincipalJapon){
                    PlatoPrincipal platoPrincFinalJapon = menuSeleccionado.traerPlatoPrincipal();
                    System.out.println(platoPrincFinalJapon.crearPlatoPrincipal());
                }
                
                boolean quierePostreJapon = preguntarPlato(scanner, "Postre");
                if(quierePostreJapon){
                    Postre postreJapon = menuSeleccionado.traerPostre();
                    System.out.println(postreJapon.crearPostre());
                }

                break;
            default:
                System.out.println("Opción no válida.");
                scanner.close();
                return; // Termina la ejecución
        }
        
        scanner.close();

    }
}