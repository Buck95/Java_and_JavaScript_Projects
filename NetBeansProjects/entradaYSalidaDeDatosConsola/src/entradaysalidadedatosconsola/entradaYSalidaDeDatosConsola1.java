
package entradaysalidadedatosconsola;

//entrada y salida de datos 

import java.util.Scanner;


public class EntradaYSalidaDeDatosConsola{

    
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        float altura;
        double salario;
        char letra;
        
        //entrada de datos por consola
        
        Scanner entrada = new Scanner(System.in);
           
        System.out.print("digite el nombre: ");
        
        nombre = entrada.nextLine();
        
        System.out.print("digite la edad: ");
        
        edad = entrada.nextInt();
        
        System.out.print("digite la altura: ");
        
        altura = entrada.nextFloat();
        
        System.out.print("digite el salario: ");
        
        salario= entrada.nextDouble();
        
        System.out.print("digite la letra: ");
        
        letra = entrada.next().charAt(0);
        
        //salida de datos por consola
        
        System.out.println("El nombre es: "+ nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("Su altura es: "+altura);
        System.out.println("su salario es: "+salario);
        System.out.println("Su letra favorita es: "+letra);    
    
    }
    
    
}
