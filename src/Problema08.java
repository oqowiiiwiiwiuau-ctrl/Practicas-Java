import java.util.Scanner;

public class Problema08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingesar por teclado una longitud en centimetros y convertirlo a metros
        System.out.println("Ingrese la longitud: ");
        double x = leer.nextDouble();
        System.out.println("Sera convertido en metros");
        System.out.println("El valor en metros es: "+(x/100)+" metros");
    }
}
