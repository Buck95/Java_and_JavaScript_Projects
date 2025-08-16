
package programa;

public class Gerente extends Empleado {
    
    private String profesion;

    public Gerente(int id, String nombre, String apellido, float sueldo, String profesion) {
        super(id, nombre, apellido, sueldo);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    @Override
    public String mostrarDatos() {
        return "Gerente{ id = " + getId() + ", nombre = " + getNombre() + ", apellido = " + getApellido() + ", profesion = " + profesion + '}';
    }   
}
