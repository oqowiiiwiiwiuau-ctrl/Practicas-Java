import java.util.Scanner;

public class Problema10_propuesto7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //se tiene una longitud en metros convertir la longitud en centimetros
        System.out.println("Ingrese la longitud en metros: ");
        double x = leer.nextDouble();
        double convertir = x*100;
        System.out.println("El valor en centrimetros es: "+convertir+" centimetros. ");
    }
}
