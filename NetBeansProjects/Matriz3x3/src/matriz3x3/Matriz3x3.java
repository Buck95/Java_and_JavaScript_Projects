
package matriz3x3;

import java.util.Scanner;


public class Matriz3x3 {

    /*crear y cargar una matriz de tamaño 3x3, transponerla
      y mostrarla */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
            int matriz[][],cambio[][]; 
                
            matriz = new int[3][3];  
            System.out.println("-----Digite la matriz-----");
            
            for(int i =0; i<3; i++){
                for (int j=0; j<3 ;j++){
                    System.out.print("Matriz ["+i+"]["+j+"]:");
                    matriz[i][j]= entrada.nextInt();
                }
            }
            
            System.out.println("-----Matriz digitada-----");
            
            for(int i =0; i<3; i++){
                for (int j=0; j<3 ;j++){
                    System.out.print(matriz[i][j] + " ");
                }    
                 System.out.println(" ");
            }
            
            //Transponer matriz
            cambio = new int [3][3];
            System.out.println("-----Matriz transpuesta-----");
            
             for(int i =0; i<3; i++){
                for (int j=0; j<3 ;j++){
                    cambio[i][j]= matriz[j][i];
                }
            } 
             //Imprimir la matriz transpuesta 
             
             for(int i =0; i<3; i++){
                for (int j=0; j<3 ;j++){
                    System.out.print(cambio[i][j] + " ");
                }    
                 System.out.println(" ");
            }    
    }
    
}
