
package byc3;

import javax.swing.JOptionPane;

/*pedir numeros hasta que se teclee un negativo ,
y mostrar cuantos numeros se han introducido 
*/

public class BYC3 {

    
    public static void main(String[] args) {
        
        int numero, contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero >= 0){
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));                                                          
        }
        
        System.out.println("se han introducido: " +contador+ " numero(s) positivo(s)");
        System.out.println("...fin del programa...");
    }
    
}
