
package matricesbidimensionales;

import java.util.Scanner;


public class MatricesBidimensionales {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int matriz1[][], matriz2[][], suma[][];
        
        matriz1 = new int [3][3];
        matriz2 = new int [3][3];
        
        System.out.println("digite la matriz 1");
        
        for(int i=0; i<3;i++){
        for(int j =0; j<3;j++){
            System.out.println("matriz1["+i+"]["+j+"]: ");
            matriz1[i][j]=entrada.nextInt();
}
}
        System.out.println("digite la matriz 2");
        for(int i=0; i<3;i++){
            for(int j =0; j<3;j++){
                System.out.println("matriz2["+i+"]["+j+"]: ");
                matriz2[i][j]=entrada.nextInt();
}
}
        suma = new int [3][3];
        
        for(int i=0; i<3;i++){
            for(int j =0; j<3;j++){
                suma[i][j]=matriz1[i][j]+matriz2[i][j];
        
        
}
    
}
        for(int i=0; i<3;i++){
            for(int j =0; j<3;j++){
                System.out.println("");

    }
}
    }
}