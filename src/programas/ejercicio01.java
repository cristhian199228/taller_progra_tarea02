package programas;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {

        String cliente, producto;
        double precio, subtotal, igv, totalPagar;
        int cantidad;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Nombre del cliente: ");
        cliente = lectura.nextLine();
        
        System.out.print("Producto: ");
        producto = lectura.nextLine();
        
        System.out.print("Precio: ");
        precio = lectura.nextDouble();
        
        System.out.print("Cantidad: ");
        cantidad = lectura.nextInt();
        

        subtotal = precio * cantidad;
        igv = subtotal * 0.18; 
        totalPagar = subtotal - igv;
        

        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("Total a Pagar: " + totalPagar);
    }
}
