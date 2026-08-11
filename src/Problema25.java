import java.util.Scanner;

public class Problema25 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Verificar si un núemro entero es positivo o negatio y si es cero mostra el correspondiente mensaje
        System.out.println("Ingrese el número: ");
        int x = leer.nextInt();
        if (x > 0) {
            System.out.println("El valor es positivo.");
        } else if (x < 0) {
            System.out.println("El valor es negativo. ");
        } else if (x == 0) {
            System.out.println("El valor es cero.");
        }
    }
}
