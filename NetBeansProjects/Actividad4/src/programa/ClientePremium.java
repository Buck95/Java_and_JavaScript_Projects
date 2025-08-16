
package programa;

public class ClientePremium extends Cliente {

    public ClientePremium(int id, String nombre, String apellido, double saldo) {
        super(id, nombre, apellido, saldo);
    }
    
    @Override
    public String mostrarDatos() {
        return "Cliente Premium{ id = " + getId() + ", nombre = " + getNombre() + ", apellido = " + getApellido() + ", saldo = " + getSaldo() + '}';
    }  
}
