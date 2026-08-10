import java.util.Scanner;

public class Problema22_propuesto2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char letra = leer.nextLine().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayúscula");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra es minúscula");
        } else {
            System.out.println("No es una letra");
        }
    }
}
