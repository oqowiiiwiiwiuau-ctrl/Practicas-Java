import java.util.Scanner;

public class Problema10_propuesto3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Calcular el área de un cuadrado
        System.out.println("Para calcular el área de un cuadrado lo unico que necesitamos es un lado: ");
        int x = leer.nextInt();
        System.out.println("El área es: "+(x*x));
    }
}
