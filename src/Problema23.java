import java.time.temporal.ValueRange;
import java.util.Scanner;

public class Problema23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*Realizar un algoritmo que resuelva el siguiente problema: un ama de casa realiza una compra de
        * cinco productos en un súpermercado el cual realiza un descuento del 25% si el total de la compra
        * supera los bs 200. si el total de la compra es menor de bs 200 se realiza un descuento de 5% */
        System.out.println("Ingrese el monto de sus 5 productos comprados.");
        System.out.println("Monto de producto: ");
        float x = leer.nextFloat();
        System.out.println("Monto de producto: ");
        float x_uno = leer.nextFloat();
        System.out.println("Monto de producto: ");
        float x_dos = leer.nextFloat();
        System.out.println("Monto de producto: ");
        float x_tres = leer.nextFloat();
        System.out.println("Monto de producto: ");
        float x_cuatro = leer.nextFloat();
        //Definimos algunas variables
        double descuento = 0;
        double valorTotal = x+x_uno+x_dos+x_tres+x_cuatro;
        System.out.println(valorTotal);
        if (valorTotal > 200){
            descuento = valorTotal-(valorTotal*0.25);
            System.out.println("El valor menos el 25% es: "+descuento);
        } else if (valorTotal <= 200) {
            descuento = valorTotal-(valorTotal*0.05);
            System.out.println("El valor menos el 5% es: "+descuento);
        }
        //Nota: la prueba de escritorio 2 tiene un error de total monto a pagar
    }
}
