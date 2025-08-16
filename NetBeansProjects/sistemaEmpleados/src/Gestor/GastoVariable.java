
package Gestor;

public class GastoVariable extends Gasto{
    
    private String categoria; 

    public GastoVariable(String descripcion, double monto, String categoria) {
        super(descripcion, monto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public void mostrarDetalles(){
        
        System.out.println("Gasto Variable: "+ getDescripcion() + ", Monto: $"+ getMonto()+ ", Categoria: "+ categoria);
    
    }   
}
