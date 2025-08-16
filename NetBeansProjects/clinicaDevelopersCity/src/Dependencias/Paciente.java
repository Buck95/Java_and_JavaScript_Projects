
package Dependencias;


public class Paciente {
    
    private String nombre;
    private int edad;
    private String motivoConsulta;

    public Paciente(String nombre, int edad, String motivoConsulta) {
        this.nombre = nombre;
        this.edad = edad;
        this.motivoConsulta = motivoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", edad=" + edad + ", motivoConsulta=" + motivoConsulta + '}';
    }
}
