package informacionempresa;

import java.util.Scanner;

public class InformacionEmpresa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String empleados[][] = new String[100][2];
        double gastos[][] = new double[100][12];

        //variables para la gestion de la empresa 
        int numEmpleados = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("Gestion de personal y gastos de la empresa");
            System.out.println("1. Agregar empleado y sus gastos ");
            System.out.println("2. Mostrar información de empleados y sus gastos ");
            System.out.println("3. Calcular total gastos ");
            System.out.println("4. Salir ");
            System.out.print("Seleccione una opción: ");

            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    if (numEmpleados < 100) {
                        System.out.print("Ingrese el nombre del empleado: ");
                        empleados[numEmpleados][0] = entrada.nextLine();
                        System.out.print("Ingrese el puesto del empleado: ");
                        empleados[numEmpleados][1] = entrada.nextLine();

                        for (int i = 0; i < 12; i++) {
                            System.out.print("Ingrese el gasto del mes " + (i + 1) + ": ");
                            gastos[numEmpleados][i] = entrada.nextDouble();
                        }
                        numEmpleados++;
                    } else {
                        System.out.println("No se pueden agregar mas empleados.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < numEmpleados; i++) {
                        System.out.println("Empleado: " + empleados[i][0] + "-Puesto: " + empleados[i][1]);
                        System.out.println("Gastos: ");
                        for (int j = 0; j < 12; j++) {
                            System.out.println(gastos[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    double totalGastos = 0;
                    for (int i = 0; i < numEmpleados; i++) {
                        for (int j = 0; j < 12; j++) {
                            totalGastos += gastos[i][j];
                        }
                    }
                    System.out.println("Total de gastos de la empresa $" + totalGastos);
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion invalida (1-4)");
            }
        }
        entrada.close();
    }
}
