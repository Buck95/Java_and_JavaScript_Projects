package buclesyciclos;

import javax.swing.JOptionPane;

/*leer un numero e indicar si es positivo o negativo.
El proceso se repite hasta que se introduzca un 0
*/
public class BuclesYCiclos {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El numero " + numero + " es positivo");
            } else {
                System.out.println("El numero " + numero + " es negativo");
            }
            //Repetir la recepcion del numero

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }

        System.out.println("....Fin del programa.....");
    }

}
