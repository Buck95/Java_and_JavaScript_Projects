
package byc2;

import javax.swing.JOptionPane;

/*leer numeros hasta que se introduzca un 0.
para cada uno indicar si es par o impar
*/

public class BYC2 {

   
    public static void main(String[] args) {
        
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero != 0){
            
            if(numero % 2 ==0){
                System.out.println("El numero es par");
            }
            else{
                System.out.println("El numero es impar");}
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        
        System.out.println("...fin del programa...");
        
    }
    
}
