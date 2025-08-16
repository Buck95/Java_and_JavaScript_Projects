
package megaplaza;

import java.util.Scanner;

/* En Megaplaza se hace un 20% de descuento a los clientes cuya compra supere
los $300 ¿cual sera la cantidad que pagara una persona por su compra?
*/

public class MegaPlaza {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        float valor, descuento, resta ;
        System.out.println("*****Supermercado MegaPlaza******");
        System.out.print("Digite el valor de la compra: ");
        valor = entrada.nextFloat();
        
        descuento = (valor*20)/100;
        resta = (valor - descuento);
        
        if(valor >0 && valor <=300){
        System.out.println("El valor de su compra no tiene descuento.");
        System.out.println("¡Gracias por su visita,vuelva pronto!");
     }
        
        else if(valor > 300){
            System.out.println("El pago tiene un descuento del 20% de su compra que es de: "+descuento+ " dolares");
            System.out.println("Su nuevo valor a cancelar es: "+resta+ " dolares");
            System.out.println("¡Gracias por su visita,vuelva pronto!");
        }                
}
}
    
   

