
package byc5;

import javax.swing.JOptionPane;

/*pedir numeros hasta que se introduzca un negativo
y calcular la media 
*/

public class BYC5 {

    
    public static void main(String[] args) {
        
        int numero, suma=0, elementos =0 ;
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (numero >=0){
            suma += numero; 
            elementos ++; 
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        
        if(suma ==0){
            System.out.println("error");}
        else {
            media = (float) suma/elementos;
            System.out.println("La media es: "+media);
        }
        
    }
    
}
