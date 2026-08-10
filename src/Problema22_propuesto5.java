import java.util.Scanner;

public class Problema22_propuesto5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Estado civil
        //Leer una letra
        //S → Soltero
        //C → Casado
        //D → Divorciado
        //V → Viudo
        //Mostrar el significado de la letra.
        System.out.println("Ingresar su estado civil: ");
        String x = leer.nextLine().toLowerCase();
        switch (x){
            case "s":
                System.out.println("Soltero.");
                break;
            case "c":
                System.out.println("Casado.");
                break;
            case "d":
                System.out.println("Divorciado.");
                break;
            case "v":
                System.out.println("Viudo.");
                break;
            default:
                System.out.println("Opción invalida.");
        }
    }
}
