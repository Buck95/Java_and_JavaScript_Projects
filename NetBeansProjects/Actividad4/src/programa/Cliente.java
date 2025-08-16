
package programa;

public abstract class Cliente extends Persona {
    
    private double saldo;

    public Cliente(int id, String nombre, String apellido, double saldo) {
        super(id, nombre, apellido);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public abstract String mostrarDatos();
}
