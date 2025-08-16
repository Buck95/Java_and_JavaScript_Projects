
package Dependencias;

import java.util.LinkedList;
import java.util.Queue;


public class ColaPacientes {
    
    private Queue<Paciente> colaPaciente; 

    public ColaPacientes() {
        this.colaPaciente = new LinkedList<>();
    }
    
    public void agregarPaciente(Paciente paciente){
    colaPaciente.add(paciente);
        System.out.println("Paciente agregado a la cola: "+paciente.getNombre());
    
    }
    
    public void atenderPaciente(){
        
        if(colaPaciente.isEmpty()){
            
            Paciente pacienteAtendido = colaPaciente.poll();
            System.out.println("Atendio al paciente: "+ pacienteAtendido.getNombre());
        
        } else{
            System.out.println("No hay pacientes en la cola");        
        }
    }
    
    public void mostrarDatos(){
        
        if(colaPaciente.isEmpty()){
            System.out.println("La cola de pacientes esta vacia..");
       
        }else {
            System.out.println("Pacientes en la cola: ");
            
            for(Paciente i: colaPaciente){
                
                System.out.println(i);            
            }        
        }    
    }                                         
}
