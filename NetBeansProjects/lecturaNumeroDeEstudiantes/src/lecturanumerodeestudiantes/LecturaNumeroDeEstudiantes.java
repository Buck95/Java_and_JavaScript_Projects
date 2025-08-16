
package lecturanumerodeestudiantes;

import java.util.Scanner;


public class LecturaNumeroDeEstudiantes {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el numero de estudiantes: ");
            int numEstudiantes = entrada.nextInt();
            int [] cal = new int[numEstudiantes];
            
            //solicitar las calificaciones de los estudiantes
            
            System.out.println("Ingrese las calificaciones de los estudiantes: ");
            for (int i =0; i<numEstudiantes; i++){
                System.out.println("calificacion del estudiante "+(i+1)+ ":");
                cal[i]=entrada.nextInt();
                }
            
            //calcular el promedio de las calificaciones
            
            int suma=0; 
            for(int i =0; i<numEstudiantes;i++){
            suma += cal[i];
            }
            
            double promedio = (double) suma/numEstudiantes;
            
            //Encontrar la calificacion mas alta y la mas baja 
            
            int alta = cal[0];
            int baja = cal [0];
            for(int i =1; i<numEstudiantes; i++){
                if(cal[i]>alta){
                alta=cal[i];}
                
                if(cal[i]<baja){
                baja=cal[i];}
            }
            
            System.out.println("Promedio de las calificaciones = "+ promedio);
            System.out.println("Calificacion mas alta = "+alta);
            System.out.println("Calificacion mas baja = "+baja);                                                                        
    }    
}


