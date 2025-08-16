
package gestorEmpleados;


public class EmpleadoTiempoCompleto extends Empleado {
    
    private double salarioBase;
    

    public EmpleadoTiempoCompleto(String nombre, int edad, String id, double salarioBase) {
        super(nombre, edad, id);
        this.salarioBase = salarioBase;
        
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    @Override
    public double calcularSalario(){
        return salarioBase;           
    } 
    
    public void mostrarDatos(){
        System.out.println("****TRABAJADOR(A) TIEMPO COMPLETO****");
        System.out.println("*Nombre del empleado: "+ getNombre());
        System.out.println("*Salario: "+ salarioBase);       
        System.out.println("-------------------------------------------------");
    }
}

