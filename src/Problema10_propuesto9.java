import java.util.Scanner;

public class Problema10_propuesto9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //se tiene una masa en kilogramas convertir la masa en gramos, un kl = 1000 gramos
        System.out.println("Ingrese valor kilogramos para convertir en gramos: ");
        double x = leer.nextDouble();
        System.out.println("El valor en gramos es: "+(x*1000));
    }
}
