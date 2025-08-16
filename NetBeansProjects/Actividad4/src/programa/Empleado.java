
package programa;

public abstract class Empleado extends Persona {

    private float sueldo;

    public Empleado(int id, String nombre, String apellido, float sueldo) {
        super(id, nombre, apellido);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public abstract String mostrarDatos();          
}
