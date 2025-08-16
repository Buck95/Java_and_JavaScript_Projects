
package gestorEmpleados;


public class Main{
    
    public static void main(String[] args) {
     
        EmpleadoTiempoCompleto etc = new EmpleadoTiempoCompleto("Juan Perez", 30,"E001",3000); 
        etc.calcularSalario(); 
        etc.mostrarDatos();
     
        
        EmpleadoMedioTiempo emt = new EmpleadoMedioTiempo("Maria Gomez",25,"E002",20,80);        
        emt.calcularSalario();
        emt.mostrarDatos();
    }    
    }
     

   
   
     
        
    
    

