/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class ConvertidorMoneda {
    public static void main(String[] args) {

        double montoSoles, montoDolares, montoEuros;
        final double TASA_CAMBIO_USD = 0.27;  // Ejemplo de tasa de cambio de PEN a USD
        final double TASA_CAMBIO_EUR = 0.24;  // Ejemplo de tasa de cambio de PEN a EUR
        Scanner lectura = new Scanner(System.in);


        System.out.print("Ingresar el monto en soles (PEN): ");
        montoSoles = lectura.nextDouble();


        montoDolares = montoSoles * TASA_CAMBIO_USD;
        montoEuros = montoSoles * TASA_CAMBIO_EUR;


        montoDolares = Math.round(montoDolares * 100.0) / 100.0;
        montoEuros = Math.round(montoEuros * 100.0) / 100.0;


        System.out.printf("El monto en dólares estadounidenses (USD) es: $%.2f%n", montoDolares);
        System.out.printf("El monto en euros (EUR) es: €%.2f%n", montoEuros);
    }
}
