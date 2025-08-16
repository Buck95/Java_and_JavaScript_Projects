
package views;

import controllers.VeterinarioController;
import java.util.List;
import java.util.Scanner;
import models.Veterinario;

public class VeterinarioView {
    private VeterinarioController veterinarioController;
    private Scanner entrada;

    public VeterinarioView() {
        this.veterinarioController = new VeterinarioController();
        this.entrada = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n == MENU VETERINARIOS ==");
            System.out.println("Andrés Camilo Bucheli Onofre");
            System.out.println("Ingenieria de Software");
            System.out.println("1. Mostrar veterinarios");
            System.out.println("2. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    mostrarVeterinarios();
                    break;
                case 2:
                    System.out.println("¡Vuelve pronto!");
                    break;
                default:
                    System.out.println("¡Opción inválida!");                   
            }
        } while (opcion != 2);   
    }
    
    private void mostrarVeterinarios() {
        System.out.println("\n == LISTA DE VETERINARIOS ==");
        List<Veterinario> veterinarios = veterinarioController.obtenerVeterinarios();
        if (veterinarios.isEmpty()) {
            System.out.println("No hay veterinarios registrados");
        } else {
            for (Veterinario veterinario : veterinarios) {
                System.out.println(veterinario);
            }
        } 
    }    
}
