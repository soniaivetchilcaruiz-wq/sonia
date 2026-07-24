import java.util.Scanner;

import java.util.Scanner;

public class examen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] gastos = new double[7];
        int cantidad = 0;
        int opcion;

        do {
            System.out.println("\n=================================");
            System.out.println(" CONTROL DE GASTOS SEMANALES");
            System.out.println("=================================");
            System.out.println("1. Registrar gasto");
            System.out.println("2. Mostrar gastos");
            System.out.println("3. Mostrar resumen");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    if (cantidad < 7) {
                        System.out.print("Ingrese el gasto del dia " + (cantidad + 1) + ": ");
                        gastos[cantidad] = sc.nextDouble();
                        cantidad++;
                        System.out.println("Gasto registrado correctamente.");
                    } else {
                        System.out.println("Ya se registraron los 7 dias de la semana.");
                    }
                    break;

                case 2:
                    if (cantidad == 0) {
                        System.out.println("No hay gastos registrados.");
                    } else {
                        System.out.println("\nGastos registrados:");
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println("Dia " + (i + 1) + ": $" + gastos[i]);
                        }
                    }
                    break;

                case 3:
                    if (cantidad == 0) {
                        System.out.println("No hay gastos para mostrar.");
                    } else {

                        double total = 0;
                        double mayor = gastos[0];
                        double menor = gastos[0];

                        for (int i = 0; i < cantidad; i++) {
                            total += gastos[i];

                            if (gastos[i] > mayor) {
                                mayor = gastos[i];
                            }

                            if (gastos[i] < menor) {
                                menor = gastos[i];
                            }
                        }

                        double promedio = total / cantidad;

                        System.out.println("\n===== RESUMEN SEMANAL =====");
                        System.out.println("Total gastado: $" + total);
                        System.out.println("Promedio de gastos: $" + promedio);
                        System.out.println("Gasto mayor: $" + mayor);
                        System.out.println("Gasto menor: $" + menor);
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}