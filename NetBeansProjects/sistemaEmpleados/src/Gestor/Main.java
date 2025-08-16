
package Gestor;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tipo de gasto (fijo ó variable): ");
        String Gasto1 = scanner.nextLine().trim();

        System.out.print("Ingrese la descripción del gasto: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese el monto del gasto: ");
        double monto = scanner.nextDouble();
        scanner.nextLine();
        
        Gasto gasto;
        
            if(Gasto1.equalsIgnoreCase("fijo")) {
                System.out.print("Ingrese la fecha del gasto (dd/mm/yyyy): ");
                    String fecha = scanner.nextLine();
                        gasto = new GastoFijo ( descripcion, monto, fecha);
        } 
            else if(Gasto1.equalsIgnoreCase("variable")) {
                System.out.print("Ingrese el lugar del gasto: ");
                    String lugar = scanner.nextLine();
                        gasto = new GastoVariable(descripcion, monto, lugar);
        }   
            else {System.out.println("Tipo de gasto no reconocido.");
                    scanner.close();
                        return;
        }
            mostrarGasto(gasto);
            scanner.close();      
    }
            public static void mostrarGasto(Gasto gasto){
            gasto.mostrarDetalles();       
}   
}

    
