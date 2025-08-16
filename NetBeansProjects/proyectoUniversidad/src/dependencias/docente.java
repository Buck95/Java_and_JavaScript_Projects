
package dependencias;


public class docente extends persona {
    
    private int codigoDocente;
    private float sueldo; 

    public docente(String nombre, String apellidos, int edad, int codigoDocente, float sueldo) {
        super(nombre, apellidos, edad);
        this.codigoDocente = codigoDocente;
        this.sueldo = sueldo;
    }

    public int getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(int codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public void mostrarDatos (){
        System.out.println("DOCENTE");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellidos());
        System.out.println("Edad: "+getEdad());
        System.out.println("Codigo docente: "+codigoDocente);
        System.out.println("Sueldo: "+sueldo);
        System.out.println(""); 
        
    }
    
}
