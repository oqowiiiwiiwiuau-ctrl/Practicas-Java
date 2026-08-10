import java.util.Scanner;

public class Problema22_propuesto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Leer una letra e indicar si es una vocal (a, e, i, o, u) o una consonante.
        System.out.println("Determinar si el valor es una vocal: ");
        String x = leer.nextLine().toLowerCase();
        if (x.equals("a")){
            System.out.println("El valor es una vocal.");
        } else if (x.equals("e")) {
            System.out.println("El valor es una vocal.");
        } else if (x.equals("i")) {
            System.out.println("El valor es una vocal.");
        } else if (x.equals("o")) {
            System.out.println("El valor es una vocal.");
        } else if (x.equals("u")) {
            System.out.println("El valor es una vocal.");
        }else
            System.out.println("El valor no es una vocal. ");
    }
}
