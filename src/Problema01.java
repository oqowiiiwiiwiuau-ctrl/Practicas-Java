import java.util.Scanner;

public class Problema01 {
    public static void main(String[] args) {
        //Ingresar dos números enteros por teclado y calcular la suma de estos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int y = leer.nextInt();
        int z = x * y;
        System.out.println("La suma de estos valores es: "+z);
    }
}
