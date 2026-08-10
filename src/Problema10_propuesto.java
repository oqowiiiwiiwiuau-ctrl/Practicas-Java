import java.util.Scanner;

public class Problema10_propuesto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Calcular el cubo de un número entero
        System.out.println("Ingrese el valor para calcular el cubo: ");
        int x = leer.nextInt();
        double cubo = Math.pow(x, 3);
        System.out.println("El valor al cudo es: "+cubo);
    }
}
