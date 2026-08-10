import java.util.Locale;
import java.util.Scanner;

public class Problema22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Realizar un algoritmo que verifique si una persona es femenina (F) o masculino (M)
        System.out.println("Ingrese valor: ");
        String x = leer.nextLine().toLowerCase();
        if (x.equals("m")) {
            System.out.println("La personas es masculino.");
        } else if (x.equals("f")) {
            System.out.println("La persona es femenina. ");
        }
    }
}
