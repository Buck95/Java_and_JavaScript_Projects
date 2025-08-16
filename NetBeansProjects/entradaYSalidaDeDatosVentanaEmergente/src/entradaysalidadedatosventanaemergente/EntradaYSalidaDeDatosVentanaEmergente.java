
package entradaysalidadedatosventanaemergente;

import javax.swing.JOptionPane;


public class EntradaYSalidaDeDatosVentanaEmergente {

   
    public static void main(String[] args) {
       
        String nombre;
        int edad;
        float estatura;
        double salario;
        char letra;
        
        //entrada de datos por consola 
        
        nombre = JOptionPane.showInputDialog("digite el nombre ");
        
        edad = Integer.parseInt(JOptionPane.showInputDialog(" digite la edad "));
        
        estatura = Float.parseFloat(JOptionPane.showInputDialog(" digite la estatura "));
        
        salario = Double.parseDouble(JOptionPane.showInputDialog(" digite el salario "));
        
        letra = JOptionPane.showInputDialog(" digite la letra ").charAt(0);
        
        //salida de datos por consola
        
        JOptionPane.showMessageDialog(null, " El nombre es: "+nombre);
        JOptionPane.showMessageDialog(null, " La edad es: "+edad);
        JOptionPane.showMessageDialog(null, " La estatura es: "+estatura);
        JOptionPane.showMessageDialog(null, " El salario es: "+salario);
        JOptionPane.showMessageDialog(null, " La letra es: "+letra);
        

    }
    
}
