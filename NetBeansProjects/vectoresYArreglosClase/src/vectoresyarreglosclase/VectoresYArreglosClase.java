
package vectoresyarreglosclase;

import java.util.Vector;

public class VectoresYArreglosClase {

    
    public static void main(String[] args) {
        
           Vector <String> vector = new Vector <>();
           
           vector.add("elemento 1");
           vector.add("elemento 2");
           vector.add("elemento 3");
           
           System.out.println("Vector agregado los elementos: "+ vector);
           
           vector.remove("elemento 1");
           System.out.println("Nuevo vector: "+ vector );
    }
    
}
