package programas;


import java.util.Scanner;


public class Programa03 {

    public static void main(String args[]) {

        int vt1, vt2, vt3;
        double sm, pt, c;
        String vendedor;
        
        Scanner lectura = new Scanner(System.in);
        

        System.out.print("Nombre de Vendedor: ");
        vendedor = lectura.next();
        
        System.out.print("Sueldo Mensual: ");
        sm = lectura.nextDouble();
        
        System.out.print("Venta 1: ");
        vt1 = lectura.nextInt();
        
        System.out.print("Venta 2: ");
        vt2 = lectura.nextInt();
        
        System.out.print("Venta 3: ");
        vt3 = lectura.nextInt();
        

        c = (vt1 + vt2 + vt3) * 0.10;
        pt = sm + c;
        

        System.out.println("La comisión de la venta es: " + c);
        System.out.println("El sueldo mensual del vendedor es: " + pt);
    }
}
