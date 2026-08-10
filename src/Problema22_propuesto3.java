import java.util.Scanner;

public class Problema22_propuesto3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Leer una respuesta (S o N) e indicar si la persona respondió afirmativamente o negativamente.
        System.out.println("Ingrese su respuesta: ");
        String x = leer.nextLine().toLowerCase();
        if (x.equals("s")){
            System.out.println("Positivo.");
        } else if (x.equals("n")) {
            System.out.println("Negativo.");
        }else
            System.out.println("Opción invalida.");
    }
}
