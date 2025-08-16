
package pilas;

import java.util.Stack;


public class Pilas {

   
    public static void main(String[] args) {
       //crear pila 
       
       Stack<Integer>pila= new Stack<>();
       
       //agregar elementos en una pila 
       
       pila.push(20);
       pila.push(35);
       pila.push(40);
       pila.push(56);
       pila.push(75);
       
       //mostrar pila 
       
        System.out.println("pila actual: "+ pila);
        
        //eliminar el elemento de la parte superior
        
        int elementoSuperior = pila.pop();
        
        System.out.println("Elemento eliminado: "+elementoSuperior);
        
        //mostrar pila 
       
        System.out.println("pila actual: "+ pila);
        
        //Mostrar el elemento de la parte superior
        
        int elementoPeek = pila.peek();
        
        System.out.println("Elemento de la parte superior: "+ elementoPeek);
        
        boolean estaVacia = pila.isEmpty();
        System.out.println("La fila esta vacia?: "+ estaVacia);
    }
    
}
