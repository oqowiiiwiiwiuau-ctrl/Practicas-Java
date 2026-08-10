import java.util.Scanner;

public class Problema07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingrese por teclado la altrua  y la base de un rectangulo y calcular el área de este
        System.out.println("Ingrese la altura: ");
        double x = leer.nextDouble();
        System.out.println("Ingrese la base: ");
        double y = leer.nextDouble();
        System.out.println("El Área del rectangulo es: "+(x*y));
    }
}
