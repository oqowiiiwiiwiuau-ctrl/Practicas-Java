import java.util.Scanner;

public class Problema40_propuesto5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Un padre de familia compra 5 útiles escolares es una libreria en donde se le hace un
        //descuento del 14% si el total de la compra supera los 230 bs.
        System.out.println("Agregar el monto total de la compra: ");
        int x = leer.nextInt();
        double descuento;
        if (x > 230){
            descuento = x-(x*0.14);
            System.out.println("El valor menos el descuento de 14% es: "+descuento);
        }else
            System.out.println("El valor de la compra es: "+x);
    }
}
