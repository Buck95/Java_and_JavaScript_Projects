
package Dependencias;

import java.util.Scanner;


public class ClinicaDevelopersCity {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        ColaPacientes colaPacientes = new ColaPacientes();
        
        while(true){
            
            System.out.println("CLINICA DEVELOPERS CITY");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Mostrar pacientes en cola");
            System.out.println("4. Salir");
            System.out.println("Selecciones una opcion: ");
            
            int opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Nombre del paciente");
                    String nombre = entrada.nextLine();
                    System.out.println("Edad del paciente");
                    int edad = entrada.nextInt();
                    entrada.nextLine(); 
                    System.out.println("Motivo de la consulta");
                    String motivo = entrada.nextLine(); 
                    
                    Paciente nuevoPaciente = new Paciente(nombre, edad,motivo);
                    
                    colaPacientes.agregarPaciente(nuevoPaciente);
                    break;
                    
                case 2:                     
                    colaPacientes.atenderPaciente();
                    break;
                    
                case 3:                    
                    colaPacientes.mostrarDatos();
                    break;
                    
                case 4:
                    
                    System.out.println("Saliendo del programa ");
                    entrada.close();
                    return;
                    
                    
                default:
                    System.out.println("Opcion invalida (1-4)");
                    throw new AssertionError();                                            
            }        
        }
    }    
}

