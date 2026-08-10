import java.util.Scanner;

public class Problema06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingresar dos número enteores positivos por teclado y calcular la suma, resta y producto
        System.out.println("Ingrese el primer valor: ");
        int x = leer.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int y = leer.nextInt();
        System.out.println("La suma es: "+(x+y));
        System.out.println("La resta es: "+(x-y));
        System.out.println("El producto es: "+(x*y));
    }
}
