
package operadoresibero;

//Hacer un progama que calcule e imprima la suma de 3 calificaciones por consola 
// = Es un operador de asignación 
import java.util.Scanner;


public class OperadoresIbero {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float nota1, nota2, nota3, promedio;
        System.out.println("Digite la nota 1: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digita la nota 2: ");
        nota2 = entrada.nextFloat();
        System.out.println("Digite la nota 3 ");
        nota3 = entrada.nextFloat();
        
        promedio = (nota1 + nota2 + nota3) / 3 ; 
        
        System.out.println("El valor del promedio es: "+ promedio); 
       
    }
    
}
