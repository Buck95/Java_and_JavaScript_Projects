
package tiendadediscosmeta;

import java.util.Scanner;
import java.util.Stack;

class Disco{
    private String titulo;
    private String banda;
    private double precio;

    public Disco(String titulo, String banda, double precio) {
        this.titulo = titulo;
        this.banda = banda;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "== Disco == " + "titulo: " + titulo + "banda: " + banda + "\nprecio: " + precio;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        
       Stack<Disco> inventario = new Stack<>();
       Scanner entrada = new Scanner(System.in);
       
       int opcion;
        do {            
            System.out.println("");
            System.out.println("== Tienda de discos de Metal ==");
            System.out.println("1. agregar disco al inventario.");
            System.out.println("2. vender disco(Ultimo agregado).");
            System.out.println("3. Mostrar inventario actual.");
            System.out.println("4. Salir.");
            System.out.println("");
            System.out.println("Elige una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.print("Ingrese el titulo del disco: ");
                    String titulo = entrada.nextLine();
                    System.out.print("Ingrese el nombre de la banda: ");
                    String banda = entrada.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = entrada.nextDouble();
                    entrada.nextLine();
                    
                    Disco d1 = new Disco(titulo, banda, precio);
                    inventario.push(d1);
                    System.out.println("");
                    System.out.println("Disco agregado! ");
                    
                    System.out.println("");
                    System.out.print("Ingrese el titulo del disco: ");
                    String titulo2 = entrada.nextLine();
                    System.out.print("Ingrese el nombre de la banda: ");
                    String banda2 = entrada.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio2 = entrada.nextDouble();
                    
                    Disco d2 = new Disco(titulo2, banda2, precio2);
                    inventario.push(d2);
                    System.out.println("");
                    System.out.println("Disco agregado! ");
                    
                    break;
                case 2:
                    
                    if(inventario.isEmpty()){
                        System.out.println("\nEl inventario esta vacio!!");
                    }
                    else{
                        Disco vendido = inventario.pop();
                        System.out.println("\nDisco vendido: "+vendido);
                    }
                    break;
                case 3:
                    
                    if(inventario.isEmpty()){
                        System.out.println("\nEl inventario esta vacio.");
                    }
                    else{
                        System.out.println("");
                        System.out.println("== Inventario de discos ==");
                        for(Disco i: inventario){
                            System.out.println(i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Saliendo del programa!!!");
                    break;
                default:
                    System.out.println("Opcion invalida!!!!!!!!!!!!!!");
            }
        } while (opcion != 4);
        entrada.close();
    }
} 
