
package Gestor;

public class GastoFijo extends Gasto {
    
    private String fechaPago;

    public GastoFijo(String descripcion, double monto, String fechaPago) {
        super(descripcion, monto);
        this.fechaPago = fechaPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
    
    @Override
    public void mostrarDetalles(){
        
        System.out.println("Gasto Fijo: "+ getDescripcion()+ ", Monto: $"+ getMonto()+ ", Fecha de pago: "+ fechaPago);
    
    }  
}
