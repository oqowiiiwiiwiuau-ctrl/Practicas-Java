import java.util.Scanner;

public class Problema10_propuesto10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se tiene una longitud en centimetros convertir la longitud en pulgadas
        //1 cm = 0.3937 pulgadas
        System.out.println("Ingrese el valor en centimetros para convertirlo a pulgadas: ");
        double x = leer.nextDouble();
        double convertir = x*0.3937;
        System.out.println("El valor en pulgadas es: "+convertir);
    }
}
