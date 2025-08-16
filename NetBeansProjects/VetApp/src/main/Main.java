
package main;

import views.ClienteView;
import views.VeterinarioView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n == MENU PRINCIPAL ==");
            System.out.println("Andrés Camilo Bucheli Onofre");
            System.out.println("Código:100179489");
            System.out.println("1. Menu de Clientes");
            System.out.println("2. Menu de Veterinarios");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    ClienteView clienteView = new ClienteView();
                    clienteView.mostrarMenu();
                    break;
                case 2:
                    VeterinarioView veterinarioView = new VeterinarioView();
                    veterinarioView.mostrarMenu();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("¡Opción inválida!");
            }
        } while (opcion != 3);
        
        entrada.close();
    }
}
