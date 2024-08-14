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

public class ejercicio02 {
    public static void main(String[] args) {

        double sueldo1, sueldo2,sueldo3,sueldo4,sueldo5,total,promedio;

        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese el sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        
        System.out.print("Ingrese el sueldo 2: ");
        sueldo2 = lectura.nextDouble();
        
        System.out.print("Ingrese el sueldo 3: ");
        sueldo3 = lectura.nextDouble();
        
        System.out.print("Ingrese el sueldo 4: ");
        sueldo4 = lectura.nextDouble();
        
        System.out.print("Ingrese el sueldo 5: ");
        sueldo5 = lectura.nextDouble();
        
        total = sueldo1+sueldo2+sueldo3+sueldo4+sueldo5;
        promedio = (total)/5;
        
        System.out.println("Total: " + total);
        System.out.println("Promedio: " + promedio);
    }
}
