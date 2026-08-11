import java.util.Scanner;

public class Problema29 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Se tienen tres números enteros distintos x, y, z.
        // Mostrar en pantalla de mayor a menor.
        System.out.println("Ingrese valor: ");
        int x = leer.nextInt();

        System.out.println("Ingrese valor: ");
        int y = leer.nextInt();

        System.out.println("Ingrese valor: ");
        int z = leer.nextInt();

        if (x > y && y > z) {
            System.out.println("El orden de los valores es: " + x + " " + y + " " + z);

        } else if (y > x && x > z) {
            System.out.println("El orden de los valores es: " + y + " " + x + " " + z);

        } else if (z > x && x > y) {
            System.out.println("El orden de los valores es: " + z + " " + x + " " + y);

        } else if (x > z && z > y) {
            System.out.println("El orden de los valores es: " + x + " " + z + " " + y);

        } else if (y > z && z > x) {
            System.out.println("El orden de los valores es: " + y + " " + z + " " + x);

        } else if (z > y && y > x) {
            System.out.println("El orden de los valores es: " + z + " " + y + " " + x);
        }
    }
}
