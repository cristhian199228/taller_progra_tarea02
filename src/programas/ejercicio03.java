/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio03 {
     public static void main(String[] args) {

        String nombre,cargo;
        double ingreso,gasto,amensual,abimestral,asemestral,aanual;

        Scanner lectura = new Scanner(System.in);
        

        System.out.print("Ingrese el Ingreso: ");
        ingreso = lectura.nextDouble();
        
        System.out.print("Ingrese el Gasto: ");
        gasto = lectura.nextDouble();
        
        amensual = ingreso-gasto;
        

        System.out.println("Ahorro Mensual: " + amensual);
        System.out.println("Ahorro Bimestral: " + amensual*2);
        System.out.println("Ahorro Semestral: " + amensual*6);
        System.out.println("Ahorro Anual: " + amensual *12);
    }
}
