package programas;

import java.util.Scanner;

public class CalculoPrestamo {
    public static void main(String[] args) {

        double montoPrestamo, tasaInteresAnual, pagoMensualDeseado, pagoMensualReal;
        int numeroCuotas;
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingresar el monto del prestamo deseado (en dolares): ");
        montoPrestamo = lectura.nextDouble();

        System.out.print("Ingresar la tasa de interes anual (en %): ");
        tasaInteresAnual = lectura.nextDouble();
        double tasaInteresMensual = tasaInteresAnual / 12 / 100;

        System.out.print("Ingresar el pago mensual que desea hacer (en dolares): ");
        pagoMensualDeseado = lectura.nextDouble();


        numeroCuotas = (int) Math.ceil(Math.log(pagoMensualDeseado / (pagoMensualDeseado - montoPrestamo * tasaInteresMensual)) / Math.log(1 + tasaInteresMensual));
        pagoMensualReal = (montoPrestamo * tasaInteresMensual) / (1 - Math.pow(1 + tasaInteresMensual, -numeroCuotas));


        System.out.printf("El numero total de cuotas necesarias para pagar el prestamo es: %d%n", numeroCuotas);
        System.out.printf("El pago mensual real es: $%.2f%n", pagoMensualReal);
        
    }
}
