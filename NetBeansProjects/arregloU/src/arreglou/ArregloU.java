
package arreglou;

import java.util.Scanner;


public class ArregloU {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de elementos del vector: ");
        
        int numeroElementos = entrada.nextInt();
        
        char[] letras = new char[numeroElementos];
        
        System.out.println("Digite los caracteres: ");
        
        for(int i =0; i<numeroElementos; i++){
            System.out.println("Digite la letra: "+(i+1)+": ");
            letras[i]= entrada.next().charAt(0);
        }
        
        System.out.println("Los caracteres son: ");
        
        for(int i =0; i<numeroElementos; i++){
            System.out.println(letras[i]+" ");
        }                  
        }        
    }
    
