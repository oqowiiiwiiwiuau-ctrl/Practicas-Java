import java.util.Scanner;

public class Problema40_propuesto9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Determinar el número central de 3 números distintos
        System.out.println("Ingrese el primer valor: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int y = leer.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        int z = leer.nextInt();
        // Evaluamos si y es el número del centro
        if ((x > y && y > z) || (z > y && y > x)) {
            System.out.println("El valor medio es: " + y);
        }
        // Evaluamos si x es el número del centro
        else if ((y > x && x > z) || (z > x && x > y)) {
            System.out.println("El valor medio es: " + x);
        }
        // Si no es ninguno de los anteriores, por fuerza el del centro es z
        else {
            System.out.println("El valor medio es: " + z);
        }

    }
}
