import java.util.Scanner;

public class Problema26 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar dos números enteros y determinar si un número es divisor de otro
        System.out.println("Ingrese un valor: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int y = leer.nextInt();
        if (x % y == 0) {
            System.out.println("El primer valor es divisor del segundo.");
        } else if (y % x == 0) {
            System.out.println("El segundo valor es divisor del primero.");
        }else {
            System.out.println("Los valores no son divisores.");
        }
    }
}
