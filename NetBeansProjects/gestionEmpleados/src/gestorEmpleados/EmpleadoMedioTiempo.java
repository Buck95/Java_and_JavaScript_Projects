
package gestorEmpleados;


public class EmpleadoMedioTiempo extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, int edad, String id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, edad, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalario(){
        return tarifaPorHora * horasTrabajadas;          
    }
    
    public void mostrarDatos(){
        System.out.println("****TRABAJADOR(A) MEDIOTIEMPO****");
        System.out.println("*Nombre: "+ getNombre());
        System.out.println("*Salario: "+ tarifaPorHora * horasTrabajadas);
    }
}