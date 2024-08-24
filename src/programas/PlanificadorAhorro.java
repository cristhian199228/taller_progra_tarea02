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

public class PlanificadorAhorro {
    public static void main(String[] args) {

        double sueldoMensual, costoObjetivo, ahorroMensual, mesesParaLograrlo;
        String objetivo;
        Scanner lectura = new Scanner(System.in);


        System.out.print("Ingresa tu sueldo mensual (en soles): ");
        sueldoMensual = lectura.nextDouble();


        lectura.nextLine();

        System.out.print("Ingresa el nombre de tu objetivo de ahorro (por ejemplo, 'carro'): ");
        objetivo = lectura.nextLine();

        System.out.print("Ingresa el costo de tu " + objetivo + " (en soles): ");
        costoObjetivo = lectura.nextDouble();

        System.out.print("Cuanto deseas ahorrar mensualmente (en soles)? ");
        ahorroMensual = lectura.nextDouble();


        mesesParaLograrlo = costoObjetivo / ahorroMensual;


        mesesParaLograrlo = Math.ceil(mesesParaLograrlo);


        System.out.println("\nPara alcanzar tu objetivo de " + objetivo + ", necesitas ahorrar:");
        System.out.printf("- %.2f soles por mes durante %.0f meses si ahorras %.2f soles mensuales.%n", ahorroMensual, mesesParaLograrlo, ahorroMensual);


        double mesesConSueldoCompleto = Math.ceil(costoObjetivo / sueldoMensual);
        System.out.printf("- Si decides ahorrar la totalidad de tu sueldo mensual de %.2f soles, lo lograras en aproximadamente %.0f meses.%n", sueldoMensual, mesesConSueldoCompleto);
    }
}