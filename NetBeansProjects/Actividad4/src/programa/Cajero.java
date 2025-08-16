
package programa;


public class Cajero extends Empleado {
    
    private String ciudad; 

    public Cajero(int id, String nombre, String apellido, float sueldo, String ciudad) {
        super(id, nombre, apellido, sueldo);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String mostrarDatos() {
        return "Cajero{ id = " + getId() + ", nombre = " + getNombre() + ", apellido = " + getApellido() + ", ciudad = " + getCiudad() + '}';
    }   
}
