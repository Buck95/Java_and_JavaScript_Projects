
package byc4;

import javax.swing.JOptionPane;

public class BYC4 {

  /*pedir numeros hasta que se teclee 0
    mostrar la suma de todos los numeros introducidos
    */  
    public static void main(String[] args) {
        
       int numero, suma=0; 
       
       do {numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
       
       suma +=numero ;
       }
       while(numero !=0);
       
        System.out.println("La suma de los numeros digitados es de: "+suma);
       System.out.println("...fin del programa...");
       
    }
    
}
