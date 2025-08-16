
package entradaysalidadedatos;
//programa de entrada de datos por consola
// = operador de asignacion 
public class EntradaYSalidaDeDatos {

    
    public static void main(String[] args) {
        //declarando variables
        
        short edad = 28;
        double salario = 2000;
        float altura = 1.80f; 
        char letra = 'L';
        String nombre ="Camilo";
        
        //salida por consola 
        //sout
        
        //System.out.println("La edad es:"+edad+ " años ");
        //System.out.println("El salario es:"+salario+ " dolares");
        //System.out.println("Su altura es:"+altura);
        
        System.out.println(nombre + " tiene un salario de " +salario+ " dolares, "+ "su estatura es de " + altura+ " metros, " +"su edad es de " + edad + " y su letra favorita es la " + letra);
    }
    
}
