
package programa;

public class ClienteNormal extends Cliente {

    private double ingresos; 

    public ClienteNormal(int id, String nombre, String apellido, double saldo, double ingresos) {
        super(id, nombre, apellido, saldo);
        this.ingresos = ingresos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    @Override
    public String mostrarDatos() {
        return "Cliente Normal{ id = " + getId() + ", nombre = " + getNombre() + ", apellido = " + getApellido() + ", saldo = " + getSaldo() + ", ingresos = " + ingresos + '}';
    }     
}
