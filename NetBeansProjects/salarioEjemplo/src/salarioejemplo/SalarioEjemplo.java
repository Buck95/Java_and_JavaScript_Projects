
package salarioejemplo;

import javax.swing.JOptionPane;

/*Hacer un programa que calcule e imprima el salario samanal de un empleado a 
partir de sus horas semanales trabajadas y de su salario por hora*/

public class SalarioEjemplo {

    
    public static void main(String[] args) {
        
        String nombreDelEmpleado;
        int horasSemanales;
        double salarioPorHora, salarioTotal; 
        
    
        nombreDelEmpleado = JOptionPane.showInputDialog("digite el nombre del colaborador ");
        horasSemanales = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de horas :"));
        salarioPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario por horas: "));
        
       //Sacar el salario semanal
       
       salarioTotal = horasSemanales * salarioPorHora ; 
       
       System.out.println("El salario semanal de "+nombreDelEmpleado+ " es de "+salarioTotal);
        
    }
    
}
