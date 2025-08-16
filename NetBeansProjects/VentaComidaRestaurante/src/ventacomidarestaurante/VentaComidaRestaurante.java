
package ventacomidarestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VentaComidaRestaurante {
    
    public static void main(String[] args) {
        
        List<String> menu = new ArrayList<>();
        List<Double> precios = new ArrayList<>();
        
        //añadimos platos al menú 
        
        menu.add("Hamburguesa");
        precios.add(10.0);
        menu.add("Pizza ");
        precios.add(8.25);
        menu.add("Ensalada");
        precios.add(4.15);
        
        //inicializamos 
        
        List<String> pedido = new ArrayList<>();
        List<Double> totalPedidos = new ArrayList<>();
        
        //Creamos un Scanner para leer la entrada del usuario 
        
        Scanner entrada = new Scanner (System.in); 
        boolean salir = false; 
        
        while(!salir){
            
            // El menú de opciones 
            
            System.out.println("--MENÚ-- ");
            System.out.println("1. Ver menu");
            System.out.println("2. Hacer pedido");
            System.out.println("3. Ver pedido");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            
            int opcion = entrada.nextInt();
            
            switch(opcion){
                
                case 1: 
                    System.out.println("Menu de comida");
                    for(int i=0; i< menu.size(); i++){
                        System.out.println((i+1)+". "+ menu.get(i)+" - $"+precios.get(i));                   
                    }
                    break; 
                    
                case 2: 
                    System.out.println("Selecciona el numero del plato que deseas: ");
                    int seleccion = entrada.nextInt();
                    if (seleccion > 0 && seleccion <= menu.size()){
                        pedido.add(menu.get(seleccion-1));
                        totalPedidos.add(precios.get(seleccion -1));       
                        System.out.println(menu.get(seleccion -1)+" añadido al pedido");
                    }
                    else{
                        System.out.println("Opcion invalida");
                    }
                    break;
                    
                case 3:                    
                    System.out.println("Pedido");
                    double total = 0; 
                    for(int i =0; i < pedido.size(); i++){
                    System.out.println((i+1)+". "+ pedido.get(i)+" - $"+ totalPedidos.get(i));
                    total += totalPedidos.get(i);
                    }
                    
                    System.out.println("Total a pagar: "+ total);
                    break; 
                    
                case 4: 
                    salir = true ;
                    System.out.println("¡¡Gracias por tu compra!! ");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;                                                                
            }                    
        }
        entrada.close();
    }   
}
