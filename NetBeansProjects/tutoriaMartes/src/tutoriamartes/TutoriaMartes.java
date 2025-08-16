
package tutoriamartes;

import java.util.Scanner;


public class TutoriaMartes {

   
    public static void main(String[] args) {
        ejercicio1 ();
    }
    private static Scanner entrada = new Scanner(System.in);
    public static void ejercicio1 (){
        /*Escribe un programa que sume los elementos que estan en las posiciones 
        pares de un arreglo. Los numeros del arreglo deben ser ingresados por el
        usuario; el programa debe solicitar la cantidad de numeros a ingresar.
        
        Ejemplo: .Cuantos numeros desea ingresar?: 12 numeros
        . 1,2,3,4,5,6,7,8,9,10,11,12
        . La suma de los numeros en posiciones pares es: 33       
        */
        
        System.out.print("¿Cuantos numeros quiere ingresar? : ");
        int suma=0;
            int cantidad = entrada.nextInt();
                System.out.println("-----Digite los numeros------");
                    int[] arreglo = new int[cantidad];
                        for( int i=0; i < arreglo.length; i++){
                            arreglo[i] = entrada.nextInt();
                            }
                        for(int i=0; i < arreglo.length; i+=2){
                                    suma+=arreglo[i];
                                 }                  
                            System.out.println("La suma de los numeros en las posiciones pares es = "+suma);
}
}
