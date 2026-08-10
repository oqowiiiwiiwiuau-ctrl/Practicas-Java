import java.util.Scanner;

public class Problema10_propuesto2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se tiene la edad de dos personas encontra el promedio de edad
        System.out.println("Ingrese la primera edad: ");
        int x = leer.nextInt();
        System.out.println("Ingrese la segunda edad: ");
        int y = leer.nextInt();
        System.out.println("El promedio de edad es: "+(x+y)/2);
    }
}
