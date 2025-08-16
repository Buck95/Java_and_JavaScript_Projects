
package tutoriawhile;


public class TutoriaWhile {

    
    public static void main(String[] args) {
        
        /*Realizar un programa que busque el primero numero divisible por 7 y 9 al mismo
        tiempo e imprima ese numero
        */
        int numero =1;
        boolean encontrado = false;
        
        while(!encontrado){
            if (numero %7==0 && numero % 9 ==0 ){
                System.out.println("El primero numero es: "+numero);
            encontrado = true;
            }
            numero ++;       
        }                   
    }    
}
