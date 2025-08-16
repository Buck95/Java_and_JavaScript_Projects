
package tutoria8bootcamp;

import java.util.Scanner;


public class Tutoria8BootCamp {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] edades= new int [6]; 
        
        for(int i=0; i < 6; i++){
            System.out.println("Ingrese un numero: ");
            edades[i]= entrada.nextInt();  
        } 
        System.out.println("----Los valores son------");
        for(int i=0; i < 6; i++){
            System.out.println("Valor indice: "+ edades[i]);
        }        
    }    
}
